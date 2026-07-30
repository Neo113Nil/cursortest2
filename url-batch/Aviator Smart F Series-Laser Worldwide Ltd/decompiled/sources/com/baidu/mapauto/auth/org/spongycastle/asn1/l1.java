package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.util.Enumeration;

/* loaded from: classes2.dex */
public final class l1 extends s {

    /* renamed from: b, reason: collision with root package name */
    public int f7801b;

    public l1() {
        this.f7801b = -1;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        p b8 = pVar.b();
        if (this.f7801b < 0) {
            Enumeration elements = this.f7833a.elements();
            int i8 = 0;
            while (elements.hasMoreElements()) {
                i8 += ((d) elements.nextElement()).c().h().e();
            }
            this.f7801b = i8;
        }
        int i9 = this.f7801b;
        pVar.a(48);
        pVar.b(i9);
        Enumeration elements2 = this.f7833a.elements();
        while (elements2.hasMoreElements()) {
            b8.a((d) elements2.nextElement());
        }
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        if (this.f7801b < 0) {
            Enumeration elements = this.f7833a.elements();
            int i8 = 0;
            while (elements.hasMoreElements()) {
                i8 += ((d) elements.nextElement()).c().h().e();
            }
            this.f7801b = i8;
        }
        int i9 = this.f7801b;
        return u1.a(i9) + 1 + i9;
    }

    public l1(e eVar) {
        super(eVar);
        this.f7801b = -1;
    }
}
