package g1;

import I2.l;
import L1.z;
import M1.B;
import N2.q;
import N2.v;
import N2.x;
import i1.C0471h;
import java.io.RandomAccessFile;

/* renamed from: g1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404k extends C0396c {
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
    public final Object b(Object obj, R1.c cVar) {
        C0403j c0403j;
        int i3;
        q qVar;
        q qVar2;
        x xVar;
        q qVar3;
        z zVar;
        Throwable th;
        q qVar4;
        z zVar2;
        if (cVar instanceof C0403j) {
            c0403j = (C0403j) cVar;
            int i4 = c0403j.f4838i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0403j.f4838i = i4 - Integer.MIN_VALUE;
                Object obj2 = c0403j.f4836g;
                Q1.a aVar = Q1.a.f3113d;
                i3 = c0403j.f4838i;
                z zVar3 = z.f2729a;
                Throwable th2 = null;
                if (i3 != 0) {
                    l.Q(obj2);
                    if (this.f4804c.f4796a.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    this.f4802a.getClass();
                    v vVar = this.f4803b;
                    Z1.i.f(vVar, "file");
                    qVar = new q(true, new RandomAccessFile(vVar.f(), "rw"));
                    try {
                        x xVar2 = new x(q.a(qVar));
                        try {
                            C0471h c0471h = C0471h.f5115a;
                            c0403j.f4833d = qVar;
                            c0403j.f4834e = qVar;
                            c0403j.f4835f = xVar2;
                            c0403j.f4838i = 1;
                            c0471h.b(obj, xVar2);
                            if (zVar3 == aVar) {
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
                            zVar2 = null;
                            if (th == null) {
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        if (qVar != null) {
                            try {
                                qVar.close();
                            } catch (Throwable th5) {
                                B.o(th, th5);
                            }
                        }
                        th2 = th;
                        zVar = null;
                        if (th2 != null) {
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xVar = c0403j.f4835f;
                    qVar3 = c0403j.f4834e;
                    qVar2 = c0403j.f4833d;
                    try {
                        l.Q(obj2);
                    } catch (Throwable th6) {
                        th = th6;
                        if (xVar != null) {
                            try {
                                xVar.close();
                            } catch (Throwable th7) {
                                try {
                                    B.o(th, th7);
                                } catch (Throwable th8) {
                                    th = th8;
                                    qVar = qVar2;
                                    if (qVar != null) {
                                    }
                                    th2 = th;
                                    zVar = null;
                                    if (th2 != null) {
                                    }
                                }
                            }
                        }
                        th = th;
                        qVar4 = qVar2;
                        zVar2 = null;
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
                zVar2 = zVar3;
                if (th == null) {
                    throw th;
                }
                Z1.i.c(zVar2);
                if (qVar4 != null) {
                    try {
                        qVar4.close();
                    } catch (Throwable th10) {
                        th2 = th10;
                    }
                }
                zVar = zVar3;
                if (th2 != null) {
                    throw th2;
                }
                Z1.i.c(zVar);
                return zVar3;
            }
        }
        c0403j = new C0403j(this, cVar);
        Object obj22 = c0403j.f4836g;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = c0403j.f4838i;
        z zVar32 = z.f2729a;
        Throwable th22 = null;
        if (i3 != 0) {
        }
        qVar3.flush();
        if (xVar != null) {
        }
        th = null;
        qVar4 = qVar2;
        zVar2 = zVar32;
        if (th == null) {
        }
    }
}
