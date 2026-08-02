package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class BrandZoneView extends LinearLayout {
    public final ImageView issuerImageView;
    public final ImageView paymentSystemImageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandZoneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.stripe_brand_zone_view, this);
        int i2 = R.id.issuer_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(this, R.id.issuer_image);
        if (imageView != null) {
            i2 = R.id.payment_system_image;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(this, R.id.payment_system_image);
            if (imageView2 != null) {
                this.issuerImageView = imageView;
                this.paymentSystemImageView = imageView2;
                return;
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrandZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrandZoneView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ BrandZoneView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
