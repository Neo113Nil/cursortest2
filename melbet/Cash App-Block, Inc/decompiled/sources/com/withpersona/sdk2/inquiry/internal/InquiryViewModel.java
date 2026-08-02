package com.withpersona.sdk2.inquiry.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.webkit.URLUtil;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.contract.ActivityResultContracts$OpenDocument;
import androidx.activity.result.contract.ActivityResultContracts$OpenMultipleDocuments;
import androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.activity.result.contract.ActivityResultContracts$StartIntentSenderForResult;
import androidx.activity.result.contract.ActivityResultContracts$TakePicture;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.platform.UriHandler;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.datadog.trace.core.util.Matchers;
import com.google.android.material.textfield.IconHelper;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.face.internal.zzm;
import com.squareup.cash.boost.backend.RealBoostSyncer$refresh$1;
import com.squareup.scannerview.TextSetter;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.core.exception.LocalStripeException;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.core.networking.RealAnalyticsRequestV2Storage;
import com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel;
import com.stripe.android.financialconnections.features.error.ErrorViewModel;
import com.stripe.android.financialconnections.features.exit.ExitViewModel;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupClickableText;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState$ViewEffect$OpenUrl;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$onClickableTextClick$1$WhenMappings;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState$ViewEffect$OpenUrl;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$onClickableTextClick$1$WhenMappings;
import com.stripe.android.financialconnections.features.partnerauth.SharedPartnerAuthState;
import com.stripe.android.financialconnections.features.reset.ResetViewModel;
import com.stripe.android.financialconnections.features.success.SuccessViewModel;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.Display;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.utils.UriUtils;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.paymentlauncher.InternalPaymentResult;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.withpersona.sdk2.inquiry.Inquiry;
import com.withpersona.sdk2.inquiry.InquiryActivityBroadcastManager;
import com.withpersona.sdk2.inquiry.InquiryActivityEvent;
import com.withpersona.sdk2.inquiry.OnInquiryEventListener;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import com.withpersona.sdk2.inquiry.inline_inquiry.ScreenState;
import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;
import com.withpersona.sdk2.inquiry.internal.state.WorkflowStepModel;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsArguments;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModuleKt$createCustomTabsLauncher$1;
import com.withpersona.sdk2.inquiry.launchers.ReusableActivityResultLauncher;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderContract;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderResultSender;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionsHelper;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda79;
import com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager;
import com.withpersona.sdk2.inquiry.shared.data_collection.RealDataCollector;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLoggerImpl;
import com.withpersona.sdk2.inquiry.ui.CreateReusablePersonaWorker;
import com.withpersona.sdk2.inquiry.ui.MdocHelperKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntriesList;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.serialization.json.Json;
import okio.Utf8;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class InquiryViewModel extends AndroidViewModel {
    public DaggerInquiryComponent$InquiryComponentImpl component;
    public final SharedFlowImpl controllerRequestFlow;
    public final ReusableActivityResultLauncher customTabsLauncher;
    public final RealDataCollector dataCollector;
    public final ReusableActivityResultLauncher documentSelectResultLauncher;
    public final ReusableActivityResultLauncher documentsSelectResultLauncher;
    public final SharedFlowImpl eventFlow;
    public final ReadonlyStateFlow forceFallbackModeFlow;
    public final SavedStateHandle.SavingStateLiveData inquiryId;
    public final long inquiryStartTimeMs;
    public final SavedStateHandle.SavingStateLiveData lastPage;
    public final SavedStateHandle.SavingStateLiveData lastStep;
    public final ReusableActivityResultLauncher passportNfcReaderLauncher;
    public final ReusableActivityResultLauncher pictureLaunchResultLauncher;
    public final ReusableActivityResultLauncher requestPermissionResultLauncher;
    public final ReusableActivityResultLauncher resolvableApiLauncher;
    public final SavedStateHandle savedStateHandle;
    public final StateFlowImpl screenStateFlow;
    public final SdkFilesManager sdkFilesManager;
    public final ReusableActivityResultLauncher selectFromPhotoLibraryLauncher;
    public final SavedStateHandle.SavingStateLiveData sessionToken;

    public InquiryViewModel(Application application, SavedStateHandle savedStateHandle) {
        long j;
        application.getClass();
        savedStateHandle.getClass();
        this.savedStateHandle = savedStateHandle;
        Long l = (Long) savedStateHandle.get("inquiry_start_time_ms");
        if (l != null) {
            j = l.longValue();
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            savedStateHandle.set(Long.valueOf(currentTimeMillis), "inquiry_start_time_ms");
            j = currentTimeMillis;
        }
        this.inquiryStartTimeMs = j;
        this.sdkFilesManager = new SdkFilesManager(application);
        this.forceFallbackModeFlow = savedStateHandle.getStateFlow(Boolean.FALSE, "force_fallback_mode");
        this.inquiryId = savedStateHandle.getLiveData("inquiry_id");
        this.sessionToken = savedStateHandle.getLiveData(TrackingEventsLoggerImpl.KEY_SESSION_TOKEN);
        this.lastStep = savedStateHandle.getLiveData("last_step");
        this.lastPage = savedStateHandle.getLiveData("last_page");
        this.dataCollector = new RealDataCollector(savedStateHandle);
        final int i = 0;
        final int i2 = 7;
        this.controllerRequestFlow = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
        final int i3 = 1;
        this.screenStateFlow = FlowKt.MutableStateFlow(new ScreenState(false, false, true, false));
        this.eventFlow = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
        final int i4 = 6;
        this.resolvableApiLauncher = new ReusableActivityResultLauncher(new ActivityResultContracts$StartIntentSenderForResult(), new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.DocumentLaunchersModuleKt$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i4) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        DocumentsSelectLauncherResult.flow.tryEmit(list);
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        num.getClass();
                        CustomTabsLauncherResult.flow.tryEmit(num);
                        break;
                    case 2:
                        List list2 = (List) obj;
                        list2.getClass();
                        DocumentsSelectLauncherResult.flow.tryEmit(list2);
                        break;
                    case 3:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        PictureLauncherResult.flow.tryEmit(bool);
                        break;
                    case 4:
                        DocumentSelectLauncherResult.flow.tryEmit((Uri) obj);
                        break;
                    case 5:
                        Boolean bool2 = (Boolean) obj;
                        bool2.getClass();
                        RequestPermissionResult.flow.tryEmit(bool2);
                        break;
                    case 6:
                        ActivityResult activityResult = (ActivityResult) obj;
                        activityResult.getClass();
                        ResolvableApiLauncherResult.flow.tryEmit(activityResult);
                        break;
                    default:
                        PassportNfcReaderOutput passportNfcReaderOutput = (PassportNfcReaderOutput) obj;
                        passportNfcReaderOutput.getClass();
                        PassportNfcReaderResultSender.flow.tryEmit(passportNfcReaderOutput);
                        break;
                }
            }
        });
        final int i5 = 3;
        this.pictureLaunchResultLauncher = new ReusableActivityResultLauncher(new ActivityResultContracts$TakePicture(), new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.DocumentLaunchersModuleKt$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i5) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        DocumentsSelectLauncherResult.flow.tryEmit(list);
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        num.getClass();
                        CustomTabsLauncherResult.flow.tryEmit(num);
                        break;
                    case 2:
                        List list2 = (List) obj;
                        list2.getClass();
                        DocumentsSelectLauncherResult.flow.tryEmit(list2);
                        break;
                    case 3:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        PictureLauncherResult.flow.tryEmit(bool);
                        break;
                    case 4:
                        DocumentSelectLauncherResult.flow.tryEmit((Uri) obj);
                        break;
                    case 5:
                        Boolean bool2 = (Boolean) obj;
                        bool2.getClass();
                        RequestPermissionResult.flow.tryEmit(bool2);
                        break;
                    case 6:
                        ActivityResult activityResult = (ActivityResult) obj;
                        activityResult.getClass();
                        ResolvableApiLauncherResult.flow.tryEmit(activityResult);
                        break;
                    default:
                        PassportNfcReaderOutput passportNfcReaderOutput = (PassportNfcReaderOutput) obj;
                        passportNfcReaderOutput.getClass();
                        PassportNfcReaderResultSender.flow.tryEmit(passportNfcReaderOutput);
                        break;
                }
            }
        });
        this.selectFromPhotoLibraryLauncher = new ReusableActivityResultLauncher(new ActivityResultContracts$PickMultipleVisualMedia(), new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.DocumentLaunchersModuleKt$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        DocumentsSelectLauncherResult.flow.tryEmit(list);
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        num.getClass();
                        CustomTabsLauncherResult.flow.tryEmit(num);
                        break;
                    case 2:
                        List list2 = (List) obj;
                        list2.getClass();
                        DocumentsSelectLauncherResult.flow.tryEmit(list2);
                        break;
                    case 3:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        PictureLauncherResult.flow.tryEmit(bool);
                        break;
                    case 4:
                        DocumentSelectLauncherResult.flow.tryEmit((Uri) obj);
                        break;
                    case 5:
                        Boolean bool2 = (Boolean) obj;
                        bool2.getClass();
                        RequestPermissionResult.flow.tryEmit(bool2);
                        break;
                    case 6:
                        ActivityResult activityResult = (ActivityResult) obj;
                        activityResult.getClass();
                        ResolvableApiLauncherResult.flow.tryEmit(activityResult);
                        break;
                    default:
                        PassportNfcReaderOutput passportNfcReaderOutput = (PassportNfcReaderOutput) obj;
                        passportNfcReaderOutput.getClass();
                        PassportNfcReaderResultSender.flow.tryEmit(passportNfcReaderOutput);
                        break;
                }
            }
        });
        final int i6 = 2;
        this.documentsSelectResultLauncher = new ReusableActivityResultLauncher(new ActivityResultContracts$OpenMultipleDocuments(), new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.DocumentLaunchersModuleKt$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i6) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        DocumentsSelectLauncherResult.flow.tryEmit(list);
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        num.getClass();
                        CustomTabsLauncherResult.flow.tryEmit(num);
                        break;
                    case 2:
                        List list2 = (List) obj;
                        list2.getClass();
                        DocumentsSelectLauncherResult.flow.tryEmit(list2);
                        break;
                    case 3:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        PictureLauncherResult.flow.tryEmit(bool);
                        break;
                    case 4:
                        DocumentSelectLauncherResult.flow.tryEmit((Uri) obj);
                        break;
                    case 5:
                        Boolean bool2 = (Boolean) obj;
                        bool2.getClass();
                        RequestPermissionResult.flow.tryEmit(bool2);
                        break;
                    case 6:
                        ActivityResult activityResult = (ActivityResult) obj;
                        activityResult.getClass();
                        ResolvableApiLauncherResult.flow.tryEmit(activityResult);
                        break;
                    default:
                        PassportNfcReaderOutput passportNfcReaderOutput = (PassportNfcReaderOutput) obj;
                        passportNfcReaderOutput.getClass();
                        PassportNfcReaderResultSender.flow.tryEmit(passportNfcReaderOutput);
                        break;
                }
            }
        });
        final int i7 = 5;
        this.requestPermissionResultLauncher = new ReusableActivityResultLauncher(new ActivityResultContracts$RequestPermission(), new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.DocumentLaunchersModuleKt$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i7) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        DocumentsSelectLauncherResult.flow.tryEmit(list);
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        num.getClass();
                        CustomTabsLauncherResult.flow.tryEmit(num);
                        break;
                    case 2:
                        List list2 = (List) obj;
                        list2.getClass();
                        DocumentsSelectLauncherResult.flow.tryEmit(list2);
                        break;
                    case 3:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        PictureLauncherResult.flow.tryEmit(bool);
                        break;
                    case 4:
                        DocumentSelectLauncherResult.flow.tryEmit((Uri) obj);
                        break;
                    case 5:
                        Boolean bool2 = (Boolean) obj;
                        bool2.getClass();
                        RequestPermissionResult.flow.tryEmit(bool2);
                        break;
                    case 6:
                        ActivityResult activityResult = (ActivityResult) obj;
                        activityResult.getClass();
                        ResolvableApiLauncherResult.flow.tryEmit(activityResult);
                        break;
                    default:
                        PassportNfcReaderOutput passportNfcReaderOutput = (PassportNfcReaderOutput) obj;
                        passportNfcReaderOutput.getClass();
                        PassportNfcReaderResultSender.flow.tryEmit(passportNfcReaderOutput);
                        break;
                }
            }
        });
        final int i8 = 4;
        this.documentSelectResultLauncher = new ReusableActivityResultLauncher(new ActivityResultContracts$OpenDocument(), new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.DocumentLaunchersModuleKt$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i8) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        DocumentsSelectLauncherResult.flow.tryEmit(list);
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        num.getClass();
                        CustomTabsLauncherResult.flow.tryEmit(num);
                        break;
                    case 2:
                        List list2 = (List) obj;
                        list2.getClass();
                        DocumentsSelectLauncherResult.flow.tryEmit(list2);
                        break;
                    case 3:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        PictureLauncherResult.flow.tryEmit(bool);
                        break;
                    case 4:
                        DocumentSelectLauncherResult.flow.tryEmit((Uri) obj);
                        break;
                    case 5:
                        Boolean bool2 = (Boolean) obj;
                        bool2.getClass();
                        RequestPermissionResult.flow.tryEmit(bool2);
                        break;
                    case 6:
                        ActivityResult activityResult = (ActivityResult) obj;
                        activityResult.getClass();
                        ResolvableApiLauncherResult.flow.tryEmit(activityResult);
                        break;
                    default:
                        PassportNfcReaderOutput passportNfcReaderOutput = (PassportNfcReaderOutput) obj;
                        passportNfcReaderOutput.getClass();
                        PassportNfcReaderResultSender.flow.tryEmit(passportNfcReaderOutput);
                        break;
                }
            }
        });
        this.passportNfcReaderLauncher = new ReusableActivityResultLauncher(new PassportNfcReaderContract(), new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.DocumentLaunchersModuleKt$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i2) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        DocumentsSelectLauncherResult.flow.tryEmit(list);
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        num.getClass();
                        CustomTabsLauncherResult.flow.tryEmit(num);
                        break;
                    case 2:
                        List list2 = (List) obj;
                        list2.getClass();
                        DocumentsSelectLauncherResult.flow.tryEmit(list2);
                        break;
                    case 3:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        PictureLauncherResult.flow.tryEmit(bool);
                        break;
                    case 4:
                        DocumentSelectLauncherResult.flow.tryEmit((Uri) obj);
                        break;
                    case 5:
                        Boolean bool2 = (Boolean) obj;
                        bool2.getClass();
                        RequestPermissionResult.flow.tryEmit(bool2);
                        break;
                    case 6:
                        ActivityResult activityResult = (ActivityResult) obj;
                        activityResult.getClass();
                        ResolvableApiLauncherResult.flow.tryEmit(activityResult);
                        break;
                    default:
                        PassportNfcReaderOutput passportNfcReaderOutput = (PassportNfcReaderOutput) obj;
                        passportNfcReaderOutput.getClass();
                        PassportNfcReaderResultSender.flow.tryEmit(passportNfcReaderOutput);
                        break;
                }
            }
        });
        this.customTabsLauncher = new ReusableActivityResultLauncher(new CustomTabsLauncherModuleKt$createCustomTabsLauncher$1(), new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.DocumentLaunchersModuleKt$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        DocumentsSelectLauncherResult.flow.tryEmit(list);
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        num.getClass();
                        CustomTabsLauncherResult.flow.tryEmit(num);
                        break;
                    case 2:
                        List list2 = (List) obj;
                        list2.getClass();
                        DocumentsSelectLauncherResult.flow.tryEmit(list2);
                        break;
                    case 3:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        PictureLauncherResult.flow.tryEmit(bool);
                        break;
                    case 4:
                        DocumentSelectLauncherResult.flow.tryEmit((Uri) obj);
                        break;
                    case 5:
                        Boolean bool2 = (Boolean) obj;
                        bool2.getClass();
                        RequestPermissionResult.flow.tryEmit(bool2);
                        break;
                    case 6:
                        ActivityResult activityResult = (ActivityResult) obj;
                        activityResult.getClass();
                        ResolvableApiLauncherResult.flow.tryEmit(activityResult);
                        break;
                    default:
                        PassportNfcReaderOutput passportNfcReaderOutput = (PassportNfcReaderOutput) obj;
                        passportNfcReaderOutput.getClass();
                        PassportNfcReaderResultSender.flow.tryEmit(passportNfcReaderOutput);
                        break;
                }
            }
        });
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.Default, null, new AnonymousClass1(this, null, i), 2);
    }

    public final void init$inquiry_internal_release(InquiryFragment inquiryFragment) {
        this.resolvableApiLauncher.register(inquiryFragment);
        this.pictureLaunchResultLauncher.register(inquiryFragment);
        this.selectFromPhotoLibraryLauncher.register(inquiryFragment);
        this.documentsSelectResultLauncher.register(inquiryFragment);
        this.requestPermissionResultLauncher.register(inquiryFragment);
        this.documentSelectResultLauncher.register(inquiryFragment);
        this.passportNfcReaderLauncher.register(inquiryFragment);
        this.customTabsLauncher.register(inquiryFragment);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        RealImageLoader realImageLoader;
        DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = this.component;
        if (daggerInquiryComponent$InquiryComponentImpl != null && (realImageLoader = (RealImageLoader) daggerInquiryComponent$InquiryComponentImpl.imageLoaderProvider.get()) != null) {
            realImageLoader.shutdown();
        }
        super.onCleared();
    }

    /* renamed from: com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1, reason: invalid class name */
    /* loaded from: classes8.dex */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public /* synthetic */ Object L$0;
        public final /* synthetic */ Object this$0;

        /* renamed from: com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes9.dex */
        public final class C00751 extends SuspendLambda implements Function2 {
            public final /* synthetic */ int $r8$classId;
            public int label;
            public final /* synthetic */ InquiryViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C00751(InquiryViewModel inquiryViewModel, Continuation continuation, int i) {
                super(2, continuation);
                this.$r8$classId = i;
                this.this$0 = inquiryViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                int i = this.$r8$classId;
                InquiryViewModel inquiryViewModel = this.this$0;
                switch (i) {
                    case 0:
                        return new C00751(inquiryViewModel, continuation, 0);
                    default:
                        return new C00751(inquiryViewModel, continuation, 1);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CoroutineScope coroutineScope = (CoroutineScope) obj;
                Continuation continuation = (Continuation) obj2;
                switch (this.$r8$classId) {
                    case 0:
                        ((C00751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        break;
                    default:
                        ((C00751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        break;
                }
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.$r8$classId;
                final InquiryViewModel inquiryViewModel = this.this$0;
                switch (i) {
                    case 0:
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        if (i2 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            SharedFlow eventFlow = InquiryActivityBroadcastManager.INSTANCE.getEventFlow();
                            FlowCollector flowCollector = new FlowCollector() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryViewModel.1.1.1
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                public final Object emit(Object obj2, Continuation continuation) {
                                    InquiryActivityEvent inquiryActivityEvent = (InquiryActivityEvent) obj2;
                                    if (inquiryActivityEvent instanceof InquiryActivityEvent.CancelInquiry) {
                                        boolean skipBackendCall = ((InquiryActivityEvent.CancelInquiry) inquiryActivityEvent).getSkipBackendCall();
                                        InquiryViewModel inquiryViewModel2 = InquiryViewModel.this;
                                        JobKt.launch$default(ViewModelKt.getViewModelScope(inquiryViewModel2), Dispatchers.Default, null, new RealBoostSyncer$refresh$1(inquiryViewModel2, skipBackendCall, (Continuation) null, 9), 2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            this.label = 1;
                            if (eventFlow.collect(flowCollector, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        OptionalProvider$$ExternalSyntheticLambda0.m$1();
                        return null;
                    default:
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i3 = this.label;
                        if (i3 != 0) {
                            if (i3 == 1) {
                                throw Recorder$$ExternalSyntheticOutline2.m(obj);
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        SharedFlowImpl sharedFlowImpl = inquiryViewModel.eventFlow;
                        FlowCollector flowCollector2 = new FlowCollector() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1$2$1
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public final Object emit(Object obj2, Continuation continuation) {
                                InquiryEvent inquiryEvent = (InquiryEvent) obj2;
                                OnInquiryEventListener onEventListener = Inquiry.INSTANCE.getOnEventListener();
                                if (onEventListener != null) {
                                    onEventListener.onEvent(inquiryEvent);
                                }
                                if (inquiryEvent instanceof InquiryEvent.PageChange) {
                                    InquiryViewModel inquiryViewModel2 = InquiryViewModel.this;
                                    InquiryEvent.PageChange pageChange = (InquiryEvent.PageChange) inquiryEvent;
                                    inquiryViewModel2.lastStep.setValue(pageChange.name);
                                    inquiryViewModel2.lastPage.setValue(pageChange.path);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        this.label = 1;
                        sharedFlowImpl.collect(flowCollector2, this);
                        return coroutineSingletons2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Object obj2, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.L$0 = obj;
            this.this$0 = obj2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1((InquiryViewModel) obj2, continuation, 0);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                case 1:
                    return new AnonymousClass1((AnalyticsRequestV2) this.L$0, (RealAnalyticsRequestV2Storage) obj2, continuation, 1);
                case 2:
                    return new AnonymousClass1((DefaultFinancialConnectionsEventReporter) this.L$0, (DefaultFinancialConnectionsEventReporter.Event) obj2, continuation, 2);
                case 3:
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1((AttachPaymentViewModel) obj2, continuation, 3);
                    anonymousClass12.L$0 = obj;
                    return anonymousClass12;
                case 4:
                    return new AnonymousClass1((Throwable) this.L$0, (View) obj2, continuation, 4);
                case 5:
                    AnonymousClass1 anonymousClass13 = new AnonymousClass1((ErrorViewModel) obj2, continuation, 5);
                    anonymousClass13.L$0 = obj;
                    return anonymousClass13;
                case 6:
                    AnonymousClass1 anonymousClass14 = new AnonymousClass1((ExitViewModel) obj2, continuation, 6);
                    anonymousClass14.L$0 = obj;
                    return anonymousClass14;
                case 7:
                    AnonymousClass1 anonymousClass15 = new AnonymousClass1((ManualEntryViewModel) obj2, continuation, 7);
                    anonymousClass15.L$0 = obj;
                    return anonymousClass15;
                case 8:
                    return new AnonymousClass1((NetworkingLinkSignupViewModel) this.L$0, (String) obj2, continuation, 8);
                case 9:
                    return new AnonymousClass1((NoticeSheetState$ViewEffect$OpenUrl) this.L$0, (UriHandler) obj2, continuation, 9);
                case 10:
                    return new AnonymousClass1((PartnerAuthViewModel) this.L$0, (String) obj2, continuation, 10);
                case 11:
                    AnonymousClass1 anonymousClass16 = new AnonymousClass1((ResetViewModel) obj2, continuation, 11);
                    anonymousClass16.L$0 = obj;
                    return anonymousClass16;
                case 12:
                    return new AnonymousClass1((PlatformHapticFeedback) this.L$0, (Ref$BooleanRef) obj2, continuation, 12);
                case 13:
                    AnonymousClass1 anonymousClass17 = new AnonymousClass1((SuccessViewModel) obj2, continuation, 13);
                    anonymousClass17.L$0 = obj;
                    return anonymousClass17;
                case 14:
                    return new AnonymousClass1((PaymentLauncherViewModel) this.L$0, (StripeIntent) obj2, continuation, 14);
                case 15:
                    return new AnonymousClass1((PaymentLauncherViewModel) this.L$0, (StripeIntentResult) obj2, continuation, 15);
                case 16:
                    return new AnonymousClass1((PaymentLauncherViewModel) this.L$0, (Throwable) obj2, continuation, 16);
                case 17:
                    AnonymousClass1 anonymousClass18 = new AnonymousClass1((TextSetter) obj2, continuation, 17);
                    anonymousClass18.L$0 = obj;
                    return anonymousClass18;
                case 18:
                    return new AnonymousClass1((DocumentStepStateManager) this.L$0, (DocumentWorkflow.State) obj2, continuation, 18);
                case 19:
                    return new AnonymousClass1((StatefulWorkflow.RenderContext) this.L$0, (GovernmentIdWorkflow) obj2, continuation, 19);
                case 20:
                    return new AnonymousClass1((UiStepSavedStateHelper) this.L$0, (UiStepSavedStateHelper.UiStepUiComponentConfig) obj2, continuation, 20);
                case 21:
                    return new AnonymousClass1((UiStepSavedStateHelper) this.L$0, (Parcel) obj2, continuation, 21);
                case 22:
                    return new AnonymousClass1((UiStepSavedStateHelper) this.L$0, (Bundle) obj2, continuation, 22);
                case 23:
                    AnonymousClass1 anonymousClass19 = new AnonymousClass1((WorkflowStepModel) obj2, continuation, 23);
                    anonymousClass19.L$0 = obj;
                    return anonymousClass19;
                case 24:
                    return new AnonymousClass1((PermissionRequestWorker) this.L$0, (String) obj2, continuation, 24);
                case 25:
                    return new AnonymousClass1((PermissionRequestStateManager) this.L$0, (PermissionRequestStateManager.PermissionRequestState) obj2, continuation, 25);
                case 26:
                    return new AnonymousClass1((StatefulWorkflow.RenderContext) this.L$0, (SelfieWorkflow) obj2, continuation, 26);
                case 27:
                    return new AnonymousClass1((SelfieStepStateManager) this.L$0, (SelfieState) obj2, continuation, 27);
                case 28:
                    return new AnonymousClass1((ThemeableLottieAnimationView) this.L$0, (String) obj2, continuation, 28);
                default:
                    return new AnonymousClass1((CreateReusablePersonaWorker) this.L$0, (String) obj2, continuation, 29);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:100:0x0243, code lost:
        
            if (r12.hasDelayedSettlement == true) goto L94;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0268  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x026a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            LegalDetailsNotice legalDetailsNotice;
            Object value;
            Object obj3;
            Display display;
            TextUpdate textUpdate;
            ConsentPane consentPane;
            DataAccessNotice dataAccessNotice;
            Object value2;
            Object failure;
            Integer num;
            int i = this.$r8$classId;
            int i2 = 0;
            int i3 = 1;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object obj4 = this.this$0;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    InquiryViewModel inquiryViewModel = (InquiryViewModel) obj4;
                    JobKt.launch$default(coroutineScope, null, null, new C00751(inquiryViewModel, objArr2 == true ? 1 : 0, i2), 3);
                    JobKt.launch$default(coroutineScope, MainDispatcherLoader.dispatcher, null, new C00751(inquiryViewModel, objArr == true ? 1 : 0, i3), 2);
                    return Unit.INSTANCE;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    String uuid = UUID.randomUUID().toString();
                    uuid.getClass();
                    Json.Default r0 = Json.Default;
                    AnalyticsRequestV2 analyticsRequestV2 = (AnalyticsRequestV2) this.L$0;
                    r0.getClass();
                    ((SharedPreferences) ((RealAnalyticsRequestV2Storage) obj4).sharedPrefs$delegate.getValue()).edit().putString(uuid, r0.encodeToString(AnalyticsRequestV2.Companion.serializer(), analyticsRequestV2)).apply();
                    return uuid;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    DefaultFinancialConnectionsEventReporter defaultFinancialConnectionsEventReporter = (DefaultFinancialConnectionsEventReporter) this.L$0;
                    DefaultFinancialConnectionsEventReporter.Event event = (DefaultFinancialConnectionsEventReporter.Event) obj4;
                    defaultFinancialConnectionsEventReporter.analyticsRequestExecutor.executeAsync(defaultFinancialConnectionsEventReporter.analyticsRequestFactory.createRequest(event, event.additionalParams));
                    return Unit.INSTANCE;
                case 3:
                    Throwable th = (Throwable) this.L$0;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    AttachPaymentViewModel attachPaymentViewModel = (AttachPaymentViewModel) obj4;
                    Matchers.logError(attachPaymentViewModel.eventTracker, "Error Attaching payment account", th, attachPaymentViewModel.logger, AttachPaymentViewModel.PANE);
                    return Unit.INSTANCE;
                case 4:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    if ((((Throwable) this.L$0) instanceof ConfirmVerification.OTPError) && Build.VERSION.SDK_INT >= 30) {
                        ((View) obj4).performHapticFeedback(17);
                    }
                    return Unit.INSTANCE;
                case 5:
                    Throwable th2 = (Throwable) this.L$0;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ErrorViewModel errorViewModel = (ErrorViewModel) obj4;
                    Matchers.logError(errorViewModel.eventTracker, "Error loading the error screen payload", th2, errorViewModel.logger, ErrorViewModel.PANE);
                    return Unit.INSTANCE;
                case 6:
                    Throwable th3 = (Throwable) this.L$0;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ExitViewModel exitViewModel = (ExitViewModel) obj4;
                    Matchers.logError(exitViewModel.eventTracker, "Error loading payload", th3, exitViewModel.logger, ExitViewModel.PANE);
                    return Unit.INSTANCE;
                case 7:
                    Throwable th4 = (Throwable) this.L$0;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ManualEntryViewModel manualEntryViewModel = (ManualEntryViewModel) obj4;
                    Matchers.logError(manualEntryViewModel.eventTracker, "Error linking payment account", th4, manualEntryViewModel.logger, ManualEntryViewModel.PANE);
                    return Unit.INSTANCE;
                case 8:
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    NetworkingLinkSignupViewModel networkingLinkSignupViewModel = (NetworkingLinkSignupViewModel) this.L$0;
                    String str = (String) obj4;
                    String queryParameter = networkingLinkSignupViewModel.uriUtils.getQueryParameter(str, "eventName");
                    if (queryParameter != null) {
                        networkingLinkSignupViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(queryParameter, networkingLinkSignupViewModel.getPane()));
                    }
                    Date date = new Date();
                    if (URLUtil.isNetworkUrl(str)) {
                        StateFlowImpl stateFlowImpl = networkingLinkSignupViewModel._stateFlow;
                        do {
                            value = stateFlowImpl.getValue();
                        } while (!stateFlowImpl.compareAndSet(value, NetworkingLinkSignupState.copy$default((NetworkingLinkSignupState) value, null, null, null, null, null, new NetworkingLinkSignupState$ViewEffect$OpenUrl(str, date.getTime()), 95)));
                    } else {
                        EnumEntriesList enumEntriesList = NetworkingLinkSignupClickableText.$ENTRIES;
                        ArrayIterator m = CameraState$Type$EnumUnboxingLocalUtility.m(enumEntriesList, enumEntriesList);
                        while (true) {
                            if (m.hasNext()) {
                                obj2 = m.next();
                                UriUtils uriUtils = networkingLinkSignupViewModel.uriUtils;
                                ((NetworkingLinkSignupClickableText) obj2).getClass();
                                if (uriUtils.compareSchemeAuthorityAndPath("stripe://legal-details-notice", str)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        NetworkingLinkSignupClickableText networkingLinkSignupClickableText = (NetworkingLinkSignupClickableText) obj2;
                        int i4 = networkingLinkSignupClickableText == null ? -1 : NetworkingLinkSignupViewModel$onClickableTextClick$1$WhenMappings.$EnumSwitchMapping$0[networkingLinkSignupClickableText.ordinal()];
                        if (i4 == -1) {
                            networkingLinkSignupViewModel.logger.error("Unrecognized clickable text: ".concat(str), null);
                        } else {
                            if (i4 != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            NetworkingLinkSignupState.Payload payload = (NetworkingLinkSignupState.Payload) ((NetworkingLinkSignupState) networkingLinkSignupViewModel.stateFlow.$$delegate_0.getValue()).payload.invoke();
                            if (payload != null && (legalDetailsNotice = payload.content.legalDetailsNotice) != null) {
                                networkingLinkSignupViewModel.presentSheet.invoke(new NoticeSheetState.NoticeSheetContent.Legal(legalDetailsNotice), networkingLinkSignupViewModel.getPane());
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 9:
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    NoticeSheetState$ViewEffect$OpenUrl noticeSheetState$ViewEffect$OpenUrl = (NoticeSheetState$ViewEffect$OpenUrl) this.L$0;
                    if (noticeSheetState$ViewEffect$OpenUrl != null) {
                        ((UriHandler) obj4).openUri(noticeSheetState$ViewEffect$OpenUrl.url);
                        return Unit.INSTANCE;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                case 10:
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    PartnerAuthViewModel partnerAuthViewModel = (PartnerAuthViewModel) this.L$0;
                    UriUtils uriUtils2 = partnerAuthViewModel.uriUtils;
                    SharedPartnerAuthState sharedPartnerAuthState = partnerAuthViewModel.initialState;
                    String str2 = (String) obj4;
                    String queryParameter2 = uriUtils2.getQueryParameter(str2, "eventName");
                    if (queryParameter2 != null) {
                        partnerAuthViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(queryParameter2, sharedPartnerAuthState.pane));
                    }
                    if (URLUtil.isNetworkUrl(str2)) {
                        StateFlowImpl stateFlowImpl2 = partnerAuthViewModel._stateFlow;
                        do {
                            value2 = stateFlowImpl2.getValue();
                        } while (!stateFlowImpl2.compareAndSet(value2, SharedPartnerAuthState.copy$default((SharedPartnerAuthState) value2, null, new SharedPartnerAuthState.ViewEffect.OpenUrl(str2, new Date().getTime()), null, 27)));
                    } else {
                        EnumEntriesList enumEntriesList2 = SharedPartnerAuthState.ClickableText.$ENTRIES;
                        ArrayIterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(enumEntriesList2, enumEntriesList2);
                        while (true) {
                            if (m2.hasNext()) {
                                obj3 = m2.next();
                                UriUtils uriUtils3 = partnerAuthViewModel.uriUtils;
                                ((SharedPartnerAuthState.ClickableText) obj3).getClass();
                                if (uriUtils3.compareSchemeAuthorityAndPath("stripe://data-access-notice", str2)) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        SharedPartnerAuthState.ClickableText clickableText = (SharedPartnerAuthState.ClickableText) obj3;
                        int i5 = clickableText == null ? -1 : PartnerAuthViewModel$onClickableTextClick$1$WhenMappings.$EnumSwitchMapping$0[clickableText.ordinal()];
                        if (i5 == -1) {
                            partnerAuthViewModel.logger.error("Unrecognized clickable text: ".concat(str2), null);
                        } else {
                            if (i5 != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            SharedPartnerAuthState.Payload payload2 = (SharedPartnerAuthState.Payload) ((SharedPartnerAuthState) partnerAuthViewModel.stateFlow.$$delegate_0.getValue()).payload.invoke();
                            FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = payload2 != null ? payload2.authSession : null;
                            if (financialConnectionsAuthorizationSession != null && (display = financialConnectionsAuthorizationSession.display) != null && (textUpdate = display.text) != null && (consentPane = textUpdate.consent) != null && (dataAccessNotice = consentPane.dataAccessNotice) != null) {
                                partnerAuthViewModel.presentSheet.invoke(new NoticeSheetState.NoticeSheetContent.DataAccess(dataAccessNotice), sharedPartnerAuthState.pane);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 11:
                    Throwable th5 = (Throwable) this.L$0;
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ResetViewModel resetViewModel = (ResetViewModel) obj4;
                    Matchers.logError(resetViewModel.eventTracker, "Error linking more accounts", th5, resetViewModel.logger, ResetViewModel.PANE);
                    return Unit.INSTANCE;
                case 12:
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ((PlatformHapticFeedback) this.L$0).m769performHapticFeedbackCdsT49E(0);
                    ((Ref$BooleanRef) obj4).element = true;
                    return Unit.INSTANCE;
                case 13:
                    Throwable th6 = (Throwable) this.L$0;
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ((SuccessViewModel) obj4).logger.error("Error retrieving payload", th6);
                    return Unit.INSTANCE;
                case 14:
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    StripeIntent stripeIntent = (StripeIntent) obj4;
                    PaymentLauncherViewModel.postInternalResult$default((PaymentLauncherViewModel) this.L$0, new InternalPaymentResult.Completed(stripeIntent), stripeIntent, null, 4);
                    return Unit.INSTANCE;
                case 15:
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    PaymentLauncherViewModel paymentLauncherViewModel = (PaymentLauncherViewModel) this.L$0;
                    StripeIntentResult stripeIntentResult = (StripeIntentResult) obj4;
                    List list = PaymentLauncherViewModel.EXPAND_PAYMENT_METHOD;
                    StripeIntent intent = stripeIntentResult.getIntent();
                    int i6 = stripeIntentResult.outcomeFromFlow;
                    if (i6 == 0) {
                        StripeIntent.Status status = intent.getStatus();
                        switch (status == null ? -1 : StripeIntentResult.WhenMappings.$EnumSwitchMapping$0[status.ordinal()]) {
                            case 1:
                                if (intent.getNextActionData() != null) {
                                    StripeIntent.NextActionType nextActionType = stripeIntentResult.getIntent().getNextActionType();
                                    switch (nextActionType != null ? StripeIntentResult.WhenMappings.$EnumSwitchMapping$1[nextActionType.ordinal()] : -1) {
                                        case -1:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            i2 = 3;
                                            break;
                                        case 0:
                                        default:
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                            i2 = 1;
                                            break;
                                    }
                                }
                                i2 = 2;
                                break;
                            case 3:
                                i2 = 2;
                                break;
                            case 7:
                                PaymentMethod paymentMethod = stripeIntentResult.getIntent().getPaymentMethod();
                                if (paymentMethod != null) {
                                    PaymentMethod.Type type2 = paymentMethod.f1440type;
                                    if (type2 != null) {
                                        break;
                                    }
                                }
                                break;
                        }
                    } else {
                        i2 = i6;
                    }
                    PaymentLauncherViewModel.postInternalResult$default(paymentLauncherViewModel, i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? new InternalPaymentResult.Failed(new LocalStripeException(Recorder$$ExternalSyntheticOutline2.m("Payment fails due to unknown error. \n", stripeIntentResult.getFailureMessage()), "unknownIntentOutcomeError")) : new InternalPaymentResult.Failed(new LocalStripeException(Recorder$$ExternalSyntheticOutline2.m("Payment fails due to time out. \n", stripeIntentResult.getFailureMessage()), "timedOutIntentOutcomeError")) : InternalPaymentResult.Canceled.INSTANCE : new InternalPaymentResult.Failed(new LocalStripeException(stripeIntentResult.getFailureMessage(), "failedIntentOutcomeError")) : new InternalPaymentResult.Completed(stripeIntentResult.getIntent()), stripeIntentResult.getIntent(), null, 4);
                    return Unit.INSTANCE;
                case 16:
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    PaymentLauncherViewModel.postInternalResult$default((PaymentLauncherViewModel) this.L$0, new InternalPaymentResult.Failed((Throwable) obj4), null, null, 6);
                    return Unit.INSTANCE;
                case 17:
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    TextSetter textSetter = (TextSetter) obj4;
                    try {
                        Result.Companion companion = Result.Companion;
                        String str3 = (String) textSetter.textView;
                        str3.getClass();
                        URLConnection openConnection = new URL(str3).openConnection();
                        openConnection.getClass();
                        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.connect();
                        failure = httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : null;
                    } catch (Throwable th7) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th7);
                    }
                    Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                    if (m4120exceptionOrNullimpl != null) {
                        ((DefaultErrorReporter) textSetter.textSwitcher).reportError(m4120exceptionOrNullimpl);
                    }
                    if (failure instanceof Result.Failure) {
                        return null;
                    }
                    return failure;
                case 18:
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    DocumentStepStateManager documentStepStateManager = (DocumentStepStateManager) this.L$0;
                    DocumentStepStateManager.access$handleState(documentStepStateManager, (DocumentWorkflow.Input) ((StateFlowImpl) documentStepStateManager.firstChild).getValue(), (DocumentWorkflow.State) obj4);
                    return Unit.INSTANCE;
                case 19:
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    GovernmentIdWorkflow governmentIdWorkflow = (GovernmentIdWorkflow) obj4;
                    ((StatefulWorkflow.RenderContext) this.L$0).$$delegate_0.getActionSink().send(Workflows.action$default(governmentIdWorkflow, new DocumentWorkflow$$ExternalSyntheticLambda7(governmentIdWorkflow)));
                    return Unit.INSTANCE;
                case 20:
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ((UiStepSavedStateHelper) this.L$0).savedData = (UiStepSavedStateHelper.UiStepUiComponentConfig) obj4;
                    return Unit.INSTANCE;
                case 21:
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    FileInputStream fileInputStream = new FileInputStream(((UiStepSavedStateHelper) this.L$0).configFile);
                    Parcel parcel = (Parcel) obj4;
                    try {
                        byte[] readBytes = ByteStreamsKt.readBytes(fileInputStream);
                        parcel.unmarshall(readBytes, 0, readBytes.length);
                        fileInputStream.close();
                        return Unit.INSTANCE;
                    } catch (Throwable th8) {
                        try {
                            throw th8;
                        } catch (Throwable th9) {
                            Utf8.closeFinally(fileInputStream, th8);
                            throw th9;
                        }
                    }
                case 22:
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    FileOutputStream fileOutputStream = new FileOutputStream(((UiStepSavedStateHelper) this.L$0).configFile);
                    Bundle bundle = (Bundle) obj4;
                    try {
                        Parcel obtain = Parcel.obtain();
                        obtain.getClass();
                        obtain.writeBundle(bundle);
                        fileOutputStream.write(obtain.marshall());
                        obtain.recycle();
                        fileOutputStream.close();
                        return Unit.INSTANCE;
                    } catch (Throwable th10) {
                        try {
                            throw th10;
                        } catch (Throwable th11) {
                            Utf8.closeFinally(fileOutputStream, th10);
                            throw th11;
                        }
                    }
                case 23:
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ((WorkflowStepModel) obj4).getHandler().invoke(this.L$0);
                    return Unit.INSTANCE;
                case 24:
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    PermissionRequestWorker permissionRequestWorker = (PermissionRequestWorker) this.L$0;
                    PermissionsHelper permissionsHelper = permissionRequestWorker.permissionsHelper;
                    String str4 = (String) obj4;
                    PermissionRequestWorkflow.Props props = permissionRequestWorker.props;
                    permissionsHelper.getClass();
                    str4.getClass();
                    FragmentManager fragmentManager = permissionsHelper.fragmentManager;
                    if (fragmentManager != null && (num = permissionsHelper.viewId) != null) {
                        int intValue = num.intValue();
                        BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
                        PermissionRequestFragment permissionRequestFragment = new PermissionRequestFragment();
                        IconHelper.withArgs(permissionRequestFragment, new PermissionRequestFragment.PermissionRequestFragmentArgs(str4, props));
                        backStackRecord.doAddOp(intValue, permissionRequestFragment, "Pi2PermissionRequestFragment", 1);
                        backStackRecord.commitNow();
                    }
                    return Unit.INSTANCE;
                case 25:
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    PermissionRequestStateManager permissionRequestStateManager = (PermissionRequestStateManager) this.L$0;
                    PermissionRequestStateManager.access$handleState(permissionRequestStateManager, (PermissionRequestWorkflow.Props) ((StateFlowImpl) permissionRequestStateManager.firstChild).getValue(), (PermissionRequestStateManager.PermissionRequestState) obj4);
                    return Unit.INSTANCE;
                case 26:
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    SelfieWorkflow selfieWorkflow = (SelfieWorkflow) obj4;
                    ((StatefulWorkflow.RenderContext) this.L$0).$$delegate_0.getActionSink().send(Workflows.action$default(selfieWorkflow, new SelfieWorkflow$$ExternalSyntheticLambda79(selfieWorkflow)));
                    return Unit.INSTANCE;
                case 27:
                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    SelfieStepStateManager selfieStepStateManager = (SelfieStepStateManager) this.L$0;
                    selfieStepStateManager.handleState((SelfieWorkflow.Input) ((StateFlowImpl) selfieStepStateManager.firstChild).getValue(), (SelfieState) obj4);
                    return Unit.INSTANCE;
                case 28:
                    CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ((ThemeableLottieAnimationView) this.L$0).setAnimationFromJson((String) obj4, null);
                    return Unit.INSTANCE;
                default:
                    CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    CreateReusablePersonaWorker createReusablePersonaWorker = (CreateReusablePersonaWorker) this.L$0;
                    createReusablePersonaWorker.customTabsLauncher.launch(new CustomTabsArguments(new zzm().build(), MdocHelperKt.createReusablePersonaUrl(createReusablePersonaWorker.url, (String) obj4, createReusablePersonaWorker.componentName)));
                    return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = obj;
        }
    }
}
