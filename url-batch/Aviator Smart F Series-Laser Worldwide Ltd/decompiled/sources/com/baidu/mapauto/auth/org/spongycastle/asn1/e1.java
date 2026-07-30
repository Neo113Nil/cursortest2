package com.baidu.mapauto.auth.org.spongycastle.asn1;

import com.baidu.location.BDLocation;

/* loaded from: classes2.dex */
public final class e1 extends w {
    public e1(boolean z7, int i8, d dVar) {
        super(z7, i8, dVar);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        r g8 = this.f7849c.c().g();
        boolean z7 = this.f7848b;
        int i8 = BDLocation.TypeCoarseLocation;
        if (z7) {
            pVar.a(BDLocation.TypeCoarseLocation, this.f7847a);
            pVar.b(g8.e());
            pVar.a((d) g8);
        } else {
            if (!g8.f()) {
                i8 = 128;
            }
            pVar.a(i8, this.f7847a);
            pVar.a(g8);
        }
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        int e8 = this.f7849c.c().g().e();
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
