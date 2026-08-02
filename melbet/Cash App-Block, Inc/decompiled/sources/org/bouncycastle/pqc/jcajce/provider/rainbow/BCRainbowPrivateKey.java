package org.bouncycastle.pqc.jcajce.provider.rainbow;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters;
import org.bouncycastle.pqc.crypto.util.PrivateKeyFactory;
import org.bouncycastle.pqc.jcajce.interfaces.RainbowPrivateKey;
import org.bouncycastle.pqc.jcajce.interfaces.RainbowPublicKey;
import org.bouncycastle.pqc.jcajce.provider.util.KeyUtil;
import org.bouncycastle.pqc.jcajce.spec.RainbowParameterSpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: classes10.dex */
public class BCRainbowPrivateKey implements RainbowPrivateKey {
    private static final long serialVersionUID = 1;
    private transient String algorithm;
    private transient ASN1Set attributes;

    /* renamed from: encoding, reason: collision with root package name */
    private transient byte[] f1626encoding;
    private transient RainbowPrivateKeyParameters params;

    public BCRainbowPrivateKey(RainbowPrivateKeyParameters rainbowPrivateKeyParameters) {
        init(rainbowPrivateKeyParameters, null);
    }

    private void init(RainbowPrivateKeyParameters rainbowPrivateKeyParameters, ASN1Set aSN1Set) {
        this.attributes = aSN1Set;
        this.params = rainbowPrivateKeyParameters;
        this.algorithm = Strings.toUpperCase(rainbowPrivateKeyParameters.getParameters().getName());
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
        if (obj instanceof BCRainbowPrivateKey) {
            return Arrays.areEqual(getEncoded(), ((BCRainbowPrivateKey) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.f1626encoding == null) {
            this.f1626encoding = KeyUtil.getEncodedPrivateKeyInfo(this.params, this.attributes);
        }
        return Arrays.clone(this.f1626encoding);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public RainbowPrivateKeyParameters getKeyParams() {
        return this.params;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.RainbowKey
    public RainbowParameterSpec getParameterSpec() {
        return RainbowParameterSpec.fromName(this.params.getParameters().getName());
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.RainbowPrivateKey
    public RainbowPublicKey getPublicKey() {
        return new BCRainbowPublicKey(new RainbowPublicKeyParameters(this.params.getParameters(), this.params.getPublicKey()));
    }

    public int hashCode() {
        return Arrays.hashCode(getEncoded());
    }

    public BCRainbowPrivateKey(PrivateKeyInfo privateKeyInfo) {
        init(privateKeyInfo);
    }

    private void init(PrivateKeyInfo privateKeyInfo) {
        init((RainbowPrivateKeyParameters) PrivateKeyFactory.createKey(privateKeyInfo), privateKeyInfo.getAttributes());
    }
}
