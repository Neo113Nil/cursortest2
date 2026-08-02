package com.squareup.cash.wallet.presenters;

import androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.prepurchasecard.Surface;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseToggleManager;
import com.squareup.cash.support.presenters.SupportHomePresenter$models$lambda$5$$inlined$map$1;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class CardSchemePresenter$models$6$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ CardSchemePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardSchemePresenter$models$6$1(CardSchemePresenter cardSchemePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cardSchemePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CardSchemePresenter cardSchemePresenter = this.this$0;
        switch (i) {
            case 0:
                return new CardSchemePresenter$models$6$1(cardSchemePresenter, continuation, 0);
            case 1:
                return new CardSchemePresenter$models$6$1(cardSchemePresenter, continuation, 1);
            default:
                return new CardSchemePresenter$models$6$1(cardSchemePresenter, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CardSchemePresenter$models$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        if (r14.collect(r0, r13) == r13) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
    
        if (r14.awaitReady(r13) == r13) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardSchemePresenter cardSchemePresenter = this.this$0;
        int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SyncValueReader syncValueReader = cardSchemePresenter.syncValueReader;
                    this.label = 1;
                    break;
                } else if (i3 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new SupportHomePresenter$models$lambda$5$$inlined$map$1(cardSchemePresenter.cashAppTagManager.getAllCashAppTags(), 11));
                CardSchemePresenter$models$5$1$2 cardSchemePresenter$models$5$1$2 = new CardSchemePresenter$models$5$1$2(cardSchemePresenter, i2);
                this.label = 2;
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    FinishSetupTileBadgeCounter combine = FlowKt.combine(cardSchemePresenter.cashAppTagManager.getAllCashAppTags(), new MoneyTabPresenter$models$lambda$17$$inlined$map$1(((RealIssuedCardManager) cardSchemePresenter.issuedCardManager).getIssuedCardOrNull(), 7), cardSchemePresenter.deviceLockAnimationBus.loadingDeviceIds, new AnchoredDraggableKt$snapTo$2(4, null, 6));
                    BufferCountKt$bufferSkip$1.AnonymousClass1 anonymousClass1 = new BufferCountKt$bufferSkip$1.AnonymousClass1(18, m, ref$ObjectRef, cardSchemePresenter);
                    this.label = 1;
                    if (combine.collect(anonymousClass1, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealPrepurchaseToggleManager realPrepurchaseToggleManager = cardSchemePresenter.prepurchaseToggleManager;
                    WalletHomeScreen walletHomeScreen = new WalletHomeScreen(7, (Integer) null, (String) null);
                    RealRouter realRouter = cardSchemePresenter.router;
                    BetterNavigator.ScreenNavigator screenNavigator = cardSchemePresenter.navigator;
                    Surface surface = Surface.CARD_TAB;
                    this.label = 1;
                    if (realPrepurchaseToggleManager.toggle(walletHomeScreen, realRouter, screenNavigator, surface, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i5 != 1) {
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
