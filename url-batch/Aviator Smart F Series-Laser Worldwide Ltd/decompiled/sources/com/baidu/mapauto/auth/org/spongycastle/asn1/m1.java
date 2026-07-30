package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.util.Enumeration;

/* loaded from: classes2.dex */
public final class m1 extends u {

    /* renamed from: c, reason: collision with root package name */
    public int f7807c;

    public m1() {
        this.f7807c = -1;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        p b8 = pVar.b();
        if (this.f7807c < 0) {
            Enumeration elements = this.f7840a.elements();
            int i8 = 0;
            while (elements.hasMoreElements()) {
                i8 += ((d) elements.nextElement()).c().h().e();
            }
            this.f7807c = i8;
        }
        int i9 = this.f7807c;
        pVar.a(49);
        pVar.b(i9);
        Enumeration elements2 = this.f7840a.elements();
        while (elements2.hasMoreElements()) {
            b8.a((d) elements2.nextElement());
        }
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        if (this.f7807c < 0) {
            Enumeration elements = this.f7840a.elements();
            int i8 = 0;
            while (elements.hasMoreElements()) {
                i8 += ((d) elements.nextElement()).c().h().e();
            }
            this.f7807c = i8;
        }
        int i9 = this.f7807c;
        return u1.a(i9) + 1 + i9;
    }

    public m1(e eVar) {
        super(eVar);
        this.f7807c = -1;
    }
}
