package com.squareup.cash.work.service.api.payroll;

import app.cash.api.ApiResult;
import com.squareup.cash.work.service.api.SquareMerchantToken;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JL\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/squareup/cash/work/service/api/payroll/PayrollJsonService;", "", "getTeamStubs", "Lapp/cash/api/ApiResult;", "Lcom/squareup/cash/work/service/api/payroll/PayStubsResponse;", "merchantToken", "", "squareMerchantToken", "Lcom/squareup/cash/work/service/api/SquareMerchantToken;", "limit", "", "cursor", "sortOrder", "(Ljava/lang/String;Lcom/squareup/cash/work/service/api/SquareMerchantToken;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PayrollJsonService {
    @GET("/proxy/api/v1/employees/payroll/m/{merchantToken}/team/stubs")
    Object getTeamStubs(@Path("merchantToken") String str, @Tag SquareMerchantToken squareMerchantToken, @Query("limit") Integer num, @Query("cursor") String str2, @Query("sort_order") String str3, Continuation<? super ApiResult<PayStubsResponse>> continuation);
}
