package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.c1;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;

/* loaded from: classes5.dex */
public class g extends n {

    /* renamed from: c, reason: collision with root package name */
    private org.bouncycastle.math.ec.e f17116c;
    private final p encoding;

    /* renamed from: p, reason: collision with root package name */
    private org.bouncycastle.math.ec.i f17117p;

    public g(org.bouncycastle.math.ec.e eVar, p pVar) {
        this(eVar, pVar.getOctets());
    }

    public synchronized org.bouncycastle.math.ec.i getPoint() {
        try {
            if (this.f17117p == null) {
                this.f17117p = this.f17116c.decodePoint(this.encoding.getOctets()).normalize();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f17117p;
    }

    public byte[] getPointEncoding() {
        return org.bouncycastle.util.a.clone(this.encoding.getOctets());
    }

    public boolean isPointCompressed() {
        byte[] octets = this.encoding.getOctets();
        if (octets == null || octets.length <= 0) {
            return false;
        }
        byte b8 = octets[0];
        return b8 == 2 || b8 == 3;
    }

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        return this.encoding;
    }

    public g(org.bouncycastle.math.ec.e eVar, byte[] bArr) {
        this.f17116c = eVar;
        this.encoding = new c1(org.bouncycastle.util.a.clone(bArr));
    }

    public g(org.bouncycastle.math.ec.i iVar, boolean z7) {
        this.f17117p = iVar.normalize();
        this.encoding = new c1(iVar.getEncoded(z7));
    }
}
