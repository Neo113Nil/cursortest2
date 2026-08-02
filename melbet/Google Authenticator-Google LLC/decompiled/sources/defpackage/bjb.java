package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bjb implements bdv {
    private final AnimatedImageDrawable a;

    public bjb(AnimatedImageDrawable animatedImageDrawable) {
        this.a = animatedImageDrawable;
    }

    @Override // defpackage.bdv
    public final int a() {
        int intrinsicWidth;
        int intrinsicHeight;
        AnimatedImageDrawable animatedImageDrawable = this.a;
        intrinsicWidth = animatedImageDrawable.getIntrinsicWidth();
        intrinsicHeight = animatedImageDrawable.getIntrinsicHeight();
        int b = intrinsicWidth * intrinsicHeight * bmi.b(Bitmap.Config.ARGB_8888);
        return b + b;
    }

    @Override // defpackage.bdv
    public final Class b() {
        return Drawable.class;
    }

    @Override // defpackage.bdv
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // defpackage.bdv
    public final void e() {
        AnimatedImageDrawable animatedImageDrawable = this.a;
        animatedImageDrawable.stop();
        animatedImageDrawable.clearAnimationCallbacks();
    }
}
