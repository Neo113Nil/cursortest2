package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bp0 implements kg0 {
    public final /* synthetic */ KSerializer PxuCJdSBwIXG;

    public bp0(KSerializer kSerializer) {
        this.PxuCJdSBwIXG = kSerializer;
    }

    @Override // defpackage.kg0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{this.PxuCJdSBwIXG};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        throw new IllegalStateException("unsupported");
    }
}
