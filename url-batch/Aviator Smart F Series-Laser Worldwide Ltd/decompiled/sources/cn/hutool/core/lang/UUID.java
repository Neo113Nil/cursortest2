package cn.hutool.core.lang;

import com.google.common.primitives.UnsignedBytes;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public class UUID implements Serializable, Comparable<UUID> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long serialVersionUID = -1185015143654744140L;
    private final long leastSigBits;
    private final long mostSigBits;

    private static class a {
        static final SecureRandom NUMBER_GENERATOR = cn.hutool.core.util.i0.getSecureRandom();

        private a() {
        }
    }

    private UUID(byte[] bArr) {
        long j8 = 0;
        long j9 = 0;
        for (int i8 = 0; i8 < 8; i8++) {
            j9 = (j9 << 8) | (bArr[i8] & 255);
        }
        for (int i9 = 8; i9 < 16; i9++) {
            j8 = (j8 << 8) | (bArr[i9] & 255);
        }
        this.mostSigBits = j9;
        this.leastSigBits = j8;
    }

    private void checkTimeBase() {
        if (version() != 1) {
            throw new UnsupportedOperationException("Not a time-based UUID");
        }
    }

    private static String digits(long j8, int i8) {
        long j9 = 1 << (i8 * 4);
        return Long.toHexString((j8 & (j9 - 1)) | j9).substring(1);
    }

    public static UUID fastUUID() {
        return randomUUID(false);
    }

    public static UUID fromString(String str) {
        String[] split = str.split("-");
        if (split.length != 5) {
            throw new IllegalArgumentException("Invalid UUID string: " + str);
        }
        for (int i8 = 0; i8 < 5; i8++) {
            split[i8] = "0x" + split[i8];
        }
        return new UUID((((Long.decode(split[0]).longValue() << 16) | Long.decode(split[1]).longValue()) << 16) | Long.decode(split[2]).longValue(), (Long.decode(split[3]).longValue() << 48) | Long.decode(split[4]).longValue());
    }

    public static UUID nameUUIDFromBytes(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            byte b8 = (byte) (digest[6] & 15);
            digest[6] = b8;
            digest[6] = (byte) (b8 | 48);
            byte b9 = (byte) (digest[8] & 63);
            digest[8] = b9;
            digest[8] = (byte) (b9 | UnsignedBytes.MAX_POWER_OF_TWO);
            return new UUID(digest);
        } catch (NoSuchAlgorithmException unused) {
            throw new InternalError("MD5 not supported");
        }
    }

    public static UUID randomUUID() {
        return randomUUID(true);
    }

    public int clockSequence() {
        checkTimeBase();
        return (int) ((this.leastSigBits & 4611404543450677248L) >>> 48);
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != UUID.class) {
            return false;
        }
        UUID uuid = (UUID) obj;
        return this.mostSigBits == uuid.mostSigBits && this.leastSigBits == uuid.leastSigBits;
    }

    public long getLeastSignificantBits() {
        return this.leastSigBits;
    }

    public long getMostSignificantBits() {
        return this.mostSigBits;
    }

    public int hashCode() {
        long j8 = this.mostSigBits ^ this.leastSigBits;
        return ((int) (j8 >> 32)) ^ ((int) j8);
    }

    public long node() {
        checkTimeBase();
        return this.leastSigBits & 281474976710655L;
    }

    public long timestamp() {
        checkTimeBase();
        long j8 = this.mostSigBits;
        return (j8 >>> 32) | ((4095 & j8) << 48) | (((j8 >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32);
    }

    public String toString() {
        return toString(false);
    }

    public int variant() {
        long j8 = this.leastSigBits;
        return (int) ((j8 >> 63) & (j8 >>> ((int) (64 - (j8 >>> 62)))));
    }

    public int version() {
        return (int) ((this.mostSigBits >> 12) & 15);
    }

    public static UUID randomUUID(boolean z7) {
        byte[] bArr = new byte[16];
        (z7 ? a.NUMBER_GENERATOR : cn.hutool.core.util.i0.getRandom()).nextBytes(bArr);
        byte b8 = (byte) (bArr[6] & 15);
        bArr[6] = b8;
        bArr[6] = (byte) (b8 | 64);
        byte b9 = (byte) (bArr[8] & 63);
        bArr[8] = b9;
        bArr[8] = (byte) (b9 | UnsignedBytes.MAX_POWER_OF_TWO);
        return new UUID(bArr);
    }

    @Override // java.lang.Comparable
    public int compareTo(UUID uuid) {
        int compare = Long.compare(this.mostSigBits, uuid.mostSigBits);
        return compare == 0 ? Long.compare(this.leastSigBits, uuid.leastSigBits) : compare;
    }

    public String toString(boolean z7) {
        StringBuilder builder = cn.hutool.core.util.c1.builder(z7 ? 32 : 36);
        builder.append(digits(this.mostSigBits >> 32, 8));
        if (!z7) {
            builder.append('-');
        }
        builder.append(digits(this.mostSigBits >> 16, 4));
        if (!z7) {
            builder.append('-');
        }
        builder.append(digits(this.mostSigBits, 4));
        if (!z7) {
            builder.append('-');
        }
        builder.append(digits(this.leastSigBits >> 48, 4));
        if (!z7) {
            builder.append('-');
        }
        builder.append(digits(this.leastSigBits, 12));
        return builder.toString();
    }

    public UUID(long j8, long j9) {
        this.mostSigBits = j8;
        this.leastSigBits = j9;
    }
}
