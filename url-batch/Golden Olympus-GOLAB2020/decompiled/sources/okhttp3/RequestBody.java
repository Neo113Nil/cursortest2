package okhttp3;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.f;

@Metadata
/* loaded from: classes3.dex */
public abstract class RequestBody {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f42534a = new Companion(null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ RequestBody c(Companion companion, byte[] bArr, MediaType mediaType, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                mediaType = null;
            }
            if ((i6 & 2) != 0) {
                i4 = 0;
            }
            if ((i6 & 4) != 0) {
                i5 = bArr.length;
            }
            return companion.b(bArr, mediaType, i4, i5);
        }

        public final RequestBody a(byte[] bArr, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return c(this, bArr, mediaType, 0, 0, 6, null);
        }

        public final RequestBody b(final byte[] bArr, final MediaType mediaType, final int i4, final int i5) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            Util.k(bArr.length, i4, i5);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public long a() {
                    return i5;
                }

                @Override // okhttp3.RequestBody
                public MediaType b() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void f(f sink) {
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    sink.write(bArr, i4, i5);
                }
            };
        }

        private Companion() {
        }
    }

    public static final RequestBody c(byte[] bArr, MediaType mediaType) {
        return f42534a.a(bArr, mediaType);
    }

    public long a() {
        return -1L;
    }

    public abstract MediaType b();

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public abstract void f(f fVar);
}
