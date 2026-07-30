package org.bouncycastle.pqc.jcajce.provider.qtesla;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import org.bouncycastle.pqc.crypto.qtesla.b;
import org.bouncycastle.pqc.crypto.util.c;
import org.bouncycastle.pqc.crypto.util.d;

/* loaded from: classes5.dex */
public class BCqTESLAPublicKey implements PublicKey, f7.a {
    private static final long serialVersionUID = 1;
    private transient b keyParams;

    public BCqTESLAPublicKey(b bVar) {
        this.keyParams = bVar;
    }

    private void init(v6.b bVar) {
        this.keyParams = (b) c.createKey(bVar);
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
        if (!(obj instanceof BCqTESLAPublicKey)) {
            return false;
        }
        BCqTESLAPublicKey bCqTESLAPublicKey = (BCqTESLAPublicKey) obj;
        return this.keyParams.getSecurityCategory() == bCqTESLAPublicKey.keyParams.getSecurityCategory() && org.bouncycastle.util.a.areEqual(this.keyParams.getPublicData(), bCqTESLAPublicKey.keyParams.getPublicData());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return org.bouncycastle.pqc.crypto.qtesla.c.getName(this.keyParams.getSecurityCategory());
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

    org.bouncycastle.crypto.c getKeyParams() {
        return this.keyParams;
    }

    @Override // f7.a
    public i7.a getParams() {
        return new i7.a(getAlgorithm());
    }

    public int hashCode() {
        return this.keyParams.getSecurityCategory() + (org.bouncycastle.util.a.hashCode(this.keyParams.getPublicData()) * 37);
    }

    public BCqTESLAPublicKey(v6.b bVar) {
        init(bVar);
    }
}
