package com.squareup.cash.wallet.views;

import androidx.compose.foundation.pager.DefaultPagerState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public final /* synthetic */ class WalletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$3$1$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultPagerState f$0;

    public /* synthetic */ WalletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$3$1$$ExternalSyntheticLambda0(DefaultPagerState defaultPagerState, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultPagerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int settledPage;
        int i = this.$r8$classId;
        DefaultPagerState defaultPagerState = this.f$0;
        switch (i) {
            case 0:
                settledPage = defaultPagerState.getSettledPage();
                break;
            default:
                settledPage = defaultPagerState.getSettledPage();
                break;
        }
        return Integer.valueOf(settledPage);
    }
}
