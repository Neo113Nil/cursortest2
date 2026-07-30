package org.bouncycastle.pqc.jcajce.provider.sphincs;

import c7.e;
import c7.h;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.asn1.c1;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.x;
import org.bouncycastle.crypto.c;
import org.bouncycastle.pqc.crypto.sphincs.b;
import org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey;

/* loaded from: classes5.dex */
public class BCSphincs256PrivateKey implements PrivateKey, SPHINCSKey {
    private static final long serialVersionUID = 1;
    private transient x attributes;
    private transient b params;
    private transient o treeDigest;

    public BCSphincs256PrivateKey(o oVar, b bVar) {
        this.treeDigest = oVar;
        this.params = bVar;
    }

    private void init(t6.b bVar) {
        this.attributes = bVar.getAttributes();
        this.treeDigest = h.getInstance(bVar.getPrivateKeyAlgorithm().getParameters()).getTreeDigest().getAlgorithm();
        this.params = (b) org.bouncycastle.pqc.crypto.util.a.createKey(bVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        init(t6.b.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCSphincs256PrivateKey)) {
            return false;
        }
        BCSphincs256PrivateKey bCSphincs256PrivateKey = (BCSphincs256PrivateKey) obj;
        return this.treeDigest.equals((s) bCSphincs256PrivateKey.treeDigest) && org.bouncycastle.util.a.areEqual(this.params.getKeyData(), bCSphincs256PrivateKey.params.getKeyData());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return (this.params.getTreeDigest() != null ? org.bouncycastle.pqc.crypto.util.b.createPrivateKeyInfo(this.params, this.attributes) : new t6.b(new v6.a(e.sphincs256, new h(new v6.a(this.treeDigest))), new c1(this.params.getKeyData()), this.attributes)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey
    public byte[] getKeyData() {
        return this.params.getKeyData();
    }

    c getKeyParams() {
        return this.params;
    }

    o getTreeDigest() {
        return this.treeDigest;
    }

    public int hashCode() {
        return this.treeDigest.hashCode() + (org.bouncycastle.util.a.hashCode(this.params.getKeyData()) * 37);
    }

    public BCSphincs256PrivateKey(t6.b bVar) {
        init(bVar);
    }
}
