package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.g;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[g.a.values().length];
        try {
            iArr[g.a.RETRYABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.a.INVALID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.a.CONFLICT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g.a.UNAUTHORIZED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[g.a.MISSING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
