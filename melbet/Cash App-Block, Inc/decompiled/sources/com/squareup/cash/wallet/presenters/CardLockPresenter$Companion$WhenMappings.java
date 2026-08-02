package com.squareup.cash.wallet.presenters;

import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.franklin.api.UiAlias;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class CardLockPresenter$Companion$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[Flow$Type.values().length];
        try {
            UiAlias.Type.Companion companion = Flow$Type.Companion;
            iArr[507] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
