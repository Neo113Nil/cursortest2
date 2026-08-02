package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import app.cash.api.ApiResult;
import com.squareup.protos.hieroglyph.service.ProvisionKeysRequest;
import com.squareup.protos.hieroglyph.service.ProvisionKeysResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/cashbusinesspayments/api/v1beta1/CashBusinessPaymentsClientService;", "", "Lcom/squareup/protos/cash/cashbusinesspayments/api/v1beta1/CreatePaymentRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/cashbusinesspayments/api/v1beta1/CreatePaymentResponse;", "createPayment", "(Lcom/squareup/protos/cash/cashbusinesspayments/api/v1beta1/CreatePaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/hieroglyph/service/ProvisionKeysRequest;", "Lcom/squareup/protos/hieroglyph/service/ProvisionKeysResponse;", "provisionKeys", "(Lcom/squareup/protos/hieroglyph/service/ProvisionKeysRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/cashbusinesspayments/api/v1beta1/ValidateTapToPayPolicyRequest;", "Lcom/squareup/protos/cash/cashbusinesspayments/api/v1beta1/ValidateTapToPayPolicyResponse;", "validateTapToPayPolicy", "(Lcom/squareup/protos/cash/cashbusinesspayments/api/v1beta1/ValidateTapToPayPolicyRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CashBusinessPaymentsClientService {
    @POST("/cash-app/business-payments/create-payment")
    Object createPayment(@Body CreatePaymentRequest createPaymentRequest, Continuation<? super ApiResult<CreatePaymentResponse>> continuation);

    @POST("/cash-app/business-payments/provision-keys")
    Object provisionKeys(@Body ProvisionKeysRequest provisionKeysRequest, Continuation<? super ApiResult<ProvisionKeysResponse>> continuation);

    @POST("/cash-app/business-payments/validate-ttp-policy")
    Object validateTapToPayPolicy(@Body ValidateTapToPayPolicyRequest validateTapToPayPolicyRequest, Continuation<? super ApiResult<ValidateTapToPayPolicyResponse>> continuation);
}
