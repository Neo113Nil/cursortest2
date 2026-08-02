package com.withpersona.sdk2.inquiry.governmentid.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.stripe.android.financialconnections.features.reset.ResetViewModel;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class SubmitVerificationWorker$run$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ SubmitVerificationWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitVerificationWorker$run$1(SubmitVerificationWorker submitVerificationWorker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = submitVerificationWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SubmitVerificationWorker$run$1 submitVerificationWorker$run$1 = new SubmitVerificationWorker$run$1(this.this$0, continuation);
        submitVerificationWorker$run$1.L$0 = obj;
        return submitVerificationWorker$run$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SubmitVerificationWorker$run$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01a0, code lost:
    
        if (r3.emit(r1, r14) == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01bd, code lost:
    
        if (r3.emit(r0, r14) == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01d0, code lost:
    
        if (r3.emit(r1, r14) == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b7, code lost:
    
        if (r7.emit(r15, r14) == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0097, code lost:
    
        if (r15 == r2) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object m4094access$addToFormBWLJW6A;
        Collection collection;
        FlowCollector flowCollector2;
        Collection collection2;
        NetworkCallResult networkCallResult;
        NetworkCallResult networkCallResult2;
        FlowCollector flowCollector3;
        List list;
        GenericFileUploadErrorResponse genericFileUploadErrorResponse;
        SubmitVerificationWorker submitVerificationWorker = this.this$0;
        GovernmentIdRequestArguments governmentIdRequestArguments = submitVerificationWorker.governmentIdRequestArguments;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                SafeTrace.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                TrackingEventsLogger.DefaultImpls.logGovernmentIdStateEvent$default(submitVerificationWorker.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.SUBMITTING, null, null, 4, null), false, 2, null);
                ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(MultipartBody.Part.Companion.createFormData("data[id]", submitVerificationWorker.inquiryId), MultipartBody.Part.Companion.createFormData("data[type]", "inquiry"), MultipartBody.Part.Companion.createFormData("meta[from_component]", submitVerificationWorker.fromComponent), MultipartBody.Part.Companion.createFormData("meta[from_step]", submitVerificationWorker.fromStep));
                collection = mutableListOf;
                if (governmentIdRequestArguments != null) {
                    CameraProperties cameraProperties = submitVerificationWorker.cameraProperties;
                    this.L$0 = flowCollector;
                    this.L$1 = mutableListOf;
                    this.label = 1;
                    m4094access$addToFormBWLJW6A = SubmitVerificationWorker.m4094access$addToFormBWLJW6A(submitVerificationWorker, governmentIdRequestArguments, mutableListOf, cameraProperties, this);
                    collection2 = mutableListOf;
                    break;
                }
                ResetViewModel.AnonymousClass1 anonymousClass1 = new ResetViewModel.AnonymousClass1(submitVerificationWorker, collection, null, 3);
                this.L$0 = flowCollector;
                this.L$1 = null;
                this.label = 3;
                obj = NetworkUtilsKt.enqueueVerificationRequestWithRetry(anonymousClass1, this);
                if (obj != coroutineSingletons) {
                    flowCollector2 = flowCollector;
                    networkCallResult = (NetworkCallResult) obj;
                    if (networkCallResult instanceof NetworkCallResult.Success) {
                        ((NetworkCallResult.Success) networkCallResult).getResponse();
                        if (!submitVerificationWorker.dataCollector.isActive() && governmentIdRequestArguments != null && (list = governmentIdRequestArguments.ids) != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                Iterator it2 = ((GovernmentId) it.next()).getFrames().iterator();
                                while (it2.hasNext()) {
                                    new File(((Frame) it2.next()).absoluteFilePath).delete();
                                }
                            }
                        }
                        this.L$0 = flowCollector2;
                        this.L$1 = networkCallResult;
                        this.label = 4;
                        if (flowCollector2.emit(SubmitVerificationWorker.Response.Success.INSTANCE, this) != coroutineSingletons) {
                            networkCallResult2 = networkCallResult;
                            flowCollector3 = flowCollector2;
                            networkCallResult = networkCallResult2;
                            flowCollector2 = flowCollector3;
                        }
                    }
                    if (networkCallResult instanceof NetworkCallResult.Failure) {
                        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                        if (!networkErrorInfo.isRecoverable() || !(networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.UnknownError)) {
                            SubmitVerificationWorker.Response.Error error = new SubmitVerificationWorker.Response.Error(networkErrorInfo);
                            this.L$0 = networkCallResult;
                            this.L$1 = null;
                            this.label = 7;
                            break;
                        } else {
                            ErrorResponse.Error responseError = networkErrorInfo.getResponseError();
                            responseError.getClass();
                            ResponseBody errorBody = ((ErrorResponse.Error.UnknownError) responseError).getErrorBody();
                            if (errorBody != null) {
                                try {
                                    BufferedSource source = errorBody.source();
                                    Moshi.Builder builder = new Moshi.Builder();
                                    builder.add(GenericFileUploadErrorResponse.Companion.getAdapter());
                                    genericFileUploadErrorResponse = (GenericFileUploadErrorResponse) new Moshi(builder).adapter(GenericFileUploadErrorResponse.class, Util.NO_ANNOTATIONS, null).fromJson(source);
                                } catch (Exception unused) {
                                }
                                if (genericFileUploadErrorResponse != null) {
                                    SubmitVerificationWorker.Response.FileUploadError fileUploadError = new SubmitVerificationWorker.Response.FileUploadError(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                    this.L$0 = networkCallResult;
                                    this.L$1 = null;
                                    this.label = 6;
                                    break;
                                } else {
                                    SubmitVerificationWorker.Response.FileUploadError fileUploadError2 = new SubmitVerificationWorker.Response.FileUploadError(genericFileUploadErrorResponse.getErrors().get(0));
                                    this.L$0 = networkCallResult;
                                    this.L$1 = null;
                                    this.label = 5;
                                    break;
                                }
                            }
                            genericFileUploadErrorResponse = null;
                            if (genericFileUploadErrorResponse != null) {
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                return coroutineSingletons;
            case 1:
                Collection collection3 = (List) this.L$1;
                flowCollector = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                m4094access$addToFormBWLJW6A = ((Result) obj).value;
                collection2 = collection3;
                collection = collection2;
                if (Result.m4120exceptionOrNullimpl(m4094access$addToFormBWLJW6A) != null) {
                    SubmitVerificationWorker.Response.Error error2 = new SubmitVerificationWorker.Response.Error(new InternalErrorInfo.UnknownErrorInfo("Error adding data to form."));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 2;
                    break;
                }
                ResetViewModel.AnonymousClass1 anonymousClass12 = new ResetViewModel.AnonymousClass1(submitVerificationWorker, collection, null, 3);
                this.L$0 = flowCollector;
                this.L$1 = null;
                this.label = 3;
                obj = NetworkUtilsKt.enqueueVerificationRequestWithRetry(anonymousClass12, this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 3:
                flowCollector2 = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                networkCallResult = (NetworkCallResult) obj;
                if (networkCallResult instanceof NetworkCallResult.Success) {
                }
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                }
                return Unit.INSTANCE;
            case 4:
                networkCallResult2 = (NetworkCallResult) this.L$1;
                flowCollector3 = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                networkCallResult = networkCallResult2;
                flowCollector2 = flowCollector3;
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                }
                return Unit.INSTANCE;
            case 5:
            case 6:
            case 7:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
