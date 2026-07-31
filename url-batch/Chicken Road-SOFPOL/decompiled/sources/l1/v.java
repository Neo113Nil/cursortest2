package l1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import m0.h1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v extends t {

    /* renamed from: b, reason: collision with root package name */
    public final b f4812b;

    /* renamed from: c, reason: collision with root package name */
    public String f4813c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4814d;

    /* renamed from: e, reason: collision with root package name */
    public final a f4815e;

    /* renamed from: f, reason: collision with root package name */
    public q6.j f4816f;

    /* renamed from: g, reason: collision with root package name */
    public final h1 f4817g;

    /* renamed from: h, reason: collision with root package name */
    public f1.m f4818h;
    public final h1 i;

    /* renamed from: j, reason: collision with root package name */
    public long f4819j;

    /* renamed from: k, reason: collision with root package name */
    public float f4820k;

    /* renamed from: l, reason: collision with root package name */
    public float f4821l;

    /* renamed from: m, reason: collision with root package name */
    public final u f4822m;

    public v(b bVar) {
        this.f4812b = bVar;
        bVar.i = new u(this, 0);
        this.f4813c = "";
        this.f4814d = true;
        this.f4815e = new a();
        this.f4816f = f.f4769g;
        this.f4817g = m0.b.q(null);
        this.i = m0.b.q(new e1.e(0L));
        this.f4819j = 9205357640488583168L;
        this.f4820k = 1.0f;
        this.f4821l = 1.0f;
        this.f4822m = new u(this, 1);
    }

    @Override // l1.t
    public final void a(h1.d dVar) {
        e(dVar, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r3 != (r8 == null ? r8.a() : 0)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0101, code lost:
    
        if (r9.f4722d == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(h1.d dVar, float f6, f1.m mVar) {
        int i;
        boolean z3;
        a aVar;
        f1.m mVar2;
        f1.g gVar;
        long j7;
        f1.g gVar2;
        int i8;
        int i9;
        f1.m mVar3 = mVar;
        b bVar = this.f4812b;
        boolean z7 = bVar.f4735d;
        h1 h1Var = this.f4817g;
        if (z7 && bVar.f4736e != 16) {
            f1.m mVar4 = (f1.m) h1Var.getValue();
            int i10 = y.f4827a;
            if (mVar4 == null ? mVar4 == null : !((i9 = mVar4.f2688c) != 5 && i9 != 3)) {
                if (mVar3 == null ? mVar3 == null : !((i8 = mVar3.f2688c) != 5 && i8 != 3)) {
                    i = 1;
                    z3 = this.f4814d;
                    aVar = this.f4815e;
                    if (!z3 && e1.e.a(this.f4819j, dVar.c())) {
                        f1.g gVar3 = aVar.f4719a;
                    }
                    if (i != 1) {
                        long j8 = bVar.f4736e;
                        int i11 = y.f4827a;
                        if (f1.s.d(j8) != 1.0f) {
                            j8 = f1.s.b(j8, 1.0f);
                        }
                        mVar2 = new f1.m(5, j8);
                    } else {
                        mVar2 = null;
                    }
                    this.f4818h = mVar2;
                    float intBitsToFloat = Float.intBitsToFloat((int) (dVar.c() >> 32));
                    h1 h1Var2 = this.i;
                    this.f4820k = intBitsToFloat / Float.intBitsToFloat((int) (((e1.e) h1Var2.getValue()).f2469a >> 32));
                    this.f4821l = Float.intBitsToFloat((int) (dVar.c() & 4294967295L)) / Float.intBitsToFloat((int) (((e1.e) h1Var2.getValue()).f2469a & 4294967295L));
                    long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (dVar.c() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (dVar.c() & 4294967295L)))) & 4294967295L);
                    r2.l layoutDirection = dVar.getLayoutDirection();
                    gVar = aVar.f4719a;
                    f1.b bVar2 = aVar.f4720b;
                    if (gVar != null) {
                        Bitmap bitmap = gVar.f2643a;
                        if (bVar2 != null) {
                            j7 = 4294967295L;
                            if (((int) (ceil >> 32)) <= bitmap.getWidth()) {
                                if (((int) (ceil & 4294967295L)) <= bitmap.getHeight()) {
                                }
                            }
                            gVar = f1.p.e((int) (ceil >> 32), (int) (ceil & j7), i);
                            Canvas canvas = f1.c.f2629a;
                            bVar2 = new f1.b();
                            bVar2.f2622a = new Canvas(gVar.f2643a);
                            aVar.f4719a = gVar;
                            aVar.f4720b = bVar2;
                            aVar.f4722d = i;
                            aVar.f4721c = ceil;
                            h1.b bVar3 = aVar.f4723e;
                            long R = m.a.R(ceil);
                            h1.a aVar2 = bVar3.f3074d;
                            r2.c cVar = aVar2.f3070a;
                            r2.l lVar = aVar2.f3071b;
                            f1.q qVar = aVar2.f3072c;
                            f1.b bVar4 = bVar2;
                            long j9 = aVar2.f3073d;
                            aVar2.f3070a = dVar;
                            aVar2.f3071b = layoutDirection;
                            aVar2.f3072c = bVar4;
                            aVar2.f3073d = R;
                            bVar4.h();
                            h1.d.r(bVar3, f1.s.f2698b, 0L, 0L, 62);
                            this.f4822m.i(bVar3);
                            bVar4.f();
                            h1.a aVar3 = bVar3.f3074d;
                            aVar3.f3070a = cVar;
                            aVar3.f3071b = lVar;
                            aVar3.f3072c = qVar;
                            aVar3.f3073d = j9;
                            gVar.f2643a.prepareToDraw();
                            this.f4814d = false;
                            this.f4819j = dVar.c();
                            if (mVar3 == null) {
                                mVar3 = ((f1.m) h1Var.getValue()) != null ? (f1.m) h1Var.getValue() : this.f4818h;
                            }
                            f1.m mVar5 = mVar3;
                            gVar2 = aVar.f4719a;
                            if (gVar2 == null) {
                                t1.a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                            }
                            h1.d.x(dVar, gVar2, aVar.f4721c, f6, mVar5, 858);
                        }
                    }
                    j7 = 4294967295L;
                    gVar = f1.p.e((int) (ceil >> 32), (int) (ceil & j7), i);
                    Canvas canvas2 = f1.c.f2629a;
                    bVar2 = new f1.b();
                    bVar2.f2622a = new Canvas(gVar.f2643a);
                    aVar.f4719a = gVar;
                    aVar.f4720b = bVar2;
                    aVar.f4722d = i;
                    aVar.f4721c = ceil;
                    h1.b bVar32 = aVar.f4723e;
                    long R2 = m.a.R(ceil);
                    h1.a aVar22 = bVar32.f3074d;
                    r2.c cVar2 = aVar22.f3070a;
                    r2.l lVar2 = aVar22.f3071b;
                    f1.q qVar2 = aVar22.f3072c;
                    f1.b bVar42 = bVar2;
                    long j92 = aVar22.f3073d;
                    aVar22.f3070a = dVar;
                    aVar22.f3071b = layoutDirection;
                    aVar22.f3072c = bVar42;
                    aVar22.f3073d = R2;
                    bVar42.h();
                    h1.d.r(bVar32, f1.s.f2698b, 0L, 0L, 62);
                    this.f4822m.i(bVar32);
                    bVar42.f();
                    h1.a aVar32 = bVar32.f3074d;
                    aVar32.f3070a = cVar2;
                    aVar32.f3071b = lVar2;
                    aVar32.f3072c = qVar2;
                    aVar32.f3073d = j92;
                    gVar.f2643a.prepareToDraw();
                    this.f4814d = false;
                    this.f4819j = dVar.c();
                    if (mVar3 == null) {
                    }
                    f1.m mVar52 = mVar3;
                    gVar2 = aVar.f4719a;
                    if (gVar2 == null) {
                    }
                    h1.d.x(dVar, gVar2, aVar.f4721c, f6, mVar52, 858);
                }
            }
        }
        i = 0;
        z3 = this.f4814d;
        aVar = this.f4815e;
        if (!z3) {
            f1.g gVar32 = aVar.f4719a;
        }
        if (i != 1) {
        }
        this.f4818h = mVar2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.c() >> 32));
        h1 h1Var22 = this.i;
        this.f4820k = intBitsToFloat2 / Float.intBitsToFloat((int) (((e1.e) h1Var22.getValue()).f2469a >> 32));
        this.f4821l = Float.intBitsToFloat((int) (dVar.c() & 4294967295L)) / Float.intBitsToFloat((int) (((e1.e) h1Var22.getValue()).f2469a & 4294967295L));
        long ceil2 = (((int) Math.ceil(Float.intBitsToFloat((int) (dVar.c() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (dVar.c() & 4294967295L)))) & 4294967295L);
        r2.l layoutDirection2 = dVar.getLayoutDirection();
        gVar = aVar.f4719a;
        f1.b bVar22 = aVar.f4720b;
        if (gVar != null) {
        }
        j7 = 4294967295L;
        gVar = f1.p.e((int) (ceil2 >> 32), (int) (ceil2 & j7), i);
        Canvas canvas22 = f1.c.f2629a;
        bVar22 = new f1.b();
        bVar22.f2622a = new Canvas(gVar.f2643a);
        aVar.f4719a = gVar;
        aVar.f4720b = bVar22;
        aVar.f4722d = i;
        aVar.f4721c = ceil2;
        h1.b bVar322 = aVar.f4723e;
        long R22 = m.a.R(ceil2);
        h1.a aVar222 = bVar322.f3074d;
        r2.c cVar22 = aVar222.f3070a;
        r2.l lVar22 = aVar222.f3071b;
        f1.q qVar22 = aVar222.f3072c;
        f1.b bVar422 = bVar22;
        long j922 = aVar222.f3073d;
        aVar222.f3070a = dVar;
        aVar222.f3071b = layoutDirection2;
        aVar222.f3072c = bVar422;
        aVar222.f3073d = R22;
        bVar422.h();
        h1.d.r(bVar322, f1.s.f2698b, 0L, 0L, 62);
        this.f4822m.i(bVar322);
        bVar422.f();
        h1.a aVar322 = bVar322.f3074d;
        aVar322.f3070a = cVar22;
        aVar322.f3071b = lVar22;
        aVar322.f3072c = qVar22;
        aVar322.f3073d = j922;
        gVar.f2643a.prepareToDraw();
        this.f4814d = false;
        this.f4819j = dVar.c();
        if (mVar3 == null) {
        }
        f1.m mVar522 = mVar3;
        gVar2 = aVar.f4719a;
        if (gVar2 == null) {
        }
        h1.d.x(dVar, gVar2, aVar.f4721c, f6, mVar522, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f4813c);
        sb.append("\n\tviewportWidth: ");
        h1 h1Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((e1.e) h1Var.getValue()).f2469a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((e1.e) h1Var.getValue()).f2469a & 4294967295L)));
        sb.append("\n");
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }
}
