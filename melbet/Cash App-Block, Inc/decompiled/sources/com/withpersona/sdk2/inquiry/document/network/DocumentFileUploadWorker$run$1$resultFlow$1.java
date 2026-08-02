package com.withpersona.sdk2.inquiry.document.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileData;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class DocumentFileUploadWorker$run$1$resultFlow$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ DeferredCoroutine $result;
    public /* synthetic */ Object L$0;
    public NetworkCallResult.Success L$1;
    public int label;
    public final /* synthetic */ DocumentFileUploadWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentFileUploadWorker$run$1$resultFlow$1(DeferredCoroutine deferredCoroutine, DocumentFileUploadWorker documentFileUploadWorker, Continuation continuation) {
        super(2, continuation);
        this.$result = deferredCoroutine;
        this.this$0 = documentFileUploadWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DocumentFileUploadWorker$run$1$resultFlow$1 documentFileUploadWorker$run$1$resultFlow$1 = new DocumentFileUploadWorker$run$1$resultFlow$1(this.$result, this.this$0, continuation);
        documentFileUploadWorker$run$1$resultFlow$1.L$0 = obj;
        return documentFileUploadWorker$run$1$resultFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DocumentFileUploadWorker$run$1$resultFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x011c, code lost:
    
        if (r3.emit(r4, r11) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0139, code lost:
    
        if (r3.emit(r12, r11) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x015c, code lost:
    
        if (r3.emit(r12, r11) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x016f, code lost:
    
        if (r3.emit(r4, r11) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        if (r3.emit(r6, r11) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ac, code lost:
    
        if (r3.emit(r4, r11) == r0) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object obj2;
        DocumentFileData.Attributes attributes;
        List list;
        GenericFileUploadErrorResponse genericFileUploadErrorResponse;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                SafeTrace.throwOnFailure(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                this.L$0 = flowCollector2;
                this.label = 1;
                Object awaitInternal = this.$result.awaitInternal(this);
                if (awaitInternal != coroutineSingletons) {
                    flowCollector = flowCollector2;
                    obj = awaitInternal;
                    obj2 = (NetworkCallResult) obj;
                    if (obj2 instanceof NetworkCallResult.Success) {
                        NetworkCallResult.Success success = (NetworkCallResult.Success) obj2;
                        DocumentFileUploadResponse documentFileUploadResponse = (DocumentFileUploadResponse) success.getResponse();
                        DocumentFileData.RemoteDocumentFile remoteDocumentFile = (documentFileUploadResponse == null || (attributes = documentFileUploadResponse.data.attributes) == null || (list = attributes.originals) == null) ? null : (DocumentFileData.RemoteDocumentFile) CollectionsKt.firstOrNull(list);
                        if (documentFileUploadResponse != null && remoteDocumentFile != null) {
                            DocumentFile.Local local = this.this$0.localDocument;
                            DocumentFileUploadWorker.Response.Success success2 = new DocumentFileUploadWorker.Response.Success(local, new DocumentFile.Remote(local.absoluteFilePath, remoteDocumentFile.filename, remoteDocumentFile.url, documentFileUploadResponse.data.id));
                            this.L$0 = flowCollector;
                            this.L$1 = success;
                            this.label = 2;
                            break;
                        } else {
                            DocumentFileUploadWorker.Response.DocumentUploadError documentUploadError = new DocumentFileUploadWorker.Response.DocumentUploadError(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                            this.L$0 = flowCollector;
                            this.L$1 = success;
                            this.label = 3;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    if (obj2 instanceof NetworkCallResult.Failure) {
                        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = ((NetworkCallResult.Failure) obj2).getNetworkErrorInfo();
                        if (!networkErrorInfo.isRecoverable() || !(networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.UnknownError)) {
                            if (!networkErrorInfo.isRecoverable()) {
                                DocumentFileUploadWorker.Response.NetworkError networkError = new DocumentFileUploadWorker.Response.NetworkError(networkErrorInfo);
                                this.L$0 = obj2;
                                this.L$1 = null;
                                this.label = 7;
                                break;
                            } else {
                                DocumentFileUploadWorker.Response.DocumentUploadError documentUploadError2 = new DocumentFileUploadWorker.Response.DocumentUploadError(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                this.L$0 = obj2;
                                this.L$1 = null;
                                this.label = 6;
                                break;
                            }
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
                                    DocumentFileUploadWorker.Response.DocumentUploadError documentUploadError3 = new DocumentFileUploadWorker.Response.DocumentUploadError(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                    this.L$0 = obj2;
                                    this.L$1 = null;
                                    this.label = 5;
                                    break;
                                } else {
                                    DocumentFileUploadWorker.Response.DocumentUploadError documentUploadError4 = new DocumentFileUploadWorker.Response.DocumentUploadError(genericFileUploadErrorResponse.getErrors().get(0));
                                    this.L$0 = obj2;
                                    this.L$1 = null;
                                    this.label = 4;
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
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                flowCollector = flowCollector3;
                obj2 = (NetworkCallResult) obj;
                if (obj2 instanceof NetworkCallResult.Success) {
                }
                if (obj2 instanceof NetworkCallResult.Failure) {
                }
                return Unit.INSTANCE;
            case 2:
            case 3:
                obj2 = this.L$1;
                flowCollector = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                if (obj2 instanceof NetworkCallResult.Failure) {
                }
                return Unit.INSTANCE;
            case 4:
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
