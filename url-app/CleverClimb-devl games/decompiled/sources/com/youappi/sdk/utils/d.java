package com.youappi.sdk.utils;

import com.tapjoy.TJAdUnitConstants;
import com.youappi.sdk.YouAPPi;
import com.youappi.sdk.net.model.AdItem;
import com.youappi.sdk.net.model.DeviceOrientation;
import com.youappi.sdk.net.model.VastError;

/* loaded from: classes2.dex */
public class d {
    public static String a(String str, DeviceOrientation deviceOrientation, int i) {
        String replace = str.replace("{duration}", String.valueOf(i)).replace("{deviceOrientation}", deviceOrientation.toString());
        return YouAPPi.getInstance().getDynamicUserId() != null ? replace.replace("{dynamicUserId}", YouAPPi.getInstance().getDynamicUserId()) : replace;
    }

    public static String a(String str, VastError vastError, String str2) {
        if (str2 == null) {
            str2 = "";
        } else if (str2.length() > 500) {
            str2 = str2.substring(0, TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL);
        }
        return str.replace("{code}", vastError != null ? String.valueOf(vastError.getCode()) : "").replace("{info}", str2);
    }

    public static boolean a(String str, AdItem adItem) {
        return (adItem == null || adItem.getEventUrls().get(str) == null || adItem.getEventUrls().get(str).isEmpty()) ? false : true;
    }
}
