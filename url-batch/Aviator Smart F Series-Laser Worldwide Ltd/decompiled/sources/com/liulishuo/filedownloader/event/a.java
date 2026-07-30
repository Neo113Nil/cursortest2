package com.liulishuo.filedownloader.event;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class a implements c {
    private final Executor threadPool = com.liulishuo.filedownloader.util.b.newDefaultThreadPool(10, "EventPool");
    private final HashMap<String, LinkedList<d>> listenersMap = new HashMap<>();

    /* renamed from: com.liulishuo.filedownloader.event.a$a, reason: collision with other inner class name */
    class RunnableC0293a implements Runnable {
        final /* synthetic */ b val$event;

        RunnableC0293a(b bVar) {
            this.val$event = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.publish(this.val$event);
        }
    }

    private void trigger(LinkedList<d> linkedList, b bVar) {
        for (Object obj : linkedList.toArray()) {
            if (obj != null && ((d) obj).callback(bVar)) {
                break;
            }
        }
        Runnable runnable = bVar.callback;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.liulishuo.filedownloader.event.c
    public boolean addListener(String str, d dVar) {
        boolean add;
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.v(this, "setListener %s", str);
        }
        if (dVar == null) {
            throw new IllegalArgumentException("listener must not be null!");
        }
        LinkedList<d> linkedList = this.listenersMap.get(str);
        if (linkedList == null) {
            synchronized (str.intern()) {
                try {
                    linkedList = this.listenersMap.get(str);
                    if (linkedList == null) {
                        HashMap<String, LinkedList<d>> hashMap = this.listenersMap;
                        LinkedList<d> linkedList2 = new LinkedList<>();
                        hashMap.put(str, linkedList2);
                        linkedList = linkedList2;
                    }
                } finally {
                }
            }
        }
        synchronized (str.intern()) {
            add = linkedList.add(dVar);
        }
        return add;
    }

    @Override // com.liulishuo.filedownloader.event.c
    public void asyncPublishInNewThread(b bVar) {
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.v(this, "asyncPublishInNewThread %s", bVar.getId());
        }
        if (bVar == null) {
            throw new IllegalArgumentException("event must not be null!");
        }
        this.threadPool.execute(new RunnableC0293a(bVar));
    }

    @Override // com.liulishuo.filedownloader.event.c
    public boolean publish(b bVar) {
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.v(this, "publish %s", bVar.getId());
        }
        if (bVar == null) {
            throw new IllegalArgumentException("event must not be null!");
        }
        String id = bVar.getId();
        LinkedList<d> linkedList = this.listenersMap.get(id);
        if (linkedList == null) {
            synchronized (id.intern()) {
                try {
                    linkedList = this.listenersMap.get(id);
                    if (linkedList == null) {
                        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                            com.liulishuo.filedownloader.util.d.d(this, "No listener for this event %s", id);
                        }
                        return false;
                    }
                } finally {
                }
            }
        }
        trigger(linkedList, bVar);
        return true;
    }

    @Override // com.liulishuo.filedownloader.event.c
    public boolean removeListener(String str, d dVar) {
        boolean remove;
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.v(this, "removeListener %s", str);
        }
        LinkedList<d> linkedList = this.listenersMap.get(str);
        if (linkedList == null) {
            synchronized (str.intern()) {
                linkedList = this.listenersMap.get(str);
            }
        }
        if (linkedList == null || dVar == null) {
            return false;
        }
        synchronized (str.intern()) {
            try {
                remove = linkedList.remove(dVar);
                if (linkedList.size() <= 0) {
                    this.listenersMap.remove(str);
                }
            } finally {
            }
        }
        return remove;
    }
}
