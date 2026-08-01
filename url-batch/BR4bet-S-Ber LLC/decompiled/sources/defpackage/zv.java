package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class zv extends b5 {
    public static final int[][] l = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList j;
    public boolean k;

    public zv(Context context, AttributeSet attributeSet) {
        super(la0.j0(context, attributeSet, com.moontiko.really.admiralcasino.R.attr.radioButtonStyle, com.moontiko.really.admiralcasino.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray O = la0.O(context2, attributeSet, y00.z, com.moontiko.really.admiralcasino.R.attr.radioButtonStyle, com.moontiko.really.admiralcasino.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (O.hasValue(0)) {
            setButtonTintList(kr.w(context2, O, 0));
        }
        if (O.hasValue(1)) {
            setRippleColor(kr.w(context2, O, 1));
        }
        this.k = O.getBoolean(2, false);
        O.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.j == null) {
            int G = xf.G(getContext(), b9.N(this, com.moontiko.really.admiralcasino.R.attr.colorControlActivated));
            int G2 = xf.G(getContext(), b9.N(this, com.moontiko.really.admiralcasino.R.attr.colorOnSurface));
            int G3 = xf.G(getContext(), b9.N(this, com.moontiko.really.admiralcasino.R.attr.colorSurface));
            this.j = new ColorStateList(l, new int[]{xf.z(G3, G, 1.0f), xf.z(G3, G2, 0.54f), xf.z(G3, G2, 0.38f), xf.z(G3, G2, 0.38f)});
        }
        return this.j;
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.k && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.k = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
