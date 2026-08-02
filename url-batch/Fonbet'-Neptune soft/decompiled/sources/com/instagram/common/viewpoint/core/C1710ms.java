package com.instagram.common.viewpoint.core;

import android.os.Looper;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.ms, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1710ms implements C9U {
    @Override // com.instagram.common.viewpoint.core.C9U
    public final /* synthetic */ C9T AGJ(C9P c9p, C1830or c1830or) {
        return C9R.A00(this, c9p, c1830or);
    }

    @Override // com.instagram.common.viewpoint.core.C9U
    public final /* synthetic */ void AGK() {
    }

    @Override // com.instagram.common.viewpoint.core.C9U
    public final C9G A34(C9P c9p, C1830or c1830or) {
        if (c1830or.A0O == null) {
            return null;
        }
        final int i = 1;
        return new C1708mq(new C9E(new Exception(i) { // from class: com.facebook.ads.redexgen.X.9z
            public final int A00;

            {
                this.A00 = i;
            }
        }, AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }

    @Override // com.instagram.common.viewpoint.core.C9U
    public final int A7O(C1830or c1830or) {
        return c1830or.A0O != null ? 1 : 0;
    }

    @Override // com.instagram.common.viewpoint.core.C9U
    public final void AIu(Looper looper, C02327m c02327m) {
    }
}
