package retrofit2.converter.scalars;

import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
final class e implements retrofit2.i {
    static final e INSTANCE = new e();

    e() {
    }

    @Override // retrofit2.i
    public Double convert(ResponseBody responseBody) {
        return Double.valueOf(responseBody.string());
    }
}
