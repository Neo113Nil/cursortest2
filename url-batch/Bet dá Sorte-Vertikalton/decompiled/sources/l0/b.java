package l0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A0.a f3079a;

    public b(A0.a aVar) {
        this.f3079a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f3079a.f1b.f16o;
        if (colorStateList != null) {
            D.a.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        A0.d dVar = this.f3079a.f1b;
        ColorStateList colorStateList = dVar.f16o;
        if (colorStateList != null) {
            D.a.g(drawable, colorStateList.getColorForState(dVar.f20s, colorStateList.getDefaultColor()));
        }
    }
}
