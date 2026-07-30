package c7;

import org.bouncycastle.asn1.c1;
import org.bouncycastle.asn1.g1;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.v;

/* loaded from: classes5.dex */
public class b extends org.bouncycastle.asn1.n {
    private final v6.a digest;

    /* renamed from: g, reason: collision with root package name */
    private final org.bouncycastle.pqc.math.linearalgebra.c f303g;

    /* renamed from: n, reason: collision with root package name */
    private final int f304n;

    /* renamed from: t, reason: collision with root package name */
    private final int f305t;

    public b(int i8, int i9, org.bouncycastle.pqc.math.linearalgebra.c cVar, v6.a aVar) {
        this.f304n = i8;
        this.f305t = i9;
        this.f303g = new org.bouncycastle.pqc.math.linearalgebra.c(cVar.getEncoded());
        this.digest = aVar;
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

    public v6.a getDigest() {
        return this.digest;
    }

    public org.bouncycastle.pqc.math.linearalgebra.c getG() {
        return this.f303g;
    }

    public int getN() {
        return this.f304n;
    }

    public int getT() {
        return this.f305t;
    }

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        org.bouncycastle.asn1.g gVar = new org.bouncycastle.asn1.g();
        gVar.add(new org.bouncycastle.asn1.l(this.f304n));
        gVar.add(new org.bouncycastle.asn1.l(this.f305t));
        gVar.add(new c1(this.f303g.getEncoded()));
        gVar.add(this.digest);
        return new g1(gVar);
    }

    private b(v vVar) {
        this.f304n = ((org.bouncycastle.asn1.l) vVar.getObjectAt(0)).intValueExact();
        this.f305t = ((org.bouncycastle.asn1.l) vVar.getObjectAt(1)).intValueExact();
        this.f303g = new org.bouncycastle.pqc.math.linearalgebra.c(((p) vVar.getObjectAt(2)).getOctets());
        this.digest = v6.a.getInstance(vVar.getObjectAt(3));
    }
}
