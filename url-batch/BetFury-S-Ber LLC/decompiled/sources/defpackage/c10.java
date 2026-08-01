package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class c10 extends j5 {
    public static final int[][] l = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList j;
    public boolean k;

    public c10(Context context, AttributeSet attributeSet) {
        super(mv.V(context, attributeSet, com.trembin.nirefon.betfury.R.attr.radioButtonStyle, com.trembin.nirefon.betfury.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray E = d50.E(context2, attributeSet, c70.y, com.trembin.nirefon.betfury.R.attr.radioButtonStyle, com.trembin.nirefon.betfury.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (E.hasValue(0)) {
            setButtonTintList(mv.r(context2, E, 0));
        }
        if (E.hasValue(1)) {
            setRippleColor(mv.r(context2, E, 1));
        }
        this.k = E.getBoolean(2, false);
        E.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.j == null) {
            int W = bi.W(getContext(), n9.M(this, com.trembin.nirefon.betfury.R.attr.colorControlActivated));
            int W2 = bi.W(getContext(), n9.M(this, com.trembin.nirefon.betfury.R.attr.colorOnSurface));
            int W3 = bi.W(getContext(), n9.M(this, com.trembin.nirefon.betfury.R.attr.colorSurface));
            this.j = new ColorStateList(l, new int[]{bi.J(W3, W, 1.0f), bi.J(W3, W2, 0.54f), bi.J(W3, W2, 0.38f), bi.J(W3, W2, 0.38f)});
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
