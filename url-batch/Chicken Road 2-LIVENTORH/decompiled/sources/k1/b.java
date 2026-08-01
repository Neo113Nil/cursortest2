package k1;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y1.a f2165a;

    public b(y1.a aVar) {
        this.f2165a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f2165a.f3781b.f3793t;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        y1.c cVar = this.f2165a.f3781b;
        ColorStateList colorStateList = cVar.f3793t;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(cVar.f3797x, colorStateList.getDefaultColor()));
        }
    }
}
