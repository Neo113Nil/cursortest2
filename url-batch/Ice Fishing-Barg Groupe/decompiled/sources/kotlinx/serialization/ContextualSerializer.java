package kotlinx.serialization;

import defpackage.k42;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ContextualSerializer<T> implements KSerializer {
    private final KSerializer serializer(k42 k42Var) {
        k42Var.PxuCJdSBwIXG(null, null);
        throw null;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return decoder.x50lh2ztY7Y5(serializer(decoder.PxuCJdSBwIXG()));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return null;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        obj.getClass();
        encoder.dgRBjINgWbAK(serializer(encoder.PxuCJdSBwIXG()), obj);
    }
}
