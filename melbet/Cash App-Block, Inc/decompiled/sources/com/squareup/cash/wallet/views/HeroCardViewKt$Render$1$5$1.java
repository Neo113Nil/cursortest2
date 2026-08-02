package com.squareup.cash.wallet.views;

import androidx.compose.foundation.gestures.ScrollableNode;
import androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1;
import androidx.compose.material.SwipeableKt$swipeable$3$4$1;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Velocity;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.trace.opentelemetry.OtelTracerProvider;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$onOTPEntered$1;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class HeroCardViewKt$Render$1$5$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $cardModelView$delegate;
    public final /* synthetic */ SnapshotStateList $copyPans;
    public final /* synthetic */ int $r8$classId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeroCardViewKt$Render$1$5$1(MutableState mutableState, SnapshotStateList snapshotStateList, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$cardModelView$delegate = mutableState;
        this.$copyPans = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new HeroCardViewKt$Render$1$5$1(this.$cardModelView$delegate, this.$copyPans, continuation, 0);
            default:
                return new HeroCardViewKt$Render$1$5$1(this.$cardModelView$delegate, this.$copyPans, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((HeroCardViewKt$Render$1$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        SnapshotStateList snapshotStateList = this.$copyPans;
        int i2 = 24;
        MutableState mutableState = this.$cardModelView$delegate;
        int i3 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda15(17, mutableState)), i2);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(snapshotStateList, continuation, 0);
                    this.label = 1;
                    if (FlowKt.collectLatest(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, anonymousClass2, this) == coroutineSingletons) {
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
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$12 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda15(18, mutableState)), i2);
                    AnonymousClass2 anonymousClass22 = new AnonymousClass2(snapshotStateList, continuation, i3);
                    this.label = 1;
                    if (FlowKt.collectLatest(realBadger2$setup$lambda$0$$inlined$mapNotNull$12, anonymousClass22, this) == coroutineSingletons2) {
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

    /* renamed from: com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$5$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function2 {
        public final /* synthetic */ SnapshotStateList $copyPans;
        public final /* synthetic */ int $r8$classId;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(SnapshotStateList snapshotStateList, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$copyPans = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            switch (this.$r8$classId) {
                case 0:
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$copyPans, continuation, 0);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                default:
                    AnonymousClass2 anonymousClass22 = new AnonymousClass2(this.$copyPans, continuation, 1);
                    anonymousClass22.L$0 = obj;
                    return anonymousClass22;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    return ((AnonymousClass2) create((CardModelView) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                default:
                    return ((AnonymousClass2) create((CardScene) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            SnapshotStateList snapshotStateList = this.$copyPans;
            switch (i) {
                case 0:
                    CardModelView cardModelView = (CardModelView) this.L$0;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SafeFlow snapshotFlow = Updater.snapshotFlow(new HeroCardViewKt$Render$1$5$1$2$$ExternalSyntheticLambda0(snapshotStateList, 0));
                        C00682 c00682 = new C00682(2, cardModelView, CardModelView.class, "setChildrenLocal", "setChildrenLocal(Ljava/util/List;)V", 4, 0);
                        this.L$0 = null;
                        this.label = 1;
                        if (FlowKt.collectLatest(snapshotFlow, c00682, this) == coroutineSingletons) {
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
                    CardScene cardScene = (CardScene) this.L$0;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SafeFlow snapshotFlow2 = Updater.snapshotFlow(new HeroCardViewKt$Render$1$5$1$2$$ExternalSyntheticLambda0(snapshotStateList, 2));
                        C00682 c006822 = new C00682(2, cardScene, CardScene.class, "setChildrenLocal", "setChildrenLocal(Ljava/util/List;)V", 4, 5);
                        this.L$0 = null;
                        this.label = 1;
                        if (FlowKt.collectLatest(snapshotFlow2, c006822, this) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$5$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes8.dex */
        public final /* synthetic */ class C00682 extends AdaptedFunctionReference implements Function2 {
            public final /* synthetic */ int $r8$classId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00682(ScrollableNode scrollableNode, int i) {
                super(2, 4, ScrollableNode.class, scrollableNode, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V");
                this.$r8$classId = i;
                switch (i) {
                    case 2:
                        super(2, 4, ScrollableNode.class, scrollableNode, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V");
                        break;
                    default:
                        break;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object value;
                NetworkingLinkSignupState networkingLinkSignupState;
                Object value2;
                NetworkingLinkSignupState networkingLinkSignupState2;
                Continuation continuation = null;
                int i = 3;
                switch (this.$r8$classId) {
                    case 0:
                        ((CardModelView) this.receiver).setChildrenLocal((List) obj);
                        break;
                    case 1:
                        long j = ((Velocity) obj).packedValue;
                        ScrollableNode scrollableNode = (ScrollableNode) this.receiver;
                        JobKt.launch$default(scrollableNode.nestedScrollDispatcher.getCoroutineScope(), null, null, new ScrollableNode$onKeyEvent$1(scrollableNode, j, null, 2), 3);
                        break;
                    case 2:
                        long j2 = ((Velocity) obj).packedValue;
                        ScrollableNode scrollableNode2 = (ScrollableNode) this.receiver;
                        JobKt.launch$default(scrollableNode2.nestedScrollDispatcher.getCoroutineScope(), null, null, new ScrollableNode$onKeyEvent$1(scrollableNode2, j2, null, 1), 3);
                        break;
                    case 3:
                        float floatValue = ((Number) obj).floatValue();
                        PullRefreshState pullRefreshState = (PullRefreshState) this.receiver;
                        boolean z = pullRefreshState.get_refreshing();
                        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = pullRefreshState.distancePulled$delegate;
                        float f = RecyclerView.DECELERATION_RATE;
                        if (!z) {
                            if (pullRefreshState.getAdjustedDistancePulled() > pullRefreshState._threshold$delegate.getFloatValue()) {
                                ((Function0) pullRefreshState.onRefreshState.getValue()).invoke();
                            }
                            JobKt.launch$default(pullRefreshState.animationScope, null, null, new SwipeableKt$swipeable$3$4$1.AnonymousClass1(pullRefreshState, f, continuation, 2), 3);
                            if (parcelableSnapshotMutableFloatState.getFloatValue() == RecyclerView.DECELERATION_RATE || floatValue < RecyclerView.DECELERATION_RATE) {
                                floatValue = 0.0f;
                            }
                            parcelableSnapshotMutableFloatState.setFloatValue(RecyclerView.DECELERATION_RATE);
                            f = floatValue;
                        }
                        break;
                    case 4:
                        String str = (String) obj;
                        String str2 = (String) obj2;
                        str.getClass();
                        str2.getClass();
                        OtelTracerProvider.Builder builder = (OtelTracerProvider.Builder) this.receiver;
                        builder.getClass();
                        builder.builderDelegate.withTag(str, str2);
                        break;
                    case 5:
                        ((CardScene) this.receiver).setChildrenLocal((List) obj);
                        break;
                    case 6:
                        String str3 = (String) obj;
                        NetworkingLinkSignupViewModel networkingLinkSignupViewModel = (NetworkingLinkSignupViewModel) this.receiver;
                        StateFlowImpl stateFlowImpl = networkingLinkSignupViewModel._stateFlow;
                        do {
                            value = stateFlowImpl.getValue();
                            networkingLinkSignupState = (NetworkingLinkSignupState) value;
                            networkingLinkSignupState.getClass();
                        } while (!stateFlowImpl.compareAndSet(value, NetworkingLinkSignupState.copy$default(networkingLinkSignupState, null, str3, null, null, null, null, 125)));
                        if (str3 != null) {
                            networkingLinkSignupViewModel.logger.debug("VALID EMAIL ADDRESS " + str3 + ".");
                            networkingLinkSignupViewModel.searchJob.plusAssign(FinancialConnectionsViewModel.execute$default(networkingLinkSignupViewModel, new RealMRIFactory$sign$2.AnonymousClass1(networkingLinkSignupViewModel, str3, continuation, 28), new PhoneNumberController$$ExternalSyntheticLambda5(i)));
                        } else {
                            do {
                                value2 = stateFlowImpl.getValue();
                                networkingLinkSignupState2 = (NetworkingLinkSignupState) value2;
                                networkingLinkSignupState2.getClass();
                            } while (!stateFlowImpl.compareAndSet(value2, NetworkingLinkSignupState.copy$default(networkingLinkSignupState2, null, null, null, null, Async.Uninitialized.INSTANCE, null, 111)));
                        }
                        break;
                    default:
                        NetworkingLinkVerificationViewModel networkingLinkVerificationViewModel = (NetworkingLinkVerificationViewModel) this.receiver;
                        FinancialConnectionsSessionManifest.Pane pane = NetworkingLinkVerificationViewModel.PANE;
                        networkingLinkVerificationViewModel.getClass();
                        FinancialConnectionsViewModel.execute$default(networkingLinkVerificationViewModel, new NetworkingLinkVerificationViewModel$onOTPEntered$1(networkingLinkVerificationViewModel, (String) obj, null), new PhoneNumberController$$ExternalSyntheticLambda5(7));
                        break;
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C00682(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
                super(i, i2, cls, obj, str, str2);
                this.$r8$classId = i3;
            }
        }
    }
}
