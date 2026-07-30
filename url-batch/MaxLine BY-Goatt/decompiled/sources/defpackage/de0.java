package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class de0 implements Drawable.Callback {
    public final /* synthetic */ ee0 m;

    public de0(ee0 ee0Var) {
        this.m = ee0Var;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.getClass();
        ee0 ee0Var = this.m;
        lz1 lz1Var = ee0Var.s;
        lz1Var.setValue(Integer.valueOf(((Number) lz1Var.getValue()).intValue() + 1));
        Drawable drawable2 = ee0Var.r;
        y91 y91Var = fe0.a;
        ee0Var.t.setValue(new ql2((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : ph2.a(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) fe0.a.getValue()).postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) fe0.a.getValue()).removeCallbacks(runnable);
    }
}
