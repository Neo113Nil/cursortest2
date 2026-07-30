package com.liulishuo.filedownloader.message;

import com.liulishuo.filedownloader.message.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class e {
    private final List<a> executorList = new ArrayList();
    private final c.b receiver;

    public class a {
        private final List<Integer> enQueueTaskIdList = new ArrayList();
        private final Executor mExecutor;

        /* renamed from: com.liulishuo.filedownloader.message.e$a$a, reason: collision with other inner class name */
        class RunnableC0297a implements Runnable {
            final /* synthetic */ MessageSnapshot val$snapshot;

            RunnableC0297a(MessageSnapshot messageSnapshot) {
                this.val$snapshot = messageSnapshot;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.receiver.receive(this.val$snapshot);
                a.this.enQueueTaskIdList.remove(Integer.valueOf(this.val$snapshot.getId()));
            }
        }

        public a(int i8) {
            this.mExecutor = com.liulishuo.filedownloader.util.b.newDefaultThreadPool(1, "Flow-" + i8);
        }

        public void enqueue(int i8) {
            this.enQueueTaskIdList.add(Integer.valueOf(i8));
        }

        public void execute(MessageSnapshot messageSnapshot) {
            this.mExecutor.execute(new RunnableC0297a(messageSnapshot));
        }
    }

    e(int i8, c.b bVar) {
        this.receiver = bVar;
        for (int i9 = 0; i9 < i8; i9++) {
            this.executorList.add(new a(i9));
        }
    }

    public void execute(MessageSnapshot messageSnapshot) {
        a aVar = null;
        try {
            synchronized (this.executorList) {
                try {
                    int id = messageSnapshot.getId();
                    Iterator<a> it = this.executorList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        a next = it.next();
                        if (next.enQueueTaskIdList.contains(Integer.valueOf(id))) {
                            aVar = next;
                            break;
                        }
                    }
                    if (aVar == null) {
                        Iterator<a> it2 = this.executorList.iterator();
                        int i8 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            a next2 = it2.next();
                            if (next2.enQueueTaskIdList.size() <= 0) {
                                aVar = next2;
                                break;
                            } else if (i8 == 0 || next2.enQueueTaskIdList.size() < i8) {
                                i8 = next2.enQueueTaskIdList.size();
                                aVar = next2;
                            }
                        }
                    }
                    aVar.enqueue(id);
                } finally {
                }
            }
        } finally {
            aVar.execute(messageSnapshot);
        }
    }
}
