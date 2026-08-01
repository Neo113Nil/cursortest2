package l0;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class c implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3097a;

    public c(f fVar) {
        this.f3097a = fVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f3097a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        this.f3097a.scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f3097a.unscheduleSelf(runnable);
    }
}
