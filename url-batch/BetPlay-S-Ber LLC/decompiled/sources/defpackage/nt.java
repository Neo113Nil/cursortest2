package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class nt extends i5 {
    public static final int[][] l = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList j;
    public boolean k;

    public nt(Context context, AttributeSet attributeSet) {
        super(op.Z(context, attributeSet, com.awerser.monnit.betplay.R.attr.radioButtonStyle, com.awerser.monnit.betplay.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray Z = vw.Z(context2, attributeSet, ly.x, com.awerser.monnit.betplay.R.attr.radioButtonStyle, com.awerser.monnit.betplay.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (Z.hasValue(0)) {
            setButtonTintList(op.x(context2, Z, 0));
        }
        if (Z.hasValue(1)) {
            setRippleColor(op.x(context2, Z, 1));
        }
        this.k = Z.getBoolean(2, false);
        Z.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.j == null) {
            int L = j8.L(getContext(), l70.S(this, com.awerser.monnit.betplay.R.attr.colorControlActivated));
            int L2 = j8.L(getContext(), l70.S(this, com.awerser.monnit.betplay.R.attr.colorOnSurface));
            int L3 = j8.L(getContext(), l70.S(this, com.awerser.monnit.betplay.R.attr.colorSurface));
            this.j = new ColorStateList(l, new int[]{j8.D(L3, L, 1.0f), j8.D(L3, L2, 0.54f), j8.D(L3, L2, 0.38f), j8.D(L3, L2, 0.38f)});
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
