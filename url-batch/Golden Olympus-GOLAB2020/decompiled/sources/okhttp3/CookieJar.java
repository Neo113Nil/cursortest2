package okhttp3;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes3.dex */
public interface CookieJar {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f42356a = Companion.f42358a;

    /* renamed from: b, reason: collision with root package name */
    public static final CookieJar f42357b = new Companion.NoCookies();

    @Metadata
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f42358a = new Companion();

        @Metadata
        private static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            public void a(HttpUrl url, List cookies) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cookies, "cookies");
            }

            @Override // okhttp3.CookieJar
            public List b(HttpUrl url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return CollectionsKt.emptyList();
            }
        }

        private Companion() {
        }
    }

    void a(HttpUrl httpUrl, List list);

    List b(HttpUrl httpUrl);
}
