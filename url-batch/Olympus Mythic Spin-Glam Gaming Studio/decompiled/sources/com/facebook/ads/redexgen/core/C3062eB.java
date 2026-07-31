package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3062eB implements WS {
    @Override // com.facebook.ads.redexgen.core.WS
    public final void AIZ(Throwable th, Object obj) {
        if (obj instanceof T4) {
            C3218gi adContext = ((T4) obj).A6m();
            if (adContext != null) {
                adContext.A0Q(th);
                return;
            }
            return;
        }
        if (!(obj instanceof View)) {
            return;
        }
        Context context = ((View) obj).getContext();
        if (!(context instanceof C3218gi)) {
            return;
        }
        ((C3218gi) context).A0Q(th);
    }
}
