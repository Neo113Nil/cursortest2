package org.bouncycastle.pqc.jcajce.provider.xmss;

import c7.i;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.x;
import org.bouncycastle.pqc.crypto.xmss.w;
import org.bouncycastle.pqc.jcajce.interfaces.XMSSPrivateKey;

/* loaded from: classes5.dex */
public class BCXMSSPrivateKey implements PrivateKey, XMSSPrivateKey {
    private static final long serialVersionUID = 8568701712864512338L;
    private transient x attributes;
    private transient w keyParams;
    private transient o treeDigest;

    public BCXMSSPrivateKey(o oVar, w wVar) {
        this.treeDigest = oVar;
        this.keyParams = wVar;
    }

    private void init(t6.b bVar) {
        this.attributes = bVar.getAttributes();
        this.treeDigest = i.getInstance(bVar.getPrivateKeyAlgorithm().getParameters()).getTreeDigest().getAlgorithm();
        this.keyParams = (w) org.bouncycastle.pqc.crypto.util.a.createKey(bVar);
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
        if (!(obj instanceof BCXMSSPrivateKey)) {
            return false;
        }
        BCXMSSPrivateKey bCXMSSPrivateKey = (BCXMSSPrivateKey) obj;
        return this.treeDigest.equals((s) bCXMSSPrivateKey.treeDigest) && org.bouncycastle.util.a.areEqual(this.keyParams.toByteArray(), bCXMSSPrivateKey.keyParams.toByteArray());
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSPrivateKey
    public XMSSPrivateKey extractKeyShard(int i8) {
        return new BCXMSSPrivateKey(this.treeDigest, this.keyParams.extractKeyShard(i8));
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return org.bouncycastle.pqc.crypto.util.b.createPrivateKeyInfo(this.keyParams, this.attributes).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSPrivateKey, f7.b
    public int getHeight() {
        return this.keyParams.getParameters().getHeight();
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSPrivateKey
    public long getIndex() {
        if (getUsagesRemaining() != 0) {
            return this.keyParams.getIndex();
        }
        throw new IllegalStateException("key exhausted");
    }

    org.bouncycastle.crypto.c getKeyParams() {
        return this.keyParams;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSPrivateKey, f7.b
    public String getTreeDigest() {
        return a.getXMSSDigestName(this.treeDigest);
    }

    o getTreeDigestOID() {
        return this.treeDigest;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSPrivateKey
    public long getUsagesRemaining() {
        return this.keyParams.getUsagesRemaining();
    }

    public int hashCode() {
        return this.treeDigest.hashCode() + (org.bouncycastle.util.a.hashCode(this.keyParams.toByteArray()) * 37);
    }

    public BCXMSSPrivateKey(t6.b bVar) {
        init(bVar);
    }
}
