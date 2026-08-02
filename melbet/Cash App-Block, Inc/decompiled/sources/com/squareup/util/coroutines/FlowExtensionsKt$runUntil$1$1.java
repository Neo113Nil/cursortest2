package com.squareup.util.coroutines;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$EnableTesBasedTaxesEntryPoint;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.initialscreenloader.backend.RealInitialScreenLoader;
import com.squareup.cash.tax.backend.real.RealTaxEntryTileUserDataProvider;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.GetScenarioPlanRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1;
import kotlinx.coroutines.flow.internal.CombineKt;
import kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1$emit$1;
import kotlinx.coroutines.internal.Symbol;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class FlowExtensionsKt$runUntil$1$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ Object $$this$channelFlow;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $this_runUntil;
    public int label;

    /* renamed from: com.squareup.util.coroutines.FlowExtensionsKt$runUntil$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements FlowCollector {
        public final /* synthetic */ ProducerScope $$this$channelFlow;
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass1(ProducerScope producerScope, int i) {
            this.$r8$classId = i;
            this.$$this$channelFlow = producerScope;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1;
            int i;
            CombineKt$zipImpl$1$1$second$1$1$emit$1 combineKt$zipImpl$1$1$second$1$1$emit$1;
            int i2;
            int i3 = this.$r8$classId;
            ProducerScope producerScope = this.$$this$channelFlow;
            switch (i3) {
                case 0:
                    Object send = ((ProducerCoroutine) producerScope)._channel.send(obj, continuation);
                    if (send != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                    break;
                case 1:
                    if (continuation instanceof FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) {
                        flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = (FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) continuation;
                        int i4 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.label;
                        if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                            flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.label = i4 - PKIFailureInfo.systemUnavail;
                            Object obj2 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj2);
                                if (obj == null) {
                                    obj = CombineKt.NULL;
                                }
                                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.label = 1;
                                if (((ProducerCoroutine) producerScope)._channel.send(obj, flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) == coroutineSingletons) {
                                    break;
                                }
                            } else if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj2);
                            }
                            break;
                        }
                    }
                    flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = new FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(this, continuation);
                    Object obj22 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.label;
                    if (i != 0) {
                    }
                default:
                    if (continuation instanceof CombineKt$zipImpl$1$1$second$1$1$emit$1) {
                        combineKt$zipImpl$1$1$second$1$1$emit$1 = (CombineKt$zipImpl$1$1$second$1$1$emit$1) continuation;
                        int i5 = combineKt$zipImpl$1$1$second$1$1$emit$1.label;
                        if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                            combineKt$zipImpl$1$1$second$1$1$emit$1.label = i5 - PKIFailureInfo.systemUnavail;
                            Object obj3 = combineKt$zipImpl$1$1$second$1$1$emit$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = combineKt$zipImpl$1$1$second$1$1$emit$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                ProducerCoroutine producerCoroutine = (ProducerCoroutine) producerScope;
                                producerCoroutine.getClass();
                                if (obj == null) {
                                    obj = CombineKt.NULL;
                                }
                                combineKt$zipImpl$1$1$second$1$1$emit$1.label = 1;
                                if (producerCoroutine._channel.send(obj, combineKt$zipImpl$1$1$second$1$1$emit$1) == coroutineSingletons3) {
                                    break;
                                }
                            } else if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj3);
                            }
                            break;
                        }
                    }
                    combineKt$zipImpl$1$1$second$1$1$emit$1 = new CombineKt$zipImpl$1$1$second$1$1$emit$1(this, continuation);
                    Object obj32 = combineKt$zipImpl$1$1$second$1$1$emit$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = combineKt$zipImpl$1$1$second$1$1$emit$1.label;
                    if (i2 != 0) {
                    }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowExtensionsKt$runUntil$1$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.$this_runUntil = obj;
        this.$$this$channelFlow = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.$$this$channelFlow;
        Object obj2 = this.$this_runUntil;
        switch (i) {
            case 0:
                return new FlowExtensionsKt$runUntil$1$1((Flow) obj2, (ProducerScope) obj, continuation, 0);
            case 1:
                return new FlowExtensionsKt$runUntil$1$1((RealInitialScreenLoader) obj2, (String) obj, continuation, 1);
            case 2:
                return new FlowExtensionsKt$runUntil$1$1((FeatureFlagManager) obj2, (RealTaxEntryTileUserDataProvider) obj, continuation, 2);
            default:
                return new FlowExtensionsKt$runUntil$1$1((FlowCollector) obj2, (Ref$ObjectRef) obj, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((FlowExtensionsKt$runUntil$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$this_runUntil;
        Object obj3 = this.$$this$channelFlow;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1((ProducerScope) obj3, 0);
                    this.label = 1;
                    if (((Flow) obj2).collect(anonymousClass1, this) == coroutineSingletons) {
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
                    GetScenarioPlanRequest getScenarioPlanRequest = new GetScenarioPlanRequest(null, ByteString.EMPTY);
                    this.label = 1;
                    Object scenarioPlan = ((RealInitialScreenLoader) obj2).franklinAppService.getScenarioPlan(ClientScenario.ONBOARDING, (String) obj3, getScenarioPlanRequest, this);
                    if (scenarioPlan == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) obj2)).peekCurrentValue(LaunchDarklyFeatureFlags$EnableTesBasedTaxesEntryPoint.INSTANCE)).enabled()) {
                        this.label = 1;
                        if (((RealTaxEntryTileUserDataProvider) obj3).getEntryTileUserDataAndRefreshBadging(this) == coroutineSingletons3) {
                            break;
                        }
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) obj2;
                    Symbol symbol = CombineKt.NULL;
                    Object obj4 = ref$ObjectRef.element;
                    if (obj4 == symbol) {
                        obj4 = null;
                    }
                    this.label = 1;
                    if (flowCollector.emit(obj4, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                ref$ObjectRef.element = null;
                break;
        }
        return Unit.INSTANCE;
    }
}
