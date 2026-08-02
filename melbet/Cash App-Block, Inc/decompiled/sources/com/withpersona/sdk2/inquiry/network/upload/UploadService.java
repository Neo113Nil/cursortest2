package com.withpersona.sdk2.inquiry.network.upload;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import retrofit2.Response;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Url;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;", "", "upload", "Lretrofit2/Response;", "Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;", "url", "", "image", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface UploadService {
    @Headers({"Accept: multipart/form-data"})
    @POST
    @Multipart
    Object upload(@Url String str, @Part MultipartBody.Part part, Continuation<? super Response<UploadResponse>> continuation);
}
