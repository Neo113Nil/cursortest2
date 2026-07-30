package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.lS5Rgt96tfkO;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vt0 implements KSerializer {
    public static final vt0 PxuCJdSBwIXG = new vt0();
    public static final dq1 lS5Rgt96tfkO;

    static {
        cq1 cq1Var = cq1.cpQdD2nAriOS;
        if (ia2.fRTaYY6FBZcX("kotlinx.serialization.json.JsonLiteral")) {
            u9.XL4ISE6Oc65B("Blank serial names are prohibited");
            return;
        }
        Object it = ((q41) eq1.PxuCJdSBwIXG.values()).iterator();
        while (((n41) it).hasNext()) {
            KSerializer kSerializer = (KSerializer) ((l41) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(kSerializer.getDescriptor().lS5Rgt96tfkO())) {
                u9.XL4ISE6Oc65B(ja2.i68hK7ahKtgp("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + bu1.PxuCJdSBwIXG(kSerializer.getClass()).TSizfFm2Yiuu() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
                return;
            }
        }
        lS5Rgt96tfkO = new dq1("kotlinx.serialization.json.JsonLiteral", cq1Var);
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        ba2 RAsUl2FVSrh6 = ni0.RAsUl2FVSrh6(decoder);
        lS5Rgt96tfkO jJwa0q7P5wHq = RAsUl2FVSrh6.jJwa0q7P5wHq();
        if (jJwa0q7P5wHq instanceof ut0) {
            return (ut0) jJwa0q7P5wHq;
        }
        throw new nt0(vi0.EcgxDIVH5in8(-1, "Unexpected JSON element, expected JsonLiteral, had " + bu1.PxuCJdSBwIXG(jJwa0q7P5wHq.getClass()), null, null, RAsUl2FVSrh6.D0aTLcX6Uhyo().PxuCJdSBwIXG.TSizfFm2Yiuu ? vi0.Pf0ThKz3j5YS(jJwa0q7P5wHq.toString(), -1).toString() : null));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return lS5Rgt96tfkO;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        Double d;
        ut0 ut0Var = (ut0) obj;
        ut0Var.getClass();
        String str = ut0Var.OPXfSBeufaJ8;
        ni0.a92UlCVFR9N8(encoder);
        if (ut0Var.rtx2ld2ELZv4) {
            encoder.gPXPFXrUH4XX(str);
            return;
        }
        Long qudtW7lwm99e = pa2.qudtW7lwm99e(str);
        if (qudtW7lwm99e != null) {
            encoder.r3s1LDPKFs1S(qudtW7lwm99e.longValue());
            return;
        }
        vn2 i68hK7ahKtgp = kj0.i68hK7ahKtgp(str);
        if (i68hK7ahKtgp != null) {
            encoder.wdg6QnbFHrFF(BuiltinSerializersKt.serializer(vn2.Companion).getDescriptor()).r3s1LDPKFs1S(i68hK7ahKtgp.rtx2ld2ELZv4);
            return;
        }
        Boolean bool = null;
        if (oa2.wLFCmsViZrNT(str)) {
            d = Double.valueOf(Double.parseDouble(str));
            if (d == null) {
                encoder.Y1f8riQaR6yg(d.doubleValue());
                return;
            }
            if (str.equals("true")) {
                bool = Boolean.TRUE;
            } else if (str.equals("false")) {
                bool = Boolean.FALSE;
            }
            if (bool != null) {
                encoder.RAsUl2FVSrh6(bool.booleanValue());
                return;
            } else {
                encoder.gPXPFXrUH4XX(str);
                return;
            }
        }
        d = null;
        if (d == null) {
        }
    }
}
