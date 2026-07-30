package org.bouncycastle.pqc.jcajce.provider.newhope;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.asn1.x;
import org.bouncycastle.crypto.c;
import org.bouncycastle.pqc.jcajce.interfaces.NHPrivateKey;
import t6.b;

/* loaded from: classes5.dex */
public class BCNHPrivateKey implements NHPrivateKey {
    private static final long serialVersionUID = 1;
    private transient x attributes;
    private transient org.bouncycastle.pqc.crypto.newhope.a params;

    public BCNHPrivateKey(org.bouncycastle.pqc.crypto.newhope.a aVar) {
        this.params = aVar;
    }

    private void init(b bVar) {
        this.attributes = bVar.getAttributes();
        this.params = (org.bouncycastle.pqc.crypto.newhope.a) org.bouncycastle.pqc.crypto.util.a.createKey(bVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        init(b.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj instanceof BCNHPrivateKey) {
            return org.bouncycastle.util.a.areEqual(this.params.getSecData(), ((BCNHPrivateKey) obj).params.getSecData());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return org.bouncycastle.pqc.crypto.util.b.createPrivateKeyInfo(this.params, this.attributes).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    c getKeyParams() {
        return this.params;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.NHPrivateKey
    public short[] getSecretData() {
        return this.params.getSecData();
    }

    public int hashCode() {
        return org.bouncycastle.util.a.hashCode(this.params.getSecData());
    }

    public BCNHPrivateKey(b bVar) {
        init(bVar);
    }
}
