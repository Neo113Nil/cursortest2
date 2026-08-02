package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.InquiryFieldMap;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001:\u0007\u001c\u001d\u001e\u001f !\"J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ>\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0005\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusRequest;", "request", "Lretrofit2/Response;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "checkStatus", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "createSession", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authHeader", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ProductionEndpoint;", "productionEndpoint", "", "requestCount", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "acquireUploadUrl", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ProductionEndpoint;ILcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "url", "Lokhttp3/RequestBody;", "body", "upload", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "UploadUrlResponse", "UploadUrlRequest", "StatusRequest", "StatusResponse", "StaticTemplate", "SessionIdRequest", "SessionIdResponse", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface FallbackModeService {

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJz\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;", "", "", "inquiryTemplateId", "inquiryTemplateVersion", "inquiryId", "referenceId", "accountId", "environment", "environmentId", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;", "fields", "themeSetId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SessionIdRequest {
        public final String accountId;
        public final String environment;
        public final String environmentId;
        public final InquiryFieldMap fields;
        public final String inquiryId;
        public final String inquiryTemplateId;
        public final String inquiryTemplateVersion;
        public final String referenceId;
        public final String themeSetId;

        public SessionIdRequest(@Json(name = "inquiry-template-id") String str, @Json(name = "inquiry-template-version-id") String str2, @Json(name = "inquiry-id") String str3, @Json(name = "reference-id") String str4, @Json(name = "account-id") String str5, String str6, @Json(name = "environment-id") String str7, InquiryFieldMap inquiryFieldMap, @Json(name = "theme-set-id") String str8) {
            str.getClass();
            this.inquiryTemplateId = str;
            this.inquiryTemplateVersion = str2;
            this.inquiryId = str3;
            this.referenceId = str4;
            this.accountId = str5;
            this.environment = str6;
            this.environmentId = str7;
            this.fields = inquiryFieldMap;
            this.themeSetId = str8;
        }

        public final SessionIdRequest copy(@Json(name = "inquiry-template-id") String inquiryTemplateId, @Json(name = "inquiry-template-version-id") String inquiryTemplateVersion, @Json(name = "inquiry-id") String inquiryId, @Json(name = "reference-id") String referenceId, @Json(name = "account-id") String accountId, String environment, @Json(name = "environment-id") String environmentId, InquiryFieldMap fields, @Json(name = "theme-set-id") String themeSetId) {
            inquiryTemplateId.getClass();
            return new SessionIdRequest(inquiryTemplateId, inquiryTemplateVersion, inquiryId, referenceId, accountId, environment, environmentId, fields, themeSetId);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionIdRequest)) {
                return false;
            }
            SessionIdRequest sessionIdRequest = (SessionIdRequest) obj;
            return Intrinsics.areEqual(this.inquiryTemplateId, sessionIdRequest.inquiryTemplateId) && Intrinsics.areEqual(this.inquiryTemplateVersion, sessionIdRequest.inquiryTemplateVersion) && Intrinsics.areEqual(this.inquiryId, sessionIdRequest.inquiryId) && Intrinsics.areEqual(this.referenceId, sessionIdRequest.referenceId) && Intrinsics.areEqual(this.accountId, sessionIdRequest.accountId) && Intrinsics.areEqual(this.environment, sessionIdRequest.environment) && Intrinsics.areEqual(this.environmentId, sessionIdRequest.environmentId) && Intrinsics.areEqual(this.fields, sessionIdRequest.fields) && Intrinsics.areEqual(this.themeSetId, sessionIdRequest.themeSetId);
        }

        public final int hashCode() {
            int hashCode = this.inquiryTemplateId.hashCode() * 31;
            String str = this.inquiryTemplateVersion;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.inquiryId;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.referenceId;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.accountId;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.environment;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.environmentId;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            InquiryFieldMap inquiryFieldMap = this.fields;
            int hashCode8 = (hashCode7 + (inquiryFieldMap == null ? 0 : inquiryFieldMap.hashCode())) * 31;
            String str7 = this.themeSetId;
            return hashCode8 + (str7 != null ? str7.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SessionIdRequest(inquiryTemplateId=", this.inquiryTemplateId, ", inquiryTemplateVersion=", this.inquiryTemplateVersion, ", inquiryId=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.inquiryId, ", referenceId=", this.referenceId, ", accountId=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.accountId, ", environment=", this.environment, ", environmentId=");
            m.append(this.environmentId);
            m.append(", fields=");
            m.append(this.fields);
            m.append(", themeSetId=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.themeSetId, ")");
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SessionIdResponse {
        public final String token;

        public SessionIdResponse(String str) {
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SessionIdResponse) && this.token.equals(((SessionIdResponse) obj).token);
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SessionIdResponse(token=", this.token, ")");
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;", "", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StaticTemplate {
        public final List steps;

        public StaticTemplate(List list) {
            this.steps = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StaticTemplate) && this.steps.equals(((StaticTemplate) obj).steps);
        }

        public final int hashCode() {
            return this.steps.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("StaticTemplate(steps=", ")", this.steps);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusRequest;", "", "", "inquiryTemplateId", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusRequest;", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StatusRequest {
        public final String inquiryTemplateId;

        public StatusRequest(@Json(name = "inquiry-template-id") String str) {
            this.inquiryTemplateId = str;
        }

        public final StatusRequest copy(@Json(name = "inquiry-template-id") String inquiryTemplateId) {
            return new StatusRequest(inquiryTemplateId);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StatusRequest) && Intrinsics.areEqual(this.inquiryTemplateId, ((StatusRequest) obj).inquiryTemplateId);
        }

        public final int hashCode() {
            String str = this.inquiryTemplateId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StatusRequest(inquiryTemplateId=", this.inquiryTemplateId, ")");
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;", "staticInquiryTemplate", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;)V", "copy", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StatusResponse {
        public final StaticTemplate staticInquiryTemplate;

        public StatusResponse(@Json(name = "static-inquiry-template") StaticTemplate staticTemplate) {
            this.staticInquiryTemplate = staticTemplate;
        }

        public final StatusResponse copy(@Json(name = "static-inquiry-template") StaticTemplate staticInquiryTemplate) {
            return new StatusResponse(staticInquiryTemplate);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StatusResponse) && Intrinsics.areEqual(this.staticInquiryTemplate, ((StatusResponse) obj).staticInquiryTemplate);
        }

        public final int hashCode() {
            StaticTemplate staticTemplate = this.staticInquiryTemplate;
            if (staticTemplate == null) {
                return 0;
            }
            return staticTemplate.steps.hashCode();
        }

        public final String toString() {
            return "StatusResponse(staticInquiryTemplate=" + this.staticInquiryTemplate + ")";
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;", "", "", "expectedContentLength", "", "expectedContentType", "<init>", "(JLjava/lang/String;)V", "copy", "(JLjava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UploadUrlRequest {
        public final long expectedContentLength;
        public final String expectedContentType;

        public UploadUrlRequest(@Json(name = "expected-content-length") long j, @Json(name = "expected-content-type") String str) {
            str.getClass();
            this.expectedContentLength = j;
            this.expectedContentType = str;
        }

        public final UploadUrlRequest copy(@Json(name = "expected-content-length") long expectedContentLength, @Json(name = "expected-content-type") String expectedContentType) {
            expectedContentType.getClass();
            return new UploadUrlRequest(expectedContentLength, expectedContentType);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UploadUrlRequest)) {
                return false;
            }
            UploadUrlRequest uploadUrlRequest = (UploadUrlRequest) obj;
            return this.expectedContentLength == uploadUrlRequest.expectedContentLength && Intrinsics.areEqual(this.expectedContentType, uploadUrlRequest.expectedContentType);
        }

        public final int hashCode() {
            return this.expectedContentType.hashCode() + (Long.hashCode(this.expectedContentLength) * 31);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("UploadUrlRequest(expectedContentLength=", this.expectedContentLength, ", expectedContentType=", this.expectedContentType);
            m.append(")");
            return m.toString();
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UploadUrlResponse {
        public final String location;

        public UploadUrlResponse(String str) {
            this.location = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UploadUrlResponse) && this.location.equals(((UploadUrlResponse) obj).location);
        }

        public final int hashCode() {
            return this.location.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UploadUrlResponse(location=", this.location, ")");
        }
    }

    @Headers({"Content-Type: application/json"})
    @POST("/part")
    Object acquireUploadUrl(@Header("Authorization") String str, @Header("Persona-Fallback-Production-Endpoint") ProductionEndpoint productionEndpoint, @Header("Persona-Fallback-Request-Count") int i, @Body UploadUrlRequest uploadUrlRequest, Continuation<? super Response<UploadUrlResponse>> continuation);

    @Headers({"Content-Type: application/json"})
    @POST("/template")
    Object checkStatus(@Header("Authorization") String str, @Body StatusRequest statusRequest, Continuation<? super Response<StatusResponse>> continuation);

    @Headers({"Content-Type: application/json"})
    @POST("/session")
    Object createSession(@Body SessionIdRequest sessionIdRequest, Continuation<? super Response<SessionIdResponse>> continuation);

    @POST
    Object upload(@Url String str, @Body RequestBody requestBody, Continuation<? super Response<Object>> continuation);
}
