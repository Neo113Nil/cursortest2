package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class y2 extends Animatable2.AnimationCallback {
    public final /* synthetic */ tv a;

    public y2(tv tvVar) {
        this.a = tvVar;
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
        vv vvVar = this.a.b;
        ColorStateList colorStateList = vvVar.t;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(vvVar.x, colorStateList.getDefaultColor()));
        }
    }
}
