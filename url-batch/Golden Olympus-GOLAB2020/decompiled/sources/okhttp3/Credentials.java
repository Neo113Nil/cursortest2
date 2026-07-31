package okhttp3;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.h;

@Metadata
/* loaded from: classes3.dex */
public final class Credentials {

    /* renamed from: a, reason: collision with root package name */
    public static final Credentials f42359a = new Credentials();

    private Credentials() {
    }

    public static final String a(String username, String password, Charset charset) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return "Basic " + h.f43270e.c(username + ':' + password, charset).c();
    }
}
