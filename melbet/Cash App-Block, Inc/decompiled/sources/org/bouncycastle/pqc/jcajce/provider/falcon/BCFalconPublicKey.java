package org.bouncycastle.pqc.jcajce.provider.falcon;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.crypto.falcon.FalconPublicKeyParameters;
import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;
import org.bouncycastle.pqc.jcajce.interfaces.FalconPublicKey;
import org.bouncycastle.pqc.jcajce.provider.util.KeyUtil;
import org.bouncycastle.pqc.jcajce.spec.FalconParameterSpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: classes10.dex */
public class BCFalconPublicKey implements FalconPublicKey {
    private static final long serialVersionUID = 1;
    private transient String algorithm;

    /* renamed from: encoding, reason: collision with root package name */
    private transient byte[] f1624encoding;
    private transient FalconPublicKeyParameters params;

    public BCFalconPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        init(subjectPublicKeyInfo);
    }

    private void init(FalconPublicKeyParameters falconPublicKeyParameters) {
        this.params = falconPublicKeyParameters;
        this.algorithm = Strings.toUpperCase(falconPublicKeyParameters.getParameters().getName());
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
        if (obj instanceof BCFalconPublicKey) {
            return Arrays.areEqual(getEncoded(), ((BCFalconPublicKey) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.f1624encoding == null) {
            this.f1624encoding = KeyUtil.getEncodedSubjectPublicKeyInfo(this.params);
        }
        return Arrays.clone(this.f1624encoding);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public FalconPublicKeyParameters getKeyParams() {
        return this.params;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.FalconKey
    public FalconParameterSpec getParameterSpec() {
        return FalconParameterSpec.fromName(this.params.getParameters().getName());
    }

    public int hashCode() {
        return Arrays.hashCode(getEncoded());
    }

    public BCFalconPublicKey(FalconPublicKeyParameters falconPublicKeyParameters) {
        init(falconPublicKeyParameters);
    }

    private void init(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        init((FalconPublicKeyParameters) PublicKeyFactory.createKey(subjectPublicKeyInfo));
    }
}
