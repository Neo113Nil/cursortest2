package kotlinx.coroutines.flow;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class StartedLazily$command$1$1 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Ref$BooleanRef $started;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    public /* synthetic */ StartedLazily$command$1$1(Ref$BooleanRef ref$BooleanRef, FlowCollector flowCollector, int i) {
        this.$r8$classId = i;
        this.$started = ref$BooleanRef;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__EmittersKt$onEmpty$1$1$emit$1 flowKt__EmittersKt$onEmpty$1$1$emit$1;
        int i;
        switch (this.$r8$classId) {
            case 0:
                return emit(((Number) obj).intValue(), continuation);
            default:
                if (continuation instanceof FlowKt__EmittersKt$onEmpty$1$1$emit$1) {
                    flowKt__EmittersKt$onEmpty$1$1$emit$1 = (FlowKt__EmittersKt$onEmpty$1$1$emit$1) continuation;
                    int i2 = flowKt__EmittersKt$onEmpty$1$1$emit$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        flowKt__EmittersKt$onEmpty$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj2 = flowKt__EmittersKt$onEmpty$1$1$emit$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = flowKt__EmittersKt$onEmpty$1$1$emit$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            this.$started.element = false;
                            flowKt__EmittersKt$onEmpty$1$1$emit$1.label = 1;
                            if (this.$this_unsafeFlow.emit(obj, flowKt__EmittersKt$onEmpty$1$1$emit$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                flowKt__EmittersKt$onEmpty$1$1$emit$1 = new FlowKt__EmittersKt$onEmpty$1$1$emit$1(this, continuation);
                Object obj22 = flowKt__EmittersKt$onEmpty$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__EmittersKt$onEmpty$1$1$emit$1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(int i, Continuation continuation) {
        StartedLazily$command$1$1$emit$1 startedLazily$command$1$1$emit$1;
        int i2;
        if (continuation instanceof StartedLazily$command$1$1$emit$1) {
            startedLazily$command$1$1$emit$1 = (StartedLazily$command$1$1$emit$1) continuation;
            int i3 = startedLazily$command$1$1$emit$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                startedLazily$command$1$1$emit$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = startedLazily$command$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = startedLazily$command$1$1$emit$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (i > 0) {
                        Ref$BooleanRef ref$BooleanRef = this.$started;
                        if (!ref$BooleanRef.element) {
                            ref$BooleanRef.element = true;
                            SharingCommand sharingCommand = SharingCommand.START;
                            startedLazily$command$1$1$emit$1.label = 1;
                            if (this.$this_unsafeFlow.emit(sharingCommand, startedLazily$command$1$1$emit$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
        }
        startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, continuation);
        Object obj2 = startedLazily$command$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = startedLazily$command$1$1$emit$1.label;
        if (i2 != 0) {
        }
        return Unit.INSTANCE;
    }
}
