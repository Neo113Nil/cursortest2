package u;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import u.i0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7015a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7016b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7017c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f7018d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7019e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f7020f;

    /* renamed from: g, reason: collision with root package name */
    public Object f7021g;

    /* renamed from: h, reason: collision with root package name */
    public Object f7022h;

    public i0(e1 e1Var, q3.k kVar, t0 t0Var, r2.c cVar) {
        this.f7016b = e1Var;
        this.f7017c = kVar;
        this.f7018d = t0Var;
        this.f7019e = cVar;
        this.f7020f = c7.j.a(Integer.MAX_VALUE, null, 6);
        this.f7022h = new a0.a0(20);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r0v20, types: [p6.a, q6.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i0 i0Var, e1 e1Var, d0 d0Var, float f6, float f8, i6.c cVar) {
        e0 e0Var;
        int i;
        q6.p pVar;
        float f9;
        e1 e1Var2;
        long c8;
        a7.u uVar;
        i0Var.getClass();
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i8 = e0Var.f6961l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                e0Var.f6961l = i8 - Integer.MIN_VALUE;
                e0 e0Var2 = e0Var;
                Object obj = e0Var2.f6959j;
                i = e0Var2.f6961l;
                Object obj2 = c6.m.f1757a;
                Object obj3 = h6.a.f3204d;
                if (i != 0) {
                    s6.a.K(obj);
                    q6.s sVar = new q6.s();
                    sVar.f6205d = d0Var;
                    i0Var.g(d0Var);
                    d0 f10 = f((c7.c) i0Var.f7020f);
                    if (f10 != null) {
                        i0Var.g(f10);
                        sVar.f6205d = ((d0) sVar.f6205d).a(f10);
                    }
                    q6.p pVar2 = new q6.p();
                    float g3 = e1Var.g(e1Var.e(((d0) sVar.f6205d).f6949a));
                    pVar2.f6202d = g3;
                    if (!c0.a(g3)) {
                        q6.s sVar2 = new q6.s();
                        sVar2.f6205d = r.d.a(30, 0.0f);
                        f0 f0Var = new f0(pVar2, sVar2, sVar, f6, i0Var, f8, e1Var, null);
                        e0Var2.f6957g = e1Var;
                        e0Var2.f6958h = pVar2;
                        e0Var2.i = f8;
                        e0Var2.f6961l = 1;
                        if (i0Var.h(e1Var, f0Var, e0Var2) != obj3) {
                            pVar = pVar2;
                            f9 = f8;
                            e1Var2 = e1Var;
                        }
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                    return obj2;
                }
                f9 = e0Var2.i;
                pVar = e0Var2.f6958h;
                e1Var2 = e0Var2.f6957g;
                s6.a.K(obj);
                a0.a0 a0Var = (a0.a0) i0Var.f7022h;
                c8 = r2.r.c(((r1.c) a0Var.f11e).b(Float.MAX_VALUE), ((r1.c) a0Var.f12f).b(Float.MAX_VALUE));
                if (c8 == 0) {
                    float d8 = e1Var2.d(Math.signum(pVar.f6202d)) * Math.min(Math.abs(pVar.f6202d) / 100, f9) * 1000;
                    if (d8 == 0.0f) {
                        c8 = 0;
                    } else {
                        c8 = e1Var2.f6965d == j0.f7028e ? r2.r.c(d8, 0.0f) : r2.r.c(0.0f, d8);
                    }
                }
                long j7 = c8;
                t0 t0Var = (t0) i0Var.f7018d;
                g6.c cVar2 = null;
                e0Var2.f6957g = null;
                e0Var2.f6958h = null;
                e0Var2.f6961l = 2;
                x0 x0Var = (x0) t0Var.f6181d;
                uVar = (a7.u) ((q6.j) x0Var.E.f1739f).b();
                if (uVar != null) {
                    throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
                }
                a7.x.n(uVar, null, new u0(x0Var, j7, cVar2, 2), 3);
                return obj2 == obj3 ? obj3 : obj2;
            }
        }
        e0Var = new e0(i0Var, cVar);
        e0 e0Var22 = e0Var;
        Object obj4 = e0Var22.f6959j;
        i = e0Var22.f6961l;
        Object obj22 = c6.m.f1757a;
        Object obj32 = h6.a.f3204d;
        if (i != 0) {
        }
        a0.a0 a0Var2 = (a0.a0) i0Var.f7022h;
        c8 = r2.r.c(((r1.c) a0Var2.f11e).b(Float.MAX_VALUE), ((r1.c) a0Var2.f12f).b(Float.MAX_VALUE));
        if (c8 == 0) {
        }
        long j72 = c8;
        t0 t0Var2 = (t0) i0Var.f7018d;
        g6.c cVar22 = null;
        e0Var22.f6957g = null;
        e0Var22.f6958h = null;
        e0Var22.f6961l = 2;
        x0 x0Var2 = (x0) t0Var2.f6181d;
        uVar = (a7.u) ((q6.j) x0Var2.E.f1739f).b();
        if (uVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(i0 i0Var, q6.s sVar, q6.p pVar, e1 e1Var, q6.s sVar2, long j7, i6.c cVar) {
        g0 g0Var;
        int i;
        q6.p pVar2;
        e1 e1Var2;
        q6.s sVar3;
        d0 d0Var;
        boolean z3;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i8 = g0Var.f7001m;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                g0Var.f7001m = i8 - Integer.MIN_VALUE;
                Object obj = g0Var.f7000l;
                i = g0Var.f7001m;
                if (i != 0) {
                    s6.a.K(obj);
                    if (j7 < 0) {
                        return Boolean.FALSE;
                    }
                    a0.p0 p0Var = new a0.p0(i0Var, (g6.c) null, 7);
                    g0Var.f6996g = i0Var;
                    g0Var.f6997h = sVar;
                    g0Var.i = pVar;
                    g0Var.f6998j = e1Var;
                    g0Var.f6999k = sVar2;
                    g0Var.f7001m = 1;
                    obj = a7.x.v(j7, p0Var, g0Var);
                    h6.a aVar = h6.a.f3204d;
                    if (obj == aVar) {
                        return aVar;
                    }
                    pVar2 = pVar;
                    e1Var2 = e1Var;
                    sVar3 = sVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q6.s sVar4 = g0Var.f6999k;
                    e1 e1Var3 = g0Var.f6998j;
                    pVar2 = g0Var.i;
                    q6.s sVar5 = g0Var.f6997h;
                    i0 i0Var2 = g0Var.f6996g;
                    s6.a.K(obj);
                    sVar3 = sVar4;
                    e1Var2 = e1Var3;
                    sVar = sVar5;
                    i0Var = i0Var2;
                }
                d0Var = (d0) obj;
                if (d0Var == null) {
                    boolean z7 = ((d0) sVar.f6205d).f6951c;
                    long j8 = d0Var.f6949a;
                    sVar.f6205d = new d0(j8, d0Var.f6950b, z7);
                    pVar2.f6202d = e1Var2.g(e1Var2.e(j8));
                    sVar3.f6205d = r.d.a(30, 0.0f);
                    i0Var.g(d0Var);
                    z3 = !c0.a(pVar2.f6202d);
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            }
        }
        g0Var = new g0(cVar);
        Object obj2 = g0Var.f7000l;
        i = g0Var.f7001m;
        if (i != 0) {
        }
        d0Var = (d0) obj2;
        if (d0Var == null) {
        }
        return Boolean.valueOf(z3);
    }

    public static d0 f(c7.c cVar) {
        d0 d0Var = null;
        x6.f E = r2.r.E(new b0(new androidx.lifecycle.m0(14, cVar), null));
        while (E.hasNext()) {
            d0 d0Var2 = (d0) E.next();
            if (d0Var != null) {
                d0Var2 = d0Var.a(d0Var2);
            }
            d0Var = d0Var2;
        }
        return d0Var;
    }

    public float c(c1 c1Var, float f6) {
        e1 e1Var = (e1) this.f7016b;
        long h8 = e1Var.h(e1Var.d(f6));
        e1 e1Var2 = c1Var.f6948a;
        return e1Var.g(e1Var.e(e1Var2.c(e1Var2.f6971k, h8, 1)));
    }

    public FileInputStream d(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e8) {
            String message = e8.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((u4.d) this.f7017c).b();
            return null;
        }
    }

    public void e(final int i, final Serializable serializable) {
        ((Executor) this.f7016b).execute(new Runnable() { // from class: u4.a
            @Override // java.lang.Runnable
            public final void run() {
                ((d) i0.this.f7017c).c(i, serializable);
            }
        });
    }

    public void g(d0 d0Var) {
        a0.a0 a0Var = (a0.a0) this.f7022h;
        long j7 = d0Var.f6950b;
        long j8 = d0Var.f6949a;
        ((r1.c) a0Var.f11e).a(j7, Float.intBitsToFloat((int) (j8 >> 32)));
        ((r1.c) a0Var.f12f).a(j7, Float.intBitsToFloat((int) (j8 & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(e1 e1Var, f0 f0Var, i6.c cVar) {
        h0 h0Var;
        int i;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i8 = h0Var.i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                h0Var.i = i8 - Integer.MIN_VALUE;
                Object obj = h0Var.f7011g;
                i = h0Var.i;
                if (i != 0) {
                    s6.a.K(obj);
                    this.f7015a = true;
                    b0.d dVar = new b0.d(e1Var, f0Var, null, 13);
                    h0Var.i = 1;
                    g6.h hVar = h0Var.f3460e;
                    q6.i.b(hVar);
                    a7.i1 i1Var = new a7.i1(h0Var, hVar);
                    Object H = s6.a.H(i1Var, i1Var, dVar);
                    h6.a aVar = h6.a.f3204d;
                    if (H == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                this.f7015a = false;
                return c6.m.f1757a;
            }
        }
        h0Var = new h0(this, cVar);
        Object obj2 = h0Var.f7011g;
        i = h0Var.i;
        if (i != 0) {
        }
        this.f7015a = false;
        return c6.m.f1757a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Serializable] */
    public i0(AssetManager assetManager, Executor executor, u4.d dVar, String str, File file) {
        ?? r12;
        this.f7015a = false;
        this.f7016b = executor;
        this.f7017c = dVar;
        this.f7020f = str;
        this.f7019e = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            r12 = u4.e.f7395d;
        } else {
            switch (i) {
                case 24:
                case 25:
                    r12 = u4.e.f7399h;
                    break;
                case 26:
                    r12 = u4.e.f7398g;
                    break;
                case 27:
                    r12 = u4.e.f7397f;
                    break;
                case 28:
                case 29:
                case 30:
                    r12 = u4.e.f7396e;
                    break;
                default:
                    r12 = 0;
                    break;
            }
        }
        this.f7018d = r12;
    }
}
