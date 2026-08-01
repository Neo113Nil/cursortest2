package q0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F0.a f3753a;

    public b(F0.a aVar) {
        this.f3753a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f3753a.f243b.f258o;
        if (colorStateList != null) {
            D.a.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        F0.d dVar = this.f3753a.f243b;
        ColorStateList colorStateList = dVar.f258o;
        if (colorStateList != null) {
            D.a.g(drawable, colorStateList.getColorForState(dVar.f262s, colorStateList.getDefaultColor()));
        }
    }
}
