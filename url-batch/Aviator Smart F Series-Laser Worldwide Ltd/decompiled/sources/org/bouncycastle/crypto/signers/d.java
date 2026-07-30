package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.digests.n;
import org.bouncycastle.crypto.h;
import org.bouncycastle.crypto.params.f;
import org.bouncycastle.crypto.params.j;
import org.bouncycastle.crypto.params.k;
import org.bouncycastle.crypto.params.l;
import org.bouncycastle.crypto.params.m;
import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public class d implements h, org.bouncycastle.math.ec.d {
    private final org.bouncycastle.crypto.e digest;
    private org.bouncycastle.crypto.params.h ecKey;
    private f ecParams;
    private final a encoding;
    private final b kCalculator;
    private i pubPoint;

    /* renamed from: z, reason: collision with root package name */
    private byte[] f17133z;

    public d() {
        this(e.INSTANCE, new n());
    }

    private void addFieldElement(org.bouncycastle.crypto.e eVar, org.bouncycastle.math.ec.f fVar) {
        byte[] encoded = fVar.getEncoded();
        eVar.update(encoded, 0, encoded.length);
    }

    private void addUserID(org.bouncycastle.crypto.e eVar, byte[] bArr) {
        int length = bArr.length * 8;
        eVar.update((byte) ((length >> 8) & 255));
        eVar.update((byte) (length & 255));
        eVar.update(bArr, 0, bArr.length);
    }

    private byte[] digestDoFinal() {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        reset();
        return bArr;
    }

    private byte[] getZ(byte[] bArr) {
        this.digest.reset();
        addUserID(this.digest, bArr);
        addFieldElement(this.digest, this.ecParams.getCurve().getA());
        addFieldElement(this.digest, this.ecParams.getCurve().getB());
        addFieldElement(this.digest, this.ecParams.getG().getAffineXCoord());
        addFieldElement(this.digest, this.ecParams.getG().getAffineYCoord());
        addFieldElement(this.digest, this.pubPoint.getAffineXCoord());
        addFieldElement(this.digest, this.pubPoint.getAffineYCoord());
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        return bArr2;
    }

    private boolean verifySignature(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger n8 = this.ecParams.getN();
        BigInteger bigInteger3 = org.bouncycastle.math.ec.d.ONE;
        if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(n8) >= 0 || bigInteger2.compareTo(bigInteger3) < 0 || bigInteger2.compareTo(n8) >= 0) {
            return false;
        }
        BigInteger calculateE = calculateE(n8, digestDoFinal());
        BigInteger mod = bigInteger.add(bigInteger2).mod(n8);
        if (mod.equals(org.bouncycastle.math.ec.d.ZERO)) {
            return false;
        }
        i normalize = org.bouncycastle.math.ec.c.sumOfTwoMultiplies(this.ecParams.getG(), bigInteger2, ((k) this.ecKey).getQ(), mod).normalize();
        if (normalize.isInfinity()) {
            return false;
        }
        return calculateE.add(normalize.getAffineXCoord().toBigInteger()).mod(n8).equals(bigInteger);
    }

    protected BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    protected org.bouncycastle.math.ec.h createBasePointMultiplier() {
        return new org.bouncycastle.math.ec.k();
    }

    @Override // org.bouncycastle.crypto.h
    public byte[] generateSignature() {
        byte[] digestDoFinal = digestDoFinal();
        BigInteger n8 = this.ecParams.getN();
        BigInteger calculateE = calculateE(n8, digestDoFinal);
        BigInteger d8 = ((j) this.ecKey).getD();
        org.bouncycastle.math.ec.h createBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            BigInteger nextK = this.kCalculator.nextK();
            BigInteger mod = calculateE.add(createBasePointMultiplier.multiply(this.ecParams.getG(), nextK).normalize().getAffineXCoord().toBigInteger()).mod(n8);
            BigInteger bigInteger = org.bouncycastle.math.ec.d.ZERO;
            if (!mod.equals(bigInteger) && !mod.add(nextK).equals(n8)) {
                BigInteger mod2 = org.bouncycastle.util.b.modOddInverse(n8, d8.add(org.bouncycastle.math.ec.d.ONE)).multiply(nextK.subtract(mod.multiply(d8)).mod(n8)).mod(n8);
                if (!mod2.equals(bigInteger)) {
                    try {
                        return this.encoding.encode(this.ecParams.getN(), mod, mod2);
                    } catch (Exception e8) {
                        throw new CryptoException("unable to encode signature: " + e8.getMessage(), e8);
                    }
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.h
    public void init(boolean z7, org.bouncycastle.crypto.c cVar) {
        byte[] decodeStrict;
        i q8;
        if (cVar instanceof l) {
            l lVar = (l) cVar;
            org.bouncycastle.crypto.c parameters = lVar.getParameters();
            byte[] id = lVar.getID();
            if (id.length >= 8192) {
                throw new IllegalArgumentException("SM2 user ID must be less than 2^16 bits long");
            }
            decodeStrict = id;
            cVar = parameters;
        } else {
            decodeStrict = org.bouncycastle.util.encoders.d.decodeStrict("31323334353637383132333435363738");
        }
        if (z7) {
            if (cVar instanceof m) {
                m mVar = (m) cVar;
                org.bouncycastle.crypto.params.h hVar = (org.bouncycastle.crypto.params.h) mVar.getParameters();
                this.ecKey = hVar;
                f parameters2 = hVar.getParameters();
                this.ecParams = parameters2;
                this.kCalculator.init(parameters2.getN(), mVar.getRandom());
            } else {
                org.bouncycastle.crypto.params.h hVar2 = (org.bouncycastle.crypto.params.h) cVar;
                this.ecKey = hVar2;
                f parameters3 = hVar2.getParameters();
                this.ecParams = parameters3;
                this.kCalculator.init(parameters3.getN(), org.bouncycastle.crypto.d.getSecureRandom());
            }
            q8 = createBasePointMultiplier().multiply(this.ecParams.getG(), ((j) this.ecKey).getD()).normalize();
        } else {
            org.bouncycastle.crypto.params.h hVar3 = (org.bouncycastle.crypto.params.h) cVar;
            this.ecKey = hVar3;
            this.ecParams = hVar3.getParameters();
            q8 = ((k) this.ecKey).getQ();
        }
        this.pubPoint = q8;
        byte[] z8 = getZ(decodeStrict);
        this.f17133z = z8;
        this.digest.update(z8, 0, z8.length);
    }

    @Override // org.bouncycastle.crypto.h
    public void reset() {
        this.digest.reset();
        byte[] bArr = this.f17133z;
        if (bArr != null) {
            this.digest.update(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.h
    public void update(byte b8) {
        this.digest.update(b8);
    }

    public d(org.bouncycastle.crypto.e eVar) {
        this(e.INSTANCE, eVar);
    }

    @Override // org.bouncycastle.crypto.h
    public void update(byte[] bArr, int i8, int i9) {
        this.digest.update(bArr, i8, i9);
    }

    @Override // org.bouncycastle.crypto.h
    public boolean verifySignature(byte[] bArr) {
        try {
            BigInteger[] decode = this.encoding.decode(this.ecParams.getN(), bArr);
            return verifySignature(decode[0], decode[1]);
        } catch (Exception unused) {
            return false;
        }
    }

    public d(a aVar) {
        this.kCalculator = new c();
        this.encoding = aVar;
        this.digest = new n();
    }

    public d(a aVar, org.bouncycastle.crypto.e eVar) {
        this.kCalculator = new c();
        this.encoding = aVar;
        this.digest = eVar;
    }
}
