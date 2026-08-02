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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lsqip/internal/nonce/CreateCardNonceErrorJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lsqip/internal/nonce/CreateCardNonceError;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CreateCardNonceErrorJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public CreateCardNonceErrorJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("code", "detail", "field", "category");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "code");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "field");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CreateCardNonceError fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw Util.unexpectedNull("code", "code", reader);
                }
            } else if (selectName == 1) {
                str2 = (String) this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw Util.unexpectedNull("detail", "detail", reader);
                }
            } else if (selectName == 2) {
                str3 = (String) this.nullableStringAdapter.fromJson(reader);
            } else if (selectName == 3 && (str4 = (String) this.stringAdapter.fromJson(reader)) == null) {
                throw Util.unexpectedNull("category", "category", reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw Util.missingProperty("code", "code", reader);
        }
        if (str2 == null) {
            throw Util.missingProperty("detail", "detail", reader);
        }
        if (str4 != null) {
            return new CreateCardNonceError(str, str2, str3, str4);
        }
        throw Util.missingProperty("category", "category", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, CreateCardNonceError value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("code");
        this.stringAdapter.toJson(writer, value_.getCode());
        writer.name("detail");
        this.stringAdapter.toJson(writer, value_.getDetail());
        writer.name("field");
        this.nullableStringAdapter.toJson(writer, value_.getField());
        writer.name("category");
        this.stringAdapter.toJson(writer, value_.getCategory());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(42, "GeneratedJsonAdapter(CreateCardNonceError)");
    }
}
