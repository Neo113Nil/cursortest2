package l1;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z1.a f2641a;

    public b(z1.a aVar) {
        this.f2641a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f2641a.f4128b.f4140t;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        z1.c cVar = this.f2641a.f4128b;
        ColorStateList colorStateList = cVar.f4140t;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(cVar.f4144x, colorStateList.getDefaultColor()));
        }
    }
}
