package com.withpersona.sdk2.inquiry.governmentid.network;

import android.content.Context;
import android.util.Size;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.inquiry.device.EmulatorDeviceUtilsKt;
import com.withpersona.sdk2.inquiry.device.RootedDeviceUtilsKt;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector;
import com.withpersona.sdk2.inquiry.shared.image.RealImageHelper;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.types.collected_data.GovernmentIdCapture;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.UnsignedKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$asRequestBody$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker$Response;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "Response", "com/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker_Factory_Impl", "government-id_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SubmitVerificationWorker implements Worker<Response>, WorkflowWorker {
    public final CameraProperties cameraProperties;
    public final RealCameraStatsManager cameraStatsManager;
    public final Context context;
    public final DataCollector dataCollector;
    public final FallbackModeManager fallbackModeManager;
    public final String fromComponent;
    public final String fromStep;
    public final GovernmentIdRequestArguments governmentIdRequestArguments;
    public final RealImageHelper imageHelper;
    public final String inquiryId;
    public final GovernmentIdService service;
    public final String sessionToken;
    public final TrackingEventsLogger trackingEventsLogger;
    public final String webRtcObjectId;

    public abstract class Response {

        public final class Error extends Response {
            public final InternalErrorInfo cause;

            public Error(InternalErrorInfo internalErrorInfo) {
                this.cause = internalErrorInfo;
            }
        }

        public final class FileUploadError extends Response {
            public final GenericFileUploadErrorResponse.DocumentErrorResponse cause;

            public FileUploadError(GenericFileUploadErrorResponse.DocumentErrorResponse documentErrorResponse) {
                documentErrorResponse.getClass();
                this.cause = documentErrorResponse;
            }
        }

        public final class Success extends Response {
            public static final Success INSTANCE = new Success();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public final int hashCode() {
                return 1775834809;
            }

            public final String toString() {
                return "Success";
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraProperties.FacingMode.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GovernmentId.Side.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                GovernmentId.Side side = GovernmentId.Side.FRONT;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                GovernmentId.Side side2 = GovernmentId.Side.FRONT;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public SubmitVerificationWorker(Context context, String str, String str2, String str3, String str4, GovernmentIdService governmentIdService, GovernmentIdRequestArguments governmentIdRequestArguments, DataCollector dataCollector, FallbackModeManager fallbackModeManager, RealImageHelper realImageHelper, String str5, CameraProperties cameraProperties, RealCameraStatsManager realCameraStatsManager, TrackingEventsLogger trackingEventsLogger) {
        context.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        governmentIdService.getClass();
        dataCollector.getClass();
        fallbackModeManager.getClass();
        realImageHelper.getClass();
        cameraProperties.getClass();
        realCameraStatsManager.getClass();
        trackingEventsLogger.getClass();
        this.context = context;
        this.sessionToken = str;
        this.inquiryId = str2;
        this.fromStep = str3;
        this.fromComponent = str4;
        this.service = governmentIdService;
        this.governmentIdRequestArguments = governmentIdRequestArguments;
        this.dataCollector = dataCollector;
        this.fallbackModeManager = fallbackModeManager;
        this.imageHelper = realImageHelper;
        this.webRtcObjectId = str5;
        this.cameraProperties = cameraProperties;
        this.cameraStatsManager = realCameraStatsManager;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0242 -> B:16:0x027b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0264 -> B:10:0x026a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0212 -> B:17:0x0229). Please report as a decompilation issue!!! */
    /* renamed from: access$addToForm-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4094access$addToFormBWLJW6A(SubmitVerificationWorker submitVerificationWorker, GovernmentIdRequestArguments governmentIdRequestArguments, ArrayList arrayList, CameraProperties cameraProperties, ContinuationImpl continuationImpl) {
        SubmitVerificationWorker$addToForm$1 submitVerificationWorker$addToForm$1;
        int i;
        MediaType mediaType;
        SubmitVerificationWorker$addToForm$1 submitVerificationWorker$addToForm$12;
        String lowerCase;
        String str;
        double d;
        Iterator it;
        String idClassKey;
        String str2;
        MediaType mediaType2;
        SubmitVerificationWorker submitVerificationWorker2 = submitVerificationWorker;
        GovernmentIdRequestArguments governmentIdRequestArguments2 = governmentIdRequestArguments;
        ArrayList arrayList2 = arrayList;
        String str3 = submitVerificationWorker2.webRtcObjectId;
        if (continuationImpl instanceof SubmitVerificationWorker$addToForm$1) {
            submitVerificationWorker$addToForm$1 = (SubmitVerificationWorker$addToForm$1) continuationImpl;
            int i2 = submitVerificationWorker$addToForm$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                submitVerificationWorker$addToForm$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = submitVerificationWorker$addToForm$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = submitVerificationWorker$addToForm$1.label;
                String str4 = "front_and_back";
                if (i != 0) {
                    mediaType = null;
                    SafeTrace.throwOnFailure(obj);
                    DataCollector dataCollector = submitVerificationWorker2.dataCollector;
                    String str5 = submitVerificationWorker2.fromStep;
                    List list = governmentIdRequestArguments2.ids;
                    submitVerificationWorker$addToForm$12 = submitVerificationWorker$addToForm$1;
                    String str6 = governmentIdRequestArguments2.fieldKeyDocument;
                    dataCollector.submit(new GovernmentIdStepData(str5, list));
                    String str7 = cameraProperties.label;
                    Size size = cameraProperties.size;
                    CameraProperties.FacingMode facingMode = cameraProperties.facingMode;
                    MultipartBody.Part createFormData = MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + str6 + "][cameraProperties][label]", str7);
                    String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str6, "][cameraProperties][facing_mode]");
                    if (WhenMappings.$EnumSwitchMapping$0[facingMode.ordinal()] == 1) {
                        lowerCase = "";
                    } else {
                        lowerCase = facingMode.toString().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                    }
                    MultipartBody.Part createFormData2 = MultipartBody.Part.Companion.createFormData(m, lowerCase);
                    MultipartBody.Part createFormData3 = MultipartBody.Part.Companion.createFormData(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str6, "][cameraProperties][width]"), String.valueOf(size.getWidth()));
                    MultipartBody.Part createFormData4 = MultipartBody.Part.Companion.createFormData(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str6, "][cameraProperties][height]"), String.valueOf(size.getHeight()));
                    MultipartBody.Part createFormData5 = MultipartBody.Part.Companion.createFormData(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str6, "][cameraProperties][aspectRatio]"), String.valueOf(cameraProperties.getAspectRatio()));
                    MultipartBody.Part createFormData6 = MultipartBody.Part.Companion.createFormData(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str6, "][cameraProperties][frameRate]"), String.valueOf(cameraProperties.frameRate));
                    MultipartBody.Part createFormData7 = MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + str6 + "][cameraProperties][kind]", "");
                    MultipartBody.Part createFormData8 = MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + str6 + "][cameraProperties][selectedCameraIndex]", "");
                    MultipartBody.Part createFormData9 = MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + str6 + "][cameraProperties][streamStability]", "");
                    MultipartBody.Part createFormData10 = MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + str6 + "][cameraProperties][allCameraLabels]", "");
                    MultipartBody.Part createFormData11 = MultipartBody.Part.Companion.createFormData(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str6, "][cameraProperties][client]"), RootedDeviceUtilsKt.isDeviceRooted(submitVerificationWorker2.context) ? "mobile" : "mobile_sdk");
                    MultipartBody.Part createFormData12 = MultipartBody.Part.Companion.createFormData(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str6, "][cameraProperties][platform]"), EmulatorDeviceUtilsKt.isDeviceEmulator() ? "android" : "android_sdk");
                    String m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str6, "][cameraProperties][factor]");
                    RealCameraStatsManager realCameraStatsManager = submitVerificationWorker2.cameraStatsManager;
                    long j = realCameraStatsManager.measurementsTaken;
                    if (j == 0) {
                        d = 0.0d;
                        str = str3;
                    } else {
                        str = str3;
                        d = realCameraStatsManager.averageRotationPerMeasurement / j;
                    }
                    arrayList2.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new MultipartBody.Part[]{createFormData, createFormData2, createFormData3, createFormData4, createFormData5, createFormData6, createFormData7, createFormData8, createFormData9, createFormData10, createFormData11, createFormData12, MultipartBody.Part.Companion.createFormData(m2, String.valueOf(d))}));
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.areEqual(((GovernmentId) it2.next()).getIdClassKey(), "auto-classification")) {
                                break;
                            }
                        }
                    }
                    GovernmentId governmentId = (GovernmentId) CollectionsKt.firstOrNull(list);
                    if (governmentId != null && (idClassKey = governmentId.getIdClassKey()) != null) {
                        arrayList2.add(MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments2.fieldKeyIdClass + "]", idClassKey));
                    }
                    it = list2.iterator();
                    String str8 = governmentIdRequestArguments2.fieldKeyDocument;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Iterator it3 = submitVerificationWorker$addToForm$1.L$4;
                    GovernmentId governmentId2 = submitVerificationWorker$addToForm$1.L$3;
                    Iterator it4 = submitVerificationWorker$addToForm$1.L$2;
                    List list3 = submitVerificationWorker$addToForm$1.L$1;
                    mediaType = null;
                    GovernmentIdRequestArguments governmentIdRequestArguments3 = submitVerificationWorker$addToForm$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    Object obj2 = ((Result) obj).value;
                    String str9 = str3;
                    String str10 = "front_and_back";
                    ArrayList arrayList3 = list3;
                    Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj2);
                    if (m4120exceptionOrNullimpl == null) {
                        return new Result.Failure(m4120exceptionOrNullimpl);
                    }
                    GovernmentId governmentId3 = governmentId2;
                    Iterator it5 = it4;
                    ArrayList arrayList4 = arrayList3;
                    GovernmentIdRequestArguments governmentIdRequestArguments4 = governmentIdRequestArguments3;
                    SubmitVerificationWorker$addToForm$1 submitVerificationWorker$addToForm$13 = submitVerificationWorker$addToForm$1;
                    str = str9;
                    str4 = str10;
                    if (it3.hasNext()) {
                        Frame frame = (Frame) it3.next();
                        str9 = str;
                        str10 = str4;
                        if (StringsKt__StringsJVMKt.startsWith(frame.mimeType, "image/", false)) {
                            RealImageHelper realImageHelper = submitVerificationWorker2.imageHelper;
                            File file = new File(frame.absoluteFilePath);
                            submitVerificationWorker$addToForm$13.L$0 = governmentIdRequestArguments4;
                            submitVerificationWorker$addToForm$13.L$1 = arrayList4;
                            submitVerificationWorker$addToForm$13.L$2 = it5;
                            submitVerificationWorker$addToForm$13.L$3 = governmentId3;
                            submitVerificationWorker$addToForm$13.L$4 = it3;
                            submitVerificationWorker$addToForm$13.label = 1;
                            Object m4103resizeAndCompressImageInPlacegIAlus = realImageHelper.m4103resizeAndCompressImageInPlacegIAlus(file, submitVerificationWorker$addToForm$13);
                            if (m4103resizeAndCompressImageInPlacegIAlus == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            governmentIdRequestArguments3 = governmentIdRequestArguments4;
                            governmentId2 = governmentId3;
                            obj2 = m4103resizeAndCompressImageInPlacegIAlus;
                            submitVerificationWorker$addToForm$1 = submitVerificationWorker$addToForm$13;
                            arrayList3 = arrayList4;
                            it4 = it5;
                            Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(obj2);
                            if (m4120exceptionOrNullimpl2 == null) {
                            }
                        }
                        str = str9;
                        str4 = str10;
                        if (it3.hasNext()) {
                            String str11 = str;
                            String str12 = str4;
                            int ordinal = governmentId3.getSide().ordinal();
                            if (ordinal == 0) {
                                str2 = "front";
                            } else if (ordinal == 1) {
                                str2 = "back";
                            } else {
                                if (ordinal != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return mediaType;
                                }
                                str2 = str12;
                            }
                            String str13 = governmentIdRequestArguments4.fieldKeyDocument;
                            arrayList4.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new MultipartBody.Part[]{MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + str13 + "][files][][page]", str2), MultipartBody.Part.Companion.createFormData(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str13, "][files][][capture_method]"), governmentId3.getCaptureMethod().toString())}));
                            if (governmentId3 instanceof GovernmentId.GovernmentIdImage) {
                                RawExtraction rawExtraction = ((GovernmentId.GovernmentIdImage) governmentId3).rawExtraction;
                                if (rawExtraction != null) {
                                    ArrayList arrayList5 = arrayList4;
                                    arrayList5.add(MultipartBody.Part.Companion.createFormData("data[attributes][client-extraction-raws][][type]", rawExtraction.f1454type));
                                    arrayList5.add(MultipartBody.Part.Companion.createFormData("data[attributes][client-extraction-raws][][value]", rawExtraction.value));
                                }
                                arrayList4.add(MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + str13 + "][files][][type]", "image"));
                            } else {
                                if (!(governmentId3 instanceof GovernmentId.GovernmentIdVideo)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return mediaType;
                                }
                                arrayList4.add(MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + str13 + "][files][][type]", "video"));
                            }
                            List frames = governmentId3.getFrames();
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it6 = frames.iterator();
                            while (it6.hasNext()) {
                                Frame frame2 = (Frame) it6.next();
                                String m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str13, "][files][][frames][]");
                                String name = new File(frame2.absoluteFilePath).getName();
                                RequestBody.Companion companion = RequestBody.Companion;
                                Iterator it7 = it6;
                                GovernmentIdRequestArguments governmentIdRequestArguments5 = governmentIdRequestArguments4;
                                File file2 = new File(frame2.absoluteFilePath);
                                Regex regex = MediaType.TYPE_SUBTYPE;
                                String str14 = frame2.mimeType;
                                str14.getClass();
                                try {
                                    mediaType2 = UnsignedKt.get(str14);
                                } catch (IllegalArgumentException unused) {
                                    mediaType2 = mediaType;
                                }
                                companion.getClass();
                                CollectionsKt__MutableCollectionsKt.addAll(CollectionsKt__CollectionsJVMKt.listOf(MultipartBody.Part.Companion.createFormData(m3, name, new RequestBody$Companion$asRequestBody$1(file2, mediaType2))), arrayList6);
                                it6 = it7;
                                governmentIdRequestArguments4 = governmentIdRequestArguments5;
                            }
                            GovernmentIdRequestArguments governmentIdRequestArguments6 = governmentIdRequestArguments4;
                            arrayList4.addAll(arrayList6);
                            submitVerificationWorker2 = submitVerificationWorker;
                            str = str11;
                            arrayList2 = arrayList4;
                            it = it5;
                            str4 = str12;
                            governmentIdRequestArguments2 = governmentIdRequestArguments6;
                            submitVerificationWorker$addToForm$12 = submitVerificationWorker$addToForm$13;
                            String str82 = governmentIdRequestArguments2.fieldKeyDocument;
                            if (it.hasNext()) {
                                String str15 = str;
                                String str16 = str4;
                                if (str15 != null) {
                                    MultipartBody.Part createFormData13 = MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + str82 + "][files][][name]", "video");
                                    String m4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str82, "][files][][capture-method]");
                                    GovernmentIdCapture.CaptureMethod captureMethod = GovernmentIdCapture.CaptureMethod.Manual;
                                    String lowerCase2 = "Auto".toLowerCase(Locale.ROOT);
                                    lowerCase2.getClass();
                                    arrayList2.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new MultipartBody.Part[]{createFormData13, MultipartBody.Part.Companion.createFormData(m4, lowerCase2), MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + str82 + "][files][][type]", "video"), MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + str82 + "][files][][page]", str16), MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + str82 + "][files][][objectId]", str15)}));
                                }
                                Result.Companion companion2 = Result.Companion;
                                return Unit.INSTANCE;
                            }
                            governmentId3 = (GovernmentId) it.next();
                            ArrayList arrayList7 = arrayList2;
                            governmentIdRequestArguments4 = governmentIdRequestArguments2;
                            it3 = governmentId3.getFrames().iterator();
                            it5 = it;
                            arrayList4 = arrayList7;
                            submitVerificationWorker$addToForm$13 = submitVerificationWorker$addToForm$12;
                            if (it3.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        submitVerificationWorker$addToForm$1 = new SubmitVerificationWorker$addToForm$1(submitVerificationWorker2, continuationImpl);
        Object obj3 = submitVerificationWorker$addToForm$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = submitVerificationWorker$addToForm$1.label;
        String str42 = "front_and_back";
        if (i != 0) {
        }
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        worker.getClass();
        if (worker instanceof SubmitVerificationWorker) {
            return Intrinsics.areEqual(this.sessionToken, ((SubmitVerificationWorker) worker).sessionToken);
        }
        return false;
    }

    @Override // com.squareup.workflow1.Worker
    /* renamed from: run */
    public final Flow getWork() {
        return new SafeFlow(new SubmitVerificationWorker$run$1(this, null));
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        if (workflowWorker instanceof SubmitVerificationWorker) {
            return Intrinsics.areEqual(this.sessionToken, ((SubmitVerificationWorker) workflowWorker).sessionToken);
        }
        return false;
    }
}
