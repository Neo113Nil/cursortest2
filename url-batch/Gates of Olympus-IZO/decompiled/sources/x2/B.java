package x2;

import D1.E;
import h.AbstractC0416e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class B implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final B f8727a = new B();

    /* renamed from: b, reason: collision with root package name */
    public static final u2.f f8728b = AbstractC0416e.m("kotlinx.serialization.json.JsonPrimitive", u2.d.f8536j, new SerialDescriptor[0], new E(5));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        k a02 = AbstractC0416e.l(decoder).a0();
        if (a02 instanceof A) {
            return (A) a02;
        }
        throw y2.e.a(-1, "Unexpected JSON element, expected JsonPrimitive, had " + Z1.u.a(a02.getClass()), a02.toString());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8728b;
    }
}
