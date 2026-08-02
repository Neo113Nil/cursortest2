package sqip.internal;

import kotlin.Metadata;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lsqip/internal/LongCodec;", "", "()V", "ENCODED_LENGTH", "", "MASK_5BITS", "NIBBLE_SIZE", "base32Alphabet", "", "charToNibbleMap", "", "nibbleToCharMap", "decodeToLong", "", "encoded", "", "encodeToString", "value", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LongCodec {
    private static final int ENCODED_LENGTH = 13;
    public static final LongCodec INSTANCE = new LongCodec();
    private static final int MASK_5BITS = 31;
    private static final int NIBBLE_SIZE = 5;
    private static final char[] base32Alphabet;
    private static final byte[] charToNibbleMap;
    private static final char[] nibbleToCharMap;

    static {
        char[] cArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'M', 'N', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k'};
        base32Alphabet = cArr;
        nibbleToCharMap = new char[32];
        charToNibbleMap = new byte[128];
        int i = 0;
        int i2 = 0;
        while (i < 32) {
            char c = cArr[i];
            nibbleToCharMap[i2] = c;
            charToNibbleMap[c] = (byte) i2;
            i++;
            i2++;
        }
    }

    private LongCodec() {
    }

    public final long decodeToLong(String encoded) {
        encoded.getClass();
        long j = 0;
        int i = 0;
        int i2 = 59;
        while (i < 13) {
            j |= i2 >= 0 ? charToNibbleMap[encoded.charAt(i)] << i2 : charToNibbleMap[encoded.charAt(i)] >> (-i2);
            i++;
            i2 -= 5;
        }
        return j;
    }

    public final String encodeToString(long value) {
        char[] cArr = new char[13];
        int i = 0;
        int i2 = 59;
        while (i < 13) {
            if (i2 >= 0) {
                cArr[i] = nibbleToCharMap[((int) (value >> i2)) & 31];
            } else {
                cArr[i] = nibbleToCharMap[((int) (value << (-i2))) & 31];
            }
            i++;
            i2 -= 5;
        }
        return new String(cArr);
    }
}
