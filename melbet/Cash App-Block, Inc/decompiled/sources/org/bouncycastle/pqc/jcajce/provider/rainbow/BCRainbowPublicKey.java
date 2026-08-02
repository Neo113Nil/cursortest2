package org.bouncycastle.pqc.jcajce.provider.rainbow;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters;
import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;
import org.bouncycastle.pqc.jcajce.interfaces.RainbowPublicKey;
import org.bouncycastle.pqc.jcajce.provider.util.KeyUtil;
import org.bouncycastle.pqc.jcajce.spec.RainbowParameterSpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: classes10.dex */
public class BCRainbowPublicKey implements RainbowPublicKey {
    private static final long serialVersionUID = 1;
    private transient String algorithm;

    /* renamed from: encoding, reason: collision with root package name */
    private transient byte[] f1627encoding;
    private transient RainbowPublicKeyParameters params;

    public BCRainbowPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        init(subjectPublicKeyInfo);
    }

    private void init(RainbowPublicKeyParameters rainbowPublicKeyParameters) {
        this.params = rainbowPublicKeyParameters;
        this.algorithm = Strings.toUpperCase(rainbowPublicKeyParameters.getParameters().getName());
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
        if (obj instanceof BCRainbowPublicKey) {
            return Arrays.areEqual(getEncoded(), ((BCRainbowPublicKey) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.f1627encoding == null) {
            this.f1627encoding = KeyUtil.getEncodedSubjectPublicKeyInfo(this.params);
        }
        return Arrays.clone(this.f1627encoding);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public RainbowPublicKeyParameters getKeyParams() {
        return this.params;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.RainbowKey
    public RainbowParameterSpec getParameterSpec() {
        return RainbowParameterSpec.fromName(this.params.getParameters().getName());
    }

    public int hashCode() {
        return Arrays.hashCode(getEncoded());
    }

    public BCRainbowPublicKey(RainbowPublicKeyParameters rainbowPublicKeyParameters) {
        init(rainbowPublicKeyParameters);
    }

    private void init(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        init((RainbowPublicKeyParameters) PublicKeyFactory.createKey(subjectPublicKeyInfo));
    }
}
