package D2;

import A2.e;
import E2.F;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;
import z2.AbstractC3551a;

/* loaded from: classes3.dex */
final class r implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final r f420a = new r();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f421b = A2.i.a("kotlinx.serialization.json.JsonLiteral", e.i.f75a);

    private r() {
    }

    @Override // y2.InterfaceC3526a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public q deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        i i4 = m.d(decoder).i();
        if (i4 instanceof q) {
            return (q) i4;
        }
        throw F.e(-1, "Unexpected JSON element, expected JsonLiteral, had " + H.b(i4.getClass()), i4.toString());
    }

    @Override // y2.InterfaceC3535j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(B2.f encoder, q value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        m.h(encoder);
        if (value.g()) {
            encoder.E(value.e());
            return;
        }
        if (value.f() != null) {
            encoder.v(value.f()).E(value.e());
            return;
        }
        Long n4 = k.n(value);
        if (n4 != null) {
            encoder.A(n4.longValue());
            return;
        }
        W1.v h4 = kotlin.text.u.h(value.e());
        if (h4 != null) {
            encoder.v(AbstractC3551a.w(W1.v.f9632c).getDescriptor()).A(h4.f());
            return;
        }
        Double h5 = k.h(value);
        if (h5 != null) {
            encoder.g(h5.doubleValue());
            return;
        }
        Boolean e4 = k.e(value);
        if (e4 != null) {
            encoder.j(e4.booleanValue());
        } else {
            encoder.E(value.e());
        }
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f421b;
    }
}
