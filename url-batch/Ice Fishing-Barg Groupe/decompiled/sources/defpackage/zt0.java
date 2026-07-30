package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.TSizfFm2Yiuu;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zt0 implements KSerializer {
    public static final zt0 PxuCJdSBwIXG = new zt0();
    public static final yt0 lS5Rgt96tfkO = yt0.lS5Rgt96tfkO;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        ni0.RAsUl2FVSrh6(decoder);
        KSerializer serializer = BuiltinSerializersKt.serializer(fa2.PxuCJdSBwIXG);
        qt0 qt0Var = qt0.PxuCJdSBwIXG;
        serializer.getClass();
        return new TSizfFm2Yiuu((Map) new dj0(serializer, qt0Var, 1).e9gEMXR7LXtO(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return lS5Rgt96tfkO;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        TSizfFm2Yiuu tSizfFm2Yiuu = (TSizfFm2Yiuu) obj;
        tSizfFm2Yiuu.getClass();
        ni0.a92UlCVFR9N8(encoder);
        KSerializer serializer = BuiltinSerializersKt.serializer(fa2.PxuCJdSBwIXG);
        qt0 qt0Var = qt0.PxuCJdSBwIXG;
        serializer.getClass();
        new dj0(serializer, qt0Var, 1).serialize(encoder, tSizfFm2Yiuu);
    }
}
