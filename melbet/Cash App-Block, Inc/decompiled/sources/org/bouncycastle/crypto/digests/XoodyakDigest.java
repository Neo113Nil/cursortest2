package org.bouncycastle.crypto.digests;

import com.plaid.internal.EnumC0170g;
import java.io.ByteArrayOutputStream;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: classes9.dex */
public class XoodyakDigest implements Digest {
    private int Rabsorb;
    private MODE mode;
    private int phase;
    private final int f_bPrime = 48;
    private final int Rhash = 16;
    private final int PhaseDown = 1;
    private final int PhaseUp = 2;
    private final int MAXROUNDS = 12;
    private final int TAGLEN = 16;
    private final int[] RC = {88, 56, 960, EnumC0170g.SDK_ASSET_ICON_INCOME_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE, 20, 96, 44, 896, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 416, 18};
    private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private byte[] state = new byte[48];

    public enum MODE {
        ModeHash,
        ModeKeyed
    }

    public XoodyakDigest() {
        reset();
    }

    private void Up(byte[] bArr, int i, int i2, int i3) {
        if (this.mode != MODE.ModeHash) {
            byte[] bArr2 = this.state;
            bArr2[47] = (byte) (bArr2[47] ^ i3);
        }
        int littleEndianToInt = Pack.littleEndianToInt(this.state, 0);
        int littleEndianToInt2 = Pack.littleEndianToInt(this.state, 4);
        int littleEndianToInt3 = Pack.littleEndianToInt(this.state, 8);
        int i4 = 12;
        int littleEndianToInt4 = Pack.littleEndianToInt(this.state, 12);
        int littleEndianToInt5 = Pack.littleEndianToInt(this.state, 16);
        int littleEndianToInt6 = Pack.littleEndianToInt(this.state, 20);
        int littleEndianToInt7 = Pack.littleEndianToInt(this.state, 24);
        int littleEndianToInt8 = Pack.littleEndianToInt(this.state, 28);
        int littleEndianToInt9 = Pack.littleEndianToInt(this.state, 32);
        int littleEndianToInt10 = Pack.littleEndianToInt(this.state, 36);
        int littleEndianToInt11 = Pack.littleEndianToInt(this.state, 40);
        int littleEndianToInt12 = Pack.littleEndianToInt(this.state, 44);
        int i5 = 0;
        while (i5 < i4) {
            int i6 = (littleEndianToInt ^ littleEndianToInt5) ^ littleEndianToInt9;
            int i7 = i5;
            int i8 = (littleEndianToInt2 ^ littleEndianToInt6) ^ littleEndianToInt10;
            int i9 = (littleEndianToInt3 ^ littleEndianToInt7) ^ littleEndianToInt11;
            int i10 = littleEndianToInt12;
            int i11 = (littleEndianToInt4 ^ littleEndianToInt8) ^ i10;
            int i12 = littleEndianToInt11;
            int rotateLeft = Integers.rotateLeft(i11, 5) ^ Integers.rotateLeft(i11, 14);
            int rotateLeft2 = Integers.rotateLeft(i6, 5) ^ Integers.rotateLeft(i6, 14);
            int rotateLeft3 = Integers.rotateLeft(i8, 5) ^ Integers.rotateLeft(i8, 14);
            int rotateLeft4 = Integers.rotateLeft(i9, 14) ^ Integers.rotateLeft(i9, 5);
            int i13 = littleEndianToInt ^ rotateLeft;
            int i14 = littleEndianToInt5 ^ rotateLeft;
            int i15 = littleEndianToInt2 ^ rotateLeft2;
            int i16 = littleEndianToInt6 ^ rotateLeft2;
            int i17 = rotateLeft2 ^ littleEndianToInt10;
            int i18 = littleEndianToInt3 ^ rotateLeft3;
            int i19 = littleEndianToInt7 ^ rotateLeft3;
            int i20 = littleEndianToInt4 ^ rotateLeft4;
            int i21 = littleEndianToInt8 ^ rotateLeft4;
            int rotateLeft5 = Integers.rotateLeft(littleEndianToInt9 ^ rotateLeft, 11);
            int rotateLeft6 = Integers.rotateLeft(i17, 11);
            int rotateLeft7 = Integers.rotateLeft(i12 ^ rotateLeft3, 11);
            int rotateLeft8 = Integers.rotateLeft(i10 ^ rotateLeft4, 11);
            int i22 = i13 ^ this.RC[i7];
            int i23 = ((~i21) & rotateLeft5) ^ i22;
            int i24 = ((~i14) & rotateLeft6) ^ i15;
            int i25 = ((~i16) & rotateLeft7) ^ i18;
            int i26 = ((~i19) & rotateLeft8) ^ i20;
            int i27 = ((~rotateLeft5) & i22) ^ i21;
            int i28 = i14 ^ ((~rotateLeft6) & i15);
            int i29 = ((~rotateLeft7) & i18) ^ i16;
            int i30 = ((~rotateLeft8) & i20) ^ i19;
            int i31 = rotateLeft5 ^ ((~i22) & i21);
            int i32 = rotateLeft6 ^ ((~i15) & i14);
            int i33 = rotateLeft7 ^ ((~i18) & i16);
            int i34 = rotateLeft8 ^ ((~i20) & i19);
            littleEndianToInt5 = Integers.rotateLeft(i27, 1);
            littleEndianToInt6 = Integers.rotateLeft(i28, 1);
            int rotateLeft9 = Integers.rotateLeft(i29, 1);
            int rotateLeft10 = Integers.rotateLeft(i30, 1);
            int rotateLeft11 = Integers.rotateLeft(i33, 8);
            littleEndianToInt10 = Integers.rotateLeft(i34, 8);
            int rotateLeft12 = Integers.rotateLeft(i31, 8);
            int rotateLeft13 = Integers.rotateLeft(i32, 8);
            i5 = i7 + 1;
            littleEndianToInt2 = i24;
            littleEndianToInt4 = i26;
            i4 = 12;
            littleEndianToInt7 = rotateLeft9;
            littleEndianToInt12 = rotateLeft13;
            littleEndianToInt = i23;
            littleEndianToInt9 = rotateLeft11;
            littleEndianToInt3 = i25;
            littleEndianToInt8 = rotateLeft10;
            littleEndianToInt11 = rotateLeft12;
        }
        Pack.intToLittleEndian(littleEndianToInt, this.state, 0);
        Pack.intToLittleEndian(littleEndianToInt2, this.state, 4);
        Pack.intToLittleEndian(littleEndianToInt3, this.state, 8);
        Pack.intToLittleEndian(littleEndianToInt4, this.state, 12);
        Pack.intToLittleEndian(littleEndianToInt5, this.state, 16);
        Pack.intToLittleEndian(littleEndianToInt6, this.state, 20);
        Pack.intToLittleEndian(littleEndianToInt7, this.state, 24);
        Pack.intToLittleEndian(littleEndianToInt8, this.state, 28);
        Pack.intToLittleEndian(littleEndianToInt9, this.state, 32);
        Pack.intToLittleEndian(littleEndianToInt10, this.state, 36);
        Pack.intToLittleEndian(littleEndianToInt11, this.state, 40);
        Pack.intToLittleEndian(littleEndianToInt12, this.state, 44);
        this.phase = 2;
        if (bArr != null) {
            System.arraycopy(this.state, 0, bArr, i, i2);
        }
    }

