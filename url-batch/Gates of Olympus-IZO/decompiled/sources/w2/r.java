package w2;

import e2.AbstractC0381e;
import i2.C0472a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class r implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final r f8694a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final T f8695b = new T("kotlin.time.Duration", u2.d.f8536j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int i3 = C0472a.f5118g;
        String u3 = decoder.u();
        Z1.i.f(u3, "value");
        try {
            return new C0472a(AbstractC0381e.j(u3));
        } catch (IllegalArgumentException e3) {
            throw new IllegalArgumentException("Invalid ISO duration string format: '" + u3 + "'.", e3);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8695b;
    }
}
