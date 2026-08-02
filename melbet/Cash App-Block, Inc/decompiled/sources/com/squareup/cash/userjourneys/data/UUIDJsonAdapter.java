package com.squareup.cash.userjourneys.data;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/squareup/cash/userjourneys/data/UUIDJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/util/UUID;", "Lcom/squareup/moshi/JsonWriter;", "writer", "uuid", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Ljava/util/UUID;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Ljava/util/UUID;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UUIDJsonAdapter extends JsonAdapter {
    @Override // com.squareup.moshi.JsonAdapter
    @FromJson
    public UUID fromJson(JsonReader reader) {
        reader.getClass();
        if (reader.peek() != JsonReader.Token.NULL) {
            return UUID.fromString(reader.nextString());
        }
        reader.nextNull();
        return null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @ToJson
    public void toJson(JsonWriter writer, UUID uuid) {
        writer.getClass();
        if (uuid == null) {
            writer.nullValue();
        } else {
            writer.value(uuid.toString());
        }
    }
}
