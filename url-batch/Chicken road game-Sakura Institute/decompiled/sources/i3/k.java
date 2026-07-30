package i3;

import d6.z;
import f8.m;
import f8.r;
import f8.w;
import f8.y;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k extends c {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097 A[Catch: all -> 0x00a3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00a3, blocks: (B:18:0x0097, B:30:0x00a5, B:61:0x0055), top: B:60:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5 A[Catch: all -> 0x00a3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00a3, blocks: (B:18:0x0097, B:30:0x00a5, B:61:0x0055), top: B:60:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, j6.c cVar) {
        j jVar;
        int i7;
        r g9;
        r rVar;
        y yVar;
        z zVar;
        Throwable th;
        z zVar2;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i8 = jVar.f4928k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                jVar.f4928k = i8 - Integer.MIN_VALUE;
                Object obj2 = jVar.f4926i;
                i7 = jVar.f4928k;
                z zVar3 = z.f2639a;
                Throwable th2 = null;
                if (i7 != 0) {
                    d6.a.e(obj2);
                    if (this.f4894c.f4886a.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    m mVar = this.f4892a;
                    mVar.getClass();
                    w wVar = this.f4893b;
                    r6.k.f(wVar, "file");
                    g9 = mVar.g(wVar);
                    try {
                        y yVar2 = new y(r.b(g9));
                        try {
                            k3.g gVar = k3.g.f5355a;
                            jVar.f4923f = g9;
                            jVar.f4924g = g9;
                            jVar.f4925h = yVar2;
                            jVar.f4928k = 1;
                            gVar.b(obj, yVar2);
                            i6.a aVar = i6.a.f4956f;
                            if (zVar3 == aVar) {
                                return aVar;
                            }
                            rVar = g9;
                            yVar = yVar2;
                        } catch (Throwable th3) {
                            th = th3;
                            rVar = g9;
                            yVar = yVar2;
                            if (yVar != null) {
                                try {
                                    yVar.close();
                                } catch (Throwable th4) {
                                    try {
                                        d6.a.a(th, th4);
                                    } catch (Throwable th5) {
                                        th = th5;
                                        g9 = rVar;
                                        if (g9 != null) {
                                        }
                                        th2 = th;
                                        zVar = null;
                                        if (th2 != null) {
                                        }
                                    }
                                }
                            }
                            th = th;
                            zVar2 = null;
                            r rVar2 = rVar;
                            if (th == null) {
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        if (g9 != null) {
                            try {
                                g9.close();
                            } catch (Throwable th7) {
                                d6.a.a(th, th7);
                            }
                        }
                        th2 = th;
                        zVar = null;
                        if (th2 != null) {
                        }
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = jVar.f4925h;
                    g9 = jVar.f4924g;
                    rVar = jVar.f4923f;
                    try {
                        d6.a.e(obj2);
                    } catch (Throwable th8) {
                        th = th8;
                        if (yVar != null) {
                        }
                        th = th;
                        zVar2 = null;
                        r rVar22 = rVar;
                        if (th == null) {
                        }
                    }
                }
                g9.flush();
                if (yVar != null) {
                    try {
                        yVar.close();
                    } catch (Throwable th9) {
                        th = th9;
                    }
                }
                th = null;
                zVar2 = zVar3;
                r rVar222 = rVar;
                if (th == null) {
                    throw th;
                }
                r6.k.c(zVar2);
                if (rVar222 != null) {
                    try {
                        rVar222.close();
                    } catch (Throwable th10) {
                        th2 = th10;
                    }
                }
                zVar = zVar3;
                if (th2 != null) {
                    throw th2;
                }
                r6.k.c(zVar);
                return zVar3;
            }
        }
        jVar = new j(this, cVar);
        Object obj22 = jVar.f4926i;
        i7 = jVar.f4928k;
        z zVar32 = z.f2639a;
        Throwable th22 = null;
        if (i7 != 0) {
        }
        g9.flush();
        if (yVar != null) {
        }
        th = null;
        zVar2 = zVar32;
        r rVar2222 = rVar;
        if (th == null) {
        }
    }
}
