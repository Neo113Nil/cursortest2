package o7;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KSerializer f6959a;

    public y(KSerializer kSerializer) {
        this.f6959a = kSerializer;
    }

    @Override // o7.w
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{this.f6959a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // o7.w
    public final KSerializer[] typeParametersSerializers() {
        return n0.f6913b;
    }
}
