package org.bouncycastle.pqc.jcajce.provider.lms;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import org.bouncycastle.pqc.crypto.lms.f;
import org.bouncycastle.pqc.crypto.lms.o;
import org.bouncycastle.pqc.crypto.lms.r;
import org.bouncycastle.pqc.crypto.util.c;
import org.bouncycastle.pqc.crypto.util.d;
import org.bouncycastle.pqc.jcajce.interfaces.LMSKey;
import v6.b;

/* loaded from: classes5.dex */
public class BCLMSPublicKey implements PublicKey, LMSKey {
    private static final long serialVersionUID = -5617456225328969766L;
    private transient o keyParams;

    public BCLMSPublicKey(o oVar) {
        this.keyParams = oVar;
    }

    private void init(b bVar) {
        this.keyParams = (o) c.createKey(bVar);
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
        if (obj instanceof BCLMSPublicKey) {
            try {
                return org.bouncycastle.util.a.areEqual(this.keyParams.getEncoded(), ((BCLMSPublicKey) obj).keyParams.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "LMS";
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

    @Override // org.bouncycastle.pqc.jcajce.interfaces.LMSKey
    public int getLevels() {
        o oVar = this.keyParams;
        if (oVar instanceof r) {
            return 1;
        }
        return ((f) oVar).getL();
    }

    public int hashCode() {
        try {
            return org.bouncycastle.util.a.hashCode(this.keyParams.getEncoded());
        } catch (IOException unused) {
            return -1;
        }
    }

    public BCLMSPublicKey(b bVar) {
        init(bVar);
    }
}
