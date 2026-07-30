package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class re1 implements KSerializer {
    public final Object PxuCJdSBwIXG;
    public final nx0 TSizfFm2Yiuu;
    public final List lS5Rgt96tfkO;

    public re1(Object obj, String str) {
        obj.getClass();
        this.PxuCJdSBwIXG = obj;
        this.lS5Rgt96tfkO = p50.rtx2ld2ELZv4;
        this.TSizfFm2Yiuu = vi0.ryVscX7ZL4Ux(pz0.rtx2ld2ELZv4, new e6(19, str, this));
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        op lS5Rgt96tfkO = decoder.lS5Rgt96tfkO(descriptor);
        int dgRBjINgWbAK = lS5Rgt96tfkO.dgRBjINgWbAK(getDescriptor());
        if (dgRBjINgWbAK != -1) {
            throw new i42(o0.wdg6QnbFHrFF("Unexpected index ", dgRBjINgWbAK));
        }
        lS5Rgt96tfkO.cpQdD2nAriOS(descriptor);
        return this.PxuCJdSBwIXG;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.TSizfFm2Yiuu.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        obj.getClass();
        encoder.lS5Rgt96tfkO(getDescriptor()).gGoUzNp9JO5I(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public re1(String str, Object obj, Annotation[] annotationArr) {
        this(obj, str);
        obj.getClass();
        List asList = Arrays.asList(annotationArr);
        asList.getClass();
        this.lS5Rgt96tfkO = asList;
    }
}
