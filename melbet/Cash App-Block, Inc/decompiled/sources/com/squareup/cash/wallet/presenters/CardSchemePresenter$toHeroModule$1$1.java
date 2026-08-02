package com.squareup.cash.wallet.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.local.presenters.wallet.TabContentPresenter$models$4$1$1$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sharesheet.ShareSheetPresenter$models$1$1$5;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardSchemePresenter$toHeroModule$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Flow $events;
    public final /* synthetic */ MutableState $executingClientScenario$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardSchemePresenter$toHeroModule$1$1(int i, MutableState mutableState, Continuation continuation, Flow flow) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$events = flow;
        this.$executingClientScenario$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$executingClientScenario$delegate;
        Flow flow = this.$events;
        switch (i) {
            case 0:
                return new CardSchemePresenter$toHeroModule$1$1(0, mutableState, continuation, flow);
            case 1:
                return new CardSchemePresenter$toHeroModule$1$1(1, mutableState, continuation, flow);
            case 2:
                return new CardSchemePresenter$toHeroModule$1$1(2, mutableState, continuation, flow);
            case 3:
                return new CardSchemePresenter$toHeroModule$1$1(3, mutableState, continuation, flow);
            case 4:
                return new CardSchemePresenter$toHeroModule$1$1(4, mutableState, continuation, flow);
            default:
                return new CardSchemePresenter$toHeroModule$1$1(5, mutableState, continuation, flow);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CardSchemePresenter$toHeroModule$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = 22;
        int i3 = 21;
        MutableState mutableState = this.$executingClientScenario$delegate;
        Flow flow = this.$events;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShareSheetPresenter$models$1$1$5 shareSheetPresenter$models$1$1$5 = new ShareSheetPresenter$models$1$1$5(7, mutableState);
                    this.label = 1;
                    Object collect = flow.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(shareSheetPresenter$models$1$1$5, i3), 20), this);
                    if (collect != coroutineSingletons) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect != coroutineSingletons) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass1 = new MusicPresenter$models$2$1.AnonymousClass1(2, mutableState);
                    this.label = 1;
                    if (flow.collect(anonymousClass1, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass12 = new MusicPresenter$models$2$1.AnonymousClass1(3, mutableState);
                    this.label = 1;
                    if (flow.collect(anonymousClass12, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppLockMonitor$special$$inlined$map$2 debounceDuration = FlowKt.debounceDuration(new RealGooglePayer$createWallet$$inlined$filter$1(flow, 27), new GpsConfigQueries$$ExternalSyntheticLambda1(i2));
                    TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$1 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 12);
                    this.label = 1;
                    if (FlowKt.collectLatest(debounceDuration, tabContentPresenter$models$4$1$1$1, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppLockMonitor$special$$inlined$map$2 debounceDuration2 = FlowKt.debounceDuration(new MoneyTabPresenter$models$lambda$31$$inlined$map$1(flow, 19), new OffersStyledTextKt$$ExternalSyntheticLambda0(i2));
                    TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$12 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 14);
                    this.label = 1;
                    if (FlowKt.collectLatest(debounceDuration2, tabContentPresenter$models$4$1$1$12, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppLockMonitor$special$$inlined$map$2 debounceDuration3 = FlowKt.debounceDuration(new MoneyTabPresenter$models$lambda$31$$inlined$map$1(flow, i3), new OffersStyledTextKt$$ExternalSyntheticLambda0(24));
                    TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$13 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 15);
                    this.label = 1;
                    if (FlowKt.collectLatest(debounceDuration3, tabContentPresenter$models$4$1$1$13, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i9 != 1) {
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
