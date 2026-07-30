package E0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q3.a f737a;

    public b(q3.a aVar) {
        this.f737a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f737a.f40128b.f40141H;
        if (colorStateList != null) {
            H.a.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        q3.c cVar = this.f737a.f40128b;
        ColorStateList colorStateList = cVar.f40141H;
        if (colorStateList != null) {
            H.a.g(drawable, colorStateList.getColorForState(cVar.f40144L, colorStateList.getDefaultColor()));
        }
    }
}
