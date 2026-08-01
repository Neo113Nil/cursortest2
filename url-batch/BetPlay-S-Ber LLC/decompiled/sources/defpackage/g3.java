package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class g3 extends Animatable2.AnimationCallback {
    public final /* synthetic */ gt a;

    public g3(gt gtVar) {
        this.a = gtVar;
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
        jt jtVar = this.a.b;
        ColorStateList colorStateList = jtVar.t;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(jtVar.x, colorStateList.getDefaultColor()));
        }
    }
}
