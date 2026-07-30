package com.crrepa.band.my.training.utils;

import java.math.BigDecimal;

/* loaded from: classes3.dex */
public class k {
    public static String getPaceStr(float f8) {
        return com.moyoung.dafit.module.common.utils.n.format(f8, com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN) + "'" + com.moyoung.dafit.module.common.utils.n.format(new BigDecimal(Float.toString(f8)).subtract(new BigDecimal(Float.toString((int) f8))).floatValue() * 100.0f, com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN) + "\"";
    }
}
