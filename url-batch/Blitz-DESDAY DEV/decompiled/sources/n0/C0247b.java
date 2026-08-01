package n0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import z0.C0325a;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0247b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0325a f3231a;

    public C0247b(C0325a c0325a) {
        this.f3231a = c0325a;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f3231a.f4321b.f4335o;
        if (colorStateList != null) {
            F.a.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        z0.c cVar = this.f3231a.f4321b;
        ColorStateList colorStateList = cVar.f4335o;
        if (colorStateList != null) {
            F.a.g(drawable, colorStateList.getColorForState(cVar.f4339s, colorStateList.getDefaultColor()));
        }
    }
}
