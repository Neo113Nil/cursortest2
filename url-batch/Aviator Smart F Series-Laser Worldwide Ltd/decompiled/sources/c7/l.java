package c7;

import org.bouncycastle.asn1.c1;
import org.bouncycastle.asn1.g1;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.v;

/* loaded from: classes5.dex */
public class l extends org.bouncycastle.asn1.n {
    private final byte[] publicSeed;
    private final byte[] root;

    private l(v vVar) {
        if (!org.bouncycastle.asn1.l.getInstance(vVar.getObjectAt(0)).hasValue(0)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.publicSeed = org.bouncycastle.util.a.clone(p.getInstance(vVar.getObjectAt(1)).getOctets());
        this.root = org.bouncycastle.util.a.clone(p.getInstance(vVar.getObjectAt(2)).getOctets());
    }

    public static l getInstance(Object obj) {
        if (obj instanceof l) {
            return (l) obj;
        }
        if (obj != null) {
            return new l(v.getInstance(obj));
        }
        return null;
    }

    public byte[] getPublicSeed() {
        return org.bouncycastle.util.a.clone(this.publicSeed);
    }

    public byte[] getRoot() {
        return org.bouncycastle.util.a.clone(this.root);
    }

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        org.bouncycastle.asn1.g gVar = new org.bouncycastle.asn1.g();
        gVar.add(new org.bouncycastle.asn1.l(0L));
        gVar.add(new c1(this.publicSeed));
        gVar.add(new c1(this.root));
        return new g1(gVar);
    }

    public l(byte[] bArr, byte[] bArr2) {
        this.publicSeed = org.bouncycastle.util.a.clone(bArr);
        this.root = org.bouncycastle.util.a.clone(bArr2);
    }
}
