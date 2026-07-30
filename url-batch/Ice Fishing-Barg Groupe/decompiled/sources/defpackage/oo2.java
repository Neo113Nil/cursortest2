package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class oo2 implements KSerializer {
    public static final oo2 lS5Rgt96tfkO = new oo2();
    public final /* synthetic */ re1 PxuCJdSBwIXG = new re1(no2.PxuCJdSBwIXG, "kotlin.Unit");

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        this.PxuCJdSBwIXG.deserialize(decoder);
        return no2.PxuCJdSBwIXG;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.PxuCJdSBwIXG.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        no2 no2Var = (no2) obj;
        no2Var.getClass();
        this.PxuCJdSBwIXG.serialize(encoder, no2Var);
    }
}
