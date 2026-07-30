package com.ice.fishing.grenza.presentation.navigation;

import defpackage.fr0;
import defpackage.fx1;
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
public final /* synthetic */ class DetailRoute$$serializer implements kg0 {
    public static final int $stable;
    public static final DetailRoute$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DetailRoute$$serializer detailRoute$$serializer = new DetailRoute$$serializer();
        INSTANCE = detailRoute$$serializer;
        $stable = 8;
        pn1 pn1Var = new pn1("com.ice.fishing.grenza.presentation.navigation.DetailRoute", detailRoute$$serializer, 1);
        pn1Var.x50lh2ztY7Y5("id", false);
        descriptor = pn1Var;
    }

    private DetailRoute$$serializer() {
    }

    @Override // defpackage.kg0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{fr0.PxuCJdSBwIXG};
    }

    @Override // kotlinx.serialization.KSerializer
    public final DetailRoute deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        op lS5Rgt96tfkO = decoder.lS5Rgt96tfkO(serialDescriptor);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (z) {
            int dgRBjINgWbAK = lS5Rgt96tfkO.dgRBjINgWbAK(serialDescriptor);
            if (dgRBjINgWbAK == -1) {
                z = false;
            } else {
                if (dgRBjINgWbAK != 0) {
                    throw new po2(dgRBjINgWbAK);
                }
                i2 = lS5Rgt96tfkO.ZbWwgt3aGe7A(serialDescriptor, 0);
                i = 1;
            }
        }
        lS5Rgt96tfkO.cpQdD2nAriOS(serialDescriptor);
        return new DetailRoute(i, i2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, DetailRoute detailRoute) {
        encoder.getClass();
        detailRoute.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        fx1 lS5Rgt96tfkO = encoder.lS5Rgt96tfkO(serialDescriptor);
        lS5Rgt96tfkO.nLZGh9p8gVSu(0, detailRoute.PxuCJdSBwIXG, serialDescriptor);
        lS5Rgt96tfkO.gGoUzNp9JO5I(serialDescriptor);
    }

    @Override // defpackage.kg0
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return mm2.XL4ISE6Oc65B;
    }
}
