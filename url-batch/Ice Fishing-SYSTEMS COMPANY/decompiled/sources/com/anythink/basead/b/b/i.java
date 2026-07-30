package com.anythink.basead.b.b;

import android.text.TextUtils;
import com.anythink.basead.b.b.a;
import com.anythink.core.common.h.w;

/* loaded from: classes.dex */
public final class i extends a {
    public i(a.C0005a c0005a) {
        super(c0005a);
    }

    @Override // com.anythink.basead.b.b.a, com.anythink.basead.b.b.m
    public final n a() {
        w wVar = this.f5901c;
        String ar = wVar != null ? wVar.ar() : "";
        if (TextUtils.isEmpty(ar)) {
            return n.a(false, "MarketUrlClickAction execute fail with empty url");
        }
        b bVar = this.f5904f;
        if (bVar != null) {
            bVar.b();
            this.f5904f.a();
        }
        com.anythink.core.basead.a.d b9 = com.anythink.core.basead.a.e.b(this.f5900b, ar, this.f5901c, this.f5902d);
        if (b9.a() != 0) {
            com.anythink.core.common.u.e.a(this.f5902d, this.f5901c, ar, "0", 2, 0, b9.b());
            return n.a(false, "MarketUrlClickAction execute fail");
        }
        k kVar = this.f5903e;
        if (kVar != null) {
            kVar.b();
        }
        b bVar2 = this.f5904f;
        if (bVar2 != null) {
            bVar2.c();
        }
        com.anythink.core.common.u.e.a(this.f5902d, this.f5901c, ar, "1", 2, 0, b9.b());
        return n.a(true, "MarketUrlClickAction execute success");
    }
}
