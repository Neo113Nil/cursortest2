package org.bouncycastle.pkcs;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.operator.InputDecryptorProvider;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes9.dex */
public class PKCS8EncryptedPrivateKeyInfo {
    private EncryptedPrivateKeyInfo encryptedPrivateKeyInfo;

    public PKCS8EncryptedPrivateKeyInfo(byte[] bArr) {
        this(parseBytes(bArr));
    }

    private static EncryptedPrivateKeyInfo parseBytes(byte[] bArr) {
        try {
            return EncryptedPrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(bArr));
        } catch (ClassCastException e) {
            Mod$$ExternalSyntheticBUOutline0.m("malformed data: ", e.getMessage(), e);
            return null;
        } catch (IllegalArgumentException e2) {
            throw new PKCSIOException(GetCert$$ExternalSyntheticOutline0.m(e2, new StringBuilder("malformed data: ")), e2);
        }
    }

    public PrivateKeyInfo decryptPrivateKeyInfo(InputDecryptorProvider inputDecryptorProvider) {
        try {
            return PrivateKeyInfo.getInstance(Streams.readAll(inputDecryptorProvider.get(this.encryptedPrivateKeyInfo.getEncryptionAlgorithm()).getInputStream(new ByteArrayInputStream(this.encryptedPrivateKeyInfo.getEncryptedData()))));
        } catch (Exception e) {
            throw new PKCSException(Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("unable to read encrypted data: ")), e);
        }
    }

    public byte[] getEncoded() {
        return this.encryptedPrivateKeyInfo.getEncoded();
    }

    public byte[] getEncryptedData() {
        return this.encryptedPrivateKeyInfo.getEncryptedData();
    }

    public AlgorithmIdentifier getEncryptionAlgorithm() {
        return this.encryptedPrivateKeyInfo.getEncryptionAlgorithm();
    }

    public EncryptedPrivateKeyInfo toASN1Structure() {
        return this.encryptedPrivateKeyInfo;
    }

    public PKCS8EncryptedPrivateKeyInfo(EncryptedPrivateKeyInfo encryptedPrivateKeyInfo) {
        this.encryptedPrivateKeyInfo = encryptedPrivateKeyInfo;
    }
}
