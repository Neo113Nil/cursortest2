package com.bytedance.adsdk.zmn;

import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class nps$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ BigDecimal m(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}
