package okhttp3;

import okio.BufferedSink;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {
    public final /* synthetic */ MediaType $contentType;
    public final /* synthetic */ ByteString $this_toRequestBody;

    public RequestBody$Companion$toRequestBody$1(MediaType mediaType, ByteString byteString) {
        this.$contentType = mediaType;
        this.$this_toRequestBody = byteString;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.$this_toRequestBody.getSize$okio();
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.$contentType;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink bufferedSink) {
        bufferedSink.write(this.$this_toRequestBody);
    }
}
