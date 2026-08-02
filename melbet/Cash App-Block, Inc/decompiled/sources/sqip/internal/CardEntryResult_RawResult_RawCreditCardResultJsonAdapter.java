package sqip.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import sqip.internal.CardEntryResult;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lsqip/internal/CardEntryResult_RawResult_RawCreditCardResultJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lsqip/internal/CardEntryResult$RawResult$RawCreditCardResult;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "intAdapter", "", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CardEntryResult_RawResult_RawCreditCardResultJsonAdapter extends JsonAdapter {
    private final JsonAdapter intAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public CardEntryResult_RawResult_RawCreditCardResultJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("cardNumber", "cvv", "expirationMonth", "expirationYear", "postCode");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "cardNumber");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "expirationMonth");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "postCode");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CardEntryResult.RawResult.RawCreditCardResult fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw Util.unexpectedNull("cardNumber", "cardNumber", reader);
                }
            } else if (selectName == 1) {
                str2 = (String) this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw Util.unexpectedNull("cvv", "cvv", reader);
                }
            } else if (selectName == 2) {
                num = (Integer) this.intAdapter.fromJson(reader);
                if (num == null) {
                    throw Util.unexpectedNull("expirationMonth", "expirationMonth", reader);
                }
            } else if (selectName == 3) {
                num2 = (Integer) this.intAdapter.fromJson(reader);
                if (num2 == null) {
                    throw Util.unexpectedNull("expirationYear", "expirationYear", reader);
                }
            } else if (selectName == 4) {
                str3 = (String) this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        Integer num3 = num2;
        if (str == null) {
            throw Util.missingProperty("cardNumber", "cardNumber", reader);
        }
        if (str2 == null) {
            throw Util.missingProperty("cvv", "cvv", reader);
        }
        if (num == null) {
            throw Util.missingProperty("expirationMonth", "expirationMonth", reader);
        }
        int intValue = num.intValue();
        if (num3 != null) {
            return new CardEntryResult.RawResult.RawCreditCardResult(str, str2, intValue, num3.intValue(), str3);
        }
        throw Util.missingProperty("expirationYear", "expirationYear", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, CardEntryResult.RawResult.RawCreditCardResult value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("cardNumber");
        this.stringAdapter.toJson(writer, value_.getCardNumber());
        writer.name("cvv");
        this.stringAdapter.toJson(writer, value_.getCvv());
        writer.name("expirationMonth");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getExpirationMonth()));
        writer.name("expirationYear");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getExpirationYear()));
        writer.name("postCode");
        this.nullableStringAdapter.toJson(writer, value_.getPostCode());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(67, "GeneratedJsonAdapter(CardEntryResult.RawResult.RawCreditCardResult)");
    }
}
