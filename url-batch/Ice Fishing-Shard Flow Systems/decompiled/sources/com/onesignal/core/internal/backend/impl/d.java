package com.onesignal.core.internal.backend.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class d {
    private static final int BYTE_MASK = 255;
    private static final String HEX_DIGITS = "0123456789ABCDEF";
    private static final int HEX_NYBBLE_MASK = 15;
    private static final int HEX_NYBBLE_SHIFT = 4;
    private static final int PCT_ENCODED_MAX_OUTPUT_CHARS_PER_INPUT_BYTE = 3;
    public static final d INSTANCE = new d();
    private static final Regex FEATURES_SDK_VERSION_LABEL_REGEX = new Regex("^\\d{6}(-[^/\\s]+)?$");

    private d() {
    }

    private final boolean isUnreservedByte(int i2) {
        if (65 <= i2 && i2 < 91) {
            return true;
        }
        if (97 > i2 || i2 >= 123) {
            return (48 <= i2 && i2 < 58) || i2 == 45 || i2 == 46 || i2 == 95 || i2 == 126;
        }
        return true;
    }

    public final String buildGetPath(String appId, String platform, String sdkVersion) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        return "apps/" + appId + "/sdk/features/" + percentEncodePathSegmentUtf8$com_onesignal_core(platform) + '/' + percentEncodePathSegmentUtf8$com_onesignal_core(sdkVersion);
    }

    public final boolean isValidFeaturesSdkVersionLabel(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        return FEATURES_SDK_VERSION_LABEL_REGEX.c(label);
    }

    public final String percentEncodePathSegmentUtf8$com_onesignal_core(String segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(segment, "<this>");
        byte[] bytes = segment.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        StringBuilder sb = new StringBuilder(bytes.length * 3);
        for (byte b7 : bytes) {
            int i2 = b7 & 255;
            if (INSTANCE.isUnreservedByte(i2)) {
                sb.append((char) i2);
            } else {
                sb.append('%');
                sb.append(HEX_DIGITS.charAt(i2 >> 4));
                sb.append(HEX_DIGITS.charAt(b7 & 15));
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
