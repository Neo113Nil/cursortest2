package com.withpersona.sdk2.inquiry.governmentid.cameraScreen;

import androidx.camera.camera2.adapter.CameraControlAdapter;
import androidx.camera.camera2.impl.CapturePipeline;
import androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2;
import androidx.camera.camera2.impl.FlashControl;
import androidx.camera.camera2.impl.UseCaseCameraImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidCameraBinding;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class CameraScreenRunner$showRendering$5 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object $rendering;
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraScreenRunner$showRendering$5(CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer, Continuation continuation, UseCaseCameraImpl useCaseCameraImpl, int i, CameraControlAdapter cameraControlAdapter) {
        super(2, continuation);
        this.L$1 = callbackToFutureAdapter$Completer;
        this.L$2 = useCaseCameraImpl;
        this.I$1 = i;
        this.$rendering = cameraControlAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$rendering;
        switch (i) {
            case 0:
                return new CameraScreenRunner$showRendering$5((Screen.CameraScreen) obj2, (CameraScreenRunner) this.this$0, continuation);
            default:
                return new CameraScreenRunner$showRendering$5((CallbackToFutureAdapter$Completer) this.L$1, continuation, (UseCaseCameraImpl) this.L$2, this.I$1, (CameraControlAdapter) obj2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CameraScreenRunner$showRendering$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r1 == r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d1 -> B:28:0x00d6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        ArrayList arrayList;
        int i2;
        CameraScreenRunner cameraScreenRunner;
        List list;
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer;
        UseCaseCameraImpl useCaseCameraImpl;
        int i3;
        Object awaitFlashModeUpdate;
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer2;
        int i4 = this.$r8$classId;
        Object obj2 = this.$rendering;
        switch (i4) {
            case 0:
                Screen.CameraScreen cameraScreen = (Screen.CameraScreen) obj2;
                CameraScreenRunner cameraScreenRunner2 = (CameraScreenRunner) this.this$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    i = cameraScreen.remainingCaptureCount;
                    arrayList = new ArrayList(i);
                    i2 = 0;
                    cameraScreenRunner = cameraScreenRunner2;
                    if (i2 < i) {
                    }
                } else if (i5 == 1) {
                    int i6 = this.I$1;
                    int i7 = this.I$0;
                    ArrayList arrayList2 = (ArrayList) this.L$2;
                    ArrayList arrayList3 = (ArrayList) this.L$1;
                    cameraScreenRunner = (CameraScreenRunner) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    Object obj3 = ((Result) obj).value;
                    arrayList2.add(Result.m4120exceptionOrNullimpl(obj3) != null ? ((File) obj3).getAbsolutePath() : null);
                    int i8 = i6 + 1;
                    int i9 = i7;
                    i2 = i8;
                    i = i9;
                    arrayList = arrayList3;
                    if (i2 < i) {
                        CameraController cameraController = cameraScreenRunner.cameraController;
                        this.L$0 = cameraScreenRunner;
                        this.L$1 = arrayList;
                        this.L$2 = arrayList;
                        this.I$0 = i;
                        this.I$1 = i2;
                        this.label = 1;
                        Object mo4085takePictureIoAF18A = cameraController.mo4085takePictureIoAF18A(this);
                        if (mo4085takePictureIoAF18A != coroutineSingletons) {
                            arrayList3 = arrayList;
                            i6 = i2;
                            i7 = i;
                            obj3 = mo4085takePictureIoAF18A;
                            arrayList2 = arrayList3;
                            arrayList2.add(Result.m4120exceptionOrNullimpl(obj3) != null ? ((File) obj3).getAbsolutePath() : null);
                            int i82 = i6 + 1;
                            int i92 = i7;
                            i2 = i82;
                            i = i92;
                            arrayList = arrayList3;
                            if (i2 < i) {
                                Pi2GovernmentidCameraBinding pi2GovernmentidCameraBinding = ((BasicGovIdCaptureViewController) cameraScreenRunner2.viewController).binding;
                                pi2GovernmentidCameraBinding.rootView.setHapticFeedbackEnabled(true);
                                pi2GovernmentidCameraBinding.rootView.performHapticFeedback(BasicGovIdCaptureViewController.confirmConst, 2);
                                this.L$0 = arrayList;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 2;
                                if (Unit.INSTANCE != coroutineSingletons) {
                                    list = arrayList;
                                    cameraScreen.autoCapture.invoke(CollectionsKt.filterNotNull(list), cameraScreenRunner2.cameraController.getCameraProperties());
                                }
                            }
                        }
                    }
                    break;
                } else if (i5 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    list = (List) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    cameraScreen.autoCapture.invoke(CollectionsKt.filterNotNull(list), cameraScreenRunner2.cameraController.getCameraProperties());
                    break;
                }
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.I$0;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    callbackToFutureAdapter$Completer = (CallbackToFutureAdapter$Completer) this.L$1;
                    useCaseCameraImpl = (UseCaseCameraImpl) this.L$2;
                    i3 = this.I$1;
                    FlashControl flashControl = ((CameraControlAdapter) obj2).flashControl;
                    this.L$0 = callbackToFutureAdapter$Completer;
                    this.this$0 = useCaseCameraImpl;
                    this.label = i3;
                    this.I$0 = 1;
                    awaitFlashModeUpdate = flashControl.awaitFlashModeUpdate(this);
                    break;
                } else if (i10 == 1) {
                    int i11 = this.label;
                    useCaseCameraImpl = (UseCaseCameraImpl) this.this$0;
                    CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer3 = (CallbackToFutureAdapter$Completer) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    i3 = i11;
                    awaitFlashModeUpdate = obj;
                    callbackToFutureAdapter$Completer = callbackToFutureAdapter$Completer3;
                } else if (i10 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    callbackToFutureAdapter$Completer2 = (CallbackToFutureAdapter$Completer) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    callbackToFutureAdapter$Completer2.set(obj);
                    break;
                }
                int intValue = ((Number) awaitFlashModeUpdate).intValue();
                this.L$0 = callbackToFutureAdapter$Completer;
                this.this$0 = null;
                this.I$0 = 2;
                CapturePipelineImpl$getCameraCapturePipeline$2 cameraCapturePipeline = ((CapturePipeline) useCaseCameraImpl.capturePipeline$delegate.getValue()).getCameraCapturePipeline(i3, intValue);
                if (cameraCapturePipeline != coroutineSingletons2) {
                    CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer4 = callbackToFutureAdapter$Completer;
                    obj = cameraCapturePipeline;
                    callbackToFutureAdapter$Completer2 = callbackToFutureAdapter$Completer4;
                    callbackToFutureAdapter$Completer2.set(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraScreenRunner$showRendering$5(Screen.CameraScreen cameraScreen, CameraScreenRunner cameraScreenRunner, Continuation continuation) {
        super(2, continuation);
        this.$rendering = cameraScreen;
        this.this$0 = cameraScreenRunner;
    }
}
