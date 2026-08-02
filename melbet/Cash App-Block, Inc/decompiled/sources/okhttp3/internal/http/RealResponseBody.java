package okhttp3.internal.http;

import kotlin.UnsignedKt;
import kotlin.text.Regex;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.RealBufferedSource;

/* loaded from: classes3.dex */
public final class RealResponseBody extends ResponseBody {
    public final long contentLength;
    public final String contentTypeString;
    public final RealBufferedSource source;

    public RealResponseBody(String str, long j, RealBufferedSource realBufferedSource) {
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = realBufferedSource;
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            Regex regex = MediaType.TYPE_SUBTYPE;
            try {
                return UnsignedKt.get(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public final BufferedSource source() {
        return this.source;
    }
}
