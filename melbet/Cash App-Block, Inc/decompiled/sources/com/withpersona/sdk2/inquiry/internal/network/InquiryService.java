package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.ui.network.TransitionInquiryRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0002\u0010\tJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0002\u0010\u000eJ>\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0010\u001a\u00020\b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\bH§@¢\u0006\u0002\u0010\u0013J(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017J(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0019H§@¢\u0006\u0002\u0010\u001aJ2\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u001cH§@¢\u0006\u0002\u0010\u001dJ8\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\b2\u000e\b\u0001\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H§@¢\u0006\u0002\u0010\"J2\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020$H§@¢\u0006\u0002\u0010%J\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0010\u001a\u00020\bH§@¢\u0006\u0002\u0010'J(\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020)H§@¢\u0006\u0002\u0010*J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00032\b\b\u0001\u0010\u0005\u001a\u00020-H§@¢\u0006\u0002\u0010.¨\u0006/"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/InquiryService;", "", "createInquiry", "Lretrofit2/Response;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "request", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "fallbackMode", "", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createInquirySession", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;", "deviceId", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkInquiry", "sessionToken", "inquiryId", "include", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateInquiry", "Lokhttp3/ResponseBody;", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyDeviceIntegrity", "Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest;", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transition", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transitionMultipart", "body", "", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transitionBack", "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelCurrentInquirySession", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportError", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exchangeOneTimeLinkCode", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse;", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;", "(Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface InquiryService {
    @POST("/api/internal/verify/v1/current-inquiry-session/cancel")
    Object cancelCurrentInquirySession(@Header("Authorization") String str, Continuation<? super Response<ResponseBody>> continuation);

    @GET("/api/internal/verify/v1/inquiries/{inquiryId}")
    Object checkInquiry(@Header("Authorization") String str, @Header("Persona-Device-Id") String str2, @Path("inquiryId") String str3, @Query("include") String str4, Continuation<? super Response<CheckInquiryResponse>> continuation);

    @POST("/api/internal/verify/v1/inquiries")
    Object createInquiry(@Body CreateInquiryRequest createInquiryRequest, @Header("Persona-Fallback-Mode") String str, Continuation<? super Response<CheckInquiryResponse>> continuation);

    @POST("/api/internal/verify/v1/inquiry-sessions")
    Object createInquirySession(@Body CreateInquirySessionRequest createInquirySessionRequest, @Header("Persona-Device-Id") String str, Continuation<? super Response<CreateInquirySessionResponse>> continuation);

    @POST("/api/internal/verify/v1/inquiry-sessions/exchange-one-time-link-code")
    Object exchangeOneTimeLinkCode(@Body ExchangeOneTimeLinkCodeRequest exchangeOneTimeLinkCodeRequest, Continuation<? super Response<ExchangeOneTimeLinkCodeResponse>> continuation);

    @POST("/api/internal/verify/v1/current-inquiry-session/error")
    Object reportError(@Header("Authorization") String str, @Body ErrorRequest errorRequest, Continuation<? super Response<ResponseBody>> continuation);

    @POST("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    Object transition(@Header("Authorization") String str, @Path("inquiryId") String str2, @Body TransitionInquiryRequest transitionInquiryRequest, Continuation<? super Response<CheckInquiryResponse>> continuation);

    @POST("/api/internal/verify/v1/inquiries/{inquiryId}/transition-back")
    Object transitionBack(@Header("Authorization") String str, @Path("inquiryId") String str2, @Body TransitionBackRequest transitionBackRequest, Continuation<? super Response<CheckInquiryResponse>> continuation);

    @Headers({"Accept: multipart/form-data"})
    @POST("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    @Multipart
    Object transitionMultipart(@Header("Authorization") String str, @Path("inquiryId") String str2, @Part List<MultipartBody.Part> list, Continuation<? super Response<CheckInquiryResponse>> continuation);

    @PATCH("/api/internal/verify/v1/current-inquiry-session")
    Object updateInquiry(@Header("Authorization") String str, @Body UpdateInquirySessionRequest updateInquirySessionRequest, Continuation<? super Response<ResponseBody>> continuation);

    @POST("/api/internal/verify/v1/current-inquiry-session/verify-device-integrity")
    Object verifyDeviceIntegrity(@Header("Authorization") String str, @Body VerifyDeviceIntegrityRequest verifyDeviceIntegrityRequest, Continuation<? super Response<ResponseBody>> continuation);
}
