package okhttp3.internal.http1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okio.g;

@Metadata
/* loaded from: classes3.dex */
public final class HeadersReader {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f42858c = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final g f42859a;

    /* renamed from: b, reason: collision with root package name */
    private long f42860b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public HeadersReader(g source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f42859a = source;
        this.f42860b = 262144L;
    }

    public final Headers a() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String b4 = b();
            if (b4.length() == 0) {
                return builder.d();
            }
            builder.b(b4);
        }
    }

    public final String b() {
        String A4 = this.f42859a.A(this.f42860b);
        this.f42860b -= A4.length();
        return A4;
    }
}
