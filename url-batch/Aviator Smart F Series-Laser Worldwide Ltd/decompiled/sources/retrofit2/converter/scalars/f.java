package retrofit2.converter.scalars;

import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
final class f implements retrofit2.i {
    static final f INSTANCE = new f();

    f() {
    }

    @Override // retrofit2.i
    public Float convert(ResponseBody responseBody) {
        return Float.valueOf(responseBody.string());
    }
}
