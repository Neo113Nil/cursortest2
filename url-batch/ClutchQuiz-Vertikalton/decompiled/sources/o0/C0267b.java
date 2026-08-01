package o0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0.a f3246a;

    public C0267b(C0.a aVar) {
        this.f3246a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f3246a.f113b.f128o;
        if (colorStateList != null) {
            D.a.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C0.d dVar = this.f3246a.f113b;
        ColorStateList colorStateList = dVar.f128o;
        if (colorStateList != null) {
            D.a.g(drawable, colorStateList.getColorForState(dVar.f132s, colorStateList.getDefaultColor()));
        }
    }
}
