package com.squareup.cash.tabprovider.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.squareup.cash.savings.applets.presenters.SavingsRepositoryModel;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda9;
import com.squareup.cash.support.chat.backend.api.PagingStatus;
import com.squareup.cash.support.chat.backend.api.Transcript;
import com.squareup.cash.tabprovider.api.TabInfoState;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.cash.work.data.api.ClockInEssentialsState;
import com.squareup.cash.work.data.real.RealShiftDataLoader;
import com.stripe.android.financialconnections.FinancialConnections;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealTabProvider$setup$1$5 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealTabProvider$setup$1$5(int i) {
        super(2, null);
        this.$r8$classId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                RealTabProvider$setup$1$5 realTabProvider$setup$1$5 = new RealTabProvider$setup$1$5(2, continuation, 0);
                realTabProvider$setup$1$5.L$0 = obj;
                return realTabProvider$setup$1$5;
            case 1:
                RealTabProvider$setup$1$5 realTabProvider$setup$1$52 = new RealTabProvider$setup$1$5(2, continuation, 1);
                realTabProvider$setup$1$52.L$0 = obj;
                return realTabProvider$setup$1$52;
            case 2:
                RealTabProvider$setup$1$5 realTabProvider$setup$1$53 = new RealTabProvider$setup$1$5(2, continuation, 2);
                realTabProvider$setup$1$53.L$0 = obj;
                return realTabProvider$setup$1$53;
            case 3:
                RealTabProvider$setup$1$5 realTabProvider$setup$1$54 = new RealTabProvider$setup$1$5(2, continuation, 3);
                realTabProvider$setup$1$54.L$0 = obj;
                return realTabProvider$setup$1$54;
            case 4:
                RealTabProvider$setup$1$5 realTabProvider$setup$1$55 = new RealTabProvider$setup$1$5(2, continuation, 4);
                realTabProvider$setup$1$55.L$0 = obj;
                return realTabProvider$setup$1$55;
            case 5:
                RealTabProvider$setup$1$5 realTabProvider$setup$1$56 = new RealTabProvider$setup$1$5(2, continuation, 5);
                realTabProvider$setup$1$56.L$0 = obj;
                return realTabProvider$setup$1$56;
            case 6:
                RealTabProvider$setup$1$5 realTabProvider$setup$1$57 = new RealTabProvider$setup$1$5(2, continuation, 6);
                realTabProvider$setup$1$57.L$0 = obj;
                return realTabProvider$setup$1$57;
            case 7:
                RealTabProvider$setup$1$5 realTabProvider$setup$1$58 = new RealTabProvider$setup$1$5(2, continuation, 7);
                realTabProvider$setup$1$58.L$0 = obj;
                return realTabProvider$setup$1$58;
            case 8:
                RealTabProvider$setup$1$5 realTabProvider$setup$1$59 = new RealTabProvider$setup$1$5(2, continuation, 8);
                realTabProvider$setup$1$59.L$0 = obj;
                return realTabProvider$setup$1$59;
            case 9:
                RealTabProvider$setup$1$5 realTabProvider$setup$1$510 = new RealTabProvider$setup$1$5(2, continuation, 9);
                realTabProvider$setup$1$510.L$0 = obj;
                return realTabProvider$setup$1$510;
            case 10:
                RealTabProvider$setup$1$5 realTabProvider$setup$1$511 = new RealTabProvider$setup$1$5(2, continuation, 10);
                realTabProvider$setup$1$511.L$0 = obj;
                return realTabProvider$setup$1$511;
            case 11:
                RealTabProvider$setup$1$5 realTabProvider$setup$1$512 = new RealTabProvider$setup$1$5(2, continuation, 11);
                realTabProvider$setup$1$512.L$0 = obj;
                return realTabProvider$setup$1$512;
            case 12:
                RealTabProvider$setup$1$5 realTabProvider$setup$1$513 = new RealTabProvider$setup$1$5(2, continuation, 12);
                realTabProvider$setup$1$513.L$0 = obj;
                return realTabProvider$setup$1$513;
            case 13:
                RealTabProvider$setup$1$5 realTabProvider$setup$1$514 = new RealTabProvider$setup$1$5(2, continuation, 13);
                realTabProvider$setup$1$514.L$0 = obj;
                return realTabProvider$setup$1$514;
            case 14:
                RealTabProvider$setup$1$5 realTabProvider$setup$1$515 = new RealTabProvider$setup$1$5(2, continuation, 14);
                realTabProvider$setup$1$515.L$0 = obj;
                return realTabProvider$setup$1$515;
            case 15:
                RealTabProvider$setup$1$5 realTabProvider$setup$1$516 = new RealTabProvider$setup$1$5(2, continuation, 15);
                realTabProvider$setup$1$516.L$0 = obj;
                return realTabProvider$setup$1$516;
            case 16:
                RealTabProvider$setup$1$5 realTabProvider$setup$1$517 = new RealTabProvider$setup$1$5(2, continuation, 16);
                realTabProvider$setup$1$517.L$0 = obj;
                return realTabProvider$setup$1$517;
            case 17:
                RealTabProvider$setup$1$5 realTabProvider$setup$1$518 = new RealTabProvider$setup$1$5(2, continuation, 17);
                realTabProvider$setup$1$518.L$0 = obj;
                return realTabProvider$setup$1$518;
            default:
                RealTabProvider$setup$1$5 realTabProvider$setup$1$519 = new RealTabProvider$setup$1$5(2, continuation, 18);
                realTabProvider$setup$1$519.L$0 = obj;
                return realTabProvider$setup$1$519;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((RealTabProvider$setup$1$5) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TabInfoState.NotReady notReady = TabInfoState.NotReady.INSTANCE;
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector.emit(notReady, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Boolean bool = Boolean.FALSE;
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector2.emit(bool, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    EmptyList emptyList = EmptyList.INSTANCE;
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector3.emit(emptyList, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    EmptyList emptyList2 = EmptyList.INSTANCE;
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector4.emit(emptyList2, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                FlowCollector flowCollector5 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector5.emit(null, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                FlowCollector flowCollector6 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SavingsRepositoryModel.SavingsConfigState savingsConfigState = new SavingsRepositoryModel.SavingsConfigState(3);
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector6.emit(savingsConfigState, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                SessionManager sessionManager = (SessionManager) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (sessionManager.updateOnboardedState(true, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                SessionManager sessionManager2 = (SessionManager) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (sessionManager2.updateSessionFinishAccountSwitchCall(this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                ProducerScope producerScope = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MaterialButton$$ExternalSyntheticLambda3 materialButton$$ExternalSyntheticLambda3 = new MaterialButton$$ExternalSyntheticLambda3(producerScope, 22);
                    synchronized (FinancialConnections.class) {
                        FinancialConnections.eventListener = materialButton$$ExternalSyntheticLambda3;
                    }
                    SheetKt$$ExternalSyntheticLambda9 sheetKt$$ExternalSyntheticLambda9 = new SheetKt$$ExternalSyntheticLambda9(5);
                    this.L$0 = null;
                    this.label = 1;
                    if (TuplesKt.awaitClose(producerScope, sheetKt$$ExternalSyntheticLambda9, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                FlowCollector flowCollector7 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Transcript transcript = new Transcript(EmptyList.INSTANCE, PagingStatus.EXHAUSTED, null);
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector7.emit(transcript, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                ActivityDataBridge activityDataBridge = (ActivityDataBridge) this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                this.L$0 = null;
                this.label = 1;
                Object cachedActivityItem = activityDataBridge.getCachedActivityItem(this);
                return cachedActivityItem == coroutineSingletons11 ? coroutineSingletons11 : cachedActivityItem;
            case 11:
                FlowCollector flowCollector8 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector8.emit(null, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                FlowCollector flowCollector9 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector9.emit(null, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                FlowCollector flowCollector10 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector10.emit(null, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                FlowCollector flowCollector11 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector11.emit(null, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                FlowCollector flowCollector12 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ClockInEssentialsState.Loading loading = ClockInEssentialsState.Loading.INSTANCE;
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector12.emit(loading, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                FlowCollector flowCollector13 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector13.emit(null, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                FlowCollector flowCollector14 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector14.emit(null, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                FlowCollector flowCollector15 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealShiftDataLoader.Command.Initialization initialization = RealShiftDataLoader.Command.Initialization.INSTANCE;
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector15.emit(initialization, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealTabProvider$setup$1$5(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTabProvider$setup$1$5(Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 6;
    }
}
