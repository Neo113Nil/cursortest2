package com.squareup.cash.wallet.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.money.MoneySelectAction;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsService;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.preferences.values.MoneyTabCardIntroState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class CardAppletTilePresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ CardAppletTilePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardAppletTilePresenter$models$1$1(CardAppletTilePresenter cardAppletTilePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cardAppletTilePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CardAppletTilePresenter cardAppletTilePresenter = this.this$0;
        switch (i) {
            case 0:
                return new CardAppletTilePresenter$models$1$1(cardAppletTilePresenter, continuation, 0);
            case 1:
                return new CardAppletTilePresenter$models$1$1(cardAppletTilePresenter, continuation, 1);
            case 2:
                return new CardAppletTilePresenter$models$1$1(cardAppletTilePresenter, continuation, 2);
            case 3:
                return new CardAppletTilePresenter$models$1$1(cardAppletTilePresenter, continuation, 3);
            default:
                return new CardAppletTilePresenter$models$1$1(cardAppletTilePresenter, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CardAppletTilePresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        if (r8 == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(3750, r8) == r0) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardAppletTilePresenter cardAppletTilePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    ((RealMoneyAnalyticsService) cardAppletTilePresenter.moneyAnalyticsService).submitSelectItemEvent(ItemId.CARD.INSTANCE, null, MoneySelectAction.TAP);
                    cardAppletTilePresenter.navigator.goTo(new WalletHomeScreen(7, (Integer) null, (String) null));
                    if (Unit.INSTANCE == coroutineSingletons) {
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
                    this.label = 1;
                    ((RealMoneyAnalyticsService) cardAppletTilePresenter.moneyAnalyticsService).submitSelectItemEvent(ItemId.PROMOTED_CARD.INSTANCE, null, MoneySelectAction.TAP);
                    cardAppletTilePresenter.navigator.goTo(new WalletHomeScreen(7, (Integer) null, (String) null));
                    if (Unit.INSTANCE == coroutineSingletons2) {
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
                    this.label = 1;
                    ((RealMoneyAnalyticsService) cardAppletTilePresenter.moneyAnalyticsService).submitSelectItemEvent(ItemId.LITE_UNINSTALLED_CARD.INSTANCE, null, MoneySelectAction.TAP);
                    cardAppletTilePresenter.navigator.goTo(new WalletHomeScreen(7, (Integer) null, (String) null));
                    if (Unit.INSTANCE == coroutineSingletons3) {
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
                    if (cardAppletTilePresenter.filamentSupportProvider.isDeviceSupported() && ((Boolean) cardAppletTilePresenter.isCardAnimationEnabled$delegate.getValue()).booleanValue()) {
                        this.label = 1;
                        break;
                    }
                } else if (i5 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i5 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                CardAppletTileRepository cardAppletTileRepository = cardAppletTilePresenter.repository;
                this.label = 2;
                Object obj2 = ((RealCardAppletTileRepository) cardAppletTileRepository).moneyTabCardIntroState.set(new MoneyTabCardIntroState(false), this);
                if (obj2 != coroutineSingletons4) {
                    obj2 = Unit.INSTANCE;
                    break;
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardAppletTileRepository cardAppletTileRepository2 = cardAppletTilePresenter.repository;
                    this.label = 1;
                    Object obj3 = ((RealCardAppletTileRepository) cardAppletTileRepository2).moneyTabCardIntroState.set(new MoneyTabCardIntroState(false), this);
                    if (obj3 != coroutineSingletons5) {
                        obj3 = Unit.INSTANCE;
                    }
                    if (obj3 == coroutineSingletons5) {
                        break;
                    }
                } else if (i6 != 1) {
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
