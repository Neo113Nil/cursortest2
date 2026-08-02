package com.squareup.protos.cash.bankingbenefits.api.v1_0;

import app.cash.api.ApiResult;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsHubRequest;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsHubResponse;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBenefitLeafletRequest;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBenefitLeafletResponse;
import com.squareup.cash.bankingbenefits.api.v1_0.app.RefreshCashGreenSyncValuesRequest;
import com.squareup.cash.bankingbenefits.api.v1_0.app.RefreshCashGreenSyncValuesResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/bankingbenefits/api/v1_0/BankingBenefitsAppService;", "", "Lcom/squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHubRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHubResponse;", "getBankingBenefitsHub", "(Lcom/squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHubRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/cash/bankingbenefits/api/v1_0/app/GetBenefitLeafletRequest;", "Lcom/squareup/cash/bankingbenefits/api/v1_0/app/GetBenefitLeafletResponse;", "getBenefitLeaflet", "(Lcom/squareup/cash/bankingbenefits/api/v1_0/app/GetBenefitLeafletRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/cash/bankingbenefits/api/v1_0/app/RefreshCashGreenSyncValuesRequest;", "Lcom/squareup/cash/bankingbenefits/api/v1_0/app/RefreshCashGreenSyncValuesResponse;", "refreshCashGreenSyncValues", "(Lcom/squareup/cash/bankingbenefits/api/v1_0/app/RefreshCashGreenSyncValuesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BankingBenefitsAppService {
    @POST("/cash-app/banking-benefits/v1.0/app/get-banking-benefits-hub")
    Object getBankingBenefitsHub(@Body GetBankingBenefitsHubRequest getBankingBenefitsHubRequest, Continuation<? super ApiResult<GetBankingBenefitsHubResponse>> continuation);

    @POST("/cash-app/banking-benefits/v1.0/app/get-benefit-leaflet")
    Object getBenefitLeaflet(@Body GetBenefitLeafletRequest getBenefitLeafletRequest, Continuation<? super ApiResult<GetBenefitLeafletResponse>> continuation);

    @POST("/cash-app/banking-benefits/v1.0/app/refresh-cash-green-sync-values")
    Object refreshCashGreenSyncValues(@Body RefreshCashGreenSyncValuesRequest refreshCashGreenSyncValuesRequest, Continuation<? super ApiResult<RefreshCashGreenSyncValuesResponse>> continuation);
}
