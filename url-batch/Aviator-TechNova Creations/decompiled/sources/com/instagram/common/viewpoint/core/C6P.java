package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.6P, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6P extends C1318fw {
    public C6P(R0 r0) {
        super(r0);
    }

    @Override // com.instagram.common.viewpoint.core.C1318fw, com.instagram.common.viewpoint.core.InterfaceC0890Xn
    public final /* bridge */ /* synthetic */ void A3w(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        super.A3w(view, i, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.C1318fw, com.instagram.common.viewpoint.core.InterfaceC0890Xn
    public final /* bridge */ /* synthetic */ void A3x(View view, RelativeLayout.LayoutParams layoutParams) {
        super.A3x(view, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.C1318fw, com.instagram.common.viewpoint.core.InterfaceC0890Xn
    public final void A4b(String str) {
        super.A4b(str);
        if (this.A00.get() == null) {
            return;
        }
        String A03 = EnumC1181dh.A08.A03();
        String rewardedVideoError = EnumC1181dh.A09.A03();
        if (str.equals(A03)) {
            this.A00.get().finish(11);
        } else if (str.equals(rewardedVideoError)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C1318fw, com.instagram.common.viewpoint.core.InterfaceC0890Xn
    public final /* bridge */ /* synthetic */ void A4c(String str, C0780Td c0780Td) {
        super.A4c(str, c0780Td);
    }

    @Override // com.instagram.common.viewpoint.core.C1318fw, com.instagram.common.viewpoint.core.InterfaceC0890Xn
    public final /* bridge */ /* synthetic */ void AAf(String str, N9 n9) {
        super.AAf(str, n9);
    }

    @Override // com.instagram.common.viewpoint.core.C1318fw, com.instagram.common.viewpoint.core.InterfaceC0890Xn
    public final /* bridge */ /* synthetic */ void ACf(int i) {
        super.ACf(i);
    }
}
