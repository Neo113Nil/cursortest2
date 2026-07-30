package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ko1 implements KSerializer {
    public final eu0 PxuCJdSBwIXG;
    public final nx0 lS5Rgt96tfkO;

    public ko1(eu0 eu0Var) {
        eu0Var.getClass();
        this.PxuCJdSBwIXG = eu0Var;
        this.lS5Rgt96tfkO = vi0.ryVscX7ZL4Ux(pz0.rtx2ld2ELZv4, new o5(25, this));
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        op lS5Rgt96tfkO = decoder.lS5Rgt96tfkO(getDescriptor());
        String str = null;
        while (true) {
            int dgRBjINgWbAK = lS5Rgt96tfkO.dgRBjINgWbAK(getDescriptor());
            if (dgRBjINgWbAK == -1) {
                throw new IllegalArgumentException(("Polymorphic value has not been read for class " + str).toString());
            }
            if (dgRBjINgWbAK != 0) {
                if (dgRBjINgWbAK == 1) {
                    if (str == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    kj0.VhhvGxCb8gfr(this, lS5Rgt96tfkO, str);
                    throw null;
                }
                StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                if (str == null) {
                    str = "unknown class";
                }
                sb.append(str);
                sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                sb.append(dgRBjINgWbAK);
                throw new i42(sb.toString());
            }
            str = lS5Rgt96tfkO.RAsUl2FVSrh6(getDescriptor(), dgRBjINgWbAK);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.lS5Rgt96tfkO.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        obj.getClass();
        kj0.S2OOm9zPNm0h(this, encoder, obj);
        throw null;
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.PxuCJdSBwIXG + ')';
    }
}
