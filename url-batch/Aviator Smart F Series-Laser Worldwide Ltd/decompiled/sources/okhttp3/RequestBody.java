package okhttp3;

import java.io.File;
import java.nio.charset.Charset;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.text.d;
import okhttp3.internal.Util;
import okio.ByteString;
import okio.j0;
import okio.x0;

/* loaded from: classes5.dex */
public abstract class RequestBody {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final RequestBody create(MediaType mediaType, byte[] content) {
            s.checkNotNullParameter(content, "content");
            return create$default(this, mediaType, content, 0, 0, 12, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        public final RequestBody create(MediaType mediaType, byte[] content, int i8) {
            s.checkNotNullParameter(content, "content");
            return create$default(this, mediaType, content, i8, 0, 8, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i8, int i9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            if ((i10 & 2) != 0) {
                i8 = 0;
            }
            if ((i10 & 4) != 0) {
                i9 = bArr.length;
            }
            return companion.create(bArr, mediaType, i8, i9);
        }

        public final RequestBody create(byte[] bArr) {
            s.checkNotNullParameter(bArr, "<this>");
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType) {
            s.checkNotNullParameter(bArr, "<this>");
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType, int i8) {
            s.checkNotNullParameter(bArr, "<this>");
            return create$default(this, bArr, mediaType, i8, 0, 4, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i8, int i9, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                i8 = 0;
            }
            if ((i10 & 8) != 0) {
                i9 = bArr.length;
            }
            return companion.create(mediaType, bArr, i8, i9);
        }

        public final RequestBody create(String str, MediaType mediaType) {
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
            byte[] bytes = str.getBytes(charset);
            s.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return create(bytes, mediaType, 0, bytes.length);
        }

        public final RequestBody create(final ByteString byteString, final MediaType mediaType) {
            s.checkNotNullParameter(byteString, "<this>");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return byteString.size();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(okio.d sink) {
                    s.checkNotNullParameter(sink, "sink");
                    sink.write(byteString);
                }
            };
        }

        public final RequestBody create(final byte[] bArr, final MediaType mediaType, final int i8, final int i9) {
            s.checkNotNullParameter(bArr, "<this>");
            Util.checkOffsetAndCount(bArr.length, i8, i9);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return i9;
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(okio.d sink) {
                    s.checkNotNullParameter(sink, "sink");
                    sink.write(bArr, i8, i9);
                }
            };
        }

        public final RequestBody create(final File file, final MediaType mediaType) {
            s.checkNotNullParameter(file, "<this>");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(okio.d sink) {
                    s.checkNotNullParameter(sink, "sink");
                    x0 source = j0.source(file);
                    try {
                        sink.writeAll(source);
                        kotlin.io.b.closeFinally(source, null);
                    } finally {
                    }
                }
            };
        }

        public final RequestBody create(MediaType mediaType, String content) {
            s.checkNotNullParameter(content, "content");
            return create(content, mediaType);
        }

        public final RequestBody create(MediaType mediaType, ByteString content) {
            s.checkNotNullParameter(content, "content");
            return create(content, mediaType);
        }

        public final RequestBody create(MediaType mediaType, byte[] content, int i8, int i9) {
            s.checkNotNullParameter(content, "content");
            return create(content, mediaType, i8, i9);
        }

        public final RequestBody create(MediaType mediaType, File file) {
            s.checkNotNullParameter(file, "file");
            return create(file, mediaType);
        }
    }

    public static final RequestBody create(File file, MediaType mediaType) {
        return Companion.create(file, mediaType);
    }

    public long contentLength() {
        return -1L;
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(okio.d dVar);

    public static final RequestBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final RequestBody create(MediaType mediaType, File file) {
        return Companion.create(mediaType, file);
    }

    public static final RequestBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final RequestBody create(MediaType mediaType, ByteString byteString) {
        return Companion.create(mediaType, byteString);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i8) {
        return Companion.create(mediaType, bArr, i8);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i8, int i9) {
        return Companion.create(mediaType, bArr, i8, i9);
    }

    public static final RequestBody create(ByteString byteString, MediaType mediaType) {
        return Companion.create(byteString, mediaType);
    }

    public static final RequestBody create(byte[] bArr) {
        return Companion.create(bArr);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i8) {
        return Companion.create(bArr, mediaType, i8);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i8, int i9) {
        return Companion.create(bArr, mediaType, i8, i9);
    }
}
