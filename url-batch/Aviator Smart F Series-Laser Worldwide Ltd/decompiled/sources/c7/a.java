package c7;

import org.bouncycastle.asn1.c1;
import org.bouncycastle.asn1.g1;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.v;

/* loaded from: classes5.dex */
public class a extends org.bouncycastle.asn1.n {
    private v6.a digest;
    private byte[] encField;
    private byte[] encGp;
    private byte[] encP;

    /* renamed from: k, reason: collision with root package name */
    private int f301k;

    /* renamed from: n, reason: collision with root package name */
    private int f302n;

    public a(int i8, int i9, org.bouncycastle.pqc.math.linearalgebra.e eVar, org.bouncycastle.pqc.math.linearalgebra.m mVar, org.bouncycastle.pqc.math.linearalgebra.l lVar, v6.a aVar) {
        this.f302n = i8;
        this.f301k = i9;
        this.encField = eVar.getEncoded();
        this.encGp = mVar.getEncoded();
        this.encP = lVar.getEncoded();
        this.digest = aVar;
    }

    public static a getInstance(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(v.getInstance(obj));
        }
        return null;
    }

    public v6.a getDigest() {
        return this.digest;
    }

    public org.bouncycastle.pqc.math.linearalgebra.e getField() {
        return new org.bouncycastle.pqc.math.linearalgebra.e(this.encField);
    }

    public org.bouncycastle.pqc.math.linearalgebra.m getGoppaPoly() {
        return new org.bouncycastle.pqc.math.linearalgebra.m(getField(), this.encGp);
    }

    public int getK() {
        return this.f301k;
    }

    public int getN() {
        return this.f302n;
    }

    public org.bouncycastle.pqc.math.linearalgebra.l getP() {
        return new org.bouncycastle.pqc.math.linearalgebra.l(this.encP);
    }

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        org.bouncycastle.asn1.g gVar = new org.bouncycastle.asn1.g();
        gVar.add(new org.bouncycastle.asn1.l(this.f302n));
        gVar.add(new org.bouncycastle.asn1.l(this.f301k));
        gVar.add(new c1(this.encField));
        gVar.add(new c1(this.encGp));
        gVar.add(new c1(this.encP));
        gVar.add(this.digest);
        return new g1(gVar);
    }

    private a(v vVar) {
        this.f302n = ((org.bouncycastle.asn1.l) vVar.getObjectAt(0)).intValueExact();
        this.f301k = ((org.bouncycastle.asn1.l) vVar.getObjectAt(1)).intValueExact();
        this.encField = ((p) vVar.getObjectAt(2)).getOctets();
        this.encGp = ((p) vVar.getObjectAt(3)).getOctets();
        this.encP = ((p) vVar.getObjectAt(4)).getOctets();
        this.digest = v6.a.getInstance(vVar.getObjectAt(5));
    }
}
