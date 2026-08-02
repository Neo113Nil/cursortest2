package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import kotlin.UnsignedKt;
import kotlin.text.Regex;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.Buffer$outputStream$1;
import retrofit2.Converter;

/* loaded from: classes4.dex */
public final class GsonRequestBodyConverter implements Converter {
    public static final MediaType MEDIA_TYPE;
    public final TypeAdapter adapter;
    public final Gson gson;

    static {
        Regex regex = MediaType.TYPE_SUBTYPE;
        MEDIA_TYPE = UnsignedKt.get("application/json; charset=UTF-8");
    }

    public GsonRequestBodyConverter(Gson gson, TypeAdapter typeAdapter) {
        this.gson = gson;
        this.adapter = typeAdapter;
    }

    @Override // retrofit2.Converter
    public final Object convert(Object obj) {
        Buffer buffer = new Buffer();
        JsonWriter newJsonWriter = this.gson.newJsonWriter(new OutputStreamWriter(new Buffer$outputStream$1(buffer, 0), StandardCharsets.UTF_8));
        this.adapter.write(newJsonWriter, obj);
        newJsonWriter.close();
        return RequestBody.create(MEDIA_TYPE, buffer.readByteString(buffer.size));
    }
}
