package com.squareup.protos.cash.cashface.api;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\u0007\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/cashface/api/CashFaceClientService;", "", "Lcom/squareup/protos/franklin/api/ClientScenario;", "clientScenario", "", "flowToken", "Lcom/squareup/protos/cash/cashface/api/ReportProfileRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/cashface/api/ReportProfileResponse;", "reportProfile", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/cash/cashface/api/ReportProfileRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/cashface/api/GetProfileDetailsRequest;", "Lcom/squareup/protos/cash/cashface/api/GetProfileDetailsResponse;", "getProfileDetails", "(Lcom/squareup/protos/cash/cashface/api/GetProfileDetailsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/cashface/api/GetGenericElementTreeRequest;", "Lcom/squareup/protos/cash/cashface/api/GetGenericElementTreeResponse;", "getGenericElementTree", "(Lcom/squareup/protos/cash/cashface/api/GetGenericElementTreeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CashFaceClientService {
    @POST("/cash-app/profiles/get-generic-element-tree")
    Object getGenericElementTree(@Body GetGenericElementTreeRequest getGenericElementTreeRequest, Continuation<? super ApiResult<GetGenericElementTreeResponse>> continuation);

    @POST("/cash-app/profiles/get-profile-details")
    Object getProfileDetails(@Body GetProfileDetailsRequest getProfileDetailsRequest, Continuation<? super ApiResult<GetProfileDetailsResponse>> continuation);

    @POST("/cash-app/profiles/report-profile")
    Object reportProfile(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body ReportProfileRequest reportProfileRequest, Continuation<? super ApiResult<ReportProfileResponse>> continuation);
}
