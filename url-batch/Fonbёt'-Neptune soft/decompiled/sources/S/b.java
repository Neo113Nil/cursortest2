package S;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class b implements Drawable.Callback {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f996e = 1;

    /* renamed from: f, reason: collision with root package name */
    public Object f997f;

    public /* synthetic */ b() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f996e) {
            case 0:
                ((e) this.f997f).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        switch (this.f996e) {
            case 0:
                ((e) this.f997f).scheduleSelf(runnable, j2);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f997f;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j2);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f996e) {
            case 0:
                ((e) this.f997f).unscheduleSelf(runnable);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f997f;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
        }
    }

    public b(e eVar) {
        this.f997f = eVar;
    }

    private final void a(Drawable drawable) {
    }
}
