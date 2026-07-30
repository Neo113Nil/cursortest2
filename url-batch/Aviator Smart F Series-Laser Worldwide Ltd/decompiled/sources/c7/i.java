package c7;

import org.bouncycastle.asn1.g1;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.v;

/* loaded from: classes5.dex */
public class i extends org.bouncycastle.asn1.n {
    private final int height;
    private final v6.a treeDigest;
    private final org.bouncycastle.asn1.l version;

    public i(int i8, v6.a aVar) {
        this.version = new org.bouncycastle.asn1.l(0L);
        this.height = i8;
        this.treeDigest = aVar;
    }

    public static i getInstance(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj != null) {
            return new i(v.getInstance(obj));
        }
        return null;
    }

    public int getHeight() {
        return this.height;
    }

    public v6.a getTreeDigest() {
        return this.treeDigest;
    }

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        org.bouncycastle.asn1.g gVar = new org.bouncycastle.asn1.g();
        gVar.add(this.version);
        gVar.add(new org.bouncycastle.asn1.l(this.height));
        gVar.add(this.treeDigest);
        return new g1(gVar);
    }

    private i(v vVar) {
        this.version = org.bouncycastle.asn1.l.getInstance(vVar.getObjectAt(0));
        this.height = org.bouncycastle.asn1.l.getInstance(vVar.getObjectAt(1)).intValueExact();
        this.treeDigest = v6.a.getInstance(vVar.getObjectAt(2));
    }
}
