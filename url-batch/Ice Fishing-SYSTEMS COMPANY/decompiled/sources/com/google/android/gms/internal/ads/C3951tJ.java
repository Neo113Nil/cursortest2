package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.tJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3951tJ {

    /* renamed from: e, reason: collision with root package name */
    public static final BigInteger f34390e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f34391f;

    /* renamed from: a, reason: collision with root package name */
    public Integer f34392a = null;

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f34393b = C4113wJ.f34969e;

    /* renamed from: c, reason: collision with root package name */
    public C4005uJ f34394c = null;

    /* renamed from: d, reason: collision with root package name */
    public C4059vJ f34395d = C4059vJ.f34751e;

    static {
        BigInteger valueOf = BigInteger.valueOf(2L);
        f34390e = valueOf;
        f34391f = valueOf.pow(256);
    }

    public final void a(int i) {
        this.f34392a = Integer.valueOf(i);
    }

    public final C4113wJ b() {
        Integer num = this.f34392a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f34393b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f34394c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f34395d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f34392a));
        }
        BigInteger bigInteger = this.f34393b;
        int compareTo = bigInteger.compareTo(C4113wJ.f34969e);
        if (compareTo != 0) {
            if (compareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f34390e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f34391f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new C4113wJ(this.f34392a.intValue(), this.f34393b, this.f34395d, this.f34394c);
    }
}
