package squareup.cash.moneta.api.v1_0;

import app.cash.api.ApiResult;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.cash.moneta.api.v1_0.CashInResponse;
import com.squareup.cash.moneta.api.v1_0.EnqueueCashInRequirementsRequest;
import com.squareup.cash.moneta.api.v1_0.EnqueueCashInRequirementsResponse;
import com.squareup.cash.moneta.api.v1_0.InitiateInstrumentSelectionRequest;
import com.squareup.cash.moneta.api.v1_0.InitiateInstrumentSelectionResponse;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJJ\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lsquareup/cash/moneta/api/v1_0/MonetaService;", "", "initiateInstrumentSelection", "Lapp/cash/api/ApiResult;", "Lcom/squareup/cash/moneta/api/v1_0/InitiateInstrumentSelectionResponse;", "flowToken", "", "request", "Lcom/squareup/cash/moneta/api/v1_0/InitiateInstrumentSelectionRequest;", "(Ljava/lang/String;Lcom/squareup/cash/moneta/api/v1_0/InitiateInstrumentSelectionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enqueueCashInRequirements", "Lcom/squareup/cash/moneta/api/v1_0/EnqueueCashInRequirementsResponse;", "Lcom/squareup/cash/moneta/api/v1_0/EnqueueCashInRequirementsRequest;", "(Lcom/squareup/cash/moneta/api/v1_0/EnqueueCashInRequirementsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addCash", "Lcom/squareup/cash/moneta/api/v1_0/CashInResponse;", "clientScenario", "Lcom/squareup/protos/franklin/api/ClientScenario;", "cashGooseSessionId", "cashGooseToolRequestId", "Lcom/squareup/cash/moneta/api/v1_0/CashInRequest;", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/cash/moneta/api/v1_0/CashInRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MonetaService {
    @POST("/cash-app/cash-in/v1.0/add-cash")
    Object addCash(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Header("Cash-Goose-Session-Id") String str2, @Header("Cash-Goose-Tool-Request-Id") String str3, @Body CashInRequest cashInRequest, Continuation<? super ApiResult<CashInResponse>> continuation);

    @POST("/cash-app/cash-in/v1.0/enqueue-cash-in-requirements")
    Object enqueueCashInRequirements(@Body EnqueueCashInRequirementsRequest enqueueCashInRequirementsRequest, Continuation<? super ApiResult<EnqueueCashInRequirementsResponse>> continuation);

    @POST("/cash-app/cash-in/v1.0/initiate-cash-in-instrument-selection")
    Object initiateInstrumentSelection(@Header("Cash-Flow-Token") String str, @Body InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest, Continuation<? super ApiResult<InitiateInstrumentSelectionResponse>> continuation);
}
