package net.oneformapp.encryptionlib;

import com.miteksystems.misnap.core.DateUtil;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class AES256v2Ciphertext {
    public final /* synthetic */ int $r8$classId;
    public final byte[] ciphertext;
    public final byte[] encryptionSalt;
    public byte[] hmac;
    public final byte[] hmacSalt;
    public final boolean isPasswordBased;
    public final byte[] iv;
    public final byte options;
    public final int version;

    public AES256v2Ciphertext(byte[] bArr, int i) {
        this.$r8$classId = i;
        DateUtil.notNull(bArr, "Data cannot be null.", new Object[0]);
        int i2 = 2;
        if (bArr.length < 2) {
            throw new InvalidDataException("Not enough data to read header.");
        }
        byte b = bArr[0];
        this.version = b;
        if (b != getVersionNumber()) {
            throw new InvalidDataException(String.format("Expected version %d but found %d.", Integer.valueOf(getVersionNumber()), Integer.valueOf(b)));
        }
        byte b2 = bArr[1];
        this.options = b2;
        if (b2 != 0 && b2 != 1) {
            throw new InvalidDataException("Unrecognised bit in the options byte.");
        }
        boolean z = (b2 & 1) == 1;
        this.isPasswordBased = z;
        int i3 = z ? 66 : 50;
        if (bArr.length < i3) {
            throw new InvalidDataException(String.format("Data must be a minimum length of %d bytes, but found %d bytes.", Integer.valueOf(i3), Integer.valueOf(bArr.length)));
        }
        int length = bArr.length - i3;
        if (z) {
            byte[] bArr2 = new byte[8];
            this.encryptionSalt = bArr2;
            System.arraycopy(bArr, 2, bArr2, 0, 8);
            byte[] bArr3 = new byte[8];
            this.hmacSalt = bArr3;
            System.arraycopy(bArr, 10, bArr3, 0, 8);
            i2 = 18;
        } else {
            this.encryptionSalt = null;
            this.hmacSalt = null;
        }
        byte[] bArr4 = new byte[16];
        this.iv = bArr4;
        System.arraycopy(bArr, i2, bArr4, 0, 16);
        int i4 = i2 + 16;
        byte[] bArr5 = new byte[length];
        this.ciphertext = bArr5;
        System.arraycopy(bArr, i4, bArr5, 0, length);
        byte[] bArr6 = new byte[32];
        this.hmac = bArr6;
        System.arraycopy(bArr, i4 + length, bArr6, 0, 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AES256v2Ciphertext aES256v2Ciphertext = (AES256v2Ciphertext) obj;
        return Arrays.equals(this.ciphertext, aES256v2Ciphertext.ciphertext) && Arrays.equals(this.encryptionSalt, aES256v2Ciphertext.encryptionSalt) && Arrays.equals(this.hmac, aES256v2Ciphertext.hmac) && Arrays.equals(this.hmacSalt, aES256v2Ciphertext.hmacSalt) && this.isPasswordBased == aES256v2Ciphertext.isPasswordBased && Arrays.equals(this.iv, aES256v2Ciphertext.iv) && this.options == aES256v2Ciphertext.options && this.version == aES256v2Ciphertext.version;
    }

    public final byte[] getRawData() {
        int length;
        int length2;
        byte[] bArr = {(byte) getVersionNumber(), 0};
        boolean z = this.isPasswordBased;
        if (z) {
            bArr[1] = 1;
        }
        byte[] bArr2 = this.hmacSalt;
        byte[] bArr3 = this.ciphertext;
        byte[] bArr4 = this.encryptionSalt;
        byte[] bArr5 = this.iv;
        if (z) {
            length = bArr4.length + 2 + bArr2.length + bArr5.length + bArr3.length;
            length2 = this.hmac.length;
        } else {
            length = bArr5.length + 2 + bArr3.length;
            length2 = this.hmac.length;
        }
        byte[] bArr6 = new byte[length + length2];
        System.arraycopy(bArr, 0, bArr6, 0, 2);
        if (!z) {
            System.arraycopy(bArr5, 0, bArr6, 2, bArr5.length);
            System.arraycopy(bArr3, 0, bArr6, bArr5.length + 2, bArr3.length);
            byte[] bArr7 = this.hmac;
            System.arraycopy(bArr7, 0, bArr6, bArr5.length + 2 + bArr3.length, bArr7.length);
            return bArr6;
        }
        System.arraycopy(bArr4, 0, bArr6, 2, bArr4.length);
        System.arraycopy(bArr2, 0, bArr6, bArr4.length + 2, bArr2.length);
        System.arraycopy(bArr5, 0, bArr6, bArr4.length + 2 + bArr2.length, bArr5.length);
        System.arraycopy(bArr3, 0, bArr6, bArr4.length + 2 + bArr2.length + bArr5.length, bArr3.length);
        byte[] bArr8 = this.hmac;
        System.arraycopy(bArr8, 0, bArr6, bArr4.length + 2 + bArr2.length + bArr5.length + bArr3.length, bArr8.length);
        return bArr6;
    }

    public final int getVersionNumber() {
        switch (this.$r8$classId) {
            case 0:
                return 2;
            default:
                return 3;
        }
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.iv) + ((((Arrays.hashCode(this.hmacSalt) + ((Arrays.hashCode(this.hmac) + ((Arrays.hashCode(this.encryptionSalt) + ((Arrays.hashCode(this.ciphertext) + 31) * 31)) * 31)) * 31)) * 31) + (this.isPasswordBased ? 1231 : 1237)) * 31)) * 31) + this.options) * 31) + this.version;
    }

    public AES256v2Ciphertext(byte[] bArr, byte[] bArr2) {
        this.$r8$classId = 1;
        if (bArr.length == 16) {
            this.version = 3;
            this.options = (byte) 0;
            this.iv = bArr;
            this.ciphertext = bArr2;
            this.encryptionSalt = null;
            this.hmacSalt = null;
            this.isPasswordBased = false;
            this.hmac = new byte[32];
            return;
        }
        JWK$$ExternalSyntheticBUOutline0.m("Invalid %s length. Expected %d bytes but found %d.", new Object[]{"IV", 16, Integer.valueOf(bArr.length)});
        throw null;
    }
}
