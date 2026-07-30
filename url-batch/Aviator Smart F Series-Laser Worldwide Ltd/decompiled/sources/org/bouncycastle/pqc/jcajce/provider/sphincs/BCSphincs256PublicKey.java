package org.bouncycastle.pqc.jcajce.provider.sphincs;

import c7.e;
import c7.h;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.s;
import org.bouncycastle.pqc.crypto.sphincs.c;
import org.bouncycastle.pqc.crypto.util.d;
import org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey;
import v6.b;

/* loaded from: classes5.dex */
public class BCSphincs256PublicKey implements PublicKey, SPHINCSKey {
    private static final long serialVersionUID = 1;
    private transient c params;
    private transient o treeDigest;

    public BCSphincs256PublicKey(o oVar, c cVar) {
        this.treeDigest = oVar;
        this.params = cVar;
    }

    private void init(b bVar) {
        this.treeDigest = h.getInstance(bVar.getAlgorithm().getParameters()).getTreeDigest().getAlgorithm();
        this.params = (c) org.bouncycastle.pqc.crypto.util.c.createKey(bVar);
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
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCSphincs256PublicKey)) {
            return false;
        }
        BCSphincs256PublicKey bCSphincs256PublicKey = (BCSphincs256PublicKey) obj;
        return this.treeDigest.equals((s) bCSphincs256PublicKey.treeDigest) && org.bouncycastle.util.a.areEqual(this.params.getKeyData(), bCSphincs256PublicKey.params.getKeyData());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return (this.params.getTreeDigest() != null ? d.createSubjectPublicKeyInfo(this.params) : new b(new v6.a(e.sphincs256, new h(new v6.a(this.treeDigest))), this.params.getKeyData())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey
    public byte[] getKeyData() {
        return this.params.getKeyData();
    }

    org.bouncycastle.crypto.c getKeyParams() {
        return this.params;
    }

    o getTreeDigest() {
        return this.treeDigest;
    }

    public int hashCode() {
        return this.treeDigest.hashCode() + (org.bouncycastle.util.a.hashCode(this.params.getKeyData()) * 37);
    }

    public BCSphincs256PublicKey(b bVar) {
        init(bVar);
    }
}
