package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.g;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[na.b.values().length];
        try {
            iArr[na.b.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[na.b.FAIL_CONFLICT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[na.b.FAIL_NORETRY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[g.a.values().length];
        try {
            iArr2[g.a.RETRYABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[g.a.UNAUTHORIZED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[dd.g.values().length];
        try {
            iArr3[dd.g.SMS.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[dd.g.EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$2 = iArr3;
    }
}
