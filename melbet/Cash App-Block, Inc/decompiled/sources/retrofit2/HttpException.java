package retrofit2;

import java.util.Objects;

/* loaded from: classes9.dex */
public class HttpException extends RuntimeException {
    public final int code;
    public final String message;
    public final transient Response response;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpException(Response response) {
        super(r0.toString());
        Objects.requireNonNull(response, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        okhttp3.Response response2 = response.rawResponse;
        int i = response2.code;
        sb.append(i);
        sb.append(" ");
        String str = response2.message;
        sb.append(str);
        this.code = i;
        this.message = str;
        this.response = response;
    }
}
