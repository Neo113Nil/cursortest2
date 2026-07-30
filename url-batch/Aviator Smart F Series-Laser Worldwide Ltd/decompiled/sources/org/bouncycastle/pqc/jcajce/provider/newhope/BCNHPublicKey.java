package org.bouncycastle.pqc.jcajce.provider.newhope;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.pqc.crypto.newhope.b;
import org.bouncycastle.pqc.crypto.util.c;
import org.bouncycastle.pqc.crypto.util.d;
import org.bouncycastle.pqc.jcajce.interfaces.NHPublicKey;

/* loaded from: classes5.dex */
public class BCNHPublicKey implements NHPublicKey {
    private static final long serialVersionUID = 1;
    private transient b params;

    public BCNHPublicKey(b bVar) {
        this.params = bVar;
    }

    private void init(v6.b bVar) {
        this.params = (b) c.createKey(bVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        init(v6.b.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCNHPublicKey)) {
            return false;
        }
        return org.bouncycastle.util.a.areEqual(this.params.getPubData(), ((BCNHPublicKey) obj).params.getPubData());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return d.createSubjectPublicKeyInfo(this.params).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    org.bouncycastle.crypto.c getKeyParams() {
        return this.params;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.NHPublicKey
    public byte[] getPublicData() {
        return this.params.getPubData();
    }

    public int hashCode() {
        return org.bouncycastle.util.a.hashCode(this.params.getPubData());
    }

    public BCNHPublicKey(v6.b bVar) {
        init(bVar);
    }
}
