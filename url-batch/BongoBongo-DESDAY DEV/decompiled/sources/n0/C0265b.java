package n0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import y0.C0318a;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0265b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0318a f3320a;

    public C0265b(C0318a c0318a) {
        this.f3320a = c0318a;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f3320a.f4317b.f4332o;
        if (colorStateList != null) {
            E.a.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        y0.c cVar = this.f3320a.f4317b;
        ColorStateList colorStateList = cVar.f4332o;
        if (colorStateList != null) {
            E.a.g(drawable, colorStateList.getColorForState(cVar.f4336s, colorStateList.getDefaultColor()));
        }
    }
}
