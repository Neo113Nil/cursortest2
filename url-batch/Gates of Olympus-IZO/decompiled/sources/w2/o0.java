package w2;

import h2.AbstractC0442d;
import j2.C0521a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class o0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f8689a = new o0();

    /* renamed from: b, reason: collision with root package name */
    public static final T f8690b = new T("kotlin.uuid.Uuid", u2.d.f8536j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        String u3 = decoder.u();
        Z1.i.f(u3, "uuidString");
        if (u3.length() != 36) {
            throw new IllegalArgumentException("Expected a 36-char string in the standard uuid format.");
        }
        long b2 = AbstractC0442d.b(0, 8, u3);
        g2.i.E(u3, 8);
        long b3 = AbstractC0442d.b(9, 13, u3);
        g2.i.E(u3, 13);
        long b4 = AbstractC0442d.b(14, 18, u3);
        g2.i.E(u3, 18);
        long b5 = AbstractC0442d.b(19, 23, u3);
        g2.i.E(u3, 23);
        long j3 = (b2 << 32) | (b3 << 16) | b4;
        long b6 = AbstractC0442d.b(24, 36, u3) | (b5 << 48);
        return (j3 == 0 && b6 == 0) ? C0521a.f5299f : new C0521a(j3, b6);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8690b;
    }
}
