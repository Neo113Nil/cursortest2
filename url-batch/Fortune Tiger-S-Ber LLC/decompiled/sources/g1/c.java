package g1;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c implements Drawable.Callback {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f1766f;

    public c(f fVar) {
        this.f1766f = fVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f1766f.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        this.f1766f.scheduleSelf(runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f1766f.unscheduleSelf(runnable);
    }
}
