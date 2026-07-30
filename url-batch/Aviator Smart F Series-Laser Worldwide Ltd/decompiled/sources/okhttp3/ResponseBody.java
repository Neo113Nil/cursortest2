package okhttp3;

import f6.l;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import kotlin.text.d;
import okhttp3.internal.Util;
import okio.ByteString;
import okio.c;
import okio.e;
import y5.w;

/* loaded from: classes5.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final e source;

        public BomAwareReader(e source, Charset charset) {
            s.checkNotNullParameter(source, "source");
            s.checkNotNullParameter(charset, "charset");
            this.source = source;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            w wVar;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader == null) {
                wVar = null;
            } else {
                reader.close();
                wVar = w.INSTANCE;
            }
            if (wVar == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i8, int i9) {
            s.checkNotNullParameter(cbuf, "cbuf");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.delegate;
            if (reader == null) {
                reader = new InputStreamReader(this.source.inputStream(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = reader;
            }
            return reader.read(cbuf, i8, i9);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            s.checkNotNullParameter(str, "<this>");
            Charset charset = d.UTF_8;
            if (mediaType != null) {
                Charset charset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charset$default;
                }
            }
            c writeString = new c().writeString(str, charset);
            return create(writeString, mediaType, writeString.size());
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, e eVar, MediaType mediaType, long j8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                mediaType = null;
            }
            if ((i8 & 2) != 0) {
                j8 = -1;
            }
            return companion.create(eVar, mediaType, j8);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            s.checkNotNullParameter(bArr, "<this>");
            return create(new c().write(bArr), mediaType, bArr.length);
        }

        public final ResponseBody create(ByteString byteString, MediaType mediaType) {
            s.checkNotNullParameter(byteString, "<this>");
            return create(new c().write(byteString), mediaType, byteString.size());
        }

        public final ResponseBody create(final e eVar, final MediaType mediaType, final long j8) {
            s.checkNotNullParameter(eVar, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j8;
                }

                @Override // okhttp3.ResponseBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                public e source() {
                    return eVar;
                }
            };
        }

        public final ResponseBody create(MediaType mediaType, String content) {
            s.checkNotNullParameter(content, "content");
            return create(content, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, byte[] content) {
            s.checkNotNullParameter(content, "content");
            return create(content, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, ByteString content) {
            s.checkNotNullParameter(content, "content");
            return create(content, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, long j8, e content) {
            s.checkNotNullParameter(content, "content");
            return create(content, mediaType, j8);
        }
    }

    private final Charset charset() {
        MediaType contentType = contentType();
        Charset charset = contentType == null ? null : contentType.charset(d.UTF_8);
        return charset == null ? d.UTF_8 : charset;
    }

    private final <T> T consumeSource(l lVar, l lVar2) {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException(s.stringPlus("Cannot buffer entire body for content length: ", Long.valueOf(contentLength)));
        }
        e source = source();
        try {
            T t7 = (T) lVar.invoke(source);
            r.finallyStart(1);
            kotlin.io.b.closeFinally(source, null);
            r.finallyEnd(1);
            int intValue = ((Number) lVar2.invoke(t7)).intValue();
            if (contentLength == -1 || contentLength == intValue) {
                return t7;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + intValue + ") disagree");
        } finally {
        }
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final ByteString byteString() {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException(s.stringPlus("Cannot buffer entire body for content length: ", Long.valueOf(contentLength)));
        }
        e source = source();
        try {
            ByteString readByteString = source.readByteString();
            kotlin.io.b.closeFinally(source, null);
            int size = readByteString.size();
            if (contentLength == -1 || contentLength == size) {
                return readByteString;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + size + ") disagree");
        } finally {
        }
    }

    public final byte[] bytes() {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException(s.stringPlus("Cannot buffer entire body for content length: ", Long.valueOf(contentLength)));
        }
        e source = source();
        try {
            byte[] readByteArray = source.readByteArray();
            kotlin.io.b.closeFinally(source, null);
            int length = readByteArray.length;
            if (contentLength == -1 || contentLength == length) {
                return readByteArray;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract e source();

    public final String string() {
        e source = source();
        try {
            String readString = source.readString(Util.readBomAsCharset(source, charset()));
            kotlin.io.b.closeFinally(source, null);
            return readString;
        } finally {
        }
    }

    public static final ResponseBody create(MediaType mediaType, long j8, e eVar) {
        return Companion.create(mediaType, j8, eVar);
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final ResponseBody create(MediaType mediaType, ByteString byteString) {
        return Companion.create(mediaType, byteString);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(e eVar, MediaType mediaType, long j8) {
        return Companion.create(eVar, mediaType, j8);
    }

    public static final ResponseBody create(ByteString byteString, MediaType mediaType) {
        return Companion.create(byteString, mediaType);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }
}
