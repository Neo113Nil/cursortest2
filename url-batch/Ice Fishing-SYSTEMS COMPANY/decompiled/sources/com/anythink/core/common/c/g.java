package com.anythink.core.common.c;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.u;
import com.anythink.core.common.v.af;
import com.anythink.core.common.v.m;

/* loaded from: classes.dex */
public final class g extends e {
    public g(Context context, String str, String str2, long j9) {
        super(context, str, str2, j9);
    }

    @Override // com.anythink.core.common.c.f
    public final c a() {
        String c4;
        boolean z8;
        if (System.currentTimeMillis() - this.f12451h > 86400000) {
            c4 = m.a(this.f12449f, this.f12448e);
            af.b(this.f12449f, u.b.f13004a, "det" + this.f12450g, c4);
            af.a(this.f12449f, u.b.f13004a, "det_time_" + this.f12450g, System.currentTimeMillis());
            z8 = true;
        } else {
            c4 = af.c(this.f12449f, u.b.f13004a, "det" + this.f12450g, "");
            z8 = false;
        }
        return new c(this.f12448e, this.f12450g, z8, z8 ? System.currentTimeMillis() : this.f12451h, !TextUtils.isEmpty(r10), c4);
    }

    @Override // com.anythink.core.common.c.f
    public final int b() {
        return 1;
    }
}
