package c7;

import org.bouncycastle.asn1.c1;
import org.bouncycastle.asn1.g1;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.v;

/* loaded from: classes5.dex */
public class c extends org.bouncycastle.asn1.n {
    private byte[] encField;
    private byte[] encGp;
    private byte[] encP1;
    private byte[] encP2;
    private byte[] encSInv;

    /* renamed from: k, reason: collision with root package name */
    private int f306k;

    /* renamed from: n, reason: collision with root package name */
    private int f307n;

    public c(int i8, int i9, org.bouncycastle.pqc.math.linearalgebra.e eVar, org.bouncycastle.pqc.math.linearalgebra.m mVar, org.bouncycastle.pqc.math.linearalgebra.l lVar, org.bouncycastle.pqc.math.linearalgebra.l lVar2, org.bouncycastle.pqc.math.linearalgebra.c cVar) {
        this.f307n = i8;
        this.f306k = i9;
        this.encField = eVar.getEncoded();
        this.encGp = mVar.getEncoded();
        this.encSInv = cVar.getEncoded();
        this.encP1 = lVar.getEncoded();
        this.encP2 = lVar2.getEncoded();
    }

    public static c getInstance(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(v.getInstance(obj));
        }
        return null;
    }

    public org.bouncycastle.pqc.math.linearalgebra.e getField() {
        return new org.bouncycastle.pqc.math.linearalgebra.e(this.encField);
    }

    public org.bouncycastle.pqc.math.linearalgebra.m getGoppaPoly() {
        return new org.bouncycastle.pqc.math.linearalgebra.m(getField(), this.encGp);
    }

    public int getK() {
        return this.f306k;
    }

    public int getN() {
        return this.f307n;
    }

    public org.bouncycastle.pqc.math.linearalgebra.l getP1() {
        return new org.bouncycastle.pqc.math.linearalgebra.l(this.encP1);
    }

    public org.bouncycastle.pqc.math.linearalgebra.l getP2() {
        return new org.bouncycastle.pqc.math.linearalgebra.l(this.encP2);
    }

    public org.bouncycastle.pqc.math.linearalgebra.c getSInv() {
        return new org.bouncycastle.pqc.math.linearalgebra.c(this.encSInv);
    }

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        org.bouncycastle.asn1.g gVar = new org.bouncycastle.asn1.g();
        gVar.add(new org.bouncycastle.asn1.l(this.f307n));
        gVar.add(new org.bouncycastle.asn1.l(this.f306k));
        gVar.add(new c1(this.encField));
        gVar.add(new c1(this.encGp));
        gVar.add(new c1(this.encP1));
        gVar.add(new c1(this.encP2));
        gVar.add(new c1(this.encSInv));
        return new g1(gVar);
    }

    private c(v vVar) {
        this.f307n = ((org.bouncycastle.asn1.l) vVar.getObjectAt(0)).intValueExact();
        this.f306k = ((org.bouncycastle.asn1.l) vVar.getObjectAt(1)).intValueExact();
        this.encField = ((p) vVar.getObjectAt(2)).getOctets();
        this.encGp = ((p) vVar.getObjectAt(3)).getOctets();
        this.encP1 = ((p) vVar.getObjectAt(4)).getOctets();
        this.encP2 = ((p) vVar.getObjectAt(5)).getOctets();
        this.encSInv = ((p) vVar.getObjectAt(6)).getOctets();
    }
}
