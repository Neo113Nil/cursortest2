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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lsqip/internal/CardEntryResult_RawResult_RawGiftCardResultJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lsqip/internal/CardEntryResult$RawResult$RawGiftCardResult;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CardEntryResult_RawResult_RawGiftCardResultJsonAdapter extends JsonAdapter {
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public CardEntryResult_RawResult_RawGiftCardResultJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("cardNumber");
        this.stringAdapter = moshi.adapter(String.class, EmptySet.INSTANCE, "cardNumber");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CardEntryResult.RawResult.RawGiftCardResult fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0 && (str = (String) this.stringAdapter.fromJson(reader)) == null) {
                throw Util.unexpectedNull("cardNumber", "cardNumber", reader);
            }
        }
        reader.endObject();
        if (str != null) {
            return new CardEntryResult.RawResult.RawGiftCardResult(str);
        }
        throw Util.missingProperty("cardNumber", "cardNumber", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, CardEntryResult.RawResult.RawGiftCardResult value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("cardNumber");
        this.stringAdapter.toJson(writer, value_.getCardNumber());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(65, "GeneratedJsonAdapter(CardEntryResult.RawResult.RawGiftCardResult)");
    }
}
