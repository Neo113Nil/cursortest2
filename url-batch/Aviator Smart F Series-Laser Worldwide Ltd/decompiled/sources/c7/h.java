package c7;

import org.bouncycastle.asn1.g1;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.v;

/* loaded from: classes5.dex */
public class h extends org.bouncycastle.asn1.n {
    private final v6.a treeDigest;
    private final org.bouncycastle.asn1.l version;

    private h(v vVar) {
        this.version = org.bouncycastle.asn1.l.getInstance(vVar.getObjectAt(0));
        this.treeDigest = v6.a.getInstance(vVar.getObjectAt(1));
    }

    public static final h getInstance(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(v.getInstance(obj));
        }
        return null;
    }

    public v6.a getTreeDigest() {
        return this.treeDigest;
    }

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        org.bouncycastle.asn1.g gVar = new org.bouncycastle.asn1.g();
        gVar.add(this.version);
        gVar.add(this.treeDigest);
        return new g1(gVar);
    }

    public h(v6.a aVar) {
        this.version = new org.bouncycastle.asn1.l(0L);
        this.treeDigest = aVar;
    }
}
