package h0;

import I.C0089d;
import I.C0102j0;
import I.X;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import b0.AbstractC0259J;
import b0.AbstractC0272e;
import b0.C0253D;
import b0.C0271d;
import b0.C0275h;
import b0.C0281n;
import b0.C0282o;
import b0.C0288u;
import b0.InterfaceC0285r;
import d0.C0320a;
import d0.C0321b;
import d0.InterfaceC0323d;
import e2.AbstractC0381e;

/* loaded from: classes.dex */
public final class E extends AbstractC0419C {

    /* renamed from: b, reason: collision with root package name */
    public final C0422c f4871b;

    /* renamed from: c, reason: collision with root package name */
    public String f4872c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4873d;

    /* renamed from: e, reason: collision with root package name */
    public final C0420a f4874e;

    /* renamed from: f, reason: collision with root package name */
    public Z1.j f4875f;

    /* renamed from: g, reason: collision with root package name */
    public final C0102j0 f4876g;

    /* renamed from: h, reason: collision with root package name */
    public C0281n f4877h;

    /* renamed from: i, reason: collision with root package name */
    public final C0102j0 f4878i;

    /* renamed from: j, reason: collision with root package name */
    public long f4879j;

    /* renamed from: k, reason: collision with root package name */
    public float f4880k;

    /* renamed from: l, reason: collision with root package name */
    public float f4881l;

    /* renamed from: m, reason: collision with root package name */
    public final D f4882m;

    public E(C0422c c0422c) {
        this.f4871b = c0422c;
        c0422c.f4928i = new D(this, 0);
        this.f4872c = "";
        this.f4873d = true;
        this.f4874e = new C0420a();
        this.f4875f = C0426g.f4972g;
        X x3 = X.f2228i;
        this.f4876g = C0089d.J(null, x3);
        this.f4878i = C0089d.J(new a0.f(0L), x3);
        this.f4879j = 9205357640488583168L;
        this.f4880k = 1.0f;
        this.f4881l = 1.0f;
        this.f4882m = new D(this, 1);
    }

