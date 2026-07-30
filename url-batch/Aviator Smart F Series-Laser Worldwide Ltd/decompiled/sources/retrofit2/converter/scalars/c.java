package retrofit2.converter.scalars;

import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
final class c implements retrofit2.i {
    static final c INSTANCE = new c();

    c() {
    }

    @Override // retrofit2.i
    public Byte convert(ResponseBody responseBody) {
        return Byte.valueOf(responseBody.string());
    }
}
