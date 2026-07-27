package com.onesignal.core.internal.backend.impl;

import B4.a;
import B4.j;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class TurbineSdkFeatureFlagsPath {
    private static final int BYTE_MASK = 255;
    private static final String HEX_DIGITS = "0123456789ABCDEF";
    private static final int HEX_NYBBLE_MASK = 15;
    private static final int HEX_NYBBLE_SHIFT = 4;
    private static final int PCT_ENCODED_MAX_OUTPUT_CHARS_PER_INPUT_BYTE = 3;
    public static final TurbineSdkFeatureFlagsPath INSTANCE = new TurbineSdkFeatureFlagsPath();
    private static final j FEATURES_SDK_VERSION_LABEL_REGEX = new j("^\\d{6}(-[^/\\s]+)?$");

    private TurbineSdkFeatureFlagsPath() {
    }

    private final boolean isUnreservedByte(int i2) {
        return (65 <= i2 && i2 < 91) || (97 <= i2 && i2 < 123) || ((48 <= i2 && i2 < 58) || i2 == 45 || i2 == 46 || i2 == 95 || i2 == 126);
    }

    public final String buildGetPath(String appId, String platform, String sdkVersion) {
        i.e(appId, "appId");
        i.e(platform, "platform");
        i.e(sdkVersion, "sdkVersion");
        return "apps/" + appId + "/sdk/features/" + percentEncodePathSegmentUtf8$com_onesignal_core(platform) + '/' + percentEncodePathSegmentUtf8$com_onesignal_core(sdkVersion);
    }

    public final boolean isValidFeaturesSdkVersionLabel(String label) {
        i.e(label, "label");
        j jVar = FEATURES_SDK_VERSION_LABEL_REGEX;
        jVar.getClass();
        return jVar.f314a.matcher(label).matches();
    }

    public final String percentEncodePathSegmentUtf8$com_onesignal_core(String segment) {
        i.e(segment, "segment");
        byte[] bytes = segment.getBytes(a.f287a);
        i.d(bytes, "getBytes(...)");
        StringBuilder sb = new StringBuilder(bytes.length * 3);
        for (byte b6 : bytes) {
            int i2 = b6 & 255;
            if (INSTANCE.isUnreservedByte(i2)) {
                sb.append((char) i2);
            } else {
                sb.append('%');
                sb.append(HEX_DIGITS.charAt(i2 >> 4));
                sb.append(HEX_DIGITS.charAt(b6 & 15));
            }
        }
        String sb2 = sb.toString();
        i.d(sb2, "toString(...)");
        return sb2;
    }
}
