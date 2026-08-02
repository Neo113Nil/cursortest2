package sqip.internal.nonce;

import android.content.res.Resources;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import sqip.InAppPaymentsSdk;
import sqip.internal.CardDataResponseKt;
import sqip.internal.CardEntryResult;
import sqip.internal.DeviceInfo;
import sqip.internal.NetworkMonitor;
import sqip.internal.R;
import sqip.internal.Result;
import sqip.internal.event.EventLogger;
import sqip.internal.event.IapEvent;
import sqip.internal.nonce.CreateCardNonceError;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 /2\u00020\u0001:\u0001/B=\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00112\u001e\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0017\u001a\u00020\u0018J4\u0010\u0019\u001a\u00020\u00112\u001e\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u0012\u0004\u0012\u00020\u00110\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ0\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00162\u001e\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0016JR\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010\u00162\u001e\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0016J8\u0010%\u001a\u00020\u00112\u001e\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0016H\u0002J(\u0010(\u001a\u00020\u00112\u001e\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0002J0\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+2\u001e\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0002J0\u0010,\u001a\u00020\u00112\u001e\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010-\u001a\u00020\u0015H\u0002J0\u0010.\u001a\u00020\u00112\u001e\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010&\u001a\u00020\u0016H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lsqip/internal/nonce/RealCreateCardNonceRequestHandler;", "Lsqip/internal/nonce/CreateCardNonceRequestHandler;", "errorAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lsqip/internal/nonce/CreateCardNonceErrorResponse;", "createCardNonceService", "Lsqip/internal/nonce/CreateCardNonceService;", "networkMonitor", "Lsqip/internal/NetworkMonitor;", "eventLogger", "Lsqip/internal/event/EventLogger;", "deviceInfo", "Lsqip/internal/DeviceInfo;", "resources", "Landroid/content/res/Resources;", "(Lcom/squareup/moshi/JsonAdapter;Lsqip/internal/nonce/CreateCardNonceService;Lsqip/internal/NetworkMonitor;Lsqip/internal/event/EventLogger;Lsqip/internal/DeviceInfo;Landroid/content/res/Resources;)V", "onFailure", "", "callback", "Lkotlin/Function1;", "Lsqip/internal/Result;", "Lsqip/internal/CardEntryResult$CardAndNonceResult;", "", "t", "", "onResponse", "response", "Lretrofit2/Response;", "Lsqip/internal/nonce/CreateCardNonceSuccessResponse;", "retrieveGiftCardNonce", InquiryField.FloatField.TYPE2, "retrieveNonce", "expirationMonth", "", "expirationYear", "cvv", "billingPostalCode", "sendError", "debugCode", "errorMessage", "sendNetworkError", "sendRequest", "cardNonceRequest", "Lsqip/internal/nonce/CreateCardNonceRequest;", "sendSuccess", "cardEntryResult", "sendUnexpectedError", "Companion", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RealCreateCardNonceRequestHandler implements CreateCardNonceRequestHandler {
    public static final String DEBUG_CODE_PREFIX = "card_entry";
    private final CreateCardNonceService createCardNonceService;
    private final DeviceInfo deviceInfo;
    private final JsonAdapter errorAdapter;
    private final EventLogger eventLogger;
    private final NetworkMonitor networkMonitor;
    private final Resources resources;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CreateCardNonceError.Code.values().length];
            try {
                iArr[CreateCardNonceError.Code.INVALID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreateCardNonceError.Code.UNSUPPORTED_CARD_BRAND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CreateCardNonceError.Code.UNSUPPORTED_CLIENT_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealCreateCardNonceRequestHandler(JsonAdapter jsonAdapter, CreateCardNonceService createCardNonceService, NetworkMonitor networkMonitor, EventLogger eventLogger, DeviceInfo deviceInfo, Resources resources) {
        jsonAdapter.getClass();
        createCardNonceService.getClass();
        networkMonitor.getClass();
        eventLogger.getClass();
        deviceInfo.getClass();
        resources.getClass();
        this.errorAdapter = jsonAdapter;
        this.createCardNonceService = createCardNonceService;
        this.networkMonitor = networkMonitor;
        this.eventLogger = eventLogger;
        this.deviceInfo = deviceInfo;
        this.resources = resources;
    }

    private final void sendError(Function1<? super Result<CardEntryResult.CardAndNonceResult, String>, Unit> callback, String debugCode, String errorMessage) {
        this.eventLogger.log(new IapEvent.CardEntry.NonceError(Recorder$$ExternalSyntheticOutline2.m("card_entry_", debugCode)));
        callback.invoke(Result.INSTANCE.newError(errorMessage));
    }

    private final void sendNetworkError(Function1<? super Result<CardEntryResult.CardAndNonceResult, String>, Unit> callback) {
        String string2 = this.resources.getString(R.string.sqip_error_message_no_network);
        string2.getClass();
        sendError(callback, "no_network", string2);
    }

    private final void sendRequest(CreateCardNonceRequest cardNonceRequest, final Function1<? super Result<CardEntryResult.CardAndNonceResult, String>, Unit> callback) {
        if (this.networkMonitor.isConnected()) {
            this.createCardNonceService.createCardNonce(cardNonceRequest).enqueue(new Callback() { // from class: sqip.internal.nonce.RealCreateCardNonceRequestHandler$sendRequest$1
                @Override // retrofit2.Callback
                public void onFailure(Call<CreateCardNonceSuccessResponse> call, Throwable t) {
                    call.getClass();
                    t.getClass();
                    RealCreateCardNonceRequestHandler.this.onFailure(callback, t);
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<CreateCardNonceSuccessResponse> call, Response<CreateCardNonceSuccessResponse> response) {
                    call.getClass();
                    response.getClass();
                    RealCreateCardNonceRequestHandler.this.onResponse(callback, response);
                }
            });
        } else {
            sendNetworkError(callback);
        }
    }

    private final void sendSuccess(Function1<? super Result<CardEntryResult.CardAndNonceResult, String>, Unit> callback, CardEntryResult.CardAndNonceResult cardEntryResult) {
        this.eventLogger.log(IapEvent.CardEntry.NonceReceived.INSTANCE);
        callback.invoke(Result.INSTANCE.newSuccess(cardEntryResult));
    }

    private final void sendUnexpectedError(Function1<? super Result<CardEntryResult.CardAndNonceResult, String>, Unit> callback, String debugCode) {
        String string2 = this.resources.getString(R.string.sqip_developer_error_message);
        string2.getClass();
        sendError(callback, debugCode, String.format(string2, Arrays.copyOf(new Object[]{"card_entry_" + debugCode}, 1)));
    }

    public final void onFailure(Function1<? super Result<CardEntryResult.CardAndNonceResult, String>, Unit> callback, Throwable t) {
        callback.getClass();
        t.getClass();
        if (t instanceof IOException) {
            sendNetworkError(callback);
        } else if (t instanceof JsonDataException) {
            sendUnexpectedError(callback, DebugErrorCodes.UNEXPECTED_JSON_RESPONSE);
        } else {
            sendUnexpectedError(callback, DebugErrorCodes.UNEXPECTED_RETROFIT_FAILURE);
        }
    }

    public final void onResponse(Function1<? super Result<CardEntryResult.CardAndNonceResult, String>, Unit> callback, Response<CreateCardNonceSuccessResponse> response) {
        String format2;
        callback.getClass();
        response.getClass();
        if (response.rawResponse.isSuccessful) {
            Object obj = response.body;
            obj.getClass();
            CreateCardNonceSuccessResponse createCardNonceSuccessResponse = (CreateCardNonceSuccessResponse) obj;
            sendSuccess(callback, new CardEntryResult.CardAndNonceResult(createCardNonceSuccessResponse.getCard_nonce(), CardDataResponseKt.toCardData(createCardNonceSuccessResponse.getCard())));
            return;
        }
        ResponseBody responseBody = response.errorBody;
        responseBody.getClass();
        try {
            Object fromJson = this.errorAdapter.fromJson(responseBody.source());
            fromJson.getClass();
            CreateCardNonceError createCardNonceError = (CreateCardNonceError) CollectionsKt.first((List) ((CreateCardNonceErrorResponse) fromJson).getErrors());
            CreateCardNonceError.Code codeAsEnum = createCardNonceError.codeAsEnum();
            int i = codeAsEnum == null ? -1 : WhenMappings.$EnumSwitchMapping$0[codeAsEnum.ordinal()];
            Integer valueOf = i != 1 ? i != 2 ? i != 3 ? null : Integer.valueOf(R.string.sqip_error_message_unsupported_client_version) : Integer.valueOf(sqip.cardentry.R.string.sqip_error_message_unsupported_card) : Integer.valueOf(sqip.cardentry.R.string.sqip_error_message_invalid_card);
            Resources resources = this.resources;
            if (valueOf != null) {
                format2 = resources.getString(valueOf.intValue());
            } else {
                String string2 = resources.getString(R.string.sqip_developer_error_message);
                string2.getClass();
                String code = createCardNonceError.getCode();
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = code.toLowerCase(locale);
                lowerCase.getClass();
                format2 = String.format(string2, Arrays.copyOf(new Object[]{"card_entry_".concat(lowerCase)}, 1));
            }
            format2.getClass();
            sendError(callback, createCardNonceError.getCode(), format2);
        } catch (JsonDataException unused) {
            sendUnexpectedError(callback, DebugErrorCodes.UNEXPECTED_JSON_ERROR_RESPONSE);
        }
    }

    @Override // sqip.internal.nonce.CreateCardNonceRequestHandler
    public void retrieveGiftCardNonce(String number, Function1<? super Result<CardEntryResult.CardAndNonceResult, String>, Unit> callback) {
        number.getClass();
        callback.getClass();
        sendRequest(new CreateCardNonceRequest(InAppPaymentsSdk.getSquareApplicationId(), null, new GiftCardDataRequest(number), this.deviceInfo.captureDeviceInfo()), callback);
    }

    @Override // sqip.internal.nonce.CreateCardNonceRequestHandler
    public void retrieveNonce(String number, int expirationMonth, int expirationYear, String cvv, String billingPostalCode, Function1<? super Result<CardEntryResult.CardAndNonceResult, String>, Unit> callback) {
        number.getClass();
        cvv.getClass();
        callback.getClass();
        sendRequest(new CreateCardNonceRequest(InAppPaymentsSdk.getSquareApplicationId(), new CardDataRequest(number, expirationMonth, expirationYear, cvv, billingPostalCode), null, this.deviceInfo.captureDeviceInfo()), callback);
    }
}
