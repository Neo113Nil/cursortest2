package sqip.internal.nonce;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lsqip/internal/nonce/CardDataRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lsqip/internal/nonce/CardDataRequest;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "intAdapter", "", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CardDataRequestJsonAdapter extends JsonAdapter {
    private final JsonAdapter intAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public CardDataRequestJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of(InquiryField.FloatField.TYPE2, "exp_month", "exp_year", "cvv", "billing_postal_code");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, InquiryField.FloatField.TYPE2);
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "exp_month");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "billing_postal_code");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CardDataRequest fromJson(JsonReader reader) {
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
                    throw Util.unexpectedNull(InquiryField.FloatField.TYPE2, InquiryField.FloatField.TYPE2, reader);
                }
            } else if (selectName == 1) {
                num = (Integer) this.intAdapter.fromJson(reader);
                if (num == null) {
                    throw Util.unexpectedNull("exp_month", "exp_month", reader);
                }
            } else if (selectName == 2) {
                num2 = (Integer) this.intAdapter.fromJson(reader);
                if (num2 == null) {
                    throw Util.unexpectedNull("exp_year", "exp_year", reader);
                }
            } else if (selectName == 3) {
                str2 = (String) this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw Util.unexpectedNull("cvv", "cvv", reader);
                }
            } else if (selectName == 4) {
                str3 = (String) this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        Integer num3 = num2;
        if (str == null) {
            throw Util.missingProperty(InquiryField.FloatField.TYPE2, InquiryField.FloatField.TYPE2, reader);
        }
        if (num == null) {
            throw Util.missingProperty("exp_month", "exp_month", reader);
        }
        int intValue = num.intValue();
        if (num3 == null) {
            throw Util.missingProperty("exp_year", "exp_year", reader);
        }
        int intValue2 = num3.intValue();
        if (str2 != null) {
            return new CardDataRequest(str, intValue, intValue2, str2, str3);
        }
        throw Util.missingProperty("cvv", "cvv", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, CardDataRequest value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name(InquiryField.FloatField.TYPE2);
        this.stringAdapter.toJson(writer, value_.getNumber());
        writer.name("exp_month");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getExp_month()));
        writer.name("exp_year");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getExp_year()));
        writer.name("cvv");
        this.stringAdapter.toJson(writer, value_.getCvv());
        writer.name("billing_postal_code");
        this.nullableStringAdapter.toJson(writer, value_.getBilling_postal_code());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(37, "GeneratedJsonAdapter(CardDataRequest)");
    }
}
