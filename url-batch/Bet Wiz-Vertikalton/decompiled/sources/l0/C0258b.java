package l0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import w0.C0330a;
import w0.C0332c;

/* renamed from: l0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0330a f3100a;

    public C0258b(C0330a c0330a) {
        this.f3100a = c0330a;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f3100a.f4056b.f4070o;
        if (colorStateList != null) {
            D.a.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C0332c c0332c = this.f3100a.f4056b;
        ColorStateList colorStateList = c0332c.f4070o;
        if (colorStateList != null) {
            D.a.g(drawable, colorStateList.getColorForState(c0332c.f4074s, colorStateList.getDefaultColor()));
        }
    }
}
