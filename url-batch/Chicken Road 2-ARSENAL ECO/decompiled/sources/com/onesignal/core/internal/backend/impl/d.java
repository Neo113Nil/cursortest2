package com.onesignal.core.internal.backend.impl;

import F5.i;

/* loaded from: classes.dex */
public final class d {
    private static final int BYTE_MASK = 255;
    private static final String HEX_DIGITS = "0123456789ABCDEF";
    private static final int HEX_NYBBLE_MASK = 15;
    private static final int HEX_NYBBLE_SHIFT = 4;
    private static final int PCT_ENCODED_MAX_OUTPUT_CHARS_PER_INPUT_BYTE = 3;
    public static final d INSTANCE = new d();
    private static final i FEATURES_SDK_VERSION_LABEL_REGEX = new i("^\\d{6}(-[^/\\s]+)?$");

    private d() {
    }

    private final boolean isUnreservedByte(int i7) {
        if (65 <= i7 && i7 < 91) {
            return true;
        }
        if (97 > i7 || i7 >= 123) {
            return (48 <= i7 && i7 < 58) || i7 == 45 || i7 == 46 || i7 == 95 || i7 == 126;
        }
        return true;
    }

    public final String buildGetPath(String appId, String platform, String sdkVersion) {
        kotlin.jvm.internal.i.e(appId, "appId");
        kotlin.jvm.internal.i.e(platform, "platform");
        kotlin.jvm.internal.i.e(sdkVersion, "sdkVersion");
        return "apps/" + appId + "/sdk/features/" + percentEncodePathSegmentUtf8$com_onesignal_core(platform) + '/' + percentEncodePathSegmentUtf8$com_onesignal_core(sdkVersion);
    }

    public final boolean isValidFeaturesSdkVersionLabel(String label) {
        kotlin.jvm.internal.i.e(label, "label");
        i iVar = FEATURES_SDK_VERSION_LABEL_REGEX;
        iVar.getClass();
        return iVar.f806f.matcher(label).matches();
    }

    public final String percentEncodePathSegmentUtf8$com_onesignal_core(String segment) {
        kotlin.jvm.internal.i.e(segment, "segment");
        byte[] bytes = segment.getBytes(F5.a.f785a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        StringBuilder sb = new StringBuilder(bytes.length * PCT_ENCODED_MAX_OUTPUT_CHARS_PER_INPUT_BYTE);
        for (byte b7 : bytes) {
            int i7 = b7 & 255;
            if (INSTANCE.isUnreservedByte(i7)) {
                sb.append((char) i7);
            } else {
                sb.append('%');
                sb.append(HEX_DIGITS.charAt(i7 >> HEX_NYBBLE_SHIFT));
                sb.append(HEX_DIGITS.charAt(b7 & 15));
            }
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
        return sb2;
    }
}
