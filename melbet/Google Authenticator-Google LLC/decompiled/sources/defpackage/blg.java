package defpackage;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class blg implements blb {
    private final Object b;
    private final bld c;
    private final azu d;
    private final Object e;
    private final Class f;
    private final bky g;
    private final int h;
    private final int i;
    private final azw j;
    private final bln k;
    private final List l;
    private final Executor m;
    private bdv n;
    private bdi o;
    private long p;
    private volatile bdj q;
    private Drawable r;
    private int s;
    private int t;
    private boolean u;
    private RuntimeException v;
    private final bmq a = new bmq();
    private int w = 1;

    public blg(azu azuVar, Object obj, Object obj2, Class cls, bky bkyVar, int i, int i2, azw azwVar, bln blnVar, List list, bld bldVar, bdj bdjVar, Executor executor) {
        this.b = obj;
        this.d = azuVar;
        this.e = obj2;
        this.f = cls;
        this.g = bkyVar;
        this.h = i;
        this.i = i2;
        this.j = azwVar;
        this.k = blnVar;
        this.l = list;
        this.c = bldVar;
        this.q = bdjVar;
        this.m = executor;
        if (this.v == null && azuVar.h.v(azn.class)) {
            this.v = new RuntimeException("Glide request origin trace");
        }
    }

    private static int h(int i, float f) {
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return Math.round(f * i);
    }

    private final Drawable i() {
        Drawable drawable = this.r;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = this.g.j;
        this.r = drawable2;
        return drawable2;
    }

    private final void o() {
        if (this.u) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private final boolean p() {
        bld bldVar = this.c;
        return bldVar == null || bldVar.h(this);
    }

    private final void q() {
        bld bldVar = this.c;
        if (bldVar != null) {
            bldVar.a().j();
        }
    }

    public final Object a() {
        this.a.a();
        return this.b;
    }

    @Override // defpackage.blb
    public final void b() {
        synchronized (this.b) {
            o();
            this.a.a();
            double d = bmd.a;
            this.p = SystemClock.elapsedRealtimeNanos();
            int i = 5;
            if (this.e == null) {
                int i2 = this.h;
                int i3 = this.i;
                if (bmi.k(i2, i3)) {
                    this.s = i2;
                    this.t = i3;
                }
                if (i() != null) {
                    i = 3;
                }
                d(new bdr("Received null model"), i);
                return;
            }
            int i4 = this.w;
            if (i4 == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (i4 == 4) {
                g(this.n, 5);
                return;
            }
            List<ble> list = this.l;
            if (list != null) {
                for (ble bleVar : list) {
                    if (bleVar instanceof bla) {
                        throw null;
                    }
                }
            }
            this.w = 3;
            int i5 = this.h;
            int i6 = this.i;
            if (bmi.k(i5, i6)) {
                e(i5, i6);
            } else {
                this.k.bq(this);
            }
            int i7 = this.w;
            if ((i7 == 2 || i7 == 3) && p()) {
                this.k.e();
            }
        }
    }

    @Override // defpackage.blb
    public final void c() {
        synchronized (this.b) {
            o();
            bmq bmqVar = this.a;
            bmqVar.a();
            if (this.w == 6) {
                return;
            }
            o();
            bmqVar.a();
            this.k.j(this);
            bdi bdiVar = this.o;
            bdv bdvVar = null;
            if (bdiVar != null) {
                synchronized (bdiVar.b) {
                    ((bdn) bdiVar.a).h((blg) bdiVar.c);
                }
                this.o = null;
            }
            bdv bdvVar2 = this.n;
            if (bdvVar2 != null) {
                this.n = null;
                bdvVar = bdvVar2;
            }
            bld bldVar = this.c;
            if (bldVar == null || bldVar.g(this)) {
                this.k.d();
            }
            this.w = 6;
            if (bdvVar != null) {
                ((bdp) bdvVar).f();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        if (r0 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(bdr bdrVar, int i) {
        this.a.a();
        synchronized (this.b) {
            if (this.d.e <= i) {
                Log.w("Glide", "Load failed for [" + String.valueOf(this.e) + "] with dimensions [" + this.s + "x" + this.t + "]", bdrVar);
                List a = bdrVar.a();
                int size = a.size();
                for (int i2 = 0; i2 < size; i2++) {
                }
            }
            Drawable drawable = null;
            this.o = null;
            this.w = 5;
            bld bldVar = this.c;
            if (bldVar != null) {
                bldVar.d(this);
            }
            this.u = true;
            try {
                List<ble> list = this.l;
                if (list != null) {
                    boolean z = false;
                    for (ble bleVar : list) {
                        q();
                        z |= bleVar.b();
                    }
                }
                if (p()) {
                    Drawable i3 = this.e == null ? i() : null;
                    if (i3 == null) {
                        i3 = null;
                    }
                    if (i3 != null) {
                        drawable = i3;
                    }
                    this.k.b(drawable);
                }
            } finally {
                this.u = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0 A[Catch: all -> 0x0160, TryCatch #0 {, blocks: (B:16:0x00b0, B:18:0x00bc, B:19:0x014c, B:26:0x00c6, B:27:0x014e, B:31:0x006a, B:33:0x0072, B:35:0x0077, B:39:0x009d, B:42:0x0087, B:44:0x008d, B:45:0x0093), top: B:30:0x006a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014e A[Catch: all -> 0x0160, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {, blocks: (B:16:0x00b0, B:18:0x00bc, B:19:0x014c, B:26:0x00c6, B:27:0x014e, B:31:0x006a, B:33:0x0072, B:35:0x0077, B:39:0x009d, B:42:0x0087, B:44:0x008d, B:45:0x0093), top: B:30:0x006a, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, wq] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, wq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(int i, int i2) {
        Class cls;
        Class cls2;
        bbl bblVar;
        bdp bdpVar;
        bdi bdiVar;
        blg blgVar = this;
        blgVar.a.a();
        synchronized (blgVar.b) {
            if (blgVar.w != 3) {
                return;
            }
            blgVar.w = 2;
            bky bkyVar = blgVar.g;
            float f = bkyVar.a;
            blgVar.s = h(i, f);
            blgVar.t = h(i2, f);
            bdj bdjVar = blgVar.q;
            azu azuVar = blgVar.d;
            Object obj = blgVar.e;
            bbh bbhVar = bkyVar.g;
            int i3 = blgVar.s;
            int i4 = blgVar.t;
            Class cls3 = bkyVar.m;
            Class cls4 = blgVar.f;
            azw azwVar = blgVar.j;
            bdg bdgVar = bkyVar.b;
            Map map = bkyVar.l;
            boolean z = bkyVar.h;
            boolean z2 = bkyVar.o;
            bbl bblVar2 = bkyVar.k;
            boolean z3 = bkyVar.d;
            boolean z4 = bkyVar.p;
            Executor executor = blgVar.m;
            ajz ajzVar = bdjVar.g;
            bdo bdoVar = new bdo(obj, bbhVar, i3, i4, map, cls3, cls4, bblVar2);
            synchronized (bdjVar) {
                if (z3) {
                    bcr bcrVar = bdjVar.a;
                    bdp a = bcrVar.a(bdoVar);
                    if (a != null) {
                        a.d();
                    }
                    if (a == null) {
                        bblVar = bblVar2;
                        bdv b = bdjVar.b.b(bdoVar);
                        if (b == null) {
                            cls = cls3;
                            cls2 = cls4;
                            bdpVar = null;
                        } else {
                            cls2 = cls4;
                            if (b instanceof bdp) {
                                cls = cls3;
                                bdpVar = (bdp) b;
                            } else {
                                cls = cls3;
                                bdpVar = new bdp(b, true, bdoVar, bdjVar);
                            }
                        }
                        if (bdpVar != null) {
                            bdpVar.d();
                            bcrVar.b(bdoVar, bdpVar);
                        }
                        if (bdpVar == null) {
                        }
                    } else {
                        cls = cls3;
                        cls2 = cls4;
                        bblVar = bblVar2;
                        bdpVar = a;
                    }
                    if (bdpVar != null) {
                        ?? r11 = bdjVar.h.a;
                        bdn bdnVar = (bdn) r11.get(bdoVar);
                        if (bdnVar != null) {
                            bdnVar.g(blgVar, executor);
                            bdiVar = new bdi(bdjVar, blgVar, bdnVar);
                        } else {
                            bdn bdnVar2 = (bdn) bdjVar.c.d.a();
                            bdnVar2.i(bdoVar, z3, z4);
                            ifn ifnVar = bdjVar.f;
                            bcz bczVar = (bcz) ifnVar.a.a();
                            int i5 = ifnVar.b;
                            ifnVar.b = i5 + 1;
                            bcx bcxVar = bczVar.b;
                            cme cmeVar = bczVar.r;
                            bcxVar.c = azuVar;
                            bcxVar.d = obj;
                            bcxVar.m = bbhVar;
                            bcxVar.e = i3;
                            bcxVar.f = i4;
                            bcxVar.o = bdgVar;
                            bcxVar.g = cls;
                            bcxVar.r = cmeVar;
                            bcxVar.j = cls2;
                            bcxVar.n = azwVar;
                            bbl bblVar3 = bblVar;
                            bcxVar.h = bblVar3;
                            bcxVar.i = map;
                            bcxVar.p = z;
                            bcxVar.q = z2;
                            bczVar.d = azuVar;
                            bczVar.e = bbhVar;
                            bczVar.f = azwVar;
                            bczVar.g = i3;
                            bczVar.h = i4;
                            bczVar.i = bdgVar;
                            bczVar.j = bblVar3;
                            bczVar.q = bdnVar2;
                            bczVar.k = i5;
                            bczVar.p = 1;
                            bczVar.t = azuVar.h;
                            bczVar.l = a$$ExternalSyntheticApiModelOutline0.m13m(bblVar3.b(bcz.a));
                            r11.put(bdoVar, bdnVar2);
                            blgVar = this;
                            bdnVar2.g(blgVar, executor);
                            bdnVar2.f(bczVar);
                            bdiVar = new bdi(bdjVar, blgVar, bdnVar2);
                        }
                    } else {
                        blgVar.g(bdpVar, 5);
                        bdiVar = null;
                    }
                } else {
                    cls = cls3;
                    cls2 = cls4;
                    bblVar = bblVar2;
                }
                bdpVar = null;
                if (bdpVar != null) {
                }
            }
            blgVar.o = bdiVar;
            if (blgVar.w != 2) {
                blgVar.o = null;
            }
        }
    }

    @Override // defpackage.blb
    public final void f() {
        synchronized (this.b) {
            if (n()) {
                c();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ad, code lost:
    
        if (r0 == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(bdv bdvVar, int i) {
        this.a.a();
        bdv bdvVar2 = null;
        try {
            try {
                synchronized (this.b) {
                    try {
                        this.o = null;
                        if (bdvVar == null) {
                            d(new bdr("Expected to receive a Resource<R> with an object of " + this.f.toString() + " inside, but instead got null."), 5);
                            return;
                        }
                        Object c = bdvVar.c();
                        if (c != null && this.f.isAssignableFrom(c.getClass())) {
                            bld bldVar = this.c;
                            if (bldVar != null && !bldVar.i(this)) {
                                this.n = null;
                                this.w = 4;
                                ((bdp) bdvVar).f();
                            }
                            q();
                            this.w = 4;
                            this.n = bdvVar;
                            if (this.d.e <= 3) {
                                c.getClass().getSimpleName();
                                afn.r(i);
                                String.valueOf(this.e);
                                double d = bmd.a;
                                SystemClock.elapsedRealtimeNanos();
                                double d2 = bmd.a;
                            }
                            if (bldVar != null) {
                                bldVar.e(this);
                            }
                            this.u = true;
                            try {
                                List<ble> list = this.l;
                                if (list != null) {
                                    boolean z = false;
                                    for (ble bleVar : list) {
                                        z |= bleVar.c();
                                        if (bleVar instanceof bla) {
                                            z |= ((bla) bleVar).a();
                                        }
                                    }
                                }
                                this.k.k(c);
                                return;
                            } finally {
                                this.u = false;
                            }
                        }
                        this.n = null;
                        d(new bdr("Expected to receive an object of " + this.f.toString() + " but instead got " + String.valueOf(c != null ? c.getClass() : "") + "{" + String.valueOf(c) + "} inside Resource{" + bdvVar.toString() + "}." + (c != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.")), 5);
                        ((bdp) bdvVar).f();
                    } catch (Throwable th) {
                        th = th;
                        bdvVar = null;
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            bdvVar2 = bdvVar;
                            if (bdvVar2 != null) {
                                ((bdp) bdvVar2).f();
                            }
                            throw th;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.blb
    public final boolean j() {
        boolean z;
        synchronized (this.b) {
            z = this.w == 4;
        }
        return z;
    }

    @Override // defpackage.blb
    public final boolean k() {
        boolean z;
        synchronized (this.b) {
            z = this.w == 6;
        }
        return z;
    }

    @Override // defpackage.blb
    public final boolean l() {
        boolean z;
        synchronized (this.b) {
            z = this.w == 4;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r10 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r5.equals(r11) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r6 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        if (r12 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r7 != r13) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r14 != r15) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r6.C(r12) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0056, code lost:
    
        if ((r4 instanceof defpackage.bgb ? ((defpackage.bgb) r4).a() : r4.equals(r10)) != false) goto L30;
     */
    @Override // defpackage.blb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(blb blbVar) {
        int i;
        int i2;
        Object obj;
        int i3;
        int i4;
        if (!(blbVar instanceof blg)) {
            return false;
        }
        synchronized (this.b) {
            i = this.h;
            i2 = this.i;
            obj = this.e;
            Class cls = this.f;
            bky bkyVar = this.g;
            azw azwVar = this.j;
            List list = this.l;
            int size = list != null ? list.size() : 0;
        }
        blg blgVar = (blg) blbVar;
        synchronized (blgVar.b) {
            i3 = blgVar.h;
            i4 = blgVar.i;
            Object obj2 = blgVar.e;
            Class cls2 = blgVar.f;
            bky bkyVar2 = blgVar.g;
            azw azwVar2 = blgVar.j;
            List list2 = blgVar.l;
            int size2 = list2 != null ? list2.size() : 0;
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = bmi.a;
            if (obj == null) {
            }
        }
        return false;
    }

    @Override // defpackage.blb
    public final boolean n() {
        boolean z;
        synchronized (this.b) {
            int i = this.w;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.b) {
            obj = this.e;
            cls = this.f;
        }
        return super.toString() + "[model=" + String.valueOf(obj) + ", transcodeClass=" + cls.toString() + "]";
    }
}
