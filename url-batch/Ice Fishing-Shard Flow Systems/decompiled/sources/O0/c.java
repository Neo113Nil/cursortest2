package O0;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1913d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1914e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1915i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Parcelable f1916l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1917m;

    public c(SystemForegroundService systemForegroundService, int i2, Notification notification, int i5) {
        this.f1917m = systemForegroundService;
        this.f1914e = i2;
        this.f1916l = notification;
        this.f1915i = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1913d) {
            case 0:
                Notification notification = (Notification) this.f1916l;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f1917m;
                int i2 = Build.VERSION.SDK_INT;
                int i5 = this.f1915i;
                int i7 = this.f1914e;
                if (i2 < 31) {
                    if (i2 < 29) {
                        systemForegroundService.startForeground(i7, notification);
                        break;
                    } else {
                        e.a(systemForegroundService, i7, notification, i5);
                        break;
                    }
                } else {
                    f.a(systemForegroundService, i7, notification, i5);
                    break;
                }
            default:
                ((q.f) this.f1917m).f7285f.onActivityResized(this.f1914e, this.f1915i, (Bundle) this.f1916l);
                break;
        }
    }

    public c(q.f fVar, int i2, int i5, Bundle bundle) {
        this.f1917m = fVar;
        this.f1914e = i2;
        this.f1915i = i5;
        this.f1916l = bundle;
    }
}
