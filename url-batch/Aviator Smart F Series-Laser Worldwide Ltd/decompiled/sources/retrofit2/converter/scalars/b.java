package retrofit2.converter.scalars;

import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
final class b implements retrofit2.i {
    static final b INSTANCE = new b();

    b() {
    }

    @Override // retrofit2.i
    public Boolean convert(ResponseBody responseBody) {
        return Boolean.valueOf(responseBody.string());
    }
}
