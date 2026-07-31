package io.appmetrica.analytics.impl;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* renamed from: io.appmetrica.analytics.impl.fa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2621fa {
    public static final String a(int i4) {
        switch (i4) {
            case 1:
                return "APPSFLYER";
            case 2:
                return "ADJUST";
            case 3:
                return "KOCHAVA";
            case 4:
                return "TENJIN";
            case 5:
                return "AIRBRIDGE";
            case 6:
                return "SINGULAR";
            default:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }
}
