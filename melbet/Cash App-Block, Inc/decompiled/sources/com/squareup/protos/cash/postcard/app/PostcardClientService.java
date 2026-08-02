package com.squareup.protos.cash.postcard.app;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\u0007\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\b2\b\b\u0001\u0010\u0007\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/postcard/app/PostcardClientService;", "", "Lcom/squareup/protos/franklin/api/ClientScenario;", "clientScenario", "", "flowToken", "Lcom/squareup/protos/cash/postcard/app/GetCardDetailsRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/postcard/app/GetCardDetailsResponse;", "getCardDetails", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/cash/postcard/app/GetCardDetailsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/postcard/app/RefreshCardTabSchemeRequest;", "Lcom/squareup/protos/cash/postcard/app/RefreshCardTabSchemeResponse;", "refreshCardTabScheme", "(Lcom/squareup/protos/cash/postcard/app/RefreshCardTabSchemeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/postcard/app/FamilyAccountsLockIssuedCardsRequest;", "Lcom/squareup/protos/cash/postcard/app/FamilyAccountsLockIssuedCardsResponse;", "familyAccountsLockIssuedCards", "(Lcom/squareup/protos/cash/postcard/app/FamilyAccountsLockIssuedCardsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/postcard/app/FamilyAccountsUnlockIssuedCardsRequest;", "Lcom/squareup/protos/cash/postcard/app/FamilyAccountsUnlockIssuedCardsResponse;", "familyAccountsUnlockIssuedCards", "(Lcom/squareup/protos/cash/postcard/app/FamilyAccountsUnlockIssuedCardsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/postcard/app/GetAppThemesRequest;", "Lcom/squareup/protos/cash/postcard/app/GetAppThemesResponse;", "getAppThemes", "(Lcom/squareup/protos/cash/postcard/app/GetAppThemesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/postcard/app/CreateKnotSessionRequest;", "Lcom/squareup/protos/cash/postcard/app/CreateKnotSessionResponse;", "createKnotSession", "(Lcom/squareup/protos/cash/postcard/app/CreateKnotSessionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PostcardClientService {
    @POST("/cash-app/postcard/knot/v1/create-session")
    Object createKnotSession(@Body CreateKnotSessionRequest createKnotSessionRequest, Continuation<? super ApiResult<CreateKnotSessionResponse>> continuation);

    @POST("/cash-app/postcard/family-accounts-lock-issued-cards")
    Object familyAccountsLockIssuedCards(@Body FamilyAccountsLockIssuedCardsRequest familyAccountsLockIssuedCardsRequest, Continuation<? super ApiResult<FamilyAccountsLockIssuedCardsResponse>> continuation);

    @POST("/cash-app/postcard/family-accounts-unlock-issued-cards")
    Object familyAccountsUnlockIssuedCards(@Body FamilyAccountsUnlockIssuedCardsRequest familyAccountsUnlockIssuedCardsRequest, Continuation<? super ApiResult<FamilyAccountsUnlockIssuedCardsResponse>> continuation);

    @POST("/cash-app/postcard/app-themes")
    Object getAppThemes(@Body GetAppThemesRequest getAppThemesRequest, Continuation<? super ApiResult<GetAppThemesResponse>> continuation);

    @POST("/cash-app/postcard/get-card-details")
    Object getCardDetails(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body GetCardDetailsRequest getCardDetailsRequest, Continuation<? super ApiResult<GetCardDetailsResponse>> continuation);

    @POST("/cash-app/postcard/refresh-card-tab")
    Object refreshCardTabScheme(@Body RefreshCardTabSchemeRequest refreshCardTabSchemeRequest, Continuation<? super ApiResult<RefreshCardTabSchemeResponse>> continuation);
}
