package okhttp3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.text.Charsets;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "BomAwareReader", "kotlin/time/DurationKt", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ResponseBody implements Closeable {
    public static final ResponseBody$Companion$asResponseBody$1 EMPTY;
    public BomAwareReader reader;

    /* loaded from: classes9.dex */
    public final class BomAwareReader extends Reader {
        public final Charset charset;
        public boolean closed;
        public InputStreamReader delegate;
        public final BufferedSource source;

        public BomAwareReader(BufferedSource bufferedSource, Charset charset) {
            bufferedSource.getClass();
            charset.getClass();
            this.source = bufferedSource;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.closed = true;
            InputStreamReader inputStreamReader = this.delegate;
            if (inputStreamReader != null) {
                inputStreamReader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) {
            cArr.getClass();
            if (this.closed) {
                a$$ExternalSyntheticBUOutline0.m$4("Stream closed");
                return 0;
            }
            InputStreamReader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                BufferedSource bufferedSource = this.source;
                inputStreamReader = new InputStreamReader(bufferedSource.inputStream(), _UtilJvmKt.readBomAsCharset(bufferedSource, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i, i2);
        }
    }

    static {
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        Buffer buffer = new Buffer();
        buffer.m4333write(byteString);
        EMPTY = new ResponseBody$Companion$asResponseBody$1(null, byteString.data.length, buffer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final ByteString byteString() {
        long contentLength = contentLength();
        ByteString th = null;
        if (contentLength > 2147483647L) {
            a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline2.m(contentLength, "Cannot buffer entire body for content length: "));
            return null;
        }
        BufferedSource source = source();
        try {
            ByteString readByteString = source.readByteString();
            try {
                source.close();
            } catch (Throwable th2) {
                th = th2;
            }
            ByteString byteString = th;
            th = readByteString;
            th = byteString;
        } catch (Throwable th3) {
            th = th3;
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th4) {
                    ExceptionsKt__ExceptionsKt.addSuppressed(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int size$okio = th.getSize$okio();
        if (contentLength == -1 || contentLength == size$okio) {
            return th;
        }
        throw new IOException("Content-Length (" + contentLength + ") and stream length (" + size$okio + ") disagree");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final byte[] bytes() {
        long contentLength = contentLength();
        byte[] th = null;
        if (contentLength > 2147483647L) {
            a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline2.m(contentLength, "Cannot buffer entire body for content length: "));
            return null;
        }
        BufferedSource source = source();
        try {
            byte[] readByteArray = source.readByteArray();
            try {
                source.close();
            } catch (Throwable th2) {
                th = th2;
            }
            byte[] bArr = th;
            th = readByteArray;
            th = bArr;
        } catch (Throwable th3) {
            th = th3;
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th4) {
                    ExceptionsKt__ExceptionsKt.addSuppressed(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (contentLength == -1 || contentLength == length) {
            return th;
        }
        throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        _UtilCommonKt.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract BufferedSource source();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final String string() {
        Charset charset;
        BufferedSource source = source();
        String th = null;
        try {
            MediaType contentType = contentType();
            if (contentType == null || (charset = MediaType.charset$default(contentType)) == null) {
                charset = Charsets.UTF_8;
            }
            String readString = source.readString(_UtilJvmKt.readBomAsCharset(source, charset));
            try {
                source.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = readString;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th4) {
                    ExceptionsKt__ExceptionsKt.addSuppressed(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }
}
