package com.onesignal.session.internal.outcomes.impl;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[oc.d.values().length];
        try {
            iArr[oc.d.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[oc.d.INDIRECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[oc.d.UNATTRIBUTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[oc.d.DISABLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[oc.c.values().length];
        try {
            iArr2[oc.c.IAM.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[oc.c.NOTIFICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
