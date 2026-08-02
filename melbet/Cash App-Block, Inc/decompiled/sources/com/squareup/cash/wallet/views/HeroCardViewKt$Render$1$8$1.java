package com.squareup.cash.wallet.views;

import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.local.presenters.wallet.TabContentPresenter$models$4$1$1$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.family.familyhub.presenters.FamilyHomePresenter;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.maps.views.CashMapViewKt$CashMapView$3$1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda13;
import com.squareup.cash.payments.presenters.PaymentRouterData;
import com.squareup.cash.score.views.ScoreDisplayContent;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.stripe.android.financialconnections.features.success.SuccessContentKt;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class HeroCardViewKt$Render$1$8$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $interactiveCardState$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ State $rightPressed$delegate;
    public int label;

    /* renamed from: com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends SuspendLambda implements Function2 {
        public final /* synthetic */ MutableState $interactiveCardState$delegate;
        public final /* synthetic */ int $r8$classId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass3(MutableState mutableState, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$interactiveCardState$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            MutableState mutableState = this.$interactiveCardState$delegate;
            switch (i) {
                case 0:
                    return new AnonymousClass3(mutableState, continuation, 0);
                case 1:
                    return new AnonymousClass3(mutableState, continuation, 1);
                case 2:
                    return new AnonymousClass3(mutableState, continuation, 2);
                case 3:
                    return new AnonymousClass3(mutableState, continuation, 3);
                case 4:
                    return new AnonymousClass3(mutableState, continuation, 4);
                case 5:
                    return new AnonymousClass3(mutableState, continuation, 5);
                case 6:
                    return new AnonymousClass3(mutableState, continuation, 6);
                case 7:
                    return new AnonymousClass3(mutableState, continuation, 7);
                case 8:
                    return new AnonymousClass3(mutableState, continuation, 8);
                case 9:
                    return new AnonymousClass3(mutableState, continuation, 9);
                case 10:
                    return new AnonymousClass3(mutableState, continuation, 10);
                case 11:
                    return new AnonymousClass3(mutableState, continuation, 11);
                case 12:
                    return new AnonymousClass3(mutableState, continuation, 12);
                case 13:
                    return new AnonymousClass3(mutableState, continuation, 13);
                case 14:
                    return new AnonymousClass3(mutableState, continuation, 14);
                case 15:
                    return new AnonymousClass3(mutableState, continuation, 15);
                case 16:
                    return new AnonymousClass3(mutableState, continuation, 16);
                case 17:
                    return new AnonymousClass3(mutableState, continuation, 17);
                case 18:
                    return new AnonymousClass3(mutableState, continuation, 18);
                case 19:
                    return new AnonymousClass3(mutableState, continuation, 19);
                case 20:
                    return new AnonymousClass3(mutableState, continuation, 20);
                case 21:
                    return new AnonymousClass3(mutableState, continuation, 21);
                default:
                    return new AnonymousClass3(mutableState, continuation, 22);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    Boolean bool = (Boolean) obj;
                    bool.booleanValue();
                    break;
            }
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            int i2 = 0;
            MutableState mutableState = this.$interactiveCardState$delegate;
            Continuation continuation = null;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        int i4 = HeroCardViewKt.$r8$clinit;
                        InteractiveCardState interactiveCardState = (InteractiveCardState) mutableState.getValue();
                        this.label = 1;
                        if (interactiveCardState.interruptCopyAnimation(this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i3 != 1) {
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
                        ActivitiesManager activitiesManager = (ActivitiesManager) mutableState.getValue();
                        ActivitiesManager.LoadMode loadMode = ActivitiesManager.LoadMode.LOAD_NEXT_PAGE;
                        this.label = 1;
                        if (activitiesManager.load(loadMode, this) == coroutineSingletons2) {
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
                        this.label = 1;
                        if (JobKt.delay(5000L, this) == coroutineSingletons3) {
                            break;
                        }
                    } else if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    mutableState.setValue(Boolean.TRUE);
                    break;
                case 3:
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (JobKt.delay(2000L, this) == coroutineSingletons4) {
                            break;
                        }
                    } else if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    mutableState.setValue(Boolean.FALSE);
                    break;
                case 4:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (JobKt.delay(500L, this) == coroutineSingletons5) {
                            break;
                        }
                    } else if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    mutableState.setValue(Boolean.TRUE);
                    break;
                case 5:
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (JobKt.delay(8000L, this) == coroutineSingletons6) {
                            break;
                        }
                    } else if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    mutableState.setValue(Boolean.TRUE);
                    break;
                case 6:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        long j = FamilyHomePresenter.HIGHLIGHT_ANIMATION_DELAY;
                        this.label = 1;
                        if (JobKt.m4182delayVtjQ1oo(j, this) == coroutineSingletons7) {
                            break;
                        }
                    } else if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    StackedAvatarViewModel.Avatar avatar = FamilyHomePresenter.LOADING_AVATAR;
                    mutableState.setValue(Boolean.TRUE);
                    break;
                case 7:
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Duration.Companion companion = Duration.Companion;
                        long duration = DurationKt.toDuration(3, DurationUnit.SECONDS);
                        this.label = 1;
                        if (JobKt.m4182delayVtjQ1oo(duration, this) == coroutineSingletons8) {
                            break;
                        }
                    } else if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    mutableState.setValue(Boolean.TRUE);
                    break;
                case 8:
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = this.label;
                    if (i12 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        MoneyTabUIKt$$ExternalSyntheticLambda13 moneyTabUIKt$$ExternalSyntheticLambda13 = new MoneyTabUIKt$$ExternalSyntheticLambda13(15);
                        this.label = 1;
                        if (Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, moneyTabUIKt$$ExternalSyntheticLambda13) == coroutineSingletons9) {
                            break;
                        }
                    } else if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    mutableState.setValue(Boolean.TRUE);
                    break;
                case 9:
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = this.label;
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (JobKt.delay(40L, this) == coroutineSingletons10) {
                            break;
                        }
                    } else if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    mutableState.setValue(Boolean.TRUE);
                    break;
                case 10:
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = this.label;
                    if (i14 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        mutableState.setValue(Boolean.TRUE);
                        this.label = 1;
                        if (JobKt.delay(100L, this) == coroutineSingletons11) {
                            break;
                        }
                    } else if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    mutableState.setValue(Boolean.FALSE);
                    break;
                case 11:
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = this.label;
                    if (i15 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Duration.Companion companion2 = Duration.Companion;
                        long duration2 = DurationKt.toDuration(3, DurationUnit.SECONDS);
                        this.label = 1;
                        if (JobKt.m4182delayVtjQ1oo(duration2, this) == coroutineSingletons12) {
                            break;
                        }
                    } else if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    mutableState.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState.getValue(), null, null, null, false, false, false, null, null, false, null, false, false, null, null, null, null, null, null, false, 16760831));
                    break;
                case 12:
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = this.label;
                    if (i16 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Duration.Companion companion3 = Duration.Companion;
                        long duration3 = DurationKt.toDuration(3, DurationUnit.SECONDS);
                        this.label = 1;
                        if (JobKt.m4182delayVtjQ1oo(duration3, this) == coroutineSingletons13) {
                            break;
                        }
                    } else if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    mutableState.setValue(null);
                    break;
                case 13:
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i17 = this.label;
                    if (i17 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (((ScoreDisplayContent) mutableState.getValue()) instanceof ScoreDisplayContent.Celebration) {
                            this.label = 1;
                            if (JobKt.delay(2000L, this) == coroutineSingletons14) {
                                break;
                            }
                        }
                        break;
                    } else if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    mutableState.setValue(ScoreDisplayContent.AfterCelebrationScore.INSTANCE);
                case 14:
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = this.label;
                    if (i18 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (JobKt.delay(3000L, this) == coroutineSingletons15) {
                            break;
                        }
                    } else if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    Set set = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                    mutableState.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState.getValue(), false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, 503316479));
                    break;
                case 15:
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i19 = this.label;
                    if (i19 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Duration.Companion companion4 = Duration.Companion;
                        long duration4 = DurationKt.toDuration(200L, DurationUnit.MILLISECONDS);
                        this.label = 1;
                        if (JobKt.m4182delayVtjQ1oo(duration4, this) == coroutineSingletons16) {
                            break;
                        }
                    } else if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    mutableState.setValue(null);
                    break;
                case 16:
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i20 = this.label;
                    if (i20 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Quat quat = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                        Flow m3791flingCardToClosestSideF0iM_J4 = Hero3DCardViewKt.m3791flingCardToClosestSideF0iM_J4((Quat) mutableState.getValue(), Hero3DCardViewKt.FORWARD_RESTING, Hero3DCardViewKt.BACKWARD_RESTING, 0L, new SpringSpec(1.0f, 100.0f, new Float(0.01f)), 25.0f);
                        TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$1 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 20);
                        this.label = 1;
                        if (FlowKt.collectLatest(m3791flingCardToClosestSideF0iM_J4, tabContentPresenter$models$4$1$1$1, this) == coroutineSingletons17) {
                            break;
                        }
                    } else if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 17:
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i21 = this.label;
                    if (i21 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(18, mutableState)), 24);
                        this.label = 1;
                        Object first = FlowKt.first(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, this);
                        if (first == coroutineSingletons18) {
                            break;
                        }
                    } else if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    break;
                case 18:
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i22 = this.label;
                    if (i22 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Quat quat2 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                        InteractiveCardState interactiveCardState2 = (InteractiveCardState) mutableState.getValue();
                        this.label = 1;
                        interactiveCardState2.getClass();
                        if (JobKt.coroutineScope(new InteractiveCardState$shimmerAnimation$2(interactiveCardState2, continuation, i2), this) == coroutineSingletons19) {
                            break;
                        }
                    } else if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 19:
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i23 = this.label;
                    if (i23 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        float[] fArr = Hero3DCardViewKt.X_AXIS;
                        Flow m3791flingCardToClosestSideF0iM_J42 = Hero3DCardViewKt.m3791flingCardToClosestSideF0iM_J4((Quat) mutableState.getValue(), Hero3DCardViewKt.FORWARD_RESTING, Hero3DCardViewKt.BACKWARD_RESTING, 0L, new SpringSpec(1.0f, 100.0f, new Float(0.01f)), 25.0f);
                        TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$12 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 23);
                        this.label = 1;
                        if (FlowKt.collectLatest(m3791flingCardToClosestSideF0iM_J42, tabContentPresenter$models$4$1$1$12, this) == coroutineSingletons20) {
                            break;
                        }
                    } else if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 20:
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i24 = this.label;
                    if (i24 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        float[] fArr2 = Hero3DCardViewKt.X_AXIS;
                        InteractiveCardState interactiveCardState3 = (InteractiveCardState) mutableState.getValue();
                        this.label = 1;
                        interactiveCardState3.getClass();
                        if (JobKt.coroutineScope(new InteractiveCardState$shimmerAnimation$2(interactiveCardState3, continuation, i2), this) == coroutineSingletons21) {
                            break;
                        }
                    } else if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 21:
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i25 = this.label;
                    if (i25 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow m3791flingCardToClosestSideF0iM_J43 = Hero3DCardViewKt.m3791flingCardToClosestSideF0iM_J4((Quat) mutableState.getValue(), Hero3DCardViewKt.FORWARD_RESTING, Hero3DCardViewKt.BACKWARD_RESTING, 0L, new SpringSpec(1.0f, 100.0f, new Float(0.01f)), 25.0f);
                        TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$13 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 27);
                        this.label = 1;
                        if (FlowKt.collectLatest(m3791flingCardToClosestSideF0iM_J43, tabContentPresenter$models$4$1$1$13, this) == coroutineSingletons22) {
                            break;
                        }
                    } else if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i26 = this.label;
                    if (i26 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (JobKt.delay(1000L, this) == coroutineSingletons23) {
                            break;
                        }
                    } else if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    EnterTransitionImpl enterTransitionImpl = SuccessContentKt.FADE_IN_ANIMATION;
                    mutableState.setValue(Boolean.FALSE);
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeroCardViewKt$Render$1$8$1(State state, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$rightPressed$delegate = state;
        this.$interactiveCardState$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$interactiveCardState$delegate;
        State state = this.$rightPressed$delegate;
        switch (i) {
            case 0:
                return new HeroCardViewKt$Render$1$8$1(state, mutableState, continuation, 0);
            default:
                return new HeroCardViewKt$Render$1$8$1(state, mutableState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((HeroCardViewKt$Render$1$8$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((HeroCardViewKt$Render$1$8$1) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$interactiveCardState$delegate;
        State state = this.$rightPressed$delegate;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int i3 = 0;
                    HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1 heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1 = new HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda1(state, 11)), i3);
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(mutableState, continuation, i3);
                    this.label = 1;
                    if (FlowKt.collectLatest(heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1, anonymousClass3, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda1(state, 9)));
                    CashMapViewKt$CashMapView$3$1 cashMapViewKt$CashMapView$3$1 = new CashMapViewKt$CashMapView$3$1(mutableState, continuation, 14);
                    this.label = 1;
                    if (FlowKt.collectLatest(distinctUntilChanged, cashMapViewKt$CashMapView$3$1, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
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
