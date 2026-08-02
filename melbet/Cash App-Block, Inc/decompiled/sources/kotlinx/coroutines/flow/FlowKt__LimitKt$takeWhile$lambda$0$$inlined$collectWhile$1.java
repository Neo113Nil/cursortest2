package kotlinx.coroutines.flow;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.family.familyhub.backend.real.RealDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1 implements FlowCollector {
    public final /* synthetic */ Function2 $predicate$inlined;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ FlowCollector $this_flow$inlined;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int I$0;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1.this.emit(null, this);
        }
    }

    public FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1(FlowCollector flowCollector, Function2 function2) {
        this.$this_flow$inlined = flowCollector;
        this.$predicate$inlined = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r3.emit(r11, r0) != r13) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r11 == r13) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b8, code lost:
    
        if (r3.emit(r12, r0) == r5) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r13 == r5) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        Object obj2;
        int i;
        RealDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1 realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1;
        int i2;
        int i3 = this.$r8$classId;
        Function2 function2 = this.$predicate$inlined;
        int i4 = 0;
        FlowCollector flowCollector = this.$this_flow$inlined;
        switch (i3) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i5 = anonymousClass1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i5 - PKIFailureInfo.systemUnavail;
                        obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            anonymousClass1.L$2 = obj;
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            obj2 = function2.invoke(obj, anonymousClass1);
                            break;
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    SafeTrace.throwOnFailure(obj2);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i4 = anonymousClass1.I$0;
                            obj = anonymousClass1.L$2;
                            SafeTrace.throwOnFailure(obj2);
                        }
                        if (!((Boolean) obj2).booleanValue()) {
                            anonymousClass1.L$2 = null;
                            anonymousClass1.I$0 = i4;
                            anonymousClass1.label = 2;
                            break;
                        } else {
                            throw new AbortFlowException(this);
                        }
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                obj2 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
            default:
                if (continuation instanceof RealDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1) {
                    realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1 = (RealDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1) continuation;
                    int i6 = realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1.label;
                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                        realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                        Object obj3 = realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1.L$4 = flowCollector;
                            realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1.I$0 = 0;
                            realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1.label = 1;
                            obj3 = function2.invoke(obj, realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1);
                            break;
                        } else {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    SafeTrace.throwOnFailure(obj3);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i4 = realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1.I$0;
                            flowCollector = realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1.L$4;
                            SafeTrace.throwOnFailure(obj3);
                        }
                        realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1.L$4 = null;
                        realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1.I$0 = i4;
                        realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1.label = 2;
                        break;
                    }
                }
                realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1 = new RealDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1(this, continuation);
                Object obj32 = realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
                realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1.L$4 = null;
                realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1.I$0 = i4;
                realDependentSavingsStore$queryDependentSavings$$inlined$map$1$2$1.label = 2;
        }
    }

    public FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1(Function2 function2, FlowCollector flowCollector) {
        this.$predicate$inlined = function2;
        this.$this_flow$inlined = flowCollector;
    }
}
