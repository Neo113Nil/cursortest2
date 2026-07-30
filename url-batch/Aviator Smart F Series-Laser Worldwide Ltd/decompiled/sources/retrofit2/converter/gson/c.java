package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import okhttp3.ResponseBody;
import retrofit2.i;

/* loaded from: classes5.dex */
final class c implements i {
    private final TypeAdapter<Object> adapter;
    private final Gson gson;

    c(Gson gson, TypeAdapter<Object> typeAdapter) {
        this.gson = gson;
        this.adapter = typeAdapter;
    }

    @Override // retrofit2.i
    public Object convert(ResponseBody responseBody) {
        JsonReader newJsonReader = this.gson.newJsonReader(responseBody.charStream());
        try {
            Object read2 = this.adapter.read2(newJsonReader);
            if (newJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return read2;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
