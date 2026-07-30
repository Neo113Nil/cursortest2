package okio;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes5.dex */
public final class q extends m {
    public static final a Companion = new a(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final q hmacSha1(x0 source, ByteString key) {
            kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.s.checkNotNullParameter(key, "key");
            return new q(source, key, "HmacSHA1");
        }

        public final q hmacSha256(x0 source, ByteString key) {
            kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.s.checkNotNullParameter(key, "key");
            return new q(source, key, "HmacSHA256");
        }

        public final q hmacSha512(x0 source, ByteString key) {
            kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.s.checkNotNullParameter(key, "key");
            return new q(source, key, "HmacSHA512");
        }

        public final q md5(x0 source) {
            kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
            return new q(source, "MD5");
        }

        public final q sha1(x0 source) {
            kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
            return new q(source, "SHA-1");
        }

        public final q sha256(x0 source) {
            kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
            return new q(source, org.bouncycastle.pqc.crypto.xmss.o.SHA_256);
        }

        public final q sha512(x0 source) {
            kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
            return new q(source, org.bouncycastle.pqc.crypto.xmss.o.SHA_512);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x0 source, MessageDigest digest) {
        super(source);
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.s.checkNotNullParameter(digest, "digest");
        this.messageDigest = digest;
        this.mac = null;
    }

    public static final q hmacSha1(x0 x0Var, ByteString byteString) {
        return Companion.hmacSha1(x0Var, byteString);
    }

    public static final q hmacSha256(x0 x0Var, ByteString byteString) {
        return Companion.hmacSha256(x0Var, byteString);
    }

    public static final q hmacSha512(x0 x0Var, ByteString byteString) {
        return Companion.hmacSha512(x0Var, byteString);
    }

    public static final q md5(x0 x0Var) {
        return Companion.md5(x0Var);
    }

    public static final q sha1(x0 x0Var) {
        return Companion.sha1(x0Var);
    }

    public static final q sha256(x0 x0Var) {
        return Companion.sha256(x0Var);
    }

    public static final q sha512(x0 x0Var) {
        return Companion.sha512(x0Var);
    }

    /* renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m1459deprecated_hash() {
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

    @Override // okio.m, okio.x0
    public long read(c sink, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        long read = super.read(sink, j8);
        if (read != -1) {
            long size = sink.size() - read;
            long size2 = sink.size();
            t0 t0Var = sink.head;
            kotlin.jvm.internal.s.checkNotNull(t0Var);
            while (size2 > size) {
                t0Var = t0Var.prev;
                kotlin.jvm.internal.s.checkNotNull(t0Var);
                size2 -= t0Var.limit - t0Var.pos;
            }
            while (size2 < sink.size()) {
                int i8 = (int) ((t0Var.pos + size) - size2);
                MessageDigest messageDigest = this.messageDigest;
                if (messageDigest != null) {
                    messageDigest.update(t0Var.data, i8, t0Var.limit - i8);
                } else {
                    Mac mac = this.mac;
                    kotlin.jvm.internal.s.checkNotNull(mac);
                    mac.update(t0Var.data, i8, t0Var.limit - i8);
                }
                size2 += t0Var.limit - t0Var.pos;
                t0Var = t0Var.next;
                kotlin.jvm.internal.s.checkNotNull(t0Var);
                size = size2;
            }
        }
        return read;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(x0 source, String algorithm) {
        this(source, r3);
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.s.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(messageDigest, "getInstance(algorithm)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x0 source, Mac mac) {
        super(source);
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.s.checkNotNullParameter(mac, "mac");
        this.mac = mac;
        this.messageDigest = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(x0 source, ByteString key, String algorithm) {
        this(source, r0);
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
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
