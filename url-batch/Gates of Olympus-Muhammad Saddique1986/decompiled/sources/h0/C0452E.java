package h0;

import I.C0143d;
import I.C0156j0;
import I.W;
import a0.C0241f;
import android.graphics.Bitmap;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import b0.C0334c;
import b0.C0338g;
import b0.C0344m;
import b0.C0345n;
import b0.C0352v;
import b0.M;
import d0.C0400a;
import d0.C0401b;
import d0.C0406g;
import d0.InterfaceC0403d;
import n.z0;

/* renamed from: h0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0452E extends AbstractC0450C {

    /* renamed from: b, reason: collision with root package name */
    public final C0460c f5859b;

    /* renamed from: c, reason: collision with root package name */
    public String f5860c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5861d;

    /* renamed from: e, reason: collision with root package name */
    public final C0458a f5862e;

    /* renamed from: f, reason: collision with root package name */
    public f2.k f5863f;

    /* renamed from: g, reason: collision with root package name */
    public final C0156j0 f5864g;

    /* renamed from: h, reason: collision with root package name */
    public C0344m f5865h;

    /* renamed from: i, reason: collision with root package name */
    public final C0156j0 f5866i;

    /* renamed from: j, reason: collision with root package name */
    public long f5867j;

    /* renamed from: k, reason: collision with root package name */
    public float f5868k;

    /* renamed from: l, reason: collision with root package name */
    public float f5869l;

    /* renamed from: m, reason: collision with root package name */
    public final C0451D f5870m;

    public C0452E(C0460c c0460c) {
        this.f5859b = c0460c;
        c0460c.f5917i = new C0451D(this, 0);
        this.f5860c = "";
        this.f5861d = true;
        this.f5862e = new C0458a();
        this.f5863f = C0464g.f5962g;
        W w2 = W.f2783i;
        this.f5864g = C0143d.K(null, w2);
        this.f5866i = C0143d.K(new C0241f(0L), w2);
        this.f5867j = 9205357640488583168L;
        this.f5868k = 1.0f;
        this.f5869l = 1.0f;
        this.f5870m = new C0451D(this, 1);
    }

    @Override // h0.AbstractC0450C
    public final void a(InterfaceC0403d interfaceC0403d) {
        e(interfaceC0403d, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (b0.M.p(r3, 3) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (b0.M.p(r3, 3) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0043, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0030, code lost:
    
        if (r3 == null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(InterfaceC0403d interfaceC0403d, float f3, C0344m c0344m) {
        int i3;
        boolean z3;
        C0458a c0458a;
        C0344m c0344m2;
        C0338g c0338g;
        C0458a c0458a2;
        char c2;
        C0334c c0334c;
        C0458a c0458a3;
        C0338g c0338g2;
        C0338g c0338g3;
        C0344m c0344m3 = c0344m;
        C0460c c0460c = this.f5859b;
        boolean z4 = c0460c.f5912d;
        C0156j0 c0156j0 = this.f5864g;
        if (z4 && c0460c.f5913e != 16) {
            C0344m c0344m4 = (C0344m) c0156j0.getValue();
            int i4 = AbstractC0454G.f5881a;
            if (c0344m4 != null) {
                int i5 = c0344m4.f5426c;
                if (!M.p(i5, 5)) {
                }
                if (c0344m3 != null) {
                    int i6 = c0344m3.f5426c;
                    if (!M.p(i6, 5)) {
                    }
                    i3 = 1;
                }
            }
            z3 = this.f5861d;
            c0458a = this.f5862e;
            if (!z3 && C0241f.a(this.f5867j, interfaceC0403d.d())) {
                c0338g3 = c0458a.f5903a;
                if (b0.F.a(i3, c0338g3 == null ? c0338g3.a() : 0)) {
                    c0458a3 = c0458a;
                    if (c0344m3 == null) {
                        c0344m3 = ((C0344m) c0156j0.getValue()) != null ? (C0344m) c0156j0.getValue() : this.f5865h;
                    }
                    C0344m c0344m5 = c0344m3;
                    C0458a c0458a4 = c0458a3;
                    c0338g2 = c0458a4.f5903a;
                    if (c0338g2 != null) {
                        InterfaceC0403d.p(interfaceC0403d, c0338g2, 0L, c0458a4.f5905c, 0L, f3, c0344m5, 0, 858);
                        return;
                    } else {
                        z0.o("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                        throw null;
                    }
                }
            }
            if (b0.F.a(i3, 1)) {
                c0344m2 = null;
            } else {
                long j3 = c0460c.f5913e;
                c0344m2 = new C0344m(j3, 5, Build.VERSION.SDK_INT >= 29 ? C0345n.f5427a.a(j3, 5) : new PorterDuffColorFilter(M.D(j3), M.G(5)));
            }
            this.f5865h = c0344m2;
            float d3 = C0241f.d(interfaceC0403d.d());
            C0156j0 c0156j02 = this.f5866i;
            this.f5868k = d3 / C0241f.d(((C0241f) c0156j02.getValue()).f4736a);
            this.f5869l = C0241f.b(interfaceC0403d.d()) / C0241f.b(((C0241f) c0156j02.getValue()).f4736a);
            long d4 = O2.d.d((int) Math.ceil(C0241f.d(interfaceC0403d.d())), (int) Math.ceil(C0241f.b(interfaceC0403d.d())));
            O0.k layoutDirection = interfaceC0403d.getLayoutDirection();
            c0338g = c0458a.f5903a;
            C0334c c0334c2 = c0458a.f5904b;
            if (c0338g != null || c0334c2 == null) {
                c0458a2 = c0458a;
            } else {
                int i7 = (int) (d4 >> 32);
                Bitmap bitmap = c0338g.f5413a;
                if (i7 <= bitmap.getWidth()) {
                    if (((int) (d4 & 4294967295L)) <= bitmap.getHeight()) {
                        c0458a2 = c0458a;
                        if (b0.F.a(c0458a2.f5906d, i3)) {
                            c0334c = c0334c2;
                            c0458a2.f5905c = d4;
                            long f02 = O2.d.f0(d4);
                            C0401b c0401b = c0458a2.f5907e;
                            C0400a c0400a = c0401b.f5648d;
                            O0.b bVar = c0400a.f5644a;
                            O0.k kVar = c0400a.f5645b;
                            b0.r rVar = c0400a.f5646c;
                            c0458a3 = c0458a2;
                            long j4 = c0400a.f5647d;
                            c0400a.f5644a = interfaceC0403d;
                            c0400a.f5645b = layoutDirection;
                            c0400a.f5646c = c0334c;
                            c0400a.f5647d = f02;
                            c0334c.f();
                            c0401b.F(C0352v.f5434b, 0L, (r17 & 4) != 0 ? InterfaceC0403d.j0(c0401b.d(), 0L) : 0L, 1.0f, C0406g.f5653a, null, (r17 & 64) != 0 ? 3 : 0);
                            this.f5870m.n(c0401b);
                            c0334c.a();
                            C0400a c0400a2 = c0401b.f5648d;
                            c0400a2.f5644a = bVar;
                            c0400a2.f5645b = kVar;
                            c0400a2.f5646c = rVar;
                            c0400a2.f5647d = j4;
                            c0338g.f5413a.prepareToDraw();
                            this.f5861d = false;
                            this.f5867j = interfaceC0403d.d();
                            if (c0344m3 == null) {
                            }
                            C0344m c0344m52 = c0344m3;
                            C0458a c0458a42 = c0458a3;
                            c0338g2 = c0458a42.f5903a;
                            if (c0338g2 != null) {
                            }
                        }
                    } else {
                        c0458a2 = c0458a;
                    }
                    c2 = ' ';
                    c0338g = M.f((int) (d4 >> c2), (int) (d4 & 4294967295L), i3);
                    c0334c = M.a(c0338g);
                    c0458a2.f5903a = c0338g;
                    c0458a2.f5904b = c0334c;
                    c0458a2.f5906d = i3;
                    c0458a2.f5905c = d4;
                    long f022 = O2.d.f0(d4);
                    C0401b c0401b2 = c0458a2.f5907e;
                    C0400a c0400a3 = c0401b2.f5648d;
                    O0.b bVar2 = c0400a3.f5644a;
                    O0.k kVar2 = c0400a3.f5645b;
                    b0.r rVar2 = c0400a3.f5646c;
                    c0458a3 = c0458a2;
                    long j42 = c0400a3.f5647d;
                    c0400a3.f5644a = interfaceC0403d;
                    c0400a3.f5645b = layoutDirection;
                    c0400a3.f5646c = c0334c;
                    c0400a3.f5647d = f022;
                    c0334c.f();
                    c0401b2.F(C0352v.f5434b, 0L, (r17 & 4) != 0 ? InterfaceC0403d.j0(c0401b2.d(), 0L) : 0L, 1.0f, C0406g.f5653a, null, (r17 & 64) != 0 ? 3 : 0);
                    this.f5870m.n(c0401b2);
                    c0334c.a();
                    C0400a c0400a22 = c0401b2.f5648d;
                    c0400a22.f5644a = bVar2;
                    c0400a22.f5645b = kVar2;
                    c0400a22.f5646c = rVar2;
                    c0400a22.f5647d = j42;
                    c0338g.f5413a.prepareToDraw();
                    this.f5861d = false;
                    this.f5867j = interfaceC0403d.d();
                    if (c0344m3 == null) {
                    }
                    C0344m c0344m522 = c0344m3;
                    C0458a c0458a422 = c0458a3;
                    c0338g2 = c0458a422.f5903a;
                    if (c0338g2 != null) {
                    }
                } else {
                    c0458a2 = c0458a;
                }
            }
            c2 = ' ';
            c0338g = M.f((int) (d4 >> c2), (int) (d4 & 4294967295L), i3);
            c0334c = M.a(c0338g);
            c0458a2.f5903a = c0338g;
            c0458a2.f5904b = c0334c;
            c0458a2.f5906d = i3;
            c0458a2.f5905c = d4;
            long f0222 = O2.d.f0(d4);
            C0401b c0401b22 = c0458a2.f5907e;
            C0400a c0400a32 = c0401b22.f5648d;
            O0.b bVar22 = c0400a32.f5644a;
            O0.k kVar22 = c0400a32.f5645b;
            b0.r rVar22 = c0400a32.f5646c;
            c0458a3 = c0458a2;
            long j422 = c0400a32.f5647d;
            c0400a32.f5644a = interfaceC0403d;
            c0400a32.f5645b = layoutDirection;
            c0400a32.f5646c = c0334c;
            c0400a32.f5647d = f0222;
            c0334c.f();
            c0401b22.F(C0352v.f5434b, 0L, (r17 & 4) != 0 ? InterfaceC0403d.j0(c0401b22.d(), 0L) : 0L, 1.0f, C0406g.f5653a, null, (r17 & 64) != 0 ? 3 : 0);
            this.f5870m.n(c0401b22);
            c0334c.a();
            C0400a c0400a222 = c0401b22.f5648d;
            c0400a222.f5644a = bVar22;
            c0400a222.f5645b = kVar22;
            c0400a222.f5646c = rVar22;
            c0400a222.f5647d = j422;
            c0338g.f5413a.prepareToDraw();
            this.f5861d = false;
            this.f5867j = interfaceC0403d.d();
            if (c0344m3 == null) {
            }
            C0344m c0344m5222 = c0344m3;
            C0458a c0458a4222 = c0458a3;
            c0338g2 = c0458a4222.f5903a;
            if (c0338g2 != null) {
            }
        }
        i3 = 0;
        z3 = this.f5861d;
        c0458a = this.f5862e;
        if (!z3) {
            c0338g3 = c0458a.f5903a;
            if (b0.F.a(i3, c0338g3 == null ? c0338g3.a() : 0)) {
            }
        }
        if (b0.F.a(i3, 1)) {
        }
        this.f5865h = c0344m2;
        float d32 = C0241f.d(interfaceC0403d.d());
        C0156j0 c0156j022 = this.f5866i;
        this.f5868k = d32 / C0241f.d(((C0241f) c0156j022.getValue()).f4736a);
        this.f5869l = C0241f.b(interfaceC0403d.d()) / C0241f.b(((C0241f) c0156j022.getValue()).f4736a);
        long d42 = O2.d.d((int) Math.ceil(C0241f.d(interfaceC0403d.d())), (int) Math.ceil(C0241f.b(interfaceC0403d.d())));
        O0.k layoutDirection2 = interfaceC0403d.getLayoutDirection();
        c0338g = c0458a.f5903a;
        C0334c c0334c22 = c0458a.f5904b;
        if (c0338g != null) {
        }
        c0458a2 = c0458a;
        c2 = ' ';
        c0338g = M.f((int) (d42 >> c2), (int) (d42 & 4294967295L), i3);
        c0334c = M.a(c0338g);
        c0458a2.f5903a = c0338g;
        c0458a2.f5904b = c0334c;
        c0458a2.f5906d = i3;
        c0458a2.f5905c = d42;
        long f02222 = O2.d.f0(d42);
        C0401b c0401b222 = c0458a2.f5907e;
        C0400a c0400a322 = c0401b222.f5648d;
        O0.b bVar222 = c0400a322.f5644a;
        O0.k kVar222 = c0400a322.f5645b;
        b0.r rVar222 = c0400a322.f5646c;
        c0458a3 = c0458a2;
        long j4222 = c0400a322.f5647d;
        c0400a322.f5644a = interfaceC0403d;
        c0400a322.f5645b = layoutDirection2;
        c0400a322.f5646c = c0334c;
        c0400a322.f5647d = f02222;
        c0334c.f();
        c0401b222.F(C0352v.f5434b, 0L, (r17 & 4) != 0 ? InterfaceC0403d.j0(c0401b222.d(), 0L) : 0L, 1.0f, C0406g.f5653a, null, (r17 & 64) != 0 ? 3 : 0);
        this.f5870m.n(c0401b222);
        c0334c.a();
        C0400a c0400a2222 = c0401b222.f5648d;
        c0400a2222.f5644a = bVar222;
        c0400a2222.f5645b = kVar222;
        c0400a2222.f5646c = rVar222;
        c0400a2222.f5647d = j4222;
        c0338g.f5413a.prepareToDraw();
        this.f5861d = false;
        this.f5867j = interfaceC0403d.d();
        if (c0344m3 == null) {
        }
        C0344m c0344m52222 = c0344m3;
        C0458a c0458a42222 = c0458a3;
        c0338g2 = c0458a42222.f5903a;
        if (c0338g2 != null) {
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f5860c);
        sb.append("\n\tviewportWidth: ");
        C0156j0 c0156j0 = this.f5866i;
        sb.append(C0241f.d(((C0241f) c0156j0.getValue()).f4736a));
        sb.append("\n\tviewportHeight: ");
        sb.append(C0241f.b(((C0241f) c0156j0.getValue()).f4736a));
        sb.append("\n");
        String sb2 = sb.toString();
        f2.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
