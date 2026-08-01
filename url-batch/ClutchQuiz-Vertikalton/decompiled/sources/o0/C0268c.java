package o0;

import android.graphics.drawable.Drawable;

/* renamed from: o0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268c implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0271f f3247a;

    public C0268c(C0271f c0271f) {
        this.f3247a = c0271f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f3247a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        this.f3247a.scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f3247a.unscheduleSelf(runnable);
    }
}
