package com.anythink.core.common.c;

import android.content.Context;
import com.anythink.core.common.e.l;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public final class d extends e {
    private boolean i;

    public d(Context context, String str, String str2, long j9) {
        super(context, str, str2, j9);
    }

    @Override // com.anythink.core.common.c.f
    public final c a() {
        boolean z8;
        boolean z9 = this.i;
        if (System.currentTimeMillis() - this.f12451h > 86400000) {
            z9 = q.a(this.f12449f, this.f12448e);
            l.a(com.anythink.core.common.e.e.a(this.f12449f)).a(this.f12450g, z9);
            z8 = true;
        } else {
            z8 = false;
        }
        boolean z10 = z8;
        return new c(this.f12448e, this.f12450g, z10, z10 ? System.currentTimeMillis() : this.f12451h, z9);
    }

    @Override // com.anythink.core.common.c.f
    public final int b() {
        return 2;
    }

    public d(Context context, String str, String str2, long j9, boolean z8) {
        this(context, str, str2, j9);
        this.i = z8;
    }
}
