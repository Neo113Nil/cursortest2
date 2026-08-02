package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.google.android.material.textview.MaterialTextView;
import com.stripe.android.stripe3ds2.init.ui.BaseCustomization;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public class ThreeDS2TextView extends MaterialTextView {
    public /* synthetic */ ThreeDS2TextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setText(String str, LabelCustomization labelCustomization) {
        String str2;
        String str3;
        setText(str);
        if (labelCustomization != 0 && (str3 = ((BaseCustomization) labelCustomization).mTextColor) != null) {
            setTextColor(Color.parseColor(str3));
        }
        if (labelCustomization != 0) {
            Integer valueOf = Integer.valueOf(((BaseCustomization) labelCustomization).mTextFontSize);
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                setTextSize(2, valueOf.intValue());
            }
        }
        if (labelCustomization == 0 || (str2 = ((BaseCustomization) labelCustomization).mTextFontName) == null) {
            return;
        }
        setTypeface(Typeface.create(str2, 0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2TextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDS2TextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2TextView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
