package org.bouncycastle.pqc.jcajce.provider.xmss;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.s;
import org.bouncycastle.pqc.crypto.util.d;
import org.bouncycastle.pqc.crypto.xmss.x;

/* loaded from: classes5.dex */
public class BCXMSSPublicKey implements PublicKey, f7.b {
    private static final long serialVersionUID = -5617456225328969766L;
    private transient x keyParams;
    private transient o treeDigest;

    public BCXMSSPublicKey(o oVar, x xVar) {
        this.treeDigest = oVar;
        this.keyParams = xVar;
    }

    private void init(v6.b bVar) {
        x xVar = (x) org.bouncycastle.pqc.crypto.util.c.createKey(bVar);
        this.keyParams = xVar;
        this.treeDigest = a.getDigestOID(xVar.getTreeDigest());
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
        if (obj instanceof BCXMSSPublicKey) {
            BCXMSSPublicKey bCXMSSPublicKey = (BCXMSSPublicKey) obj;
            try {
                if (this.treeDigest.equals((s) bCXMSSPublicKey.treeDigest)) {
                    if (org.bouncycastle.util.a.areEqual(this.keyParams.getEncoded(), bCXMSSPublicKey.keyParams.getEncoded())) {
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
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

    @Override // f7.b
    public int getHeight() {
        return this.keyParams.getParameters().getHeight();
    }

    org.bouncycastle.crypto.c getKeyParams() {
        return this.keyParams;
    }

    @Override // f7.b
    public String getTreeDigest() {
        return a.getXMSSDigestName(this.treeDigest);
    }

    public int hashCode() {
        try {
            return this.treeDigest.hashCode() + (org.bouncycastle.util.a.hashCode(this.keyParams.getEncoded()) * 37);
        } catch (IOException unused) {
            return this.treeDigest.hashCode();
        }
    }

    public BCXMSSPublicKey(v6.b bVar) {
        init(bVar);
    }
}
