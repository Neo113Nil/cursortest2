package okhttp3;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.crypto.Mac;
import kotlin.Deprecated;
import kotlin.Pair;
import okhttp3.internal._UtilCommonKt;
import okio.BlackholeSink;
import okio.BufferedSink;
import okio.ByteString;
import okio.FileSystem;
import okio.HashingSink;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSink;
import okio.Source;

/* loaded from: classes3.dex */
public abstract class RequestBody {
    public static final Companion Companion = new Companion();
    public static final RequestBody EMPTY;

    static {
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        EMPTY = new RequestBody$Companion$toRequestBody$1(null, byteString);
    }

    public static final RequestBody create(final Path path, final FileSystem fileSystem, final MediaType mediaType) {
        Companion.getClass();
        path.getClass();
        fileSystem.getClass();
        return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$2
            @Override // okhttp3.RequestBody
            public final long contentLength() {
                Long l = (Long) fileSystem.metadata(path).size;
                if (l != null) {
                    return l.longValue();
                }
                return -1L;
            }

            @Override // okhttp3.RequestBody
            public final MediaType contentType() {
                return mediaType;
            }

            @Override // okhttp3.RequestBody
            public final void writeTo(BufferedSink bufferedSink) {
                Source source = fileSystem.source(path);
                try {
                    bufferedSink.writeAll(source);
                    source.close();
                } finally {
                }
            }
        };
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

    public final ByteString sha256() {
        byte[] doFinal;
        HashingSink hashingSink = new HashingSink(new BlackholeSink());
        RealBufferedSink realBufferedSink = new RealBufferedSink(hashingSink);
        try {
            writeTo(realBufferedSink);
            realBufferedSink.close();
            MessageDigest messageDigest = hashingSink.messageDigest;
            if (messageDigest != null) {
                doFinal = messageDigest.digest();
            } else {
                Mac mac = null;
                mac.getClass();
                doFinal = mac.doFinal();
            }
            doFinal.getClass();
            return new ByteString(doFinal);
        } finally {
        }
    }

    public abstract void writeTo(BufferedSink bufferedSink);

    public static final RequestBody create(String str, MediaType mediaType) {
        Companion.getClass();
        return Companion.create(str, mediaType);
    }

    @Deprecated
    public static final RequestBody create(MediaType mediaType, File file) {
        Companion.getClass();
        file.getClass();
        return new RequestBody$Companion$asRequestBody$1(file, mediaType);
    }

    @Deprecated
    public static final RequestBody create(MediaType mediaType, String str) {
        Companion.getClass();
        str.getClass();
        return Companion.create(str, mediaType);
    }

    @Deprecated
    public static final RequestBody create(MediaType mediaType, ByteString byteString) {
        Companion.getClass();
        byteString.getClass();
        return new RequestBody$Companion$toRequestBody$1(mediaType, byteString);
    }

    @Deprecated
    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        Companion.getClass();
        bArr.getClass();
        return Companion.create(mediaType, bArr, 0, bArr.length);
    }

    @Deprecated
    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i) {
        Companion.getClass();
        bArr.getClass();
        return Companion.create(mediaType, bArr, i, bArr.length);
    }

    public final class Companion {
        public static RequestBody$Companion$toRequestBody$3 create(String str, MediaType mediaType) {
            str.getClass();
            Pair chooseCharset = Okio.chooseCharset(mediaType);
            Charset charset = (Charset) chooseCharset.first;
            MediaType mediaType2 = (MediaType) chooseCharset.second;
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            return create(mediaType2, bytes, 0, bytes.length);
        }

        public static /* synthetic */ RequestBody$Companion$toRequestBody$3 create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, int i2) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            int length = bArr.length;
            companion.getClass();
            return create(mediaType, bArr, i, length);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.RequestBody$Companion$toRequestBody$3] */
        public static RequestBody$Companion$toRequestBody$3 create(final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
            bArr.getClass();
            _UtilCommonKt.checkOffsetAndCount(bArr.length, i, i2);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$3
                @Override // okhttp3.RequestBody
                public final long contentLength() {
                    return i2;
                }

                @Override // okhttp3.RequestBody
                public final MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public final void writeTo(BufferedSink bufferedSink) {
                    bufferedSink.write(i, i2, bArr);
                }
            };
        }
    }

    public static final RequestBody create(final FileDescriptor fileDescriptor, final MediaType mediaType) {
        Companion.getClass();
        fileDescriptor.getClass();
        return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
            @Override // okhttp3.RequestBody
            public final MediaType contentType() {
                return mediaType;
            }

            @Override // okhttp3.RequestBody
            public final boolean isOneShot() {
                return true;
            }

            @Override // okhttp3.RequestBody
            public final void writeTo(BufferedSink bufferedSink) {
                FileInputStream fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    bufferedSink.getBuffer().writeAll(Okio.source(fileInputStream));
                    fileInputStream.close();
                } finally {
                }
            }
        };
    }

    public static final RequestBody create(byte[] bArr) {
        Companion companion = Companion;
        companion.getClass();
        bArr.getClass();
        return Companion.create$default(companion, bArr, null, 0, 7);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        Companion companion = Companion;
        companion.getClass();
        bArr.getClass();
        return Companion.create$default(companion, bArr, mediaType, 0, 6);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
        Companion companion = Companion;
        companion.getClass();
        bArr.getClass();
        return Companion.create$default(companion, bArr, mediaType, i, 4);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i, int i2) {
        Companion.getClass();
        return Companion.create(mediaType, bArr, i, i2);
    }

    public static final RequestBody create(ByteString byteString, MediaType mediaType) {
        Companion.getClass();
        byteString.getClass();
        return new RequestBody$Companion$toRequestBody$1(mediaType, byteString);
    }

    public static final RequestBody create(File file, MediaType mediaType) {
        Companion.getClass();
        file.getClass();
        return new RequestBody$Companion$asRequestBody$1(file, mediaType);
    }

    @Deprecated
    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i, int i2) {
        Companion.getClass();
        bArr.getClass();
        return Companion.create(mediaType, bArr, i, i2);
    }
}
