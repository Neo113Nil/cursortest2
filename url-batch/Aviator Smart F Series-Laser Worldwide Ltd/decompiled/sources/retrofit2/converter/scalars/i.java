package retrofit2.converter.scalars;

import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
final class i implements retrofit2.i {
    static final i INSTANCE = new i();

    i() {
    }

    @Override // retrofit2.i
    public Short convert(ResponseBody responseBody) {
        return Short.valueOf(responseBody.string());
    }
}
