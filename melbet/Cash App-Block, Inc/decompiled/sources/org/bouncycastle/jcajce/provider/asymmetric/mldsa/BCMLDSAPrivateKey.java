package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.jcajce.interfaces.MLDSAPrivateKey;
import org.bouncycastle.jcajce.interfaces.MLDSAPublicKey;
import org.bouncycastle.jcajce.spec.MLDSAParameterSpec;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.util.PrivateKeyFactory;
import org.bouncycastle.pqc.jcajce.provider.util.KeyUtil;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes9.dex */
public class BCMLDSAPrivateKey implements MLDSAPrivateKey {
    private static final long serialVersionUID = 1;
    private transient String algorithm;
    private transient ASN1Set attributes;

    /* renamed from: encoding, reason: collision with root package name */
    private transient byte[] f1591encoding;
    private transient MLDSAPrivateKeyParameters params;

    public BCMLDSAPrivateKey(MLDSAPrivateKeyParameters mLDSAPrivateKeyParameters) {
        this.params = mLDSAPrivateKeyParameters;
        this.algorithm = Strings.toUpperCase(MLDSAParameterSpec.fromName(mLDSAPrivateKeyParameters.getParameters().getName()).getName());
    }

    private void init(MLDSAPrivateKeyParameters mLDSAPrivateKeyParameters, ASN1Set aSN1Set) {
        this.attributes = aSN1Set;
        this.params = mLDSAPrivateKeyParameters;
        this.algorithm = MLDSAParameterSpec.fromName(mLDSAPrivateKeyParameters.getParameters().getName()).getName().toUpperCase();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        init(PrivateKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCMLDSAPrivateKey) {
            return Arrays.areEqual(this.params.getEncoded(), ((BCMLDSAPrivateKey) obj).params.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.f1591encoding == null) {
            this.f1591encoding = KeyUtil.getEncodedPrivateKeyInfo(this.params, this.attributes);
        }
        return Arrays.clone(this.f1591encoding);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public MLDSAPrivateKeyParameters getKeyParams() {
        return this.params;
    }

    @Override // org.bouncycastle.jcajce.interfaces.MLDSAKey
    public MLDSAParameterSpec getParameterSpec() {
        return MLDSAParameterSpec.fromName(this.params.getParameters().getName());
    }

    @Override // org.bouncycastle.jcajce.interfaces.MLDSAPrivateKey
    public MLDSAPublicKey getPublicKey() {
        return new BCMLDSAPublicKey(this.params.getPublicKeyParameters());
    }

    public int hashCode() {
        return Arrays.hashCode(this.params.getEncoded());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String lineSeparator = Strings.lineSeparator();
        byte[] publicKey = this.params.getPublicKey();
        sb.append(getAlgorithm());
        sb.append(" Private Key [");
        sb.append(new Fingerprint(publicKey).toString());
        sb.append("]");
        sb.append(lineSeparator);
        sb.append("    public data: ");
        sb.append(Hex.toHexString(publicKey));
        sb.append(lineSeparator);
        return sb.toString();
    }

    private void init(PrivateKeyInfo privateKeyInfo) {
        init((MLDSAPrivateKeyParameters) PrivateKeyFactory.createKey(privateKeyInfo), privateKeyInfo.getAttributes());
    }

    public BCMLDSAPrivateKey(PrivateKeyInfo privateKeyInfo) {
        init(privateKeyInfo);
    }
}
