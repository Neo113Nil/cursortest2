package k0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0215b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0.a f3136a;

    public C0215b(v0.a aVar) {
        this.f3136a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f3136a.f4446b.f4460o;
        if (colorStateList != null) {
            D.a.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        v0.c cVar = this.f3136a.f4446b;
        ColorStateList colorStateList = cVar.f4460o;
        if (colorStateList != null) {
            D.a.g(drawable, colorStateList.getColorForState(cVar.f4464s, colorStateList.getDefaultColor()));
        }
    }
}
