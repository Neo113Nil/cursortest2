package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.g1;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.v;

/* loaded from: classes5.dex */
public class i extends n implements k {
    private o id;
    private s parameters;

    public i(int i8, int i9) {
        this(i8, i9, 0, 0);
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

    public o getIdentifier() {
        return this.id;
    }

    public s getParameters() {
        return this.parameters;
    }

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        org.bouncycastle.asn1.g gVar = new org.bouncycastle.asn1.g(2);
        gVar.add(this.id);
        gVar.add(this.parameters);
        return new g1(gVar);
    }

    public i(int i8, int i9, int i10, int i11) {
        this.id = k.characteristic_two_field;
        org.bouncycastle.asn1.g gVar = new org.bouncycastle.asn1.g(3);
        gVar.add(new l(i8));
        if (i10 == 0) {
            if (i11 != 0) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            gVar.add(k.tpBasis);
            gVar.add(new l(i9));
        } else {
            if (i10 <= i9 || i11 <= i10) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            gVar.add(k.ppBasis);
            org.bouncycastle.asn1.g gVar2 = new org.bouncycastle.asn1.g(3);
            gVar2.add(new l(i9));
            gVar2.add(new l(i10));
            gVar2.add(new l(i11));
            gVar.add(new g1(gVar2));
        }
        this.parameters = new g1(gVar);
    }

    public i(BigInteger bigInteger) {
        this.id = k.prime_field;
        this.parameters = new l(bigInteger);
    }

    private i(v vVar) {
        this.id = o.getInstance(vVar.getObjectAt(0));
        this.parameters = vVar.getObjectAt(1).toASN1Primitive();
    }
}
