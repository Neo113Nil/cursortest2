package kotlinx.coroutines.flow.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import androidx.collection.MutableScatterMap;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;
import papa.SafeTrace;
import retrofit2.KotlinExtensions$await$2$1;

/* loaded from: classes3.dex */
public final class CombineKt$zipImpl$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $flow;
    public final /* synthetic */ Object $flow2;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object $this_unsafeFlow;
    public final /* synthetic */ Object $transform;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1(Flow flow, CoroutineContext coroutineContext, Object obj, ProducerCoroutine producerCoroutine, FlowCollector flowCollector, Function3 function3, JobImpl jobImpl, Continuation continuation) {
        super(2, continuation);
        this.$flow2 = flow;
        this.$flow = coroutineContext;
        this.L$0 = obj;
        this.L$1 = producerCoroutine;
        this.$this_unsafeFlow = flowCollector;
        this.$transform = function3;
        this.L$2 = jobImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$transform;
        Object obj3 = this.$this_unsafeFlow;
        Object obj4 = this.$flow;
        Object obj5 = this.$flow2;
        switch (i) {
            case 0:
                CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1((Flow) obj5, (Flow) obj4, (FlowCollector) obj3, (Function3) obj2, continuation);
                combineKt$zipImpl$1$1.L$0 = obj;
                return combineKt$zipImpl$1$1;
            case 1:
                CombineKt$zipImpl$1$1 combineKt$zipImpl$1$12 = new CombineKt$zipImpl$1$1((ContentResolver) this.L$2, (Uri) obj5, (WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1) obj4, (BufferedChannel) obj3, (Context) obj2, continuation);
                combineKt$zipImpl$1$12.L$0 = obj;
                return combineKt$zipImpl$1$12;
            default:
                return new CombineKt$zipImpl$1$1((Flow) obj5, (CoroutineContext) obj4, this.L$0, (ProducerCoroutine) this.L$1, (FlowCollector) obj3, (Function3) obj2, (JobImpl) this.L$2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((CombineKt$zipImpl$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((CombineKt$zipImpl$1$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((CombineKt$zipImpl$1$1) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
    
        if (r7.emit(r6, r20) == r10) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab A[Catch: all -> 0x006e, TRY_LEAVE, TryCatch #4 {all -> 0x006e, blocks: (B:22:0x0069, B:24:0x0096, B:29:0x00a3, B:31:0x00ab, B:39:0x007c, B:42:0x008f), top: B:17:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016f A[Catch: all -> 0x00f5, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00f5, blocks: (B:52:0x00f1, B:58:0x0167, B:60:0x016f), top: B:47:0x00e4 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ce -> B:22:0x0096). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        JobImpl jobImpl;
        ProducerCoroutine producerCoroutine;
        CoroutineContext coroutineContext;
        Object threadContextElements;
        CoroutineContext plus;
        Unit unit;
        FlowCollector flowCollector;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
        Object obj2;
        int i = this.$r8$classId;
        ProducerCoroutine producerCoroutine2 = null;
        Object obj3 = this.$transform;
        Object obj4 = this.$this_unsafeFlow;
        Object obj5 = this.$flow;
        Object obj6 = this.$flow2;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                try {
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ProducerCoroutine produce$default = TuplesKt.produce$default(coroutineScope, new CombineKt$zipImpl$1$1$second$1((Flow) obj6, null, 0));
                        JobImpl Job$default = JobKt.Job$default();
                        produce$default.invokeOnClose(new KotlinExtensions$await$2$1(Job$default, 4));
                        try {
                            try {
                                coroutineContext = coroutineScope.getCoroutineContext();
                                threadContextElements = ThreadContextKt.threadContextElements(coroutineContext);
                                plus = coroutineScope.getCoroutineContext().plus(Job$default);
                                unit = Unit.INSTANCE;
                            } catch (AbortFlowException e) {
                                e = e;
                            }
                            try {
                                CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1((Flow) obj5, coroutineContext, threadContextElements, produce$default, (FlowCollector) obj4, (Function3) obj3, Job$default, null);
                                this.L$0 = null;
                                this.L$1 = produce$default;
                                this.L$2 = Job$default;
                                this.label = 1;
                                if (CombineKt.withContextUndispatched(plus, unit, ThreadContextKt.threadContextElements(plus), combineKt$zipImpl$1$1, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                producerCoroutine = produce$default;
                            } catch (AbortFlowException e2) {
                                e = e2;
                                Job$default = Job$default;
                                jobImpl = Job$default;
                                producerCoroutine = produce$default;
                                if (e.owner != jobImpl) {
                                    throw e;
                                }
                                producerCoroutine.cancel(null);
                                return Unit.INSTANCE;
                            }
                        } catch (Throwable th) {
                            th = th;
                            producerCoroutine2 = produce$default;
                            producerCoroutine2.cancel(null);
                            throw th;
                        }
                    } else {
                        if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        jobImpl = (JobImpl) this.L$2;
                        producerCoroutine = (ProducerCoroutine) this.L$1;
                        try {
                            SafeTrace.throwOnFailure(obj);
                        } catch (AbortFlowException e3) {
                            e = e3;
                            if (e.owner != jobImpl) {
                            }
                            producerCoroutine.cancel(null);
                            return Unit.INSTANCE;
                        }
                    }
                    producerCoroutine.cancel(null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                }
            case 1:
                WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 = (WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1) obj5;
                ContentResolver contentResolver = (ContentResolver) this.L$2;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                try {
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        flowCollector = (FlowCollector) this.L$0;
                        contentResolver.registerContentObserver((Uri) obj6, false, windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1);
                        bufferedChannelIterator = ((BufferedChannel) obj4).new BufferedChannelIterator();
                    } else if (i3 == 1) {
                        bufferedChannelIterator = (BufferedChannel.BufferedChannelIterator) this.L$1;
                        FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        flowCollector = flowCollector2;
                        obj2 = obj;
                        if (!((Boolean) obj2).booleanValue()) {
                            bufferedChannelIterator.next();
                            MutableScatterMap mutableScatterMap = WindowRecomposer_androidKt.animationScale;
                            Float f = new Float(Settings.Global.getFloat(((Context) obj3).getContentResolver(), "animator_duration_scale", 1.0f));
                            this.L$0 = flowCollector;
                            this.L$1 = bufferedChannelIterator;
                            this.label = 2;
                            break;
                        } else {
                            contentResolver.unregisterContentObserver(windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1);
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (i3 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bufferedChannelIterator = (BufferedChannel.BufferedChannelIterator) this.L$1;
                        FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        flowCollector = flowCollector3;
                    }
                    this.L$0 = flowCollector;
                    this.L$1 = bufferedChannelIterator;
                    this.label = 1;
                    obj2 = bufferedChannelIterator.hasNext(this);
                    if (obj2 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    if (!((Boolean) obj2).booleanValue()) {
                    }
                } catch (Throwable th3) {
                    contentResolver.unregisterContentObserver(windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1);
                    throw th3;
                }
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CombineKt$zipImpl$1$1$2$1 combineKt$zipImpl$1$1$2$1 = new CombineKt$zipImpl$1$1$2$1((CoroutineContext) obj5, this.L$0, (ProducerCoroutine) this.L$1, (FlowCollector) obj4, (Function3) obj3, (JobImpl) this.L$2);
                    this.label = 1;
                    if (((Flow) obj6).collect(combineKt$zipImpl$1$1$2$1, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1(ContentResolver contentResolver, Uri uri, WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1, BufferedChannel bufferedChannel, Context context, Continuation continuation) {
        super(2, continuation);
        this.L$2 = contentResolver;
        this.$flow2 = uri;
        this.$flow = windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1;
        this.$this_unsafeFlow = bufferedChannel;
        this.$transform = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1(Flow flow, Flow flow2, FlowCollector flowCollector, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.$flow2 = flow;
        this.$flow = flow2;
        this.$this_unsafeFlow = flowCollector;
        this.$transform = function3;
    }
}
