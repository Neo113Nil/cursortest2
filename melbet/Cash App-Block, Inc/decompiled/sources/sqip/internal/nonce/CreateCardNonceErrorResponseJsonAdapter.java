package sqip.internal.nonce;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lsqip/internal/nonce/CreateCardNonceErrorResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lsqip/internal/nonce/CreateCardNonceErrorResponse;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "listOfCreateCardNonceErrorAdapter", "", "Lsqip/internal/nonce/CreateCardNonceError;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CreateCardNonceErrorResponseJsonAdapter extends JsonAdapter {
    private final JsonAdapter listOfCreateCardNonceErrorAdapter;
    private final JsonReader.Options options;

    public CreateCardNonceErrorResponseJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("errors");
        this.listOfCreateCardNonceErrorAdapter = moshi.adapter(Types.newParameterizedType(List.class, CreateCardNonceError.class), EmptySet.INSTANCE, "errors");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CreateCardNonceErrorResponse fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        List list = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0 && (list = (List) this.listOfCreateCardNonceErrorAdapter.fromJson(reader)) == null) {
                throw Util.unexpectedNull("errors", "errors", reader);
            }
        }
        reader.endObject();
        if (list != null) {
            return new CreateCardNonceErrorResponse(list);
        }
        throw Util.missingProperty("errors", "errors", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, CreateCardNonceErrorResponse value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("errors");
        this.listOfCreateCardNonceErrorAdapter.toJson(writer, value_.getErrors());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(50, "GeneratedJsonAdapter(CreateCardNonceErrorResponse)");
    }
}
