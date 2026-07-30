package R0;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;
import p.BinderC4845e;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2788n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2789u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2790v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Parcelable f2791w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2792x;

    public b(SystemForegroundService systemForegroundService, int i, Notification notification, int i4) {
        this.f2792x = systemForegroundService;
        this.f2789u = i;
        this.f2791w = notification;
        this.f2790v = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2788n) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                int i4 = this.f2790v;
                Notification notification = (Notification) this.f2791w;
                int i9 = this.f2789u;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f2792x;
                if (i < 31) {
                    if (i < 29) {
                        systemForegroundService.startForeground(i9, notification);
                        break;
                    } else {
                        c.a(systemForegroundService, i9, notification, i4);
                        break;
                    }
                } else {
                    d.a(systemForegroundService, i9, notification, i4);
                    break;
                }
            default:
                ((BinderC4845e) this.f2792x).f39753u.c(this.f2789u, this.f2790v, (Bundle) this.f2791w);
                break;
        }
    }

    public b(BinderC4845e binderC4845e, int i, int i4, Bundle bundle) {
        this.f2792x = binderC4845e;
        this.f2789u = i;
        this.f2790v = i4;
        this.f2791w = bundle;
    }
}
