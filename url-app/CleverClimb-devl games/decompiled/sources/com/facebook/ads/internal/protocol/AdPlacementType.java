package com.facebook.ads.internal.protocol;

import android.support.v4.os.EnvironmentCompat;
import android.text.TextUtils;
import com.mopub.common.AdType;
import com.tapjoy.TapjoyConstants;
import java.util.Locale;

/* loaded from: classes.dex */
public enum AdPlacementType {
    UNKNOWN(EnvironmentCompat.MEDIA_UNKNOWN),
    BANNER("banner"),
    INTERSTITIAL(AdType.INTERSTITIAL),
    NATIVE(TapjoyConstants.TJC_PLUGIN_NATIVE),
    INSTREAM("instream"),
    REWARDED_VIDEO(AdType.REWARDED_VIDEO);


    /* renamed from: a, reason: collision with root package name */
    private String f5361a;

    AdPlacementType(String str) {
        this.f5361a = str;
    }

    public static AdPlacementType fromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return UNKNOWN;
        }
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (Exception unused) {
            return UNKNOWN;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f5361a;
    }
}
