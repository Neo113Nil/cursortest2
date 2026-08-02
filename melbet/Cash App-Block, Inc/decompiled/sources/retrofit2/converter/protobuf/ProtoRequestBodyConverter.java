package retrofit2.converter.protobuf;

import com.google.protobuf.MessageLite;
import kotlin.UnsignedKt;
import kotlin.text.Regex;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

/* loaded from: classes4.dex */
public final class ProtoRequestBodyConverter implements Converter {
    public static final MediaType MEDIA_TYPE;

    static {
        Regex regex = MediaType.TYPE_SUBTYPE;
        MEDIA_TYPE = UnsignedKt.get("application/x-protobuf");
    }

    @Override // retrofit2.Converter
    public final Object convert(Object obj) {
        return RequestBody.create(MEDIA_TYPE, ((MessageLite) obj).toByteArray());
    }
}
