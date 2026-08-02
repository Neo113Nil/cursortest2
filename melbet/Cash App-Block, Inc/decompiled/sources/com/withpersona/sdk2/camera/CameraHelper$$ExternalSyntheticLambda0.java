package com.withpersona.sdk2.camera;

import android.content.Context;
import android.util.Log;
import android.widget.FrameLayout;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.video.VideoCapture;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import com.squareup.workflow1.internal.SubtreeManager;
import com.squareup.workflow1.ui.BackPressHandlerKt;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.encode.EncodeKt;
import com.stripe.hcaptcha.webview.HCaptchaDebugInfo;
import com.withpersona.sdk2.camera.camera2.Camera2Manager;
import com.withpersona.sdk2.inquiry.device.RealDeviceIdProvider;
import com.withpersona.sdk2.inquiry.device.RealDeviceVendorIDProvider;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfigForCountry;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.BasicGovIdCaptureViewController;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.CaptureTipsBottomSheetController;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidCaptureTipsBinding;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStateManagerUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$renderScreen$12;
import com.withpersona.sdk2.inquiry.governmentid.reviewCaptureScreen.GovernmentIdReviewRunner$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment;
import com.withpersona.sdk2.inquiry.internal.InquiryActivity;
import com.withpersona.sdk2.inquiry.internal.InquiryArguments;
import com.withpersona.sdk2.inquiry.internal.InquiryFragment;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ParsedRules;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieCameraBinding;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerKey;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.JobKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class CameraHelper$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CameraHelper$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        String str2;
        ParsedRules parsedRules_delegate$lambda$1;
        int precedenceScore_delegate$lambda$3;
        int i = this.$r8$classId;
        Object[] objArr = 0;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                return (ProcessCameraProvider) ((ListenableFuture) obj).get();
            case 1:
                Context context = ((HCaptchaDebugInfo) obj).context;
                try {
                    KSerializer serializer = BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE);
                    serializer.getClass();
                    return EncodeKt.json.encodeToString(new HashSetSerializer(serializer, 1), HCaptchaDebugInfo.debugInfo(context.getPackageName(), context.getPackageCodePath()));
                } catch (IOException unused) {
                    Log.d("JSDI", "Cannot build debugInfo");
                    return "[]";
                }
            case 2:
                KSerializer serializer2 = HCaptchaConfig.Companion.serializer();
                JsonImpl jsonImpl = EncodeKt.json;
                serializer2.getClass();
                return EncodeKt.json.encodeToString(serializer2, (HCaptchaConfig) obj);
            case 3:
                Camera2Manager camera2Manager = (Camera2Manager) obj;
                if (camera2Manager.isPreviewSurfaceAvailable) {
                    JobKt.launch$default(camera2Manager.coroutineScope, null, null, new Camera2Manager.AnonymousClass1(camera2Manager, objArr == true ? 1 : 0, 8), 3);
                }
                return Unit.INSTANCE;
            case 4:
                return ((RealDeviceIdProvider) obj).context.getSharedPreferences("com.withpersona.sdk2.prefs", 0);
            case 5:
                return ((RealDeviceVendorIDProvider) obj).context.getSharedPreferences("com.withpersona.sdk2.prefs", 0);
            case 6:
                ((BasicGovIdCaptureViewController) obj).playExpandAnimation();
                return Unit.INSTANCE;
            case 7:
                Pi2GovernmentidCaptureTipsBinding pi2GovernmentidCaptureTipsBinding = (Pi2GovernmentidCaptureTipsBinding) obj;
                BottomSheetBehavior.from(pi2GovernmentidCaptureTipsBinding.bottomSheet).setState(5);
                FrameLayout frameLayout = pi2GovernmentidCaptureTipsBinding.rootView;
                frameLayout.getClass();
                BackPressHandlerKt.setBackPressedHandler(frameLayout, null);
                return Unit.INSTANCE;
            case 8:
                CaptureTipsBottomSheetController captureTipsBottomSheetController = (CaptureTipsBottomSheetController) obj;
                captureTipsBottomSheetController.isShowing = false;
                captureTipsBottomSheetController.updateBackPressedHandler();
                return Unit.INSTANCE;
            case 9:
                SystemUiControllerKey systemUiControllerKey = SystemUiControllerKey.INSTANCE;
                SystemUiController systemUiController = ((GovernmentIdStepFragment) obj).systemUiController;
                if (systemUiController != null) {
                    return new ViewEnvironment(MapsKt__MapsJVMKt.mapOf(new Pair(systemUiControllerKey, systemUiController)));
                }
                Intrinsics.throwUninitializedPropertyAccessException("systemUiController");
                throw null;
            case 10:
                ((GovernmentIdStepStateManager$$ExternalSyntheticLambda1) obj).invoke(GovernmentIdWorkflow.Output.Canceled.INSTANCE);
                return Unit.INSTANCE;
            case 11:
                SubtreeManager subtreeManager = (SubtreeManager) obj;
                WorkflowState state = subtreeManager.getState();
                GovernmentIdState.AutoClassificationError autoClassificationError = state instanceof GovernmentIdState.AutoClassificationError ? (GovernmentIdState.AutoClassificationError) state : null;
                if (autoClassificationError == null) {
                    return Unit.INSTANCE;
                }
                ArrayList arrayList = autoClassificationError.idConfigsForCountry;
                if (arrayList.size() == 1) {
                    IdConfigForCountry idConfigForCountry = (IdConfigForCountry) CollectionsKt.first((List) arrayList);
                    String str3 = idConfigForCountry.ids.size() == 1 ? ((IdConfig) CollectionsKt.first((List) idConfigForCountry.ids)).idClassKey : null;
                    str = idConfigForCountry.countryCode;
                    str2 = str3;
                } else {
                    str = null;
                    str2 = null;
                }
                subtreeManager.updateState(new GovernmentIdState.AutoClassificationManualSelect(autoClassificationError.currentPart, autoClassificationError.uploadingIds, autoClassificationError.parts, autoClassificationError.partIndex, GovernmentIdStateManagerUtilsKt.createBackState(subtreeManager, true), autoClassificationError.countryCode, autoClassificationError.captureFrames, new CameraProperties(null, null, null, 0, 31, 0), arrayList, str, str2));
                return Unit.INSTANCE;
            case 12:
                ((GovernmentIdStepStateManager$$ExternalSyntheticLambda1) obj).invoke(GovernmentIdWorkflow.Output.Canceled.INSTANCE);
                return Unit.INSTANCE;
            case 13:
                ((GovernmentIdStepStateManager$$ExternalSyntheticLambda1) obj).invoke(GovernmentIdWorkflow.Output.Canceled.INSTANCE);
                return Unit.INSTANCE;
            case 14:
                ((GovernmentIdStepStateManager$renderScreen$12) obj).send(GovernmentIdWorkflow.Output.Canceled.INSTANCE);
                return Unit.INSTANCE;
            case 15:
                ((GovernmentIdStepStateManager$renderScreen$12) obj).send(GovernmentIdWorkflow.Output.Canceled.INSTANCE);
                return Unit.INSTANCE;
            case 16:
                ((GovernmentIdStepStateManager$$ExternalSyntheticLambda1) obj).invoke(GovernmentIdWorkflow.Output.Canceled.INSTANCE);
                return Unit.INSTANCE;
            case 17:
                ((GovernmentIdStepStateManager$$ExternalSyntheticLambda1) obj).invoke(GovernmentIdWorkflow.Output.Canceled.INSTANCE);
                return Unit.INSTANCE;
            case 18:
                ((GovernmentIdReviewRunner$$ExternalSyntheticLambda0) obj).invoke();
                return Unit.INSTANCE;
            case 19:
                ((GovernmentIdReviewRunner$$ExternalSyntheticLambda0) obj).invoke();
                return Unit.INSTANCE;
            case 20:
                SystemUiControllerKey systemUiControllerKey2 = SystemUiControllerKey.INSTANCE;
                SystemUiController systemUiController2 = ((IntegrationStepFragment) obj).systemUiController;
                if (systemUiController2 != null) {
                    return new ViewEnvironment(MapsKt__MapsJVMKt.mapOf(new Pair(systemUiControllerKey2, systemUiController2)));
                }
                Intrinsics.throwUninitializedPropertyAccessException("systemUiController");
                throw null;
            case 21:
                int i2 = InquiryActivity.$r8$clinit;
                return new InquiryArguments(((InquiryActivity) obj).getIntent().getExtras());
            case 22:
                return new InquiryArguments(((InquiryFragment) obj).getArguments());
            case 23:
                ((CameraHelper$$ExternalSyntheticLambda0) ((VideoCapture.AnonymousClass3) obj).this$0).invoke();
                return Unit.INSTANCE;
            case 24:
                InquiryStateManager.handleState$onCancel((InquiryStateManager) obj, false, false);
                return Unit.INSTANCE;
            case 25:
                parsedRules_delegate$lambda$1 = JsonLogicBoolean.parsedRules_delegate$lambda$1((JsonLogicBoolean) obj);
                return parsedRules_delegate$lambda$1;
            case 26:
                precedenceScore_delegate$lambda$3 = NextStep.GovernmentId.LocalizationOverride.precedenceScore_delegate$lambda$3((NextStep.GovernmentId.LocalizationOverride) obj);
                return Integer.valueOf(precedenceScore_delegate$lambda$3);
            case 27:
                ((Function0) ((SubtreeManager) obj).children).invoke();
                return Unit.INSTANCE;
            case 28:
                ((Pi2SelfieCameraBinding) obj).selfieOverlay.setIntensity(RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            default:
                SystemUiControllerKey systemUiControllerKey3 = SystemUiControllerKey.INSTANCE;
                SystemUiController systemUiController3 = ((SelfieStepFragment) obj).systemUiController;
                if (systemUiController3 != null) {
                    return new ViewEnvironment(MapsKt__MapsJVMKt.mapOf(new Pair(systemUiControllerKey3, systemUiController3)));
                }
                Intrinsics.throwUninitializedPropertyAccessException("systemUiController");
                throw null;
        }
    }
}
