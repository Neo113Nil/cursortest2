package com.squareup.protos.cash.taply.app.v1;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/taply/app/v1/PaymentTokenDeviceProvisioningService;", "", "onFidesmoProvisioningStart", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/taply/app/v1/OnFidesmoProvisioningStartResponse;", "request", "Lcom/squareup/protos/cash/taply/app/v1/OnFidesmoProvisioningStartRequest;", "(Lcom/squareup/protos/cash/taply/app/v1/OnFidesmoProvisioningStartRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomerDetailsForDeprovisioning", "Lcom/squareup/protos/cash/taply/app/v1/GetCustomerDetailsForDeprovisioningResponse;", "Lcom/squareup/protos/cash/taply/app/v1/GetCustomerDetailsForDeprovisioningRequest;", "(Lcom/squareup/protos/cash/taply/app/v1/GetCustomerDetailsForDeprovisioningRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PaymentTokenDeviceProvisioningService {
    @POST("/cash-app/taply/v1.0/get-customer-details-for-deprovisioning")
    Object getCustomerDetailsForDeprovisioning(@Body GetCustomerDetailsForDeprovisioningRequest getCustomerDetailsForDeprovisioningRequest, Continuation<? super ApiResult<GetCustomerDetailsForDeprovisioningResponse>> continuation);

    @POST("/cash-app/taply/v1.0/on-fidesmo-provisioning-start")
    Object onFidesmoProvisioningStart(@Body OnFidesmoProvisioningStartRequest onFidesmoProvisioningStartRequest, Continuation<? super ApiResult<OnFidesmoProvisioningStartResponse>> continuation);
}
