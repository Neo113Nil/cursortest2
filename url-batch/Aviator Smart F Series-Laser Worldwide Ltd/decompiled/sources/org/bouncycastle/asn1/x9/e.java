package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.g1;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.v;

/* loaded from: classes5.dex */
public class e extends n implements k {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private org.bouncycastle.math.ec.e curve;
    private i fieldID;

    /* renamed from: g, reason: collision with root package name */
    private g f17113g;

    /* renamed from: h, reason: collision with root package name */
    private BigInteger f17114h;

    /* renamed from: n, reason: collision with root package name */
    private BigInteger f17115n;
    private byte[] seed;

    private e(v vVar) {
        if (!(vVar.getObjectAt(0) instanceof l) || !((l) vVar.getObjectAt(0)).hasValue(1)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        this.f17115n = ((l) vVar.getObjectAt(4)).getValue();
        if (vVar.size() == 6) {
            this.f17114h = ((l) vVar.getObjectAt(5)).getValue();
        }
        d dVar = new d(i.getInstance(vVar.getObjectAt(1)), this.f17115n, this.f17114h, v.getInstance(vVar.getObjectAt(2)));
        this.curve = dVar.getCurve();
        org.bouncycastle.asn1.f objectAt = vVar.getObjectAt(3);
        if (objectAt instanceof g) {
            this.f17113g = (g) objectAt;
        } else {
            this.f17113g = new g(this.curve, (p) objectAt);
        }
        this.seed = dVar.getSeed();
    }

    public static e getInstance(Object obj) {
        if (obj instanceof e) {
            return (e) obj;
        }
        if (obj != null) {
            return new e(v.getInstance(obj));
        }
        return null;
    }

    public g getBaseEntry() {
        return this.f17113g;
    }

    public org.bouncycastle.math.ec.e getCurve() {
        return this.curve;
    }

    public d getCurveEntry() {
        return new d(this.curve, this.seed);
    }

    public i getFieldIDEntry() {
        return this.fieldID;
    }

    public org.bouncycastle.math.ec.i getG() {
        return this.f17113g.getPoint();
    }

    public BigInteger getH() {
        return this.f17114h;
    }

    public BigInteger getN() {
        return this.f17115n;
    }

    public byte[] getSeed() {
        return org.bouncycastle.util.a.clone(this.seed);
    }

    public boolean hasSeed() {
        return this.seed != null;
    }

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        org.bouncycastle.asn1.g gVar = new org.bouncycastle.asn1.g(6);
        gVar.add(new l(ONE));
        gVar.add(this.fieldID);
        gVar.add(new d(this.curve, this.seed));
        gVar.add(this.f17113g);
        gVar.add(new l(this.f17115n));
        BigInteger bigInteger = this.f17114h;
        if (bigInteger != null) {
            gVar.add(new l(bigInteger));
        }
        return new g1(gVar);
    }

    public e(org.bouncycastle.math.ec.e eVar, g gVar, BigInteger bigInteger) {
        this(eVar, gVar, bigInteger, null, null);
    }

    public e(org.bouncycastle.math.ec.e eVar, g gVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eVar, gVar, bigInteger, bigInteger2, null);
    }

    public e(org.bouncycastle.math.ec.e eVar, g gVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        i iVar;
        this.curve = eVar;
        this.f17113g = gVar;
        this.f17115n = bigInteger;
        this.f17114h = bigInteger2;
        this.seed = org.bouncycastle.util.a.clone(bArr);
        if (org.bouncycastle.math.ec.c.isFpCurve(eVar)) {
            iVar = new i(eVar.getField().getCharacteristic());
        } else {
            if (!org.bouncycastle.math.ec.c.isF2mCurve(eVar)) {
                throw new IllegalArgumentException("'curve' is of an unsupported type");
            }
            int[] exponentsPresent = ((org.bouncycastle.math.field.g) eVar.getField()).getMinimalPolynomial().getExponentsPresent();
            if (exponentsPresent.length == 3) {
                iVar = new i(exponentsPresent[2], exponentsPresent[1]);
            } else {
                if (exponentsPresent.length != 5) {
                    throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
                }
                iVar = new i(exponentsPresent[4], exponentsPresent[1], exponentsPresent[2], exponentsPresent[3]);
            }
        }
        this.fieldID = iVar;
    }
}
