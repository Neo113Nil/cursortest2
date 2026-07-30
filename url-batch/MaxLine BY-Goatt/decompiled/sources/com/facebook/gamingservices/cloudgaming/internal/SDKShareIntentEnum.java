package com.facebook.gamingservices.cloudgaming.internal;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public enum SDKShareIntentEnum {
    INVITE("INVITE"),
    REQUEST("REQUEST"),
    CHALLENGE("CHALLENGE"),
    SHARE("SHARE");

    private final String mStringValue;

    SDKShareIntentEnum(String str) {
        this.mStringValue = str;
    }

    public static SDKShareIntentEnum fromString(String str) {
        for (SDKShareIntentEnum sDKShareIntentEnum : values()) {
            if (sDKShareIntentEnum.toString().equals(str)) {
                return sDKShareIntentEnum;
            }
        }
        return null;
    }

    public static String validate(String str) {
        for (SDKShareIntentEnum sDKShareIntentEnum : values()) {
            if (sDKShareIntentEnum.toString().equals(str)) {
                return str;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mStringValue;
    }
}
