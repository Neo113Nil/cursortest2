package o7;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a1 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final a1 f6856a = new a1();

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f6857b = new t0("kotlin.String", m7.d.f6449o);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return decoder.y();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f6857b;
    }
}
