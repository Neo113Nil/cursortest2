package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.g;

/* loaded from: classes.dex */
public abstract /* synthetic */ class q {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[g.a.values().length];
        try {
            iArr[g.a.RETRYABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.a.UNAUTHORIZED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.a.MISSING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
