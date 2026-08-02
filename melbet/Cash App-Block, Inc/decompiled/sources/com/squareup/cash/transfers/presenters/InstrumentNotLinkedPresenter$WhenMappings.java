package com.squareup.cash.transfers.presenters;

import com.squareup.cash.transfers.data.TransferType;
import com.squareup.protos.franklin.api.DepositPreference;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class InstrumentNotLinkedPresenter$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[TransferType.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            TransferType transferType = TransferType.ADD_CASH;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[DepositPreference.values().length];
        try {
            iArr2[DepositPreference.TRANSFER_INSTANTLY_WITH_FEE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[DepositPreference.TRANSFER_SLOWLY_WITHOUT_FEE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
