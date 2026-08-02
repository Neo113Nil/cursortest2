package okhttp3;

import java.io.File;
import java.io.FileInputStream;
import okio.BufferedSink;
import okio.InputStreamSource;
import okio.Timeout;

/* loaded from: classes9.dex */
public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {
    public final /* synthetic */ MediaType $contentType;
    public final /* synthetic */ File $this_asRequestBody;

    public RequestBody$Companion$asRequestBody$1(File file, MediaType mediaType) {
        this.$contentType = mediaType;
        this.$this_asRequestBody = file;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.$this_asRequestBody.length();
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.$contentType;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink bufferedSink) {
        File file = this.$this_asRequestBody;
        file.getClass();
        InputStreamSource inputStreamSource = new InputStreamSource(new FileInputStream(file), Timeout.NONE);
        try {
            bufferedSink.writeAll(inputStreamSource);
            inputStreamSource.close();
        } finally {
        }
    }
}
