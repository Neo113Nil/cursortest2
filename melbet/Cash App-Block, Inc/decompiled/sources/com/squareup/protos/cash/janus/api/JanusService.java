package com.squareup.protos.cash.janus.api;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.GetLinkedAccountsRequest;
import com.squareup.protos.franklin.app.GetLinkedAccountsResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/janus/api/JanusService;", "", "Lcom/squareup/protos/franklin/app/GetLinkedAccountsRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/franklin/app/GetLinkedAccountsResponse;", "getLinkedAccounts", "(Lcom/squareup/protos/franklin/app/GetLinkedAccountsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/franklin/api/ClientScenario;", "clientScenario", "", "flowToken", "Lcom/squareup/protos/cash/janus/api/RegisterProspectTokenRequest;", "Lcom/squareup/protos/cash/janus/api/RegisterProspectTokenResponse;", "registerProspectToken", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/cash/janus/api/RegisterProspectTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/janus/api/GetPublicContactAliasesRequest;", "Lcom/squareup/protos/cash/janus/api/GetContactAliasesResponse;", "getPublicContactAliases", "(Lcom/squareup/protos/cash/janus/api/GetPublicContactAliasesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/janus/api/SwitchAccountRequest;", "Lcom/squareup/protos/cash/janus/api/SwitchAccountResponse;", "switchAccount", "(Ljava/lang/String;Lcom/squareup/protos/cash/janus/api/SwitchAccountRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/janus/api/GetAccountSettingsRequest;", "Lcom/squareup/protos/cash/janus/api/GetAccountSettingsResponse;", "getAccountSettings", "(Lcom/squareup/protos/cash/janus/api/GetAccountSettingsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/janus/api/GetAuthorizedAccountRequest;", "Lcom/squareup/protos/cash/janus/api/GetAuthorizedAccountResponse;", "getAuthorizedAccount", "(Lcom/squareup/protos/cash/janus/api/GetAuthorizedAccountRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface JanusService {
    @POST("/cash-app/security/1.0/get-account-settings")
    Object getAccountSettings(@Body GetAccountSettingsRequest getAccountSettingsRequest, Continuation<? super ApiResult<GetAccountSettingsResponse>> continuation);

    @POST("/cash-app/security/1.0/get-authorized-account")
    Object getAuthorizedAccount(@Body GetAuthorizedAccountRequest getAuthorizedAccountRequest, Continuation<? super ApiResult<GetAuthorizedAccountResponse>> continuation);

    @POST("/cash-app/security/1.0/get-linked-accounts")
    Object getLinkedAccounts(@Body GetLinkedAccountsRequest getLinkedAccountsRequest, Continuation<? super ApiResult<GetLinkedAccountsResponse>> continuation);

    @POST("/cash-app/aliases/1.0/get-contact-aliases")
    Object getPublicContactAliases(@Body GetPublicContactAliasesRequest getPublicContactAliasesRequest, Continuation<? super ApiResult<GetContactAliasesResponse>> continuation);

    @POST("/cash-app/janus/register-prospect-token")
    Object registerProspectToken(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body RegisterProspectTokenRequest registerProspectTokenRequest, Continuation<? super ApiResult<RegisterProspectTokenResponse>> continuation);

    @POST("cash-app/security/1.0/switch-account")
    Object switchAccount(@Header("Cash-Flow-Token") String str, @Body SwitchAccountRequest switchAccountRequest, Continuation<? super ApiResult<SwitchAccountResponse>> continuation);
}
