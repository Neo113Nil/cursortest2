package kotlinx.coroutines.flow;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.webkit.MimeTypeMap;
import androidx.credentials.Credential;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.behavior.HideLeftViewOnScrollDelegate;
import com.google.common.io.Files;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import com.withpersona.sdk2.camera.ParsedIdSideOrNone;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.camera.selfie.SelfieFrameInfo;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.network.DocumentStepData;
import com.withpersona.sdk2.inquiry.governmentid.DocumentSelectWorker;
import com.withpersona.sdk2.inquiry.governmentid.DocumentSelectWorker$run$$inlined$map$1$2$1;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2$1;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdDetails;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.network.AutocaptureState;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdStepData;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepStateManager;
import com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl;
import com.withpersona.sdk2.inquiry.internal.ErrorReportingManager;
import com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportErrors$1;
import com.withpersona.sdk2.inquiry.internal.InquiryFieldsMap;
import com.withpersona.sdk2.inquiry.internal.InquiryFragment;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.cancel.CancelDialogFragment;
import com.withpersona.sdk2.inquiry.internal.network.InquiryService;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$$ExternalSyntheticLambda17;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$$ExternalSyntheticLambda3;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$$ExternalSyntheticLambda9;
import com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment;
import com.withpersona.sdk2.inquiry.launchers.DocumentSelectLauncherResult;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker;
import com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1;
import com.withpersona.sdk2.inquiry.selfie.SelfieKt;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.network.SelfieStepData;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager;
import com.withpersona.sdk2.inquiry.shared.data_collection.RealDataCollector;
import com.withpersona.sdk2.inquiry.shared.data_collection.StepData;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryEndReason;
import com.withpersona.sdk2.inquiry.types.collected_data.CollectedData;
import com.withpersona.sdk2.inquiry.types.collected_data.CollectedGovernmentIdDetails;
import com.withpersona.sdk2.inquiry.types.collected_data.GovernmentIdCapture;
import com.withpersona.sdk2.inquiry.types.collected_data.StepData;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.ui.network.UiStepData;
import com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment;
import com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$WorkflowWorkerWithHandler;
import dagger.internal.Preconditions;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.ByteStreamsKt;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.InterruptibleKt$runInterruptible$2;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.CombineKt;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.FormBody;
import okio.Utf8;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class FlowKt__MergeKt$flatMapMerge$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $this_unsafeTransform$inlined;
    public final /* synthetic */ Object $transform$inlined$1;

    public /* synthetic */ FlowKt__MergeKt$flatMapMerge$$inlined$map$1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = obj;
        this.$transform$inlined$1 = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:9|(2:11|(10:13|14|15|(1:(1:(1:(5:20|21|22|23|24)(2:29|30))(2:31|32))(2:33|34))(2:46|47)|35|36|37|(3:39|23|24)|40|41))|54|14|15|(0)(0)|35|36|37|(0)|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0081, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r6).collect(r12, r0) == r13) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x006f, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ab, code lost:
    
        r11 = new kotlinx.coroutines.flow.ThrowingCollector(r11);
        r0.L$2 = null;
        r0.L$3 = r11;
        r0.I$0 = r1;
        r0.label = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bc, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.access$invokeSafely$FlowKt__EmittersKt(r11, r5, r11, r0) != r13) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        throw r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0072  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        SafeCollector safeCollector;
        SafeCollector safeCollector2;
        Throwable th;
        int i2 = this.$r8$classId;
        int i3 = 0;
        int i4 = 1;
        int i5 = 2;
        Continuation continuation2 = null;
        Object obj = this.$transform$inlined$1;
        Object obj2 = this.$this_unsafeTransform$inlined;
        switch (i2) {
            case 0:
                Object collect = ((StartedLazily$command$$inlined$unsafeFlow$1) obj2).collect(new AnonymousClass2(i3, flowCollector, (CheckStatusPresenter.AnonymousClass1.C00611) obj), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
            case 1:
                Object collect2 = ((DocumentSelectLauncherResult) obj2).collect(new AnonymousClass2(i4, flowCollector, (DocumentSelectWorker) obj), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : Unit.INSTANCE;
            case 2:
                Object collect3 = ((Flow) obj2).collect(new AnonymousClass2(i5, flowCollector, (GovernmentIdAnalyzeWorker) obj), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : Unit.INSTANCE;
            case 3:
                Object collect4 = ((FlowKt__LimitKt$drop$$inlined$unsafeFlow$1) obj2).collect(new AnonymousClass2(7, flowCollector, (SelfieAnalyzeWorker) obj), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : Unit.INSTANCE;
            case 4:
                Function3 function3 = (Function3) obj;
                try {
                    if (continuation instanceof FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) {
                        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 = (FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) continuation;
                        int i6 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label;
                        if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label = i6 - PKIFailureInfo.systemUnavail;
                            Object obj3 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.result;
                            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$2 = flowCollector;
                                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.I$0 = 0;
                                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label = 1;
                                break;
                            } else {
                                if (i != 1) {
                                    if (i == 2) {
                                        Throwable th2 = (Throwable) flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$3;
                                        SafeTrace.throwOnFailure(obj3);
                                        throw th2;
                                    }
                                    if (i != 3) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    safeCollector2 = (SafeCollector) flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$3;
                                    try {
                                        SafeTrace.throwOnFailure(obj3);
                                        safeCollector2.releaseIntercepted();
                                        return Unit.INSTANCE;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        safeCollector2.releaseIntercepted();
                                        throw th;
                                    }
                                }
                                i3 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.I$0;
                                flowCollector = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$2;
                                SafeTrace.throwOnFailure(obj3);
                            }
                            safeCollector = new SafeCollector(flowCollector, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.getContext());
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$2 = null;
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$3 = safeCollector;
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.I$0 = i3;
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label = 3;
                            if (function3.invoke(safeCollector, null, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) != coroutineSingletons) {
                                safeCollector2 = safeCollector;
                                safeCollector2.releaseIntercepted();
                                return Unit.INSTANCE;
                            }
                            return coroutineSingletons;
                        }
                    }
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$2 = null;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$3 = safeCollector;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.I$0 = i3;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label = 3;
                    if (function3.invoke(safeCollector, null, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                } catch (Throwable th4) {
                    safeCollector2 = safeCollector;
                    th = th4;
                    safeCollector2.releaseIntercepted();
                    throw th;
                }
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 = new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1(this, continuation);
                Object obj32 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label;
                if (i != 0) {
                }
                safeCollector = new SafeCollector(flowCollector, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.getContext());
            default:
                Object combineInternal = CombineKt.combineInternal(continuation, FlowKt__ZipKt$nullArrayFactory$1.INSTANCE, new FlowExtensionsKt$combine$$inlined$combine$1.AnonymousClass3(continuation2, (Function5) obj, 11), flowCollector, (Flow[]) obj2);
                return combineInternal == CoroutineSingletons.COROUTINE_SUSPENDED ? combineInternal : Unit.INSTANCE;
        }
    }

    /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object $this_unsafeFlow;
        public final /* synthetic */ Object $transform$inlined;

        /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public int I$0;
            public FlowCollector L$4;
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= PKIFailureInfo.systemUnavail;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(Function3 function3, FlowCollector flowCollector) {
            this.$r8$classId = 12;
            this.$transform$inlined = function3;
            this.$this_unsafeFlow = flowCollector;
        }

        /* JADX WARN: Code restructure failed: missing block: B:102:0x01f2, code lost:
        
            if (r0.emit(r6, r4) == r2) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:497:0x0905, code lost:
        
            if (r1.emit(r0, r3) != r2) goto L444;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:101:0x01e8  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:190:0x05a0  */
        /* JADX WARN: Removed duplicated region for block: B:193:0x05a3 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:385:0x0700  */
        /* JADX WARN: Removed duplicated region for block: B:392:0x070e  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:429:0x07f7  */
        /* JADX WARN: Removed duplicated region for block: B:436:0x0805  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:485:0x08c8  */
        /* JADX WARN: Removed duplicated region for block: B:500:0x08e0  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x01d9  */
        /* JADX WARN: Type inference failed for: r10v1, types: [com.squareup.cash.history.presenters.CheckStatusPresenter$1$1] */
        /* JADX WARN: Type inference failed for: r10v33, types: [kotlin.jvm.functions.Function3] */
        /* JADX WARN: Type inference failed for: r11v19, types: [kotlin.jvm.functions.Function2] */
        /* JADX WARN: Type inference failed for: r13v10, types: [com.withpersona.sdk2.inquiry.types.collected_data.SelfieCapture] */
        /* JADX WARN: Type inference failed for: r13v19 */
        /* JADX WARN: Type inference failed for: r13v9 */
        /* JADX WARN: Type inference failed for: r14v17 */
        /* JADX WARN: Type inference failed for: r14v7 */
        /* JADX WARN: Type inference failed for: r14v8, types: [com.withpersona.sdk2.inquiry.types.collected_data.SelfieCapture] */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.withpersona.sdk2.camera.selfie.SelfieFrameInfo, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v25, types: [android.os.Parcelable] */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v59 */
        /* JADX WARN: Type inference failed for: r2v60 */
        /* JADX WARN: Type inference failed for: r4v23, types: [android.os.BaseBundle, android.os.Bundle] */
        /* JADX WARN: Type inference failed for: r8v32 */
        /* JADX WARN: Type inference failed for: r8v33, types: [com.withpersona.sdk2.inquiry.types.collected_data.SelfieCapture] */
        /* JADX WARN: Type inference failed for: r8v44 */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            FlowCollector flowCollector;
            DocumentSelectWorker$run$$inlined$map$1$2$1 documentSelectWorker$run$$inlined$map$1$2$1;
            int i2;
            Object obj2;
            GovernmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2$1 governmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2$1;
            int i3;
            Result result;
            Continuation continuation2;
            Iterator it;
            Object obj3;
            Object documentFile;
            CollectedGovernmentIdDetails collectedGovernmentIdDetails;
            Date date;
            GovernmentIdCapture.Side side;
            GovernmentIdCapture.CaptureMethod captureMethod;
            SelfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1 selfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1;
            int i4;
            FlowCollector flowCollector2;
            SelfieFrameInfo selfieFrameInfo;
            Object selfieDetectionError;
            FlowCollector flowCollector3;
            Object selfieDetectionError2;
            Credential credential;
            FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1;
            Object obj4;
            int i5;
            FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1;
            Object obj5;
            int i6;
            Object obj6;
            ?? r1 = obj;
            int i7 = this.$r8$classId;
            int i8 = 2;
            int i9 = 0;
            int i10 = 1;
            Object obj7 = this.$transform$inlined;
            Object obj8 = this.$this_unsafeFlow;
            switch (i7) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i11 - PKIFailureInfo.systemUnavail;
                            Object obj9 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj9);
                                FlowCollector flowCollector4 = (FlowCollector) obj8;
                                anonymousClass1.L$4 = flowCollector4;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object invoke = ((CheckStatusPresenter.AnonymousClass1.C00611) obj7).invoke(r1, anonymousClass1);
                                if (invoke != coroutineSingletons) {
                                    flowCollector = flowCollector4;
                                    obj9 = invoke;
                                }
                                return coroutineSingletons;
                            }
                            if (i != 1) {
                                if (i == 2) {
                                    SafeTrace.throwOnFailure(obj9);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i9 = anonymousClass1.I$0;
                            flowCollector = anonymousClass1.L$4;
                            SafeTrace.throwOnFailure(obj9);
                            anonymousClass1.L$4 = null;
                            anonymousClass1.I$0 = i9;
                            anonymousClass1.label = 2;
                            break;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj92 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    anonymousClass1.L$4 = null;
                    anonymousClass1.I$0 = i9;
                    anonymousClass1.label = 2;
                case 1:
                    DocumentSelectWorker documentSelectWorker = (DocumentSelectWorker) obj7;
                    Context context = documentSelectWorker.context;
                    if (continuation instanceof DocumentSelectWorker$run$$inlined$map$1$2$1) {
                        documentSelectWorker$run$$inlined$map$1$2$1 = (DocumentSelectWorker$run$$inlined$map$1$2$1) continuation;
                        int i12 = documentSelectWorker$run$$inlined$map$1$2$1.label;
                        if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                            documentSelectWorker$run$$inlined$map$1$2$1.label = i12 - PKIFailureInfo.systemUnavail;
                            Object obj10 = documentSelectWorker$run$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = documentSelectWorker$run$$inlined$map$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj10);
                                FlowCollector flowCollector5 = (FlowCollector) obj8;
                                Uri uri = (Uri) r1;
                                if (uri != null) {
                                    String type2 = context.getContentResolver().getType(uri);
                                    Cursor query = context.getContentResolver().query(uri, null, null, null, null);
                                    if (query != null) {
                                        query.moveToFirst();
                                    }
                                    String string2 = query != null ? query.getString(Math.max(query.getColumnIndex("_display_name"), 0)) : null;
                                    if (query != null) {
                                        query.close();
                                    }
                                    String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type2);
                                    if (extensionFromMimeType == null) {
                                        extensionFromMimeType = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
                                    }
                                    SdkFilesManager sdkFilesManager = documentSelectWorker.sdkFilesManager;
                                    extensionFromMimeType.getClass();
                                    File newRandomSessionFile = sdkFilesManager.newRandomSessionFile(extensionFromMimeType);
                                    InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                                    openInputStream.getClass();
                                    FileOutputStream fileOutputStream = new FileOutputStream(newRandomSessionFile);
                                    try {
                                        try {
                                            ByteStreamsKt.copyTo$default(openInputStream, fileOutputStream);
                                            openInputStream.close();
                                            fileOutputStream.close();
                                            String absolutePath = newRandomSessionFile.getAbsolutePath();
                                            absolutePath.getClass();
                                            obj2 = new DocumentSelectWorker.Output.Success(absolutePath, string2);
                                        } finally {
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            Utf8.closeFinally(fileOutputStream, th);
                                            throw th2;
                                        }
                                    }
                                } else {
                                    obj2 = DocumentSelectWorker.Output.Cancel.INSTANCE;
                                }
                                documentSelectWorker$run$$inlined$map$1$2$1.label = 1;
                                if (flowCollector5.emit(obj2, documentSelectWorker$run$$inlined$map$1$2$1) == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                            } else {
                                if (i2 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj10);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    documentSelectWorker$run$$inlined$map$1$2$1 = new DocumentSelectWorker$run$$inlined$map$1$2$1(this, continuation);
                    Object obj102 = documentSelectWorker$run$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = documentSelectWorker$run$$inlined$map$1$2$1.label;
                    if (i2 != 0) {
                    }
                    return Unit.INSTANCE;
                case 2:
                    GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker = (GovernmentIdAnalyzeWorker) obj7;
                    if (continuation instanceof GovernmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2$1) {
                        governmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2$1 = (GovernmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2$1) continuation;
                        int i13 = governmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.label;
                        if ((i13 & PKIFailureInfo.systemUnavail) != 0) {
                            governmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.label = i13 - PKIFailureInfo.systemUnavail;
                            Object obj11 = governmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.result;
                            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = governmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.label;
                            if (i3 != 0) {
                                SafeTrace.throwOnFailure(obj11);
                                FlowCollector flowCollector6 = (FlowCollector) obj8;
                                Object obj12 = ((Result) r1).value;
                                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj12);
                                if (m4120exceptionOrNullimpl == null) {
                                    ParsedIdSideOrNone parsedIdSideOrNone = (ParsedIdSideOrNone) obj12;
                                    if (parsedIdSideOrNone instanceof ParsedIdSideOrNone.ParsedIdSide) {
                                        ParsedIdSideOrNone.ParsedIdSide parsedIdSide = (ParsedIdSideOrNone.ParsedIdSide) parsedIdSideOrNone;
                                        ImageIdMetadata imageIdMetadata = parsedIdSide.metadata;
                                        if (imageIdMetadata != null) {
                                            AutocaptureState autocaptureState = governmentIdAnalyzeWorker.autocaptureState;
                                            autocaptureState.getClass();
                                            ArrayList plus = CollectionsKt.plus((Collection) CollectionsKt.takeLast(2, autocaptureState.previousFramesMetadata), (Object) imageIdMetadata);
                                            governmentIdAnalyzeWorker.autocaptureState = new AutocaptureState(plus);
                                            if (plus.size() >= 3) {
                                                ArrayList<ImageIdMetadata> arrayList = plus;
                                                Iterator it2 = arrayList.iterator();
                                                while (it2.hasNext()) {
                                                    i9 += ((ImageIdMetadata) it2.next()).textOnImage.length();
                                                }
                                                double size = i9 / plus.size();
                                                double d = 0.0d;
                                                for (ImageIdMetadata imageIdMetadata2 : arrayList) {
                                                    d += (imageIdMetadata2.textOnImage.length() - size) * (imageIdMetadata2.textOnImage.length() - size);
                                                }
                                                if (Math.sqrt(d / plus.size()) / size < 0.05d) {
                                                    result = new Result(GovernmentIdAnalyzeWorker.m4093access$createGovernmentIdIoAF18A(governmentIdAnalyzeWorker, parsedIdSide));
                                                }
                                            }
                                        } else {
                                            result = new Result(GovernmentIdAnalyzeWorker.m4093access$createGovernmentIdIoAF18A(governmentIdAnalyzeWorker, parsedIdSide));
                                        }
                                    }
                                    result = null;
                                } else {
                                    result = new Result(new Result.Failure(m4120exceptionOrNullimpl));
                                }
                                if (result != null) {
                                    governmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.label = 1;
                                    if (flowCollector6.emit(result, governmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2$1) == coroutineSingletons4) {
                                        return coroutineSingletons4;
                                    }
                                }
                            } else {
                                if (i3 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj11);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    governmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2$1 = new GovernmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj112 = governmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.result;
                    CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = governmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.label;
                    if (i3 != 0) {
                    }
                    return Unit.INSTANCE;
                case 3:
                    GovernmentIdWorkflow.Output output = (GovernmentIdWorkflow.Output) r1;
                    GovernmentIdStepFragment governmentIdStepFragment = (GovernmentIdStepFragment) obj8;
                    if (output == null) {
                        return Unit.INSTANCE;
                    }
                    if (governmentIdStepFragment.currentOutputHandler != null) {
                        ((StateFlowImpl) ((GovernmentIdStepStateManager) obj7).prev).setValue(null);
                        InquiryStateManager$$ExternalSyntheticLambda3 inquiryStateManager$$ExternalSyntheticLambda3 = governmentIdStepFragment.currentOutputHandler;
                        if (inquiryStateManager$$ExternalSyntheticLambda3 != null) {
                            inquiryStateManager$$ExternalSyntheticLambda3.invoke(output);
                        }
                    }
                    return Unit.INSTANCE;
                case 4:
                    IntegrationWorkflow.Output output2 = (IntegrationWorkflow.Output) r1;
                    IntegrationStepFragment integrationStepFragment = (IntegrationStepFragment) obj8;
                    if (output2 == null) {
                        return Unit.INSTANCE;
                    }
                    if (integrationStepFragment.currentOutputHandler != null) {
                        ((StateFlowImpl) ((IntegrationStepStateManager) obj7).prev).setValue(null);
                        InquiryStateManager$$ExternalSyntheticLambda7 inquiryStateManager$$ExternalSyntheticLambda7 = integrationStepFragment.currentOutputHandler;
                        if (inquiryStateManager$$ExternalSyntheticLambda7 != null) {
                            inquiryStateManager$$ExternalSyntheticLambda7.invoke(output2);
                        }
                    }
                    return Unit.INSTANCE;
                case 5:
                    InquiryWorkflow$Output inquiryWorkflow$Output = (InquiryWorkflow$Output) r1;
                    if (inquiryWorkflow$Output == null) {
                        return Unit.INSTANCE;
                    }
                    Continuation continuation3 = null;
                    ((StateFlowImpl) ((InquiryStateManager) obj8).prev).setValue(null);
                    Fragment parentFragment = ((InquiryWorkflowFragment) obj7).getParentFragment();
                    parentFragment.getClass();
                    InquiryFragment inquiryFragment = (InquiryFragment) parentFragment;
                    DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = inquiryFragment.getViewModel$1().component;
                    if (daggerInquiryComponent$InquiryComponentImpl != null) {
                        long currentTimeMillis = System.currentTimeMillis() - inquiryFragment.getViewModel$1().inquiryStartTimeMs;
                        boolean z = inquiryWorkflow$Output instanceof InquiryWorkflow$Output.Complete;
                        if (z || (inquiryWorkflow$Output instanceof InquiryWorkflow$Output.ReinitializeWithFallbackMode)) {
                            TrackingEventsLogger.DefaultImpls.logInquiryEndEvent$default(daggerInquiryComponent$InquiryComponentImpl.trackingEventsLogger(), z ? InquiryEndReason.Complete : InquiryEndReason.Fallback, currentTimeMillis, null, false, 12, null);
                        } else if (inquiryWorkflow$Output instanceof InquiryWorkflow$Output.Error) {
                            TrackingEventsLogger.DefaultImpls.logInquiryEndEvent$default(daggerInquiryComponent$InquiryComponentImpl.trackingEventsLogger(), InquiryEndReason.Error, currentTimeMillis, ((InquiryWorkflow$Output.Error) inquiryWorkflow$Output).debugMessage, false, 8, null);
                        } else if (!(inquiryWorkflow$Output instanceof InquiryWorkflow$Output.Cancel)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        String sessionToken = inquiryWorkflow$Output.getSessionToken();
                        if (sessionToken != null) {
                            ErrorReportingManager errorReportingManager = (ErrorReportingManager) daggerInquiryComponent$InquiryComponentImpl.errorReportingManagerProvider.get();
                            errorReportingManager.getClass();
                            ContextScope contextScope = errorReportingManager.coroutineScope;
                            DefaultScheduler defaultScheduler = Dispatchers.Default;
                            JobKt.launch$default(contextScope, DefaultIoScheduler.INSTANCE, null, new ErrorReportingManager$reportErrors$1(errorReportingManager, sessionToken, continuation3, i9), 2);
                        }
                        SdkFilesManager sdkFilesManager2 = inquiryFragment.getViewModel$1().sdkFilesManager;
                        FilesKt__UtilsKt.deleteRecursively(sdkFilesManager2.sessionDir);
                        FilesKt__UtilsKt.deleteRecursively(sdkFilesManager2.sessionCacheDir);
                        FormBody.Builder builder = daggerInquiryComponent$InquiryComponentImpl.inquiryActivityModule;
                        if (((Context) builder.values) == null) {
                            ((Application) builder.names).getApplicationContext().getClass();
                        }
                        ((InquiryService) daggerInquiryComponent$InquiryComponentImpl.inquiryServiceProvider.get()).getClass();
                        DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                        Preconditions.checkNotNullFromProvides(defaultIoScheduler);
                        JobKt.CoroutineScope(defaultIoScheduler.plus(JobKt.SupervisorJob$default()));
                        if (z) {
                            InquiryWorkflow$Output.Complete complete = (InquiryWorkflow$Output.Complete) inquiryWorkflow$Output;
                            String str = complete.redirectUri;
                            if (str != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                                    Context context2 = inquiryFragment.getContext();
                                    if (context2 != null) {
                                        context2.startActivity(intent);
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            String requestKey = inquiryFragment.getArgs$1().getRequestKey();
                            ?? bundle = new Bundle();
                            bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_COMPLETE");
                            bundle.putString("INQUIRY_ID_KEY", complete.inquiryId);
                            bundle.putString("INQUIRY_STATUS_KEY", complete.inquiryStatus);
                            bundle.putParcelable("FIELDS_MAP_KEY", new InquiryFieldsMap(complete.fields));
                            RealDataCollector realDataCollector = inquiryFragment.getViewModel$1().dataCollector;
                            realDataCollector.getClass();
                            ArrayList arrayList2 = new ArrayList(realDataCollector.collectedData);
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                StepData stepData = (StepData) it3.next();
                                stepData.getClass();
                                if (stepData instanceof UiStepData) {
                                    UiStepData uiStepData = (UiStepData) stepData;
                                    Parcel obtain = Parcel.obtain();
                                    obtain.getClass();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    for (Map.Entry entry : uiStepData.componentParams.entrySet()) {
                                        String str2 = (String) entry.getKey();
                                        try {
                                            Object value = Files.toValue((ComponentParam) entry.getValue());
                                            obtain.writeValue(value);
                                            linkedHashMap.put(str2, value);
                                        } catch (RuntimeException unused2) {
                                        }
                                    }
                                    obtain.recycle();
                                    obj3 = new StepData.UiStepData(uiStepData.stepName, linkedHashMap);
                                } else if (stepData instanceof SelfieStepData) {
                                    SelfieStepData selfieStepData = (SelfieStepData) stepData;
                                    String str3 = selfieStepData.stepName;
                                    Selfie selfie = selfieStepData.centerCapture;
                                    obj3 = new StepData.SelfieStepData(str3, selfie != null ? HideLeftViewOnScrollDelegate.to(selfie) : continuation3, selfie != null ? HideLeftViewOnScrollDelegate.to(selfie) : continuation3, selfie != null ? HideLeftViewOnScrollDelegate.to(selfie) : continuation3);
                                } else if (stepData instanceof GovernmentIdStepData) {
                                    GovernmentIdStepData governmentIdStepData = (GovernmentIdStepData) stepData;
                                    String str4 = governmentIdStepData.stepName;
                                    List<GovernmentId> list = governmentIdStepData.ids;
                                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                    for (GovernmentId governmentId : list) {
                                        String idClassKey = governmentId.getIdClassKey();
                                        int ordinal = governmentId.getSide().ordinal();
                                        if (ordinal == 0) {
                                            side = GovernmentIdCapture.Side.Front;
                                        } else if (ordinal == i10) {
                                            side = GovernmentIdCapture.Side.Back;
                                        } else if (ordinal == i8) {
                                            side = GovernmentIdCapture.Side.FrontAndBack;
                                        } else {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                        }
                                        int ordinal2 = governmentId.getCaptureMethod().ordinal();
                                        if (ordinal2 == 0) {
                                            captureMethod = GovernmentIdCapture.CaptureMethod.Auto;
                                        } else if (ordinal2 == i10) {
                                            captureMethod = GovernmentIdCapture.CaptureMethod.Manual;
                                        } else if (ordinal2 == i8) {
                                            captureMethod = GovernmentIdCapture.CaptureMethod.Upload;
                                        } else {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                        }
                                        List<Frame> frames = governmentId.getFrames();
                                        ArrayList arrayList5 = new ArrayList();
                                        for (Frame frame : frames) {
                                            Iterator it4 = it3;
                                            List list2 = list;
                                            File file = new File(frame.absoluteFilePath);
                                            GovernmentIdCapture.Frame frame2 = file.exists() ? new GovernmentIdCapture.Frame(file, frame.mimeType) : null;
                                            if (frame2 != null) {
                                                arrayList5.add(frame2);
                                            }
                                            it3 = it4;
                                            list = list2;
                                        }
                                        arrayList4.add(new GovernmentIdCapture(idClassKey, side, captureMethod, arrayList5));
                                        i8 = 2;
                                        i10 = 1;
                                    }
                                    it = it3;
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj13 : list) {
                                        if (obj13 instanceof GovernmentId.GovernmentIdImage) {
                                            arrayList6.add(obj13);
                                        }
                                    }
                                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, 10));
                                    Iterator it5 = arrayList6.iterator();
                                    while (it5.hasNext()) {
                                        arrayList7.add(((GovernmentId.GovernmentIdImage) it5.next()).idDetails);
                                    }
                                    Iterator it6 = arrayList7.iterator();
                                    while (true) {
                                        if (it6.hasNext()) {
                                            GovernmentIdDetails governmentIdDetails = (GovernmentIdDetails) it6.next();
                                            if ((governmentIdDetails != null ? governmentIdDetails.dateOfBirth : null) != null && (date = governmentIdDetails.expirationDate) != null) {
                                                collectedGovernmentIdDetails = new CollectedGovernmentIdDetails(governmentIdDetails.dateOfBirth, date);
                                                continuation2 = null;
                                            }
                                        } else {
                                            continuation2 = null;
                                            collectedGovernmentIdDetails = new CollectedGovernmentIdDetails(null, null);
                                        }
                                    }
                                    obj3 = new StepData.GovernmentIdStepData(str4, arrayList4, collectedGovernmentIdDetails);
                                    if (obj3 != null) {
                                        arrayList3.add(obj3);
                                    }
                                    it3 = it;
                                    continuation3 = continuation2;
                                    i8 = 2;
                                    i10 = 1;
                                } else {
                                    continuation2 = continuation3;
                                    it = it3;
                                    if (stepData instanceof DocumentStepData) {
                                        DocumentStepData documentStepData = (DocumentStepData) stepData;
                                        String str5 = documentStepData.stepName;
                                        List<DocumentFile> list3 = documentStepData.documents;
                                        ArrayList arrayList8 = new ArrayList();
                                        for (DocumentFile documentFile2 : list3) {
                                            if (documentFile2 instanceof DocumentFile.Local) {
                                                documentFile = new com.withpersona.sdk2.inquiry.types.collected_data.DocumentFile(new File(((DocumentFile.Local) documentFile2).absoluteFilePath));
                                            } else if (documentFile2 instanceof DocumentFile.Remote) {
                                                String str6 = ((DocumentFile.Remote) documentFile2).absoluteFilePath;
                                                documentFile = str6 != null ? new com.withpersona.sdk2.inquiry.types.collected_data.DocumentFile(new File(str6)) : continuation2;
                                            } else {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                            }
                                            if (documentFile != null) {
                                                arrayList8.add(documentFile);
                                            }
                                        }
                                        obj3 = new StepData.DocumentStepData(str5, arrayList8);
                                    } else {
                                        obj3 = continuation2;
                                    }
                                    if (obj3 != null) {
                                    }
                                    it3 = it;
                                    continuation3 = continuation2;
                                    i8 = 2;
                                    i10 = 1;
                                }
                                continuation2 = continuation3;
                                it = it3;
                                if (obj3 != null) {
                                }
                                it3 = it;
                                continuation3 = continuation2;
                                i8 = 2;
                                i10 = 1;
                            }
                            Continuation continuation4 = continuation3;
                            bundle.putParcelable("COLLECTED_DATA", arrayList3.isEmpty() ? continuation4 : new CollectedData(arrayList3));
                            String str7 = complete.sessionToken;
                            bundle.putString("SESSION_TOKEN_KEY", str7 != null ? StringsKt.substringAfter(str7, "Bearer ", str7) : continuation4);
                            FragmentKt.setFragmentResult(bundle, inquiryFragment, requestKey);
                        } else if (inquiryWorkflow$Output instanceof InquiryWorkflow$Output.ReinitializeWithFallbackMode) {
                            InquiryWorkflow$Output.ReinitializeWithFallbackMode reinitializeWithFallbackMode = (InquiryWorkflow$Output.ReinitializeWithFallbackMode) inquiryWorkflow$Output;
                            inquiryFragment.getViewModel$1().inquiryId.setValue(reinitializeWithFallbackMode.inquiryId);
                            inquiryFragment.getViewModel$1().sessionToken.setValue(reinitializeWithFallbackMode.sessionToken);
                            inquiryFragment.getViewModel$1().savedStateHandle.set(Boolean.TRUE, "force_fallback_mode");
                        } else if (inquiryWorkflow$Output instanceof InquiryWorkflow$Output.Cancel) {
                            InquiryWorkflow$Output.Cancel cancel = (InquiryWorkflow$Output.Cancel) inquiryWorkflow$Output;
                            if (cancel.force) {
                                inquiryFragment.onCancelClick$inquiry_internal_release(cancel);
                            } else {
                                FragmentManager childFragmentManager = inquiryFragment.getChildFragmentManager();
                                childFragmentManager.getClass();
                                int intValue = inquiryFragment.getTheme().intValue();
                                CancelDialogFragment cancelDialogFragment = new CancelDialogFragment();
                                Bundle bundle2 = new Bundle();
                                bundle2.putParcelable("ARGUMENT_CANCEL_OUTPUT", cancel);
                                bundle2.putInt("ARGUMENT_THEME", intValue);
                                cancelDialogFragment.setArguments(bundle2);
                                if (cancel.styles == null) {
                                    cancelDialogFragment.setStyle(0, intValue);
                                }
                                try {
                                    cancelDialogFragment.show(childFragmentManager, "cancel_dialog_fragment");
                                } catch (IllegalStateException unused3) {
                                }
                            }
                        } else if (inquiryWorkflow$Output instanceof InquiryWorkflow$Output.Error) {
                            InquiryWorkflow$Output.Error error = (InquiryWorkflow$Output.Error) inquiryWorkflow$Output;
                            String str8 = error.sessionToken;
                            if (str8 != null) {
                                ErrorReportingManager errorReportingManager2 = (ErrorReportingManager) daggerInquiryComponent$InquiryComponentImpl.errorReportingManagerProvider.get();
                                InternalErrorInfo internalErrorInfo = error.cause;
                                errorReportingManager2.getClass();
                                internalErrorInfo.getClass();
                                JobKt.launch$default(errorReportingManager2.coroutineScope, defaultIoScheduler, null, new Logger$log$1(17, errorReportingManager2, internalErrorInfo, str8, continuation3), 2);
                            }
                            String requestKey2 = inquiryFragment.getArgs$1().getRequestKey();
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
                            bundle3.putString("ERROR_DEBUG_MESSAGE_KEY", error.debugMessage);
                            bundle3.putParcelable("ERROR_CODE_KEY", error.errorCode);
                            FragmentKt.setFragmentResult(bundle3, inquiryFragment, requestKey2);
                        } else {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                        }
                        return null;
                    }
                    return Unit.INSTANCE;
                case 6:
                    PermissionRequestWorkflow.Output output3 = (PermissionRequestWorkflow.Output) r1;
                    PermissionRequestFragment permissionRequestFragment = (PermissionRequestFragment) obj7;
                    if (output3 == null) {
                        return Unit.INSTANCE;
                    }
                    ((StateFlowImpl) ((PermissionRequestStateManager) obj8).prev).setValue(null);
                    Bundle bundle4 = new Bundle();
                    bundle4.putParcelable("pi2_result", new PermissionRequestFragment.PermissionRequestFragmentResult(((PermissionRequestFragment.PermissionRequestFragmentArgs) permissionRequestFragment.args$delegate.getValue()).requestId, output3.permissionState));
                    FragmentKt.setFragmentResult(bundle4, permissionRequestFragment, "pi2_permission_request_request");
                    FragmentManager parentFragmentManager = permissionRequestFragment.getParentFragmentManager();
                    parentFragmentManager.getClass();
                    BackStackRecord backStackRecord = new BackStackRecord(parentFragmentManager);
                    backStackRecord.remove(permissionRequestFragment);
                    backStackRecord.commit();
                    return Unit.INSTANCE;
                case 7:
                    SelfieAnalyzeWorker selfieAnalyzeWorker = (SelfieAnalyzeWorker) obj7;
                    Selfie.Pose pose = selfieAnalyzeWorker.pose;
                    try {
                        if (continuation instanceof SelfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1) {
                            selfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1 = (SelfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1) continuation;
                            int i14 = selfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.label;
                            if ((i14 & PKIFailureInfo.systemUnavail) != 0) {
                                selfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.label = i14 - PKIFailureInfo.systemUnavail;
                                Object obj14 = selfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.result;
                                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i4 = selfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.label;
                                if (i4 != 0) {
                                    SafeTrace.throwOnFailure(obj14);
                                    flowCollector2 = (FlowCollector) obj8;
                                    selfieFrameInfo = (SelfieFrameInfo) r1;
                                    Credential credential2 = selfieFrameInfo.selfiePhoto;
                                    SelfieBrightnessInfo selfieBrightnessInfo = selfieFrameInfo.brightnessInfo;
                                    if (credential2 != null) {
                                        if (SelfieKt.to(credential2) != pose) {
                                            selfieDetectionError = new SelfieAnalyzeWorker.Output.SelfieDetectionError(SelfieError.IncorrectPose, SelfieAnalyzeWorker.access$calculatePoseScore(selfieAnalyzeWorker, selfieFrameInfo, pose), selfieBrightnessInfo);
                                        } else if (selfieAnalyzeWorker.captureOnPoseDetected) {
                                            Object saveSelfie = SelfieKt.saveSelfie(credential2, selfieAnalyzeWorker.sdkFilesManager);
                                            Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(saveSelfie);
                                            if (m4120exceptionOrNullimpl2 == null) {
                                                selfieDetectionError = new SelfieAnalyzeWorker.Output.Detected((Selfie) saveSelfie, selfieBrightnessInfo);
                                            } else {
                                                selfieDetectionError2 = new SelfieAnalyzeWorker.Output.RuntimeError(m4120exceptionOrNullimpl2);
                                                selfieDetectionError = selfieDetectionError2;
                                            }
                                        } else {
                                            selfieDetectionError = new SelfieAnalyzeWorker.Output.Detected(null, selfieBrightnessInfo);
                                        }
                                        credential = selfieFrameInfo.selfiePhoto;
                                        if (credential != null) {
                                            Bitmap bitmap = (Bitmap) credential.data;
                                            if (!bitmap.isRecycled()) {
                                                bitmap.recycle();
                                            }
                                        }
                                        if (selfieDetectionError != null) {
                                            selfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.L$0 = null;
                                            selfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.L$1 = null;
                                            selfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.label = 2;
                                            break;
                                        }
                                    } else {
                                        SelfieError selfieError = selfieFrameInfo.error;
                                        SelfieError selfieError2 = SelfieError.FaceDetectionUnsupported;
                                        if (selfieError == selfieError2) {
                                            int i15 = selfieAnalyzeWorker.numRetries + 1;
                                            selfieAnalyzeWorker.numRetries = i15;
                                            if (i15 >= 6) {
                                                selfieDetectionError2 = new SelfieAnalyzeWorker.Output.SelfieDetectionError(selfieError2, RecyclerView.DECELERATION_RATE, selfieBrightnessInfo);
                                                selfieDetectionError = selfieDetectionError2;
                                                credential = selfieFrameInfo.selfiePhoto;
                                                if (credential != null) {
                                                }
                                                if (selfieDetectionError != null) {
                                                }
                                            } else {
                                                selfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.L$0 = flowCollector2;
                                                selfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.L$1 = selfieFrameInfo;
                                                selfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.label = 1;
                                                if (JobKt.delay(500L, selfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1) == coroutineSingletons5) {
                                                    return coroutineSingletons5;
                                                }
                                                flowCollector3 = flowCollector2;
                                            }
                                        } else {
                                            if (selfieError == null) {
                                                selfieError = SelfieError.Other;
                                            }
                                            selfieDetectionError = new SelfieAnalyzeWorker.Output.SelfieDetectionError(selfieError, SelfieAnalyzeWorker.access$calculatePoseScore(selfieAnalyzeWorker, selfieFrameInfo, pose), selfieBrightnessInfo);
                                            credential = selfieFrameInfo.selfiePhoto;
                                            if (credential != null) {
                                            }
                                            if (selfieDetectionError != null) {
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                                if (i4 != 1) {
                                    if (i4 == 2) {
                                        SafeTrace.throwOnFailure(obj14);
                                        return Unit.INSTANCE;
                                    }
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                selfieFrameInfo = selfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.L$1;
                                flowCollector3 = selfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.L$0;
                                SafeTrace.throwOnFailure(obj14);
                                flowCollector2 = flowCollector3;
                                selfieDetectionError = null;
                                credential = selfieFrameInfo.selfiePhoto;
                                if (credential != null) {
                                }
                                if (selfieDetectionError != null) {
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        if (i4 != 0) {
                        }
                        flowCollector2 = flowCollector3;
                        selfieDetectionError = null;
                        credential = selfieFrameInfo.selfiePhoto;
                        if (credential != null) {
                        }
                        if (selfieDetectionError != null) {
                        }
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        Credential credential3 = r1.selfiePhoto;
                        if (credential3 != null) {
                            Bitmap bitmap2 = (Bitmap) credential3.data;
                            if (!bitmap2.isRecycled()) {
                                bitmap2.recycle();
                            }
                        }
                        throw th3;
                    }
                    selfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1 = new SelfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj142 = selfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.result;
                    CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i4 = selfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1.label;
                case 8:
                    SelfieWorkflow.Output output4 = (SelfieWorkflow.Output) r1;
                    SelfieStepFragment selfieStepFragment = (SelfieStepFragment) obj8;
                    if (output4 == null) {
                        return Unit.INSTANCE;
                    }
                    if (selfieStepFragment.currentOutputHandler != null) {
                        ((StateFlowImpl) ((SelfieStepStateManager) obj7).prev).setValue(null);
                        InquiryStateManager$$ExternalSyntheticLambda17 inquiryStateManager$$ExternalSyntheticLambda17 = selfieStepFragment.currentOutputHandler;
                        if (inquiryStateManager$$ExternalSyntheticLambda17 != null) {
                            inquiryStateManager$$ExternalSyntheticLambda17.invoke(output4);
                        }
                    }
                    return Unit.INSTANCE;
                case 9:
                    Object emit = ((FlowCollector) obj8).emit(((MarkwonConfiguration) obj7).getValue(), continuation);
                    return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : Unit.INSTANCE;
                case 10:
                    UiWorkflow.Output output5 = (UiWorkflow.Output) r1;
                    UiStepFragment uiStepFragment = (UiStepFragment) obj8;
                    if (output5 == null) {
                        return Unit.INSTANCE;
                    }
                    if (uiStepFragment.currentOutputHandler != null) {
                        ((StateFlowImpl) ((UiStepStateManager) obj7).prev).setValue(null);
                        InquiryStateManager$$ExternalSyntheticLambda9 inquiryStateManager$$ExternalSyntheticLambda9 = uiStepFragment.currentOutputHandler;
                        if (inquiryStateManager$$ExternalSyntheticLambda9 != null) {
                            inquiryStateManager$$ExternalSyntheticLambda9.invoke(output5);
                        }
                    }
                    return Unit.INSTANCE;
                case 11:
                    JobKt.launch$default((ContextScope) ((SubtreeManager) obj8).workflowSession, null, null, new InterruptibleKt$runInterruptible$2((WorkflowContextAdapter$WorkflowWorkerWithHandler) obj7, (Object) r1, (Continuation) null), 3);
                    return Unit.INSTANCE;
                case 12:
                    if (continuation instanceof FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1) {
                        flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1 = (FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1) continuation;
                        int i16 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1.label;
                        if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                            flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1.label = i16 - PKIFailureInfo.systemUnavail;
                            obj4 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1.result;
                            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i5 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1.label;
                            if (i5 != 0) {
                                SafeTrace.throwOnFailure(obj4);
                                flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1.label = 1;
                                obj4 = ((Function3) obj7).invoke((FlowCollector) obj8, r1, flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1);
                                if (obj4 == coroutineSingletons6) {
                                    return coroutineSingletons6;
                                }
                            } else {
                                if (i5 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj4);
                            }
                            if (((Boolean) obj4).booleanValue()) {
                                throw new AbortFlowException(this);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1 = new FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1(this, continuation);
                    obj4 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1.result;
                    CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i5 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1.label;
                    if (i5 != 0) {
                    }
                    if (((Boolean) obj4).booleanValue()) {
                    }
                default:
                    if (continuation instanceof FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1) {
                        flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1) continuation;
                        int i17 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.label;
                        if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.label = i17 - PKIFailureInfo.systemUnavail;
                            obj5 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.result;
                            CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i6 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.label;
                            if (i6 != 0) {
                                SafeTrace.throwOnFailure(obj5);
                                flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.L$2 = r1;
                                flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.label = 1;
                                obj5 = ((Function2) obj8).invoke(r1, flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1);
                                obj6 = r1;
                                if (obj5 == coroutineSingletons7) {
                                    return coroutineSingletons7;
                                }
                            } else {
                                if (i6 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                Object obj15 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.L$2;
                                SafeTrace.throwOnFailure(obj5);
                                obj6 = obj15;
                            }
                            if (((Boolean) obj5).booleanValue()) {
                                return Unit.INSTANCE;
                            }
                            ((Ref$ObjectRef) obj7).element = obj6;
                            throw new AbortFlowException(this);
                        }
                    }
                    flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1(this, continuation);
                    obj5 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.result;
                    CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i6 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.label;
                    if (i6 != 0) {
                    }
                    if (((Boolean) obj5).booleanValue()) {
                    }
            }
        }

        public /* synthetic */ AnonymousClass2(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = obj;
            this.$transform$inlined = obj2;
        }
    }
}
