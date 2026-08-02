package sqip.internal.event;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lsqip/internal/event/LogEventsResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lsqip/internal/event/LogEventsResponse;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "intAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LogEventsResponseJsonAdapter extends JsonAdapter {
    private final JsonAdapter intAdapter;
    private final JsonReader.Options options;

    public LogEventsResponseJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("success_count", "failure_count", "invalid_count");
        this.intAdapter = moshi.adapter(Integer.TYPE, EmptySet.INSTANCE, "success_count");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public LogEventsResponse fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                num = (Integer) this.intAdapter.fromJson(reader);
                if (num == null) {
                    throw Util.unexpectedNull("success_count", "success_count", reader);
                }
            } else if (selectName == 1) {
                num2 = (Integer) this.intAdapter.fromJson(reader);
                if (num2 == null) {
                    throw Util.unexpectedNull("failure_count", "failure_count", reader);
                }
            } else if (selectName == 2 && (num3 = (Integer) this.intAdapter.fromJson(reader)) == null) {
                throw Util.unexpectedNull("invalid_count", "invalid_count", reader);
            }
        }
        reader.endObject();
        if (num == null) {
            throw Util.missingProperty("success_count", "success_count", reader);
        }
        int intValue = num.intValue();
        if (num2 == null) {
            throw Util.missingProperty("failure_count", "failure_count", reader);
        }
        int intValue2 = num2.intValue();
        if (num3 != null) {
            return new LogEventsResponse(intValue, intValue2, num3.intValue());
        }
        throw Util.missingProperty("invalid_count", "invalid_count", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, LogEventsResponse value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("success_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getSuccess_count()));
        writer.name("failure_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getFailure_count()));
        writer.name("invalid_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getInvalid_count()));
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(39, "GeneratedJsonAdapter(LogEventsResponse)");
    }
}
