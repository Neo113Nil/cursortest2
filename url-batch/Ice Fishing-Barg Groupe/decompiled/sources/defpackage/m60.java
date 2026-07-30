package defpackage;

import java.util.Arrays;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class m60 implements KSerializer {
    public final Enum[] PxuCJdSBwIXG;
    public final qc2 lS5Rgt96tfkO;

    public m60(String str, Enum[] enumArr) {
        this.PxuCJdSBwIXG = enumArr;
        this.lS5Rgt96tfkO = new qc2(new e6(9, this, str));
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int wdg6QnbFHrFF = decoder.wdg6QnbFHrFF(getDescriptor());
        Enum[] enumArr = this.PxuCJdSBwIXG;
        if (wdg6QnbFHrFF >= 0 && wdg6QnbFHrFF < enumArr.length) {
            return enumArr[wdg6QnbFHrFF];
        }
        throw new i42(wdg6QnbFHrFF + " is not among valid " + getDescriptor().lS5Rgt96tfkO() + " enum values, values size is " + enumArr.length);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.lS5Rgt96tfkO.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Enum r5 = (Enum) obj;
        r5.getClass();
        Enum[] enumArr = this.PxuCJdSBwIXG;
        int hnJvRxDXo0hm = na.hnJvRxDXo0hm(enumArr, r5);
        if (hnJvRxDXo0hm != -1) {
            encoder.rtx2ld2ELZv4(getDescriptor(), hnJvRxDXo0hm);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String lS5Rgt96tfkO = getDescriptor().lS5Rgt96tfkO();
        String arrays = Arrays.toString(enumArr);
        arrays.getClass();
        sb.append(" is not a valid enum ");
        sb.append(lS5Rgt96tfkO);
        sb.append(", must be one of ");
        sb.append(arrays);
        throw new i42(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().lS5Rgt96tfkO() + '>';
    }
}
