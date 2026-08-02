package com.withpersona.sdk2.inquiry.ui.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import java.util.Map;
import okio.Buffer;
import okio.RealBufferedSink;
import org.json.JSONException;
import org.json.JSONObject;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/JsonObjectAdapter;", "", "Lcom/squareup/moshi/JsonWriter;", "writer", "Lorg/json/JSONObject;", "value", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lorg/json/JSONObject;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lorg/json/JSONObject;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JsonObjectAdapter {
    public static final JsonObjectAdapter INSTANCE = new JsonObjectAdapter();

    @FromJson
    public final JSONObject fromJson(JsonReader reader) {
        reader.getClass();
        Object readJsonValue = reader.readJsonValue();
        Map map = readJsonValue instanceof Map ? (Map) readJsonValue : null;
        if (map != null) {
            try {
                return new JSONObject(map);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @ToJson
    public final void toJson(JsonWriter writer, JSONObject value) {
        writer.getClass();
        if (value != null) {
            Buffer buffer = new Buffer();
            String jSONObject = value.toString();
            jSONObject.getClass();
            buffer.m4339writeUtf8(jSONObject);
            if (writer.promoteValueToName) {
                a$$ExternalSyntheticBUOutline0.m$1("BufferedSource cannot be used as a map key in JSON at path ".concat(writer.getPath()));
                return;
            }
            RealBufferedSink valueSink = writer.valueSink();
            try {
                buffer.readAll(valueSink);
                valueSink.close();
            } catch (Throwable th) {
                try {
                    valueSink.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
