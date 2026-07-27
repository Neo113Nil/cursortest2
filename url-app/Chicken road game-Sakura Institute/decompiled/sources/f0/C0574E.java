package f0;

import G.C0192d;
import G.C0205j0;
import G.W;
import Z.C0306c;
import Z.C0310g;
import Z.C0316m;
import Z.C0317n;
import Z.C0323u;
import Z.K;
import android.graphics.Bitmap;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import b0.C0493a;
import b0.C0494b;
import b0.C0499g;
import b0.InterfaceC0496d;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import z2.C1405I;

/* renamed from: f0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0574E extends AbstractC0572C {

    /* renamed from: b, reason: collision with root package name */
    public final C0582c f6283b;

    /* renamed from: c, reason: collision with root package name */
    public String f6284c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6285d;

    /* renamed from: e, reason: collision with root package name */
    public final C0580a f6286e;

    /* renamed from: f, reason: collision with root package name */
    public M2.p f6287f;

    /* renamed from: g, reason: collision with root package name */
    public final C0205j0 f6288g;

    /* renamed from: h, reason: collision with root package name */
    public C0316m f6289h;

    /* renamed from: i, reason: collision with root package name */
    public final C0205j0 f6290i;

    /* renamed from: j, reason: collision with root package name */
    public long f6291j;

    /* renamed from: k, reason: collision with root package name */
    public float f6292k;

    /* renamed from: l, reason: collision with root package name */
    public float f6293l;

    /* renamed from: m, reason: collision with root package name */
    public final C0573D f6294m;

    public C0574E(C0582c c0582c) {
        this.f6283b = c0582c;
        c0582c.f6341i = new C0573D(this, 0);
        this.f6284c = "";
        this.f6285d = true;
        this.f6286e = new C0580a();
        this.f6287f = C0586g.f6386i;
        W w4 = W.f2779l;
        this.f6288g = C0192d.K(null, w4);
        this.f6290i = C0192d.K(new Y.f(0L), w4);
        this.f6291j = 9205357640488583168L;
        this.f6292k = 1.0f;
        this.f6293l = 1.0f;
        this.f6294m = new C0573D(this, 1);
    }

    @Override // f0.AbstractC0572C
    public final void a(InterfaceC0496d interfaceC0496d) {
        e(interfaceC0496d, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (Z.K.o(r3, 3) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (Z.K.o(r3, 3) == false) goto L22;
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
    public final void e(InterfaceC0496d interfaceC0496d, float f4, C0316m c0316m) {
        int i2;
        boolean z4;
        C0580a c0580a;
        C0316m c0316m2;
        C0310g c0310g;
        C0580a c0580a2;
        char c4;
        C0306c c0306c;
        C0580a c0580a3;
        C0310g c0310g2;
        C0310g c0310g3;
        C0316m c0316m3 = c0316m;
        C0582c c0582c = this.f6283b;
        boolean z5 = c0582c.f6336d;
        C0205j0 c0205j0 = this.f6288g;
        if (z5 && c0582c.f6337e != 16) {
            C0316m c0316m4 = (C0316m) c0205j0.getValue();
            C1405I c1405i = AbstractC0576G.f6305a;
            if (c0316m4 != null) {
                int i4 = c0316m4.f4536c;
                if (!K.o(i4, 5)) {
                }
                if (c0316m3 != null) {
                    int i5 = c0316m3.f4536c;
                    if (!K.o(i5, 5)) {
                    }
                    i2 = 1;
                }
            }
            z4 = this.f6285d;
            c0580a = this.f6286e;
            if (!z4 && Y.f.a(this.f6291j, interfaceC0496d.h())) {
                c0310g3 = c0580a.f6327a;
                if (Z.C.a(i2, c0310g3 == null ? c0310g3.a() : 0)) {
                    c0580a3 = c0580a;
                    if (c0316m3 == null) {
                        c0316m3 = ((C0316m) c0205j0.getValue()) != null ? (C0316m) c0205j0.getValue() : this.f6289h;
                    }
                    C0316m c0316m5 = c0316m3;
                    C0580a c0580a4 = c0580a3;
                    c0310g2 = c0580a4.f6327a;
                    if (c0310g2 != null) {
                        InterfaceC0496d.s(interfaceC0496d, c0310g2, 0L, c0580a4.f6329c, 0L, f4, c0316m5, 0, 858);
                        return;
                    } else {
                        AbstractC0864b.D("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                        throw null;
                    }
                }
            }
            if (Z.C.a(i2, 1)) {
                c0316m2 = null;
            } else {
                long j4 = c0582c.f6337e;
                c0316m2 = new C0316m(j4, 5, Build.VERSION.SDK_INT >= 29 ? C0317n.f4537a.a(j4, 5) : new PorterDuffColorFilter(K.D(j4), K.G(5)));
            }
            this.f6289h = c0316m2;
            float d4 = Y.f.d(interfaceC0496d.h());
            C0205j0 c0205j02 = this.f6290i;
            this.f6292k = d4 / Y.f.d(((Y.f) c0205j02.getValue()).f4386a);
            this.f6293l = Y.f.b(interfaceC0496d.h()) / Y.f.b(((Y.f) c0205j02.getValue()).f4386a);
            long c5 = u3.d.c((int) Math.ceil(Y.f.d(interfaceC0496d.h())), (int) Math.ceil(Y.f.b(interfaceC0496d.h())));
            M0.k layoutDirection = interfaceC0496d.getLayoutDirection();
            c0310g = c0580a.f6327a;
            C0306c c0306c2 = c0580a.f6328b;
            if (c0310g != null || c0306c2 == null) {
                c0580a2 = c0580a;
            } else {
                int i6 = (int) (c5 >> 32);
                Bitmap bitmap = c0310g.f4523a;
                if (i6 <= bitmap.getWidth()) {
                    if (((int) (c5 & 4294967295L)) <= bitmap.getHeight()) {
                        c0580a2 = c0580a;
                        if (Z.C.a(c0580a2.f6330d, i2)) {
                            c0306c = c0306c2;
                            c0580a2.f6329c = c5;
                            long U3 = u3.d.U(c5);
                            C0494b c0494b = c0580a2.f6331e;
                            C0493a c0493a = c0494b.f5602d;
                            M0.b bVar = c0493a.f5598a;
                            M0.k kVar = c0493a.f5599b;
                            Z.r rVar = c0493a.f5600c;
                            c0580a3 = c0580a2;
                            long j5 = c0493a.f5601d;
                            c0493a.f5598a = interfaceC0496d;
                            c0493a.f5599b = layoutDirection;
                            c0493a.f5600c = c0306c;
                            c0493a.f5601d = U3;
                            c0306c.g();
                            c0494b.B(C0323u.f4542b, 0L, (r17 & 4) != 0 ? InterfaceC0496d.o0(c0494b.h(), 0L) : 0L, 1.0f, C0499g.f5607a, null, (r17 & 64) != 0 ? 3 : 0);
                            this.f6294m.invoke(c0494b);
                            c0306c.b();
                            C0493a c0493a2 = c0494b.f5602d;
                            c0493a2.f5598a = bVar;
                            c0493a2.f5599b = kVar;
                            c0493a2.f5600c = rVar;
                            c0493a2.f5601d = j5;
                            c0310g.f4523a.prepareToDraw();
                            this.f6285d = false;
                            this.f6291j = interfaceC0496d.h();
                            if (c0316m3 == null) {
                            }
                            C0316m c0316m52 = c0316m3;
                            C0580a c0580a42 = c0580a3;
                            c0310g2 = c0580a42.f6327a;
                            if (c0310g2 != null) {
                            }
                        }
                    } else {
                        c0580a2 = c0580a;
                    }
                    c4 = ' ';
                    c0310g = K.f((int) (c5 >> c4), (int) (c5 & 4294967295L), i2);
                    c0306c = K.a(c0310g);
                    c0580a2.f6327a = c0310g;
                    c0580a2.f6328b = c0306c;
                    c0580a2.f6330d = i2;
                    c0580a2.f6329c = c5;
                    long U32 = u3.d.U(c5);
                    C0494b c0494b2 = c0580a2.f6331e;
                    C0493a c0493a3 = c0494b2.f5602d;
                    M0.b bVar2 = c0493a3.f5598a;
                    M0.k kVar2 = c0493a3.f5599b;
                    Z.r rVar2 = c0493a3.f5600c;
                    c0580a3 = c0580a2;
                    long j52 = c0493a3.f5601d;
                    c0493a3.f5598a = interfaceC0496d;
                    c0493a3.f5599b = layoutDirection;
                    c0493a3.f5600c = c0306c;
                    c0493a3.f5601d = U32;
                    c0306c.g();
                    c0494b2.B(C0323u.f4542b, 0L, (r17 & 4) != 0 ? InterfaceC0496d.o0(c0494b2.h(), 0L) : 0L, 1.0f, C0499g.f5607a, null, (r17 & 64) != 0 ? 3 : 0);
                    this.f6294m.invoke(c0494b2);
                    c0306c.b();
                    C0493a c0493a22 = c0494b2.f5602d;
                    c0493a22.f5598a = bVar2;
                    c0493a22.f5599b = kVar2;
                    c0493a22.f5600c = rVar2;
                    c0493a22.f5601d = j52;
                    c0310g.f4523a.prepareToDraw();
                    this.f6285d = false;
                    this.f6291j = interfaceC0496d.h();
                    if (c0316m3 == null) {
                    }
                    C0316m c0316m522 = c0316m3;
                    C0580a c0580a422 = c0580a3;
                    c0310g2 = c0580a422.f6327a;
                    if (c0310g2 != null) {
                    }
                } else {
                    c0580a2 = c0580a;
                }
            }
            c4 = ' ';
            c0310g = K.f((int) (c5 >> c4), (int) (c5 & 4294967295L), i2);
            c0306c = K.a(c0310g);
            c0580a2.f6327a = c0310g;
            c0580a2.f6328b = c0306c;
            c0580a2.f6330d = i2;
            c0580a2.f6329c = c5;
            long U322 = u3.d.U(c5);
            C0494b c0494b22 = c0580a2.f6331e;
            C0493a c0493a32 = c0494b22.f5602d;
            M0.b bVar22 = c0493a32.f5598a;
            M0.k kVar22 = c0493a32.f5599b;
            Z.r rVar22 = c0493a32.f5600c;
            c0580a3 = c0580a2;
            long j522 = c0493a32.f5601d;
            c0493a32.f5598a = interfaceC0496d;
            c0493a32.f5599b = layoutDirection;
            c0493a32.f5600c = c0306c;
            c0493a32.f5601d = U322;
            c0306c.g();
            c0494b22.B(C0323u.f4542b, 0L, (r17 & 4) != 0 ? InterfaceC0496d.o0(c0494b22.h(), 0L) : 0L, 1.0f, C0499g.f5607a, null, (r17 & 64) != 0 ? 3 : 0);
            this.f6294m.invoke(c0494b22);
            c0306c.b();
            C0493a c0493a222 = c0494b22.f5602d;
            c0493a222.f5598a = bVar22;
            c0493a222.f5599b = kVar22;
            c0493a222.f5600c = rVar22;
            c0493a222.f5601d = j522;
            c0310g.f4523a.prepareToDraw();
            this.f6285d = false;
            this.f6291j = interfaceC0496d.h();
            if (c0316m3 == null) {
            }
            C0316m c0316m5222 = c0316m3;
            C0580a c0580a4222 = c0580a3;
            c0310g2 = c0580a4222.f6327a;
            if (c0310g2 != null) {
            }
        }
        i2 = 0;
        z4 = this.f6285d;
        c0580a = this.f6286e;
        if (!z4) {
            c0310g3 = c0580a.f6327a;
            if (Z.C.a(i2, c0310g3 == null ? c0310g3.a() : 0)) {
            }
        }
        if (Z.C.a(i2, 1)) {
        }
        this.f6289h = c0316m2;
        float d42 = Y.f.d(interfaceC0496d.h());
        C0205j0 c0205j022 = this.f6290i;
        this.f6292k = d42 / Y.f.d(((Y.f) c0205j022.getValue()).f4386a);
        this.f6293l = Y.f.b(interfaceC0496d.h()) / Y.f.b(((Y.f) c0205j022.getValue()).f4386a);
        long c52 = u3.d.c((int) Math.ceil(Y.f.d(interfaceC0496d.h())), (int) Math.ceil(Y.f.b(interfaceC0496d.h())));
        M0.k layoutDirection2 = interfaceC0496d.getLayoutDirection();
        c0310g = c0580a.f6327a;
        C0306c c0306c22 = c0580a.f6328b;
        if (c0310g != null) {
        }
        c0580a2 = c0580a;
        c4 = ' ';
        c0310g = K.f((int) (c52 >> c4), (int) (c52 & 4294967295L), i2);
        c0306c = K.a(c0310g);
        c0580a2.f6327a = c0310g;
        c0580a2.f6328b = c0306c;
        c0580a2.f6330d = i2;
        c0580a2.f6329c = c52;
        long U3222 = u3.d.U(c52);
        C0494b c0494b222 = c0580a2.f6331e;
        C0493a c0493a322 = c0494b222.f5602d;
        M0.b bVar222 = c0493a322.f5598a;
        M0.k kVar222 = c0493a322.f5599b;
        Z.r rVar222 = c0493a322.f5600c;
        c0580a3 = c0580a2;
        long j5222 = c0493a322.f5601d;
        c0493a322.f5598a = interfaceC0496d;
        c0493a322.f5599b = layoutDirection2;
        c0493a322.f5600c = c0306c;
        c0493a322.f5601d = U3222;
        c0306c.g();
        c0494b222.B(C0323u.f4542b, 0L, (r17 & 4) != 0 ? InterfaceC0496d.o0(c0494b222.h(), 0L) : 0L, 1.0f, C0499g.f5607a, null, (r17 & 64) != 0 ? 3 : 0);
        this.f6294m.invoke(c0494b222);
        c0306c.b();
        C0493a c0493a2222 = c0494b222.f5602d;
        c0493a2222.f5598a = bVar222;
        c0493a2222.f5599b = kVar222;
        c0493a2222.f5600c = rVar222;
        c0493a2222.f5601d = j5222;
        c0310g.f4523a.prepareToDraw();
        this.f6285d = false;
        this.f6291j = interfaceC0496d.h();
        if (c0316m3 == null) {
        }
        C0316m c0316m52222 = c0316m3;
        C0580a c0580a42222 = c0580a3;
        c0310g2 = c0580a42222.f6327a;
        if (c0310g2 != null) {
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f6284c);
        sb.append("\n\tviewportWidth: ");
        C0205j0 c0205j0 = this.f6290i;
        sb.append(Y.f.d(((Y.f) c0205j0.getValue()).f4386a));
        sb.append("\n\tviewportHeight: ");
        sb.append(Y.f.b(((Y.f) c0205j0.getValue()).f4386a));
        sb.append("\n");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
