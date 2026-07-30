package retrofit2.converter.scalars;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/* loaded from: classes5.dex */
final class a implements retrofit2.i {
    static final a INSTANCE = new a();
    private static final MediaType MEDIA_TYPE = MediaType.get("text/plain; charset=UTF-8");

    private a() {
    }

    @Override // retrofit2.i
    public RequestBody convert(Object obj) {
        return RequestBody.create(MEDIA_TYPE, String.valueOf(obj));
    }
}
