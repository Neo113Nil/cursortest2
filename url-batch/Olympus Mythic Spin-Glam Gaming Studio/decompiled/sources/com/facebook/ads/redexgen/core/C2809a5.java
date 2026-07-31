package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.a5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2809a5 extends LinearLayout {
    public final Bitmap A00;

    public C2809a5(C3218gi c3218gi, EnumC2826aM enumC2826aM) {
        super(c3218gi);
        this.A00 = YN.A01(YM.AD_CHOICE_ICON);
        c3218gi.A0F().AAz(enumC2826aM.name().toLowerCase(Locale.US));
        A00();
        setAdChoiceIcon(c3218gi);
    }

    private void A00() {
        setOrientation(0);
        setPadding(XV.A0I, XV.A0I, XV.A0I, XV.A0I);
        setClipToPadding(false);
        setGravity(17);
        YB.A0N(this, -859190839);
        YB.A0E(XV.A0C, this);
    }

    private void setAdChoiceIcon(C3218gi c3218gi) {
        ImageView imageView = new ImageView(c3218gi);
        YB.A0K(imageView);
        imageView.setImageBitmap(this.A00);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, XV.A0U));
        addView(imageView);
    }
}
