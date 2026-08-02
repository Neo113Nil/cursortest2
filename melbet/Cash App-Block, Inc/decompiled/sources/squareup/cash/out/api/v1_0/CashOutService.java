package squareup.cash.out.api.v1_0;

import app.cash.api.ApiResult;
import com.squareup.cash.out.api.v1_0.InitiateInstrumentSelectionRequest;
import com.squareup.cash.out.api.v1_0.InitiateInstrumentSelectionResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lsquareup/cash/out/api/v1_0/CashOutService;", "", "", "flowToken", "Lcom/squareup/cash/out/api/v1_0/InitiateInstrumentSelectionRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/cash/out/api/v1_0/InitiateInstrumentSelectionResponse;", "initiateInstrumentSelection", "(Ljava/lang/String;Lcom/squareup/cash/out/api/v1_0/InitiateInstrumentSelectionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CashOutService {
    @POST("/cash-app/out/v1.0/initiate-instrument-selection")
    Object initiateInstrumentSelection(@Header("Cash-Flow-Token") String str, @Body InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest, Continuation<? super ApiResult<InitiateInstrumentSelectionResponse>> continuation);
}
