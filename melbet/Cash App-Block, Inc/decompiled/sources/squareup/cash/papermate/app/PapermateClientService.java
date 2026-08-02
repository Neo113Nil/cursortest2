package squareup.cash.papermate.app;

import app.cash.api.ApiResult;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeRequest;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import com.squareup.protos.cash.papermate.app.GetRetailerLocationsRequest;
import com.squareup.protos.cash.papermate.app.GetRetailerLocationsResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lsquareup/cash/papermate/app/PapermateClientService;", "", "Lcom/squareup/protos/cash/papermate/app/GetRetailerLocationsRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/papermate/app/GetRetailerLocationsResponse;", "getRetailerLocations", "(Lcom/squareup/protos/cash/papermate/app/GetRetailerLocationsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/papermate/app/GetPaperCashDepositBarcodeRequest;", "Lcom/squareup/protos/cash/papermate/app/GetPaperCashDepositBarcodeResponse;", "getCashDepositBarcode", "(Lcom/squareup/protos/cash/papermate/app/GetPaperCashDepositBarcodeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PapermateClientService {
    @POST("/cash-app/paper-money-deposit/get-paper-money-deposit-barcode")
    Object getCashDepositBarcode(@Body GetPaperCashDepositBarcodeRequest getPaperCashDepositBarcodeRequest, Continuation<? super ApiResult<GetPaperCashDepositBarcodeResponse>> continuation);

    @POST("/cash-app/paper-money-deposit/get-retailer-locations")
    Object getRetailerLocations(@Body GetRetailerLocationsRequest getRetailerLocationsRequest, Continuation<? super ApiResult<GetRetailerLocationsResponse>> continuation);
}
