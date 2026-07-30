package d5;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.moyoung.dafit.module.common.utils.m0;
import java.io.InputStreamReader;
import okhttp3.ResponseBody;
import retrofit2.i;

/* loaded from: classes4.dex */
public class a implements i {
    private final TypeAdapter<Object> adapter;
    private final e5.a decryptor = new e5.a();
    private final Gson gson;

    public a(Gson gson, TypeAdapter<Object> typeAdapter) {
        this.gson = gson;
        this.adapter = typeAdapter;
    }

    @Override // retrofit2.i
    public Object convert(ResponseBody responseBody) {
        byte[] readStream = m0.readStream(responseBody.byteStream());
        try {
            readStream = this.decryptor.decryptWhatOver(readStream);
        } catch (Exception unused) {
        }
        JsonReader newJsonReader = this.gson.newJsonReader(new InputStreamReader(m0.byteTOInputStream(readStream)));
        newJsonReader.setLenient(true);
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
