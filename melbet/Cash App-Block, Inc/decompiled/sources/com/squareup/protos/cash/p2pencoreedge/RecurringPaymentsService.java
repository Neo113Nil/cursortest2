package com.squareup.protos.cash.p2pencoreedge;

import app.cash.api.ApiResult;
import com.squareup.protos.cash.p2pencoreedge.plasma.SetRecurringPaymentPreferencesRequest;
import com.squareup.protos.cash.p2pencoreedge.plasma.SetRecurringPaymentPreferencesResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\fH§@¢\u0006\u0002\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/p2pencoreedge/RecurringPaymentsService;", "", "getRecurringPayments", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/p2pencoreedge/GetRecurringPaymentsResponse;", "request", "Lcom/squareup/protos/cash/p2pencoreedge/GetRecurringPaymentsRequest;", "(Lcom/squareup/protos/cash/p2pencoreedge/GetRecurringPaymentsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setRecurringPaymentPreferences", "Lcom/squareup/protos/cash/p2pencoreedge/plasma/SetRecurringPaymentPreferencesResponse;", "flowToken", "", "Lcom/squareup/protos/cash/p2pencoreedge/plasma/SetRecurringPaymentPreferencesRequest;", "(Ljava/lang/String;Lcom/squareup/protos/cash/p2pencoreedge/plasma/SetRecurringPaymentPreferencesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface RecurringPaymentsService {
    @POST("/cash-app/p2p-encore-edge/get-recurring-payments")
    Object getRecurringPayments(@Body GetRecurringPaymentsRequest getRecurringPaymentsRequest, Continuation<? super ApiResult<GetRecurringPaymentsResponse>> continuation);

    @POST("/cash-app/p2p-encore-edge/set-recurring-payment-preferences")
    Object setRecurringPaymentPreferences(@Header("Cash-Flow-Token") String str, @Body SetRecurringPaymentPreferencesRequest setRecurringPaymentPreferencesRequest, Continuation<? super ApiResult<SetRecurringPaymentPreferencesResponse>> continuation);
}
