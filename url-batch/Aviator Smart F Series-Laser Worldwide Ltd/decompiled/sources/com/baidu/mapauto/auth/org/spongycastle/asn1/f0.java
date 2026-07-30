package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.util.Enumeration;

/* loaded from: classes2.dex */
public final class f0 extends u {
    public f0() {
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        pVar.a(49);
        pVar.a(128);
        Enumeration elements = this.f7840a.elements();
        while (elements.hasMoreElements()) {
            pVar.a((d) elements.nextElement());
        }
        pVar.a(0);
        pVar.a(0);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        Enumeration elements = this.f7840a.elements();
        int i8 = 0;
        while (elements.hasMoreElements()) {
            i8 += ((d) elements.nextElement()).c().e();
        }
        return i8 + 4;
    }

    public f0(e eVar) {
        super(eVar);
    }
}
