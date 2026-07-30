package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.a5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1430a5 extends LinearLayout {
    public final Bitmap A00;

    public C1430a5(C1839gi c1839gi, EnumC1447aM enumC1447aM) {
        super(c1839gi);
        this.A00 = YN.A01(YM.AD_CHOICE_ICON);
        c1839gi.A0F().AAz(enumC1447aM.name().toLowerCase(Locale.US));
        A00();
        setAdChoiceIcon(c1839gi);
    }

    private void A00() {
        setOrientation(0);
        setPadding(XV.A0I, XV.A0I, XV.A0I, XV.A0I);
        setClipToPadding(false);
        setGravity(17);
        YB.A0N(this, -859190839);
        YB.A0E(XV.A0C, this);
    }

    private void setAdChoiceIcon(C1839gi c1839gi) {
        ImageView imageView = new ImageView(c1839gi);
        YB.A0K(imageView);
        imageView.setImageBitmap(this.A00);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, XV.A0U));
        addView(imageView);
    }
}
