package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.util.Enumeration;

/* loaded from: classes2.dex */
public final class b1 extends u {

    /* renamed from: c, reason: collision with root package name */
    public int f7769c;

    public b1() {
        this.f7769c = -1;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        x0 a8 = pVar.a();
        if (this.f7769c < 0) {
            Enumeration elements = this.f7840a.elements();
            int i8 = 0;
            while (elements.hasMoreElements()) {
                i8 += ((d) elements.nextElement()).c().g().e();
            }
            this.f7769c = i8;
        }
        int i9 = this.f7769c;
        pVar.a(49);
        pVar.b(i9);
        Enumeration elements2 = this.f7840a.elements();
        while (elements2.hasMoreElements()) {
            a8.a((d) elements2.nextElement());
        }
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        if (this.f7769c < 0) {
            Enumeration elements = this.f7840a.elements();
            int i8 = 0;
            while (elements.hasMoreElements()) {
                i8 += ((d) elements.nextElement()).c().g().e();
            }
            this.f7769c = i8;
        }
        int i9 = this.f7769c;
        return u1.a(i9) + 1 + i9;
    }

    public b1(e eVar) {
        super(eVar);
        this.f7769c = -1;
    }
}
