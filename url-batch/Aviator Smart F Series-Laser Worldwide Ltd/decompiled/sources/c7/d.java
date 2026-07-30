package c7;

import org.bouncycastle.asn1.c1;
import org.bouncycastle.asn1.g1;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.v;

/* loaded from: classes5.dex */
public class d extends org.bouncycastle.asn1.n {

    /* renamed from: g, reason: collision with root package name */
    private final org.bouncycastle.pqc.math.linearalgebra.c f308g;

    /* renamed from: n, reason: collision with root package name */
    private final int f309n;

    /* renamed from: t, reason: collision with root package name */
    private final int f310t;

    public d(int i8, int i9, org.bouncycastle.pqc.math.linearalgebra.c cVar) {
        this.f309n = i8;
        this.f310t = i9;
        this.f308g = new org.bouncycastle.pqc.math.linearalgebra.c(cVar);
    }

    public static d getInstance(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj != null) {
            return new d(v.getInstance(obj));
        }
        return null;
    }

    public org.bouncycastle.pqc.math.linearalgebra.c getG() {
        return new org.bouncycastle.pqc.math.linearalgebra.c(this.f308g);
    }

    public int getN() {
        return this.f309n;
    }

    public int getT() {
        return this.f310t;
    }

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        org.bouncycastle.asn1.g gVar = new org.bouncycastle.asn1.g();
        gVar.add(new org.bouncycastle.asn1.l(this.f309n));
        gVar.add(new org.bouncycastle.asn1.l(this.f310t));
        gVar.add(new c1(this.f308g.getEncoded()));
        return new g1(gVar);
    }

    private d(v vVar) {
        this.f309n = ((org.bouncycastle.asn1.l) vVar.getObjectAt(0)).intValueExact();
        this.f310t = ((org.bouncycastle.asn1.l) vVar.getObjectAt(1)).intValueExact();
        this.f308g = new org.bouncycastle.pqc.math.linearalgebra.c(((p) vVar.getObjectAt(2)).getOctets());
    }
}
