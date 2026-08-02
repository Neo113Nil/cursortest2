package com.withpersona.sdk2.inquiry.selfie;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.math.MathUtils;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.withpersona.sdk2.camera.CameraController;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class OldCameraScreenRunner$showRendering$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ LifecycleCoroutineScopeImpl $lifecycleScope;
    public final /* synthetic */ MathUtils $mode;
    public final /* synthetic */ int $r8$classId = 1;
    public int label;
    public final /* synthetic */ OldCameraScreenRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OldCameraScreenRunner$showRendering$1$1(MathUtils mathUtils, OldCameraScreenRunner oldCameraScreenRunner, LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, Continuation continuation) {
        super(2, continuation);
        this.$mode = mathUtils;
        this.this$0 = oldCameraScreenRunner;
        this.$lifecycleScope = lifecycleCoroutineScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.$lifecycleScope;
        OldCameraScreenRunner oldCameraScreenRunner = this.this$0;
        MathUtils mathUtils = this.$mode;
        switch (i) {
            case 0:
                return new OldCameraScreenRunner$showRendering$1$1(oldCameraScreenRunner, mathUtils, lifecycleCoroutineScopeImpl, continuation);
            default:
                return new OldCameraScreenRunner$showRendering$1$1(mathUtils, oldCameraScreenRunner, lifecycleCoroutineScopeImpl, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((OldCameraScreenRunner$showRendering$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bf, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r11, r3, r10) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ad, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collect(r8, r10) == r0) goto L39;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object mo4083startVideoIoAF18A;
        int i = this.$r8$classId;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.$lifecycleScope;
        MathUtils mathUtils = this.$mode;
        OldCameraScreenRunner oldCameraScreenRunner = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(oldCameraScreenRunner.cameraController.getCameraState(), new RealSheetState$peek$3.AnonymousClass2(2, null, 16), 0);
                    this.label = 1;
                    break;
                } else if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i2 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                OldCameraScreenRunner$showRendering$1$1 oldCameraScreenRunner$showRendering$1$1 = new OldCameraScreenRunner$showRendering$1$1(mathUtils, oldCameraScreenRunner, lifecycleCoroutineScopeImpl, (Continuation) null);
                this.label = 2;
                break;
            default:
                CameraController cameraController = oldCameraScreenRunner.cameraController;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable) mathUtils).recordLocalVideo) {
                        this.label = 1;
                        mo4083startVideoIoAF18A = cameraController.mo4083startVideoIoAF18A(this);
                        if (mo4083startVideoIoAF18A == coroutineSingletons2) {
                            break;
                        }
                    }
                    ((SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable) mathUtils).previewReady.invoke(cameraController.getCameraProperties());
                    break;
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    mo4083startVideoIoAF18A = ((Result) obj).value;
                }
                Result.Companion companion = Result.Companion;
                if (!(mo4083startVideoIoAF18A instanceof Result.Failure) && ((Boolean) mo4083startVideoIoAF18A).booleanValue()) {
                    StandaloneCoroutine standaloneCoroutine = oldCameraScreenRunner.maxRecordingLimitJob;
                    if (standaloneCoroutine != null) {
                        standaloneCoroutine.cancel(null);
                    }
                    DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                    oldCameraScreenRunner.maxRecordingLimitJob = JobKt.launch$default(lifecycleCoroutineScopeImpl, DefaultIoScheduler.INSTANCE, null, new OldCameraScreenRunner$showRendering$1$1$2$1$1(mathUtils, oldCameraScreenRunner, null), 2);
                }
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(mo4083startVideoIoAF18A);
                if (m4120exceptionOrNullimpl != null) {
                    ((SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable) mathUtils).onError.invoke(m4120exceptionOrNullimpl);
                }
                ((SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable) mathUtils).previewReady.invoke(cameraController.getCameraProperties());
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OldCameraScreenRunner$showRendering$1$1(OldCameraScreenRunner oldCameraScreenRunner, MathUtils mathUtils, LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oldCameraScreenRunner;
        this.$mode = mathUtils;
        this.$lifecycleScope = lifecycleCoroutineScopeImpl;
    }
}
