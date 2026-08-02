package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import androidx.lifecycle.SavedStateHandle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.internal.network.InquiryAttributes;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Result;
import kotlin.UnsignedKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.time.DurationKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$3;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.Response;

/* loaded from: classes9.dex */
public final class FallbackModeApiController implements ApiController {
    public final Moshi moshi;
    public int requestCount;
    public final FallbackModeService service;
    public final StaticTemplateSession_Factory_Impl staticTemplateSessionFactory;

    public FallbackModeApiController(FallbackModeService fallbackModeService, Moshi moshi, StaticTemplateSession_Factory_Impl staticTemplateSession_Factory_Impl) {
        fallbackModeService.getClass();
        moshi.getClass();
        staticTemplateSession_Factory_Impl.getClass();
        this.service = fallbackModeService;
        this.moshi = moshi;
        this.staticTemplateSessionFactory = staticTemplateSession_Factory_Impl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x006a, code lost:
    
        if (r10 == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiController
    /* renamed from: createSession-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1999createSessiongIAlus(InquiryAttributes inquiryAttributes, Continuation continuation) {
        FallbackModeApiController$createSession$1 fallbackModeApiController$createSession$1;
        int i;
        String str;
        NetworkCallResult networkCallResult;
        List list;
        FallbackModeService.StaticTemplate staticTemplate;
        NetworkCallResult networkCallResult2;
        if (continuation instanceof FallbackModeApiController$createSession$1) {
            fallbackModeApiController$createSession$1 = (FallbackModeApiController$createSession$1) continuation;
            int i2 = fallbackModeApiController$createSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                fallbackModeApiController$createSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = fallbackModeApiController$createSession$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fallbackModeApiController$createSession$1.label;
                StaticTemplateSession_Factory_Impl staticTemplateSession_Factory_Impl = this.staticTemplateSessionFactory;
                String str2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str3 = inquiryAttributes.templateId;
                    if ((str3 == null || str3.length() == 0) && ((str = inquiryAttributes.sessionToken) == null || str.length() == 0)) {
                        Result.Companion companion = Result.Companion;
                        return new Result.Failure(new FallbackException("Expected templateId or session token to be non-null"));
                    }
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    FallbackModeApiController$createSession$response$1 fallbackModeApiController$createSession$response$1 = new FallbackModeApiController$createSession$response$1(this, inquiryAttributes, null);
                    fallbackModeApiController$createSession$1.L$0 = inquiryAttributes;
                    fallbackModeApiController$createSession$1.label = 1;
                    obj = JobKt.withContext(defaultScheduler, fallbackModeApiController$createSession$response$1, fallbackModeApiController$createSession$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list = (List) fallbackModeApiController$createSession$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        networkCallResult2 = (NetworkCallResult) obj;
                        if (!(networkCallResult2 instanceof NetworkCallResult.Failure)) {
                            if (!(networkCallResult2 instanceof NetworkCallResult.Success)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            FallbackModeService.SessionIdResponse sessionIdResponse = (FallbackModeService.SessionIdResponse) ((NetworkCallResult.Success) networkCallResult2).getResponse();
                            if (sessionIdResponse != null) {
                                str2 = sessionIdResponse.token;
                            }
                        }
                        if (str2 != null) {
                            Result.Companion companion2 = Result.Companion;
                            return new Result.Failure(new FallbackException("Failed to create session"));
                        }
                        Result.Companion companion3 = Result.Companion;
                        return new StaticTemplateSession(list, str2, (SavedStateHandle) staticTemplateSession_Factory_Impl.delegateFactory.savedStateHandleProvider.get());
                    }
                    inquiryAttributes = (InquiryAttributes) fallbackModeApiController$createSession$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                networkCallResult = (NetworkCallResult) obj;
                if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
                    Result.Companion companion4 = Result.Companion;
                    return new Result.Failure(new FallbackException("Failed to check status"));
                }
                if (!(networkCallResult instanceof NetworkCallResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                FallbackModeService.StatusResponse statusResponse = (FallbackModeService.StatusResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                List list2 = (statusResponse == null || (staticTemplate = statusResponse.staticInquiryTemplate) == null) ? null : staticTemplate.steps;
                if (list2 == null || list2.isEmpty()) {
                    Result.Companion companion5 = Result.Companion;
                    return new Result.Failure(new FallbackException("Expected steps to contain at least one step"));
                }
                String str4 = inquiryAttributes.sessionToken;
                if (str4 != null) {
                    String substringAfter = StringsKt.substringAfter(str4, "Bearer ", str4);
                    Result.Companion companion6 = Result.Companion;
                    return new StaticTemplateSession(list2, substringAfter, (SavedStateHandle) staticTemplateSession_Factory_Impl.delegateFactory.savedStateHandleProvider.get());
                }
                String str5 = inquiryAttributes.templateId;
                if (str5 == null || str5.length() == 0) {
                    Result.Companion companion7 = Result.Companion;
                    return new Result.Failure(new FallbackException("Template ID is required to create a fallback session without an existing session token"));
                }
                DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                FallbackModeApiController$createSession$sessionIdResponse$1 fallbackModeApiController$createSession$sessionIdResponse$1 = new FallbackModeApiController$createSession$sessionIdResponse$1(this, inquiryAttributes, null);
                fallbackModeApiController$createSession$1.L$0 = list2;
                fallbackModeApiController$createSession$1.label = 2;
                Object withContext = JobKt.withContext(defaultScheduler2, fallbackModeApiController$createSession$sessionIdResponse$1, fallbackModeApiController$createSession$1);
                if (withContext != coroutineSingletons) {
                    List list3 = list2;
                    obj = withContext;
                    list = list3;
                    networkCallResult2 = (NetworkCallResult) obj;
                    if (!(networkCallResult2 instanceof NetworkCallResult.Failure)) {
                    }
                    if (str2 != null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        fallbackModeApiController$createSession$1 = new FallbackModeApiController$createSession$1(this, (ContinuationImpl) continuation);
        Object obj2 = fallbackModeApiController$createSession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fallbackModeApiController$createSession$1.label;
        StaticTemplateSession_Factory_Impl staticTemplateSession_Factory_Impl2 = this.staticTemplateSessionFactory;
        String str22 = null;
        if (i != 0) {
        }
        networkCallResult = (NetworkCallResult) obj2;
        if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        if (r0 == r7) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transition(String str, RequestBody requestBody, ProductionEndpoint productionEndpoint, ContinuationImpl continuationImpl) {
        FallbackModeApiController$transition$1 fallbackModeApiController$transition$1;
        int i;
        Object obj;
        RequestBody requestBody2;
        NetworkCallResult networkCallResult;
        ?? r5;
        if (continuationImpl instanceof FallbackModeApiController$transition$1) {
            fallbackModeApiController$transition$1 = (FallbackModeApiController$transition$1) continuationImpl;
            int i2 = fallbackModeApiController$transition$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                fallbackModeApiController$transition$1.label = i2 - PKIFailureInfo.systemUnavail;
                FallbackModeApiController$transition$1 fallbackModeApiController$transition$12 = fallbackModeApiController$transition$1;
                Object obj2 = fallbackModeApiController$transition$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fallbackModeApiController$transition$12.label;
                Moshi moshi = this.moshi;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    obj = null;
                    FallbackModeApiController$transition$result$1 fallbackModeApiController$transition$result$1 = new FallbackModeApiController$transition$result$1(this, str, productionEndpoint, requestBody, null);
                    fallbackModeApiController$transition$12.L$0 = requestBody;
                    fallbackModeApiController$transition$12.label = 1;
                    obj2 = JobKt.withContext(defaultScheduler, fallbackModeApiController$transition$result$1, fallbackModeApiController$transition$12);
                    if (obj2 != coroutineSingletons) {
                        requestBody2 = requestBody;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                    obj = null;
                    r5 = 0;
                    NetworkCallResult networkCallResult2 = (NetworkCallResult) obj2;
                    if (!(networkCallResult2 instanceof NetworkCallResult.Failure)) {
                        if (networkCallResult2 instanceof NetworkCallResult.Success) {
                            return Response.success(r5);
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return obj;
                    }
                    ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ResponseBody.EMPTY;
                    moshi.getClass();
                    String json = moshi.adapter(ErrorResponse.class, Util.NO_ANNOTATIONS, r5).toJson(ErrorResponse.Companion.create("Fallback mode API error."));
                    json.getClass();
                    Regex regex = MediaType.TYPE_SUBTYPE;
                    Response.error(DurationKt.create(json, UnsignedKt.get("application/json")));
                    throw r5;
                }
                RequestBody requestBody3 = fallbackModeApiController$transition$12.L$0;
                SafeTrace.throwOnFailure(obj2);
                requestBody2 = requestBody3;
                obj = null;
                networkCallResult = (NetworkCallResult) obj2;
                if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
                    ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$12 = ResponseBody.EMPTY;
                    moshi.getClass();
                    String json2 = moshi.adapter(ErrorResponse.class, Util.NO_ANNOTATIONS, null).toJson(ErrorResponse.Companion.create("Fallback mode API error."));
                    json2.getClass();
                    Regex regex2 = MediaType.TYPE_SUBTYPE;
                    Response.error(DurationKt.create(json2, UnsignedKt.get("application/json")));
                    throw null;
                }
                if (!(networkCallResult instanceof NetworkCallResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return obj;
                }
                FallbackModeService.UploadUrlResponse uploadUrlResponse = (FallbackModeService.UploadUrlResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                String str2 = uploadUrlResponse != null ? uploadUrlResponse.location : null;
                if (str2 == null) {
                    ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$13 = ResponseBody.EMPTY;
                    moshi.getClass();
                    String json3 = moshi.adapter(ErrorResponse.class, Util.NO_ANNOTATIONS, null).toJson(ErrorResponse.Companion.create("Fallback mode API error."));
                    json3.getClass();
                    Regex regex3 = MediaType.TYPE_SUBTYPE;
                    Response.error(DurationKt.create(json3, UnsignedKt.get("application/json")));
                    throw null;
                }
                DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                Continuation continuation = null;
                Logger$log$1 logger$log$1 = new Logger$log$1(18, this, requestBody2, str2, continuation);
                fallbackModeApiController$transition$12.L$0 = null;
                fallbackModeApiController$transition$12.label = 2;
                obj2 = JobKt.withContext(defaultScheduler2, logger$log$1, fallbackModeApiController$transition$12);
                r5 = continuation;
            }
        }
        fallbackModeApiController$transition$1 = new FallbackModeApiController$transition$1(this, continuationImpl);
        FallbackModeApiController$transition$1 fallbackModeApiController$transition$122 = fallbackModeApiController$transition$1;
        Object obj22 = fallbackModeApiController$transition$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fallbackModeApiController$transition$122.label;
        Moshi moshi2 = this.moshi;
        if (i != 0) {
        }
        networkCallResult = (NetworkCallResult) obj22;
        if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
        }
    }

    @Override // com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiController
    public final Object transitionBack(String str, RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3, RealFallbackModeManager$transitionBack$1 realFallbackModeManager$transitionBack$1) {
        return transition(str, requestBody$Companion$toRequestBody$3, ProductionEndpoint.TransitionBack, realFallbackModeManager$transitionBack$1);
    }

    @Override // com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiController
    public final Object transitionWithRequestBody(String str, RequestBody requestBody, RealFallbackModeManager$transition$1 realFallbackModeManager$transition$1) {
        return transition(str, requestBody, ProductionEndpoint.Transition, realFallbackModeManager$transition$1);
    }
}
