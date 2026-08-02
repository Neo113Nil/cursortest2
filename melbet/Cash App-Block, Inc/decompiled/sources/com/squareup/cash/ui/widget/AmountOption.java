package com.squareup.cash.ui.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.graphics.ColorUtils;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.theming.PressKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.util.Strings;
import com.squareup.util.android.ColorsKt;
import com.squareup.util.android.Views;
import kotlin.Pair;

/* loaded from: classes6.dex */
public final class AmountOption extends AppCompatTextView {
    public final ColorPalette colorPalette;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountOption(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        Strings.applyStyle(this, TextStyles.mainTitle);
        setGravity(17);
        setSingleLine(true);
        setEllipsize(TextUtils.TruncateAt.END);
        setMinWidth(Views.dip((View) this, 77));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, Views.dip((View) this, 64));
        int dip = Views.dip((View) this, 8);
        marginLayoutParams.bottomMargin = dip;
        marginLayoutParams.topMargin = dip;
        marginLayoutParams.rightMargin = dip;
        marginLayoutParams.leftMargin = dip;
        setLayoutParams(marginLayoutParams);
        setAccentColor(colorPalette.tint);
    }

    public final void setAccentColor(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(Views.dip((View) this, 16.0f));
        int[] iArr = {R.attr.state_selected};
        ColorPalette colorPalette = this.colorPalette;
        gradientDrawable.setColor(ColorsKt.colorStateListOf(new Pair(iArr, Integer.valueOf(colorPalette.background)), new Pair(new int[0], Integer.valueOf(colorPalette.secondaryButtonBackground))));
        gradientDrawable.setStroke(Views.dip((View) this, 3), ColorsKt.colorStateListOf(new Pair(new int[]{R.attr.state_selected, R.attr.state_pressed}, Integer.valueOf(PressKt.pressColor(ThemeHelpersKt.themeInfo(this), Integer.valueOf(i), false))), new Pair(new int[]{R.attr.state_selected}, Integer.valueOf(i))));
        setBackground(new RippleDrawable(ColorStateList.valueOf(ColorUtils.setAlphaComponent(i, 63)), gradientDrawable, gradientDrawable));
        setTextColor(ColorsKt.colorStateListOf(new Pair(new int[]{R.attr.state_enabled}, Integer.valueOf(colorPalette.label)), new Pair(new int[0], Integer.valueOf(colorPalette.disabledLabel))));
    }
}
