package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class go2 implements KSerializer {
    public static final go2 PxuCJdSBwIXG = new go2();
    public static final ap0 lS5Rgt96tfkO = jh0.TSizfFm2Yiuu("kotlin.UShort", BuiltinSerializersKt.serializer(o52.PxuCJdSBwIXG));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new co2(decoder.QrzZRwfaDlRX(lS5Rgt96tfkO).IAToe7bXGz4N());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return lS5Rgt96tfkO;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.wdg6QnbFHrFF(lS5Rgt96tfkO).e9gEMXR7LXtO(((co2) obj).rtx2ld2ELZv4);
    }
}
