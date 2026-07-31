package j1;

import R1.y;
import T2.q;
import T2.v;
import T2.x;
import java.io.RandomAccessFile;
import l1.C0599h;

/* loaded from: classes.dex */
public final class k extends C0557c {
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7 A[Catch: all -> 0x00b3, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00b3, blocks: (B:17:0x00a7, B:29:0x00b5, B:60:0x0064), top: B:59:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5 A[Catch: all -> 0x00b3, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00b3, blocks: (B:17:0x00a7, B:29:0x00b5, B:60:0x0064), top: B:59:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, X1.c cVar) {
        j jVar;
        int i3;
        q qVar;
        q qVar2;
        x xVar;
        q qVar3;
        y yVar;
        Throwable th;
        q qVar4;
        y yVar2;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i4 = jVar.f6407l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                jVar.f6407l = i4 - Integer.MIN_VALUE;
                Object obj2 = jVar.f6405j;
                W1.a aVar = W1.a.f4608d;
                i3 = jVar.f6407l;
                y yVar3 = y.f4171a;
                Throwable th2 = null;
                if (i3 != 0) {
                    R1.a.e(obj2);
                    if (this.f6373c.f6365a.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    this.f6371a.getClass();
                    v vVar = this.f6372b;
                    f2.j.f(vVar, "file");
                    qVar = new q(true, new RandomAccessFile(vVar.f(), "rw"));
                    try {
                        x xVar2 = new x(q.a(qVar));
                        try {
                            C0599h c0599h = C0599h.f6594a;
                            jVar.f6402g = qVar;
                            jVar.f6403h = qVar;
                            jVar.f6404i = xVar2;
                            jVar.f6407l = 1;
                            c0599h.b(obj, xVar2);
                            if (yVar3 == aVar) {
                                return aVar;
                            }
                            qVar2 = qVar;
                            qVar3 = qVar2;
                            xVar = xVar2;
                        } catch (Throwable th3) {
                            th = th3;
                            qVar2 = qVar;
                            xVar = xVar2;
                            if (xVar != null) {
                            }
                            th = th;
                            qVar4 = qVar2;
                            yVar2 = null;
                            if (th == null) {
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        if (qVar != null) {
                            try {
                                qVar.close();
                            } catch (Throwable th5) {
                                R1.a.a(th, th5);
                            }
                        }
                        th2 = th;
                        yVar = null;
                        if (th2 != null) {
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xVar = jVar.f6404i;
                    qVar3 = jVar.f6403h;
                    qVar2 = jVar.f6402g;
                    try {
                        R1.a.e(obj2);
                    } catch (Throwable th6) {
                        th = th6;
                        if (xVar != null) {
                            try {
                                xVar.close();
                            } catch (Throwable th7) {
                                try {
                                    R1.a.a(th, th7);
                                } catch (Throwable th8) {
                                    th = th8;
                                    qVar = qVar2;
                                    if (qVar != null) {
                                    }
                                    th2 = th;
                                    yVar = null;
                                    if (th2 != null) {
                                    }
                                }
                            }
                        }
                        th = th;
                        qVar4 = qVar2;
                        yVar2 = null;
                        if (th == null) {
                        }
                    }
                }
                qVar3.flush();
                if (xVar != null) {
                    try {
                        xVar.close();
                    } catch (Throwable th9) {
                        th = th9;
                    }
                }
                th = null;
                qVar4 = qVar2;
                yVar2 = yVar3;
                if (th == null) {
                    throw th;
                }
                f2.j.c(yVar2);
                if (qVar4 != null) {
                    try {
                        qVar4.close();
                    } catch (Throwable th10) {
                        th2 = th10;
                    }
                }
                yVar = yVar3;
                if (th2 != null) {
                    throw th2;
                }
                f2.j.c(yVar);
                return yVar3;
            }
        }
        jVar = new j(this, cVar);
        Object obj22 = jVar.f6405j;
        W1.a aVar2 = W1.a.f4608d;
        i3 = jVar.f6407l;
        y yVar32 = y.f4171a;
        Throwable th22 = null;
        if (i3 != 0) {
        }
        qVar3.flush();
        if (xVar != null) {
        }
        th = null;
        qVar4 = qVar2;
        yVar2 = yVar32;
        if (th == null) {
        }
    }
}
