package q1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.util.DisplayMetrics;
import n0.j1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e0 extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public final c f7836b;

    /* renamed from: c, reason: collision with root package name */
    public String f7837c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7838d;

    /* renamed from: e, reason: collision with root package name */
    public final a f7839e;

    /* renamed from: f, reason: collision with root package name */
    public wd.p f7840f;
    public final j1 g;

    /* renamed from: h, reason: collision with root package name */
    public k1.j f7841h;

    /* renamed from: i, reason: collision with root package name */
    public final j1 f7842i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public float f7843k;

    /* renamed from: l, reason: collision with root package name */
    public float f7844l;

    /* renamed from: m, reason: collision with root package name */
    public final d0 f7845m;

    public e0(c cVar) {
        this.f7836b = cVar;
        cVar.f7806i = new d0(this, 0);
        this.f7837c = "";
        this.f7838d = true;
        this.f7839e = new a();
        this.f7840f = g.f7867i;
        this.g = n0.h.r(null);
        this.f7842i = n0.h.r(new j1.e(0L));
        this.j = 9205357640488583168L;
        this.f7843k = 1.0f;
        this.f7844l = 1.0f;
        this.f7845m = new d0(this, 1);
    }

    @Override // q1.c0
    public final void a(m1.d dVar) {
        e(dVar, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0078, code lost:
    
        if (r9 == r13) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0138, code lost:
    
        if (r11.f7793d == r3) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(m1.d dVar, float f3, k1.j jVar) {
        int i3;
        boolean z10;
        a aVar;
        k1.j jVar2;
        k1.e eVar;
        char c10;
        x2.l lVar;
        Bitmap createBitmap;
        m1.d dVar2;
        k1.j jVar3;
        k1.e eVar2;
        k1.e eVar3;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i10;
        int i11;
        c cVar = this.f7836b;
        boolean z11 = cVar.f7802d;
        int i12 = 3;
        j1 j1Var = this.g;
        if (z11 && cVar.f7803e != 16) {
            k1.j jVar4 = (k1.j) j1Var.getValue();
            kotlin.collections.j0 j0Var = g0.f7869a;
            if (!(jVar4 instanceof k1.j) ? jVar4 == null : !((i11 = jVar4.f5331c) != 5 && i11 != 3)) {
                if (!(jVar instanceof k1.j) ? jVar == null : !((i10 = jVar.f5331c) != 5 && i10 != 3)) {
                    i3 = 1;
                    z10 = this.f7838d;
                    aVar = this.f7839e;
                    if (!z10 && j1.e.a(this.j, dVar.u())) {
                        eVar3 = aVar.f7790a;
                        if (eVar3 != null) {
                            Bitmap.Config config3 = eVar3.f5314a.getConfig();
                            config3.getClass();
                            if (config3 == Bitmap.Config.ALPHA_8) {
                                i12 = 1;
                            } else if (config3 == Bitmap.Config.RGB_565) {
                                i12 = 2;
                            } else if (config3 != Bitmap.Config.ARGB_4444) {
                                int i13 = Build.VERSION.SDK_INT;
                                if (i13 >= 26) {
                                    config2 = Bitmap.Config.RGBA_F16;
                                }
                                if (i13 >= 26) {
                                    config = Bitmap.Config.HARDWARE;
                                    if (config3 == config) {
                                        i12 = 4;
                                    }
                                }
                            }
                            if (i3 == i12) {
                                dVar2 = dVar;
                                if (jVar == null) {
                                    jVar3 = jVar;
                                } else {
                                    jVar3 = ((k1.j) j1Var.getValue()) != null ? (k1.j) j1Var.getValue() : this.f7841h;
                                }
                                eVar2 = aVar.f7790a;
                                if (eVar2 == null) {
                                    z1.a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                                }
                                m1.d.U(dVar2, eVar2, aVar.f7792c, 0L, f3, jVar3, 0, 858);
                            }
                        }
                        i12 = 0;
                        if (i3 == i12) {
                        }
                    }
                    if (i3 != 1) {
                        long j = cVar.f7803e;
                        kotlin.collections.j0 j0Var2 = g0.f7869a;
                        if (k1.p.d(j) != 1.0f) {
                            j = k1.p.b(j, 1.0f);
                        }
                        jVar2 = new k1.j(5, j);
                    } else {
                        jVar2 = null;
                    }
                    this.f7841h = jVar2;
                    float intBitsToFloat = Float.intBitsToFloat((int) (dVar.u() >> 32));
                    j1 j1Var2 = this.f7842i;
                    this.f7843k = intBitsToFloat / Float.intBitsToFloat((int) (((j1.e) j1Var2.getValue()).f4927a >> 32));
                    this.f7844l = Float.intBitsToFloat((int) (dVar.u() & 4294967295L)) / Float.intBitsToFloat((int) (((j1.e) j1Var2.getValue()).f4927a & 4294967295L));
                    long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (dVar.u() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (dVar.u() & 4294967295L)))) & 4294967295L);
                    x2.l layoutDirection = dVar.getLayoutDirection();
                    eVar = aVar.f7790a;
                    k1.b bVar = aVar.f7791b;
                    if (eVar != null || bVar == null) {
                        c10 = ' ';
                    } else {
                        int i14 = (int) (ceil >> 32);
                        Bitmap bitmap = eVar.f5314a;
                        c10 = ' ';
                        if (i14 <= bitmap.getWidth()) {
                            lVar = layoutDirection;
                            if (((int) (ceil & 4294967295L)) <= bitmap.getHeight()) {
                            }
                            int i15 = (int) (ceil >> c10);
                            int i16 = (int) (ceil & 4294967295L);
                            l1.q qVar = l1.d.f5762e;
                            Bitmap.Config s3 = k1.v.s(i3);
                            if (Build.VERSION.SDK_INT >= 26) {
                                createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i15, i16, k1.v.s(i3), true, k1.r.a(qVar));
                            } else {
                                createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i15, i16, s3);
                                createBitmap.setHasAlpha(true);
                            }
                            eVar = new k1.e(createBitmap);
                            Canvas canvas = k1.c.f5301a;
                            bVar = new k1.b();
                            bVar.f5296a = new Canvas(createBitmap);
                            aVar.f7790a = eVar;
                            aVar.f7791b = bVar;
                            aVar.f7793d = i3;
                            aVar.f7792c = ceil;
                            m1.b bVar2 = aVar.f7794e;
                            long b10 = z4.m.b(ceil);
                            m1.a aVar2 = bVar2.f6405d;
                            x2.c cVar2 = aVar2.f6401a;
                            x2.l lVar2 = aVar2.f6402b;
                            k1.n nVar = aVar2.f6403c;
                            long j3 = aVar2.f6404d;
                            dVar2 = dVar;
                            aVar2.f6401a = dVar2;
                            aVar2.f6402b = lVar;
                            aVar2.f6403c = bVar;
                            aVar2.f6404d = b10;
                            bVar.h();
                            m1.d.r(bVar2, k1.p.f5336b, 0L, 62);
                            this.f7845m.invoke(bVar2);
                            bVar.f();
                            m1.a aVar3 = bVar2.f6405d;
                            aVar3.f6401a = cVar2;
                            aVar3.f6402b = lVar2;
                            aVar3.f6403c = nVar;
                            aVar3.f6404d = j3;
                            eVar.f5314a.prepareToDraw();
                            this.f7838d = false;
                            this.j = dVar2.u();
                            if (jVar == null) {
                            }
                            eVar2 = aVar.f7790a;
                            if (eVar2 == null) {
                            }
                            m1.d.U(dVar2, eVar2, aVar.f7792c, 0L, f3, jVar3, 0, 858);
                        }
                    }
                    lVar = layoutDirection;
                    int i152 = (int) (ceil >> c10);
                    int i162 = (int) (ceil & 4294967295L);
                    l1.q qVar2 = l1.d.f5762e;
                    Bitmap.Config s32 = k1.v.s(i3);
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    eVar = new k1.e(createBitmap);
                    Canvas canvas2 = k1.c.f5301a;
                    bVar = new k1.b();
                    bVar.f5296a = new Canvas(createBitmap);
                    aVar.f7790a = eVar;
                    aVar.f7791b = bVar;
                    aVar.f7793d = i3;
                    aVar.f7792c = ceil;
                    m1.b bVar22 = aVar.f7794e;
                    long b102 = z4.m.b(ceil);
                    m1.a aVar22 = bVar22.f6405d;
                    x2.c cVar22 = aVar22.f6401a;
                    x2.l lVar22 = aVar22.f6402b;
                    k1.n nVar2 = aVar22.f6403c;
                    long j32 = aVar22.f6404d;
                    dVar2 = dVar;
                    aVar22.f6401a = dVar2;
                    aVar22.f6402b = lVar;
                    aVar22.f6403c = bVar;
                    aVar22.f6404d = b102;
                    bVar.h();
                    m1.d.r(bVar22, k1.p.f5336b, 0L, 62);
                    this.f7845m.invoke(bVar22);
                    bVar.f();
                    m1.a aVar32 = bVar22.f6405d;
                    aVar32.f6401a = cVar22;
                    aVar32.f6402b = lVar22;
                    aVar32.f6403c = nVar2;
                    aVar32.f6404d = j32;
                    eVar.f5314a.prepareToDraw();
                    this.f7838d = false;
                    this.j = dVar2.u();
                    if (jVar == null) {
                    }
                    eVar2 = aVar.f7790a;
                    if (eVar2 == null) {
                    }
                    m1.d.U(dVar2, eVar2, aVar.f7792c, 0L, f3, jVar3, 0, 858);
                }
            }
        }
        i3 = 0;
        z10 = this.f7838d;
        aVar = this.f7839e;
        if (!z10) {
            eVar3 = aVar.f7790a;
            if (eVar3 != null) {
            }
            i12 = 0;
            if (i3 == i12) {
            }
        }
        if (i3 != 1) {
        }
        this.f7841h = jVar2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.u() >> 32));
        j1 j1Var22 = this.f7842i;
        this.f7843k = intBitsToFloat2 / Float.intBitsToFloat((int) (((j1.e) j1Var22.getValue()).f4927a >> 32));
        this.f7844l = Float.intBitsToFloat((int) (dVar.u() & 4294967295L)) / Float.intBitsToFloat((int) (((j1.e) j1Var22.getValue()).f4927a & 4294967295L));
        long ceil2 = (((int) Math.ceil(Float.intBitsToFloat((int) (dVar.u() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (dVar.u() & 4294967295L)))) & 4294967295L);
        x2.l layoutDirection2 = dVar.getLayoutDirection();
        eVar = aVar.f7790a;
        k1.b bVar3 = aVar.f7791b;
        if (eVar != null) {
        }
        c10 = ' ';
        lVar = layoutDirection2;
        int i1522 = (int) (ceil2 >> c10);
        int i1622 = (int) (ceil2 & 4294967295L);
        l1.q qVar22 = l1.d.f5762e;
        Bitmap.Config s322 = k1.v.s(i3);
        if (Build.VERSION.SDK_INT >= 26) {
        }
        eVar = new k1.e(createBitmap);
        Canvas canvas22 = k1.c.f5301a;
        bVar3 = new k1.b();
        bVar3.f5296a = new Canvas(createBitmap);
        aVar.f7790a = eVar;
        aVar.f7791b = bVar3;
        aVar.f7793d = i3;
        aVar.f7792c = ceil2;
        m1.b bVar222 = aVar.f7794e;
        long b1022 = z4.m.b(ceil2);
        m1.a aVar222 = bVar222.f6405d;
        x2.c cVar222 = aVar222.f6401a;
        x2.l lVar222 = aVar222.f6402b;
        k1.n nVar22 = aVar222.f6403c;
        long j322 = aVar222.f6404d;
        dVar2 = dVar;
        aVar222.f6401a = dVar2;
        aVar222.f6402b = lVar;
        aVar222.f6403c = bVar3;
        aVar222.f6404d = b1022;
        bVar3.h();
        m1.d.r(bVar222, k1.p.f5336b, 0L, 62);
        this.f7845m.invoke(bVar222);
        bVar3.f();
        m1.a aVar322 = bVar222.f6405d;
        aVar322.f6401a = cVar222;
        aVar322.f6402b = lVar222;
        aVar322.f6403c = nVar22;
        aVar322.f6404d = j322;
        eVar.f5314a.prepareToDraw();
        this.f7838d = false;
        this.j = dVar2.u();
        if (jVar == null) {
        }
        eVar2 = aVar.f7790a;
        if (eVar2 == null) {
        }
        m1.d.U(dVar2, eVar2, aVar.f7792c, 0L, f3, jVar3, 0, 858);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Params: \tname: ");
        sb2.append(this.f7837c);
        sb2.append("\n\tviewportWidth: ");
        j1 j1Var = this.f7842i;
        sb2.append(Float.intBitsToFloat((int) (((j1.e) j1Var.getValue()).f4927a >> 32)));
        sb2.append("\n\tviewportHeight: ");
        sb2.append(Float.intBitsToFloat((int) (((j1.e) j1Var.getValue()).f4927a & 4294967295L)));
        sb2.append("\n");
        return sb2.toString();
    }
}
