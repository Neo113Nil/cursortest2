package f1;

import android.graphics.Bitmap;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import g0.g1;
import g0.t0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f0 extends d0 {

    /* renamed from: b, reason: collision with root package name */
    public final c f3141b;

    /* renamed from: c, reason: collision with root package name */
    public String f3142c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3143d;

    /* renamed from: e, reason: collision with root package name */
    public final a f3144e;

    /* renamed from: f, reason: collision with root package name */
    public r6.l f3145f;

    /* renamed from: g, reason: collision with root package name */
    public final g1 f3146g;

    /* renamed from: h, reason: collision with root package name */
    public z0.m f3147h;

    /* renamed from: i, reason: collision with root package name */
    public final g1 f3148i;

    /* renamed from: j, reason: collision with root package name */
    public long f3149j;

    /* renamed from: k, reason: collision with root package name */
    public float f3150k;

    /* renamed from: l, reason: collision with root package name */
    public float f3151l;

    /* renamed from: m, reason: collision with root package name */
    public final e0 f3152m;

    public f0(c cVar) {
        this.f3141b = cVar;
        cVar.f3092i = new e0(this, 0);
        this.f3142c = "";
        this.f3143d = true;
        this.f3144e = new a();
        this.f3145f = h.f3157i;
        t0 t0Var = t0.f3903k;
        this.f3146g = g0.d.J(null, t0Var);
        this.f3148i = g0.d.J(new y0.f(0L), t0Var);
        this.f3149j = 9205357640488583168L;
        this.f3150k = 1.0f;
        this.f3151l = 1.0f;
        this.f3152m = new e0(this, 1);
    }

    @Override // f1.d0
    public final void a(b1.e eVar) {
        e(eVar, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0100, code lost:
    
        if (r10.f3079d == r3) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(b1.e eVar, float f9, z0.m mVar) {
        int i7;
        boolean z8;
        a aVar;
        z0.m mVar2;
        z0.h hVar;
        Throwable th;
        char c4;
        long j8;
        b1.e eVar2;
        z0.m mVar3;
        z0.h hVar2;
        z0.h hVar3;
        int i8;
        int i9;
        c cVar = this.f3141b;
        boolean z9 = cVar.f3087d;
        g1 g1Var = this.f3146g;
        if (z9 && cVar.f3088e != 16) {
            z0.m mVar4 = (z0.m) g1Var.getValue();
            int i10 = i0.f3188a;
            if (mVar4 == null ? mVar4 == null : !((i9 = mVar4.f10012c) != 5 && i9 != 3)) {
                if (mVar == null ? mVar == null : !((i8 = mVar.f10012c) != 5 && i8 != 3)) {
                    i7 = 1;
                    z8 = this.f3143d;
                    aVar = this.f3144e;
                    if (!z8 && y0.f.a(this.f3149j, eVar.d())) {
                        hVar3 = aVar.f3076a;
                        if (i7 == (hVar3 == null ? hVar3.a() : 0)) {
                            eVar2 = eVar;
                            th = null;
                            if (mVar != null) {
                                mVar3 = mVar;
                            } else {
                                mVar3 = ((z0.m) g1Var.getValue()) != null ? (z0.m) g1Var.getValue() : this.f3147h;
                            }
                            hVar2 = aVar.f3076a;
                            if (hVar2 != null) {
                                b1.e.c0(eVar2, hVar2, aVar.f3078c, 0L, f9, mVar3, 0, 858);
                                return;
                            } else {
                                a.a.M("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                                throw th;
                            }
                        }
                    }
                    if (i7 != 1) {
                        long j9 = cVar.f3088e;
                        mVar2 = new z0.m(j9, 5, Build.VERSION.SDK_INT >= 29 ? z0.n.f10013a.a(j9, 5) : new PorterDuffColorFilter(z0.l0.w(j9), z0.l0.z(5)));
                    } else {
                        mVar2 = null;
                    }
                    this.f3147h = mVar2;
                    float d8 = y0.f.d(eVar.d());
                    g1 g1Var2 = this.f3148i;
                    this.f3150k = d8 / y0.f.d(((y0.f) g1Var2.getValue()).f9792a);
                    this.f3151l = y0.f.b(eVar.d()) / y0.f.b(((y0.f) g1Var2.getValue()).f9792a);
                    long G = j1.c.G((int) Math.ceil(y0.f.d(eVar.d())), (int) Math.ceil(y0.f.b(eVar.d())));
                    m2.k layoutDirection = eVar.getLayoutDirection();
                    hVar = aVar.f3076a;
                    z0.d dVar = aVar.f3077b;
                    if (hVar != null || dVar == null) {
                        th = null;
                        c4 = ' ';
                        j8 = 4294967295L;
                    } else {
                        th = null;
                        c4 = ' ';
                        int i11 = (int) (G >> 32);
                        Bitmap bitmap = hVar.f9996a;
                        j8 = 4294967295L;
                        if (i11 <= bitmap.getWidth()) {
                            if (((int) (G & 4294967295L)) <= bitmap.getHeight()) {
                            }
                        }
                    }
                    hVar = z0.l0.f((int) (G >> c4), (int) (G & j8), i7);
                    dVar = z0.l0.a(hVar);
                    aVar.f3076a = hVar;
                    aVar.f3077b = dVar;
                    aVar.f3079d = i7;
                    aVar.f3078c = G;
                    b1.c cVar2 = aVar.f3080e;
                    long o02 = j1.c.o0(G);
                    b1.a aVar2 = cVar2.f1233f;
                    m2.b bVar = aVar2.f1225a;
                    m2.k kVar = aVar2.f1226b;
                    z0.r rVar = aVar2.f1227c;
                    long j10 = aVar2.f1228d;
                    eVar2 = eVar;
                    aVar2.f1225a = eVar2;
                    aVar2.f1226b = layoutDirection;
                    aVar2.f1227c = dVar;
                    aVar2.f1228d = o02;
                    dVar.o();
                    b1.e.t(cVar2, z0.u.f10052b, 0L, 0L, 62);
                    this.f3152m.f(cVar2);
                    dVar.n();
                    b1.a aVar3 = cVar2.f1233f;
                    aVar3.f1225a = bVar;
                    aVar3.f1226b = kVar;
                    aVar3.f1227c = rVar;
                    aVar3.f1228d = j10;
                    hVar.f9996a.prepareToDraw();
                    this.f3143d = false;
                    this.f3149j = eVar2.d();
                    if (mVar != null) {
                    }
                    hVar2 = aVar.f3076a;
                    if (hVar2 != null) {
                    }
                }
            }
        }
        i7 = 0;
        z8 = this.f3143d;
        aVar = this.f3144e;
        if (!z8) {
            hVar3 = aVar.f3076a;
            if (i7 == (hVar3 == null ? hVar3.a() : 0)) {
            }
        }
        if (i7 != 1) {
        }
        this.f3147h = mVar2;
        float d82 = y0.f.d(eVar.d());
        g1 g1Var22 = this.f3148i;
        this.f3150k = d82 / y0.f.d(((y0.f) g1Var22.getValue()).f9792a);
        this.f3151l = y0.f.b(eVar.d()) / y0.f.b(((y0.f) g1Var22.getValue()).f9792a);
        long G2 = j1.c.G((int) Math.ceil(y0.f.d(eVar.d())), (int) Math.ceil(y0.f.b(eVar.d())));
        m2.k layoutDirection2 = eVar.getLayoutDirection();
        hVar = aVar.f3076a;
        z0.d dVar2 = aVar.f3077b;
        if (hVar != null) {
        }
        th = null;
        c4 = ' ';
        j8 = 4294967295L;
        hVar = z0.l0.f((int) (G2 >> c4), (int) (G2 & j8), i7);
        dVar2 = z0.l0.a(hVar);
        aVar.f3076a = hVar;
        aVar.f3077b = dVar2;
        aVar.f3079d = i7;
        aVar.f3078c = G2;
        b1.c cVar22 = aVar.f3080e;
        long o022 = j1.c.o0(G2);
        b1.a aVar22 = cVar22.f1233f;
        m2.b bVar2 = aVar22.f1225a;
        m2.k kVar2 = aVar22.f1226b;
        z0.r rVar2 = aVar22.f1227c;
        long j102 = aVar22.f1228d;
        eVar2 = eVar;
        aVar22.f1225a = eVar2;
        aVar22.f1226b = layoutDirection2;
        aVar22.f1227c = dVar2;
        aVar22.f1228d = o022;
        dVar2.o();
        b1.e.t(cVar22, z0.u.f10052b, 0L, 0L, 62);
        this.f3152m.f(cVar22);
        dVar2.n();
        b1.a aVar32 = cVar22.f1233f;
        aVar32.f1225a = bVar2;
        aVar32.f1226b = kVar2;
        aVar32.f1227c = rVar2;
        aVar32.f1228d = j102;
        hVar.f9996a.prepareToDraw();
        this.f3143d = false;
        this.f3149j = eVar2.d();
        if (mVar != null) {
        }
        hVar2 = aVar.f3076a;
        if (hVar2 != null) {
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f3142c);
        sb.append("\n\tviewportWidth: ");
        g1 g1Var = this.f3148i;
        sb.append(y0.f.d(((y0.f) g1Var.getValue()).f9792a));
        sb.append("\n\tviewportHeight: ");
        sb.append(y0.f.b(((y0.f) g1Var.getValue()).f9792a));
        sb.append("\n");
        String sb2 = sb.toString();
        r6.k.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
