package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.ao, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0495ao extends Rg {
    public C0495ao(X4 x4) {
        super(x4);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        String j4 = this.f10886a.f11224c.j();
        String str = p5.f10801h;
        this.f10886a.f11224c.j(str).b();
        if (TextUtils.equals(j4, str)) {
            return false;
        }
        this.f10886a.a(M3.o());
        return false;
    }
}
