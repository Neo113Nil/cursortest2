package com.squareup.cash.wallet.views;

import androidx.compose.runtime.DisposableEffectResult;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.cdf.booklet.BookletInteractDismissScreen;
import com.squareup.cash.cdf.crypto.CryptoLearnComplete;
import com.squareup.cash.cdf.crypto.LearnContentType;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.RealSheetState$ProcessQueuedNestedFlingsEffect$2$1$1$1;
import com.squareup.cash.stablecoin.presenters.nullstate.RealStablecoinNullStateCarouselPresenter;
import com.squareup.cash.support.chat.backend.real.RealChatNotificationSuppressor;
import com.squareup.cash.ui.SplashScreenAnimationObserver;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class CardTransitionKt$sceneCache$lambda$4$0$$inlined$onDispose$1 implements DisposableEffectResult {
    public final /* synthetic */ Object $fallbackScene$inlined;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CardTransitionKt$sceneCache$lambda$4$0$$inlined$onDispose$1(Object obj, int i) {
        this.$r8$classId = i;
        this.$fallbackScene$inlined = obj;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        int i = this.$r8$classId;
        Object obj = this.$fallbackScene$inlined;
        switch (i) {
            case 0:
                ((CardScene) obj).dispose();
                break;
            case 1:
                ((RealSheetState) obj).settleWithVelocity = RealSheetState$ProcessQueuedNestedFlingsEffect$2$1$1$1.INSTANCE;
                break;
            case 2:
                RealStablecoinNullStateCarouselPresenter realStablecoinNullStateCarouselPresenter = (RealStablecoinNullStateCarouselPresenter) obj;
                realStablecoinNullStateCarouselPresenter.analytics.track(new CryptoLearnComplete(Boolean.valueOf(realStablecoinNullStateCarouselPresenter.viewedPages.size() == realStablecoinNullStateCarouselPresenter.pages.size()), null, realStablecoinNullStateCarouselPresenter.userPressedCTA ? CryptoLearnComplete.LearnExitSource.CTA : CryptoLearnComplete.LearnExitSource.DISMISS, LearnContentType.STABLECOIN_CAROUSEL, null, 18), null);
                break;
            case 3:
                ((RealChatNotificationSuppressor) ((PoolsListPresenter) obj).dateFormatManager).onSurveyScreenState = false;
                break;
            case 4:
                ((SplashScreenAnimationObserver) obj).observers.decrementAndGet();
                break;
            case 5:
                ((CardSchemePresenter) obj).analytics.track(new BookletInteractDismissScreen("CARD", null, 6), null);
                break;
            default:
                ((Function0) obj).invoke();
                break;
        }
    }
}
