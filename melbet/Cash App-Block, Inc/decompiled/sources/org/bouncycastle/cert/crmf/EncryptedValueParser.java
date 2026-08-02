package org.bouncycastle.cert.crmf;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.asn1.crmf.EncryptedValue;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes9.dex */
public class EncryptedValueParser {
    private EncryptedValuePadder padder;
    private EncryptedValue value;

    public EncryptedValueParser(EncryptedValue encryptedValue, EncryptedValuePadder encryptedValuePadder) {
        this.value = encryptedValue;
        this.padder = encryptedValuePadder;
    }

    private byte[] decryptValue(ValueDecryptorGenerator valueDecryptorGenerator) {
        if (this.value.getValueHint() != null) {
            OptionalProvider$$ExternalSyntheticLambda0.m();
            return null;
        }
        try {
            return unpadData(Streams.readAll(valueDecryptorGenerator.getValueDecryptor(this.value.getKeyAlg(), this.value.getSymmAlg(), this.value.getEncSymmKey().getBytes()).getInputStream(new ByteArrayInputStream(this.value.getEncValue().getBytes()))));
        } catch (IOException e) {
            throw new CRMFException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("Cannot parse decrypted data: ")), e);
        }
    }

    private byte[] unpadData(byte[] bArr) {
        EncryptedValuePadder encryptedValuePadder = this.padder;
        return encryptedValuePadder != null ? encryptedValuePadder.getUnpaddedData(bArr) : bArr;
    }

    public AlgorithmIdentifier getIntendedAlg() {
        return this.value.getIntendedAlg();
    }

    public X509CertificateHolder readCertificateHolder(ValueDecryptorGenerator valueDecryptorGenerator) {
        return new X509CertificateHolder(Certificate.getInstance(decryptValue(valueDecryptorGenerator)));
    }

    public char[] readPassphrase(ValueDecryptorGenerator valueDecryptorGenerator) {
        return Strings.fromUTF8ByteArray(decryptValue(valueDecryptorGenerator)).toCharArray();
    }

    public PrivateKeyInfo readPrivateKeyInfo(ValueDecryptorGenerator valueDecryptorGenerator) {
        return PrivateKeyInfo.getInstance(decryptValue(valueDecryptorGenerator));
    }

    public EncryptedValueParser(EncryptedValue encryptedValue) {
        this.value = encryptedValue;
    }
}
