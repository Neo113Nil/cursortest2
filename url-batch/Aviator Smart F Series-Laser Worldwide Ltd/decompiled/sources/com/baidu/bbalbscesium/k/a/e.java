package com.baidu.bbalbscesium.k.a;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: k, reason: collision with root package name */
    private static final int f4091k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static final int f4092l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final int f4093m = 2;

    /* renamed from: n, reason: collision with root package name */
    private static final int f4094n = 3;

    /* renamed from: o, reason: collision with root package name */
    private static final int f4095o = 4;

    /* renamed from: p, reason: collision with root package name */
    private static final int f4096p = 5;

    /* renamed from: q, reason: collision with root package name */
    private static final int f4097q = 6;

    /* renamed from: a, reason: collision with root package name */
    private byte[] f4098a;

    /* renamed from: b, reason: collision with root package name */
    private int f4099b;

    /* renamed from: c, reason: collision with root package name */
    private int f4100c;

    /* renamed from: f, reason: collision with root package name */
    private int f4103f;

    /* renamed from: g, reason: collision with root package name */
    private i f4104g;

    /* renamed from: h, reason: collision with root package name */
    private f f4105h;

    /* renamed from: d, reason: collision with root package name */
    private int f4101d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f4102e = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f4106i = 1;

    /* renamed from: j, reason: collision with root package name */
    private boolean f4107j = false;

    public e(b bVar, int i8) {
        this.f4098a = null;
        this.f4104g = null;
        this.f4105h = null;
        this.f4099b = i8;
        this.f4100c = i8;
        this.f4103f = i8;
        this.f4098a = new byte[i8 * 2];
        this.f4105h = new d(bVar);
        this.f4104g = new h(this.f4099b);
    }

    int a(int i8) {
        int i9 = this.f4101d + i8;
        i iVar = this.f4104g;
        if (iVar == null || this.f4107j) {
            return i9;
        }
        int i10 = this.f4100c;
        int i11 = this.f4099b;
        if (i10 == i11) {
            return i9 + iVar.a(i9);
        }
        int i12 = this.f4103f;
        return i9 < i12 ? i12 : (i9 + i11) - ((i9 - i12) % i11);
    }

    int b(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        int i11;
        int i12;
        int i13;
        int i14 = i8;
        int i15 = this.f4101d;
        int i16 = (i15 + i9) - this.f4102e;
        if (this.f4104g != null && this.f4107j) {
            i16 -= this.f4099b;
        }
        int i17 = i16 > 0 ? i16 - (i16 % this.f4100c) : 0;
        if (bArr2 == null || bArr2.length - i10 < i17) {
            throw new ShortBufferException("Output buffer must be (at least) " + i17 + " bytes long");
        }
        if (i17 != 0) {
            byte[] bArr3 = new byte[i17];
            int i18 = i17 - i15;
            if (i18 < 0) {
                i12 = i17;
                i13 = 0;
            } else {
                i12 = i15;
                i13 = i18;
            }
            if (i15 != 0) {
                System.arraycopy(this.f4098a, 0, bArr3, 0, i12);
            }
            if (i13 > 0) {
                System.arraycopy(bArr, i8, bArr3, i12, i13);
            }
            if (this.f4107j) {
                this.f4105h.a(bArr3, 0, i17, bArr2, i10);
            } else {
                this.f4105h.c(bArr3, 0, i17, bArr2, i10);
            }
            int i19 = this.f4100c;
            int i20 = this.f4099b;
            if (i19 != i20) {
                int i21 = this.f4103f;
                if (i17 < i21) {
                    this.f4103f = i21 - i17;
                } else {
                    this.f4103f = i20 - ((i17 - i21) % i20);
                }
            }
            i11 = i9 - i13;
            i14 += i13;
            int i22 = this.f4101d - i12;
            this.f4101d = i22;
            if (i22 > 0) {
                byte[] bArr4 = this.f4098a;
                System.arraycopy(bArr4, i12, bArr4, 0, i22);
            }
        } else {
            i11 = i9;
        }
        if (i11 > 0) {
            System.arraycopy(bArr, i14, this.f4098a, this.f4101d, i11);
        }
        this.f4101d += i11;
        return i17;
    }

    int a(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        int a8;
        byte[] bArr3;
        int i11;
        i iVar;
        int a9;
        int i12 = this.f4101d + i9;
        int i13 = this.f4100c;
        int i14 = this.f4099b;
        if (i13 != i14) {
            int i15 = this.f4103f;
            a8 = i12 < i15 ? i15 - i12 : i14 - ((i12 - i15) % i14);
        } else {
            i iVar2 = this.f4104g;
            a8 = iVar2 != null ? iVar2.a(i12) : 0;
        }
        if (a8 > 0 && a8 != this.f4099b && this.f4104g != null && this.f4107j) {
            throw new IllegalBlockSizeException("Input length must be multiple of " + this.f4099b + " when decrypting with padded cipher");
        }
        boolean z7 = this.f4107j;
        int i16 = (z7 || this.f4104g == null) ? i12 : i12 + a8;
        if (bArr2 == null) {
            throw new ShortBufferException("Output buffer is null");
        }
        int length = bArr2.length - i10;
        if (((!z7 || this.f4104g == null) && length < i16) || (z7 && length < i16 - this.f4099b)) {
            throw new ShortBufferException("Output buffer too short: " + length + " bytes given, " + i16 + " bytes needed");
        }
        int i17 = this.f4101d;
        if (i17 == 0 && (z7 || this.f4104g == null)) {
            bArr3 = bArr;
            i11 = i8;
        } else {
            byte[] bArr4 = new byte[i16];
            if (i17 != 0) {
                System.arraycopy(this.f4098a, 0, bArr4, 0, i17);
            }
            if (i9 != 0) {
                System.arraycopy(bArr, i8, bArr4, this.f4101d, i9);
            }
            if (!this.f4107j && (iVar = this.f4104g) != null) {
                iVar.a(bArr4, i12, a8);
            }
            bArr3 = bArr4;
            i11 = 0;
        }
        if (this.f4107j) {
            if (length < i16) {
                this.f4105h.d();
            }
            byte[] bArr5 = new byte[i12];
            a9 = a(bArr3, i11, bArr5, 0, i12);
            i iVar3 = this.f4104g;
            if (iVar3 != null && (a9 = iVar3.b(bArr5, 0, a9)) < 0) {
                throw new BadPaddingException("Given final block not properly padded");
            }
            if (bArr2.length - i10 < a9) {
                this.f4105h.c();
                throw new ShortBufferException("Output buffer too short: " + (bArr2.length - i10) + " bytes given, " + a9 + " bytes needed");
            }
            for (int i18 = 0; i18 < a9; i18++) {
                bArr2[i10 + i18] = bArr5[i18];
            }
        } else {
            a9 = a(bArr3, i11, bArr2, i10, i16);
        }
        this.f4101d = 0;
        this.f4103f = this.f4099b;
        if (this.f4106i != 0) {
            this.f4105h.b();
        }
        return a9;
    }

    byte[] b(Key key) {
        try {
            byte[] encoded = key.getEncoded();
            if (encoded == null || encoded.length == 0) {
                throw new InvalidKeyException("Cannot get an encoding of the key to be wrapped");
            }
            return a(encoded, 0, encoded.length);
        } catch (BadPaddingException unused) {
            return null;
        }
    }

    private int a(byte[] bArr, int i8, byte[] bArr2, int i9, int i10) {
        if (bArr == null || i10 == 0) {
            return 0;
        }
        int i11 = this.f4106i;
        if (i11 == 2 || i11 == 3 || i10 % this.f4100c == 0 || i11 == 6) {
            if (this.f4107j) {
                this.f4105h.b(bArr, i8, i10, bArr2, i9);
            } else {
                this.f4105h.d(bArr, i8, i10, bArr2, i9);
            }
            return i10;
        }
        if (this.f4104g != null) {
            throw new IllegalBlockSizeException("Input length (with padding) not multiple of " + this.f4100c + " bytes");
        }
        throw new IllegalBlockSizeException("Input length not multiple of " + this.f4100c + " bytes");
    }

    public byte[] b(byte[] bArr, int i8, int i9) {
        try {
            int a8 = a(i9);
            byte[] bArr2 = new byte[a8];
            int b8 = b(bArr, i8, i9, bArr2, 0);
            if (b8 == a8) {
                return bArr2;
            }
            byte[] bArr3 = new byte[b8];
            try {
                System.arraycopy(bArr2, 0, bArr3, 0, b8);
            } catch (ShortBufferException unused) {
            }
            return bArr3;
        } catch (ShortBufferException unused2) {
            return null;
        }
    }

    Key a(byte[] bArr, String str) {
        try {
            return new SecretKeySpec(a(bArr, 0, bArr.length), str);
        } catch (BadPaddingException unused) {
            throw new InvalidKeyException("The wrapped key is not padded correctly");
        } catch (IllegalBlockSizeException unused2) {
            throw new InvalidKeyException("The wrapped key does not have the correct length");
        }
    }

    public void a(int i8, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        byte[] iv;
        this.f4107j = i8 == 2 || i8 == 4;
        byte[] a8 = a(key);
        if (algorithmParameterSpec == null) {
            iv = null;
        } else if (algorithmParameterSpec instanceof IvParameterSpec) {
            iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            if (iv == null || iv.length != this.f4099b) {
                throw new InvalidAlgorithmParameterException("Wrong IV length: must be " + this.f4099b + " bytes long");
            }
        } else {
            if (!(algorithmParameterSpec instanceof RC2ParameterSpec)) {
                throw new InvalidAlgorithmParameterException("Wrong parameter type: IV expected");
            }
            iv = ((RC2ParameterSpec) algorithmParameterSpec).getIV();
            if (iv != null && iv.length != this.f4099b) {
                throw new InvalidAlgorithmParameterException("Wrong IV length: must be " + this.f4099b + " bytes long");
            }
        }
        a(i8, a8, iv, secureRandom);
    }

    public void a(int i8, byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        boolean z7 = i8 == 2 || i8 == 4;
        this.f4107j = z7;
        if (this.f4106i == 0) {
            if (bArr2 != null) {
                throw new InvalidAlgorithmParameterException("ECB mode cannot use IV");
            }
        } else if (bArr2 == null) {
            if (z7) {
                throw new InvalidAlgorithmParameterException("Parameters missing");
            }
            if (secureRandom == null) {
                secureRandom = c.f4086b;
            }
            bArr2 = new byte[this.f4099b];
            secureRandom.nextBytes(bArr2);
        }
        this.f4101d = 0;
        this.f4103f = this.f4099b;
        this.f4105h.a(this.f4107j, "", bArr, bArr2);
    }

    void a(String str) {
        if (str == null) {
            throw new NoSuchAlgorithmException("null mode");
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        b a8 = this.f4105h.a();
        if (upperCase.equals("CBC")) {
            this.f4106i = 1;
            this.f4105h = new d(a8);
        } else {
            throw new NoSuchAlgorithmException("Cipher mode: " + str + " not found");
        }
    }

    static byte[] a(Key key) {
        if (key == null) {
            throw new InvalidKeyException("No key given");
        }
        if (!"RAW".equalsIgnoreCase(key.getFormat())) {
            throw new InvalidKeyException("Wrong format: RAW bytes needed");
        }
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            return encoded;
        }
        throw new InvalidKeyException("RAW key bytes missing");
    }

    public byte[] a(byte[] bArr, int i8, int i9) {
        try {
            int a8 = a(i9);
            byte[] bArr2 = new byte[a8];
            int a9 = a(bArr, i8, i9, bArr2, 0);
            if (a9 >= a8) {
                return bArr2;
            }
            byte[] bArr3 = new byte[a9];
            if (a9 != 0) {
                try {
                    System.arraycopy(bArr2, 0, bArr3, 0, a9);
                } catch (ShortBufferException unused) {
                }
            }
            return bArr3;
        } catch (ShortBufferException unused2) {
            return null;
        }
    }
}
