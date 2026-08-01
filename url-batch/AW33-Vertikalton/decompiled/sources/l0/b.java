package l0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0.a f3108a;

    public b(v0.a aVar) {
        this.f3108a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f3108a.f4031b.f4045o;
        if (colorStateList != null) {
            D.a.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        v0.c cVar = this.f3108a.f4031b;
        ColorStateList colorStateList = cVar.f4045o;
        if (colorStateList != null) {
            D.a.g(drawable, colorStateList.getColorForState(cVar.f4049s, colorStateList.getDefaultColor()));
        }
    }
}
