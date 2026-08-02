package retrofit2.converter.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonUtf8Writer;
import kotlin.UnsignedKt;
import kotlin.text.Regex;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import retrofit2.Converter;

/* loaded from: classes9.dex */
public final class MoshiRequestBodyConverter implements Converter {
    public static final MediaType MEDIA_TYPE;
    public final JsonAdapter adapter;

    static {
        Regex regex = MediaType.TYPE_SUBTYPE;
        MEDIA_TYPE = UnsignedKt.get("application/json; charset=UTF-8");
    }

    public MoshiRequestBodyConverter(JsonAdapter jsonAdapter) {
        this.adapter = jsonAdapter;
    }

    @Override // retrofit2.Converter
    public final Object convert(Object obj) {
        Buffer buffer = new Buffer();
        this.adapter.toJson(new JsonUtf8Writer(buffer), obj);
        return RequestBody.create(MEDIA_TYPE, buffer.readByteString(buffer.size));
    }
}
