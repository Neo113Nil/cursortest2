package com.baidu.mapauto.auth.org.spongycastle.asn1;

import com.baidu.location.BDLocation;
import java.util.Enumeration;

/* loaded from: classes2.dex */
public final class h0 extends w {
    public h0(boolean z7, int i8, d dVar) {
        super(z7, i8, dVar);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        Enumeration elements;
        pVar.a(BDLocation.TypeCoarseLocation, this.f7847a);
        pVar.a(128);
        if (this.f7848b) {
            pVar.a(this.f7849c);
        } else {
            d dVar = this.f7849c;
            if (dVar instanceof n) {
                elements = dVar instanceof b0 ? ((b0) dVar).j() : new b0(((n) dVar).i()).j();
            } else if (dVar instanceof s) {
                elements = ((s) dVar).i();
            } else {
                if (!(dVar instanceof u)) {
                    StringBuilder a8 = com.baidu.mapauto.auth.b.a("not implemented: ");
                    a8.append(this.f7849c.getClass().getName());
                    throw new g(a8.toString());
                }
                elements = ((u) dVar).f7840a.elements();
            }
            while (elements.hasMoreElements()) {
                pVar.a((d) elements.nextElement());
            }
        }
        pVar.a(0);
        pVar.a(0);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        int e8 = this.f7849c.c().e();
        if (this.f7848b) {
            return u1.a(e8) + u1.b(this.f7847a) + e8;
        }
        return u1.b(this.f7847a) + (e8 - 1);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        if (this.f7848b) {
            return true;
        }
        return this.f7849c.c().g().f();
    }
}
