package c7;

import org.bouncycastle.asn1.b0;
import org.bouncycastle.asn1.c1;
import org.bouncycastle.asn1.g1;
import org.bouncycastle.asn1.j1;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.v;

/* loaded from: classes5.dex */
public class k extends org.bouncycastle.asn1.n {
    private final byte[] bdsState;
    private final long index;
    private final long maxIndex;
    private final byte[] publicSeed;
    private final byte[] root;
    private final byte[] secretKeyPRF;
    private final byte[] secretKeySeed;
    private final int version;

    public k(long j8, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.version = 0;
        this.index = j8;
        this.secretKeySeed = org.bouncycastle.util.a.clone(bArr);
        this.secretKeyPRF = org.bouncycastle.util.a.clone(bArr2);
        this.publicSeed = org.bouncycastle.util.a.clone(bArr3);
        this.root = org.bouncycastle.util.a.clone(bArr4);
        this.bdsState = org.bouncycastle.util.a.clone(bArr5);
        this.maxIndex = -1L;
    }

    public static k getInstance(Object obj) {
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj != null) {
            return new k(v.getInstance(obj));
        }
        return null;
    }

    public byte[] getBdsState() {
        return org.bouncycastle.util.a.clone(this.bdsState);
    }

    public long getIndex() {
        return this.index;
    }

    public long getMaxIndex() {
        return this.maxIndex;
    }

    public byte[] getPublicSeed() {
        return org.bouncycastle.util.a.clone(this.publicSeed);
    }

    public byte[] getRoot() {
        return org.bouncycastle.util.a.clone(this.root);
    }

    public byte[] getSecretKeyPRF() {
        return org.bouncycastle.util.a.clone(this.secretKeyPRF);
    }

    public byte[] getSecretKeySeed() {
        return org.bouncycastle.util.a.clone(this.secretKeySeed);
    }

    public int getVersion() {
        return this.version;
    }

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        org.bouncycastle.asn1.g gVar = new org.bouncycastle.asn1.g();
        gVar.add(this.maxIndex >= 0 ? new org.bouncycastle.asn1.l(1L) : new org.bouncycastle.asn1.l(0L));
        org.bouncycastle.asn1.g gVar2 = new org.bouncycastle.asn1.g();
        gVar2.add(new org.bouncycastle.asn1.l(this.index));
        gVar2.add(new c1(this.secretKeySeed));
        gVar2.add(new c1(this.secretKeyPRF));
        gVar2.add(new c1(this.publicSeed));
        gVar2.add(new c1(this.root));
        long j8 = this.maxIndex;
        if (j8 >= 0) {
            gVar2.add(new j1(false, 0, new org.bouncycastle.asn1.l(j8)));
        }
        gVar.add(new g1(gVar2));
        gVar.add(new j1(true, 0, new c1(this.bdsState)));
        return new g1(gVar);
    }

    public k(long j8, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j9) {
        this.version = 1;
        this.index = j8;
        this.secretKeySeed = org.bouncycastle.util.a.clone(bArr);
        this.secretKeyPRF = org.bouncycastle.util.a.clone(bArr2);
        this.publicSeed = org.bouncycastle.util.a.clone(bArr3);
        this.root = org.bouncycastle.util.a.clone(bArr4);
        this.bdsState = org.bouncycastle.util.a.clone(bArr5);
        this.maxIndex = j9;
    }

    private k(v vVar) {
        long j8;
        org.bouncycastle.asn1.l lVar = org.bouncycastle.asn1.l.getInstance(vVar.getObjectAt(0));
        if (!lVar.hasValue(0) && !lVar.hasValue(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.version = lVar.intValueExact();
        if (vVar.size() != 2 && vVar.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        v vVar2 = v.getInstance(vVar.getObjectAt(1));
        this.index = org.bouncycastle.asn1.l.getInstance(vVar2.getObjectAt(0)).longValueExact();
        this.secretKeySeed = org.bouncycastle.util.a.clone(p.getInstance(vVar2.getObjectAt(1)).getOctets());
        this.secretKeyPRF = org.bouncycastle.util.a.clone(p.getInstance(vVar2.getObjectAt(2)).getOctets());
        this.publicSeed = org.bouncycastle.util.a.clone(p.getInstance(vVar2.getObjectAt(3)).getOctets());
        this.root = org.bouncycastle.util.a.clone(p.getInstance(vVar2.getObjectAt(4)).getOctets());
        if (vVar2.size() == 6) {
            b0 b0Var = b0.getInstance(vVar2.getObjectAt(5));
            if (b0Var.getTagNo() != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            j8 = org.bouncycastle.asn1.l.getInstance(b0Var, false).longValueExact();
        } else {
            if (vVar2.size() != 5) {
                throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
            }
            j8 = -1;
        }
        this.maxIndex = j8;
        if (vVar.size() == 3) {
            this.bdsState = org.bouncycastle.util.a.clone(p.getInstance(b0.getInstance(vVar.getObjectAt(2)), true).getOctets());
        } else {
            this.bdsState = null;
        }
    }
}
