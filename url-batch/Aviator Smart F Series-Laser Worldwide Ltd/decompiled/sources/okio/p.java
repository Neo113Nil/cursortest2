package okio;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes5.dex */
public final class p extends l {
    public static final a Companion = new a(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final p hmacSha1(v0 sink, ByteString key) {
            kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
            kotlin.jvm.internal.s.checkNotNullParameter(key, "key");
            return new p(sink, key, "HmacSHA1");
        }

        public final p hmacSha256(v0 sink, ByteString key) {
            kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
            kotlin.jvm.internal.s.checkNotNullParameter(key, "key");
            return new p(sink, key, "HmacSHA256");
        }

        public final p hmacSha512(v0 sink, ByteString key) {
            kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
            kotlin.jvm.internal.s.checkNotNullParameter(key, "key");
            return new p(sink, key, "HmacSHA512");
        }

        public final p md5(v0 sink) {
            kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
            return new p(sink, "MD5");
        }

        public final p sha1(v0 sink) {
            kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
            return new p(sink, "SHA-1");
        }

        public final p sha256(v0 sink) {
            kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
            return new p(sink, org.bouncycastle.pqc.crypto.xmss.o.SHA_256);
        }

        public final p sha512(v0 sink) {
            kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
            return new p(sink, org.bouncycastle.pqc.crypto.xmss.o.SHA_512);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(v0 sink, MessageDigest digest) {
        super(sink);
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        kotlin.jvm.internal.s.checkNotNullParameter(digest, "digest");
        this.messageDigest = digest;
        this.mac = null;
    }

    public static final p hmacSha1(v0 v0Var, ByteString byteString) {
        return Companion.hmacSha1(v0Var, byteString);
    }

    public static final p hmacSha256(v0 v0Var, ByteString byteString) {
        return Companion.hmacSha256(v0Var, byteString);
    }

    public static final p hmacSha512(v0 v0Var, ByteString byteString) {
        return Companion.hmacSha512(v0Var, byteString);
    }

    public static final p md5(v0 v0Var) {
        return Companion.md5(v0Var);
    }

    public static final p sha1(v0 v0Var) {
        return Companion.sha1(v0Var);
    }

    public static final p sha256(v0 v0Var) {
        return Companion.sha256(v0Var);
    }

    public static final p sha512(v0 v0Var) {
        return Companion.sha512(v0Var);
    }

    /* renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m1458deprecated_hash() {
        return hash();
    }

    public final ByteString hash() {
        byte[] result;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            result = messageDigest.digest();
        } else {
            Mac mac = this.mac;
            kotlin.jvm.internal.s.checkNotNull(mac);
            result = mac.doFinal();
        }
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return new ByteString(result);
    }

    @Override // okio.l, okio.v0
    public void write(c source, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        d1.checkOffsetAndCount(source.size(), 0L, j8);
        t0 t0Var = source.head;
        kotlin.jvm.internal.s.checkNotNull(t0Var);
        long j9 = 0;
        while (j9 < j8) {
            int min = (int) Math.min(j8 - j9, t0Var.limit - t0Var.pos);
            MessageDigest messageDigest = this.messageDigest;
            if (messageDigest != null) {
                messageDigest.update(t0Var.data, t0Var.pos, min);
            } else {
                Mac mac = this.mac;
                kotlin.jvm.internal.s.checkNotNull(mac);
                mac.update(t0Var.data, t0Var.pos, min);
            }
            j9 += min;
            t0Var = t0Var.next;
            kotlin.jvm.internal.s.checkNotNull(t0Var);
        }
        super.write(source, j8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(v0 sink, String algorithm) {
        this(sink, r3);
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        kotlin.jvm.internal.s.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(messageDigest, "getInstance(algorithm)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(v0 sink, Mac mac) {
        super(sink);
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        kotlin.jvm.internal.s.checkNotNullParameter(mac, "mac");
        this.mac = mac;
        this.messageDigest = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(v0 sink, ByteString key, String algorithm) {
        this(sink, r0);
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        kotlin.jvm.internal.s.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.s.checkNotNullParameter(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            y5.w wVar = y5.w.INSTANCE;
            kotlin.jvm.internal.s.checkNotNullExpressionValue(mac, "try {\n      Mac.getInsta…rgumentException(e)\n    }");
        } catch (InvalidKeyException e8) {
            throw new IllegalArgumentException(e8);
        }
    }
}
