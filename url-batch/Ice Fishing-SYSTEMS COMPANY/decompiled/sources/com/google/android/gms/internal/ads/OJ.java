package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class OJ implements InterfaceC4054vE {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f26683a = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    public static OJ a(C3628nJ c3628nJ) {
        Provider e6 = AbstractC2720Pd.e();
        if (e6 == null) {
            throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
        }
        byte[] b9 = ((C3791qK) c3628nJ.f32848c.f26395u).b();
        c3628nJ.f32847b.f33378d.b();
        OJ oj = new OJ();
        if (!XC.e(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (b9.length != 32) {
            throw new IllegalArgumentException("Given private key's length is not 32");
        }
        KeyFactory.getInstance("Ed25519", e6).generatePrivate(new PKCS8EncodedKeySpec(XC.f(f26683a, b9)));
        return oj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if ((!java.util.Objects.equals(java.lang.System.getProperty("java.vendor"), "The Android Project") ? null : java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT)).intValue() <= 23) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static OJ b(FJ fj) {
        Provider e6;
        int i = IG.f25546a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            e6 = null;
        }
        e6 = AbstractC2720Pd.e();
        if (e6 == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", e6);
        EJ ej = fj.f24941b.f25135b;
        GJ gj = fj.f24941b;
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(gj.f25136c, ej.f24695b, (BigInteger) fj.f24942c.f26393u, (BigInteger) fj.f24943d.f26393u, (BigInteger) fj.f24944e.f26393u, (BigInteger) fj.f24945f.f26393u, (BigInteger) fj.f24946g.f26393u, (BigInteger) fj.f24947h.f26393u));
        gj.f25137d.b();
        OJ oj = new OJ();
        if (!XC.e(2)) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC3137eE.i(rSAPrivateCrtKey.getModulus().bitLength());
        AbstractC3137eE.k(rSAPrivateCrtKey.getPublicExponent());
        CJ cj = ej.f24697d;
        VJ.b(cj);
        VJ.c(cj, ej.f24698e, ej.f24699f);
        return oj;
    }
}
