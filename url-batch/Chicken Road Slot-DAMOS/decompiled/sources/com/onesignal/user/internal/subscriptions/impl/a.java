package com.onesignal.user.internal.subscriptions.impl;

import dd.g;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.SMS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.PUSH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
