package com.applovin.sdk;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public class AppLovinAdType {
    private final String a;
    public static final AppLovinAdType REGULAR = new AppLovinAdType("REGULAR");
    public static final AppLovinAdType APP_OPEN = new AppLovinAdType(BrandSafetyUtils.l);
    public static final AppLovinAdType INCENTIVIZED = new AppLovinAdType("VIDEOA");
    public static final AppLovinAdType NATIVE = new AppLovinAdType("NATIVE");

    private AppLovinAdType(String str) {
        this.a = str;
    }

    public static AppLovinAdType fromString(String str) {
        if ("REGULAR".equalsIgnoreCase(str)) {
            return REGULAR;
        }
        if (BrandSafetyUtils.l.equalsIgnoreCase(str)) {
            return APP_OPEN;
        }
        if ("VIDEOA".equalsIgnoreCase(str)) {
            return INCENTIVIZED;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException("Unknown Ad Type: " + str);
    }

    public String getLabel() {
        return this.a.toUpperCase(Locale.ENGLISH);
    }

    public String toString() {
        return getLabel();
    }
}
