package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.stripe.android.stripe3ds2.init.ui.BaseCustomization;
import com.stripe.android.stripe3ds2.init.ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeButtonCustomization;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public class ThreeDS2Button extends MaterialButton {
    public /* synthetic */ ThreeDS2Button(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setButtonCustomization(ButtonCustomization buttonCustomization) {
        if (buttonCustomization == 0) {
            return;
        }
        BaseCustomization baseCustomization = (BaseCustomization) buttonCustomization;
        String str = baseCustomization.mTextColor;
        if (str != null) {
            setTextColor(Color.parseColor(str));
        }
        StripeButtonCustomization stripeButtonCustomization = (StripeButtonCustomization) buttonCustomization;
        String str2 = stripeButtonCustomization.mBackgroundColor;
        if (str2 != null) {
            setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str2)));
        }
        Integer valueOf = Integer.valueOf(stripeButtonCustomization.mCornerRadius);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            setCornerRadius(valueOf.intValue());
        }
        Integer valueOf2 = Integer.valueOf(baseCustomization.mTextFontSize);
        if ((valueOf2.intValue() > 0 ? valueOf2 : null) != null) {
            setTextSize(2, r2.intValue());
        }
        String str3 = baseCustomization.mTextFontName;
        if (str3 != null) {
            setTypeface(Typeface.create(str3, 0));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2Button(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDS2Button(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2Button(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
