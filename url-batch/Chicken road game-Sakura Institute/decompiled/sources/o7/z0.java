package o7;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final z0 f6963a = new z0();

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f6964b = new t0("kotlin.Short", m7.d.f6448n);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Short.valueOf(decoder.x());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f6964b;
    }
}
