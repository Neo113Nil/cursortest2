package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class rn3 implements xg3 {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal<Mac> f11280a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11281b;

    /* renamed from: c, reason: collision with root package name */
    private final Key f11282c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11283d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public rn3(String str, Key key) {
        char c7;
        int i7;
        qn3 qn3Var = new qn3(this);
        this.f11280a = qn3Var;
        if (!qf3.a(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f11281b = str;
        this.f11282c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        if (c7 == 0) {
            i7 = 20;
        } else if (c7 == 1) {
            i7 = 28;
        } else if (c7 == 2) {
            i7 = 32;
        } else if (c7 == 3) {
            i7 = 48;
        } else {
            if (c7 != 4) {
                throw new NoSuchAlgorithmException(str.length() != 0 ? "unknown Hmac algorithm: ".concat(str) : new String("unknown Hmac algorithm: "));
            }
            i7 = 64;
        }
        this.f11283d = i7;
        qn3Var.get();
    }

    @Override // com.google.android.gms.internal.ads.xg3
    public final byte[] a(byte[] bArr, int i7) {
        if (i7 > this.f11283d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.f11280a.get().update(bArr);
        return Arrays.copyOf(this.f11280a.get().doFinal(), i7);
    }
}
