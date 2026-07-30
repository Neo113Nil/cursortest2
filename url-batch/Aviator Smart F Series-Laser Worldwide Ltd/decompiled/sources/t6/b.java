package t6;

import java.util.Enumeration;
import org.bouncycastle.asn1.b0;
import org.bouncycastle.asn1.c;
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
import org.bouncycastle.asn1.x;

/* loaded from: classes5.dex */
public class b extends n {
    private x attributes;
    private p privateKey;
    private v6.a privateKeyAlgorithm;
    private c publicKey;
    private l version;

    private b(v vVar) {
        Enumeration objects = vVar.getObjects();
        l lVar = l.getInstance(objects.nextElement());
        this.version = lVar;
        int versionValue = getVersionValue(lVar);
        this.privateKeyAlgorithm = v6.a.getInstance(objects.nextElement());
        this.privateKey = p.getInstance(objects.nextElement());
        int i8 = -1;
        while (objects.hasMoreElements()) {
            b0 b0Var = (b0) objects.nextElement();
            int tagNo = b0Var.getTagNo();
            if (tagNo <= i8) {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
            if (tagNo == 0) {
                this.attributes = x.getInstance(b0Var, false);
            } else {
                if (tagNo != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                }
                if (versionValue < 1) {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                this.publicKey = t0.getInstance(b0Var, false);
            }
            i8 = tagNo;
        }
    }

    public static b getInstance(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(v.getInstance(obj));
        }
        return null;
    }

    private static int getVersionValue(l lVar) {
        int intValueExact = lVar.intValueExact();
        if (intValueExact < 0 || intValueExact > 1) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        return intValueExact;
    }

    public x getAttributes() {
        return this.attributes;
    }

    public p getPrivateKey() {
        return new c1(this.privateKey.getOctets());
    }

    public v6.a getPrivateKeyAlgorithm() {
        return this.privateKeyAlgorithm;
    }

    public c getPublicKeyData() {
        return this.publicKey;
    }

    public l getVersion() {
        return this.version;
    }

    public boolean hasPublicKey() {
        return this.publicKey != null;
    }

    public f parsePrivateKey() {
        return s.fromByteArray(this.privateKey.getOctets());
    }

    public f parsePublicKey() {
        c cVar = this.publicKey;
        if (cVar == null) {
            return null;
        }
        return s.fromByteArray(cVar.getOctets());
    }

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        g gVar = new g(5);
        gVar.add(this.version);
        gVar.add(this.privateKeyAlgorithm);
        gVar.add(this.privateKey);
        x xVar = this.attributes;
        if (xVar != null) {
            gVar.add(new j1(false, 0, xVar));
        }
        c cVar = this.publicKey;
        if (cVar != null) {
            gVar.add(new j1(false, 1, cVar));
        }
        return new g1(gVar);
    }

    public b(v6.a aVar, f fVar) {
        this(aVar, fVar, null, null);
    }

    public static b getInstance(b0 b0Var, boolean z7) {
        return getInstance(v.getInstance(b0Var, z7));
    }

    public b(v6.a aVar, f fVar, x xVar) {
        this(aVar, fVar, xVar, null);
    }

    public b(v6.a aVar, f fVar, x xVar, byte[] bArr) {
        this.version = new l(bArr != null ? org.bouncycastle.util.b.ONE : org.bouncycastle.util.b.ZERO);
        this.privateKeyAlgorithm = aVar;
        this.privateKey = new c1(fVar);
        this.attributes = xVar;
        this.publicKey = bArr == null ? null : new t0(bArr);
    }
}
