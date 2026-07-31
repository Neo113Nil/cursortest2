package com.onesignal.core.internal.config;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[com.onesignal.user.internal.jwt.b.values().length];
        try {
            iArr[com.onesignal.user.internal.jwt.b.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.onesignal.user.internal.jwt.b.NOT_REQUIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.onesignal.user.internal.jwt.b.REQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
