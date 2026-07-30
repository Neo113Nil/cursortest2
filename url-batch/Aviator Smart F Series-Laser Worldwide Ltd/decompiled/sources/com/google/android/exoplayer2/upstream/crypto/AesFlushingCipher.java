package com.google.android.exoplayer2.upstream.crypto;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@Deprecated
/* loaded from: classes3.dex */
public final class AesFlushingCipher {
    private final int blockSize;
    private final Cipher cipher;
    private final byte[] flushedBlock;
    private int pendingXorBytes;
    private final byte[] zerosBlock;

    public AesFlushingCipher(int i8, byte[] bArr, @Nullable String str, long j8) {
        this(i8, bArr, getFNV64Hash(str), j8);
    }

    private static long getFNV64Hash(@Nullable String str) {
        long j8 = 0;
        if (str == null) {
            return 0L;
        }
        for (int i8 = 0; i8 < str.length(); i8++) {
            long charAt = j8 ^ str.charAt(i8);
            j8 = charAt + (charAt << 1) + (charAt << 4) + (charAt << 5) + (charAt << 7) + (charAt << 8) + (charAt << 40);
        }
        return j8;
    }

    private byte[] getInitializationVector(long j8, long j9) {
        return ByteBuffer.allocate(16).putLong(j8).putLong(j9).array();
    }

    private int nonFlushingUpdate(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        try {
            return this.cipher.update(bArr, i8, i9, bArr2, i10);
        } catch (ShortBufferException e8) {
            throw new RuntimeException(e8);
        }
    }

    public void update(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        int i11 = i8;
        do {
            int i12 = this.pendingXorBytes;
            if (i12 <= 0) {
                int nonFlushingUpdate = nonFlushingUpdate(bArr, i11, i9, bArr2, i10);
                if (i9 == nonFlushingUpdate) {
                    return;
                }
                int i13 = i9 - nonFlushingUpdate;
                int i14 = 0;
                Assertions.checkState(i13 < this.blockSize);
                int i15 = i10 + nonFlushingUpdate;
                int i16 = this.blockSize - i13;
                this.pendingXorBytes = i16;
                Assertions.checkState(nonFlushingUpdate(this.zerosBlock, 0, i16, this.flushedBlock, 0) == this.blockSize);
                while (i14 < i13) {
                    bArr2[i15] = this.flushedBlock[i14];
                    i14++;
                    i15++;
                }
                return;
            }
            bArr2[i10] = (byte) (bArr[i11] ^ this.flushedBlock[this.blockSize - i12]);
            i10++;
            i11++;
            this.pendingXorBytes = i12 - 1;
            i9--;
        } while (i9 != 0);
    }

    public void updateInPlace(byte[] bArr, int i8, int i9) {
        update(bArr, i8, i9, bArr, i8);
    }

    public AesFlushingCipher(int i8, byte[] bArr, long j8, long j9) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.cipher = cipher;
            int blockSize = cipher.getBlockSize();
            this.blockSize = blockSize;
            this.zerosBlock = new byte[blockSize];
            this.flushedBlock = new byte[blockSize];
            int i9 = (int) (j9 % blockSize);
            cipher.init(i8, new SecretKeySpec(bArr, Util.splitAtFirst(cipher.getAlgorithm(), "/")[0]), new IvParameterSpec(getInitializationVector(j8, j9 / blockSize)));
            if (i9 != 0) {
                updateInPlace(new byte[i9], 0, i9);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e8) {
            throw new RuntimeException(e8);
        }
    }
}
