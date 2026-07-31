package B2;

import B2.d;
import B2.f;
import C2.C0322m0;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3535j;

/* loaded from: classes3.dex */
public abstract class b implements f, d {
    @Override // B2.f
    public abstract void A(long j4);

    @Override // B2.d
    public final void B(A2.f descriptor, int i4, double d4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (G(descriptor, i4)) {
            g(d4);
        }
    }

    @Override // B2.d
    public final void C(A2.f descriptor, int i4, char c4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (G(descriptor, i4)) {
            o(c4);
        }
    }

    @Override // B2.f
    public d D(A2.f fVar, int i4) {
        return f.a.a(this, fVar, i4);
    }

    @Override // B2.f
    public abstract void E(String str);

    @Override // B2.d
    public final void F(A2.f descriptor, int i4, long j4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (G(descriptor, i4)) {
            A(j4);
        }
    }

    public boolean G(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return true;
    }

    public void H(InterfaceC3535j interfaceC3535j, Object obj) {
        f.a.c(this, interfaceC3535j, obj);
    }

    @Override // B2.f
    public d b(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // B2.d
    public void c(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // B2.d
    public final void f(A2.f descriptor, int i4, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (G(descriptor, i4)) {
            w(i5);
        }
    }

    @Override // B2.f
    public abstract void g(double d4);

    @Override // B2.f
    public abstract void h(short s4);

    @Override // B2.f
    public abstract void i(byte b4);

    @Override // B2.f
    public abstract void j(boolean z4);

    @Override // B2.d
    public final void k(A2.f descriptor, int i4, boolean z4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (G(descriptor, i4)) {
            j(z4);
        }
    }

    @Override // B2.f
    public abstract void l(float f4);

    @Override // B2.d
    public void m(A2.f descriptor, int i4, InterfaceC3535j serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (G(descriptor, i4)) {
            t(serializer, obj);
        }
    }

    @Override // B2.d
    public final void n(A2.f descriptor, int i4, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        if (G(descriptor, i4)) {
            E(value);
        }
    }

    @Override // B2.f
    public abstract void o(char c4);

    @Override // B2.f
    public void q() {
        f.a.b(this);
    }

    @Override // B2.d
    public boolean r(A2.f fVar, int i4) {
        return d.a.a(this, fVar, i4);
    }

    @Override // B2.d
    public final void s(A2.f descriptor, int i4, byte b4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (G(descriptor, i4)) {
            i(b4);
        }
    }

    @Override // B2.f
    public void t(InterfaceC3535j interfaceC3535j, Object obj) {
        f.a.d(this, interfaceC3535j, obj);
    }

    @Override // B2.d
    public final void u(A2.f descriptor, int i4, float f4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (G(descriptor, i4)) {
            l(f4);
        }
    }

    @Override // B2.f
    public f v(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // B2.f
    public abstract void w(int i4);

    @Override // B2.d
    public void x(A2.f descriptor, int i4, InterfaceC3535j serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (G(descriptor, i4)) {
            H(serializer, obj);
        }
    }

    @Override // B2.d
    public final void y(A2.f descriptor, int i4, short s4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (G(descriptor, i4)) {
            h(s4);
        }
    }

    @Override // B2.d
    public final f z(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return G(descriptor, i4) ? v(descriptor.i(i4)) : C0322m0.f307a;
    }
}
