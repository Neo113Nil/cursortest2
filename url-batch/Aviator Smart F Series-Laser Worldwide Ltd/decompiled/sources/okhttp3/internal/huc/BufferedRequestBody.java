package okhttp3.internal.huc;

import com.google.common.net.HttpHeaders;
import okhttp3.Request;
import okio.c;
import okio.d;

/* loaded from: classes5.dex */
final class BufferedRequestBody extends OutputStreamRequestBody {
    final c buffer;
    long contentLength;

    BufferedRequestBody(long j8) {
        c cVar = new c();
        this.buffer = cVar;
        this.contentLength = -1L;
        initOutputStream(cVar, j8);
    }

    @Override // okhttp3.internal.huc.OutputStreamRequestBody, okhttp3.RequestBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.internal.huc.OutputStreamRequestBody
    public Request prepareToSendRequest(Request request) {
        if (request.header("Content-Length") != null) {
            return request;
        }
        outputStream().close();
        this.contentLength = this.buffer.size();
        return request.newBuilder().removeHeader(HttpHeaders.TRANSFER_ENCODING).header("Content-Length", Long.toString(this.buffer.size())).build();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(d dVar) {
        this.buffer.copyTo(dVar.buffer(), 0L, this.buffer.size());
    }
}
