package com.withpersona.sdk2.inquiry.tracking.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;", "", "getPublicKey", "Lretrofit2/Response;", "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;", "sessionToken", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvents", "Lokhttp3/ResponseBody;", "request", "Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface TrackingEventsServiceApi {
    @GET("/public-key")
    Object getPublicKey(@Header("Authorization") String str, Continuation<? super Response<PublicKeyResponse>> continuation);

    @POST("/v1/t")
    Object sendEvents(@Header("Authorization") String str, @Body EncryptedTrackingEventsRequest encryptedTrackingEventsRequest, Continuation<? super Response<ResponseBody>> continuation);
}
