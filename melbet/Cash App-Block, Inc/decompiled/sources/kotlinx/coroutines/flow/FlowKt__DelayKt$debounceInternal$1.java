package kotlinx.coroutines.flow;

import app.cash.sqldelight.coroutines.FlowQuery$asFlow$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.coroutines.FlowExtensionsKt$runUntil$1$1;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.CombineKt;
import kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ Flow $this_debounceInternal;
    public final /* synthetic */ Function1 $timeoutMillisSelector;
    public /* synthetic */ CoroutineScope L$0;
    public /* synthetic */ FlowCollector L$1;
    public ReceiveChannel L$2;
    public Ref$ObjectRef L$3;
    public Ref$LongRef L$4;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(Function1 function1, Flow flow, Continuation continuation) {
        super(3, continuation);
        this.$timeoutMillisSelector = function1;
        this.$this_debounceInternal = flow;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.$timeoutMillisSelector, this.$this_debounceInternal, (Continuation) obj3);
        flowKt__DelayKt$debounceInternal$1.L$0 = (CoroutineScope) obj;
        flowKt__DelayKt$debounceInternal$1.L$1 = (FlowCollector) obj2;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r1.emit(r14, r13) == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c3, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
    
        if (r7.doSelect(r13) != r2) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c1 -> B:6:0x0018). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        ReceiveChannel receiveChannel;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$LongRef ref$LongRef;
        ReceiveChannel receiveChannel2;
        Object obj2;
        CoroutineScope coroutineScope = this.L$0;
        FlowCollector flowCollector = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            ProducerCoroutine produce$default = TuplesKt.produce$default(coroutineScope, new CombineKt$zipImpl$1$1$second$1(this.$this_debounceInternal, null, 1));
            ref$ObjectRef = new Ref$ObjectRef();
            receiveChannel = produce$default;
            ref$ObjectRef2 = ref$ObjectRef;
            obj2 = ref$ObjectRef2.element;
            if (obj2 != CombineKt.DONE) {
            }
        } else if (i == 1) {
            ref$LongRef = this.L$4;
            ref$ObjectRef2 = this.L$3;
            receiveChannel = this.L$2;
            SafeTrace.throwOnFailure(obj);
            ref$ObjectRef2.element = null;
            Ref$LongRef ref$LongRef2 = ref$LongRef;
            ref$ObjectRef = ref$ObjectRef2;
            receiveChannel2 = receiveChannel;
            SelectImplementation selectImplementation = new SelectImplementation(getContext());
            if (ref$ObjectRef.element != null) {
            }
            selectImplementation.invoke(receiveChannel2.getOnReceiveCatching(), new FlowQuery$asFlow$1(ref$ObjectRef, flowCollector, continuation, 17));
            this.L$0 = null;
            this.L$1 = flowCollector;
            this.L$2 = receiveChannel2;
            this.L$3 = ref$ObjectRef;
            this.L$4 = null;
            this.label = 2;
        } else {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef = this.L$3;
            receiveChannel2 = this.L$2;
            SafeTrace.throwOnFailure(obj);
            receiveChannel = receiveChannel2;
            ref$ObjectRef2 = ref$ObjectRef;
            obj2 = ref$ObjectRef2.element;
            if (obj2 != CombineKt.DONE) {
                return Unit.INSTANCE;
            }
            ref$LongRef = new Ref$LongRef();
            if (obj2 != null) {
                Symbol symbol = CombineKt.NULL;
                if (obj2 == symbol) {
                    obj2 = null;
                }
                long longValue = ((Number) this.$timeoutMillisSelector.invoke(obj2)).longValue();
                ref$LongRef.element = longValue;
                if (longValue < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3("Debounce timeout should not be negative");
                    return null;
                }
                if (longValue == 0) {
                    Object obj3 = ref$ObjectRef2.element;
                    if (obj3 == symbol) {
                        obj3 = null;
                    }
                    this.L$0 = null;
                    this.L$1 = flowCollector;
                    this.L$2 = receiveChannel;
                    this.L$3 = ref$ObjectRef2;
                    this.L$4 = ref$LongRef;
                    this.label = 1;
                }
            }
            Ref$LongRef ref$LongRef22 = ref$LongRef;
            ref$ObjectRef = ref$ObjectRef2;
            receiveChannel2 = receiveChannel;
            SelectImplementation selectImplementation2 = new SelectImplementation(getContext());
            if (ref$ObjectRef.element != null) {
                SelectKt.onTimeout(selectImplementation2, ref$LongRef22.element, new FlowExtensionsKt$runUntil$1$1(flowCollector, ref$ObjectRef, null, 3));
            }
            selectImplementation2.invoke(receiveChannel2.getOnReceiveCatching(), new FlowQuery$asFlow$1(ref$ObjectRef, flowCollector, continuation, 17));
            this.L$0 = null;
            this.L$1 = flowCollector;
            this.L$2 = receiveChannel2;
            this.L$3 = ref$ObjectRef;
            this.L$4 = null;
            this.label = 2;
        }
    }
}
