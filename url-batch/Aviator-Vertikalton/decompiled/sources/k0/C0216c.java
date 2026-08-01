package k0;

import android.graphics.drawable.Drawable;

/* renamed from: k0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216c implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0219f f3137a;

    public C0216c(C0219f c0219f) {
        this.f3137a = c0219f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f3137a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        this.f3137a.scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f3137a.unscheduleSelf(runnable);
    }
}
