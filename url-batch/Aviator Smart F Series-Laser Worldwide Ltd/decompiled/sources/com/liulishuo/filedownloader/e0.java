package com.liulishuo.filedownloader;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseArray;
import com.liulishuo.filedownloader.a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
class e0 implements y {
    static final int WHAT_FREEZE = 2;
    static final int WHAT_SERIAL_NEXT = 1;
    static final int WHAT_UNFREEZE = 3;
    private final SparseArray<Handler> mRunningSerialMap = new SparseArray<>();

    private static class b implements a.InterfaceC0289a {
        private int nextIndex;
        private final WeakReference<c> wSerialHandlerCallback;

        @Override // com.liulishuo.filedownloader.a.InterfaceC0289a
        public void over(com.liulishuo.filedownloader.a aVar) {
            WeakReference<c> weakReference = this.wSerialHandlerCallback;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.wSerialHandlerCallback.get().goNext(this.nextIndex);
        }

        public a.InterfaceC0289a setNextIndex(int i8) {
            this.nextIndex = i8;
            return this;
        }

        private b(WeakReference<c> weakReference) {
            this.wSerialHandlerCallback = weakReference;
        }
    }

    private class c implements Handler.Callback {
        private Handler mHandler;
        private List<a.b> mList;
        private int mRunningIndex = 0;
        private b mSerialFinishListener = new b(new WeakReference(this));

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void goNext(int i8) {
            Handler handler = this.mHandler;
            if (handler == null || this.mList == null) {
                com.liulishuo.filedownloader.util.d.w(this, "need go next %d, but params is not ready %s %s", Integer.valueOf(i8), this.mHandler, this.mList);
                return;
            }
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.arg1 = i8;
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                Object[] objArr = new Object[2];
                List<a.b> list = this.mList;
                k kVar = null;
                if (list != null && list.get(0) != null) {
                    kVar = this.mList.get(0).getOrigin().getListener();
                }
                objArr[0] = kVar;
                objArr[1] = Integer.valueOf(obtainMessage.arg1);
                com.liulishuo.filedownloader.util.d.d(c.class, "start next %s %s", objArr);
            }
            this.mHandler.sendMessage(obtainMessage);
        }

