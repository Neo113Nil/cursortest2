package com.ice.fishing.grenza.data.remote;

import defpackage.fx1;
import defpackage.ha2;
import defpackage.kg0;
import defpackage.mm2;
import defpackage.ny;
import defpackage.op;
import defpackage.pn1;
import defpackage.po2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
@ny
/* loaded from: classes.dex */
public final /* synthetic */ class AnatoliaRequestFrame$$serializer implements kg0 {
    public static final int $stable;
    public static final AnatoliaRequestFrame$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AnatoliaRequestFrame$$serializer anatoliaRequestFrame$$serializer = new AnatoliaRequestFrame$$serializer();
        INSTANCE = anatoliaRequestFrame$$serializer;
        $stable = 8;
        pn1 pn1Var = new pn1("com.ice.fishing.grenza.data.remote.AnatoliaRequestFrame", anatoliaRequestFrame$$serializer, 3);
        pn1Var.x50lh2ztY7Y5("spiceLantern", false);
        pn1Var.x50lh2ztY7Y5("bazaarSaffron", false);
        pn1Var.x50lh2ztY7Y5("copperPlatter", false);
        descriptor = pn1Var;
    }

    private AnatoliaRequestFrame$$serializer() {
    }

    @Override // defpackage.kg0
    public final KSerializer[] childSerializers() {
        ha2 ha2Var = ha2.PxuCJdSBwIXG;
        return new KSerializer[]{ha2Var, ha2Var, ha2Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final AnatoliaRequestFrame deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        op lS5Rgt96tfkO = decoder.lS5Rgt96tfkO(serialDescriptor);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        String str3 = null;
        while (z) {
            int dgRBjINgWbAK = lS5Rgt96tfkO.dgRBjINgWbAK(serialDescriptor);
            if (dgRBjINgWbAK == -1) {
                z = false;
            } else if (dgRBjINgWbAK == 0) {
                str = lS5Rgt96tfkO.RAsUl2FVSrh6(serialDescriptor, 0);
                i |= 1;
            } else if (dgRBjINgWbAK == 1) {
                str2 = lS5Rgt96tfkO.RAsUl2FVSrh6(serialDescriptor, 1);
                i |= 2;
            } else {
                if (dgRBjINgWbAK != 2) {
                    throw new po2(dgRBjINgWbAK);
                }
                str3 = lS5Rgt96tfkO.RAsUl2FVSrh6(serialDescriptor, 2);
                i |= 4;
            }
        }
        lS5Rgt96tfkO.cpQdD2nAriOS(serialDescriptor);
        return new AnatoliaRequestFrame(i, str, str2, str3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, AnatoliaRequestFrame anatoliaRequestFrame) {
        encoder.getClass();
        anatoliaRequestFrame.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        fx1 lS5Rgt96tfkO = encoder.lS5Rgt96tfkO(serialDescriptor);
        lS5Rgt96tfkO.amuv7NJvPxHu(serialDescriptor, 0, anatoliaRequestFrame.PxuCJdSBwIXG);
        lS5Rgt96tfkO.amuv7NJvPxHu(serialDescriptor, 1, anatoliaRequestFrame.lS5Rgt96tfkO);
        lS5Rgt96tfkO.amuv7NJvPxHu(serialDescriptor, 2, anatoliaRequestFrame.TSizfFm2Yiuu);
        lS5Rgt96tfkO.gGoUzNp9JO5I(serialDescriptor);
    }

    @Override // defpackage.kg0
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return mm2.XL4ISE6Oc65B;
    }
}
