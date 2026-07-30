package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public class HttpException extends RuntimeException {
    private final int code;
    private final String message;
    private final transient u response;

    public HttpException(u uVar) {
        super(getMessage(uVar));
        this.code = uVar.code();
        this.message = uVar.message();
        this.response = uVar;
    }

    private static String getMessage(u uVar) {
        Objects.requireNonNull(uVar, "response == null");
        return "HTTP " + uVar.code() + cn.hutool.core.text.l.SPACE + uVar.message();
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    @Nullable
    public u response() {
        return this.response;
    }
}
