package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ys extends r4 {
    public static final int[][] l = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList j;
    public boolean k;

    public ys(Context context, AttributeSet attributeSet) {
        super(e70.W(context, attributeSet, com.derinko.gbini.n1casino.R.attr.radioButtonStyle, com.derinko.gbini.n1casino.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray W = o8.W(context2, attributeSet, vx.w, com.derinko.gbini.n1casino.R.attr.radioButtonStyle, com.derinko.gbini.n1casino.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (W.hasValue(0)) {
            setButtonTintList(e70.y(context2, W, 0));
        }
        if (W.hasValue(1)) {
            setRippleColor(e70.y(context2, W, 1));
        }
        this.k = W.getBoolean(2, false);
        W.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.j == null) {
            int X = jw.X(getContext(), zo.L(this, com.derinko.gbini.n1casino.R.attr.colorControlActivated));
            int X2 = jw.X(getContext(), zo.L(this, com.derinko.gbini.n1casino.R.attr.colorOnSurface));
            int X3 = jw.X(getContext(), zo.L(this, com.derinko.gbini.n1casino.R.attr.colorSurface));
            this.j = new ColorStateList(l, new int[]{jw.I(X3, X, 1.0f), jw.I(X3, X2, 0.54f), jw.I(X3, X2, 0.38f), jw.I(X3, X2, 0.38f)});
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
