package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.b0;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.s;

/* loaded from: classes5.dex */
public class c extends n implements org.bouncycastle.asn1.e {
    private s params;

    public c(m mVar) {
        this.params = mVar;
    }

    public static c getInstance(Object obj) {
        if (obj == null || (obj instanceof c)) {
            return (c) obj;
        }
        if (obj instanceof s) {
            return new c((s) obj);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
        try {
            return new c(s.fromByteArray((byte[]) obj));
        } catch (Exception e8) {
            throw new IllegalArgumentException("unable to parse encoded data: " + e8.getMessage());
        }
    }

    public s getParameters() {
        return this.params;
    }

    public boolean isImplicitlyCA() {
        return this.params instanceof m;
    }

    public boolean isNamedCurve() {
        return this.params instanceof o;
    }

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        return this.params;
    }

    public c(o oVar) {
        this.params = oVar;
    }

    public static c getInstance(b0 b0Var, boolean z7) {
        return getInstance(b0Var.getObject());
    }

    private c(s sVar) {
        this.params = sVar;
    }

    public c(e eVar) {
        this.params = null;
        this.params = eVar.toASN1Primitive();
    }
}
