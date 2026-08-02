package sqip.internal.nonce;

import android.content.res.Resources;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentMethodToken;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;
import retrofit2.Response;
import sqip.Call;
import sqip.Callback;
import sqip.GooglePayNonceResult;
import sqip.InAppPaymentsSdk;
import sqip.internal.CardDataResponseKt;
import sqip.internal.DeviceInfo;
import sqip.internal.NetworkMonitor;
import sqip.internal.R;
import sqip.internal.nonce.CreateCardNonceError;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002)*BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0000H\u0016J\u0016\u0010\u0018\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020 H\u0002J\u0016\u0010!\u001a\u00020\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140#H\u0002J\u0010\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u0004H\u0002J\u0018\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lsqip/internal/nonce/CreateNonceCall;", "Lsqip/Call;", "Lsqip/GooglePayNonceResult;", "token", "", "post_code", "errorAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lsqip/internal/nonce/CreateCardNonceErrorResponse;", "createGooglePayNonceService", "Lsqip/internal/nonce/CreateGooglePayNonceService;", "networkMonitor", "Lsqip/internal/NetworkMonitor;", "resources", "Landroid/content/res/Resources;", "deviceInfo", "Lsqip/internal/DeviceInfo;", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonAdapter;Lsqip/internal/nonce/CreateGooglePayNonceService;Lsqip/internal/NetworkMonitor;Landroid/content/res/Resources;Lsqip/internal/DeviceInfo;)V", "serviceCall", "Lretrofit2/Call;", "Lsqip/internal/nonce/CreateCardNonceSuccessResponse;", "cancel", "", "clone", "enqueue", "callback", "Lsqip/Callback;", "execute", "isCanceled", "", "isExecuted", "networkError", "Lsqip/GooglePayNonceResult$Error;", "responseAsResult", "response", "Lretrofit2/Response;", "unexpectedError", "errorCode", "usageError", "debugCode", "debugMessage", "Companion", "Factory", "google-pay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CreateNonceCall implements Call<GooglePayNonceResult> {
    public static final String DEBUG_CODE_PREFIX = "google_pay";
    private final CreateGooglePayNonceService createGooglePayNonceService;
    private final DeviceInfo deviceInfo;
    private final JsonAdapter errorAdapter;
    private final NetworkMonitor networkMonitor;
    private final String post_code;
    private final Resources resources;
    private final retrofit2.Call<CreateCardNonceSuccessResponse> serviceCall;
    private final String token;

    public CreateNonceCall(String str, String str2, JsonAdapter jsonAdapter, CreateGooglePayNonceService createGooglePayNonceService, NetworkMonitor networkMonitor, Resources resources, DeviceInfo deviceInfo) {
        str.getClass();
        jsonAdapter.getClass();
        createGooglePayNonceService.getClass();
        networkMonitor.getClass();
        resources.getClass();
        deviceInfo.getClass();
        this.token = str;
        this.post_code = str2;
        this.errorAdapter = jsonAdapter;
        this.createGooglePayNonceService = createGooglePayNonceService;
        this.networkMonitor = networkMonitor;
        this.resources = resources;
        this.deviceInfo = deviceInfo;
        this.serviceCall = createGooglePayNonceService.createGooglePayNonce(new CreateGooglePayNonceRequest(InAppPaymentsSdk.getSquareApplicationId(), new GooglePayDataRequest(Boxes$$ExternalSyntheticOutline1.m(), new GooglePayMethodToken(null, str, 1, null), str2), deviceInfo.captureDeviceInfo()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GooglePayNonceResult.Error networkError() {
        GooglePayNonceResult.Error.Code code = GooglePayNonceResult.Error.Code.NO_NETWORK;
        String string2 = this.resources.getString(R.string.sqip_error_message_no_network);
        string2.getClass();
        Locale locale = Locale.US;
        String m = Recorder$$ExternalSyntheticOutline2.m("google_pay_", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, "NO_NETWORK", locale));
        String string3 = this.resources.getString(R.string.sqip_error_message_no_network);
        string3.getClass();
        return new GooglePayNonceResult.Error(code, string2, m, string3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GooglePayNonceResult responseAsResult(Response<CreateCardNonceSuccessResponse> response) {
        if (response.rawResponse.isSuccessful) {
            Object obj = response.body;
            obj.getClass();
            CreateCardNonceSuccessResponse createCardNonceSuccessResponse = (CreateCardNonceSuccessResponse) obj;
            return new GooglePayNonceResult.Success(createCardNonceSuccessResponse.getCard_nonce(), CardDataResponseKt.toCardData(createCardNonceSuccessResponse.getCard()));
        }
        ResponseBody responseBody = response.errorBody;
        responseBody.getClass();
        try {
            CreateCardNonceErrorResponse createCardNonceErrorResponse = (CreateCardNonceErrorResponse) this.errorAdapter.fromJson(responseBody.source());
            createCardNonceErrorResponse.getClass();
            CreateCardNonceError createCardNonceError = (CreateCardNonceError) CollectionsKt.first((List) createCardNonceErrorResponse.getErrors());
            if (createCardNonceError.codeAsEnum() != CreateCardNonceError.Code.UNSUPPORTED_CLIENT_VERSION) {
                String code = createCardNonceError.getCode();
                Locale locale = Locale.US;
                return usageError(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, code, locale), createCardNonceError.getDetail());
            }
            GooglePayNonceResult.Error.Code code2 = GooglePayNonceResult.Error.Code.UNSUPPORTED_SDK_VERSION;
            String string2 = this.resources.getString(R.string.sqip_error_message_unsupported_client_version);
            string2.getClass();
            Locale locale2 = Locale.US;
            locale2.getClass();
            String lowerCase = "UNSUPPORTED_SDK_VERSION".toLowerCase(locale2);
            lowerCase.getClass();
            String concat = "google_pay_".concat(lowerCase);
            String string3 = this.resources.getString(R.string.sqip_debug_message_unsupported_client_version);
            string3.getClass();
            return new GooglePayNonceResult.Error(code2, string2, concat, string3);
        } catch (JsonDataException unused) {
            return unexpectedError(DebugErrorCodes.UNEXPECTED_JSON_ERROR_RESPONSE);
        } catch (IndexOutOfBoundsException unused2) {
            return unexpectedError(DebugErrorCodes.UNEXPECTED_EMPTY_RESPONSE_ERROR_LIST);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GooglePayNonceResult.Error unexpectedError(String errorCode) {
        String string2 = this.resources.getString(R.string.sqip_debug_message_unexpected);
        string2.getClass();
        return usageError(errorCode, String.format(Locale.US, string2, Arrays.copyOf(new Object[]{errorCode}, 1)));
    }

    private final GooglePayNonceResult.Error usageError(String debugCode, String debugMessage) {
        String m = Recorder$$ExternalSyntheticOutline2.m("google_pay_", debugCode);
        GooglePayNonceResult.Error.Code code = GooglePayNonceResult.Error.Code.USAGE_ERROR;
        String string2 = this.resources.getString(R.string.sqip_developer_error_message);
        string2.getClass();
        return new GooglePayNonceResult.Error(code, String.format(string2, Arrays.copyOf(new Object[]{m}, 1)), m, debugMessage);
    }

    @Override // sqip.Call
    public void cancel() {
        this.serviceCall.cancel();
    }

    @Override // sqip.Call
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Call<GooglePayNonceResult> clone2() {
        return new CreateNonceCall(this.token, this.post_code, this.errorAdapter, this.createGooglePayNonceService, this.networkMonitor, this.resources, this.deviceInfo);
    }

    @Override // sqip.Call
    public void enqueue(final Callback<GooglePayNonceResult> callback) {
        callback.getClass();
        if (this.networkMonitor.isConnected()) {
            this.serviceCall.enqueue(new retrofit2.Callback() { // from class: sqip.internal.nonce.CreateNonceCall$enqueue$1
                @Override // retrofit2.Callback
                public void onFailure(retrofit2.Call<CreateCardNonceSuccessResponse> call, Throwable t) {
                    GooglePayNonceResult.Error unexpectedError;
                    call.getClass();
                    t.getClass();
                    Callback<GooglePayNonceResult> callback2 = callback;
                    if (t instanceof IOException) {
                        unexpectedError = this.networkError();
                    } else if (t instanceof JsonDataException) {
                        unexpectedError = this.unexpectedError(DebugErrorCodes.UNEXPECTED_JSON_RESPONSE);
                    } else {
                        t.printStackTrace();
                        unexpectedError = this.unexpectedError(DebugErrorCodes.UNEXPECTED_RETROFIT_FAILURE);
                    }
                    callback2.onResult(unexpectedError);
                }

                @Override // retrofit2.Callback
                public void onResponse(retrofit2.Call<CreateCardNonceSuccessResponse> call, Response<CreateCardNonceSuccessResponse> response) {
                    GooglePayNonceResult responseAsResult;
                    call.getClass();
                    response.getClass();
                    Callback<GooglePayNonceResult> callback2 = callback;
                    responseAsResult = this.responseAsResult(response);
                    callback2.onResult(responseAsResult);
                }
            });
        } else {
            callback.onResult(networkError());
        }
    }

    @Override // sqip.Call
    public GooglePayNonceResult execute() {
        if (!this.networkMonitor.isConnected()) {
            return networkError();
        }
        try {
            Response<CreateCardNonceSuccessResponse> execute = this.serviceCall.execute();
            execute.getClass();
            return responseAsResult(execute);
        } catch (JsonDataException unused) {
            return this.unexpectedError(DebugErrorCodes.UNEXPECTED_JSON_RESPONSE);
        } catch (IOException unused2) {
            return this.networkError();
        } catch (RuntimeException unused3) {
            return this.unexpectedError(DebugErrorCodes.UNEXPECTED_RETROFIT_FAILURE);
        }
    }

    @Override // sqip.Call
    public boolean isCanceled() {
        return this.serviceCall.isCanceled();
    }

    @Override // sqip.Call
    public boolean isExecuted() {
        return this.serviceCall.isExecuted();
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B5\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lsqip/internal/nonce/CreateNonceCall$Factory;", "", "errorAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lsqip/internal/nonce/CreateCardNonceErrorResponse;", "createGooglePayNonceService", "Lsqip/internal/nonce/CreateGooglePayNonceService;", "networkMonitor", "Lsqip/internal/NetworkMonitor;", "resources", "Landroid/content/res/Resources;", "deviceInfo", "Lsqip/internal/DeviceInfo;", "(Lcom/squareup/moshi/JsonAdapter;Lsqip/internal/nonce/CreateGooglePayNonceService;Lsqip/internal/NetworkMonitor;Landroid/content/res/Resources;Lsqip/internal/DeviceInfo;)V", "create", "Lsqip/internal/nonce/CreateNonceCall;", "gpayData", "Lcom/google/android/gms/wallet/PaymentData;", "token", "", "google-pay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Factory {
        private final CreateGooglePayNonceService createGooglePayNonceService;
        private final DeviceInfo deviceInfo;
        private final JsonAdapter errorAdapter;
        private final NetworkMonitor networkMonitor;
        private final Resources resources;

        public Factory(JsonAdapter jsonAdapter, CreateGooglePayNonceService createGooglePayNonceService, NetworkMonitor networkMonitor, Resources resources, DeviceInfo deviceInfo) {
            jsonAdapter.getClass();
            createGooglePayNonceService.getClass();
            networkMonitor.getClass();
            resources.getClass();
            deviceInfo.getClass();
            this.errorAdapter = jsonAdapter;
            this.createGooglePayNonceService = createGooglePayNonceService;
            this.networkMonitor = networkMonitor;
            this.resources = resources;
            this.deviceInfo = deviceInfo;
        }

        public final CreateNonceCall create(PaymentData gpayData) {
            gpayData.getClass();
            UserAddress userAddress = gpayData.zzb.zze;
            String str = userAddress != null ? userAddress.zzj : null;
            String str2 = (str == null || StringsKt.isBlank(str)) ? null : str;
            PaymentMethodToken paymentMethodToken = gpayData.zzd;
            return new CreateNonceCall(String.valueOf(paymentMethodToken != null ? paymentMethodToken.zzb : null), str2, this.errorAdapter, this.createGooglePayNonceService, this.networkMonitor, this.resources, this.deviceInfo);
        }

        public final CreateNonceCall create(String token) {
            token.getClass();
            return new CreateNonceCall(token, null, this.errorAdapter, this.createGooglePayNonceService, this.networkMonitor, this.resources, this.deviceInfo);
        }
    }
}
