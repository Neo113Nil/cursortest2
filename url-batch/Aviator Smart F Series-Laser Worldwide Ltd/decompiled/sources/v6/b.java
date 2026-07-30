package v6;

import java.util.Enumeration;
import org.bouncycastle.asn1.b0;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.g;
import org.bouncycastle.asn1.g1;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.t0;
import org.bouncycastle.asn1.v;

/* loaded from: classes5.dex */
public class b extends n {
    private a algId;
    private t0 keyData;

    public b(v vVar) {
        if (vVar.size() == 2) {
            Enumeration objects = vVar.getObjects();
            this.algId = a.getInstance(objects.nextElement());
            this.keyData = t0.getInstance(objects.nextElement());
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + vVar.size());
        }
    }

    public static b getInstance(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(v.getInstance(obj));
        }
        return null;
    }

    public a getAlgorithm() {
        return this.algId;
    }

    public a getAlgorithmId() {
        return this.algId;
    }

    public s getPublicKey() {
        return s.fromByteArray(this.keyData.getOctets());
    }

    public t0 getPublicKeyData() {
        return this.keyData;
    }

    public s parsePublicKey() {
        return s.fromByteArray(this.keyData.getOctets());
    }

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        g gVar = new g(2);
        gVar.add(this.algId);
        gVar.add(this.keyData);
        return new g1(gVar);
    }

    public b(a aVar, f fVar) {
        this.keyData = new t0(fVar);
        this.algId = aVar;
    }

    public static b getInstance(b0 b0Var, boolean z7) {
        return getInstance(v.getInstance(b0Var, z7));
    }

    public b(a aVar, byte[] bArr) {
        this.keyData = new t0(bArr);
        this.algId = aVar;
    }
}
