package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class g3 extends Animatable2.AnimationCallback {
    public final /* synthetic */ w00 a;

    public g3(w00 w00Var) {
        this.a = w00Var;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.a.b.t;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        y00 y00Var = this.a.b;
        ColorStateList colorStateList = y00Var.t;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(y00Var.x, colorStateList.getDefaultColor()));
        }
    }
}
