package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.c1;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public class h extends n {
    private static j converter = new j();

    /* renamed from: f, reason: collision with root package name */
    protected org.bouncycastle.math.ec.f f17118f;

    public h(int i8, int i9, int i10, int i11, p pVar) {
        this(new f.c(i8, i9, i10, i11, new BigInteger(1, pVar.getOctets())));
    }

    public org.bouncycastle.math.ec.f getValue() {
        return this.f17118f;
    }

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        return new c1(converter.integerToBytes(this.f17118f.toBigInteger(), converter.getByteLength(this.f17118f)));
    }

    public h(BigInteger bigInteger, p pVar) {
        this(new f.d(bigInteger, new BigInteger(1, pVar.getOctets())));
    }

    public h(org.bouncycastle.math.ec.f fVar) {
        this.f17118f = fVar;
    }
}
