package v6;

import org.bouncycastle.asn1.b0;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.g;
import org.bouncycastle.asn1.g1;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.v;

/* loaded from: classes5.dex */
public class a extends n {
    private o algorithm;
    private f parameters;

    public a(o oVar) {
        this.algorithm = oVar;
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

    public o getAlgorithm() {
        return this.algorithm;
    }

    public f getParameters() {
        return this.parameters;
    }

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        g gVar = new g(2);
        gVar.add(this.algorithm);
        f fVar = this.parameters;
        if (fVar != null) {
            gVar.add(fVar);
        }
        return new g1(gVar);
    }

    public a(o oVar, f fVar) {
        this.algorithm = oVar;
        this.parameters = fVar;
    }

    public static a getInstance(b0 b0Var, boolean z7) {
        return getInstance(v.getInstance(b0Var, z7));
    }

    private a(v vVar) {
        if (vVar.size() >= 1 && vVar.size() <= 2) {
            this.algorithm = o.getInstance(vVar.getObjectAt(0));
            this.parameters = vVar.size() == 2 ? vVar.getObjectAt(1) : null;
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + vVar.size());
        }
    }
}
