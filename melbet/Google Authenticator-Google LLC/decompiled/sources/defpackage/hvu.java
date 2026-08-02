package defpackage;

import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hvu implements Runnable {
    Runnable a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public hvu(Object obj, int i) {
        this.c = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c1, code lost:
    
        r4 = r4 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c2, code lost:
    
        r11.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00cf, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d1, code lost:
    
        defpackage.hvv.a.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", "Exception while executing runnable " + java.lang.String.valueOf(r11.a), (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f7, code lost:
    
        r11.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fc, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        if (r4 == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0048, code lost:
    
        r4 = r4 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0049, code lost:
    
        r11.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0054, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0057, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x003b A[Catch: all -> 0x0065, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0065, blocks: (B:64:0x0007, B:86:0x003b, B:102:0x005d, B:103:0x0064, B:67:0x000c, B:68:0x0013, B:73:0x0044, B:77:0x004e, B:80:0x0055, B:81:0x0057, B:92:0x005a, B:76:0x0049, B:94:0x0016, B:97:0x0021, B:70:0x002a, B:83:0x0034, B:84:0x0038, B:72:0x0043), top: B:63:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00bb A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        boolean z = false;
        if (this.c == 0) {
            boolean z2 = false;
            while (true) {
                try {
                    try {
                        Object obj2 = this.b;
                        Deque deque = ((hvv) obj2).b;
                        synchronized (deque) {
                            if (!z) {
                                if (((hvv) obj2).d != 4) {
                                    ((hvv) obj2).c++;
                                    ((hvv) obj2).d = 4;
                                }
                            }
                            Runnable runnable = (Runnable) deque.poll();
                            this.a = runnable;
                            if (runnable == null) {
                                ((hvv) this.b).d = 1;
                            }
                        }
                        if (!z2) {
                            return;
                        }
                        z = true;
                    } finally {
                        if (z2) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Error e) {
                    Object obj3 = this.b;
                    synchronized (((hvv) obj3).b) {
                        ((hvv) obj3).d = 1;
                        throw e;
                    }
                }
            }
            return;
        }
        try {
            fao.c();
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                try {
                    obj = this.b;
                    Deque deque2 = ((gbf) obj).a;
                    synchronized (deque2) {
                        if (!z3) {
                            hoq.H(((gbf) obj).b == 2);
                            ((gbf) obj).b = 3;
                        }
                        Runnable runnable2 = (Runnable) deque2.poll();
                        this.a = runnable2;
                        if (runnable2 == null) {
                            break;
                        }
                    }
                    if (z4) {
                        return;
                    }
                    Thread.currentThread().interrupt();
                    return;
                    this.a = null;
                    z3 = true;
                } catch (Throwable th) {
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            ((gbf) obj).b = 1;
            if (z4) {
            }
        } catch (Throwable th2) {
            Object obj4 = this.b;
            synchronized (((gbf) obj4).a) {
                ((gbf) obj4).b = 1;
                throw th2;
            }
        }
    }

    public final String toString() {
        int i = this.c;
        Runnable runnable = this.a;
        String str = "null";
        if (i != 0) {
            if (runnable != null) {
                return a.aa(runnable, "SequentialExecutorWorker{running=", "}");
            }
            int i2 = ((gbf) this.b).b;
            if (i2 == 1) {
                str = "IDLE";
            } else if (i2 == 2) {
                str = "QUEUED";
            } else if (i2 == 3) {
                str = "RUNNING";
            }
            return a.Z(str, "SequentialExecutorWorker{state=", "}");
        }
        if (runnable != null) {
            return a.aa(runnable, "SequentialExecutorWorker{running=", "}");
        }
        int i3 = ((hvv) this.b).d;
        if (i3 == 1) {
            str = "IDLE";
        } else if (i3 == 2) {
            str = "QUEUING";
        } else if (i3 == 3) {
            str = "QUEUED";
        } else if (i3 == 4) {
            str = "RUNNING";
        }
        return a.Z(str, "SequentialExecutorWorker{state=", "}");
    }
}
