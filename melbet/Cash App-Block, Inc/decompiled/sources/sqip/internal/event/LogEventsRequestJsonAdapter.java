package sqip.internal.event;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lsqip/internal/event/LogEventsRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lsqip/internal/event/LogEventsRequest;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "booleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "listOfJsonDataEventWrapperAdapter", "", "Lsqip/internal/event/JsonDataEventWrapper;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LogEventsRequestJsonAdapter extends JsonAdapter {
    private final JsonAdapter booleanAdapter;
    private volatile Constructor<LogEventsRequest> constructorRef;
    private final JsonAdapter listOfJsonDataEventWrapperAdapter;
    private final JsonReader.Options options;

    public LogEventsRequestJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("events", "sync");
        Util.ParameterizedTypeImpl newParameterizedType = Types.newParameterizedType(List.class, JsonDataEventWrapper.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.listOfJsonDataEventWrapperAdapter = moshi.adapter(newParameterizedType, emptySet, "events");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "sync");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public LogEventsRequest fromJson(JsonReader reader) {
        reader.getClass();
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        List list = null;
        int i = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                list = (List) this.listOfJsonDataEventWrapperAdapter.fromJson(reader);
                if (list == null) {
                    throw Util.unexpectedNull("events", "events", reader);
                }
            } else if (selectName == 1) {
                bool = (Boolean) this.booleanAdapter.fromJson(reader);
                if (bool == null) {
                    throw Util.unexpectedNull("sync", "sync", reader);
                }
                i = -3;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i == -3) {
            if (list != null) {
                return new LogEventsRequest(list, bool.booleanValue());
            }
            throw Util.missingProperty("events", "events", reader);
        }
        Constructor<LogEventsRequest> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = LogEventsRequest.class.getDeclaredConstructor(List.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        if (list == null) {
            throw Util.missingProperty("events", "events", reader);
        }
        LogEventsRequest newInstance = constructor.newInstance(list, bool, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, LogEventsRequest value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("events");
        this.listOfJsonDataEventWrapperAdapter.toJson(writer, value_.getEvents());
        writer.name("sync");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getSync()));
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(38, "GeneratedJsonAdapter(LogEventsRequest)");
    }
}
