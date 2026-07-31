package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p03 {

    /* renamed from: c, reason: collision with root package name */
    protected static final byte[] f9973c = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* renamed from: d, reason: collision with root package name */
    protected static final byte[] f9974d = {16, 57, 56, -18, 69, 55, -27, -98, -114, -25, -110, -10, 84, 80, 79, -72, 52, 111, -58, -77, 70, -48, -69, -60, 65, 95, -61, 57, -4, -4, -114, -63};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f9975a = f9974d;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f9976b = f9973c;

    public final boolean a(File file) {
        try {
            X509Certificate[][] a7 = f5.a(file.getAbsolutePath());
            if (a7.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(a7[0][0].getEncoded());
            if (Arrays.equals(this.f9976b, digest)) {
                return true;
            }
            return !"user".equals(Build.TYPE) && Arrays.equals(this.f9975a, digest);
        } catch (c5 e7) {
            throw new GeneralSecurityException("Package is not signed", e7);
        } catch (IOException e8) {
            e = e8;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e9) {
            e = e9;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
