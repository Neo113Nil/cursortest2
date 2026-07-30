package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class YU implements InterfaceC0836Vj {
    @Override // com.instagram.common.viewpoint.core.InterfaceC0836Vj
    public final void AHp(Throwable th, Object obj) {
        if (obj instanceof SM) {
            C1159dL adContext = ((SM) obj).A6e();
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
        if (!(context instanceof C1159dL)) {
            return;
        }
        ((C1159dL) context).A0Q(th);
    }
}
