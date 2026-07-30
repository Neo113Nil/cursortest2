package retrofit2.converter.scalars;

import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
final class g implements retrofit2.i {
    static final g INSTANCE = new g();

    g() {
    }

    @Override // retrofit2.i
    public Integer convert(ResponseBody responseBody) {
        return Integer.valueOf(responseBody.string());
    }
}
