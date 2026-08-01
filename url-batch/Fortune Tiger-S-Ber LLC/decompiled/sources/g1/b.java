package g1;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t1.a f1765a;

    public b(t1.a aVar) {
        this.f1765a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f1765a.f3378b.f3390t;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        t1.c cVar = this.f1765a.f3378b;
        ColorStateList colorStateList = cVar.f3390t;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(cVar.f3394x, colorStateList.getDefaultColor()));
        }
    }
}
