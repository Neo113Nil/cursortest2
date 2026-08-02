package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeLabelCustomization;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class ThreeDS2HeaderTextView extends ThreeDS2TextView {
    public /* synthetic */ ThreeDS2HeaderTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // com.stripe.android.stripe3ds2.views.ThreeDS2TextView
    public void setText(String str, LabelCustomization labelCustomization) {
        setText(str);
        if (labelCustomization != null) {
            StripeLabelCustomization stripeLabelCustomization = (StripeLabelCustomization) labelCustomization;
            String str2 = stripeLabelCustomization.mHeadingTextColor;
            if (str2 != null) {
                setTextColor(Color.parseColor(str2));
            }
            Integer valueOf = Integer.valueOf(stripeLabelCustomization.mHeadingTextFontSize);
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                setTextSize(2, valueOf.intValue());
            }
            String str3 = stripeLabelCustomization.mHeadingTextFontName;
            if (str3 != null) {
                setTypeface(Typeface.create(str3, 0));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2HeaderTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDS2HeaderTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2HeaderTextView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
