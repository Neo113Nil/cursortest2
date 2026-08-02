package com.withpersona.sdk2.inquiry.sandbox;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$3;
import okhttp3.Response;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http.RealInterceptorChain;
import okio.Buffer;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final /* synthetic */ class SandboxModule$$ExternalSyntheticLambda0 implements Interceptor {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SandboxModule$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        String str;
        Response responseInterceptor$lambda$9;
        Response interceptor$lambda$10;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                SandboxFlags sandboxFlags = (SandboxFlags) obj;
                RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
                Request request = realInterceptorChain.request;
                RequestBody requestBody = request.body;
                String str2 = request.method;
                HttpUrl httpUrl = request.url;
                if ((!Intrinsics.areEqual(CollectionsKt.last((List) httpUrl.pathSegments), "transition") && !Intrinsics.areEqual(CollectionsKt.last((List) httpUrl.pathSegments), "government-id-classification")) || requestBody == null || !sandboxFlags.isSandboxModeEnabled) {
                    return realInterceptorChain.proceed(request);
                }
                SandboxFlags.ForcedStatus forcedStatus = sandboxFlags.debugForcedStatus;
                forcedStatus.getClass();
                int ordinal = forcedStatus.ordinal();
                if (ordinal == 0) {
                    str = "failed";
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    str = "passed";
                }
                MediaType contentType = requestBody.contentType();
                String str3 = contentType != null ? contentType.subtype : null;
                if (!Intrinsics.areEqual(str3, "form-data")) {
                    if (!Intrinsics.areEqual(str3, "json")) {
                        return realInterceptorChain.proceed(request);
                    }
                    Buffer buffer = new Buffer();
                    requestBody.writeTo(buffer);
                    JSONObject jSONObject = new JSONObject(buffer.readUtf8());
                    JSONObject optJSONObject = jSONObject.optJSONObject("meta");
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                    }
                    optJSONObject.put("workflowInitialVariables", new JSONObject().put("debugForcedStatus", str));
                    jSONObject.put("meta", optJSONObject);
                    RequestBody.Companion companion = RequestBody.Companion;
                    String jSONObject2 = jSONObject.toString();
                    jSONObject2.getClass();
                    MediaType contentType2 = requestBody.contentType();
                    companion.getClass();
                    RequestBody$Companion$toRequestBody$3 create = RequestBody.Companion.create(jSONObject2, contentType2);
                    Request.Builder newBuilder = request.newBuilder();
                    newBuilder.method(str2, create);
                    return realInterceptorChain.proceed(new Request(newBuilder));
                }
                MultipartBody multipartBody = (MultipartBody) requestBody;
                String m = Boxes$$ExternalSyntheticOutline1.m();
                ByteString.Companion companion2 = ByteString.Companion;
                ByteString encodeUtf8 = ByteString.Companion.encodeUtf8(m);
                MediaType mediaType = MultipartBody.MIXED;
                ArrayList arrayList = new ArrayList();
                MediaType mediaType2 = multipartBody.f1546type;
                mediaType2.getClass();
                if (!Intrinsics.areEqual(mediaType2.f1545type, "multipart")) {
                    Path$$ExternalSyntheticBUOutline0.m$3(mediaType2, "multipart != ");
                    return null;
                }
                for (MultipartBody.Part part : multipartBody.parts) {
                    part.getClass();
                    arrayList.add(part);
                }
                arrayList.add(MultipartBody.Part.Companion.createFormData("meta[workflowInitialVariables][debugForcedStatus]", str));
                if (arrayList.isEmpty()) {
                    a$$ExternalSyntheticBUOutline0.m$1("Multipart body must have at least one part.");
                    return null;
                }
                MultipartBody multipartBody2 = new MultipartBody(encodeUtf8, mediaType2, _UtilJvmKt.toImmutableList(arrayList));
                Request.Builder newBuilder2 = request.newBuilder();
                newBuilder2.method(str2, multipartBody2);
                return realInterceptorChain.proceed(new Request(newBuilder2));
            case 1:
                responseInterceptor$lambda$9 = NetworkCoreModule.responseInterceptor$lambda$9((NetworkCoreModule) obj, (RealInterceptorChain) chain);
                return responseInterceptor$lambda$9;
            default:
                interceptor$lambda$10 = NetworkCoreModule.interceptor$lambda$10((Moshi) obj, (RealInterceptorChain) chain);
                return interceptor$lambda$10;
        }
    }
}
