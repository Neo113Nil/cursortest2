package com.squareup.protos.cash.aegis.service;

import app.cash.api.ApiResult;
import com.squareup.protos.cash.aegis.api.AddOrWithdrawMoneyForManagedAccountRequest;
import com.squareup.protos.cash.aegis.api.AddOrWithdrawMoneyForManagedAccountResponse;
import com.squareup.protos.cash.aegis.api.GetAllowlistLimitForDependentRequest;
import com.squareup.protos.cash.aegis.api.GetAllowlistLimitForDependentResponse;
import com.squareup.protos.cash.aegis.api.GetCustomLimitsRequest;
import com.squareup.protos.cash.aegis.api.GetCustomLimitsResponse;
import com.squareup.protos.cash.aegis.api.GetFamilyAccountSponsorRequest;
import com.squareup.protos.cash.aegis.api.GetFamilyAccountSponsorResponse;
import com.squareup.protos.cash.aegis.api.GetFamilyAccountsRequest;
import com.squareup.protos.cash.aegis.api.GetFamilyAccountsResponse;
import com.squareup.protos.cash.aegis.api.GetFamilyPendingRequestsRequest;
import com.squareup.protos.cash.aegis.api.GetFamilyPendingRequestsResponse;
import com.squareup.protos.cash.aegis.api.GetSafetyEducationHubRequest;
import com.squareup.protos.cash.aegis.api.GetSafetyEducationHubResponse;
import com.squareup.protos.cash.aegis.api.ModifyAllowlistForDependentRequest;
import com.squareup.protos.cash.aegis.api.ModifyAllowlistForDependentResponse;
import com.squareup.protos.cash.aegis.api.SelectAllowlistCustomersRequest;
import com.squareup.protos.cash.aegis.api.SelectAllowlistCustomersResponse;
import com.squareup.protos.cash.aegis.api.SelectDependentsRequest;
import com.squareup.protos.cash.aegis.api.SelectDependentsResponse;
import com.squareup.protos.cash.aegis.api.SetCustomLimitsRequest;
import com.squareup.protos.cash.aegis.api.SetCustomLimitsResponse;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ2\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0005\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017J2\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0005\u001a\u00020\u001aH§@¢\u0006\u0002\u0010\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u001eH§@¢\u0006\u0002\u0010\u001fJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\"H§@¢\u0006\u0002\u0010#J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010\u0005\u001a\u00020&H§@¢\u0006\u0002\u0010'J2\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0005\u001a\u00020*H§@¢\u0006\u0002\u0010+J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00032\b\b\u0001\u0010\u0005\u001a\u00020.H§@¢\u0006\u0002\u0010/J\u001e\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u0005\u001a\u000202H§@¢\u0006\u0002\u00103¨\u00064À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/aegis/service/AegisService;", "", "getFamilyAccounts", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/aegis/api/GetFamilyAccountsResponse;", "request", "Lcom/squareup/protos/cash/aegis/api/GetFamilyAccountsRequest;", "(Lcom/squareup/protos/cash/aegis/api/GetFamilyAccountsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSafetyEducationHub", "Lcom/squareup/protos/cash/aegis/api/GetSafetyEducationHubResponse;", "Lcom/squareup/protos/cash/aegis/api/GetSafetyEducationHubRequest;", "(Lcom/squareup/protos/cash/aegis/api/GetSafetyEducationHubRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFamilyPendingRequests", "Lcom/squareup/protos/cash/aegis/api/GetFamilyPendingRequestsResponse;", "Lcom/squareup/protos/cash/aegis/api/GetFamilyPendingRequestsRequest;", "(Lcom/squareup/protos/cash/aegis/api/GetFamilyPendingRequestsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectDependents", "Lcom/squareup/protos/cash/aegis/api/SelectDependentsResponse;", "clientScenario", "Lcom/squareup/protos/franklin/api/ClientScenario;", "flowToken", "", "Lcom/squareup/protos/cash/aegis/api/SelectDependentsRequest;", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/cash/aegis/api/SelectDependentsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectAllowlistCustomers", "Lcom/squareup/protos/cash/aegis/api/SelectAllowlistCustomersResponse;", "Lcom/squareup/protos/cash/aegis/api/SelectAllowlistCustomersRequest;", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/cash/aegis/api/SelectAllowlistCustomersRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFamilyAccountSponsor", "Lcom/squareup/protos/cash/aegis/api/GetFamilyAccountSponsorResponse;", "Lcom/squareup/protos/cash/aegis/api/GetFamilyAccountSponsorRequest;", "(Lcom/squareup/protos/cash/aegis/api/GetFamilyAccountSponsorRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomLimits", "Lcom/squareup/protos/cash/aegis/api/GetCustomLimitsResponse;", "Lcom/squareup/protos/cash/aegis/api/GetCustomLimitsRequest;", "(Lcom/squareup/protos/cash/aegis/api/GetCustomLimitsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCustomLimits", "Lcom/squareup/protos/cash/aegis/api/SetCustomLimitsResponse;", "Lcom/squareup/protos/cash/aegis/api/SetCustomLimitsRequest;", "(Lcom/squareup/protos/cash/aegis/api/SetCustomLimitsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addOrWithdrawMoneyForManagedAccount", "Lcom/squareup/protos/cash/aegis/api/AddOrWithdrawMoneyForManagedAccountResponse;", "Lcom/squareup/protos/cash/aegis/api/AddOrWithdrawMoneyForManagedAccountRequest;", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/cash/aegis/api/AddOrWithdrawMoneyForManagedAccountRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllowlistLimitForDependent", "Lcom/squareup/protos/cash/aegis/api/GetAllowlistLimitForDependentResponse;", "Lcom/squareup/protos/cash/aegis/api/GetAllowlistLimitForDependentRequest;", "(Lcom/squareup/protos/cash/aegis/api/GetAllowlistLimitForDependentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "modifyAllowlistForDependent", "Lcom/squareup/protos/cash/aegis/api/ModifyAllowlistForDependentResponse;", "Lcom/squareup/protos/cash/aegis/api/ModifyAllowlistForDependentRequest;", "(Lcom/squareup/protos/cash/aegis/api/ModifyAllowlistForDependentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AegisService {
    @POST("/cash-app/aegis/add-or-withdraw-money-for-managed-account")
    Object addOrWithdrawMoneyForManagedAccount(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body AddOrWithdrawMoneyForManagedAccountRequest addOrWithdrawMoneyForManagedAccountRequest, Continuation<? super ApiResult<AddOrWithdrawMoneyForManagedAccountResponse>> continuation);

    @POST("/cash-app/aegis/get-allowlist-limit-for-dependent")
    Object getAllowlistLimitForDependent(@Body GetAllowlistLimitForDependentRequest getAllowlistLimitForDependentRequest, Continuation<? super ApiResult<GetAllowlistLimitForDependentResponse>> continuation);

    @POST("/cash-app/aegis/get-custom-limits")
    Object getCustomLimits(@Body GetCustomLimitsRequest getCustomLimitsRequest, Continuation<? super ApiResult<GetCustomLimitsResponse>> continuation);

    @POST("/cash-app/aegis/get-family-account-sponsor")
    Object getFamilyAccountSponsor(@Body GetFamilyAccountSponsorRequest getFamilyAccountSponsorRequest, Continuation<? super ApiResult<GetFamilyAccountSponsorResponse>> continuation);

    @POST("/cash-app/aegis/get-family-accounts")
    Object getFamilyAccounts(@Body GetFamilyAccountsRequest getFamilyAccountsRequest, Continuation<? super ApiResult<GetFamilyAccountsResponse>> continuation);

    @POST("/cash-app/aegis/get-family-pending-requests")
    Object getFamilyPendingRequests(@Body GetFamilyPendingRequestsRequest getFamilyPendingRequestsRequest, Continuation<? super ApiResult<GetFamilyPendingRequestsResponse>> continuation);

    @POST("/cash-app/aegis/get-safety-education-hub")
    Object getSafetyEducationHub(@Body GetSafetyEducationHubRequest getSafetyEducationHubRequest, Continuation<? super ApiResult<GetSafetyEducationHubResponse>> continuation);

    @POST("/cash-app/aegis/modify-allowlist-for-dependent")
    Object modifyAllowlistForDependent(@Body ModifyAllowlistForDependentRequest modifyAllowlistForDependentRequest, Continuation<? super ApiResult<ModifyAllowlistForDependentResponse>> continuation);

    @POST("/cash-app/aegis/select-allowlist-customers")
    Object selectAllowlistCustomers(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body SelectAllowlistCustomersRequest selectAllowlistCustomersRequest, Continuation<? super ApiResult<SelectAllowlistCustomersResponse>> continuation);

    @POST("/cash-app/aegis/select-dependents")
    Object selectDependents(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body SelectDependentsRequest selectDependentsRequest, Continuation<? super ApiResult<SelectDependentsResponse>> continuation);

    @POST("/cash-app/aegis/set-custom-limits")
    Object setCustomLimits(@Body SetCustomLimitsRequest setCustomLimitsRequest, Continuation<? super ApiResult<SetCustomLimitsResponse>> continuation);
}
