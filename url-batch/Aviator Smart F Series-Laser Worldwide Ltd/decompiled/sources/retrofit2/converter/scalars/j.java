package retrofit2.converter.scalars;

import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
final class j implements retrofit2.i {
    static final j INSTANCE = new j();

    j() {
    }

    @Override // retrofit2.i
    public String convert(ResponseBody responseBody) {
        return responseBody.string();
    }
}
