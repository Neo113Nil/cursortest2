package sqip.internal.event;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lsqip/internal/event/JsonDataEventWrapperJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lsqip/internal/event/JsonDataEventWrapper;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "constructorRef", "Ljava/lang/reflect/Constructor;", "longAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class JsonDataEventWrapperJsonAdapter extends JsonAdapter {
    private volatile Constructor<JsonDataEventWrapper> constructorRef;
    private final JsonAdapter longAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public JsonDataEventWrapperJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("catalog_name", "recorded_at_usec", "json_data", "app_name", "uuid", "secret_token", "es2_debug_trace_id");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "catalog_name");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "recorded_at_usec");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public JsonDataEventWrapper fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        int i = -1;
        String str = null;
        Long l = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Util.unexpectedNull("catalog_name", "catalog_name", reader);
                    }
                    break;
                case 1:
                    l = (Long) this.longAdapter.fromJson(reader);
                    if (l == null) {
                        throw Util.unexpectedNull("recorded_at_usec", "recorded_at_usec", reader);
                    }
                    break;
                case 2:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("json_data", "json_data", reader);
                    }
                    break;
                case 3:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("app_name", "app_name", reader);
                    }
                    i &= -9;
                    break;
                case 4:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("uuid", "uuid", reader);
                    }
                    i &= -17;
                    break;
                case 5:
                    str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("secret_token", "secret_token", reader);
                    }
                    i &= -33;
                    break;
                case 6:
                    str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw Util.unexpectedNull("es2_debug_trace_id", "es2_debug_trace_id", reader);
                    }
                    i &= -65;
                    break;
            }
        }
        reader.endObject();
        if (i == -121) {
            Long l2 = l;
            String str7 = str;
            if (str7 == null) {
                throw Util.missingProperty("catalog_name", "catalog_name", reader);
            }
            if (l2 == null) {
                throw Util.missingProperty("recorded_at_usec", "recorded_at_usec", reader);
            }
            long longValue = l2.longValue();
            if (str2 == null) {
                throw Util.missingProperty("json_data", "json_data", reader);
            }
            Request$Priority$EnumUnboxingLocalUtility.m(str3, str4, str5, str6);
            String str8 = str6;
            return new JsonDataEventWrapper(str7, longValue, str2, str3, str4, str5, str8);
        }
        Long l3 = l;
        String str9 = str;
        Constructor<JsonDataEventWrapper> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = JsonDataEventWrapper.class.getDeclaredConstructor(String.class, Long.TYPE, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Constructor<JsonDataEventWrapper> constructor2 = constructor;
        if (str9 == null) {
            throw Util.missingProperty("catalog_name", "catalog_name", reader);
        }
        if (l3 == null) {
            throw Util.missingProperty("recorded_at_usec", "recorded_at_usec", reader);
        }
        if (str2 == null) {
            throw Util.missingProperty("json_data", "json_data", reader);
        }
        JsonDataEventWrapper newInstance = constructor2.newInstance(str9, l3, str2, str3, str4, str5, str6, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, JsonDataEventWrapper value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("catalog_name");
        this.stringAdapter.toJson(writer, value_.getCatalog_name());
        writer.name("recorded_at_usec");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getRecorded_at_usec()));
        writer.name("json_data");
        this.stringAdapter.toJson(writer, value_.getJson_data());
        writer.name("app_name");
        this.stringAdapter.toJson(writer, value_.getApp_name());
        writer.name("uuid");
        this.stringAdapter.toJson(writer, value_.getUuid());
        writer.name("secret_token");
        this.stringAdapter.toJson(writer, value_.getSecret_token());
        writer.name("es2_debug_trace_id");
        this.stringAdapter.toJson(writer, value_.getEs2_debug_trace_id());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(42, "GeneratedJsonAdapter(JsonDataEventWrapper)");
    }
}
