package c7;

import org.bouncycastle.asn1.c1;
import org.bouncycastle.asn1.g1;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.v;

/* loaded from: classes5.dex */
public class f extends org.bouncycastle.asn1.n {

    /* renamed from: b1, reason: collision with root package name */
    private byte[] f311b1;

    /* renamed from: b2, reason: collision with root package name */
    private byte[] f312b2;
    private byte[][] invA1;
    private byte[][] invA2;
    private e7.a[] layers;
    private o oid;
    private org.bouncycastle.asn1.l version;
    private byte[] vi;

    private f(v vVar) {
        int i8 = 0;
        if (vVar.getObjectAt(0) instanceof org.bouncycastle.asn1.l) {
            this.version = org.bouncycastle.asn1.l.getInstance(vVar.getObjectAt(0));
        } else {
            this.oid = o.getInstance(vVar.getObjectAt(0));
        }
        v vVar2 = (v) vVar.getObjectAt(1);
        this.invA1 = new byte[vVar2.size()][];
        for (int i9 = 0; i9 < vVar2.size(); i9++) {
            this.invA1[i9] = ((p) vVar2.getObjectAt(i9)).getOctets();
        }
        this.f311b1 = ((p) ((v) vVar.getObjectAt(2)).getObjectAt(0)).getOctets();
        v vVar3 = (v) vVar.getObjectAt(3);
        this.invA2 = new byte[vVar3.size()][];
        for (int i10 = 0; i10 < vVar3.size(); i10++) {
            this.invA2[i10] = ((p) vVar3.getObjectAt(i10)).getOctets();
        }
        this.f312b2 = ((p) ((v) vVar.getObjectAt(4)).getObjectAt(0)).getOctets();
        this.vi = ((p) ((v) vVar.getObjectAt(5)).getObjectAt(0)).getOctets();
        v vVar4 = (v) vVar.getObjectAt(6);
        byte[][][][] bArr = new byte[vVar4.size()][][][];
        byte[][][][] bArr2 = new byte[vVar4.size()][][][];
        byte[][][] bArr3 = new byte[vVar4.size()][][];
        byte[][] bArr4 = new byte[vVar4.size()][];
        int i11 = 0;
        while (i11 < vVar4.size()) {
            v vVar5 = (v) vVar4.getObjectAt(i11);
            v vVar6 = (v) vVar5.getObjectAt(i8);
            bArr[i11] = new byte[vVar6.size()][][];
            for (int i12 = 0; i12 < vVar6.size(); i12++) {
                v vVar7 = (v) vVar6.getObjectAt(i12);
                bArr[i11][i12] = new byte[vVar7.size()][];
                for (int i13 = 0; i13 < vVar7.size(); i13++) {
                    bArr[i11][i12][i13] = ((p) vVar7.getObjectAt(i13)).getOctets();
                }
            }
            v vVar8 = (v) vVar5.getObjectAt(1);
            bArr2[i11] = new byte[vVar8.size()][][];
            for (int i14 = 0; i14 < vVar8.size(); i14++) {
                v vVar9 = (v) vVar8.getObjectAt(i14);
                bArr2[i11][i14] = new byte[vVar9.size()][];
                for (int i15 = 0; i15 < vVar9.size(); i15++) {
                    bArr2[i11][i14][i15] = ((p) vVar9.getObjectAt(i15)).getOctets();
                }
            }
            v vVar10 = (v) vVar5.getObjectAt(2);
            bArr3[i11] = new byte[vVar10.size()][];
            for (int i16 = 0; i16 < vVar10.size(); i16++) {
                bArr3[i11][i16] = ((p) vVar10.getObjectAt(i16)).getOctets();
            }
            bArr4[i11] = ((p) vVar5.getObjectAt(3)).getOctets();
            i11++;
            i8 = 0;
        }
        int length = this.vi.length - 1;
        this.layers = new e7.a[length];
        int i17 = 0;
        while (i17 < length) {
            byte[] bArr5 = this.vi;
            int i18 = i17 + 1;
            this.layers[i17] = new e7.a(bArr5[i17], bArr5[i18], org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(bArr[i17]), org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(bArr2[i17]), org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(bArr3[i17]), org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(bArr4[i17]));
            i17 = i18;
        }
    }

