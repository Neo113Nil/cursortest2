package com.squareup.cash.work.service.api.timecards;

import app.cash.api.ApiResult;
import com.squareup.cash.work.service.api.SquareMerchantToken;
import com.squareup.protos.client.timecards.UpdateTimecardNotesRequest;
import com.squareup.protos.client.timecards.UpdateTimecardNotesResponse;
import com.squareup.protos.timecards.BatchGetTimecardBreakDefinitionRequest;
import com.squareup.protos.timecards.BatchTimecardBreakDefinitionResponse;
import com.squareup.protos.timecards.GetClockinEssentialsRequest;
import com.squareup.protos.timecards.GetClockinEssentialsResponse;
import com.squareup.protos.timecards.GetShiftsOverviewRequest;
import com.squareup.protos.timecards.GetShiftsOverviewResponse;
import com.squareup.protos.timecards.OvertimeReportByTimecardForEmployeeResponse;
import com.squareup.protos.timecards.SimpleTimeWorkedCalculationRequest;
import com.squareup.protos.timecards.StartTimecardBreakRequest;
import com.squareup.protos.timecards.StartTimecardBreakResponse;
import com.squareup.protos.timecards.StartTimecardRequest;
import com.squareup.protos.timecards.StartTimecardResponse;
import com.squareup.protos.timecards.StopTimecardBreakRequest;
import com.squareup.protos.timecards.StopTimecardBreakResponse;
import com.squareup.protos.timecards.StopTimecardRequest;
import com.squareup.protos.timecards.StopTimecardResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Tag;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00122\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00162\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u001a2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b \u0010!J*\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\"2\b\b\u0001\u0010$\u001a\u00020#H§@¢\u0006\u0004\b&\u0010'J*\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00062\b\b\u0001\u0010\u0003\u001a\u00020(2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b*\u0010+¨\u0006,À\u0006\u0003"}, d2 = {"Lcom/squareup/cash/work/service/api/timecards/TimecardsService;", "", "Lcom/squareup/protos/timecards/GetClockinEssentialsRequest;", "request", "Lcom/squareup/cash/work/service/api/SquareMerchantToken;", "squareMerchantToken", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/timecards/GetClockinEssentialsResponse;", "getClockinEssentials", "(Lcom/squareup/protos/timecards/GetClockinEssentialsRequest;Lcom/squareup/cash/work/service/api/SquareMerchantToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/timecards/StartTimecardRequest;", "Lcom/squareup/protos/timecards/StartTimecardResponse;", "startTimecard", "(Lcom/squareup/protos/timecards/StartTimecardRequest;Lcom/squareup/cash/work/service/api/SquareMerchantToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/timecards/StopTimecardRequest;", "Lcom/squareup/protos/timecards/StopTimecardResponse;", "stopTimecard", "(Lcom/squareup/protos/timecards/StopTimecardRequest;Lcom/squareup/cash/work/service/api/SquareMerchantToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/timecards/StartTimecardBreakRequest;", "Lcom/squareup/protos/timecards/StartTimecardBreakResponse;", "startTimecardBreak", "(Lcom/squareup/protos/timecards/StartTimecardBreakRequest;Lcom/squareup/cash/work/service/api/SquareMerchantToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/timecards/StopTimecardBreakRequest;", "Lcom/squareup/protos/timecards/StopTimecardBreakResponse;", "stopTimecardBreak", "(Lcom/squareup/protos/timecards/StopTimecardBreakRequest;Lcom/squareup/cash/work/service/api/SquareMerchantToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/timecards/BatchGetTimecardBreakDefinitionRequest;", "Lcom/squareup/protos/timecards/BatchTimecardBreakDefinitionResponse;", "getTimecardBreakDefinitions", "(Lcom/squareup/protos/timecards/BatchGetTimecardBreakDefinitionRequest;Lcom/squareup/cash/work/service/api/SquareMerchantToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/client/timecards/UpdateTimecardNotesRequest;", "Lcom/squareup/protos/client/timecards/UpdateTimecardNotesResponse;", "updateTimecardNote", "(Lcom/squareup/protos/client/timecards/UpdateTimecardNotesRequest;Lcom/squareup/cash/work/service/api/SquareMerchantToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/timecards/GetShiftsOverviewRequest;", "", "acceptLanguage", "Lcom/squareup/protos/timecards/GetShiftsOverviewResponse;", "getShiftsOverview", "(Lcom/squareup/protos/timecards/GetShiftsOverviewRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/timecards/SimpleTimeWorkedCalculationRequest;", "Lcom/squareup/protos/timecards/OvertimeReportByTimecardForEmployeeResponse;", "overtimeReportByTimecardForEmployee", "(Lcom/squareup/protos/timecards/SimpleTimeWorkedCalculationRequest;Lcom/squareup/cash/work/service/api/SquareMerchantToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface TimecardsService {
    @POST("/proxy/services/squareup.timecards.PublicTimecardsService/GetClockinEssentials")
    Object getClockinEssentials(@Body GetClockinEssentialsRequest getClockinEssentialsRequest, @Tag SquareMerchantToken squareMerchantToken, Continuation<? super ApiResult<GetClockinEssentialsResponse>> continuation);

    @POST("/proxy/services/squareup.timecards.PublicTimecardsService/GetShiftsOverview")
    Object getShiftsOverview(@Body GetShiftsOverviewRequest getShiftsOverviewRequest, @Header("Accept-Language") String str, Continuation<? super ApiResult<GetShiftsOverviewResponse>> continuation);

    @POST("/proxy/services/squareup.timecards.PublicTimecardsService/BatchGetTimecardBreakDefinition")
    Object getTimecardBreakDefinitions(@Body BatchGetTimecardBreakDefinitionRequest batchGetTimecardBreakDefinitionRequest, @Tag SquareMerchantToken squareMerchantToken, Continuation<? super ApiResult<BatchTimecardBreakDefinitionResponse>> continuation);

    @POST("/proxy/services/squareup.timecards.TimeCalculationReportService/OvertimeReportByTimecardForEmployee")
    Object overtimeReportByTimecardForEmployee(@Body SimpleTimeWorkedCalculationRequest simpleTimeWorkedCalculationRequest, @Tag SquareMerchantToken squareMerchantToken, Continuation<? super ApiResult<OvertimeReportByTimecardForEmployeeResponse>> continuation);

    @POST("/proxy/services/squareup.timecards.PublicTimecardsService/StartTimecard")
    Object startTimecard(@Body StartTimecardRequest startTimecardRequest, @Tag SquareMerchantToken squareMerchantToken, Continuation<? super ApiResult<StartTimecardResponse>> continuation);

    @POST("/proxy/services/squareup.timecards.PublicTimecardsService/StartTimecardBreak")
    Object startTimecardBreak(@Body StartTimecardBreakRequest startTimecardBreakRequest, @Tag SquareMerchantToken squareMerchantToken, Continuation<? super ApiResult<StartTimecardBreakResponse>> continuation);

    @POST("/proxy/services/squareup.timecards.PublicTimecardsService/StopTimecard")
    Object stopTimecard(@Body StopTimecardRequest stopTimecardRequest, @Tag SquareMerchantToken squareMerchantToken, Continuation<? super ApiResult<StopTimecardResponse>> continuation);

    @POST("/proxy/services/squareup.timecards.PublicTimecardsService/StopTimecardBreak")
    Object stopTimecardBreak(@Body StopTimecardBreakRequest stopTimecardBreakRequest, @Tag SquareMerchantToken squareMerchantToken, Continuation<? super ApiResult<StopTimecardBreakResponse>> continuation);

    @POST("/proxy/services/squareup.client.timecards.TimecardsService/UpdateTimecardNotes")
    Object updateTimecardNote(@Body UpdateTimecardNotesRequest updateTimecardNotesRequest, @Tag SquareMerchantToken squareMerchantToken, Continuation<? super ApiResult<UpdateTimecardNotesResponse>> continuation);
}
