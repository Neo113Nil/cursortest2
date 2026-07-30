package h7;

import org.bouncycastle.asn1.f;
import t6.b;

/* loaded from: classes5.dex */
public class a {
    public static byte[] getEncodedPrivateKeyInfo(b bVar) {
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
            return getEncodedPrivateKeyInfo(new b(aVar, fVar.toASN1Primitive()));
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
