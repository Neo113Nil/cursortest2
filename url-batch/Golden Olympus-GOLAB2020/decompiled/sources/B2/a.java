package B2;

import B2.c;
import B2.e;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import y2.C3534i;
import y2.InterfaceC3526a;

/* loaded from: classes3.dex */
public abstract class a implements e, c {
    @Override // B2.e
    public abstract byte A();

    @Override // B2.c
    public final Object B(A2.f descriptor, int i4, InterfaceC3526a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (deserializer.getDescriptor().c() || r()) ? I(deserializer, obj) : m();
    }

    @Override // B2.c
    public final long C(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return q();
    }

    @Override // B2.c
    public final double D(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return H();
    }

    @Override // B2.e
    public abstract short E();

    @Override // B2.e
    public float F() {
        Object J3 = J();
        Intrinsics.checkNotNull(J3, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) J3).floatValue();
    }

    @Override // B2.c
    public final char G(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return f();
    }

    @Override // B2.e
    public double H() {
        Object J3 = J();
        Intrinsics.checkNotNull(J3, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) J3).doubleValue();
    }

    public Object I(InterfaceC3526a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return u(deserializer);
    }

    public Object J() {
        throw new C3534i(H.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // B2.e
    public c b(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // B2.c
    public void c(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // B2.e
    public boolean e() {
        Object J3 = J();
        Intrinsics.checkNotNull(J3, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) J3).booleanValue();
    }

    @Override // B2.e
    public char f() {
        Object J3 = J();
        Intrinsics.checkNotNull(J3, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) J3).charValue();
    }

    @Override // B2.c
    public int g(A2.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // B2.c
    public final String h(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return o();
    }

    @Override // B2.e
    public abstract int j();

    @Override // B2.c
    public final byte k(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return A();
    }

    @Override // B2.c
    public e l(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return p(descriptor.i(i4));
    }

    @Override // B2.e
    public Void m() {
        return null;
    }

    @Override // B2.e
    public int n(A2.f enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Object J3 = J();
        Intrinsics.checkNotNull(J3, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) J3).intValue();
    }

    @Override // B2.e
    public String o() {
        Object J3 = J();
        Intrinsics.checkNotNull(J3, "null cannot be cast to non-null type kotlin.String");
        return (String) J3;
    }

    @Override // B2.e
    public e p(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // B2.e
    public abstract long q();

    @Override // B2.e
    public boolean r() {
        return true;
    }

    @Override // B2.c
    public final int s(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return j();
    }

    @Override // B2.e
    public Object u(InterfaceC3526a interfaceC3526a) {
        return e.a.a(this, interfaceC3526a);
    }

    @Override // B2.c
    public boolean v() {
        return c.a.b(this);
    }

    @Override // B2.c
    public final float w(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return F();
    }

    @Override // B2.c
    public final boolean x(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return e();
    }

    @Override // B2.c
    public Object y(A2.f descriptor, int i4, InterfaceC3526a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return I(deserializer, obj);
    }

    @Override // B2.c
    public final short z(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return E();
    }
}
