package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.NetworkRequestHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
class i {
    static final int AIRPLANE_MODE_CHANGE = 10;
    private static final int AIRPLANE_MODE_OFF = 0;
    private static final int AIRPLANE_MODE_ON = 1;
    private static final int BATCH_DELAY = 200;
    private static final String DISPATCHER_THREAD_NAME = "Dispatcher";
    static final int HUNTER_BATCH_COMPLETE = 8;
    static final int HUNTER_COMPLETE = 4;
    static final int HUNTER_DECODE_FAILED = 6;
    static final int HUNTER_DELAY_NEXT_BATCH = 7;
    static final int HUNTER_RETRY = 5;
    static final int NETWORK_STATE_CHANGE = 9;
    static final int REQUEST_BATCH_RESUME = 13;
    static final int REQUEST_CANCEL = 2;
    static final int REQUEST_GCED = 3;
    static final int REQUEST_SUBMIT = 1;
    private static final int RETRY_DELAY = 500;
    static final int TAG_PAUSE = 11;
    static final int TAG_RESUME = 12;
    boolean airplaneMode;
    final List<com.squareup.picasso.c> batch;
    final com.squareup.picasso.d cache;
    final Context context;
    final c dispatcherThread;
    final j downloader;
    final Map<Object, com.squareup.picasso.a> failedActions;
    final Handler handler;
    final Map<String, com.squareup.picasso.c> hunterMap;
    final Handler mainThreadHandler;
    final Map<Object, com.squareup.picasso.a> pausedActions;
    final Set<Object> pausedTags;
    final d receiver;
    final boolean scansNetworkChanges;
    final ExecutorService service;
    final y stats;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.receiver.unregister();
        }
    }

    private static class b extends Handler {
        private final i dispatcher;

        class a implements Runnable {
            final /* synthetic */ Message val$msg;

            a(Message message) {
                this.val$msg = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.val$msg.what);
            }
        }

        b(Looper looper, i iVar) {
            super(looper);
            this.dispatcher = iVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.dispatcher.performSubmit((com.squareup.picasso.a) message.obj);
                    break;
                case 2:
                    this.dispatcher.performCancel((com.squareup.picasso.a) message.obj);
                    break;
                case 3:
                case 8:
                default:
                    Picasso.HANDLER.post(new a(message));
                    break;
                case 4:
                    this.dispatcher.performComplete((com.squareup.picasso.c) message.obj);
                    break;
                case 5:
                    this.dispatcher.performRetry((com.squareup.picasso.c) message.obj);
                    break;
                case 6:
                    this.dispatcher.performError((com.squareup.picasso.c) message.obj, false);
                    break;
                case 7:
                    this.dispatcher.performBatchComplete();
                    break;
                case 9:
                    this.dispatcher.performNetworkStateChange((NetworkInfo) message.obj);
                    break;
                case 10:
                    this.dispatcher.performAirplaneModeChange(message.arg1 == 1);
                    break;
                case 11:
                    this.dispatcher.performPauseTag(message.obj);
                    break;
                case 12:
                    this.dispatcher.performResumeTag(message.obj);
                    break;
            }
        }
    }

    static class c extends HandlerThread {
        c() {
            super("Picasso-Dispatcher", 10);
        }
    }

    static class d extends BroadcastReceiver {
        static final String EXTRA_AIRPLANE_STATE = "state";
        private final i dispatcher;

        d(i iVar) {
            this.dispatcher = iVar;
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra("state")) {
                    this.dispatcher.dispatchAirplaneModeChange(intent.getBooleanExtra("state", false));
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.dispatcher.dispatchNetworkStateChange(((ConnectivityManager) d0.getService(context, "connectivity")).getActiveNetworkInfo());
            }
        }

        void register() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.dispatcher.scansNetworkChanges) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.dispatcher.context.registerReceiver(this, intentFilter);
        }

        void unregister() {
            this.dispatcher.context.unregisterReceiver(this);
        }
    }

    i(Context context, ExecutorService executorService, Handler handler, j jVar, com.squareup.picasso.d dVar, y yVar) {
        c cVar = new c();
        this.dispatcherThread = cVar;
        cVar.start();
        d0.flushStackLocalLeaks(cVar.getLooper());
        this.context = context;
        this.service = executorService;
        this.hunterMap = new LinkedHashMap();
        this.failedActions = new WeakHashMap();
        this.pausedActions = new WeakHashMap();
        this.pausedTags = new LinkedHashSet();
        this.handler = new b(cVar.getLooper(), this);
        this.downloader = jVar;
        this.mainThreadHandler = handler;
        this.cache = dVar;
        this.stats = yVar;
        this.batch = new ArrayList(4);
        this.airplaneMode = d0.isAirplaneModeOn(context);
        this.scansNetworkChanges = d0.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE");
        d dVar2 = new d(this);
        this.receiver = dVar2;
        dVar2.register();
    }

    private void batch(com.squareup.picasso.c cVar) {
        if (cVar.isCancelled()) {
            return;
        }
        Bitmap bitmap = cVar.result;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        this.batch.add(cVar);
        if (this.handler.hasMessages(7)) {
            return;
        }
        this.handler.sendEmptyMessageDelayed(7, 200L);
    }

    private void flushFailedActions() {
        if (this.failedActions.isEmpty()) {
            return;
        }
        Iterator<com.squareup.picasso.a> it = this.failedActions.values().iterator();
        while (it.hasNext()) {
            com.squareup.picasso.a next = it.next();
            it.remove();
            if (next.getPicasso().loggingEnabled) {
                d0.log(DISPATCHER_THREAD_NAME, "replaying", next.getRequest().logId());
            }
            performSubmit(next, false);
        }
    }

    private void logBatch(List<com.squareup.picasso.c> list) {
        if (list == null || list.isEmpty() || !list.get(0).getPicasso().loggingEnabled) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (com.squareup.picasso.c cVar : list) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(d0.getLogIdsForHunter(cVar));
        }
        d0.log(DISPATCHER_THREAD_NAME, "delivered", sb.toString());
    }

    private void markForReplay(com.squareup.picasso.c cVar) {
        com.squareup.picasso.a action = cVar.getAction();
        if (action != null) {
            markForReplay(action);
        }
        List<com.squareup.picasso.a> actions = cVar.getActions();
        if (actions != null) {
            int size = actions.size();
            for (int i8 = 0; i8 < size; i8++) {
                markForReplay(actions.get(i8));
            }
        }
    }

    void dispatchAirplaneModeChange(boolean z7) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(10, z7 ? 1 : 0, 0));
    }

    void dispatchCancel(com.squareup.picasso.a aVar) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    void dispatchComplete(com.squareup.picasso.c cVar) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    void dispatchFailed(com.squareup.picasso.c cVar) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    void dispatchNetworkStateChange(NetworkInfo networkInfo) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    void dispatchPauseTag(Object obj) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(11, obj));
    }

    void dispatchResumeTag(Object obj) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(12, obj));
    }

    void dispatchRetry(com.squareup.picasso.c cVar) {
        Handler handler = this.handler;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500L);
    }

    void dispatchSubmit(com.squareup.picasso.a aVar) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    void performAirplaneModeChange(boolean z7) {
        this.airplaneMode = z7;
    }

    void performBatchComplete() {
        ArrayList arrayList = new ArrayList(this.batch);
        this.batch.clear();
        Handler handler = this.mainThreadHandler;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        logBatch(arrayList);
    }

    void performCancel(com.squareup.picasso.a aVar) {
        String key = aVar.getKey();
        com.squareup.picasso.c cVar = this.hunterMap.get(key);
        if (cVar != null) {
            cVar.detach(aVar);
            if (cVar.cancel()) {
                this.hunterMap.remove(key);
                if (aVar.getPicasso().loggingEnabled) {
                    d0.log(DISPATCHER_THREAD_NAME, "canceled", aVar.getRequest().logId());
                }
            }
        }
        if (this.pausedTags.contains(aVar.getTag())) {
            this.pausedActions.remove(aVar.getTarget());
            if (aVar.getPicasso().loggingEnabled) {
                d0.log(DISPATCHER_THREAD_NAME, "canceled", aVar.getRequest().logId(), "because paused request got canceled");
            }
        }
        com.squareup.picasso.a remove = this.failedActions.remove(aVar.getTarget());
        if (remove == null || !remove.getPicasso().loggingEnabled) {
            return;
        }
        d0.log(DISPATCHER_THREAD_NAME, "canceled", remove.getRequest().logId(), "from replaying");
    }

    void performComplete(com.squareup.picasso.c cVar) {
        if (MemoryPolicy.shouldWriteToMemoryCache(cVar.getMemoryPolicy())) {
            this.cache.set(cVar.getKey(), cVar.getResult());
        }
        this.hunterMap.remove(cVar.getKey());
        batch(cVar);
        if (cVar.getPicasso().loggingEnabled) {
            d0.log(DISPATCHER_THREAD_NAME, "batched", d0.getLogIdsForHunter(cVar), "for completion");
        }
    }

    void performError(com.squareup.picasso.c cVar, boolean z7) {
        if (cVar.getPicasso().loggingEnabled) {
            String logIdsForHunter = d0.getLogIdsForHunter(cVar);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(z7 ? " (will replay)" : "");
            d0.log(DISPATCHER_THREAD_NAME, "batched", logIdsForHunter, sb.toString());
        }
        this.hunterMap.remove(cVar.getKey());
        batch(cVar);
    }

    void performNetworkStateChange(NetworkInfo networkInfo) {
        ExecutorService executorService = this.service;
        if (executorService instanceof s) {
            ((s) executorService).adjustThreadCount(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        flushFailedActions();
    }

    void performPauseTag(Object obj) {
        if (this.pausedTags.add(obj)) {
            Iterator<com.squareup.picasso.c> it = this.hunterMap.values().iterator();
            while (it.hasNext()) {
                com.squareup.picasso.c next = it.next();
                boolean z7 = next.getPicasso().loggingEnabled;
                com.squareup.picasso.a action = next.getAction();
                List<com.squareup.picasso.a> actions = next.getActions();
                boolean z8 = (actions == null || actions.isEmpty()) ? false : true;
                if (action != null || z8) {
                    if (action != null && action.getTag().equals(obj)) {
                        next.detach(action);
                        this.pausedActions.put(action.getTarget(), action);
                        if (z7) {
                            d0.log(DISPATCHER_THREAD_NAME, "paused", action.request.logId(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z8) {
                        for (int size = actions.size() - 1; size >= 0; size--) {
                            com.squareup.picasso.a aVar = actions.get(size);
                            if (aVar.getTag().equals(obj)) {
                                next.detach(aVar);
                                this.pausedActions.put(aVar.getTarget(), aVar);
                                if (z7) {
                                    d0.log(DISPATCHER_THREAD_NAME, "paused", aVar.request.logId(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.cancel()) {
                        it.remove();
                        if (z7) {
                            d0.log(DISPATCHER_THREAD_NAME, "canceled", d0.getLogIdsForHunter(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    void performResumeTag(Object obj) {
        if (this.pausedTags.remove(obj)) {
            Iterator<com.squareup.picasso.a> it = this.pausedActions.values().iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                com.squareup.picasso.a next = it.next();
                if (next.getTag().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.mainThreadHandler;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    void performRetry(com.squareup.picasso.c cVar) {
        if (cVar.isCancelled()) {
            return;
        }
        boolean z7 = false;
        if (this.service.isShutdown()) {
            performError(cVar, false);
            return;
        }
        if (cVar.shouldRetry(this.airplaneMode, this.scansNetworkChanges ? ((ConnectivityManager) d0.getService(this.context, "connectivity")).getActiveNetworkInfo() : null)) {
            if (cVar.getPicasso().loggingEnabled) {
                d0.log(DISPATCHER_THREAD_NAME, "retrying", d0.getLogIdsForHunter(cVar));
            }
            if (cVar.getException() instanceof NetworkRequestHandler.ContentLengthException) {
                cVar.networkPolicy |= NetworkPolicy.NO_CACHE.index;
            }
            cVar.future = this.service.submit(cVar);
            return;
        }
        if (this.scansNetworkChanges && cVar.supportsReplay()) {
            z7 = true;
        }
        performError(cVar, z7);
        if (z7) {
            markForReplay(cVar);
        }
    }

    void performSubmit(com.squareup.picasso.a aVar) {
        performSubmit(aVar, true);
    }

    void shutdown() {
        ExecutorService executorService = this.service;
        if (executorService instanceof s) {
            executorService.shutdown();
        }
        this.downloader.shutdown();
        this.dispatcherThread.quit();
        Picasso.HANDLER.post(new a());
    }

    void performSubmit(com.squareup.picasso.a aVar, boolean z7) {
        if (this.pausedTags.contains(aVar.getTag())) {
            this.pausedActions.put(aVar.getTarget(), aVar);
            if (aVar.getPicasso().loggingEnabled) {
                d0.log(DISPATCHER_THREAD_NAME, "paused", aVar.request.logId(), "because tag '" + aVar.getTag() + "' is paused");
                return;
            }
            return;
        }
        com.squareup.picasso.c cVar = this.hunterMap.get(aVar.getKey());
        if (cVar != null) {
            cVar.attach(aVar);
            return;
        }
        if (this.service.isShutdown()) {
            if (aVar.getPicasso().loggingEnabled) {
                d0.log(DISPATCHER_THREAD_NAME, "ignored", aVar.request.logId(), "because shut down");
                return;
            }
            return;
        }
        com.squareup.picasso.c forRequest = com.squareup.picasso.c.forRequest(aVar.getPicasso(), this, this.cache, this.stats, aVar);
        forRequest.future = this.service.submit(forRequest);
        this.hunterMap.put(aVar.getKey(), forRequest);
        if (z7) {
            this.failedActions.remove(aVar.getTarget());
        }
        if (aVar.getPicasso().loggingEnabled) {
            d0.log(DISPATCHER_THREAD_NAME, "enqueued", aVar.request.logId());
        }
    }

    private void markForReplay(com.squareup.picasso.a aVar) {
        Object target = aVar.getTarget();
        if (target != null) {
            aVar.willReplay = true;
            this.failedActions.put(target, aVar);
        }
    }
}
