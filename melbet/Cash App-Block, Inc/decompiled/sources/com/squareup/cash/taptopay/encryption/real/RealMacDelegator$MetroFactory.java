package com.squareup.cash.taptopay.encryption.real;

import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.notifications.Op;
import com.squareup.cropview.Edge;
import com.squareup.protos.binfo.api.CardProduct;
import dev.chrisbanes.haze.Pool;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class RealMacDelegator$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public static final RealMacDelegator$MetroFactory INSTANCE$1 = new RealMacDelegator$MetroFactory(1);
    public static final RealMacDelegator$MetroFactory INSTANCE = new RealMacDelegator$MetroFactory(0);
    public static final RealMacDelegator$MetroFactory INSTANCE$2 = new RealMacDelegator$MetroFactory(2);
    public static final RealMacDelegator$MetroFactory INSTANCE$3 = new RealMacDelegator$MetroFactory(3);
    public static final RealMacDelegator$MetroFactory INSTANCE$4 = new RealMacDelegator$MetroFactory(4);

    public /* synthetic */ RealMacDelegator$MetroFactory(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return new Pool(1);
            case 1:
                return new JCAContext((byte) 0, 26);
            case 2:
                return new Edge.Companion(11);
            case 3:
                return new Op.Companion();
            default:
                return new CardProduct.Companion(12);
        }
    }
}
