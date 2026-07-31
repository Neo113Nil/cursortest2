package okhttp3;

import kotlin.Metadata;

@Metadata
/* loaded from: classes3.dex */
public interface Interceptor {

    @Metadata
    public interface Chain {
        Response a(Request request);

        Request b();

        Call call();
    }

    @Metadata
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f42411a = new Companion();

        private Companion() {
        }
    }

    Response a(Chain chain);
}
