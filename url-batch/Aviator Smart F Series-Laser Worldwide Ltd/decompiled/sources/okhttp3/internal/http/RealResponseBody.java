package okhttp3.internal.http;

import kotlin.jvm.internal.s;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.e;

/* loaded from: classes5.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final e source;

    public RealResponseBody(String str, long j8, e source) {
        s.checkNotNullParameter(source, "source");
        this.contentTypeString = str;
        this.contentLength = j8;
        this.source = source;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str == null) {
            return null;
        }
        return MediaType.Companion.parse(str);
    }

    @Override // okhttp3.ResponseBody
    public e source() {
        return this.source;
    }
}
