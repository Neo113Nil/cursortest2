package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fmi extends id {
    private static final int[][] a = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    public fmi(Context context, AttributeSet attributeSet) {
        super(frj.a(context, attributeSet, com.google.android.apps.authenticator2.R.attr.radioButtonStyle, com.google.android.apps.authenticator2.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        ColorStateList e;
        Context context2 = getContext();
        TypedArray a2 = fjw.a(context2, attributeSet, fmj.a, com.google.android.apps.authenticator2.R.attr.radioButtonStyle, com.google.android.apps.authenticator2.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (a2.hasValue(0)) {
            setButtonTintList(fny.e(context2, a2, 0));
        }
        if (a2.hasValue(1) && (e = fny.e(context2, a2, 1)) != null) {
            Drawable background = getBackground();
            background = background instanceof DrawableWrapper ? ((DrawableWrapper) background).getDrawable() : background;
            if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setColor(e);
            }
        }
        this.c = a2.getBoolean(2, false);
        a2.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && getButtonTintList() == null) {
            this.c = true;
            ColorStateList colorStateList = this.b;
            if (colorStateList == null) {
                int c = fhq.c(this, com.google.android.apps.authenticator2.R.attr.colorControlActivated);
                int c2 = fhq.c(this, com.google.android.apps.authenticator2.R.attr.colorOnSurface);
                int c3 = fhq.c(this, com.google.android.apps.authenticator2.R.attr.colorSurface);
                int[][] iArr = a;
                int length = iArr.length;
                ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{fhq.e(c3, c, 1.0f), fhq.e(c3, c2, 0.54f), fhq.e(c3, c2, 0.38f), fhq.e(c3, c2, 0.38f)});
                this.b = colorStateList2;
                colorStateList = colorStateList2;
            }
            setButtonTintList(colorStateList);
        }
    }
}
