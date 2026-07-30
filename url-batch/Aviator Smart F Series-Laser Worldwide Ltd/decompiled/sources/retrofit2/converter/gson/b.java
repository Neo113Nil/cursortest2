package retrofit2.converter.gson;

import cn.hutool.core.util.l;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.i;

/* loaded from: classes5.dex */
final class b implements i {
    private static final MediaType MEDIA_TYPE = MediaType.get("application/json; charset=UTF-8");
    private static final Charset UTF_8 = Charset.forName(l.UTF_8);
    private final TypeAdapter<Object> adapter;
    private final Gson gson;

    b(Gson gson, TypeAdapter<Object> typeAdapter) {
        this.gson = gson;
        this.adapter = typeAdapter;
    }

    @Override // retrofit2.i
    public RequestBody convert(Object obj) {
        okio.c cVar = new okio.c();
        JsonWriter newJsonWriter = this.gson.newJsonWriter(new OutputStreamWriter(cVar.outputStream(), UTF_8));
        this.adapter.write(newJsonWriter, obj);
        newJsonWriter.close();
        return RequestBody.create(MEDIA_TYPE, cVar.readByteString());
    }
}
