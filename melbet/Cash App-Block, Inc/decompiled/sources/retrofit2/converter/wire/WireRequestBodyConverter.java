package retrofit2.converter.wire;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import kotlin.UnsignedKt;
import kotlin.text.Regex;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import retrofit2.Converter;

/* loaded from: classes3.dex */
public final class WireRequestBodyConverter implements Converter {
    public static final MediaType MEDIA_TYPE;
    public final ProtoAdapter adapter;

    static {
        Regex regex = MediaType.TYPE_SUBTYPE;
        MEDIA_TYPE = UnsignedKt.get("application/x-protobuf");
    }

    public WireRequestBodyConverter(ProtoAdapter protoAdapter) {
        this.adapter = protoAdapter;
    }

    @Override // retrofit2.Converter
    public final Object convert(Object obj) {
        Buffer buffer = new Buffer();
        this.adapter.encode(buffer, (Message) obj);
        return RequestBody.create(MEDIA_TYPE, buffer.snapshot());
    }
}
