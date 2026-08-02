package com.squareup.cash.transfers.presenters;

import com.squareup.protos.franklin.api.ClientScenario;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class SetDefaultInstrumentPresenter$models$2$1$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ClientScenario.values().length];
        try {
            iArr[ClientScenario.PROFILE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClientScenario.TRANSFER_FUNDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
