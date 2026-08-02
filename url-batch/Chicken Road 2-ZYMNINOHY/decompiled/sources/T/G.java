package T;

import E.AbstractC0005f;
import java.io.IOException;

/* loaded from: classes.dex */
public class G extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2659a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2660b;

    public G(String str, Throwable th, boolean z, int i4) {
        super(str, th);
        this.f2659a = z;
        this.f2660b = i4;
    }

    public static G a(RuntimeException runtimeException, String str) {
        return new G(str, runtimeException, true, 1);
    }

    public static G b(String str, Exception exc) {
        return new G(str, exc, true, 4);
    }

    public static G c(String str) {
        return new G(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.f2659a);
        sb.append(", dataType=");
        return AbstractC0005f.o(sb, this.f2660b, "}");
    }
}
