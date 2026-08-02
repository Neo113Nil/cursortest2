package sqip.internal.nonce;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lsqip/internal/nonce/CreateGooglePayNonceRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lsqip/internal/nonce/CreateGooglePayNonceRequest;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "deviceInfoRequestAdapter", "Lsqip/internal/nonce/DeviceInfoRequest;", "googlePayDataRequestAdapter", "Lsqip/internal/nonce/GooglePayDataRequest;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "google-pay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CreateGooglePayNonceRequestJsonAdapter extends JsonAdapter {
    private final JsonAdapter deviceInfoRequestAdapter;
    private final JsonAdapter googlePayDataRequestAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public CreateGooglePayNonceRequestJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("client_id", "googlepay_data", "s");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "client_id");
        this.googlePayDataRequestAdapter = moshi.adapter(GooglePayDataRequest.class, emptySet, "googlepay_data");
        this.deviceInfoRequestAdapter = moshi.adapter(DeviceInfoRequest.class, emptySet, "s");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CreateGooglePayNonceRequest fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        GooglePayDataRequest googlePayDataRequest = null;
        DeviceInfoRequest deviceInfoRequest = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw Util.unexpectedNull("client_id", "client_id", reader);
                }
            } else if (selectName == 1) {
                googlePayDataRequest = (GooglePayDataRequest) this.googlePayDataRequestAdapter.fromJson(reader);
                if (googlePayDataRequest == null) {
                    throw Util.unexpectedNull("googlepay_data", "googlepay_data", reader);
                }
            } else if (selectName == 2 && (deviceInfoRequest = (DeviceInfoRequest) this.deviceInfoRequestAdapter.fromJson(reader)) == null) {
                throw Util.unexpectedNull("s", "s", reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw Util.missingProperty("client_id", "client_id", reader);
        }
        if (googlePayDataRequest == null) {
            throw Util.missingProperty("googlepay_data", "googlepay_data", reader);
        }
        if (deviceInfoRequest != null) {
            return new CreateGooglePayNonceRequest(str, googlePayDataRequest, deviceInfoRequest);
        }
        throw Util.missingProperty("s", "s", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, CreateGooglePayNonceRequest value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("client_id");
        this.stringAdapter.toJson(writer, value_.getClient_id());
        writer.name("googlepay_data");
        this.googlePayDataRequestAdapter.toJson(writer, value_.getGooglepay_data());
        writer.name("s");
        this.deviceInfoRequestAdapter.toJson(writer, value_.getS());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(49, "GeneratedJsonAdapter(CreateGooglePayNonceRequest)");
    }
}
