package com.withpersona.sdk2.inquiry.ui.state;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.play.core.splitcompat.zzd;
import com.squareup.cash.R;
import com.squareup.cash.work.session.SquareAccountStore$userFlow$$inlined$map$1;
import com.squareup.util.android.ViewGroups$$ExternalSyntheticLambda0;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.featureflag.TipsFeatureFlag;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import com.withpersona.sdk2.inquiry.nfc.NfcDataGroupType;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcStrings;
import com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker;
import com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.permissions.Permission;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionResult;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage$CreateReusablePersona;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage$ScanNfc;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage$Ui;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage$VerifyReusablePersona;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.HelpBottomSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import com.withpersona.sdk2.inquiry.ui.ComponentWorkHelperKt;
import com.withpersona.sdk2.inquiry.ui.CreateReusablePersonaWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda29;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda14;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda9;
import com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker_Factory_Impl;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.chrisbanes.haze.BlurEffectKt$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.time.InstantKt$$ExternalSyntheticLambda0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.Unconfined;
import kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.rx3.RxConvertKt$asFlow$1;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.commonmark.node.Node;
import papa.Choreographers$$ExternalSyntheticLambda1;
import papa.SafeTrace;
import radiography.internal.ComposeLayoutInfoKt$$ExternalSyntheticLambda6;

/* loaded from: classes9.dex */
public final class UiStepStateManager extends Node {
    public final Context applicationContext;
    public final UiStepComponentWorkHelper componentWorkHelper;
    public final CreateReusablePersonaWorker_Factory_Impl createReusablePersonaWorkerFactory;
    public final ExternalEventLogger externalEventLogger;
    public final FeatureFlagManager featureFlagManager;
    public final NavigationStateManager navigationStateManager;
    public final ScanNfcWorker.Factory nfcScanWorkerFactory;
    public final PermissionRequestWorker_Factory_Impl permissionRequestWorkerFactory;
    public final TrackingEventsLogger trackingEventsLogger;
    public final VerifyReusablePersonaWorker_Factory_Impl verifyReusablePersonaWorkerFactory;

