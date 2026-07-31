package D2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class B implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final B f866a = new B();

    /* renamed from: b, reason: collision with root package name */
    public static final A2.h f867b = O2.l.Q("kotlinx.serialization.json.JsonPrimitive", A2.d.f238k, new SerialDescriptor[0], new A2.i(0));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        k x02 = O2.d.q(decoder).x0();
        if (x02 instanceof A) {
            return (A) x02;
        }
        throw E2.h.a(-1, "Unexpected JSON element, expected JsonPrimitive, had " + f2.v.a(x02.getClass()), x02.toString());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f867b;
    }
}
