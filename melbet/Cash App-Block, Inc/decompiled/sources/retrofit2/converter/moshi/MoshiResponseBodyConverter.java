package retrofit2.converter.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonUtf8Reader;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.ByteString;
import retrofit2.Converter;

/* loaded from: classes9.dex */
public final class MoshiResponseBodyConverter implements Converter {
    public static final ByteString UTF8_BOM;
    public final JsonAdapter adapter;

    static {
        ByteString.Companion companion = ByteString.Companion;
        UTF8_BOM = ByteString.Companion.decodeHex("EFBBBF");
    }

    public MoshiResponseBodyConverter(JsonAdapter jsonAdapter) {
        this.adapter = jsonAdapter;
    }

    @Override // retrofit2.Converter
    public final Object convert(Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        BufferedSource source = responseBody.source();
        try {
            if (source.rangeEquals(0L, UTF8_BOM)) {
                source.skip(r1.data.length);
            }
            JsonUtf8Reader jsonUtf8Reader = new JsonUtf8Reader(source);
            Object fromJson = this.adapter.fromJson(jsonUtf8Reader);
            if (jsonUtf8Reader.peek() != JsonReader.Token.END_DOCUMENT) {
                throw new JsonDataException("JSON document was not fully consumed.");
            }
            responseBody.close();
            return fromJson;
        } catch (Throwable th) {
            responseBody.close();
            throw th;
        }
    }
}
