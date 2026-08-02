package com.squareup.cash.wallet.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.boost.backend.RealBoostSyncer$refresh$1;
import com.squareup.cash.cdf.cashcard.CashCardManageHideInformation;
import com.squareup.cash.cdf.cashcard.CashCardManageUnhideInformation;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.cash.wallet.presenters.PresenterEvents;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewEvent;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class WalletHomePresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ WalletHomeViewEvent $event;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ WalletHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WalletHomePresenter$models$3$1(WalletHomePresenter walletHomePresenter, WalletHomeViewEvent walletHomeViewEvent, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = walletHomePresenter;
        this.$event = walletHomeViewEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        WalletHomeViewEvent walletHomeViewEvent = this.$event;
        WalletHomePresenter walletHomePresenter = this.this$0;
        switch (i) {
            case 0:
                return new WalletHomePresenter$models$3$1(walletHomePresenter, walletHomeViewEvent, continuation, 0);
            case 1:
                return new WalletHomePresenter$models$3$1(walletHomePresenter, walletHomeViewEvent, continuation, 1);
            case 2:
                return new WalletHomePresenter$models$3$1(walletHomePresenter, walletHomeViewEvent, continuation, 2);
            case 3:
                return new WalletHomePresenter$models$3$1(walletHomePresenter, walletHomeViewEvent, continuation, 3);
            case 4:
                return new WalletHomePresenter$models$3$1(walletHomePresenter, walletHomeViewEvent, continuation, 4);
            default:
                return new WalletHomePresenter$models$3$1(walletHomePresenter, walletHomeViewEvent, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((WalletHomePresenter$models$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = this.$r8$classId;
        WalletHomeViewEvent walletHomeViewEvent = this.$event;
        WalletHomePresenter walletHomePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean z = ((WalletHomeViewEvent.ToggleCardDataVisibility) walletHomeViewEvent).visible;
                    this.label = 1;
                    Analytics analytics = walletHomePresenter.analytics;
                    if (!z) {
                        if (z) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            analytics.track(new CashCardManageHideInformation(), null);
                        }
                    } else {
                        analytics.track(new CashCardManageUnhideInformation(), null);
                    }
                    IssuedCardManager issuedCardManager = walletHomePresenter.issuedCardManager;
                    if (z) {
                        obj2 = ((RealIssuedCardManager) issuedCardManager).retrieveCardDetails(new WalletHomeScreen(7, (Integer) null, (String) null), null, new RealBoostSyncer$refresh$1(walletHomePresenter, null, 8), new PageTagSlotKt$$ExternalSyntheticLambda0(walletHomePresenter, 11), new AlertBannerKt$$ExternalSyntheticLambda3(walletHomePresenter, 14), this);
                        if (obj2 != coroutineSingletons) {
                            obj2 = Unit.INSTANCE;
                        }
                    } else {
                        StateFlowImpl stateFlowImpl = ((RealIssuedCardManager) issuedCardManager).issuedCardFactory;
                        ((IssuedCardFactory) stateFlowImpl.getValue()).getClass();
                        stateFlowImpl.updateState(null, new IssuedCardFactory(null));
                        obj2 = Unit.INSTANCE;
                    }
                    if (obj2 == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl = walletHomePresenter.cardSchemeEvents;
                    WalletHomeViewEvent.NextUpCardDismissed nextUpCardDismissed = (WalletHomeViewEvent.NextUpCardDismissed) walletHomeViewEvent;
                    PresenterEvents.NextUpCardDismissed nextUpCardDismissed2 = new PresenterEvents.NextUpCardDismissed(nextUpCardDismissed.id, nextUpCardDismissed.actionId, nextUpCardDismissed.method);
                    this.label = 1;
                    if (sharedFlowImpl.emit(nextUpCardDismissed2, this) == coroutineSingletons2) {
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
                    PresenterEvents.PageChanged pageChanged = new PresenterEvents.PageChanged(((WalletHomeViewEvent.PageChanged) walletHomeViewEvent).page);
                    this.label = 1;
                    if (sharedFlowImpl2.emit(pageChanged, this) == coroutineSingletons3) {
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
                    PresenterEvents.CarouselEvents carouselEvents = new PresenterEvents.CarouselEvents(((WalletHomeViewEvent.NullStateCarouselEvent) walletHomeViewEvent).value);
                    this.label = 1;
                    if (sharedFlowImpl3.emit(carouselEvents, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl4 = walletHomePresenter.cardSchemeEvents;
                    PresenterEvents.NextUpCardClicked nextUpCardClicked = new PresenterEvents.NextUpCardClicked(((WalletHomeViewEvent.NextUpCardClicked) walletHomeViewEvent).actionId);
                    this.label = 1;
                    if (sharedFlowImpl4.emit(nextUpCardClicked, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl5 = walletHomePresenter.cardSchemeEvents;
                    WalletHomeViewEvent.NextUpCardViewed nextUpCardViewed = (WalletHomeViewEvent.NextUpCardViewed) walletHomeViewEvent;
                    PresenterEvents.NextUpCardViewed nextUpCardViewed2 = new PresenterEvents.NextUpCardViewed(nextUpCardViewed.id, nextUpCardViewed.actionId);
                    this.label = 1;
                    if (sharedFlowImpl5.emit(nextUpCardViewed2, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
