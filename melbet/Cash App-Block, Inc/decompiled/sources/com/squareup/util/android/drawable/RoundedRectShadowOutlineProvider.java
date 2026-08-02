package com.squareup.util.android.drawable;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class RoundedRectShadowOutlineProvider extends ViewOutlineProvider {
    public float cornerRadius;
    public final RoundedRectShadowOutlineProvider$Radius$Res radius;
    public final ViewShadowInfo shadowInfo;

    public RoundedRectShadowOutlineProvider(RoundedRectShadowOutlineProvider$Radius$Res roundedRectShadowOutlineProvider$Radius$Res, ViewShadowInfo viewShadowInfo) {
        this.shadowInfo = viewShadowInfo;
        this.radius = roundedRectShadowOutlineProvider$Radius$Res;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        view.getClass();
        outline.getClass();
        if (this.radius == null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        } else {
            this.cornerRadius = view.getResources().getDimensionPixelSize(r0.value);
            getOutline$com$squareup$util$android$drawable$ShadowOutlineProvider(view, outline);
        }
    }

    public final void getOutline$com$squareup$util$android$drawable$ShadowOutlineProvider(View view, Outline outline) {
        view.getClass();
        outline.getClass();
        ViewShadowInfo viewShadowInfo = this.shadowInfo;
        view.setElevation(viewShadowInfo.elevation);
        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
        rect.offset(0, viewShadowInfo.yOffset);
        outline.setAlpha(viewShadowInfo.alpha);
        outline.setRoundRect(rect, this.cornerRadius);
    }
}
