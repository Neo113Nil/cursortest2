package com.baidu.bbalbscesium.k.d;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.util.Locale;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f4130j = new byte[0];

    /* renamed from: k, reason: collision with root package name */
    private static final int f4131k = 1;

    /* renamed from: l, reason: collision with root package name */
    private static final int f4132l = 2;

    /* renamed from: m, reason: collision with root package name */
    private static final int f4133m = 3;

    /* renamed from: n, reason: collision with root package name */
    private static final int f4134n = 4;

    /* renamed from: o, reason: collision with root package name */
    private static final String f4135o = "NoPadding";

    /* renamed from: p, reason: collision with root package name */
    public static final String f4136p = "PKCS1Padding";

    /* renamed from: q, reason: collision with root package name */
    private static final String f4137q = "OAEP";

    /* renamed from: a, reason: collision with root package name */
    private int f4138a;

    /* renamed from: c, reason: collision with root package name */
    private f f4140c;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f4142e;

    /* renamed from: f, reason: collision with root package name */
    private int f4143f;

    /* renamed from: g, reason: collision with root package name */
    private int f4144g;

    /* renamed from: h, reason: collision with root package name */
    private d f4145h;

    /* renamed from: d, reason: collision with root package name */
    private OAEPParameterSpec f4141d = null;

    /* renamed from: i, reason: collision with root package name */
    private String f4146i = "SHA-1";

    /* renamed from: b, reason: collision with root package name */
    private String f4139b = f4136p;

    public void a(int i8, d dVar, SecureRandom secureRandom) {
        try {
            a(i8, dVar, secureRandom, null);
        } catch (InvalidAlgorithmParameterException e8) {
            InvalidKeyException invalidKeyException = new InvalidKeyException("Wrong parameters");
            invalidKeyException.initCause(e8);
            throw invalidKeyException;
        }
    }

    public void b(String str) {
        String str2 = f4135o;
        if (!str.equalsIgnoreCase(f4135o)) {
            str2 = f4136p;
            if (!str.equalsIgnoreCase(f4136p)) {
                String lowerCase = str.toLowerCase(Locale.ENGLISH);
                if (lowerCase.equals("oaeppadding")) {
                    this.f4139b = f4137q;
                    return;
                }
                if (!lowerCase.startsWith("oaepwith") || !lowerCase.endsWith("andmgf1padding")) {
                    throw new NoSuchPaddingException("Padding " + str + " not supported");
                }
                this.f4139b = f4137q;
                this.f4146i = str.substring(8, str.length() - 14);
                throw new NoSuchPaddingException("MessageDigest not available for " + str);
            }
        }
        this.f4139b = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(int i8, d dVar, SecureRandom secureRandom, AlgorithmParameterSpec algorithmParameterSpec) {
        boolean z7;
        OAEPParameterSpec oAEPParameterSpec;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        throw new InvalidKeyException("Unknown mode: " + i8);
                    }
                }
            }
            z7 = false;
            if (dVar instanceof d) {
                throw new InvalidKeyException("only support helios key");
            }
            this.f4138a = z7 ? 1 : 4;
            this.f4145h = dVar;
            int a8 = b.a(dVar.a());
            this.f4144g = a8;
            this.f4143f = 0;
            String str = this.f4139b;
            if (str == f4135o) {
                if (algorithmParameterSpec != null) {
                    throw new InvalidAlgorithmParameterException("Parameters not supported");
                }
                this.f4140c = f.a(3, a8, secureRandom);
                this.f4142e = new byte[a8];
                return;
            }
            if (str == f4136p) {
                if (algorithmParameterSpec != null) {
                    throw new InvalidAlgorithmParameterException("Parameters not supported");
                }
                f a9 = f.a(this.f4138a > 2 ? 1 : 2, a8, secureRandom);
                this.f4140c = a9;
                if (z7) {
                    this.f4142e = new byte[a9.a()];
                    return;
                } else {
                    this.f4142e = new byte[a8];
                    return;
                }
            }
            int i9 = this.f4138a;
            if (i9 == 3 || i9 == 4) {
                throw new InvalidKeyException("OAEP cannot be used to sign or verify signatures");
            }
            if (algorithmParameterSpec == null) {
                oAEPParameterSpec = new OAEPParameterSpec(this.f4146i, "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
            } else {
                if (!(algorithmParameterSpec instanceof OAEPParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("Wrong Parameters for OAEP Padding");
                }
                oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
            }
            f a10 = f.a(4, a8, secureRandom, oAEPParameterSpec);
            this.f4140c = a10;
            if (z7) {
                this.f4142e = new byte[a10.a()];
                return;
            } else {
                this.f4142e = new byte[a8];
                return;
            }
        }
        z7 = true;
        if (dVar instanceof d) {
        }
    }

    private void b(byte[] bArr, int i8, int i9) {
        int i10;
        if (i9 == 0 || bArr == null) {
            return;
        }
        int i11 = this.f4143f;
        int i12 = i11 + i9;
        byte[] bArr2 = this.f4142e;
        if (i12 > bArr2.length) {
            i10 = bArr2.length + 1;
        } else {
            System.arraycopy(bArr, i8, bArr2, i11, i9);
            i10 = this.f4143f + i9;
        }
        this.f4143f = i10;
    }

    public void a(String str) {
        if (str.equalsIgnoreCase("ECB")) {
            return;
        }
        throw new NoSuchAlgorithmException("Unsupported mode " + str);
    }

    private byte[] a() {
        int i8 = this.f4143f;
        byte[] bArr = this.f4142e;
        if (i8 > bArr.length) {
            throw new IllegalBlockSizeException("Data must not be longer than " + this.f4142e.length + " bytes");
        }
        try {
            int i9 = this.f4138a;
            if (i9 == 1) {
                return b.a(this.f4140c.a(bArr, 0, i8), this.f4145h);
            }
            if (i9 == 2) {
                throw new UnsupportedOperationException("only verify supported");
            }
            if (i9 == 3) {
                throw new UnsupportedOperationException("only verify supported");
            }
            if (i9 != 4) {
                throw new AssertionError("Internal error");
            }
            return this.f4140c.d(b.a(b.a(bArr, 0, i8), this.f4145h));
        } finally {
            this.f4143f = 0;
        }
    }

    public byte[] a(byte[] bArr, int i8, int i9) {
        b(bArr, i8, i9);
        return a();
    }
}