    public static f getInstance(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(v.getInstance(obj));
        }
        return null;
    }

    public short[] getB1() {
        return org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(this.f311b1);
    }

    public short[] getB2() {
        return org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(this.f312b2);
    }

    public short[][] getInvA1() {
        return org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(this.invA1);
    }

    public short[][] getInvA2() {
        return org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(this.invA2);
    }

    public e7.a[] getLayers() {
        return this.layers;
    }

    public org.bouncycastle.asn1.l getVersion() {
        return this.version;
    }

    public int[] getVi() {
        return org.bouncycastle.pqc.crypto.rainbow.util.b.convertArraytoInt(this.vi);
    }

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        org.bouncycastle.asn1.g gVar = new org.bouncycastle.asn1.g();
        org.bouncycastle.asn1.f fVar = this.version;
        if (fVar == null) {
            fVar = this.oid;
        }
        gVar.add(fVar);
        org.bouncycastle.asn1.g gVar2 = new org.bouncycastle.asn1.g();
        int i8 = 0;
        while (true) {
            byte[][] bArr = this.invA1;
            if (i8 >= bArr.length) {
                break;
            }
            gVar2.add(new c1(bArr[i8]));
            i8++;
        }
        gVar.add(new g1(gVar2));
        org.bouncycastle.asn1.g gVar3 = new org.bouncycastle.asn1.g();
        gVar3.add(new c1(this.f311b1));
        gVar.add(new g1(gVar3));
        org.bouncycastle.asn1.g gVar4 = new org.bouncycastle.asn1.g();
        int i9 = 0;
        while (true) {
            byte[][] bArr2 = this.invA2;
            if (i9 >= bArr2.length) {
                break;
            }
            gVar4.add(new c1(bArr2[i9]));
            i9++;
        }
        gVar.add(new g1(gVar4));
        org.bouncycastle.asn1.g gVar5 = new org.bouncycastle.asn1.g();
        gVar5.add(new c1(this.f312b2));
        gVar.add(new g1(gVar5));
        org.bouncycastle.asn1.g gVar6 = new org.bouncycastle.asn1.g();
        gVar6.add(new c1(this.vi));
        gVar.add(new g1(gVar6));
        org.bouncycastle.asn1.g gVar7 = new org.bouncycastle.asn1.g();
        for (int i10 = 0; i10 < this.layers.length; i10++) {
            org.bouncycastle.asn1.g gVar8 = new org.bouncycastle.asn1.g();
            byte[][][] convertArray = org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(this.layers[i10].getCoeffAlpha());
            org.bouncycastle.asn1.g gVar9 = new org.bouncycastle.asn1.g();
            for (byte[][] bArr3 : convertArray) {
                org.bouncycastle.asn1.g gVar10 = new org.bouncycastle.asn1.g();
                int i11 = 0;
                while (true) {
                    if (i11 < bArr3.length) {
                        gVar10.add(new c1(bArr3[i11]));
                        i11++;
                    }
                }
                gVar9.add(new g1(gVar10));
            }
            gVar8.add(new g1(gVar9));
            byte[][][] convertArray2 = org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(this.layers[i10].getCoeffBeta());
            org.bouncycastle.asn1.g gVar11 = new org.bouncycastle.asn1.g();
            for (byte[][] bArr4 : convertArray2) {
                org.bouncycastle.asn1.g gVar12 = new org.bouncycastle.asn1.g();
                int i12 = 0;
                while (true) {
                    if (i12 < bArr4.length) {
                        gVar12.add(new c1(bArr4[i12]));
                        i12++;
                    }
                }
                gVar11.add(new g1(gVar12));
            }
            gVar8.add(new g1(gVar11));
            byte[][] convertArray3 = org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(this.layers[i10].getCoeffGamma());
            org.bouncycastle.asn1.g gVar13 = new org.bouncycastle.asn1.g();
            for (byte[] bArr5 : convertArray3) {
                gVar13.add(new c1(bArr5));
            }
            gVar8.add(new g1(gVar13));
            gVar8.add(new c1(org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(this.layers[i10].getCoeffEta())));
            gVar7.add(new g1(gVar8));
        }
        gVar.add(new g1(gVar7));
        return new g1(gVar);
    }

    public f(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, e7.a[] aVarArr) {
        this.version = new org.bouncycastle.asn1.l(1L);
        this.invA1 = org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(sArr);
        this.f311b1 = org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(sArr2);
        this.invA2 = org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(sArr3);
        this.f312b2 = org.bouncycastle.pqc.crypto.rainbow.util.b.convertArray(sArr4);
        this.vi = org.bouncycastle.pqc.crypto.rainbow.util.b.convertIntArray(iArr);
        this.layers = aVarArr;
    }
}
