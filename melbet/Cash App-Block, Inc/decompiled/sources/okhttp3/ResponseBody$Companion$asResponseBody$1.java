package okhttp3;

import okio.BufferedSource;

/* loaded from: classes3.dex */
public final class ResponseBody$Companion$asResponseBody$1 extends ResponseBody {
    public final /* synthetic */ long $contentLength;
    public final /* synthetic */ MediaType $contentType;
    public final /* synthetic */ BufferedSource $this_asResponseBody;

    public ResponseBody$Companion$asResponseBody$1(MediaType mediaType, long j, BufferedSource bufferedSource) {
        this.$contentType = mediaType;
        this.$contentLength = j;
        this.$this_asResponseBody = bufferedSource;
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.$contentLength;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        return this.$contentType;
    }

    @Override // okhttp3.ResponseBody
    public final BufferedSource source() {
        return this.$this_asResponseBody;
    }
}
