package D2;

import A2.e;
import E2.F;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* loaded from: classes3.dex */
public final class A implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final A f369a = new A();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f370b = A2.i.d("kotlinx.serialization.json.JsonPrimitive", e.i.f75a, new A2.f[0], null, 8, null);

    private A() {
    }

    @Override // y2.InterfaceC3526a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public z deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        i i4 = m.d(decoder).i();
        if (i4 instanceof z) {
            return (z) i4;
        }
        throw F.e(-1, "Unexpected JSON element, expected JsonPrimitive, had " + H.b(i4.getClass()), i4.toString());
    }

    @Override // y2.InterfaceC3535j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(B2.f encoder, z value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        m.h(encoder);
        if (value instanceof u) {
            encoder.t(v.f425a, u.INSTANCE);
        } else {
            encoder.t(r.f420a, (q) value);
        }
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f370b;
    }
}
