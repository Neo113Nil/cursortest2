package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class o2 extends Animatable2.AnimationCallback {
    public final /* synthetic */ ss a;

    public o2(ss ssVar) {
        this.a = ssVar;
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
        us usVar = this.a.b;
        ColorStateList colorStateList = usVar.t;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(usVar.x, colorStateList.getDefaultColor()));
        }
    }
}
