package com.liulishuo.filedownloader.message;

/* loaded from: classes4.dex */
public class c {
    private volatile e flowThreadPool;
    private volatile b receiver;

    public static final class a {
        private static final c INSTANCE = new c();
    }

    public interface b {
        void receive(MessageSnapshot messageSnapshot);
    }

    public static c getImpl() {
        return a.INSTANCE;
    }

    public void inflow(MessageSnapshot messageSnapshot) {
        if (messageSnapshot instanceof com.liulishuo.filedownloader.message.a) {
            if (this.receiver != null) {
                this.receiver.receive(messageSnapshot);
            }
        } else if (this.flowThreadPool != null) {
            this.flowThreadPool.execute(messageSnapshot);
        }
    }

    public void setReceiver(b bVar) {
        this.receiver = bVar;
        if (bVar == null) {
            this.flowThreadPool = null;
        } else {
            this.flowThreadPool = new e(5, bVar);
        }
    }
}
