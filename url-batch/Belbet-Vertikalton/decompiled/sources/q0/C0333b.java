package q0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: q0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B0.a f3935a;

    public C0333b(B0.a aVar) {
        this.f3935a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f3935a.f43b.f57o;
        if (colorStateList != null) {
            F.a.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        B0.d dVar = this.f3935a.f43b;
        ColorStateList colorStateList = dVar.f57o;
        if (colorStateList != null) {
            F.a.g(drawable, colorStateList.getColorForState(dVar.f61s, colorStateList.getDefaultColor()));
        }
    }
}
