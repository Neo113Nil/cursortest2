package o7;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n1 implements KSerializer {

    /* renamed from: b, reason: collision with root package name */
    public static final n1 f6914b = new n1();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f6915a = new m0();

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        this.f6915a.deserialize(decoder);
        return d6.z.f2639a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f6915a.getDescriptor();
    }
}
