package org.bouncycastle.pqc.jcajce.provider.qtesla;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.asn1.x;
import org.bouncycastle.pqc.crypto.qtesla.c;
import t6.b;

/* loaded from: classes5.dex */
public class BCqTESLAPrivateKey implements PrivateKey, f7.a {
    private static final long serialVersionUID = 1;
    private transient x attributes;
    private transient org.bouncycastle.pqc.crypto.qtesla.a keyParams;

    public BCqTESLAPrivateKey(org.bouncycastle.pqc.crypto.qtesla.a aVar) {
        this.keyParams = aVar;
    }

    private void init(b bVar) {
        this.attributes = bVar.getAttributes();
        this.keyParams = (org.bouncycastle.pqc.crypto.qtesla.a) org.bouncycastle.pqc.crypto.util.a.createKey(bVar);
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
        if (!(obj instanceof BCqTESLAPrivateKey)) {
            return false;
        }
        BCqTESLAPrivateKey bCqTESLAPrivateKey = (BCqTESLAPrivateKey) obj;
        return this.keyParams.getSecurityCategory() == bCqTESLAPrivateKey.keyParams.getSecurityCategory() && org.bouncycastle.util.a.areEqual(this.keyParams.getSecret(), bCqTESLAPrivateKey.keyParams.getSecret());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return c.getName(this.keyParams.getSecurityCategory());
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

    org.bouncycastle.crypto.c getKeyParams() {
        return this.keyParams;
    }

    @Override // f7.a
    public i7.a getParams() {
        return new i7.a(getAlgorithm());
    }

    public int hashCode() {
        return this.keyParams.getSecurityCategory() + (org.bouncycastle.util.a.hashCode(this.keyParams.getSecret()) * 37);
    }

    public BCqTESLAPrivateKey(b bVar) {
        init(bVar);
    }
}
