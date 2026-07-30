package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class u41 implements KSerializer {
    public final KSerializer PxuCJdSBwIXG;
    public final /* synthetic */ int TSizfFm2Yiuu;
    public final d42 Y1f8riQaR6yg;
    public final KSerializer lS5Rgt96tfkO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u41(final KSerializer kSerializer, final KSerializer kSerializer2, int i) {
        this(kSerializer, kSerializer2, (byte) 0);
        this.TSizfFm2Yiuu = i;
        final int i2 = 0;
        kSerializer.getClass();
        kSerializer2.getClass();
        switch (i) {
            case 1:
                this(kSerializer, kSerializer2, (byte) 0);
                final int i3 = 1;
                this.Y1f8riQaR6yg = kj0.dgRBjINgWbAK("kotlin.Pair", new SerialDescriptor[0], new le0() { // from class: s41
                    @Override // defpackage.le0
                    public final Object OPXfSBeufaJ8(Object obj) {
                        int i4 = i3;
                        no2 no2Var = no2.PxuCJdSBwIXG;
                        KSerializer kSerializer3 = kSerializer2;
                        KSerializer kSerializer4 = kSerializer;
                        dk dkVar = (dk) obj;
                        switch (i4) {
                            case 0:
                                dkVar.getClass();
                                dk.PxuCJdSBwIXG(dkVar, "key", kSerializer4.getDescriptor());
                                dk.PxuCJdSBwIXG(dkVar, "value", kSerializer3.getDescriptor());
                                break;
                            default:
                                dkVar.getClass();
                                dk.PxuCJdSBwIXG(dkVar, "first", kSerializer4.getDescriptor());
                                dk.PxuCJdSBwIXG(dkVar, "second", kSerializer3.getDescriptor());
                                break;
                        }
                        return no2Var;
                    }
                });
                break;
            default:
                this.Y1f8riQaR6yg = kj0.x50lh2ztY7Y5("kotlin.collections.Map.Entry", wa2.RAsUl2FVSrh6, new SerialDescriptor[0], new le0() { // from class: s41
                    @Override // defpackage.le0
                    public final Object OPXfSBeufaJ8(Object obj) {
                        int i4 = i2;
                        no2 no2Var = no2.PxuCJdSBwIXG;
                        KSerializer kSerializer3 = kSerializer2;
                        KSerializer kSerializer4 = kSerializer;
                        dk dkVar = (dk) obj;
                        switch (i4) {
                            case 0:
                                dkVar.getClass();
                                dk.PxuCJdSBwIXG(dkVar, "key", kSerializer4.getDescriptor());
                                dk.PxuCJdSBwIXG(dkVar, "value", kSerializer3.getDescriptor());
                                break;
                            default:
                                dkVar.getClass();
                                dk.PxuCJdSBwIXG(dkVar, "first", kSerializer4.getDescriptor());
                                dk.PxuCJdSBwIXG(dkVar, "second", kSerializer3.getDescriptor());
                                break;
                        }
                        return no2Var;
                    }
                });
                break;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Object t41Var;
        SerialDescriptor descriptor = getDescriptor();
        op lS5Rgt96tfkO = decoder.lS5Rgt96tfkO(descriptor);
        Object obj = cs0.JTxCbbCwomzt;
        Object obj2 = obj;
        Object obj3 = obj2;
        while (true) {
            int dgRBjINgWbAK = lS5Rgt96tfkO.dgRBjINgWbAK(getDescriptor());
            if (dgRBjINgWbAK == -1) {
                if (obj2 == obj) {
                    throw new i42("Element 'key' is missing");
                }
                if (obj3 == obj) {
                    throw new i42("Element 'value' is missing");
                }
                switch (this.TSizfFm2Yiuu) {
                    case 0:
                        t41Var = new t41(obj2, obj3);
                        break;
                    default:
                        t41Var = new vi1(obj2, obj3);
                        break;
                }
                lS5Rgt96tfkO.cpQdD2nAriOS(descriptor);
                return t41Var;
            }
            if (dgRBjINgWbAK == 0) {
                obj2 = lS5Rgt96tfkO.EcgxDIVH5in8(getDescriptor(), 0, this.PxuCJdSBwIXG, null);
            } else {
                if (dgRBjINgWbAK != 1) {
                    throw new i42(o0.wdg6QnbFHrFF("Invalid index: ", dgRBjINgWbAK));
                }
                obj3 = lS5Rgt96tfkO.EcgxDIVH5in8(getDescriptor(), 1, this.lS5Rgt96tfkO, null);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.TSizfFm2Yiuu) {
        }
        return this.Y1f8riQaR6yg;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Object key;
        Object value;
        fx1 lS5Rgt96tfkO = encoder.lS5Rgt96tfkO(getDescriptor());
        SerialDescriptor descriptor = getDescriptor();
        KSerializer kSerializer = this.PxuCJdSBwIXG;
        int i = this.TSizfFm2Yiuu;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                key = entry.getKey();
                break;
            default:
                vi1 vi1Var = (vi1) obj;
                vi1Var.getClass();
                key = vi1Var.rtx2ld2ELZv4;
                break;
        }
        lS5Rgt96tfkO.ryVscX7ZL4Ux(descriptor, 0, kSerializer, key);
        SerialDescriptor descriptor2 = getDescriptor();
        KSerializer kSerializer2 = this.lS5Rgt96tfkO;
        switch (i) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                value = entry2.getValue();
                break;
            default:
                vi1 vi1Var2 = (vi1) obj;
                vi1Var2.getClass();
                value = vi1Var2.OPXfSBeufaJ8;
                break;
        }
        lS5Rgt96tfkO.ryVscX7ZL4Ux(descriptor2, 1, kSerializer2, value);
        lS5Rgt96tfkO.gGoUzNp9JO5I(getDescriptor());
    }

    public u41(KSerializer kSerializer, KSerializer kSerializer2, byte b) {
        this.PxuCJdSBwIXG = kSerializer;
        this.lS5Rgt96tfkO = kSerializer2;
    }
}
