package org.bouncycastle.jcajce.provider.asymmetric.util;

import org.bouncycastle.asn1.f;

/* loaded from: classes5.dex */
public class c {
    public static byte[] getEncodedPrivateKeyInfo(t6.b bVar) {
        try {
            return bVar.getEncoded("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(v6.a aVar, f fVar) {
        try {
            return getEncodedSubjectPublicKeyInfo(new v6.b(aVar, fVar));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedPrivateKeyInfo(v6.a aVar, f fVar) {
        try {
            return getEncodedPrivateKeyInfo(new t6.b(aVar, fVar.toASN1Primitive()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(v6.a aVar, byte[] bArr) {
        try {
            return getEncodedSubjectPublicKeyInfo(new v6.b(aVar, bArr));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(v6.b bVar) {
        try {
            return bVar.getEncoded("DER");
        } catch (Exception unused) {
            return null;
        }
    }
}
