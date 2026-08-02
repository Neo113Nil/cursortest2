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

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lsqip/internal/nonce/GooglePayDataRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lsqip/internal/nonce/GooglePayDataRequest;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "googlePayMethodTokenAdapter", "Lsqip/internal/nonce/GooglePayMethodToken;", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "google-pay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GooglePayDataRequestJsonAdapter extends JsonAdapter {
    private final JsonAdapter googlePayMethodTokenAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public GooglePayDataRequestJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("idempotency_key", "payment_method_token", "postal_code");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "idempotency_key");
        this.googlePayMethodTokenAdapter = moshi.adapter(GooglePayMethodToken.class, emptySet, "payment_method_token");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "postal_code");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public GooglePayDataRequest fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        GooglePayMethodToken googlePayMethodToken = null;
        String str2 = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw Util.unexpectedNull("idempotency_key", "idempotency_key", reader);
                }
            } else if (selectName == 1) {
                googlePayMethodToken = (GooglePayMethodToken) this.googlePayMethodTokenAdapter.fromJson(reader);
                if (googlePayMethodToken == null) {
                    throw Util.unexpectedNull("payment_method_token", "payment_method_token", reader);
                }
            } else if (selectName == 2) {
                str2 = (String) this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw Util.missingProperty("idempotency_key", "idempotency_key", reader);
        }
        if (googlePayMethodToken != null) {
            return new GooglePayDataRequest(str, googlePayMethodToken, str2);
        }
        throw Util.missingProperty("payment_method_token", "payment_method_token", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, GooglePayDataRequest value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("idempotency_key");
        this.stringAdapter.toJson(writer, value_.getIdempotency_key());
        writer.name("payment_method_token");
        this.googlePayMethodTokenAdapter.toJson(writer, value_.getPayment_method_token());
        writer.name("postal_code");
        this.nullableStringAdapter.toJson(writer, value_.getPostal_code());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(42, "GeneratedJsonAdapter(GooglePayDataRequest)");
    }
}
