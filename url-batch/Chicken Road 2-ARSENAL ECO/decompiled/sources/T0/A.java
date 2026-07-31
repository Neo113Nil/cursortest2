package T0;

import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class A implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2219f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2220g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2221h;

    public /* synthetic */ A(Object obj, int i7, int i8) {
        this.f2219f = i8;
        this.f2221h = obj;
        this.f2220g = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2219f) {
            case 0:
                ((B) this.f2221h).f(this.f2220g);
                break;
            default:
                ((SystemForegroundService) this.f2221h).f3592j.cancel(this.f2220g);
                break;
        }
    }
}
