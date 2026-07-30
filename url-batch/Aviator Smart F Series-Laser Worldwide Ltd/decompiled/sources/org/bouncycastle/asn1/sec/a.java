package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.b0;
import org.bouncycastle.asn1.c1;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.g;
import org.bouncycastle.asn1.g1;
import org.bouncycastle.asn1.j1;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.t0;
import org.bouncycastle.asn1.v;

/* loaded from: classes5.dex */
public class a extends n {
    private v seq;

    public a(int i8, BigInteger bigInteger) {
        byte[] asUnsignedByteArray = org.bouncycastle.util.b.asUnsignedByteArray((i8 + 7) / 8, bigInteger);
        g gVar = new g(2);
        gVar.add(new l(1L));
        gVar.add(new c1(asUnsignedByteArray));
        this.seq = new g1(gVar);
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

    private s getObjectInTag(int i8) {
        Enumeration objects = this.seq.getObjects();
        while (objects.hasMoreElements()) {
            f fVar = (f) objects.nextElement();
            if (fVar instanceof b0) {
                b0 b0Var = (b0) fVar;
                if (b0Var.getTagNo() == i8) {
                    return b0Var.getObject().toASN1Primitive();
                }
            }
        }
        return null;
    }

    public BigInteger getKey() {
        return new BigInteger(1, ((p) this.seq.getObjectAt(1)).getOctets());
    }

    public s getParameters() {
        return getObjectInTag(0);
    }

    public t0 getPublicKey() {
        return (t0) getObjectInTag(1);
    }

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        return this.seq;
    }

    public a(int i8, BigInteger bigInteger, f fVar) {
        this(i8, bigInteger, null, fVar);
    }

    public a(int i8, BigInteger bigInteger, t0 t0Var, f fVar) {
        byte[] asUnsignedByteArray = org.bouncycastle.util.b.asUnsignedByteArray((i8 + 7) / 8, bigInteger);
        g gVar = new g(4);
        gVar.add(new l(1L));
        gVar.add(new c1(asUnsignedByteArray));
        if (fVar != null) {
            gVar.add(new j1(true, 0, fVar));
        }
        if (t0Var != null) {
            gVar.add(new j1(true, 1, t0Var));
        }
        this.seq = new g1(gVar);
    }

    public a(BigInteger bigInteger) {
        this(bigInteger.bitLength(), bigInteger);
    }

    public a(BigInteger bigInteger, f fVar) {
        this(bigInteger, (t0) null, fVar);
    }

    public a(BigInteger bigInteger, t0 t0Var, f fVar) {
        this(bigInteger.bitLength(), bigInteger, t0Var, fVar);
    }

    private a(v vVar) {
        this.seq = vVar;
    }
}
