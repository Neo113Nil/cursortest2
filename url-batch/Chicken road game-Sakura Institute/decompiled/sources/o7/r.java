package o7;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final r f6936a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f6937b = new t0("kotlin.time.Duration", m7.d.f6449o);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int i7 = a7.a.f526i;
        String y4 = decoder.y();
        r6.k.f(y4, "value");
        try {
            return new a7.a(a8.d.m(y4));
        } catch (IllegalArgumentException e9) {
            throw new IllegalArgumentException(a0.m.j("Invalid ISO duration string format: '", y4, "'."), e9);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f6937b;
    }
}