        public void freeze() {
            this.mList.get(this.mRunningIndex).getOrigin().removeFinishListener(this.mSerialFinishListener);
            this.mHandler.removeCallbacksAndMessages(null);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 1) {
                if (message.arg1 < this.mList.size()) {
                    int i9 = message.arg1;
                    this.mRunningIndex = i9;
                    a.b bVar = this.mList.get(i9);
                    synchronized (bVar.getPauseLock()) {
                        try {
                            if (bVar.getOrigin().getStatus() == 0 && !j.getImpl().isNotContains(bVar)) {
                                bVar.getOrigin().addFinishListener(this.mSerialFinishListener.setNextIndex(this.mRunningIndex + 1));
                                bVar.startTaskByQueue();
                            }
                            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                                com.liulishuo.filedownloader.util.d.d(c.class, "direct go next by not contains %s %d", bVar, Integer.valueOf(message.arg1));
                            }
                            goNext(message.arg1 + 1);
                            return true;
                        } finally {
                        }
                    }
                }
                synchronized (e0.this.mRunningSerialMap) {
                    e0.this.mRunningSerialMap.remove(this.mList.get(0).getAttachKey());
                }
                Handler handler = this.mHandler;
                k kVar = null;
                if (handler != null && handler.getLooper() != null) {
                    this.mHandler.getLooper().quit();
                    this.mHandler = null;
                    this.mList = null;
                    this.mSerialFinishListener = null;
                }
                if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                    Object[] objArr = new Object[2];
                    List<a.b> list = this.mList;
                    if (list != null && list.get(0) != null) {
                        kVar = this.mList.get(0).getOrigin().getListener();
                    }
                    objArr[0] = kVar;
                    objArr[1] = Integer.valueOf(message.arg1);
                    com.liulishuo.filedownloader.util.d.d(c.class, "final serial %s %d", objArr);
                }
                return true;
            }
            if (i8 == 2) {
                freeze();
            } else if (i8 == 3) {
                unfreeze();
            }
            return true;
        }

        public void setHandler(Handler handler) {
            this.mHandler = handler;
        }

        public void setList(List<a.b> list) {
            this.mList = list;
        }

        public void unfreeze() {
            goNext(this.mRunningIndex);
        }
    }

    e0() {
    }

    private void freezeSerialHandler(Handler handler) {
        handler.sendEmptyMessage(2);
    }

    private boolean onAssembledTasksToStart(int i8, List<a.b> list, k kVar, boolean z7) {
        if (n.isValid()) {
            n.getMonitor();
            list.size();
            throw null;
        }
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.v(s.class, "start list attachKey[%d] size[%d] listener[%s] isSerial[%B]", Integer.valueOf(i8), Integer.valueOf(list.size()), kVar, Boolean.valueOf(z7));
        }
        if (list != null && !list.isEmpty()) {
            return false;
        }
        com.liulishuo.filedownloader.util.d.w(s.class, "Tasks with the listener can't start, because can't find any task with the provided listener, maybe tasks instance has been started in the past, so they are all are inUsing, if in this case, you can use [BaseDownloadTask#reuse] to reuse theme first then start again: [%s, %B]", kVar, Boolean.valueOf(z7));
        return true;
    }

    private void unFreezeSerialHandler(Handler handler) {
        handler.sendEmptyMessage(3);
    }

    @Override // com.liulishuo.filedownloader.y
    public boolean contain(int i8) {
        return this.mRunningSerialMap.get(i8) != null;
    }

    @Override // com.liulishuo.filedownloader.y
    public void freezeAllSerialQueues() {
        for (int i8 = 0; i8 < this.mRunningSerialMap.size(); i8++) {
            freezeSerialHandler(this.mRunningSerialMap.get(this.mRunningSerialMap.keyAt(i8)));
        }
    }

    @Override // com.liulishuo.filedownloader.y
    public int serialQueueSize() {
        return this.mRunningSerialMap.size();
    }

    @Override // com.liulishuo.filedownloader.y
    public boolean startQueueParallel(k kVar) {
        int hashCode = kVar.hashCode();
        List<a.b> assembleTasksToStart = j.getImpl().assembleTasksToStart(hashCode, kVar);
        if (onAssembledTasksToStart(hashCode, assembleTasksToStart, kVar, false)) {
            return false;
        }
        Iterator<a.b> it = assembleTasksToStart.iterator();
        while (it.hasNext()) {
            it.next().startTaskByQueue();
        }
        return true;
    }

    @Override // com.liulishuo.filedownloader.y
    public boolean startQueueSerial(k kVar) {
        c cVar = new c();
        int hashCode = cVar.hashCode();
        List<a.b> assembleTasksToStart = j.getImpl().assembleTasksToStart(hashCode, kVar);
        if (onAssembledTasksToStart(hashCode, assembleTasksToStart, kVar, true)) {
            return false;
        }
        HandlerThread handlerThread = new HandlerThread(com.liulishuo.filedownloader.util.f.formatString("filedownloader serial thread %s-%d", kVar, Integer.valueOf(hashCode)));
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), cVar);
        cVar.setHandler(handler);
        cVar.setList(assembleTasksToStart);
        cVar.goNext(0);
        synchronized (this.mRunningSerialMap) {
            this.mRunningSerialMap.put(hashCode, handler);
        }
        return true;
    }

    @Override // com.liulishuo.filedownloader.y
    public void unFreezeSerialQueues(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            unFreezeSerialHandler(this.mRunningSerialMap.get(it.next().intValue()));
        }
    }
}