    public void Down(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2;
        int i4 = 0;
        while (true) {
            bArr2 = this.state;
            if (i4 >= i2) {
                break;
            }
            bArr2[i4] = (byte) (bArr[i] ^ bArr2[i4]);
            i4++;
            i++;
        }
        bArr2[i2] = (byte) (bArr2[i2] ^ 1);
        byte b = bArr2[47];
        if (this.mode == MODE.ModeHash) {
            i3 &= 1;
        }
        bArr2[47] = (byte) (b ^ i3);
        this.phase = 1;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        if (i + 32 > bArr.length) {
            f$$ExternalSyntheticLambda0.m$3("output buffer is too short");
            return 0;
        }
        byte[] byteArray = this.buffer.toByteArray();
        int size = this.buffer.size();
        int i2 = 3;
        int i3 = 0;
        while (true) {
            if (this.phase != 2) {
                Up(null, 0, 0, 0);
            }
            int min = Math.min(size, this.Rabsorb);
            Down(byteArray, i3, min, i2);
            i3 += min;
            size -= min;
            if (size == 0) {
                Up(bArr, i, 16, 64);
                Down(null, 0, 0, 0);
                Up(bArr, i + 16, 16, 0);
                reset();
                return 32;
            }
            i2 = 0;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Xoodyak Hash";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        Arrays.fill(this.state, (byte) 0);
        this.phase = 2;
        this.mode = MODE.ModeHash;
        this.Rabsorb = 16;
        this.buffer.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        if (i + i2 <= bArr.length) {
            this.buffer.write(bArr, i, i2);
        } else {
            f$$ExternalSyntheticLambda0.m$4("input buffer too short");
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        this.buffer.write(b);
    }
}
