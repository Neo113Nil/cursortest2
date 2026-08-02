package com.withpersona.sdk2.inquiry.integration;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherResult;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__CollectionKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class IntegrationBrowserWorker$run$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ IntegrationBrowserWorker this$0;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NextStep.Integration.IntegrationStepBrowserType.values().length];
            try {
                iArr[NextStep.Integration.IntegrationStepBrowserType.External.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NextStep.Integration.IntegrationStepBrowserType.AuthSession.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegrationBrowserWorker$run$1(IntegrationBrowserWorker integrationBrowserWorker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = integrationBrowserWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        IntegrationBrowserWorker$run$1 integrationBrowserWorker$run$1 = new IntegrationBrowserWorker$run$1(this.this$0, continuation);
        integrationBrowserWorker$run$1.L$0 = obj;
        return integrationBrowserWorker$run$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((IntegrationBrowserWorker$run$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0085, code lost:
    
        if (r1.emit(r2, r11) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        if (r12 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (r1.emit(r2, r11) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r6, r9, r11) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r3, r4, r11) == r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object collection;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        IntegrationBrowserWorker$Output$Complete integrationBrowserWorker$Output$Complete = IntegrationBrowserWorker$Output$Complete.INSTANCE;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            IntegrationBrowserWorker integrationBrowserWorker = this.this$0;
            int i2 = WhenMappings.$EnumSwitchMapping$0[integrationBrowserWorker.integrationStepBrowserType.ordinal()];
            if (i2 == 1) {
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                HazeSourceNode$launchPreDraw$1 hazeSourceNode$launchPreDraw$1 = new HazeSourceNode$launchPreDraw$1(integrationBrowserWorker, continuation, 16);
                this.L$0 = flowCollector;
                this.label = 1;
            } else {
                if (i2 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                HandlerContext handlerContext2 = MainDispatcherLoader.dispatcher;
                CameraHelper$unbind$2 cameraHelper$unbind$2 = new CameraHelper$unbind$2(integrationBrowserWorker, continuation, 27);
                this.L$0 = flowCollector;
                this.label = 3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    flowCollector = (FlowCollector) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take = FlowKt.take(new CustomTabsLauncherResult(), 1);
                    this.L$0 = flowCollector;
                    this.label = 4;
                    collection = FlowKt__CollectionKt.toCollection(take, new ArrayList(), this);
                } else if (i == 4) {
                    flowCollector = (FlowCollector) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 5;
                } else if (i != 5) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            SafeTrace.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        flowCollector = (FlowCollector) this.L$0;
        SafeTrace.throwOnFailure(obj);
        this.L$0 = null;
        this.label = 2;
    }
}
