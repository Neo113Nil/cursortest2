package c7;

import org.bouncycastle.asn1.c1;
import org.bouncycastle.asn1.g1;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.v;

/* loaded from: classes5.dex */
public class g extends org.bouncycastle.asn1.n {
    private byte[][] coeffQuadratic;
    private byte[] coeffScalar;
    private byte[][] coeffSingular;
    private org.bouncycastle.asn1.l docLength;
    private o oid;
    private org.bouncycastle.asn1.l version;

    public g(int i8, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.version = new org.bouncycastle.asn1.l(0L);
        this.docLength = new org.bouncycastle.asn1.l(i8);
        this.coeffQuadratic = org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(sArr);
        this.coeffSingular = org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(sArr2);
        this.coeffScalar = org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(sArr3);
    }

    public static g getInstance(Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj != null) {
            return new g(v.getInstance(obj));
        }
        return null;
    }

    public short[][] getCoeffQuadratic() {
        return org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(this.coeffQuadratic);
    }

    public short[] getCoeffScalar() {
        return org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(this.coeffScalar);
    }

    public short[][] getCoeffSingular() {
        return org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(this.coeffSingular);
    }

    public int getDocLength() {
        return this.docLength.intValueExact();
    }

    public org.bouncycastle.asn1.l getVersion() {
        return this.version;
    }

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        org.bouncycastle.asn1.g gVar = new org.bouncycastle.asn1.g();
        org.bouncycastle.asn1.f fVar = this.version;
        if (fVar == null) {
            fVar = this.oid;
        }
        gVar.add(fVar);
        gVar.add(this.docLength);
        org.bouncycastle.asn1.g gVar2 = new org.bouncycastle.asn1.g();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            byte[][] bArr = this.coeffQuadratic;
            if (i9 >= bArr.length) {
                break;
            }
            gVar2.add(new c1(bArr[i9]));
            i9++;
        }
        gVar.add(new g1(gVar2));
        org.bouncycastle.asn1.g gVar3 = new org.bouncycastle.asn1.g();
        while (true) {
            byte[][] bArr2 = this.coeffSingular;
            if (i8 >= bArr2.length) {
                gVar.add(new g1(gVar3));
                org.bouncycastle.asn1.g gVar4 = new org.bouncycastle.asn1.g();
                gVar4.add(new c1(this.coeffScalar));
                gVar.add(new g1(gVar4));
                return new g1(gVar);
            }
            gVar3.add(new c1(bArr2[i8]));
            i8++;
        }
    }

    private g(v vVar) {
        if (vVar.getObjectAt(0) instanceof org.bouncycastle.asn1.l) {
            this.version = org.bouncycastle.asn1.l.getInstance(vVar.getObjectAt(0));
        } else {
            this.oid = o.getInstance(vVar.getObjectAt(0));
        }
        this.docLength = org.bouncycastle.asn1.l.getInstance(vVar.getObjectAt(1));
        v vVar2 = v.getInstance(vVar.getObjectAt(2));
        this.coeffQuadratic = new byte[vVar2.size()][];
        for (int i8 = 0; i8 < vVar2.size(); i8++) {
            this.coeffQuadratic[i8] = p.getInstance(vVar2.getObjectAt(i8)).getOctets();
        }
        v vVar3 = (v) vVar.getObjectAt(3);
        this.coeffSingular = new byte[vVar3.size()][];
        for (int i9 = 0; i9 < vVar3.size(); i9++) {
            this.coeffSingular[i9] = p.getInstance(vVar3.getObjectAt(i9)).getOctets();
        }
        this.coeffScalar = p.getInstance(((v) vVar.getObjectAt(4)).getObjectAt(0)).getOctets();
    }
}
