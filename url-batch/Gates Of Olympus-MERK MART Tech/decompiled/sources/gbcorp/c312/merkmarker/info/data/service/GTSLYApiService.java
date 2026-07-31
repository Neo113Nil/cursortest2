package gbcorp.c312.merkmarker.info.data.service;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: GTSLYApiService.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J2\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/service/GTSLYApiService;", "", "install", "Lretrofit2/Response;", "Lgbcorp/c312/merkmarker/info/data/service/GTSLYResponse;", "request", "Lgbcorp/c312/merkmarker/info/data/service/GTSLYRequest;", "(Lgbcorp/c312/merkmarker/info/data/service/GTSLYRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "visit", "", "pushId", "", "withLink", "", "Lgbcorp/c312/merkmarker/info/data/service/GTSLYVisitRequest;", "(Ljava/lang/String;ZLgbcorp/c312/merkmarker/info/data/service/GTSLYVisitRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface GTSLYApiService {
    @POST("/v1/public/install")
    Object install(@Body GTSLYRequest gTSLYRequest, Continuation<? super Response<GTSLYResponse>> continuation);

    @POST("/v1/public/refresh")
    Object refresh(@Body GTSLYRequest gTSLYRequest, Continuation<? super Response<GTSLYResponse>> continuation);

    @POST("/v1/public/push/visit")
    Object visit(@Query("id") String str, @Query("withlink") boolean z, @Body GTSLYVisitRequest gTSLYVisitRequest, Continuation<? super Response<Unit>> continuation);
}
