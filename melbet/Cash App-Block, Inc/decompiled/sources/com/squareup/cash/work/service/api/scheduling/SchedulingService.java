package com.squareup.cash.work.service.api.scheduling;

import app.cash.api.ApiResult;
import com.squareup.cash.work.service.api.SquareMerchantToken;
import com.squareup.protos.timecards.scheduling.GetShiftSchedulesRequest;
import com.squareup.protos.timecards.scheduling.GetShiftSchedulesResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Tag;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/squareup/cash/work/service/api/scheduling/SchedulingService;", "", "getScheduleList", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/timecards/scheduling/GetShiftSchedulesResponse;", "request", "Lcom/squareup/protos/timecards/scheduling/GetShiftSchedulesRequest;", "squareMerchantToken", "Lcom/squareup/cash/work/service/api/SquareMerchantToken;", "(Lcom/squareup/protos/timecards/scheduling/GetShiftSchedulesRequest;Lcom/squareup/cash/work/service/api/SquareMerchantToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SchedulingService {
    @POST("/proxy/services/squareup.timecards.scheduling.PublicSchedulingReportsService/GetShiftSchedules")
    Object getScheduleList(@Body GetShiftSchedulesRequest getShiftSchedulesRequest, @Tag SquareMerchantToken squareMerchantToken, Continuation<? super ApiResult<GetShiftSchedulesResponse>> continuation);
}
