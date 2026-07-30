package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import android.widget.RemoteViews;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import com.squareup.picasso.a;
import com.squareup.picasso.t;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public class Picasso {
    static final String TAG = "Picasso";
    final com.squareup.picasso.d cache;
    private final c cleanupThread;
    final Context context;
    final Bitmap.Config defaultBitmapConfig;
    final i dispatcher;
    boolean indicatorsEnabled;
    private final d listener;
    volatile boolean loggingEnabled;
    final ReferenceQueue<Object> referenceQueue;
    private final List<w> requestHandlers;
    private final e requestTransformer;
    boolean shutdown;
    final y stats;
    final Map<Object, com.squareup.picasso.a> targetToAction;
    final Map<ImageView, h> targetToDeferredRequestCreator;
    static final Handler HANDLER = new a(Looper.getMainLooper());

    @SuppressLint({"StaticFieldLeak"})
    static volatile Picasso singleton = null;

    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(SupportMenu.CATEGORY_MASK);

        final int debugColor;

        LoadedFrom(int i8) {
            this.debugColor = i8;
        }
    }

    public enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 3) {
                com.squareup.picasso.a aVar = (com.squareup.picasso.a) message.obj;
                if (aVar.getPicasso().loggingEnabled) {
                    d0.log("Main", "canceled", aVar.request.logId(), "target got garbage collected");
                }
                aVar.picasso.cancelExistingRequest(aVar.getTarget());
                return;
            }
            int i9 = 0;
            if (i8 == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i9 < size) {
                    com.squareup.picasso.c cVar = (com.squareup.picasso.c) list.get(i9);
                    cVar.picasso.complete(cVar);
                    i9++;
                }
                return;
            }
            if (i8 != 13) {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            while (i9 < size2) {
                com.squareup.picasso.a aVar2 = (com.squareup.picasso.a) list2.get(i9);
                aVar2.picasso.resumeAction(aVar2);
                i9++;
            }
        }
    }

    public static class b {
        private com.squareup.picasso.d cache;
        private final Context context;
        private Bitmap.Config defaultBitmapConfig;
        private j downloader;
        private boolean indicatorsEnabled;
        private d listener;
        private boolean loggingEnabled;
        private List<w> requestHandlers;
        private ExecutorService service;
        private e transformer;

        public b(@NonNull Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.context = context.getApplicationContext();
        }

        public b addRequestHandler(@NonNull w wVar) {
            if (wVar == null) {
                throw new IllegalArgumentException("RequestHandler must not be null.");
            }
            if (this.requestHandlers == null) {
                this.requestHandlers = new ArrayList();
            }
            if (this.requestHandlers.contains(wVar)) {
                throw new IllegalStateException("RequestHandler already registered.");
            }
            this.requestHandlers.add(wVar);
            return this;
        }

        public Picasso build() {
            Context context = this.context;
            if (this.downloader == null) {
                this.downloader = new q(context);
            }
            if (this.cache == null) {
                this.cache = new o(context);
            }
            if (this.service == null) {
                this.service = new s();
            }
            if (this.transformer == null) {
                this.transformer = e.IDENTITY;
            }
            y yVar = new y(this.cache);
            return new Picasso(context, new i(context, this.service, Picasso.HANDLER, this.downloader, this.cache, yVar), this.cache, null, this.transformer, this.requestHandlers, yVar, this.defaultBitmapConfig, this.indicatorsEnabled, this.loggingEnabled);
        }

        public b defaultBitmapConfig(@NonNull Bitmap.Config config) {
            if (config == null) {
                throw new IllegalArgumentException("Bitmap config must not be null.");
            }
            this.defaultBitmapConfig = config;
            return this;
        }

        public b downloader(@NonNull j jVar) {
            if (jVar == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            }
            if (this.downloader != null) {
                throw new IllegalStateException("Downloader already set.");
            }
            this.downloader = jVar;
            return this;
        }

        public b executor(@NonNull ExecutorService executorService) {
            if (executorService == null) {
                throw new IllegalArgumentException("Executor service must not be null.");
            }
            if (this.service != null) {
                throw new IllegalStateException("Executor service already set.");
            }
            this.service = executorService;
            return this;
        }

        public b indicatorsEnabled(boolean z7) {
            this.indicatorsEnabled = z7;
            return this;
        }

        public b listener(@NonNull d dVar) {
            if (dVar != null) {
                return this;
            }
            throw new IllegalArgumentException("Listener must not be null.");
        }

        public b loggingEnabled(boolean z7) {
            this.loggingEnabled = z7;
            return this;
        }

        public b memoryCache(@NonNull com.squareup.picasso.d dVar) {
            if (dVar == null) {
                throw new IllegalArgumentException("Memory cache must not be null.");
            }
            if (this.cache != null) {
                throw new IllegalStateException("Memory cache already set.");
            }
            this.cache = dVar;
            return this;
        }

        public b requestTransformer(@NonNull e eVar) {
            if (eVar == null) {
                throw new IllegalArgumentException("Transformer must not be null.");
            }
            if (this.transformer != null) {
                throw new IllegalStateException("Transformer already set.");
            }
            this.transformer = eVar;
            return this;
        }
    }

    private static class c extends Thread {
        private final Handler handler;
        private final ReferenceQueue<Object> referenceQueue;

        class a implements Runnable {
            final /* synthetic */ Exception val$e;

            a(Exception exc) {
                this.val$e = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.val$e);
            }
        }

        c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.referenceQueue = referenceQueue;
            this.handler = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a.C0339a c0339a = (a.C0339a) this.referenceQueue.remove(1000L);
                    Message obtainMessage = this.handler.obtainMessage();
                    if (c0339a != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = c0339a.action;
                        this.handler.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e8) {
                    this.handler.post(new a(e8));
                    return;
                }
            }
        }

        void shutdown() {
            interrupt();
        }
    }

    public interface d {
    }

    public interface e {
        public static final e IDENTITY = new a();

        static class a implements e {
            a() {
            }

            @Override // com.squareup.picasso.Picasso.e
            public u transformRequest(u uVar) {
                return uVar;
            }
        }

        u transformRequest(u uVar);
    }

    Picasso(Context context, i iVar, com.squareup.picasso.d dVar, d dVar2, e eVar, List<w> list, y yVar, Bitmap.Config config, boolean z7, boolean z8) {
        this.context = context;
        this.dispatcher = iVar;
        this.cache = dVar;
        this.requestTransformer = eVar;
        this.defaultBitmapConfig = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new x(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new f(context));
        arrayList.add(new MediaStoreRequestHandler(context));
        arrayList.add(new g(context));
        arrayList.add(new com.squareup.picasso.b(context));
        arrayList.add(new l(context));
        arrayList.add(new NetworkRequestHandler(iVar.downloader, yVar));
        this.requestHandlers = Collections.unmodifiableList(arrayList);
        this.stats = yVar;
        this.targetToAction = new WeakHashMap();
        this.targetToDeferredRequestCreator = new WeakHashMap();
        this.indicatorsEnabled = z7;
        this.loggingEnabled = z8;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.referenceQueue = referenceQueue;
        c cVar = new c(referenceQueue, HANDLER);
        this.cleanupThread = cVar;
        cVar.start();
    }

    private void deliverAction(Bitmap bitmap, LoadedFrom loadedFrom, com.squareup.picasso.a aVar, Exception exc) {
        if (aVar.isCancelled()) {
            return;
        }
        if (!aVar.willReplay()) {
            this.targetToAction.remove(aVar.getTarget());
        }
        if (bitmap == null) {
            aVar.error(exc);
            if (this.loggingEnabled) {
                d0.log("Main", "errored", aVar.request.logId(), exc.getMessage());
                return;
            }
            return;
        }
        if (loadedFrom == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        aVar.complete(bitmap, loadedFrom);
        if (this.loggingEnabled) {
            d0.log("Main", "completed", aVar.request.logId(), "from " + loadedFrom);
        }
    }

    public static Picasso get() {
        if (singleton == null) {
            synchronized (Picasso.class) {
                try {
                    if (singleton == null) {
                        Context context = PicassoProvider.context;
                        if (context == null) {
                            throw new IllegalStateException("context == null");
                        }
                        singleton = new b(context).build();
                    }
                } finally {
                }
            }
        }
        return singleton;
    }

    public static void setSingletonInstance(@NonNull Picasso picasso) {
        if (picasso == null) {
            throw new IllegalArgumentException("Picasso must not be null.");
        }
        synchronized (Picasso.class) {
            try {
                if (singleton != null) {
                    throw new IllegalStateException("Singleton instance already exists.");
                }
                singleton = picasso;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean areIndicatorsEnabled() {
        return this.indicatorsEnabled;
    }

    void cancelExistingRequest(Object obj) {
        d0.checkMain();
        com.squareup.picasso.a remove = this.targetToAction.remove(obj);
        if (remove != null) {
            remove.cancel();
            this.dispatcher.dispatchCancel(remove);
        }
        if (obj instanceof ImageView) {
            h remove2 = this.targetToDeferredRequestCreator.remove((ImageView) obj);
            if (remove2 != null) {
                remove2.cancel();
            }
        }
    }

    public void cancelRequest(@NonNull ImageView imageView) {
        if (imageView == null) {
            throw new IllegalArgumentException("view cannot be null.");
        }
        cancelExistingRequest(imageView);
    }

    public void cancelTag(@NonNull Object obj) {
        d0.checkMain();
        if (obj == null) {
            throw new IllegalArgumentException("Cannot cancel requests with null tag.");
        }
        ArrayList arrayList = new ArrayList(this.targetToAction.values());
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            com.squareup.picasso.a aVar = (com.squareup.picasso.a) arrayList.get(i8);
            if (obj.equals(aVar.getTag())) {
                cancelExistingRequest(aVar.getTarget());
            }
        }
        ArrayList arrayList2 = new ArrayList(this.targetToDeferredRequestCreator.values());
        int size2 = arrayList2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            h hVar = (h) arrayList2.get(i9);
            if (obj.equals(hVar.getTag())) {
                hVar.cancel();
            }
        }
    }

    void complete(com.squareup.picasso.c cVar) {
        com.squareup.picasso.a action = cVar.getAction();
        List<com.squareup.picasso.a> actions = cVar.getActions();
        boolean z7 = (actions == null || actions.isEmpty()) ? false : true;
        if (action != null || z7) {
            Uri uri = cVar.getData().uri;
            Exception exception = cVar.getException();
            Bitmap result = cVar.getResult();
            LoadedFrom loadedFrom = cVar.getLoadedFrom();
            if (action != null) {
                deliverAction(result, loadedFrom, action, exception);
            }
            if (z7) {
                int size = actions.size();
                for (int i8 = 0; i8 < size; i8++) {
                    deliverAction(result, loadedFrom, actions.get(i8), exception);
                }
            }
        }
    }

    void defer(ImageView imageView, h hVar) {
        if (this.targetToDeferredRequestCreator.containsKey(imageView)) {
            cancelExistingRequest(imageView);
        }
        this.targetToDeferredRequestCreator.put(imageView, hVar);
    }

    void enqueueAndSubmit(com.squareup.picasso.a aVar) {
        Object target = aVar.getTarget();
        if (target != null && this.targetToAction.get(target) != aVar) {
            cancelExistingRequest(target);
            this.targetToAction.put(target, aVar);
        }
        submit(aVar);
    }

    List<w> getRequestHandlers() {
        return this.requestHandlers;
    }

    public z getSnapshot() {
        return this.stats.createSnapshot();
    }

    public void invalidate(@Nullable Uri uri) {
        if (uri != null) {
            this.cache.clearKeyUri(uri.toString());
        }
    }

    public boolean isLoggingEnabled() {
        return this.loggingEnabled;
    }

    public v load(@Nullable Uri uri) {
        return new v(this, uri, 0);
    }

    public void pauseTag(@NonNull Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("tag == null");
        }
        this.dispatcher.dispatchPauseTag(obj);
    }

    Bitmap quickMemoryCacheCheck(String str) {
        Bitmap bitmap = this.cache.get(str);
        if (bitmap != null) {
            this.stats.dispatchCacheHit();
        } else {
            this.stats.dispatchCacheMiss();
        }
        return bitmap;
    }

    void resumeAction(com.squareup.picasso.a aVar) {
        Bitmap quickMemoryCacheCheck = MemoryPolicy.shouldReadFromMemoryCache(aVar.memoryPolicy) ? quickMemoryCacheCheck(aVar.getKey()) : null;
        if (quickMemoryCacheCheck == null) {
            enqueueAndSubmit(aVar);
            if (this.loggingEnabled) {
                d0.log("Main", "resumed", aVar.request.logId());
                return;
            }
            return;
        }
        LoadedFrom loadedFrom = LoadedFrom.MEMORY;
        deliverAction(quickMemoryCacheCheck, loadedFrom, aVar, null);
        if (this.loggingEnabled) {
            d0.log("Main", "completed", aVar.request.logId(), "from " + loadedFrom);
        }
    }

    public void resumeTag(@NonNull Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("tag == null");
        }
        this.dispatcher.dispatchResumeTag(obj);
    }

    public void setIndicatorsEnabled(boolean z7) {
        this.indicatorsEnabled = z7;
    }

    public void setLoggingEnabled(boolean z7) {
        this.loggingEnabled = z7;
    }

    public void shutdown() {
        if (this == singleton) {
            throw new UnsupportedOperationException("Default singleton instance cannot be shutdown.");
        }
        if (this.shutdown) {
            return;
        }
        this.cache.clear();
        this.cleanupThread.shutdown();
        this.stats.shutdown();
        this.dispatcher.shutdown();
        Iterator<h> it = this.targetToDeferredRequestCreator.values().iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.targetToDeferredRequestCreator.clear();
        this.shutdown = true;
    }

    void submit(com.squareup.picasso.a aVar) {
        this.dispatcher.dispatchSubmit(aVar);
    }

    u transformRequest(u uVar) {
        u transformRequest = this.requestTransformer.transformRequest(uVar);
        if (transformRequest != null) {
            return transformRequest;
        }
        throw new IllegalStateException("Request transformer " + this.requestTransformer.getClass().getCanonicalName() + " returned null for " + uVar);
    }

    public void invalidate(@Nullable String str) {
        if (str != null) {
            invalidate(Uri.parse(str));
        }
    }

    public v load(@Nullable String str) {
        if (str == null) {
            return new v(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return load(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    public void cancelRequest(@NonNull a0 a0Var) {
        if (a0Var != null) {
            cancelExistingRequest(a0Var);
            return;
        }
        throw new IllegalArgumentException("target cannot be null.");
    }

    public void invalidate(@NonNull File file) {
        if (file != null) {
            invalidate(Uri.fromFile(file));
            return;
        }
        throw new IllegalArgumentException("file == null");
    }

    public void cancelRequest(@NonNull RemoteViews remoteViews, @IdRes int i8) {
        if (remoteViews != null) {
            cancelExistingRequest(new t.c(remoteViews, i8));
            return;
        }
        throw new IllegalArgumentException("remoteViews cannot be null.");
    }

    public v load(@NonNull File file) {
        if (file == null) {
            return new v(this, null, 0);
        }
        return load(Uri.fromFile(file));
    }

    public v load(@DrawableRes int i8) {
        if (i8 != 0) {
            return new v(this, null, i8);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }
}
