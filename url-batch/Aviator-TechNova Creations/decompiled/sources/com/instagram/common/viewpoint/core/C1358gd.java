package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.gd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1358gd implements OG {
    private OH A00(OF of) {
        return (OH) of.A76();
    }

    public final void A01(OF of) {
        if (!of.A9J()) {
            of.AJ1(0, 0, 0, 0);
            return;
        }
        float A8K = A8K(of);
        float A8j = A8j(of);
        float elevation = OJ.A00(A8K, A8j, of.A8i());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = OJ.A01(A8K, A8j, of.A8i());
        int ceil = (int) Math.ceil(elevation2);
        of.AJ1(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.instagram.common.viewpoint.core.OG
    public final ColorStateList A6t(OF of) {
        return A00(of).A05();
    }

    @Override // com.instagram.common.viewpoint.core.OG
    public final float A7n(OF of) {
        return of.A77().getElevation();
    }

    @Override // com.instagram.common.viewpoint.core.OG
    public final float A8K(OF of) {
        return A00(of).A03();
    }

    @Override // com.instagram.common.viewpoint.core.OG
    public final float A8P(OF of) {
        return A8j(of) * 2.0f;
    }

    @Override // com.instagram.common.viewpoint.core.OG
    public final float A8Q(OF of) {
        return A8j(of) * 2.0f;
    }

    @Override // com.instagram.common.viewpoint.core.OG
    public final float A8j(OF of) {
        return A00(of).A04();
    }

    @Override // com.instagram.common.viewpoint.core.OG
    public final void AA6() {
    }

    @Override // com.instagram.common.viewpoint.core.OG
    public final void AA8(OF of, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        OH background = new OH(colorStateList, f);
        of.AIa(background);
        View view = of.A77();
        view.setClipToOutline(true);
        view.setElevation(f2);
        AIn(of, f3);
    }

    @Override // com.instagram.common.viewpoint.core.OG
    public final void ACm(OF of) {
        AIn(of, A8K(of));
    }

    @Override // com.instagram.common.viewpoint.core.OG
    public final void AEl(OF of) {
        AIn(of, A8K(of));
    }

    @Override // com.instagram.common.viewpoint.core.OG
    public final void AIZ(OF of, ColorStateList colorStateList) {
        A00(of).A08(colorStateList);
    }

    @Override // com.instagram.common.viewpoint.core.OG
    public final void AIf(OF of, float f) {
        of.A77().setElevation(f);
    }

    @Override // com.instagram.common.viewpoint.core.OG
    public final void AIn(OF of, float f) {
        A00(of).A07(f, of.A9J(), of.A8i());
        A01(of);
    }

    @Override // com.instagram.common.viewpoint.core.OG
    public final void AIz(OF of, float f) {
        A00(of).A06(f);
    }
}
