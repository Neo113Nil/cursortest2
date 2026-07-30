package retrofit2.converter.scalars;

import java.io.IOException;
import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
final class d implements retrofit2.i {
    static final d INSTANCE = new d();

    d() {
    }

    @Override // retrofit2.i
    public Character convert(ResponseBody responseBody) {
        String string = responseBody.string();
        if (string.length() == 1) {
            return Character.valueOf(string.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + string.length());
    }
}
