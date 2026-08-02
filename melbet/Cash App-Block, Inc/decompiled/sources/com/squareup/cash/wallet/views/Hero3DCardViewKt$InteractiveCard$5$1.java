package com.squareup.cash.wallet.views;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.score.views.ScoreSummaryKt$ScoreSummary$1$3$1;
import com.squareup.cash.ui.gcm.NotificationActionService$onHandleIntent$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class Hero3DCardViewKt$InteractiveCard$5$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $animateCardIn$delegate;
    public final /* synthetic */ MutableState $parentModel$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $view$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Hero3DCardViewKt$InteractiveCard$5$1(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$animateCardIn$delegate = mutableState;
        this.$parentModel$delegate = mutableState2;
        this.$view$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new Hero3DCardViewKt$InteractiveCard$5$1(this.$animateCardIn$delegate, this.$parentModel$delegate, this.$view$delegate, continuation, 0);
            case 1:
                return new Hero3DCardViewKt$InteractiveCard$5$1(this.$animateCardIn$delegate, this.$parentModel$delegate, this.$view$delegate, continuation, 1);
            case 2:
                return new Hero3DCardViewKt$InteractiveCard$5$1(this.$animateCardIn$delegate, this.$parentModel$delegate, this.$view$delegate, continuation, 2);
            case 3:
                return new Hero3DCardViewKt$InteractiveCard$5$1(this.$animateCardIn$delegate, this.$parentModel$delegate, this.$view$delegate, continuation, 3);
            default:
                return new Hero3DCardViewKt$InteractiveCard$5$1(this.$animateCardIn$delegate, this.$parentModel$delegate, this.$view$delegate, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((Hero3DCardViewKt$InteractiveCard$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(150, r14) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r1, r14) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x017b, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(150, r14) == r0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0168, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r8, r14) == r0) goto L76;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = 7;
        int i3 = 2;
        MutableState mutableState = this.$view$delegate;
        MutableState mutableState2 = this.$animateCardIn$delegate;
        MutableState mutableState3 = this.$parentModel$delegate;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1 heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1 = new HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1(Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda15(8, mutableState2)), i2);
                    this.label = 1;
                    break;
                } else if (i4 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i4 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    float[] fArr = Hero3DCardViewKt.X_AXIS;
                    CardModelView cardModelView = (CardModelView) mutableState.getValue();
                    if (cardModelView != null) {
                        cardModelView.setAlpha(1.0f);
                    }
                    CardModelView cardModelView2 = (CardModelView) mutableState3.getValue();
                    if (cardModelView2 != null) {
                        cardModelView2.setAlpha(RecyclerView.DECELERATION_RATE);
                    }
                    break;
                }
                float[] fArr2 = Hero3DCardViewKt.X_AXIS;
                if (((CardModelView) mutableState3.getValue()) != null) {
                    this.label = 2;
                    break;
                }
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!Intrinsics.areEqual((String) mutableState2.getValue(), (String) mutableState3.getValue())) {
                        long currentTimeMillis = 1000 - (System.currentTimeMillis() - ((Number) mutableState.getValue()).longValue());
                        if (currentTimeMillis > 0) {
                            this.label = 1;
                            if (JobKt.delay(currentTimeMillis, this) == coroutineSingletons2) {
                                break;
                            }
                        }
                    }
                    break;
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState3.setValue((String) mutableState2.getValue());
                mutableState.setValue(Long.valueOf(System.currentTimeMillis()));
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(i2, mutableState2));
                    NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$1 = new NotificationActionService$onHandleIntent$1(mutableState3, mutableState, continuation, 20);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow, notificationActionService$onHandleIntent$1, this) == coroutineSingletons3) {
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
                    HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1 heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$12 = new HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(23, mutableState2)), i3);
                    ScoreSummaryKt$ScoreSummary$1$3$1 scoreSummaryKt$ScoreSummary$1$3$1 = new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState3, mutableState, continuation, 5);
                    this.label = 1;
                    if (FlowKt.collectLatest(heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$12, scoreSummaryKt$ScoreSummary$1$3$1, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1 heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$13 = new HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1(Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda15(28, mutableState2)), 12);
                    this.label = 1;
                    break;
                } else if (i8 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i8 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    CardModelView cardModelView3 = (CardModelView) mutableState.getValue();
                    if (cardModelView3 != null) {
                        cardModelView3.setAlpha(1.0f);
                    }
                    CardModelView cardModelView4 = (CardModelView) mutableState3.getValue();
                    if (cardModelView4 != null) {
                        cardModelView4.setAlpha(RecyclerView.DECELERATION_RATE);
                    }
                    break;
                }
                if (((CardModelView) mutableState3.getValue()) != null) {
                    this.label = 2;
                    break;
                }
        }
        return Unit.INSTANCE;
    }
}
