package org.bouncycastle.pqc.jcajce.provider.kyber;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMPublicKeyParameters;
import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;
import org.bouncycastle.pqc.jcajce.interfaces.KyberPublicKey;
import org.bouncycastle.pqc.jcajce.provider.util.KeyUtil;
import org.bouncycastle.pqc.jcajce.spec.KyberParameterSpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: classes10.dex */
public class BCKyberPublicKey implements KyberPublicKey {
    private static final long serialVersionUID = 1;
    private transient String algorithm;

    /* renamed from: encoding, reason: collision with root package name */
    private transient byte[] f1625encoding;
    private transient MLKEMPublicKeyParameters params;

    public BCKyberPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        init(subjectPublicKeyInfo);
    }

    private void init(MLKEMPublicKeyParameters mLKEMPublicKeyParameters) {
        this.params = mLKEMPublicKeyParameters;
        this.algorithm = Strings.toUpperCase(mLKEMPublicKeyParameters.getParameters().getName());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        init(SubjectPublicKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCKyberPublicKey) {
            return Arrays.areEqual(getEncoded(), ((BCKyberPublicKey) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.f1625encoding == null) {
            this.f1625encoding = KeyUtil.getEncodedSubjectPublicKeyInfo(this.params);
        }
        return Arrays.clone(this.f1625encoding);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public MLKEMPublicKeyParameters getKeyParams() {
        return this.params;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.KyberKey
    public KyberParameterSpec getParameterSpec() {
        return KyberParameterSpec.fromName(this.params.getParameters().getName());
    }

    public int hashCode() {
        return Arrays.hashCode(getEncoded());
    }

    public BCKyberPublicKey(MLKEMPublicKeyParameters mLKEMPublicKeyParameters) {
        init(mLKEMPublicKeyParameters);
    }

    private void init(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        init((MLKEMPublicKeyParameters) PublicKeyFactory.createKey(subjectPublicKeyInfo));
    }
}
