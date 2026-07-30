package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class nn2 implements KSerializer {
    public static final nn2 PxuCJdSBwIXG = new nn2();
    public static final ap0 lS5Rgt96tfkO = jh0.TSizfFm2Yiuu("kotlin.UByte", BuiltinSerializersKt.serializer(xg.PxuCJdSBwIXG));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new jn2(decoder.QrzZRwfaDlRX(lS5Rgt96tfkO).pnx5pC0XzaCw());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return lS5Rgt96tfkO;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.wdg6QnbFHrFF(lS5Rgt96tfkO).a92UlCVFR9N8(((jn2) obj).rtx2ld2ELZv4);
    }
}
