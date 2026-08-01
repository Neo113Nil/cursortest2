package b6;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Notification f1226e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1227i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f1228r;

    public b(SystemForegroundService systemForegroundService, int i3, Notification notification, int i10) {
        this.f1228r = systemForegroundService;
        this.f1225d = i3;
        this.f1226e = notification;
        this.f1227i = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = Build.VERSION.SDK_INT;
        int i10 = this.f1227i;
        SystemForegroundService systemForegroundService = this.f1228r;
        Notification notification = this.f1226e;
        int i11 = this.f1225d;
        if (i3 >= 31) {
            f.a(systemForegroundService, i11, notification, i10);
        } else if (i3 >= 29) {
            e.a(systemForegroundService, i11, notification, i10);
        } else {
            systemForegroundService.startForeground(i11, notification);
        }
    }
}
