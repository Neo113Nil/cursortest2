package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.g1;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.t0;
import org.bouncycastle.asn1.v;
import org.bouncycastle.math.ec.e;

/* loaded from: classes5.dex */
public class d extends n implements k {
    private org.bouncycastle.math.ec.e curve;
    private o fieldIdentifier;
    private byte[] seed;

    public d(i iVar, BigInteger bigInteger, BigInteger bigInteger2, v vVar) {
        int intValueExact;
        int i8;
        int i9;
        org.bouncycastle.math.ec.e c0394e;
        this.fieldIdentifier = null;
        o identifier = iVar.getIdentifier();
        this.fieldIdentifier = identifier;
        if (identifier.equals((s) k.prime_field)) {
            c0394e = new e.f(((l) iVar.getParameters()).getValue(), new BigInteger(1, p.getInstance(vVar.getObjectAt(0)).getOctets()), new BigInteger(1, p.getInstance(vVar.getObjectAt(1)).getOctets()), bigInteger, bigInteger2);
        } else {
            if (!this.fieldIdentifier.equals((s) k.characteristic_two_field)) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            v vVar2 = v.getInstance(iVar.getParameters());
            int intValueExact2 = ((l) vVar2.getObjectAt(0)).intValueExact();
            o oVar = (o) vVar2.getObjectAt(1);
            if (oVar.equals((s) k.tpBasis)) {
                i8 = l.getInstance(vVar2.getObjectAt(2)).intValueExact();
                i9 = 0;
                intValueExact = 0;
            } else {
                if (!oVar.equals((s) k.ppBasis)) {
                    throw new IllegalArgumentException("This type of EC basis is not implemented");
                }
                v vVar3 = v.getInstance(vVar2.getObjectAt(2));
                int intValueExact3 = l.getInstance(vVar3.getObjectAt(0)).intValueExact();
                int intValueExact4 = l.getInstance(vVar3.getObjectAt(1)).intValueExact();
                intValueExact = l.getInstance(vVar3.getObjectAt(2)).intValueExact();
                i8 = intValueExact3;
                i9 = intValueExact4;
            }
            c0394e = new e.C0394e(intValueExact2, i8, i9, intValueExact, new BigInteger(1, p.getInstance(vVar.getObjectAt(0)).getOctets()), new BigInteger(1, p.getInstance(vVar.getObjectAt(1)).getOctets()), bigInteger, bigInteger2);
        }
        this.curve = c0394e;
        if (vVar.size() == 3) {
            this.seed = ((t0) vVar.getObjectAt(2)).getBytes();
        }
    }

    private void setFieldIdentifier() {
        o oVar;
        if (org.bouncycastle.math.ec.c.isFpCurve(this.curve)) {
            oVar = k.prime_field;
        } else {
            if (!org.bouncycastle.math.ec.c.isF2mCurve(this.curve)) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            oVar = k.characteristic_two_field;
        }
        this.fieldIdentifier = oVar;
    }

    public org.bouncycastle.math.ec.e getCurve() {
        return this.curve;
    }

    public byte[] getSeed() {
        return org.bouncycastle.util.a.clone(this.seed);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0061  */
    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s toASN1Primitive() {
        h hVar;
        org.bouncycastle.asn1.g gVar = new org.bouncycastle.asn1.g(3);
        if (!this.fieldIdentifier.equals((s) k.prime_field)) {
            if (this.fieldIdentifier.equals((s) k.characteristic_two_field)) {
                gVar.add(new h(this.curve.getA()).toASN1Primitive());
                hVar = new h(this.curve.getB());
            }
            if (this.seed != null) {
                gVar.add(new t0(this.seed));
            }
            return new g1(gVar);
        }
        gVar.add(new h(this.curve.getA()).toASN1Primitive());
        hVar = new h(this.curve.getB());
        gVar.add(hVar.toASN1Primitive());
        if (this.seed != null) {
        }
        return new g1(gVar);
    }

    public d(org.bouncycastle.math.ec.e eVar) {
        this(eVar, null);
    }

    public d(org.bouncycastle.math.ec.e eVar, byte[] bArr) {
        this.fieldIdentifier = null;
        this.curve = eVar;
        this.seed = org.bouncycastle.util.a.clone(bArr);
        setFieldIdentifier();
    }
}