    @Override // h0.AbstractC0419C
    public final void a(InterfaceC0323d interfaceC0323d) {
        e(interfaceC0323d, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (b0.AbstractC0259J.n(r3, 3) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (b0.AbstractC0259J.n(r3, 3) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0043, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0030, code lost:
    
        if (r3 == null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(InterfaceC0323d interfaceC0323d, float f3, C0281n c0281n) {
        int i3;
        boolean z3;
        C0420a c0420a;
        C0281n c0281n2;
        C0275h c0275h;
        C0420a c0420a2;
        char c3;
        C0271d c0271d;
        C0420a c0420a3;
        C0275h c0275h2;
        C0275h c0275h3;
        C0281n c0281n3 = c0281n;
        C0422c c0422c = this.f4871b;
        boolean z4 = c0422c.f4923d;
        C0102j0 c0102j0 = this.f4876g;
        if (z4 && c0422c.f4924e != 16) {
            C0281n c0281n4 = (C0281n) c0102j0.getValue();
            int i4 = G.f4893a;
            if (c0281n4 != null) {
                int i5 = c0281n4.f4284c;
                if (!AbstractC0259J.n(i5, 5)) {
                }
                if (c0281n3 != null) {
                    int i6 = c0281n3.f4284c;
                    if (!AbstractC0259J.n(i6, 5)) {
                    }
                    i3 = 1;
                }
            }
            z3 = this.f4873d;
            c0420a = this.f4874e;
            if (!z3 && a0.f.a(this.f4879j, interfaceC0323d.c())) {
                c0275h3 = c0420a.f4914a;
                if (C0253D.a(i3, c0275h3 == null ? c0275h3.a() : 0)) {
                    c0420a3 = c0420a;
                    if (c0281n3 == null) {
                        c0281n3 = ((C0281n) c0102j0.getValue()) != null ? (C0281n) c0102j0.getValue() : this.f4877h;
                    }
                    C0281n c0281n5 = c0281n3;
                    C0420a c0420a4 = c0420a3;
                    c0275h2 = c0420a4.f4914a;
                    if (c0275h2 != null) {
                        InterfaceC0323d.o(interfaceC0323d, c0275h2, 0L, c0420a4.f4916c, 0L, f3, c0281n5, 0, 858);
                        return;
                    } else {
                        AbstractC0381e.N("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                        throw null;
                    }
                }
            }
            if (C0253D.a(i3, 1)) {
                c0281n2 = null;
            } else {
                long j3 = c0422c.f4924e;
                c0281n2 = new C0281n(j3, 5, Build.VERSION.SDK_INT >= 29 ? C0282o.f4285a.a(j3, 5) : new PorterDuffColorFilter(AbstractC0259J.E(j3), AbstractC0259J.G(5)));
            }
            this.f4877h = c0281n2;
            float d3 = a0.f.d(interfaceC0323d.c());
            C0102j0 c0102j02 = this.f4878i;
            this.f4880k = d3 / a0.f.d(((a0.f) c0102j02.getValue()).f3503a);
            this.f4881l = a0.f.b(interfaceC0323d.c()) / a0.f.b(((a0.f) c0102j02.getValue()).f3503a);
            long e3 = I2.l.e((int) Math.ceil(a0.f.d(interfaceC0323d.c())), (int) Math.ceil(a0.f.b(interfaceC0323d.c())));
            M0.j layoutDirection = interfaceC0323d.getLayoutDirection();
            c0275h = c0420a.f4914a;
            C0271d c0271d2 = c0420a.f4915b;
            if (c0275h != null || c0271d2 == null) {
                c0420a2 = c0420a;
            } else {
                int i7 = (int) (e3 >> 32);
                Bitmap bitmap = c0275h.f4271a;
                if (i7 <= bitmap.getWidth()) {
                    if (((int) (e3 & 4294967295L)) <= bitmap.getHeight()) {
                        c0420a2 = c0420a;
                        if (C0253D.a(c0420a2.f4917d, i3)) {
                            c0271d = c0271d2;
                            c0420a2.f4916c = e3;
                            long R2 = I2.l.R(e3);
                            C0321b c0321b = c0420a2.f4918e;
                            C0320a c0320a = c0321b.f4443d;
                            M0.b bVar = c0320a.f4439a;
                            M0.j jVar = c0320a.f4440b;
                            InterfaceC0285r interfaceC0285r = c0320a.f4441c;
                            c0420a3 = c0420a2;
                            long j4 = c0320a.f4442d;
                            c0320a.f4439a = interfaceC0323d;
                            c0320a.f4440b = layoutDirection;
                            c0320a.f4441c = c0271d;
                            c0320a.f4442d = R2;
                            c0271d.f();
                            InterfaceC0323d.s(c0321b, C0288u.f4292b, 0L, 0L, null, 62);
                            this.f4882m.j(c0321b);
                            c0271d.a();
                            C0320a c0320a2 = c0321b.f4443d;
                            c0320a2.f4439a = bVar;
                            c0320a2.f4440b = jVar;
                            c0320a2.f4441c = interfaceC0285r;
                            c0320a2.f4442d = j4;
                            c0275h.f4271a.prepareToDraw();
                            this.f4873d = false;
                            this.f4879j = interfaceC0323d.c();
                            if (c0281n3 == null) {
                            }
                            C0281n c0281n52 = c0281n3;
                            C0420a c0420a42 = c0420a3;
                            c0275h2 = c0420a42.f4914a;
                            if (c0275h2 != null) {
                            }
                        }
                    } else {
                        c0420a2 = c0420a;
                    }
                    c3 = ' ';
                    c0275h = AbstractC0259J.e((int) (e3 >> c3), (int) (e3 & 4294967295L), i3);
                    Canvas canvas = AbstractC0272e.f4266a;
                    c0271d = new C0271d();
                    c0271d.f4263a = new Canvas(c0275h.f4271a);
                    c0420a2.f4914a = c0275h;
                    c0420a2.f4915b = c0271d;
                    c0420a2.f4917d = i3;
                    c0420a2.f4916c = e3;
                    long R22 = I2.l.R(e3);
                    C0321b c0321b2 = c0420a2.f4918e;
                    C0320a c0320a3 = c0321b2.f4443d;
                    M0.b bVar2 = c0320a3.f4439a;
                    M0.j jVar2 = c0320a3.f4440b;
                    InterfaceC0285r interfaceC0285r2 = c0320a3.f4441c;
                    c0420a3 = c0420a2;
                    long j42 = c0320a3.f4442d;
                    c0320a3.f4439a = interfaceC0323d;
                    c0320a3.f4440b = layoutDirection;
                    c0320a3.f4441c = c0271d;
                    c0320a3.f4442d = R22;
                    c0271d.f();
                    InterfaceC0323d.s(c0321b2, C0288u.f4292b, 0L, 0L, null, 62);
                    this.f4882m.j(c0321b2);
                    c0271d.a();
                    C0320a c0320a22 = c0321b2.f4443d;
                    c0320a22.f4439a = bVar2;
                    c0320a22.f4440b = jVar2;
                    c0320a22.f4441c = interfaceC0285r2;
                    c0320a22.f4442d = j42;
                    c0275h.f4271a.prepareToDraw();
                    this.f4873d = false;
                    this.f4879j = interfaceC0323d.c();
                    if (c0281n3 == null) {
                    }
                    C0281n c0281n522 = c0281n3;
                    C0420a c0420a422 = c0420a3;
                    c0275h2 = c0420a422.f4914a;
                    if (c0275h2 != null) {
                    }
                } else {
                    c0420a2 = c0420a;
                }
            }
            c3 = ' ';
            c0275h = AbstractC0259J.e((int) (e3 >> c3), (int) (e3 & 4294967295L), i3);
            Canvas canvas2 = AbstractC0272e.f4266a;
            c0271d = new C0271d();
            c0271d.f4263a = new Canvas(c0275h.f4271a);
            c0420a2.f4914a = c0275h;
            c0420a2.f4915b = c0271d;
            c0420a2.f4917d = i3;
            c0420a2.f4916c = e3;
            long R222 = I2.l.R(e3);
            C0321b c0321b22 = c0420a2.f4918e;
            C0320a c0320a32 = c0321b22.f4443d;
            M0.b bVar22 = c0320a32.f4439a;
            M0.j jVar22 = c0320a32.f4440b;
            InterfaceC0285r interfaceC0285r22 = c0320a32.f4441c;
            c0420a3 = c0420a2;
            long j422 = c0320a32.f4442d;
            c0320a32.f4439a = interfaceC0323d;
            c0320a32.f4440b = layoutDirection;
            c0320a32.f4441c = c0271d;
            c0320a32.f4442d = R222;
            c0271d.f();
            InterfaceC0323d.s(c0321b22, C0288u.f4292b, 0L, 0L, null, 62);
            this.f4882m.j(c0321b22);
            c0271d.a();
            C0320a c0320a222 = c0321b22.f4443d;
            c0320a222.f4439a = bVar22;
            c0320a222.f4440b = jVar22;
            c0320a222.f4441c = interfaceC0285r22;
            c0320a222.f4442d = j422;
            c0275h.f4271a.prepareToDraw();
            this.f4873d = false;
            this.f4879j = interfaceC0323d.c();
            if (c0281n3 == null) {
            }
            C0281n c0281n5222 = c0281n3;
            C0420a c0420a4222 = c0420a3;
            c0275h2 = c0420a4222.f4914a;
            if (c0275h2 != null) {
            }
        }
        i3 = 0;
        z3 = this.f4873d;
        c0420a = this.f4874e;
        if (!z3) {
            c0275h3 = c0420a.f4914a;
            if (C0253D.a(i3, c0275h3 == null ? c0275h3.a() : 0)) {
            }
        }
        if (C0253D.a(i3, 1)) {
        }
        this.f4877h = c0281n2;
        float d32 = a0.f.d(interfaceC0323d.c());
        C0102j0 c0102j022 = this.f4878i;
        this.f4880k = d32 / a0.f.d(((a0.f) c0102j022.getValue()).f3503a);
        this.f4881l = a0.f.b(interfaceC0323d.c()) / a0.f.b(((a0.f) c0102j022.getValue()).f3503a);
        long e32 = I2.l.e((int) Math.ceil(a0.f.d(interfaceC0323d.c())), (int) Math.ceil(a0.f.b(interfaceC0323d.c())));
        M0.j layoutDirection2 = interfaceC0323d.getLayoutDirection();
        c0275h = c0420a.f4914a;
        C0271d c0271d22 = c0420a.f4915b;
        if (c0275h != null) {
        }
        c0420a2 = c0420a;
        c3 = ' ';
        c0275h = AbstractC0259J.e((int) (e32 >> c3), (int) (e32 & 4294967295L), i3);
        Canvas canvas22 = AbstractC0272e.f4266a;
        c0271d = new C0271d();
        c0271d.f4263a = new Canvas(c0275h.f4271a);
        c0420a2.f4914a = c0275h;
        c0420a2.f4915b = c0271d;
        c0420a2.f4917d = i3;
        c0420a2.f4916c = e32;
        long R2222 = I2.l.R(e32);
        C0321b c0321b222 = c0420a2.f4918e;
        C0320a c0320a322 = c0321b222.f4443d;
        M0.b bVar222 = c0320a322.f4439a;
        M0.j jVar222 = c0320a322.f4440b;
        InterfaceC0285r interfaceC0285r222 = c0320a322.f4441c;
        c0420a3 = c0420a2;
        long j4222 = c0320a322.f4442d;
        c0320a322.f4439a = interfaceC0323d;
        c0320a322.f4440b = layoutDirection2;
        c0320a322.f4441c = c0271d;
        c0320a322.f4442d = R2222;
        c0271d.f();
        InterfaceC0323d.s(c0321b222, C0288u.f4292b, 0L, 0L, null, 62);
        this.f4882m.j(c0321b222);
        c0271d.a();
        C0320a c0320a2222 = c0321b222.f4443d;
        c0320a2222.f4439a = bVar222;
        c0320a2222.f4440b = jVar222;
        c0320a2222.f4441c = interfaceC0285r222;
        c0320a2222.f4442d = j4222;
        c0275h.f4271a.prepareToDraw();
        this.f4873d = false;
        this.f4879j = interfaceC0323d.c();
        if (c0281n3 == null) {
        }
        C0281n c0281n52222 = c0281n3;
        C0420a c0420a42222 = c0420a3;
        c0275h2 = c0420a42222.f4914a;
        if (c0275h2 != null) {
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f4872c);
        sb.append("\n\tviewportWidth: ");
        C0102j0 c0102j0 = this.f4878i;
        sb.append(a0.f.d(((a0.f) c0102j0.getValue()).f3503a));
        sb.append("\n\tviewportHeight: ");
        sb.append(a0.f.b(((a0.f) c0102j0.getValue()).f3503a));
        sb.append("\n");
        String sb2 = sb.toString();
        Z1.i.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
