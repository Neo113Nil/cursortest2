package okhttp3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.authenticator.JavaNetAuthenticator;

@Metadata
/* loaded from: classes3.dex */
public interface Authenticator {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f42125a = Companion.f42128a;

    /* renamed from: b, reason: collision with root package name */
    public static final Authenticator f42126b = new Companion.AuthenticatorNone();

    /* renamed from: c, reason: collision with root package name */
    public static final Authenticator f42127c = new JavaNetAuthenticator(null, 1, null);

    @Metadata
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f42128a = new Companion();

        @Metadata
        private static final class AuthenticatorNone implements Authenticator {
            @Override // okhttp3.Authenticator
            public Request a(Route route, Response response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return null;
            }
        }

        private Companion() {
        }
    }

    Request a(Route route, Response response);
}
