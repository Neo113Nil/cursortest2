package h1;

import java.io.RandomAccessFile;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;
import y2.C1331f;
import z3.q;
import z3.v;
import z3.x;

/* renamed from: h1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0658k extends C0650c {
    /* JADX WARN: Removed duplicated region for block: B:17:0x00af A[Catch: all -> 0x00bc, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00bc, blocks: (B:17:0x00af, B:28:0x00be, B:59:0x0065), top: B:58:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be A[Catch: all -> 0x00bc, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00bc, blocks: (B:17:0x00af, B:28:0x00be, B:59:0x0065), top: B:58:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, E2.c cVar) {
        C0657j c0657j;
        int i2;
        q qVar;
        x xVar;
        q qVar2;
        Unit unit;
        Throwable th;
        q qVar3;
        Unit unit2;
        if (cVar instanceof C0657j) {
            c0657j = (C0657j) cVar;
            int i4 = c0657j.f6869o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0657j.f6869o = i4 - Integer.MIN_VALUE;
                Object obj2 = c0657j.f6867m;
                D2.a aVar = D2.a.f2163d;
                i2 = c0657j.f6869o;
                Throwable th2 = null;
                if (i2 != 0) {
                    AbstractC1343r.b(obj2);
                    if (this.f6835c.f6827a.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    this.f6833a.getClass();
                    v file = this.f6834b;
                    Intrinsics.checkNotNullParameter(file, "file");
                    Intrinsics.checkNotNullParameter(file, "file");
                    q qVar4 = new q(true, new RandomAccessFile(file.l(), "rw"));
                    try {
                        z3.j a4 = q.a(qVar4);
                        Intrinsics.checkNotNullParameter(a4, "<this>");
                        x xVar2 = new x(a4);
                        try {
                            j1.h hVar = j1.h.f7154a;
                            c0657j.f6864j = qVar4;
                            c0657j.f6865k = qVar4;
                            c0657j.f6866l = xVar2;
                            c0657j.f6869o = 1;
                            if (hVar.b(obj, xVar2) == aVar) {
                                return aVar;
                            }
                            qVar = qVar4;
                            qVar2 = qVar;
                            xVar = xVar2;
                        } catch (Throwable th3) {
                            th = th3;
                            qVar = qVar4;
                            xVar = xVar2;
                            if (xVar != null) {
                                try {
                                    xVar.close();
                                } catch (Throwable th4) {
                                    try {
                                        C1331f.a(th, th4);
                                    } catch (Throwable th5) {
                                        th = th5;
                                        qVar4 = qVar;
                                        if (qVar4 != null) {
                                            try {
                                                qVar4.close();
                                            } catch (Throwable th6) {
                                                C1331f.a(th, th6);
                                            }
                                        }
                                        th2 = th;
                                        unit = null;
                                        if (th2 != null) {
                                        }
                                    }
                                }
                            }
                            th = th;
                            qVar3 = qVar;
                            unit2 = null;
                            if (th == null) {
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        if (qVar4 != null) {
                        }
                        th2 = th;
                        unit = null;
                        if (th2 != null) {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xVar = c0657j.f6866l;
                    qVar2 = c0657j.f6865k;
                    qVar = c0657j.f6864j;
                    try {
                        AbstractC1343r.b(obj2);
                    } catch (Throwable th8) {
                        th = th8;
                        if (xVar != null) {
                        }
                        th = th;
                        qVar3 = qVar;
                        unit2 = null;
                        if (th == null) {
                        }
                    }
                }
                qVar2.flush();
                unit2 = Unit.f7487a;
                if (xVar != null) {
                    try {
                        xVar.close();
                    } catch (Throwable th9) {
                        th = th9;
                    }
                }
                th = null;
                qVar3 = qVar;
                if (th == null) {
                    throw th;
                }
                Intrinsics.c(unit2);
                unit = Unit.f7487a;
                if (qVar3 != null) {
                    try {
                        qVar3.close();
                    } catch (Throwable th10) {
                        th2 = th10;
                    }
                }
                if (th2 != null) {
                    throw th2;
                }
                Intrinsics.c(unit);
                return Unit.f7487a;
            }
        }
        c0657j = new C0657j(this, cVar);
        Object obj22 = c0657j.f6867m;
        D2.a aVar2 = D2.a.f2163d;
        i2 = c0657j.f6869o;
        Throwable th22 = null;
        if (i2 != 0) {
        }
        qVar2.flush();
        unit2 = Unit.f7487a;
        if (xVar != null) {
        }
        th = null;
        qVar3 = qVar;
        if (th == null) {
        }
    }
}
