package com.squareup.cash.wallet.views;

import androidx.compose.foundation.ScrollState;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class WalletHomeViewKt$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ScrollState f$0;
    public final /* synthetic */ float f$1;

    public /* synthetic */ WalletHomeViewKt$$ExternalSyntheticLambda5(ScrollState scrollState, float f, int i) {
        this.$r8$classId = i;
        this.f$0 = scrollState;
        this.f$1 = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        float f = this.f$1;
        ScrollState scrollState = this.f$0;
        switch (i) {
            case 0:
                return Float.valueOf(((float) scrollState.value$delegate.getIntValue()) < f ? RecyclerView.DECELERATION_RATE : 1.0f);
            case 1:
                return Boolean.valueOf(((float) scrollState.value$delegate.getIntValue()) > f);
            case 2:
                return Boolean.valueOf(((float) scrollState.value$delegate.getIntValue()) > f);
            default:
                return Boolean.valueOf(((float) scrollState.value$delegate.getIntValue()) > f);
        }
    }
}
