package com.squareup.cash.wallet.presenters;

import app.cash.badging.api.BadgingState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.advertising.screens.FullscreenAdScreen;
import com.squareup.cash.appmessages.CardTabPopupAppMessage;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.cash.appmessages.overlay.OverlayAppMessagePlacement;
import com.squareup.cash.appmessages.overlay.OverlayAppMessageToken;
import com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.detailspage.DetailsPageInteractViewPage;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.wallet.presenters.PresenterEvents;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class WalletHomePresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ WalletHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WalletHomePresenter$models$2$1(WalletHomePresenter walletHomePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = walletHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        WalletHomePresenter walletHomePresenter = this.this$0;
        switch (i) {
            case 0:
                return new WalletHomePresenter$models$2$1(walletHomePresenter, continuation, 0);
            case 1:
                return new WalletHomePresenter$models$2$1(walletHomePresenter, continuation, 1);
            case 2:
                return new WalletHomePresenter$models$2$1(walletHomePresenter, continuation, 2);
            case 3:
                return new WalletHomePresenter$models$2$1(walletHomePresenter, continuation, 3);
            default:
                return new WalletHomePresenter$models$2$1(walletHomePresenter, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((WalletHomePresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        int i = this.$r8$classId;
        WalletHomePresenter walletHomePresenter = this.this$0;
        switch (i) {
            case 0:
                BetterNavigator.ScreenNavigator screenNavigator = walletHomePresenter.navigator;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealOverlayAppMessageReader realOverlayAppMessageReader = walletHomePresenter.overlayAppMessageReader;
                    OverlayAppMessagePlacement overlayAppMessagePlacement = OverlayAppMessagePlacement.CardTab;
                    this.label = 1;
                    obj = realOverlayAppMessageReader.pendingMessageFor(overlayAppMessagePlacement, this);
                    if (obj == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                OverlayAppMessageToken overlayAppMessageToken = (OverlayAppMessageToken) obj;
                if (!(overlayAppMessageToken instanceof OverlayAppMessageToken.PopupToken)) {
                    if (!(overlayAppMessageToken instanceof OverlayAppMessageToken.SheetToken)) {
                        if (!(overlayAppMessageToken instanceof OverlayAppMessageToken.FullScreenToken)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            screenNavigator.goTo(new FullscreenAdScreen(((OverlayAppMessageToken.FullScreenToken) overlayAppMessageToken).token));
                        }
                    } else {
                        screenNavigator.goTo(new SheetAppMessage(((OverlayAppMessageToken.SheetToken) overlayAppMessageToken).token, DetailsPageInteractViewPage.DetailsPageOrigin.CARD_TAB, walletHomePresenter.args));
                    }
                } else {
                    screenNavigator.goTo(CardTabPopupAppMessage.INSTANCE);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl = walletHomePresenter.cardSchemeEvents;
                    this.label = 1;
                    if (sharedFlowImpl.emit(PresenterEvents.NewTagPeekConsumed.INSTANCE, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl2 = walletHomePresenter.cardSchemeEvents;
                    this.label = 1;
                    if (sharedFlowImpl2.emit(PresenterEvents.PrepurchaseToggleTapped.INSTANCE, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl3 = walletHomePresenter.cardSchemeEvents;
                    this.label = 1;
                    if (sharedFlowImpl3.emit(PresenterEvents.VerticalScroll.INSTANCE, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = walletHomePresenter.badgingState;
                    this.label = 1;
                    obj = FlowKt.firstOrNull(flow, this);
                    if (obj == coroutineSingletons5) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                BadgingState badgingState = (BadgingState) obj;
                if (badgingState != null) {
                    long j = badgingState.identityVerification;
                    Long valueOf = Long.valueOf(j);
                    if (j <= 0) {
                        valueOf = null;
                    }
                    str = valueOf != null ? "identity_hub" : null;
                } else {
                    str = null;
                }
                walletHomePresenter.analytics.track(new AppNavigateOpenSpace(null, null, AppNavigateOpenSpace.Space.CARD, str, 95), null);
                break;
        }
        return Unit.INSTANCE;
    }
}
