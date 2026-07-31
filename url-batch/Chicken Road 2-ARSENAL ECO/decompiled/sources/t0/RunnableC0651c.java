package t0;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0651c implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Notification f5955g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5956h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f5957i;

    public RunnableC0651c(SystemForegroundService systemForegroundService, int i7, Notification notification, int i8) {
        this.f5957i = systemForegroundService;
        this.f5954f = i7;
        this.f5955g = notification;
        this.f5956h = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = Build.VERSION.SDK_INT;
        int i8 = this.f5956h;
        Notification notification = this.f5955g;
        int i9 = this.f5954f;
        SystemForegroundService systemForegroundService = this.f5957i;
        if (i7 >= 31) {
            AbstractC0653e.a(systemForegroundService, i9, notification, i8);
        } else if (i7 >= 29) {
            AbstractC0652d.a(systemForegroundService, i9, notification, i8);
        } else {
            systemForegroundService.startForeground(i9, notification);
        }
    }
}
