package com.instagram.common.viewpoint.core;

import android.os.Looper;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.ms, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1716ms implements C9U {
    @Override // com.instagram.common.viewpoint.core.C9U
    public final /* synthetic */ C9T AGJ(C9P c9p, C1836or c1836or) {
        return C9R.A00(this, c9p, c1836or);
    }

    @Override // com.instagram.common.viewpoint.core.C9U
    public final /* synthetic */ void AGK() {
    }

    @Override // com.instagram.common.viewpoint.core.C9U
    public final C9G A34(C9P c9p, C1836or c1836or) {
        if (c1836or.A0O == null) {
            return null;
        }
        final int i = 1;
        return new C1714mq(new C9E(new Exception(i) { // from class: com.facebook.ads.redexgen.X.9z
            public final int A00;

            {
                this.A00 = i;
            }
        }, AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }

    @Override // com.instagram.common.viewpoint.core.C9U
    public final int A7O(C1836or c1836or) {
        return c1836or.A0O != null ? 1 : 0;
    }

    @Override // com.instagram.common.viewpoint.core.C9U
    public final void AIu(Looper looper, C02387m c02387m) {
    }
}