    /* renamed from: com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ UiStepStateManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(UiStepStateManager uiStepStateManager, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = uiStepStateManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            UiStepStateManager uiStepStateManager = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass2(uiStepStateManager, continuation, 0);
                default:
                    return new AnonymousClass2(uiStepStateManager, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
                case 0:
                    ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    return CoroutineSingletons.COROUTINE_SUSPENDED;
                default:
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            final UiStepStateManager uiStepStateManager = this.this$0;
            final int i2 = 1;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 != 0) {
                        if (i3 == 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(obj);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    StateFlowImpl stateFlowImpl = (StateFlowImpl) uiStepStateManager.firstChild;
                    final int i4 = 0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager.2.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            zzd inquiryPage$ScanNfc;
                            int i5 = i4;
                            UiStepStateManager uiStepStateManager2 = uiStepStateManager;
                            switch (i5) {
                                case 0:
                                    UiWorkflow.Input input = (UiWorkflow.Input) obj2;
                                    UiState uiState = (UiState) ((SubtreeManager) uiStepStateManager2.lastChild).getState();
                                    if (uiState == null || (r2 = UiStepStateManager.access$handleState(uiStepStateManager2, input, uiState, continuation)) != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                                default:
                                    UiState uiState2 = (UiState) ((SubtreeManager) uiStepStateManager2.lastChild).getState();
                                    if (uiState2 != null) {
                                        UiWorkflow.Input input2 = (UiWorkflow.Input) ((StateFlowImpl) uiStepStateManager2.firstChild).getValue();
                                        if (uiState2 instanceof UiState.Displaying) {
                                            UiState.Displaying displaying = (UiState.Displaying) uiState2;
                                            UiState.PendingAction pendingAction = displaying.pendingAction;
                                            if (pendingAction == null) {
                                                inquiryPage$ScanNfc = displaying.nfcScan != null ? new InquiryPage$ScanNfc(input2.stepName) : new InquiryPage$Ui(input2.stepName);
                                            } else if (pendingAction instanceof UiState.PendingAction.CreateReusablePersona) {
                                                inquiryPage$ScanNfc = new InquiryPage$CreateReusablePersona(input2.stepName);
                                            } else if (pendingAction instanceof UiState.PendingAction.VerifyReusablePersona) {
                                                inquiryPage$ScanNfc = new InquiryPage$VerifyReusablePersona(input2.stepName);
                                            } else {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                            }
                                            uiStepStateManager2.externalEventLogger.logPageChange(inquiryPage$ScanNfc);
                                            uiStepStateManager2.trackingEventsLogger.logInquiryPageViewEvent(inquiryPage$ScanNfc.getStepName(), inquiryPage$ScanNfc.toString(), false);
                                            break;
                                        } else {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                        }
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    stateFlowImpl.collect(flowCollector, this);
                    return coroutineSingletons;
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new SquareAccountStore$userFlow$$inlined$map$1((StateFlowImpl) uiStepStateManager.firstChild, 21));
                        FlowCollector flowCollector2 = new FlowCollector() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager.2.1
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public final Object emit(Object obj2, Continuation continuation) {
                                zzd inquiryPage$ScanNfc;
                                int i52 = i2;
                                UiStepStateManager uiStepStateManager2 = uiStepStateManager;
                                switch (i52) {
                                    case 0:
                                        UiWorkflow.Input input = (UiWorkflow.Input) obj2;
                                        UiState uiState = (UiState) ((SubtreeManager) uiStepStateManager2.lastChild).getState();
                                        if (uiState == null || (r2 = UiStepStateManager.access$handleState(uiStepStateManager2, input, uiState, continuation)) != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            break;
                                        }
                                        break;
                                    default:
                                        UiState uiState2 = (UiState) ((SubtreeManager) uiStepStateManager2.lastChild).getState();
                                        if (uiState2 != null) {
                                            UiWorkflow.Input input2 = (UiWorkflow.Input) ((StateFlowImpl) uiStepStateManager2.firstChild).getValue();
                                            if (uiState2 instanceof UiState.Displaying) {
                                                UiState.Displaying displaying = (UiState.Displaying) uiState2;
                                                UiState.PendingAction pendingAction = displaying.pendingAction;
                                                if (pendingAction == null) {
                                                    inquiryPage$ScanNfc = displaying.nfcScan != null ? new InquiryPage$ScanNfc(input2.stepName) : new InquiryPage$Ui(input2.stepName);
                                                } else if (pendingAction instanceof UiState.PendingAction.CreateReusablePersona) {
                                                    inquiryPage$ScanNfc = new InquiryPage$CreateReusablePersona(input2.stepName);
                                                } else if (pendingAction instanceof UiState.PendingAction.VerifyReusablePersona) {
                                                    inquiryPage$ScanNfc = new InquiryPage$VerifyReusablePersona(input2.stepName);
                                                } else {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                }
                                                uiStepStateManager2.externalEventLogger.logPageChange(inquiryPage$ScanNfc);
                                                uiStepStateManager2.trackingEventsLogger.logInquiryPageViewEvent(inquiryPage$ScanNfc.getStepName(), inquiryPage$ScanNfc.toString(), false);
                                                break;
                                            } else {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                            }
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        this.label = 1;
                        if (distinctUntilChanged.collect(flowCollector2, this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PermissionResult.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PermissionResult permissionResult = PermissionResult.PermissionGranted;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PermissionResult permissionResult2 = PermissionResult.PermissionGranted;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[GovernmentIdNfcScan.DataGroupTypes.values().length];
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg1.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg2.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg14.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Sod.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiStepStateManager(UiWorkflow.Input input, SavedStateHandle savedStateHandle, Context context, ScanNfcWorker.Factory factory, CreateReusablePersonaWorker_Factory_Impl createReusablePersonaWorker_Factory_Impl, VerifyReusablePersonaWorker_Factory_Impl verifyReusablePersonaWorker_Factory_Impl, NavigationStateManager navigationStateManager, UiStepComponentWorkHelper uiStepComponentWorkHelper, ExternalEventLogger externalEventLogger, FeatureFlagManager featureFlagManager, TrackingEventsLogger trackingEventsLogger, PermissionRequestWorker_Factory_Impl permissionRequestWorker_Factory_Impl) {
        super(input, savedStateHandle);
        input.getClass();
        savedStateHandle.getClass();
        context.getClass();
        factory.getClass();
        createReusablePersonaWorker_Factory_Impl.getClass();
        verifyReusablePersonaWorker_Factory_Impl.getClass();
        navigationStateManager.getClass();
        uiStepComponentWorkHelper.getClass();
        externalEventLogger.getClass();
        featureFlagManager.getClass();
        trackingEventsLogger.getClass();
        permissionRequestWorker_Factory_Impl.getClass();
        this.applicationContext = context;
        this.nfcScanWorkerFactory = factory;
        this.createReusablePersonaWorkerFactory = createReusablePersonaWorker_Factory_Impl;
        this.verifyReusablePersonaWorkerFactory = verifyReusablePersonaWorker_Factory_Impl;
        this.navigationStateManager = navigationStateManager;
        this.componentWorkHelper = uiStepComponentWorkHelper;
        this.externalEventLogger = externalEventLogger;
        this.featureFlagManager = featureFlagManager;
        this.trackingEventsLogger = trackingEventsLogger;
        this.permissionRequestWorkerFactory = permissionRequestWorker_Factory_Impl;
        if (((SubtreeManager) this.lastChild).getState() == null) {
            UiWorkflow.Input input2 = (UiWorkflow.Input) ((StateFlowImpl) this.firstChild).getValue();
            input2.getClass();
            List list = input2.components;
            List list2 = list != null ? UiComponentKt.to(list) : EmptyList.INSTANCE;
            list2 = featureFlagManager.getValue(TipsFeatureFlag.INSTANCE$1) ? list2 : ComponentWorkHelperKt.removeFileUploadComponents(list2);
            String str = input2.stepName;
            StepStyles.UiStepStyle uiStepStyle = input2.styles;
            List list3 = input2.serverComponentErrors;
            updateState(new UiState.Displaying(list2, str, list3 == null ? EmptyList.INSTANCE : list3, uiStepStyle));
        }
        SubtreeManager subtreeManager = (SubtreeManager) this.lastChild;
        ForwardingFileSystem$$ExternalSyntheticLambda0 forwardingFileSystem$$ExternalSyntheticLambda0 = new ForwardingFileSystem$$ExternalSyntheticLambda0(this, 13);
        subtreeManager.children = forwardingFileSystem$$ExternalSyntheticLambda0;
        forwardingFileSystem$$ExternalSyntheticLambda0.invoke(subtreeManager.getState());
        ContextScope contextScope = (ContextScope) this.parent;
        Unconfined unconfined = Dispatchers.Unconfined;
        Continuation continuation = null;
        JobKt.launch$default(contextScope, unconfined, null, new AnonymousClass2(this, continuation, 0), 2);
        JobKt.launch$default((ContextScope) this.parent, unconfined, null, new AnonymousClass2(this, continuation, 1), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0556 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03b5  */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v52, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v54 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleState(UiStepStateManager uiStepStateManager, UiWorkflow.Input input, final UiState uiState, Continuation continuation) {
        Continuation continuation2;
        NavigationStateManager navigationStateManager;
        HelpBottomSheetComponent helpBottomSheetComponent;
        UiState.PendingAction pendingAction;
        int i;
        UiState.Displaying.AutoSubmit autoSubmit;
        boolean z;
        List list;
        String str;
        UiWorkflow.Screen.EntryScreen.AutoSubmit autoSubmit2;
        int i2;
        int i3;
        Date date;
        ?? listOf;
        ?? scanDocumentError;
        String str2;
        String incorrectIdDetailsTransitionComponentName;
        String unableToScanTransitionComponentName;
        String successfulScanTransitionComponentName;
        String rescanDocumentPrompt;
        String scanDocumentPromptTitle;
        String errorModalReenterIdDetailsButtonText;
        String errorModalTroubleshootingTipsButtonText;
        String errorModalTryAgainButtonText;
        String errorModalGenericErrorText;
        String errorModalGenericErrorTitle;
        String errorModalIncorrectIdDetailsText;
        String errorModalIncorrectIdDetailsTitle;
        String errorModalLostConnectionText;
        String errorModalLostConnectionTitle;
        String errorModalChipNotDetectedText;
        String errorModalChipNotDetectedTitle;
        String scanDocumentError2;
        String authenticationErrorPrompt;
        String enableNfcPrompt;
        String scanDocumentSuccess;
        String scanDocumentSuccessTitle;
        String authenticatingTitle;
        String readingTitle;
        String reading;
        String authenticating;
        String scanDocumentPrompt;
        String scanDocumentPromptTitle2;
        List<GovernmentIdNfcScan.DataGroupTypes> enabledDataGroups;
        final UiStepStateManager uiStepStateManager2 = uiStepStateManager;
        NavigationStateManager navigationStateManager2 = uiStepStateManager2.navigationStateManager;
        Context context = uiStepStateManager2.applicationContext;
        SubtreeManager subtreeManager = (SubtreeManager) uiStepStateManager2.lastChild;
        boolean z2 = input.isRestoringState;
        boolean z3 = input.isSubmitting;
        if (z2) {
            return Unit.INSTANCE;
        }
        if (!(uiState instanceof UiState.Displaying)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        UiState.Displaying.AutoSubmit autoSubmit3 = displaying.autoSubmit;
        List list2 = displaying.components;
        UiState.PendingAction pendingAction2 = displaying.pendingAction;
        if (pendingAction2 instanceof UiState.PendingAction.CreateReusablePersona) {
            CreateReusablePersonaWorker_Factory_Impl createReusablePersonaWorker_Factory_Impl = uiStepStateManager2.createReusablePersonaWorkerFactory;
            String str3 = input.sessionToken;
            String str4 = input.inquiryId;
            continuation2 = null;
            CreatePersonaSheetComponent createPersonaSheetComponent = ((UiState.PendingAction.CreateReusablePersona) pendingAction2).createPersonaSheetComponent;
            String str5 = createPersonaSheetComponent.url;
            if (str5 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
            }
            subtreeManager.runningWorker(createReusablePersonaWorker_Factory_Impl.create(str3, str4, str5, createPersonaSheetComponent.name), new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(21, pendingAction2, uiStepStateManager2, displaying));
        } else {
            continuation2 = null;
            if (pendingAction2 instanceof UiState.PendingAction.VerifyReusablePersona) {
                VerifyReusablePersonaWorker_Factory_Impl verifyReusablePersonaWorker_Factory_Impl = uiStepStateManager2.verifyReusablePersonaWorkerFactory;
                String str6 = input.sessionToken;
                String str7 = input.inquiryId;
                UiState.PendingAction.VerifyReusablePersona verifyReusablePersona = (UiState.PendingAction.VerifyReusablePersona) pendingAction2;
                VerifyPersonaButtonComponent verifyPersonaButtonComponent = verifyReusablePersona.verifyPersonaButtonComponent;
                String str8 = verifyPersonaButtonComponent.url;
                if (str8 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    return null;
                }
                subtreeManager.runningWorker(verifyReusablePersonaWorker_Factory_Impl.create(str6, str7, str8, verifyPersonaButtonComponent.name, verifyReusablePersona.componentParams), new BlurEffectKt$$ExternalSyntheticLambda1(17, uiStepStateManager2, displaying));
            } else if (pendingAction2 != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        HelpBottomSheetComponent helpBottomSheetComponent2 = (HelpBottomSheetComponent) ExtensionsKt.findFirstComponentOrNull(list2, Reflection.factory.getOrCreateKotlinClass(HelpBottomSheetComponent.class), UiStepStateManager$handleState$$inlined$findFirstComponentOrNull$default$1.INSTANCE);
        boolean z4 = helpBottomSheetComponent2 != null && ((GovernmentIdNfcScanComponent) helpBottomSheetComponent2).isEnabled();
        navigationStateManager2.setState(input.backStepEnabled, input.cancelButtonEnabled, pendingAction2 == null && !z3, z4);
        recurse(list2, new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(20, uiStepStateManager2, input, uiState));
        UiState.Displaying.NfcScan nfcScan = displaying.nfcScan;
        boolean z5 = z4;
        if (nfcScan != null) {
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent = nfcScan.component;
            String textValue = governmentIdNfcScanComponent.cardAccessNumberController.getTextValue();
            String textValue2 = governmentIdNfcScanComponent.documentNumberController.getTextValue();
            Date dateValue = governmentIdNfcScanComponent.dateOfBirthController.getDateValue();
            Date dateValue2 = governmentIdNfcScanComponent.expirationDateController.getDateValue();
            GovernmentIdNfcScan governmentIdNfcScan = governmentIdNfcScanComponent.config;
            GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScan.getAttributes();
            if (StringsKt.isBlank(textValue2) || dateValue == null) {
                navigationStateManager = navigationStateManager2;
                i3 = R.string.pi2_permissions_continue;
                date = dateValue;
            } else if (dateValue2 == null) {
                date = dateValue;
                navigationStateManager = navigationStateManager2;
                i3 = R.string.pi2_permissions_continue;
            } else {
                MrzKey mrzKey = new MrzKey(textValue2, dateValue2, dateValue);
                if (attributes == null || (enabledDataGroups = attributes.getEnabledDataGroups()) == null) {
                    listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new NfcDataGroupType[]{NfcDataGroupType.Dg1, NfcDataGroupType.Dg2, NfcDataGroupType.Sod});
                } else {
                    listOf = new ArrayList();
                    Iterator it = enabledDataGroups.iterator();
                    while (it.hasNext()) {
                        int i4 = WhenMappings.$EnumSwitchMapping$1[((GovernmentIdNfcScan.DataGroupTypes) it.next()).ordinal()];
                        Iterator it2 = it;
                        Object obj = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? continuation2 : NfcDataGroupType.Sod : NfcDataGroupType.Dg14 : NfcDataGroupType.Dg2 : NfcDataGroupType.Dg1;
                        if (obj != null) {
                            listOf.add(obj);
                        }
                        it = it2;
                    }
                }
                List list3 = listOf;
                ScanNfcWorker.Factory factory = uiStepStateManager2.nfcScanWorkerFactory;
                String str9 = (attributes == null || (scanDocumentPromptTitle2 = attributes.getScanDocumentPromptTitle()) == null) ? "" : scanDocumentPromptTitle2;
                String str10 = (attributes == null || (scanDocumentPrompt = attributes.getScanDocumentPrompt()) == null) ? "" : scanDocumentPrompt;
                String str11 = (attributes == null || (authenticating = attributes.getAuthenticating()) == null) ? "" : authenticating;
                String str12 = (attributes == null || (reading = attributes.getReading()) == null) ? "" : reading;
                String str13 = (attributes == null || (readingTitle = attributes.getReadingTitle()) == null) ? "" : readingTitle;
                String str14 = (attributes == null || (authenticatingTitle = attributes.getAuthenticatingTitle()) == null) ? "" : authenticatingTitle;
                String string2 = context.getString(R.string.pi2_permissions_cancel);
                string2.getClass();
                String str15 = (attributes == null || (scanDocumentSuccessTitle = attributes.getScanDocumentSuccessTitle()) == null) ? "" : scanDocumentSuccessTitle;
                String str16 = (attributes == null || (scanDocumentSuccess = attributes.getScanDocumentSuccess()) == null) ? "" : scanDocumentSuccess;
                String str17 = (attributes == null || (enableNfcPrompt = attributes.getEnableNfcPrompt()) == null) ? "" : enableNfcPrompt;
                String string3 = context.getString(R.string.pi2_permissions_continue);
                string3.getClass();
                String string4 = context.getString(R.string.pi2_permissions_cancel);
                string4.getClass();
                if (attributes == null || (scanDocumentError = attributes.getConnectionLostPrompt()) == 0) {
                    scanDocumentError = attributes != null ? attributes.getScanDocumentError() : continuation2;
                    if (scanDocumentError == 0) {
                        str2 = "";
                        String string5 = context.getString(R.string.pi2_retry);
                        string5.getClass();
                        String str18 = (attributes != null || (authenticationErrorPrompt = attributes.getAuthenticationErrorPrompt()) == null) ? "" : authenticationErrorPrompt;
                        String string6 = context.getString(R.string.pi2_retry);
                        string6.getClass();
                        String str19 = (attributes != null || (scanDocumentError2 = attributes.getScanDocumentError()) == null) ? "" : scanDocumentError2;
                        String string7 = context.getString(R.string.pi2_retry);
                        string7.getClass();
                        ScanNfcWorker create = ((ScanNfcWorker_Factory_Impl) factory).create(textValue, mrzKey, new PassportNfcStrings(str9, str10, str11, str14, str12, str13, string2, str15, str16, str17, string3, string4, str2, string5, str18, string6, str19, string7, (attributes != null || (errorModalChipNotDetectedTitle = attributes.getErrorModalChipNotDetectedTitle()) == null) ? "" : errorModalChipNotDetectedTitle, (attributes != null || (errorModalChipNotDetectedText = attributes.getErrorModalChipNotDetectedText()) == null) ? "" : errorModalChipNotDetectedText, (attributes != null || (errorModalLostConnectionTitle = attributes.getErrorModalLostConnectionTitle()) == null) ? "" : errorModalLostConnectionTitle, (attributes != null || (errorModalLostConnectionText = attributes.getErrorModalLostConnectionText()) == null) ? "" : errorModalLostConnectionText, (attributes != null || (errorModalIncorrectIdDetailsTitle = attributes.getErrorModalIncorrectIdDetailsTitle()) == null) ? "" : errorModalIncorrectIdDetailsTitle, (attributes != null || (errorModalIncorrectIdDetailsText = attributes.getErrorModalIncorrectIdDetailsText()) == null) ? "" : errorModalIncorrectIdDetailsText, (attributes != null || (errorModalGenericErrorTitle = attributes.getErrorModalGenericErrorTitle()) == null) ? "" : errorModalGenericErrorTitle, (attributes != null || (errorModalGenericErrorText = attributes.getErrorModalGenericErrorText()) == null) ? "" : errorModalGenericErrorText, (attributes != null || (errorModalTryAgainButtonText = attributes.getErrorModalTryAgainButtonText()) == null) ? "" : errorModalTryAgainButtonText, (attributes != null || (errorModalTroubleshootingTipsButtonText = attributes.getErrorModalTroubleshootingTipsButtonText()) == null) ? "" : errorModalTroubleshootingTipsButtonText, (attributes != null || (errorModalReenterIdDetailsButtonText = attributes.getErrorModalReenterIdDetailsButtonText()) == null) ? "" : errorModalReenterIdDetailsButtonText, (attributes != null || (scanDocumentPromptTitle = attributes.getScanDocumentPromptTitle()) == null) ? "" : scanDocumentPromptTitle, (attributes != null || (rescanDocumentPrompt = attributes.getRescanDocumentPrompt()) == null) ? "" : rescanDocumentPrompt, (attributes != null || (successfulScanTransitionComponentName = attributes.getSuccessfulScanTransitionComponentName()) == null) ? "" : successfulScanTransitionComponentName, (attributes != null || (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) == null) ? "" : unableToScanTransitionComponentName, (attributes != null || (incorrectIdDetailsTransitionComponentName = attributes.getIncorrectIdDetailsTransitionComponentName()) == null) ? "" : incorrectIdDetailsTransitionComponentName), list3, input.styles, governmentIdNfcScan.getStyles(), uiStepStateManager2.featureFlagManager.getValue(TipsFeatureFlag.INSTANCE$2));
                        navigationStateManager = navigationStateManager2;
                        displaying = displaying;
                        subtreeManager.runningWorker(create, new UiWorkflow$$ExternalSyntheticLambda14(uiStepStateManager2, displaying, nfcScan, governmentIdNfcScanComponent, 12));
                        uiStepStateManager2 = uiStepStateManager;
                        autoSubmit = autoSubmit3;
                        helpBottomSheetComponent = helpBottomSheetComponent2;
                        pendingAction = pendingAction2;
                        i = R.string.pi2_permissions_continue;
                    }
                }
                str2 = scanDocumentError;
                String string52 = context.getString(R.string.pi2_retry);
                string52.getClass();
                if (attributes != null) {
                }
                String string62 = context.getString(R.string.pi2_retry);
                string62.getClass();
                if (attributes != null) {
                }
                String string72 = context.getString(R.string.pi2_retry);
                string72.getClass();
                ScanNfcWorker create2 = ((ScanNfcWorker_Factory_Impl) factory).create(textValue, mrzKey, new PassportNfcStrings(str9, str10, str11, str14, str12, str13, string2, str15, str16, str17, string3, string4, str2, string52, str18, string62, str19, string72, (attributes != null || (errorModalChipNotDetectedTitle = attributes.getErrorModalChipNotDetectedTitle()) == null) ? "" : errorModalChipNotDetectedTitle, (attributes != null || (errorModalChipNotDetectedText = attributes.getErrorModalChipNotDetectedText()) == null) ? "" : errorModalChipNotDetectedText, (attributes != null || (errorModalLostConnectionTitle = attributes.getErrorModalLostConnectionTitle()) == null) ? "" : errorModalLostConnectionTitle, (attributes != null || (errorModalLostConnectionText = attributes.getErrorModalLostConnectionText()) == null) ? "" : errorModalLostConnectionText, (attributes != null || (errorModalIncorrectIdDetailsTitle = attributes.getErrorModalIncorrectIdDetailsTitle()) == null) ? "" : errorModalIncorrectIdDetailsTitle, (attributes != null || (errorModalIncorrectIdDetailsText = attributes.getErrorModalIncorrectIdDetailsText()) == null) ? "" : errorModalIncorrectIdDetailsText, (attributes != null || (errorModalGenericErrorTitle = attributes.getErrorModalGenericErrorTitle()) == null) ? "" : errorModalGenericErrorTitle, (attributes != null || (errorModalGenericErrorText = attributes.getErrorModalGenericErrorText()) == null) ? "" : errorModalGenericErrorText, (attributes != null || (errorModalTryAgainButtonText = attributes.getErrorModalTryAgainButtonText()) == null) ? "" : errorModalTryAgainButtonText, (attributes != null || (errorModalTroubleshootingTipsButtonText = attributes.getErrorModalTroubleshootingTipsButtonText()) == null) ? "" : errorModalTroubleshootingTipsButtonText, (attributes != null || (errorModalReenterIdDetailsButtonText = attributes.getErrorModalReenterIdDetailsButtonText()) == null) ? "" : errorModalReenterIdDetailsButtonText, (attributes != null || (scanDocumentPromptTitle = attributes.getScanDocumentPromptTitle()) == null) ? "" : scanDocumentPromptTitle, (attributes != null || (rescanDocumentPrompt = attributes.getRescanDocumentPrompt()) == null) ? "" : rescanDocumentPrompt, (attributes != null || (successfulScanTransitionComponentName = attributes.getSuccessfulScanTransitionComponentName()) == null) ? "" : successfulScanTransitionComponentName, (attributes != null || (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) == null) ? "" : unableToScanTransitionComponentName, (attributes != null || (incorrectIdDetailsTransitionComponentName = attributes.getIncorrectIdDetailsTransitionComponentName()) == null) ? "" : incorrectIdDetailsTransitionComponentName), list3, input.styles, governmentIdNfcScan.getStyles(), uiStepStateManager2.featureFlagManager.getValue(TipsFeatureFlag.INSTANCE$2));
                navigationStateManager = navigationStateManager2;
                displaying = displaying;
                subtreeManager.runningWorker(create2, new UiWorkflow$$ExternalSyntheticLambda14(uiStepStateManager2, displaying, nfcScan, governmentIdNfcScanComponent, 12));
                uiStepStateManager2 = uiStepStateManager;
                autoSubmit = autoSubmit3;
                helpBottomSheetComponent = helpBottomSheetComponent2;
                pendingAction = pendingAction2;
                i = R.string.pi2_permissions_continue;
            }
            autoSubmit = autoSubmit3;
            helpBottomSheetComponent = helpBottomSheetComponent2;
            i = i3;
            pendingAction = pendingAction2;
            z = z3;
            list = list2;
            UiStepStateManager$runGovIdNfcWork$1 uiStepStateManager$runGovIdNfcWork$1 = new UiStepStateManager$runGovIdNfcWork$1(attributes, uiStepStateManager, textValue2, date, dateValue2, nfcScan, displaying, null);
            uiStepStateManager2 = uiStepStateManager;
            displaying = displaying;
            subtreeManager.runningSideEffect("client_side_nfc_form_validation", uiStepStateManager$runGovIdNfcWork$1);
            InquirySessionConfig inquirySessionConfig = input.inquirySessionConfig;
            Permission permission = inquirySessionConfig.gpsPrecisionRequirement != GpsPrecisionRequirement.ROUGH ? Permission.RoughLocation : Permission.PreciseLocation;
            boolean z6 = inquirySessionConfig.gpsCollectionRequirement != GpsCollectionRequirement.OPTIONAL;
            if (displaying.isRequestingGpsPermissions) {
                PermissionRequestWorker_Factory_Impl permissionRequestWorker_Factory_Impl = uiStepStateManager2.permissionRequestWorkerFactory;
                String str20 = input.gpsPermissionsTitle;
                String str21 = str20 == null ? "" : str20;
                String str22 = input.gpsPermissionsRationale;
                if (str22 == null) {
                    str22 = "Gps permission are required to verify your identity";
                }
                String str23 = str22;
                String string8 = context.getString(R.string.pi2_ui_gps_permission_denied_rationale, ContextUtilsKt.getApplicationName(context));
                string8.getClass();
                String str24 = input.gpsFeatureModalPositiveButton;
                if (str24 == null) {
                    str24 = context.getString(i);
                    str24.getClass();
                }
                String str25 = str24;
                String str26 = input.gpsPermissionsModalNegativeButton;
                if (str26 == null) {
                    str26 = context.getString(i);
                    str26.getClass();
                }
                subtreeManager.runningWorker(permissionRequestWorker_Factory_Impl.create(new PermissionRequestWorkflow.Props(permission, z6, str21, str23, string8, str25, str26, input.gpsFeatureTitle, input.gpsFeatureRationale, input.gpsPermissionsModalNegativeButton, input.styles)), new DialogHostKt$$ExternalSyntheticLambda2(uiStepStateManager2, z6, uiState, 15));
            }
            str = displaying.error;
            if (str == null && input.transitionError != null) {
                str = context.getString(R.string.pi2_network_connection_error);
            }
            String str27 = str;
            if (autoSubmit == null) {
                ButtonComponent buttonComponent = (ButtonComponent) ExtensionsKt.findFirstComponentOrNull(list, Reflection.factory.getOrCreateKotlinClass(ButtonComponent.class), new InstantKt$$ExternalSyntheticLambda0(14));
                if (buttonComponent != null) {
                    subtreeManager.runningSideEffect("begin_countdown", new UiStepStateManager$handleState$5$1(uiStepStateManager2, uiState, buttonComponent, continuation2));
                }
            }
            if (autoSubmit != null && (i2 = autoSubmit.countdown) >= 1) {
                subtreeManager.runningSideEffect(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "countdown_"), new UiStepStateManager$handleState$6$1(autoSubmit, uiStepStateManager2, uiState, null));
            }
            List list4 = displaying.components;
            List list5 = input.components;
            List list6 = displaying.componentErrors;
            List list7 = input.serverComponentErrors;
            ArrayList plus = CollectionsKt.plus(list7 == null ? list7 : EmptyList.INSTANCE, (Collection) list6);
            NavigationState navigationState = navigationStateManager.getNavigationState();
            if (!z || autoSubmit == null) {
                autoSubmit2 = null;
            } else {
                autoSubmit2 = new UiWorkflow.Screen.EntryScreen.AutoSubmit(autoSubmit.component, autoSubmit.countdownText, autoSubmit.countdown <= 0);
            }
            boolean z7 = pendingAction == null || z;
            StepStyles.UiStepStyle uiStepStyle = displaying.styles;
            boolean z8 = !z5 && displaying.showHelpBottomSheet;
            final int i5 = 2;
            final HelpBottomSheetComponent helpBottomSheetComponent3 = helpBottomSheetComponent;
            final int i6 = 0;
            final int i7 = 1;
            final int i8 = 2;
            final int i9 = 1;
            UiWorkflow.Screen.EntryScreen entryScreen = new UiWorkflow.Screen.EntryScreen(list4, list5, plus, navigationState, new BufferedChannel$$ExternalSyntheticLambda4(10, uiStepStateManager2, uiState, input), new Function0(uiStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$$ExternalSyntheticLambda3
                public final /* synthetic */ UiStepStateManager f$0;

                {
                    this.f$0 = uiStepStateManager2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i10 = i5;
                    UiState uiState2 = uiState;
                    UiStepStateManager uiStepStateManager3 = this.f$0;
                    switch (i10) {
                        case 0:
                            uiStepStateManager3.updateState(UiState.Displaying.copy$default((UiState.Displaying) uiState2, null, null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.JPEG_APP15_MARKER));
                            break;
                        case 1:
                            uiStepStateManager3.updateState(UiState.Displaying.copy$default((UiState.Displaying) uiState2, null, null, null, null, null, null, false, null, null, null, false, null, 0, 57343));
                            break;
                        default:
                            TrackingEventsLogger.DefaultImpls.logUiStepButtonEvent$default(uiStepStateManager3.trackingEventsLogger, UiStepButtonType.Complete, null, ((UiState.Displaying) uiState2).stepName, false, 10, null);
                            uiStepStateManager3.setOutput(UiWorkflow.Output.Completed.INSTANCE);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, new UiScreenRunner$$ExternalSyntheticLambda29(26, uiStepStateManager2, uiState, input), new BlurEffectKt$$ExternalSyntheticLambda1(16, uiStepStateManager2, uiState), new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    GovernmentIdNfcScan governmentIdNfcScan2;
                    GovernmentIdNfcScan.Attributes attributes2;
                    String unableToScanTransitionComponentName2;
                    int i10 = i6;
                    UiState uiState2 = uiState;
                    UiStepStateManager uiStepStateManager3 = uiStepStateManager2;
                    HelpBottomSheetComponent helpBottomSheetComponent4 = helpBottomSheetComponent3;
                    switch (i10) {
                        case 0:
                            if (helpBottomSheetComponent4 != null && (helpBottomSheetComponent4 instanceof GovernmentIdNfcScanComponent)) {
                                uiStepStateManager3.handleLaunchNfcScan((GovernmentIdNfcScanComponent) helpBottomSheetComponent4, (UiState.Displaying) uiState2);
                            }
                            break;
                        default:
                            if (helpBottomSheetComponent4 != null && (helpBottomSheetComponent4 instanceof GovernmentIdNfcScanComponent) && (attributes2 = (governmentIdNfcScan2 = ((GovernmentIdNfcScanComponent) helpBottomSheetComponent4).config).getAttributes()) != null && (unableToScanTransitionComponentName2 = attributes2.getUnableToScanTransitionComponentName()) != null && (!StringsKt.isBlank(unableToScanTransitionComponentName2))) {
                                UiState.Displaying displaying2 = (UiState.Displaying) uiState2;
                                UiStepStateManager.recurse(displaying2.components, new UiWorkflow$$ExternalSyntheticLambda9(true, helpBottomSheetComponent4, 1));
                                GovernmentIdNfcScan.Attributes attributes3 = governmentIdNfcScan2.getAttributes();
                                uiStepStateManager3.updateState(ComponentWorkHelperKt.autoSubmitState(displaying2, attributes3 != null ? attributes3.getUnableToScanTransitionComponentName() : null));
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    GovernmentIdNfcScan governmentIdNfcScan2;
                    GovernmentIdNfcScan.Attributes attributes2;
                    String unableToScanTransitionComponentName2;
                    int i10 = i7;
                    UiState uiState2 = uiState;
                    UiStepStateManager uiStepStateManager3 = uiStepStateManager2;
                    HelpBottomSheetComponent helpBottomSheetComponent4 = helpBottomSheetComponent3;
                    switch (i10) {
                        case 0:
                            if (helpBottomSheetComponent4 != null && (helpBottomSheetComponent4 instanceof GovernmentIdNfcScanComponent)) {
                                uiStepStateManager3.handleLaunchNfcScan((GovernmentIdNfcScanComponent) helpBottomSheetComponent4, (UiState.Displaying) uiState2);
                            }
                            break;
                        default:
                            if (helpBottomSheetComponent4 != null && (helpBottomSheetComponent4 instanceof GovernmentIdNfcScanComponent) && (attributes2 = (governmentIdNfcScan2 = ((GovernmentIdNfcScanComponent) helpBottomSheetComponent4).config).getAttributes()) != null && (unableToScanTransitionComponentName2 = attributes2.getUnableToScanTransitionComponentName()) != null && (!StringsKt.isBlank(unableToScanTransitionComponentName2))) {
                                UiState.Displaying displaying2 = (UiState.Displaying) uiState2;
                                UiStepStateManager.recurse(displaying2.components, new UiWorkflow$$ExternalSyntheticLambda9(true, helpBottomSheetComponent4, 1));
                                GovernmentIdNfcScan.Attributes attributes3 = governmentIdNfcScan2.getAttributes();
                                uiStepStateManager3.updateState(ComponentWorkHelperKt.autoSubmitState(displaying2, attributes3 != null ? attributes3.getUnableToScanTransitionComponentName() : null));
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, new Function2(uiStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$$ExternalSyntheticLambda2
                public final /* synthetic */ UiStepStateManager f$0;

                {
                    this.f$0 = uiStepStateManager2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i10 = i7;
                    UiState uiState2 = uiState;
                    UiStepStateManager uiStepStateManager3 = this.f$0;
                    switch (i10) {
                        case 0:
                            InputAddressComponent inputAddressComponent = (InputAddressComponent) obj2;
                            String str28 = (String) obj3;
                            inputAddressComponent.getClass();
                            str28.getClass();
                            UiState.Displaying displaying2 = (UiState.Displaying) uiState2;
                            uiStepStateManager3.updateState(UiState.Displaying.copy$default(displaying2, UiComponentKt.updateComponent(displaying2.components, inputAddressComponent, inputAddressComponent.updateSelectedSearchResultId(str28).updateIsAddressAutocompleteLoading(Boolean.TRUE)), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER));
                            break;
                        case 1:
                            VerifyPersonaButtonComponent verifyPersonaButtonComponent2 = (VerifyPersonaButtonComponent) obj2;
                            Map map = (Map) obj3;
                            verifyPersonaButtonComponent2.getClass();
                            map.getClass();
                            UiState.Displaying displaying3 = (UiState.Displaying) uiState2;
                            UiStepStateManager.recurse(displaying3.components, new UiWorkflow$$ExternalSyntheticLambda9(true, verifyPersonaButtonComponent2, 1));
                            uiStepStateManager3.updateState(UiState.Displaying.copy$default(displaying3, null, null, null, null, null, new UiState.PendingAction.VerifyReusablePersona(verifyPersonaButtonComponent2, map), false, null, null, null, false, null, 0, 65407));
                            break;
                        default:
                            CreatePersonaSheetComponent createPersonaSheetComponent2 = (CreatePersonaSheetComponent) obj2;
                            UiComponent uiComponent = (UiComponent) obj3;
                            createPersonaSheetComponent2.getClass();
                            uiComponent.getClass();
                            UiState.Displaying displaying4 = (UiState.Displaying) uiState2;
                            List list8 = displaying4.components;
                            ButtonComponent buttonComponent2 = uiComponent instanceof ButtonComponent ? (ButtonComponent) uiComponent : null;
                            if (buttonComponent2 != null) {
                                buttonComponent2.setWasTapped(true);
                            }
                            uiStepStateManager3.updateState(UiState.Displaying.copy$default(displaying4, UiComponentKt.updateComponent(list8, createPersonaSheetComponent2, CreatePersonaSheetComponentKt.updateComponent(createPersonaSheetComponent2, uiComponent, uiComponent)), null, null, null, null, new UiState.PendingAction.CreateReusablePersona(createPersonaSheetComponent2), false, null, null, null, false, null, 0, 65406));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, autoSubmit2, new Choreographers$$ExternalSyntheticLambda1(uiStepStateManager2, 11), new Function2(uiStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$$ExternalSyntheticLambda2
                public final /* synthetic */ UiStepStateManager f$0;

                {
                    this.f$0 = uiStepStateManager2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i10 = i6;
                    UiState uiState2 = uiState;
                    UiStepStateManager uiStepStateManager3 = this.f$0;
                    switch (i10) {
                        case 0:
                            InputAddressComponent inputAddressComponent = (InputAddressComponent) obj2;
                            String str28 = (String) obj3;
                            inputAddressComponent.getClass();
                            str28.getClass();
                            UiState.Displaying displaying2 = (UiState.Displaying) uiState2;
                            uiStepStateManager3.updateState(UiState.Displaying.copy$default(displaying2, UiComponentKt.updateComponent(displaying2.components, inputAddressComponent, inputAddressComponent.updateSelectedSearchResultId(str28).updateIsAddressAutocompleteLoading(Boolean.TRUE)), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER));
                            break;
                        case 1:
                            VerifyPersonaButtonComponent verifyPersonaButtonComponent2 = (VerifyPersonaButtonComponent) obj2;
                            Map map = (Map) obj3;
                            verifyPersonaButtonComponent2.getClass();
                            map.getClass();
                            UiState.Displaying displaying3 = (UiState.Displaying) uiState2;
                            UiStepStateManager.recurse(displaying3.components, new UiWorkflow$$ExternalSyntheticLambda9(true, verifyPersonaButtonComponent2, 1));
                            uiStepStateManager3.updateState(UiState.Displaying.copy$default(displaying3, null, null, null, null, null, new UiState.PendingAction.VerifyReusablePersona(verifyPersonaButtonComponent2, map), false, null, null, null, false, null, 0, 65407));
                            break;
                        default:
                            CreatePersonaSheetComponent createPersonaSheetComponent2 = (CreatePersonaSheetComponent) obj2;
                            UiComponent uiComponent = (UiComponent) obj3;
                            createPersonaSheetComponent2.getClass();
                            uiComponent.getClass();
                            UiState.Displaying displaying4 = (UiState.Displaying) uiState2;
                            List list8 = displaying4.components;
                            ButtonComponent buttonComponent2 = uiComponent instanceof ButtonComponent ? (ButtonComponent) uiComponent : null;
                            if (buttonComponent2 != null) {
                                buttonComponent2.setWasTapped(true);
                            }
                            uiStepStateManager3.updateState(UiState.Displaying.copy$default(displaying4, UiComponentKt.updateComponent(list8, createPersonaSheetComponent2, CreatePersonaSheetComponentKt.updateComponent(createPersonaSheetComponent2, uiComponent, uiComponent)), null, null, null, null, new UiState.PendingAction.CreateReusablePersona(createPersonaSheetComponent2), false, null, null, null, false, null, 0, 65406));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, z7, uiStepStyle, str27, new Function0(uiStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$$ExternalSyntheticLambda3
                public final /* synthetic */ UiStepStateManager f$0;

                {
                    this.f$0 = uiStepStateManager2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i10 = i6;
                    UiState uiState2 = uiState;
                    UiStepStateManager uiStepStateManager3 = this.f$0;
                    switch (i10) {
                        case 0:
                            uiStepStateManager3.updateState(UiState.Displaying.copy$default((UiState.Displaying) uiState2, null, null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.JPEG_APP15_MARKER));
                            break;
                        case 1:
                            uiStepStateManager3.updateState(UiState.Displaying.copy$default((UiState.Displaying) uiState2, null, null, null, null, null, null, false, null, null, null, false, null, 0, 57343));
                            break;
                        default:
                            TrackingEventsLogger.DefaultImpls.logUiStepButtonEvent$default(uiStepStateManager3.trackingEventsLogger, UiStepButtonType.Complete, null, ((UiState.Displaying) uiState2).stepName, false, 10, null);
                            uiStepStateManager3.setOutput(UiWorkflow.Output.Completed.INSTANCE);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, new Function2(uiStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$$ExternalSyntheticLambda2
                public final /* synthetic */ UiStepStateManager f$0;

                {
                    this.f$0 = uiStepStateManager2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i10 = i8;
                    UiState uiState2 = uiState;
                    UiStepStateManager uiStepStateManager3 = this.f$0;
                    switch (i10) {
                        case 0:
                            InputAddressComponent inputAddressComponent = (InputAddressComponent) obj2;
                            String str28 = (String) obj3;
                            inputAddressComponent.getClass();
                            str28.getClass();
                            UiState.Displaying displaying2 = (UiState.Displaying) uiState2;
                            uiStepStateManager3.updateState(UiState.Displaying.copy$default(displaying2, UiComponentKt.updateComponent(displaying2.components, inputAddressComponent, inputAddressComponent.updateSelectedSearchResultId(str28).updateIsAddressAutocompleteLoading(Boolean.TRUE)), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER));
                            break;
                        case 1:
                            VerifyPersonaButtonComponent verifyPersonaButtonComponent2 = (VerifyPersonaButtonComponent) obj2;
                            Map map = (Map) obj3;
                            verifyPersonaButtonComponent2.getClass();
                            map.getClass();
                            UiState.Displaying displaying3 = (UiState.Displaying) uiState2;
                            UiStepStateManager.recurse(displaying3.components, new UiWorkflow$$ExternalSyntheticLambda9(true, verifyPersonaButtonComponent2, 1));
                            uiStepStateManager3.updateState(UiState.Displaying.copy$default(displaying3, null, null, null, null, null, new UiState.PendingAction.VerifyReusablePersona(verifyPersonaButtonComponent2, map), false, null, null, null, false, null, 0, 65407));
                            break;
                        default:
                            CreatePersonaSheetComponent createPersonaSheetComponent2 = (CreatePersonaSheetComponent) obj2;
                            UiComponent uiComponent = (UiComponent) obj3;
                            createPersonaSheetComponent2.getClass();
                            uiComponent.getClass();
                            UiState.Displaying displaying4 = (UiState.Displaying) uiState2;
                            List list8 = displaying4.components;
                            ButtonComponent buttonComponent2 = uiComponent instanceof ButtonComponent ? (ButtonComponent) uiComponent : null;
                            if (buttonComponent2 != null) {
                                buttonComponent2.setWasTapped(true);
                            }
                            uiStepStateManager3.updateState(UiState.Displaying.copy$default(displaying4, UiComponentKt.updateComponent(list8, createPersonaSheetComponent2, CreatePersonaSheetComponentKt.updateComponent(createPersonaSheetComponent2, uiComponent, uiComponent)), null, null, null, null, new UiState.PendingAction.CreateReusablePersona(createPersonaSheetComponent2), false, null, null, null, false, null, 0, 65406));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, helpBottomSheetComponent == null ? ((GovernmentIdNfcScanComponent) helpBottomSheetComponent).getViewModel() : null, z8, new Function0(uiStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$$ExternalSyntheticLambda3
                public final /* synthetic */ UiStepStateManager f$0;

                {
                    this.f$0 = uiStepStateManager2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i10 = i9;
                    UiState uiState2 = uiState;
                    UiStepStateManager uiStepStateManager3 = this.f$0;
                    switch (i10) {
                        case 0:
                            uiStepStateManager3.updateState(UiState.Displaying.copy$default((UiState.Displaying) uiState2, null, null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.JPEG_APP15_MARKER));
                            break;
                        case 1:
                            uiStepStateManager3.updateState(UiState.Displaying.copy$default((UiState.Displaying) uiState2, null, null, null, null, null, null, false, null, null, null, false, null, 0, 57343));
                            break;
                        default:
                            TrackingEventsLogger.DefaultImpls.logUiStepButtonEvent$default(uiStepStateManager3.trackingEventsLogger, UiStepButtonType.Complete, null, ((UiState.Displaying) uiState2).stepName, false, 10, null);
                            uiStepStateManager3.setOutput(UiWorkflow.Output.Completed.INSTANCE);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            Object withContext = JobKt.withContext(MainDispatcherLoader.dispatcher, new RxConvertKt$asFlow$1(uiStepStateManager2, entryScreen, null, 4), continuation);
            return withContext != CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
        }
        navigationStateManager = navigationStateManager2;
        helpBottomSheetComponent = helpBottomSheetComponent2;
        pendingAction = pendingAction2;
        i = R.string.pi2_permissions_continue;
        autoSubmit = autoSubmit3;
        z = z3;
        list = list2;
        InquirySessionConfig inquirySessionConfig2 = input.inquirySessionConfig;
        Permission permission2 = inquirySessionConfig2.gpsPrecisionRequirement != GpsPrecisionRequirement.ROUGH ? Permission.RoughLocation : Permission.PreciseLocation;
        if (inquirySessionConfig2.gpsCollectionRequirement != GpsCollectionRequirement.OPTIONAL) {
        }
        if (displaying.isRequestingGpsPermissions) {
        }
        str = displaying.error;
        if (str == null) {
            str = context.getString(R.string.pi2_network_connection_error);
        }
        String str272 = str;
        if (autoSubmit == null) {
        }
        if (autoSubmit != null) {
            subtreeManager.runningSideEffect(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "countdown_"), new UiStepStateManager$handleState$6$1(autoSubmit, uiStepStateManager2, uiState, null));
        }
        List list42 = displaying.components;
        List list52 = input.components;
        List list62 = displaying.componentErrors;
        List list72 = input.serverComponentErrors;
        ArrayList plus2 = CollectionsKt.plus(list72 == null ? list72 : EmptyList.INSTANCE, (Collection) list62);
        NavigationState navigationState2 = navigationStateManager.getNavigationState();
        if (z) {
        }
        autoSubmit2 = null;
        if (pendingAction == null) {
        }
        StepStyles.UiStepStyle uiStepStyle2 = displaying.styles;
        if (z5) {
        }
        final int i52 = 2;
        final HelpBottomSheetComponent helpBottomSheetComponent32 = helpBottomSheetComponent;
        final int i62 = 0;
        final int i72 = 1;
        final int i82 = 2;
        final int i92 = 1;
        UiWorkflow.Screen.EntryScreen entryScreen2 = new UiWorkflow.Screen.EntryScreen(list42, list52, plus2, navigationState2, new BufferedChannel$$ExternalSyntheticLambda4(10, uiStepStateManager2, uiState, input), new Function0(uiStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$$ExternalSyntheticLambda3
            public final /* synthetic */ UiStepStateManager f$0;

            {
                this.f$0 = uiStepStateManager2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i10 = i52;
                UiState uiState2 = uiState;
                UiStepStateManager uiStepStateManager3 = this.f$0;
                switch (i10) {
                    case 0:
                        uiStepStateManager3.updateState(UiState.Displaying.copy$default((UiState.Displaying) uiState2, null, null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.JPEG_APP15_MARKER));
                        break;
                    case 1:
                        uiStepStateManager3.updateState(UiState.Displaying.copy$default((UiState.Displaying) uiState2, null, null, null, null, null, null, false, null, null, null, false, null, 0, 57343));
                        break;
                    default:
                        TrackingEventsLogger.DefaultImpls.logUiStepButtonEvent$default(uiStepStateManager3.trackingEventsLogger, UiStepButtonType.Complete, null, ((UiState.Displaying) uiState2).stepName, false, 10, null);
                        uiStepStateManager3.setOutput(UiWorkflow.Output.Completed.INSTANCE);
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new UiScreenRunner$$ExternalSyntheticLambda29(26, uiStepStateManager2, uiState, input), new BlurEffectKt$$ExternalSyntheticLambda1(16, uiStepStateManager2, uiState), new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GovernmentIdNfcScan governmentIdNfcScan2;
                GovernmentIdNfcScan.Attributes attributes2;
                String unableToScanTransitionComponentName2;
                int i10 = i62;
                UiState uiState2 = uiState;
                UiStepStateManager uiStepStateManager3 = uiStepStateManager2;
                HelpBottomSheetComponent helpBottomSheetComponent4 = helpBottomSheetComponent32;
                switch (i10) {
                    case 0:
                        if (helpBottomSheetComponent4 != null && (helpBottomSheetComponent4 instanceof GovernmentIdNfcScanComponent)) {
                            uiStepStateManager3.handleLaunchNfcScan((GovernmentIdNfcScanComponent) helpBottomSheetComponent4, (UiState.Displaying) uiState2);
                        }
                        break;
                    default:
                        if (helpBottomSheetComponent4 != null && (helpBottomSheetComponent4 instanceof GovernmentIdNfcScanComponent) && (attributes2 = (governmentIdNfcScan2 = ((GovernmentIdNfcScanComponent) helpBottomSheetComponent4).config).getAttributes()) != null && (unableToScanTransitionComponentName2 = attributes2.getUnableToScanTransitionComponentName()) != null && (!StringsKt.isBlank(unableToScanTransitionComponentName2))) {
                            UiState.Displaying displaying2 = (UiState.Displaying) uiState2;
                            UiStepStateManager.recurse(displaying2.components, new UiWorkflow$$ExternalSyntheticLambda9(true, helpBottomSheetComponent4, 1));
                            GovernmentIdNfcScan.Attributes attributes3 = governmentIdNfcScan2.getAttributes();
                            uiStepStateManager3.updateState(ComponentWorkHelperKt.autoSubmitState(displaying2, attributes3 != null ? attributes3.getUnableToScanTransitionComponentName() : null));
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GovernmentIdNfcScan governmentIdNfcScan2;
                GovernmentIdNfcScan.Attributes attributes2;
                String unableToScanTransitionComponentName2;
                int i10 = i72;
                UiState uiState2 = uiState;
                UiStepStateManager uiStepStateManager3 = uiStepStateManager2;
                HelpBottomSheetComponent helpBottomSheetComponent4 = helpBottomSheetComponent32;
                switch (i10) {
                    case 0:
                        if (helpBottomSheetComponent4 != null && (helpBottomSheetComponent4 instanceof GovernmentIdNfcScanComponent)) {
                            uiStepStateManager3.handleLaunchNfcScan((GovernmentIdNfcScanComponent) helpBottomSheetComponent4, (UiState.Displaying) uiState2);
                        }
                        break;
                    default:
                        if (helpBottomSheetComponent4 != null && (helpBottomSheetComponent4 instanceof GovernmentIdNfcScanComponent) && (attributes2 = (governmentIdNfcScan2 = ((GovernmentIdNfcScanComponent) helpBottomSheetComponent4).config).getAttributes()) != null && (unableToScanTransitionComponentName2 = attributes2.getUnableToScanTransitionComponentName()) != null && (!StringsKt.isBlank(unableToScanTransitionComponentName2))) {
                            UiState.Displaying displaying2 = (UiState.Displaying) uiState2;
                            UiStepStateManager.recurse(displaying2.components, new UiWorkflow$$ExternalSyntheticLambda9(true, helpBottomSheetComponent4, 1));
                            GovernmentIdNfcScan.Attributes attributes3 = governmentIdNfcScan2.getAttributes();
                            uiStepStateManager3.updateState(ComponentWorkHelperKt.autoSubmitState(displaying2, attributes3 != null ? attributes3.getUnableToScanTransitionComponentName() : null));
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new Function2(uiStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$$ExternalSyntheticLambda2
            public final /* synthetic */ UiStepStateManager f$0;

            {
                this.f$0 = uiStepStateManager2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i10 = i72;
                UiState uiState2 = uiState;
                UiStepStateManager uiStepStateManager3 = this.f$0;
                switch (i10) {
                    case 0:
                        InputAddressComponent inputAddressComponent = (InputAddressComponent) obj2;
                        String str28 = (String) obj3;
                        inputAddressComponent.getClass();
                        str28.getClass();
                        UiState.Displaying displaying2 = (UiState.Displaying) uiState2;
                        uiStepStateManager3.updateState(UiState.Displaying.copy$default(displaying2, UiComponentKt.updateComponent(displaying2.components, inputAddressComponent, inputAddressComponent.updateSelectedSearchResultId(str28).updateIsAddressAutocompleteLoading(Boolean.TRUE)), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER));
                        break;
                    case 1:
                        VerifyPersonaButtonComponent verifyPersonaButtonComponent2 = (VerifyPersonaButtonComponent) obj2;
                        Map map = (Map) obj3;
                        verifyPersonaButtonComponent2.getClass();
                        map.getClass();
                        UiState.Displaying displaying3 = (UiState.Displaying) uiState2;
                        UiStepStateManager.recurse(displaying3.components, new UiWorkflow$$ExternalSyntheticLambda9(true, verifyPersonaButtonComponent2, 1));
                        uiStepStateManager3.updateState(UiState.Displaying.copy$default(displaying3, null, null, null, null, null, new UiState.PendingAction.VerifyReusablePersona(verifyPersonaButtonComponent2, map), false, null, null, null, false, null, 0, 65407));
                        break;
                    default:
                        CreatePersonaSheetComponent createPersonaSheetComponent2 = (CreatePersonaSheetComponent) obj2;
                        UiComponent uiComponent = (UiComponent) obj3;
                        createPersonaSheetComponent2.getClass();
                        uiComponent.getClass();
                        UiState.Displaying displaying4 = (UiState.Displaying) uiState2;
                        List list8 = displaying4.components;
                        ButtonComponent buttonComponent2 = uiComponent instanceof ButtonComponent ? (ButtonComponent) uiComponent : null;
                        if (buttonComponent2 != null) {
                            buttonComponent2.setWasTapped(true);
                        }
                        uiStepStateManager3.updateState(UiState.Displaying.copy$default(displaying4, UiComponentKt.updateComponent(list8, createPersonaSheetComponent2, CreatePersonaSheetComponentKt.updateComponent(createPersonaSheetComponent2, uiComponent, uiComponent)), null, null, null, null, new UiState.PendingAction.CreateReusablePersona(createPersonaSheetComponent2), false, null, null, null, false, null, 0, 65406));
                        break;
                }
                return Unit.INSTANCE;
            }
        }, autoSubmit2, new Choreographers$$ExternalSyntheticLambda1(uiStepStateManager2, 11), new Function2(uiStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$$ExternalSyntheticLambda2
            public final /* synthetic */ UiStepStateManager f$0;

            {
                this.f$0 = uiStepStateManager2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i10 = i62;
                UiState uiState2 = uiState;
                UiStepStateManager uiStepStateManager3 = this.f$0;
                switch (i10) {
                    case 0:
                        InputAddressComponent inputAddressComponent = (InputAddressComponent) obj2;
                        String str28 = (String) obj3;
                        inputAddressComponent.getClass();
                        str28.getClass();
                        UiState.Displaying displaying2 = (UiState.Displaying) uiState2;
                        uiStepStateManager3.updateState(UiState.Displaying.copy$default(displaying2, UiComponentKt.updateComponent(displaying2.components, inputAddressComponent, inputAddressComponent.updateSelectedSearchResultId(str28).updateIsAddressAutocompleteLoading(Boolean.TRUE)), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER));
                        break;
                    case 1:
                        VerifyPersonaButtonComponent verifyPersonaButtonComponent2 = (VerifyPersonaButtonComponent) obj2;
                        Map map = (Map) obj3;
                        verifyPersonaButtonComponent2.getClass();
                        map.getClass();
                        UiState.Displaying displaying3 = (UiState.Displaying) uiState2;
                        UiStepStateManager.recurse(displaying3.components, new UiWorkflow$$ExternalSyntheticLambda9(true, verifyPersonaButtonComponent2, 1));
                        uiStepStateManager3.updateState(UiState.Displaying.copy$default(displaying3, null, null, null, null, null, new UiState.PendingAction.VerifyReusablePersona(verifyPersonaButtonComponent2, map), false, null, null, null, false, null, 0, 65407));
                        break;
                    default:
                        CreatePersonaSheetComponent createPersonaSheetComponent2 = (CreatePersonaSheetComponent) obj2;
                        UiComponent uiComponent = (UiComponent) obj3;
                        createPersonaSheetComponent2.getClass();
                        uiComponent.getClass();
                        UiState.Displaying displaying4 = (UiState.Displaying) uiState2;
                        List list8 = displaying4.components;
                        ButtonComponent buttonComponent2 = uiComponent instanceof ButtonComponent ? (ButtonComponent) uiComponent : null;
                        if (buttonComponent2 != null) {
                            buttonComponent2.setWasTapped(true);
                        }
                        uiStepStateManager3.updateState(UiState.Displaying.copy$default(displaying4, UiComponentKt.updateComponent(list8, createPersonaSheetComponent2, CreatePersonaSheetComponentKt.updateComponent(createPersonaSheetComponent2, uiComponent, uiComponent)), null, null, null, null, new UiState.PendingAction.CreateReusablePersona(createPersonaSheetComponent2), false, null, null, null, false, null, 0, 65406));
                        break;
                }
                return Unit.INSTANCE;
            }
        }, z7, uiStepStyle2, str272, new Function0(uiStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$$ExternalSyntheticLambda3
            public final /* synthetic */ UiStepStateManager f$0;

            {
                this.f$0 = uiStepStateManager2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i10 = i62;
                UiState uiState2 = uiState;
                UiStepStateManager uiStepStateManager3 = this.f$0;
                switch (i10) {
                    case 0:
                        uiStepStateManager3.updateState(UiState.Displaying.copy$default((UiState.Displaying) uiState2, null, null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.JPEG_APP15_MARKER));
                        break;
                    case 1:
                        uiStepStateManager3.updateState(UiState.Displaying.copy$default((UiState.Displaying) uiState2, null, null, null, null, null, null, false, null, null, null, false, null, 0, 57343));
                        break;
                    default:
                        TrackingEventsLogger.DefaultImpls.logUiStepButtonEvent$default(uiStepStateManager3.trackingEventsLogger, UiStepButtonType.Complete, null, ((UiState.Displaying) uiState2).stepName, false, 10, null);
                        uiStepStateManager3.setOutput(UiWorkflow.Output.Completed.INSTANCE);
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new Function2(uiStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$$ExternalSyntheticLambda2
            public final /* synthetic */ UiStepStateManager f$0;

            {
                this.f$0 = uiStepStateManager2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i10 = i82;
                UiState uiState2 = uiState;
                UiStepStateManager uiStepStateManager3 = this.f$0;
                switch (i10) {
                    case 0:
                        InputAddressComponent inputAddressComponent = (InputAddressComponent) obj2;
                        String str28 = (String) obj3;
                        inputAddressComponent.getClass();
                        str28.getClass();
                        UiState.Displaying displaying2 = (UiState.Displaying) uiState2;
                        uiStepStateManager3.updateState(UiState.Displaying.copy$default(displaying2, UiComponentKt.updateComponent(displaying2.components, inputAddressComponent, inputAddressComponent.updateSelectedSearchResultId(str28).updateIsAddressAutocompleteLoading(Boolean.TRUE)), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER));
                        break;
                    case 1:
                        VerifyPersonaButtonComponent verifyPersonaButtonComponent2 = (VerifyPersonaButtonComponent) obj2;
                        Map map = (Map) obj3;
                        verifyPersonaButtonComponent2.getClass();
                        map.getClass();
                        UiState.Displaying displaying3 = (UiState.Displaying) uiState2;
                        UiStepStateManager.recurse(displaying3.components, new UiWorkflow$$ExternalSyntheticLambda9(true, verifyPersonaButtonComponent2, 1));
                        uiStepStateManager3.updateState(UiState.Displaying.copy$default(displaying3, null, null, null, null, null, new UiState.PendingAction.VerifyReusablePersona(verifyPersonaButtonComponent2, map), false, null, null, null, false, null, 0, 65407));
                        break;
                    default:
                        CreatePersonaSheetComponent createPersonaSheetComponent2 = (CreatePersonaSheetComponent) obj2;
                        UiComponent uiComponent = (UiComponent) obj3;
                        createPersonaSheetComponent2.getClass();
                        uiComponent.getClass();
                        UiState.Displaying displaying4 = (UiState.Displaying) uiState2;
                        List list8 = displaying4.components;
                        ButtonComponent buttonComponent2 = uiComponent instanceof ButtonComponent ? (ButtonComponent) uiComponent : null;
                        if (buttonComponent2 != null) {
                            buttonComponent2.setWasTapped(true);
                        }
                        uiStepStateManager3.updateState(UiState.Displaying.copy$default(displaying4, UiComponentKt.updateComponent(list8, createPersonaSheetComponent2, CreatePersonaSheetComponentKt.updateComponent(createPersonaSheetComponent2, uiComponent, uiComponent)), null, null, null, null, new UiState.PendingAction.CreateReusablePersona(createPersonaSheetComponent2), false, null, null, null, false, null, 0, 65406));
                        break;
                }
                return Unit.INSTANCE;
            }
        }, helpBottomSheetComponent == null ? ((GovernmentIdNfcScanComponent) helpBottomSheetComponent).getViewModel() : null, z8, new Function0(uiStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$$ExternalSyntheticLambda3
            public final /* synthetic */ UiStepStateManager f$0;

            {
                this.f$0 = uiStepStateManager2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i10 = i92;
                UiState uiState2 = uiState;
                UiStepStateManager uiStepStateManager3 = this.f$0;
                switch (i10) {
                    case 0:
                        uiStepStateManager3.updateState(UiState.Displaying.copy$default((UiState.Displaying) uiState2, null, null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.JPEG_APP15_MARKER));
                        break;
                    case 1:
                        uiStepStateManager3.updateState(UiState.Displaying.copy$default((UiState.Displaying) uiState2, null, null, null, null, null, null, false, null, null, null, false, null, 0, 57343));
                        break;
                    default:
                        TrackingEventsLogger.DefaultImpls.logUiStepButtonEvent$default(uiStepStateManager3.trackingEventsLogger, UiStepButtonType.Complete, null, ((UiState.Displaying) uiState2).stepName, false, 10, null);
                        uiStepStateManager3.setOutput(UiWorkflow.Output.Completed.INSTANCE);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        DefaultScheduler defaultScheduler2 = Dispatchers.Default;
        Object withContext2 = JobKt.withContext(MainDispatcherLoader.dispatcher, new RxConvertKt$asFlow$1(uiStepStateManager2, entryScreen2, null, 4), continuation);
        if (withContext2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
        }
    }

    public static void recurse(List list, Function1 function1) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UiComponent uiComponent = (UiComponent) it.next();
            if (uiComponent instanceof UiComponentGroup) {
                recurse(((UiComponentGroup) uiComponent).getChildren(), new ViewGroups$$ExternalSyntheticLambda0(21, function1));
            } else {
                function1.invoke(uiComponent);
            }
        }
    }

    public final void handleLaunchNfcScan(GovernmentIdNfcScanComponent governmentIdNfcScanComponent, UiState.Displaying displaying) {
        recurse(displaying.components, new UiWorkflow$$ExternalSyntheticLambda9(true, governmentIdNfcScanComponent, 1));
        updateState(UiState.Displaying.copy$default(displaying, null, null, null, new UiState.Displaying.NfcScan(governmentIdNfcScanComponent), null, null, false, null, null, null, false, null, 0, 57311));
    }

    public final void outputSubmit(UiState.Displaying displaying) {
        UiComponent uiComponent = displaying.triggeringComponent;
        Map map = displaying.componentParams;
        if (uiComponent == null || map == null) {
            return;
        }
        setOutput(new UiWorkflow.Output.FinishedWithoutTransition(uiComponent, map, displaying.stepName));
    }
}
