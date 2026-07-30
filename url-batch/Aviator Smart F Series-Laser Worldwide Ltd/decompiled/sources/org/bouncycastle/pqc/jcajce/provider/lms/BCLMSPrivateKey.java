package org.bouncycastle.pqc.jcajce.provider.lms;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.asn1.x;
import org.bouncycastle.crypto.c;
import org.bouncycastle.pqc.crypto.lms.e;
import org.bouncycastle.pqc.crypto.lms.o;
import org.bouncycastle.pqc.crypto.lms.q;
import org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey;
import t6.b;

/* loaded from: classes5.dex */
public class BCLMSPrivateKey implements PrivateKey, LMSPrivateKey {
    private static final long serialVersionUID = 8568701712864512338L;
    private transient x attributes;
    private transient o keyParams;

    public BCLMSPrivateKey(o oVar) {
        this.keyParams = oVar;
    }

    private void init(b bVar) {
        this.attributes = bVar.getAttributes();
        this.keyParams = (o) org.bouncycastle.pqc.crypto.util.a.createKey(bVar);
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
        if (!(obj instanceof BCLMSPrivateKey)) {
            return false;
        }
        try {
            return org.bouncycastle.util.a.areEqual(this.keyParams.getEncoded(), ((BCLMSPrivateKey) obj).keyParams.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to perform equals");
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey
    public LMSPrivateKey extractKeyShard(int i8) {
        o oVar = this.keyParams;
        return oVar instanceof q ? new BCLMSPrivateKey(((q) oVar).extractKeyShard(i8)) : new BCLMSPrivateKey(((e) oVar).extractKeyShard(i8));
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "LMS";
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

    @Override // org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey
    public long getIndex() {
        if (getUsagesRemaining() == 0) {
            throw new IllegalStateException("key exhausted");
        }
        o oVar = this.keyParams;
        return oVar instanceof q ? ((q) oVar).getIndex() : ((e) oVar).getIndex();
    }

    c getKeyParams() {
        return this.keyParams;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey, org.bouncycastle.pqc.jcajce.interfaces.LMSKey
    public int getLevels() {
        o oVar = this.keyParams;
        if (oVar instanceof q) {
            return 1;
        }
        return ((e) oVar).getL();
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey
    public long getUsagesRemaining() {
        o oVar = this.keyParams;
        return oVar instanceof q ? ((q) oVar).getUsagesRemaining() : ((e) oVar).getUsagesRemaining();
    }

    public int hashCode() {
        try {
            return org.bouncycastle.util.a.hashCode(this.keyParams.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
    }

    public BCLMSPrivateKey(b bVar) {
        init(bVar);
    }
}
