package retrofit2.converter.scalars;

import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
final class h implements retrofit2.i {
    static final h INSTANCE = new h();

    h() {
    }

    @Override // retrofit2.i
    public Long convert(ResponseBody responseBody) {
        return Long.valueOf(responseBody.string());
    }
}
