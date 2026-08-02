package com.squareup.cash.wallet.views;

import androidx.compose.foundation.ScrollState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class WalletHomeViewKt$WalletHome$2$2$1$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ScrollState f$0;

    public /* synthetic */ WalletHomeViewKt$WalletHome$2$2$1$$ExternalSyntheticLambda0(ScrollState scrollState, int i) {
        this.$r8$classId = i;
        this.f$0 = scrollState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ScrollState scrollState = this.f$0;
        switch (i) {
            case 0:
                return Boolean.valueOf(scrollState.scrollableState.isScrollInProgress());
            case 1:
                return Integer.valueOf(scrollState.value$delegate.getIntValue());
            case 2:
                return Integer.valueOf(scrollState.value$delegate.getIntValue());
            default:
                return Double.valueOf(scrollState.value$delegate.getIntValue() / scrollState._maxValueState.getIntValue());
        }
    }
}
