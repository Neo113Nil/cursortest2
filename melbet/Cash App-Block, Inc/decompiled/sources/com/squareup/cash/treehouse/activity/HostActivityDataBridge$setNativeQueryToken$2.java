package com.squareup.cash.treehouse.activity;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.session.backend.SessionManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class HostActivityDataBridge$setNativeQueryToken$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String $token;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HostActivityDataBridge$setNativeQueryToken$2(String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$token = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                HostActivityDataBridge$setNativeQueryToken$2 hostActivityDataBridge$setNativeQueryToken$2 = new HostActivityDataBridge$setNativeQueryToken$2(this.$token, continuation, 0);
                hostActivityDataBridge$setNativeQueryToken$2.L$0 = obj;
                return hostActivityDataBridge$setNativeQueryToken$2;
            case 1:
                HostActivityDataBridge$setNativeQueryToken$2 hostActivityDataBridge$setNativeQueryToken$22 = new HostActivityDataBridge$setNativeQueryToken$2(this.$token, continuation, 1);
                hostActivityDataBridge$setNativeQueryToken$22.L$0 = obj;
                return hostActivityDataBridge$setNativeQueryToken$22;
            case 2:
                HostActivityDataBridge$setNativeQueryToken$2 hostActivityDataBridge$setNativeQueryToken$23 = new HostActivityDataBridge$setNativeQueryToken$2(this.$token, continuation, 2);
                hostActivityDataBridge$setNativeQueryToken$23.L$0 = obj;
                return hostActivityDataBridge$setNativeQueryToken$23;
            case 3:
                HostActivityDataBridge$setNativeQueryToken$2 hostActivityDataBridge$setNativeQueryToken$24 = new HostActivityDataBridge$setNativeQueryToken$2(this.$token, continuation, 3);
                hostActivityDataBridge$setNativeQueryToken$24.L$0 = obj;
                return hostActivityDataBridge$setNativeQueryToken$24;
            case 4:
                HostActivityDataBridge$setNativeQueryToken$2 hostActivityDataBridge$setNativeQueryToken$25 = new HostActivityDataBridge$setNativeQueryToken$2(this.$token, continuation, 4);
                hostActivityDataBridge$setNativeQueryToken$25.L$0 = obj;
                return hostActivityDataBridge$setNativeQueryToken$25;
            case 5:
                HostActivityDataBridge$setNativeQueryToken$2 hostActivityDataBridge$setNativeQueryToken$26 = new HostActivityDataBridge$setNativeQueryToken$2(this.$token, continuation, 5);
                hostActivityDataBridge$setNativeQueryToken$26.L$0 = obj;
                return hostActivityDataBridge$setNativeQueryToken$26;
            default:
                HostActivityDataBridge$setNativeQueryToken$2 hostActivityDataBridge$setNativeQueryToken$27 = new HostActivityDataBridge$setNativeQueryToken$2(this.$token, continuation, 6);
                hostActivityDataBridge$setNativeQueryToken$27.L$0 = obj;
                return hostActivityDataBridge$setNativeQueryToken$27;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((HostActivityDataBridge$setNativeQueryToken$2) create((ActivityDataBridge) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$token;
        switch (i) {
            case 0:
                ActivityDataBridge activityDataBridge = (ActivityDataBridge) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (activityDataBridge.setNativeQueryToken(str, this) == coroutineSingletons) {
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
                SessionManager sessionManager = (SessionManager) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (sessionManager.updateActiveAccountToken(str, this) == coroutineSingletons2) {
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
                SessionManager sessionManager2 = (SessionManager) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (sessionManager2.updateSessionForAccountSwitchOnboarding(str, this) == coroutineSingletons3) {
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
                ActivityDataBridge activityDataBridge2 = (ActivityDataBridge) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    Object offlinePaymentHistoryData = activityDataBridge2.offlinePaymentHistoryData(str, this);
                    if (offlinePaymentHistoryData == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                break;
            case 4:
                ActivityDataBridge activityDataBridge3 = (ActivityDataBridge) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    Object offlineTransferHistoryData = activityDataBridge3.offlineTransferHistoryData(str, this);
                    if (offlineTransferHistoryData == coroutineSingletons5) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                break;
            case 5:
                ActivityDataBridge activityDataBridge4 = (ActivityDataBridge) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (activityDataBridge4.setNativeActivityFlowToken(str, this) == coroutineSingletons6) {
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
                ActivityDataBridge activityDataBridge5 = (ActivityDataBridge) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (activityDataBridge5.setNativeSearchFlowToken(str, this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i8 != 1) {
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
