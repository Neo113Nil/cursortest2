package com.squareup.cash.work.applets.views;

import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.cash.staff.syncvalues.CashForWorkAppletV1;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class WorkApplet$appletAvailabilityState$1$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[CashForWorkAppletV1.Visibility.values().length];
        try {
            TransactionType.Companion companion = CashForWorkAppletV1.Visibility.Companion;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            TransactionType.Companion companion2 = CashForWorkAppletV1.Visibility.Companion;
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
