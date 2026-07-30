package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import javax.annotation.CheckForNull;

@Immutable
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class SipHashFunction extends AbstractHashFunction implements Serializable {
    static final HashFunction SIP_HASH_24 = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* renamed from: c, reason: collision with root package name */
    private final int f15020c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15021d;

    /* renamed from: k0, reason: collision with root package name */
    private final long f15022k0;

    /* renamed from: k1, reason: collision with root package name */
    private final long f15023k1;

    private static final class SipHasher extends AbstractStreamingHasher {
        private static final int CHUNK_SIZE = 8;

        /* renamed from: b, reason: collision with root package name */
        private long f15024b;

        /* renamed from: c, reason: collision with root package name */
        private final int f15025c;

        /* renamed from: d, reason: collision with root package name */
        private final int f15026d;
        private long finalM;

        /* renamed from: v0, reason: collision with root package name */
        private long f15027v0;

        /* renamed from: v1, reason: collision with root package name */
        private long f15028v1;

        /* renamed from: v2, reason: collision with root package name */
        private long f15029v2;

        /* renamed from: v3, reason: collision with root package name */
        private long f15030v3;

        SipHasher(int i8, int i9, long j8, long j9) {
            super(8);
            this.f15024b = 0L;
            this.finalM = 0L;
            this.f15025c = i8;
            this.f15026d = i9;
            this.f15027v0 = 8317987319222330741L ^ j8;
            this.f15028v1 = 7237128888997146477L ^ j9;
            this.f15029v2 = 7816392313619706465L ^ j8;
            this.f15030v3 = 8387220255154660723L ^ j9;
        }

        private void processM(long j8) {
            this.f15030v3 ^= j8;
            sipRound(this.f15025c);
            this.f15027v0 = j8 ^ this.f15027v0;
        }

        private void sipRound(int i8) {
            for (int i9 = 0; i9 < i8; i9++) {
                long j8 = this.f15027v0;
                long j9 = this.f15028v1;
                this.f15027v0 = j8 + j9;
                this.f15029v2 += this.f15030v3;
                this.f15028v1 = Long.rotateLeft(j9, 13);
                long rotateLeft = Long.rotateLeft(this.f15030v3, 16);
                long j10 = this.f15028v1;
                long j11 = this.f15027v0;
                this.f15028v1 = j10 ^ j11;
                this.f15030v3 = rotateLeft ^ this.f15029v2;
                long rotateLeft2 = Long.rotateLeft(j11, 32);
                long j12 = this.f15029v2;
                long j13 = this.f15028v1;
                this.f15029v2 = j12 + j13;
                this.f15027v0 = rotateLeft2 + this.f15030v3;
                this.f15028v1 = Long.rotateLeft(j13, 17);
                long rotateLeft3 = Long.rotateLeft(this.f15030v3, 21);
                long j14 = this.f15028v1;
                long j15 = this.f15029v2;
                this.f15028v1 = j14 ^ j15;
                this.f15030v3 = rotateLeft3 ^ this.f15027v0;
                this.f15029v2 = Long.rotateLeft(j15, 32);
            }
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected HashCode makeHash() {
            long j8 = this.finalM ^ (this.f15024b << 56);
            this.finalM = j8;
            processM(j8);
            this.f15029v2 ^= 255;
            sipRound(this.f15026d);
            return HashCode.fromLong(((this.f15027v0 ^ this.f15028v1) ^ this.f15029v2) ^ this.f15030v3);
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void process(ByteBuffer byteBuffer) {
            this.f15024b += 8;
            processM(byteBuffer.getLong());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void processRemaining(ByteBuffer byteBuffer) {
            this.f15024b += byteBuffer.remaining();
            int i8 = 0;
            while (byteBuffer.hasRemaining()) {
                this.finalM ^= (byteBuffer.get() & 255) << i8;
                i8 += 8;
            }
        }
    }

    SipHashFunction(int i8, int i9, long j8, long j9) {
        Preconditions.checkArgument(i8 > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", i8);
        Preconditions.checkArgument(i9 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i9);
        this.f15020c = i8;
        this.f15021d = i9;
        this.f15022k0 = j8;
        this.f15023k1 = j9;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof SipHashFunction)) {
            return false;
        }
        SipHashFunction sipHashFunction = (SipHashFunction) obj;
        return this.f15020c == sipHashFunction.f15020c && this.f15021d == sipHashFunction.f15021d && this.f15022k0 == sipHashFunction.f15022k0 && this.f15023k1 == sipHashFunction.f15023k1;
    }

    public int hashCode() {
        return (int) ((((SipHashFunction.class.hashCode() ^ this.f15020c) ^ this.f15021d) ^ this.f15022k0) ^ this.f15023k1);
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new SipHasher(this.f15020c, this.f15021d, this.f15022k0, this.f15023k1);
    }

    public String toString() {
        int i8 = this.f15020c;
        int i9 = this.f15021d;
        long j8 = this.f15022k0;
        long j9 = this.f15023k1;
        StringBuilder sb = new StringBuilder(81);
        sb.append("Hashing.sipHash");
        sb.append(i8);
        sb.append(i9);
        sb.append("(");
        sb.append(j8);
        sb.append(", ");
        sb.append(j9);
        sb.append(")");
        return sb.toString();
    }
}
