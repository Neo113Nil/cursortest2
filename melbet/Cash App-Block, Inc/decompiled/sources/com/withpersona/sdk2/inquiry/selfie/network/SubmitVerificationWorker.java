package com.withpersona.sdk2.inquiry.selfie.network;

import android.content.Context;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.work.presenters.shift.RealClockInRepository$updateNote$2;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.upload.UploadResponse;
import com.withpersona.sdk2.inquiry.network.upload.UploadService;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector;
import com.withpersona.sdk2.inquiry.shared.image.RealImageHelper;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.UnsignedKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$asRequestBody$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/network/SubmitVerificationWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SubmitVerificationWorker$Response;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "Response", "com/withpersona/sdk2/inquiry/selfie/network/SubmitVerificationWorker_Factory_Impl", "FileUploadInvalidResponse", "InternalErrorException", "FileType", "selfie_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SubmitVerificationWorker implements Worker<Response>, WorkflowWorker {
    public final CameraProperties cameraProperties;
    public final RealCameraStatsManager cameraStatsManager;
    public final Context context;
    public final DataCollector dataCollector;
    public final FallbackModeManager fallbackModeManager;
    public final String fieldKeySelfie;
    public final String fileUploadUrl;
    public final String fromComponent;
    public final String fromStep;
    public final RealImageHelper imageHelper;
    public final String inquiryId;
    public final SelfieType selfieType;
    public final List selfies;
    public final SelfieService service;
    public final String sessionToken;
    public final long startSelfieTimestamp;
    public final TrackingEventsLogger trackingEventsLogger;
    public final UploadService uploadService;
    public final String webRtcObjectId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FileType {
        public static final /* synthetic */ FileType[] $VALUES;
        public static final FileType IMAGE;
        public static final FileType VIDEO;

        static {
            FileType fileType = new FileType("IMAGE", 0);
            IMAGE = fileType;
            FileType fileType2 = new FileType("VIDEO", 1);
            VIDEO = fileType2;
            $VALUES = new FileType[]{fileType, fileType2};
        }

        public static FileType valueOf(String str) {
            return (FileType) Enum.valueOf(FileType.class, str);
        }

        public static FileType[] values() {
            return (FileType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/network/SubmitVerificationWorker$FileUploadInvalidResponse;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "selfie_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FileUploadInvalidResponse extends RuntimeException {
        public FileUploadInvalidResponse() {
            super("File upload returned invalid response.");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/network/SubmitVerificationWorker$InternalErrorException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "selfie_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InternalErrorException extends RuntimeException {
        public final InternalErrorInfo errorInfo;

        public InternalErrorException(InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
            networkErrorInfo.getClass();
            this.errorInfo = networkErrorInfo;
        }
    }

    public abstract class Response {

        public final class Error extends Response {
            public final InternalErrorInfo cause;

            public Error(InternalErrorInfo internalErrorInfo) {
                internalErrorInfo.getClass();
                this.cause = internalErrorInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.areEqual(this.cause, ((Error) obj).cause);
            }

            public final int hashCode() {
                return this.cause.hashCode();
            }

            public final String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        public final class Success extends Response {
            public static final Success INSTANCE = new Success();
        }
    }

    public SubmitVerificationWorker(Context context, String str, String str2, SelfieType selfieType, List list, SelfieService selfieService, String str3, String str4, String str5, DataCollector dataCollector, FallbackModeManager fallbackModeManager, RealImageHelper realImageHelper, String str6, CameraProperties cameraProperties, RealCameraStatsManager realCameraStatsManager, long j, TrackingEventsLogger trackingEventsLogger, UploadService uploadService, String str7) {
        context.getClass();
        str.getClass();
        str2.getClass();
        selfieType.getClass();
        list.getClass();
        selfieService.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        dataCollector.getClass();
        fallbackModeManager.getClass();
        realImageHelper.getClass();
        cameraProperties.getClass();
        realCameraStatsManager.getClass();
        trackingEventsLogger.getClass();
        uploadService.getClass();
        this.context = context;
        this.sessionToken = str;
        this.inquiryId = str2;
        this.selfieType = selfieType;
        this.selfies = list;
        this.service = selfieService;
        this.fromStep = str3;
        this.fromComponent = str4;
        this.fieldKeySelfie = str5;
        this.dataCollector = dataCollector;
        this.fallbackModeManager = fallbackModeManager;
        this.imageHelper = realImageHelper;
        this.webRtcObjectId = str6;
        this.cameraProperties = cameraProperties;
        this.cameraStatsManager = realCameraStatsManager;
        this.startSelfieTimestamp = j;
        this.trackingEventsLogger = trackingEventsLogger;
        this.uploadService = uploadService;
        this.fileUploadUrl = str7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* renamed from: access$uploadIfNeededAndAddFileToBody-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4100access$uploadIfNeededAndAddFileToBodyBWLJW6A(SubmitVerificationWorker submitVerificationWorker, File file, FileType fileType, List list, ContinuationImpl continuationImpl) {
        SubmitVerificationWorker$uploadIfNeededAndAddFileToBody$1 submitVerificationWorker$uploadIfNeededAndAddFileToBody$1;
        int i;
        String str;
        String str2;
        MediaType mediaType;
        List list2;
        NetworkCallResult networkCallResult;
        String l;
        String str3 = submitVerificationWorker.fieldKeySelfie;
        if (continuationImpl instanceof SubmitVerificationWorker$uploadIfNeededAndAddFileToBody$1) {
            submitVerificationWorker$uploadIfNeededAndAddFileToBody$1 = (SubmitVerificationWorker$uploadIfNeededAndAddFileToBody$1) continuationImpl;
            int i2 = submitVerificationWorker$uploadIfNeededAndAddFileToBody$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                submitVerificationWorker$uploadIfNeededAndAddFileToBody$1.label = i2 - PKIFailureInfo.systemUnavail;
                SubmitVerificationWorker$uploadIfNeededAndAddFileToBody$1 submitVerificationWorker$uploadIfNeededAndAddFileToBody$12 = submitVerificationWorker$uploadIfNeededAndAddFileToBody$1;
                Object obj = submitVerificationWorker$uploadIfNeededAndAddFileToBody$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = submitVerificationWorker$uploadIfNeededAndAddFileToBody$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str4 = submitVerificationWorker.fileUploadUrl;
                    MediaType mediaType2 = null;
                    Object[] objArr = 0;
                    if (str4 == null || StringsKt.isBlank(str4) || fileType == FileType.VIDEO) {
                        RequestBody.Companion companion = RequestBody.Companion;
                        Regex regex = MediaType.TYPE_SUBTYPE;
                        int ordinal = fileType.ordinal();
                        if (ordinal == 0) {
                            str = "image/*";
                        } else {
                            if (ordinal != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            str = "video/*";
                        }
                        try {
                            mediaType2 = UnsignedKt.get(str);
                        } catch (IllegalArgumentException unused) {
                        }
                        companion.getClass();
                        file.getClass();
                        list.add(MultipartBody.Part.Companion.createFormData(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str3, "][files][][frames][]"), file.getName(), new RequestBody$Companion$asRequestBody$1(file, mediaType2)));
                        Result.Companion companion2 = Result.Companion;
                        return Unit.INSTANCE;
                    }
                    RequestBody.Companion companion3 = RequestBody.Companion;
                    Regex regex2 = MediaType.TYPE_SUBTYPE;
                    int ordinal2 = fileType.ordinal();
                    if (ordinal2 == 0) {
                        str2 = "image/jpeg";
                    } else {
                        if (ordinal2 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        str2 = "video/mp4";
                    }
                    try {
                        mediaType = UnsignedKt.get(str2);
                    } catch (IllegalArgumentException unused2) {
                        mediaType = null;
                    }
                    companion3.getClass();
                    file.getClass();
                    RealClockInRepository$updateNote$2 realClockInRepository$updateNote$2 = new RealClockInRepository$updateNote$2(submitVerificationWorker, file, new RequestBody$Companion$asRequestBody$1(file, mediaType), objArr == true ? 1 : 0, 4);
                    submitVerificationWorker$uploadIfNeededAndAddFileToBody$12.L$0 = list;
                    submitVerificationWorker$uploadIfNeededAndAddFileToBody$12.label = 1;
                    obj = NetworkUtilsKt.enqueueRetriableRequestWithRetry(realClockInRepository$updateNote$2, submitVerificationWorker$uploadIfNeededAndAddFileToBody$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list2 = list;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list2 = submitVerificationWorker$uploadIfNeededAndAddFileToBody$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                networkCallResult = (NetworkCallResult) obj;
                if (networkCallResult instanceof NetworkCallResult.Success) {
                    UploadResponse uploadResponse = (UploadResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                    if (uploadResponse == null) {
                        Result.Companion companion4 = Result.Companion;
                        return new Result.Failure(new FileUploadInvalidResponse());
                    }
                    String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str3, "][files][][frames][][fileName]");
                    String fileName = uploadResponse.getFileName();
                    if (fileName == null) {
                        Result.Companion companion5 = Result.Companion;
                        return new Result.Failure(new FileUploadInvalidResponse());
                    }
                    MultipartBody.Part createFormData = MultipartBody.Part.Companion.createFormData(m, fileName);
                    String m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str3, "][files][][frames][][fileKey]");
                    String fileKey = uploadResponse.getFileKey();
                    if (fileKey == null) {
                        Result.Companion companion6 = Result.Companion;
                        return new Result.Failure(new FileUploadInvalidResponse());
                    }
                    MultipartBody.Part createFormData2 = MultipartBody.Part.Companion.createFormData(m2, fileKey);
                    String m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str3, "][files][][frames][][fileContentType]");
                    String fileContentType = uploadResponse.getFileContentType();
                    if (fileContentType == null) {
                        Result.Companion companion7 = Result.Companion;
                        return new Result.Failure(new FileUploadInvalidResponse());
                    }
                    MultipartBody.Part createFormData3 = MultipartBody.Part.Companion.createFormData(m3, fileContentType);
                    String m4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str3, "][files][][frames][][fileByteSize]");
                    Long fileByteSize = uploadResponse.getFileByteSize();
                    if (fileByteSize == null || (l = fileByteSize.toString()) == null) {
                        Result.Companion companion8 = Result.Companion;
                        return new Result.Failure(new FileUploadInvalidResponse());
                    }
                    list2.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new MultipartBody.Part[]{createFormData, createFormData2, createFormData3, MultipartBody.Part.Companion.createFormData(m4, l)}));
                }
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    InternalErrorInfo.NetworkErrorInfo networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                    Result.Companion companion9 = Result.Companion;
                    return new Result.Failure(new InternalErrorException(networkErrorInfo));
                }
                Result.Companion companion22 = Result.Companion;
                return Unit.INSTANCE;
            }
        }
        submitVerificationWorker$uploadIfNeededAndAddFileToBody$1 = new SubmitVerificationWorker$uploadIfNeededAndAddFileToBody$1(submitVerificationWorker, continuationImpl);
        SubmitVerificationWorker$uploadIfNeededAndAddFileToBody$1 submitVerificationWorker$uploadIfNeededAndAddFileToBody$122 = submitVerificationWorker$uploadIfNeededAndAddFileToBody$1;
        Object obj2 = submitVerificationWorker$uploadIfNeededAndAddFileToBody$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = submitVerificationWorker$uploadIfNeededAndAddFileToBody$122.label;
        if (i != 0) {
        }
        networkCallResult = (NetworkCallResult) obj2;
        if (networkCallResult instanceof NetworkCallResult.Success) {
        }
        if (networkCallResult instanceof NetworkCallResult.Failure) {
        }
        Result.Companion companion222 = Result.Companion;
        return Unit.INSTANCE;
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
