package okhttp3;

import f2.AbstractC2420c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.internal.Util;
import okio.C3372e;
import okio.g;

@Metadata
/* loaded from: classes3.dex */
public abstract class ResponseBody implements Closeable, AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f42570b = new Companion(null);

    @Metadata
    public static final class BomAwareReader extends Reader implements AutoCloseable {

        /* renamed from: b, reason: collision with root package name */
        private final g f42571b;

        /* renamed from: c, reason: collision with root package name */
        private final Charset f42572c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f42573d;

        /* renamed from: e, reason: collision with root package name */
        private Reader f42574e;

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Unit unit;
            this.f42573d = true;
            Reader reader = this.f42574e;
            if (reader != null) {
                reader.close();
                unit = Unit.f41027a;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.f42571b.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i4, int i5) {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.f42573d) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.f42574e;
            if (reader == null) {
                reader = new InputStreamReader(this.f42571b.S(), Util.I(this.f42571b, this.f42572c));
                this.f42574e = reader;
            }
            return reader.read(cbuf, i4, i5);
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ResponseBody c(Companion companion, byte[] bArr, MediaType mediaType, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                mediaType = null;
            }
            return companion.b(bArr, mediaType);
        }

        public final ResponseBody a(final g gVar, final MediaType mediaType, final long j4) {
            Intrinsics.checkNotNullParameter(gVar, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public g J() {
                    return gVar;
                }

                @Override // okhttp3.ResponseBody
                public long o() {
                    return j4;
                }

                @Override // okhttp3.ResponseBody
                public MediaType p() {
                    return MediaType.this;
                }
            };
        }

        public final ResponseBody b(byte[] bArr, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return a(new C3372e().L(bArr), mediaType, bArr.length);
        }

        private Companion() {
        }
    }

    private final Charset n() {
        Charset c4;
        MediaType p4 = p();
        return (p4 == null || (c4 = p4.c(Charsets.UTF_8)) == null) ? Charsets.UTF_8 : c4;
    }

    public abstract g J();

    public final String N() {
        g J3 = J();
        try {
            String E4 = J3.E(Util.I(J3, n()));
            AbstractC2420c.a(J3, null);
            return E4;
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.l(J());
    }

    public final byte[] m() {
        long o4 = o();
        if (o4 > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + o4);
        }
        g J3 = J();
        try {
            byte[] u4 = J3.u();
            AbstractC2420c.a(J3, null);
            int length = u4.length;
            if (o4 == -1 || o4 == length) {
                return u4;
            }
            throw new IOException("Content-Length (" + o4 + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public abstract long o();

    public abstract MediaType p();
}
