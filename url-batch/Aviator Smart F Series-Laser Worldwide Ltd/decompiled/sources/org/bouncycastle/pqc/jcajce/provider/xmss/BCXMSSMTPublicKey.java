package org.bouncycastle.pqc.jcajce.provider.xmss;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import org.bouncycastle.asn1.o;
import org.bouncycastle.pqc.crypto.util.d;
import org.bouncycastle.pqc.crypto.xmss.s;

/* loaded from: classes5.dex */
public class BCXMSSMTPublicKey implements PublicKey, f7.c {
    private static final long serialVersionUID = 3230324130542413475L;
    private transient s keyParams;
    private transient o treeDigest;

    public BCXMSSMTPublicKey(o oVar, s sVar) {
        this.treeDigest = oVar;
        this.keyParams = sVar;
    }

    private void init(v6.b bVar) {
        s sVar = (s) org.bouncycastle.pqc.crypto.util.c.createKey(bVar);
        this.keyParams = sVar;
        this.treeDigest = a.getDigestOID(sVar.getTreeDigest());
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
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSMTPublicKey)) {
            return false;
        }
        BCXMSSMTPublicKey bCXMSSMTPublicKey = (BCXMSSMTPublicKey) obj;
        return this.treeDigest.equals((org.bouncycastle.asn1.s) bCXMSSMTPublicKey.treeDigest) && org.bouncycastle.util.a.areEqual(this.keyParams.toByteArray(), bCXMSSMTPublicKey.keyParams.toByteArray());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return d.createSubjectPublicKeyInfo(this.keyParams).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // f7.c
    public int getHeight() {
        return this.keyParams.getParameters().getHeight();
    }

    org.bouncycastle.crypto.c getKeyParams() {
        return this.keyParams;
    }

    @Override // f7.c
    public int getLayers() {
        return this.keyParams.getParameters().getLayers();
    }

    @Override // f7.c
    public String getTreeDigest() {
        return a.getXMSSDigestName(this.treeDigest);
    }

    public int hashCode() {
        return this.treeDigest.hashCode() + (org.bouncycastle.util.a.hashCode(this.keyParams.toByteArray()) * 37);
    }

    public BCXMSSMTPublicKey(v6.b bVar) {
        init(bVar);
    }
}
