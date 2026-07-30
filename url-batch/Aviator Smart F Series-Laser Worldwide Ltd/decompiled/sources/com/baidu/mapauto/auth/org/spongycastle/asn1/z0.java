package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.util.Enumeration;

/* loaded from: classes2.dex */
public final class z0 extends s {

    /* renamed from: b, reason: collision with root package name */
    public int f7859b;

    public z0() {
        this.f7859b = -1;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        x0 a8 = pVar.a();
        int j8 = j();
        pVar.a(48);
        pVar.b(j8);
        Enumeration elements = this.f7833a.elements();
        while (elements.hasMoreElements()) {
            a8.a((d) elements.nextElement());
        }
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        int j8 = j();
        return u1.a(j8) + 1 + j8;
    }

    public final int j() {
        if (this.f7859b < 0) {
            Enumeration elements = this.f7833a.elements();
            int i8 = 0;
            while (elements.hasMoreElements()) {
                i8 += ((d) elements.nextElement()).c().g().e();
            }
            this.f7859b = i8;
        }
        return this.f7859b;
    }

    public z0(e eVar) {
        super(eVar);
        this.f7859b = -1;
    }
}
