package com.stripe.hcaptcha;

import java.io.Serializable;
import kotlin.enums.EnumEntriesList;
import net.idrnd.face.iad.capture.Plane;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class HCaptchaError implements Serializable {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ HCaptchaError[] $VALUES;
    public static final HCaptchaError CHALLENGE_CLOSED;
    public static final Plane Companion;
    public static final HCaptchaError ERROR;
    public static final HCaptchaError INSECURE_HTTP_REQUEST_ERROR;
    public static final HCaptchaError SESSION_TIMEOUT;
    public static final HCaptchaError TOKEN_TIMEOUT;
    public final int errorId;
    public final String message;

    static {
        HCaptchaError hCaptchaError = new HCaptchaError("NETWORK_ERROR", 0, 7, "No internet connection");
        HCaptchaError hCaptchaError2 = new HCaptchaError("INVALID_DATA", 1, 8, "Invalid data is not accepted by endpoints");
        HCaptchaError hCaptchaError3 = new HCaptchaError("CHALLENGE_ERROR", 2, 9, "Challenge encountered error on setup");
        HCaptchaError hCaptchaError4 = new HCaptchaError("INTERNAL_ERROR", 3, 10, "hCaptcha client encountered an internal error");
        HCaptchaError hCaptchaError5 = new HCaptchaError("SESSION_TIMEOUT", 4, 15, "Session Timeout");
        SESSION_TIMEOUT = hCaptchaError5;
        HCaptchaError hCaptchaError6 = new HCaptchaError("TOKEN_TIMEOUT", 5, 16, "Token Timeout");
        TOKEN_TIMEOUT = hCaptchaError6;
        HCaptchaError hCaptchaError7 = new HCaptchaError("CHALLENGE_CLOSED", 6, 30, "Challenge Closed");
        CHALLENGE_CLOSED = hCaptchaError7;
        HCaptchaError hCaptchaError8 = new HCaptchaError("RATE_LIMITED", 7, 31, "Rate Limited");
        HCaptchaError hCaptchaError9 = new HCaptchaError("INVALID_CUSTOM_THEME", 8, 32, "Invalid custom theme");
        HCaptchaError hCaptchaError10 = new HCaptchaError("INSECURE_HTTP_REQUEST_ERROR", 9, 33, "Insecure resource requested");
        INSECURE_HTTP_REQUEST_ERROR = hCaptchaError10;
        HCaptchaError hCaptchaError11 = new HCaptchaError("ERROR", 10, 29, "Unknown error");
        ERROR = hCaptchaError11;
        HCaptchaError[] hCaptchaErrorArr = {hCaptchaError, hCaptchaError2, hCaptchaError3, hCaptchaError4, hCaptchaError5, hCaptchaError6, hCaptchaError7, hCaptchaError8, hCaptchaError9, hCaptchaError10, hCaptchaError11};
        $VALUES = hCaptchaErrorArr;
        $ENTRIES = new EnumEntriesList(hCaptchaErrorArr);
        Companion = new Plane(18);
    }

    public HCaptchaError(String str, int i, int i2, String str2) {
        this.errorId = i2;
        this.message = str2;
    }

    public static HCaptchaError valueOf(String str) {
        return (HCaptchaError) Enum.valueOf(HCaptchaError.class, str);
    }

    public static HCaptchaError[] values() {
        return (HCaptchaError[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.message;
    }
}
