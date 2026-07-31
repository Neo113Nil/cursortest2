package com.onesignal.core.internal.backend.impl;

import com.google.firebase.messaging.Constants;
import com.onesignal.core.BuildConfig;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: TurbineSdkFeatureFlagsPath.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\bJ\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/onesignal/core/internal/backend/impl/TurbineSdkFeatureFlagsPath;", "", "()V", "BYTE_MASK", "", "FEATURES_SDK_VERSION_LABEL_REGEX", "Lkotlin/text/Regex;", "HEX_DIGITS", "", "HEX_NYBBLE_MASK", "HEX_NYBBLE_SHIFT", "PCT_ENCODED_MAX_OUTPUT_CHARS_PER_INPUT_BYTE", "buildGetPath", "appId", "platform", "sdkVersion", "isUnreservedByte", "", "u", "isValidFeaturesSdkVersionLabel", Constants.ScionAnalytics.PARAM_LABEL, "percentEncodePathSegmentUtf8", "segment", "percentEncodePathSegmentUtf8$com_onesignal_core", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TurbineSdkFeatureFlagsPath {
    private static final int BYTE_MASK = 255;
    private static final String HEX_DIGITS = "0123456789ABCDEF";
    private static final int HEX_NYBBLE_MASK = 15;
    private static final int HEX_NYBBLE_SHIFT = 4;
    private static final int PCT_ENCODED_MAX_OUTPUT_CHARS_PER_INPUT_BYTE = 3;
    public static final TurbineSdkFeatureFlagsPath INSTANCE = new TurbineSdkFeatureFlagsPath();
    private static final Regex FEATURES_SDK_VERSION_LABEL_REGEX = new Regex("^\\d{6}(-[^/\\s]+)?$");

    private final boolean isUnreservedByte(int u) {
        if (65 <= u && u < 91) {
            return true;
        }
        if (97 > u || u >= 123) {
            return (48 <= u && u < 58) || u == 45 || u == 46 || u == 95 || u == 126;
        }
        return true;
    }

    private TurbineSdkFeatureFlagsPath() {
    }

    public final boolean isValidFeaturesSdkVersionLabel(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        return FEATURES_SDK_VERSION_LABEL_REGEX.matches(label);
    }

    public final String buildGetPath(String appId, String platform, String sdkVersion) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        return "apps/" + appId + "/sdk/features/" + percentEncodePathSegmentUtf8$com_onesignal_core(platform) + IOUtils.DIR_SEPARATOR_UNIX + percentEncodePathSegmentUtf8$com_onesignal_core(sdkVersion);
    }

    public final String percentEncodePathSegmentUtf8$com_onesignal_core(String segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        byte[] encodeToByteArray = StringsKt.encodeToByteArray(segment);
        StringBuilder sb = new StringBuilder(encodeToByteArray.length * 3);
        for (byte b : encodeToByteArray) {
            int i = b & UByte.MAX_VALUE;
            if (INSTANCE.isUnreservedByte(i)) {
                sb.append((char) i);
            } else {
                sb.append('%');
                sb.append(HEX_DIGITS.charAt(i >> 4));
                sb.append(HEX_DIGITS.charAt(b & 15));
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
