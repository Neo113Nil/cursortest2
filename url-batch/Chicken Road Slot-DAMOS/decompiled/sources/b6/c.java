package b6;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import w5.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1229d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1230e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1231i;

    /* renamed from: r, reason: collision with root package name */
    public final Object f1232r;

    public c(SystemForegroundService systemForegroundService, int i3, Notification notification) {
        this.f1229d = 0;
        this.f1232r = systemForegroundService;
        this.f1230e = i3;
        this.f1231i = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1229d) {
            case 0:
                ((SystemForegroundService) this.f1232r).f787s.notify(this.f1230e, (Notification) this.f1231i);
                break;
            case 1:
                ((TextView) this.f1231i).setTypeface((Typeface) this.f1232r, this.f1230e);
                break;
            default:
                ((i) this.f1231i).a(this.f1230e, (Intent) this.f1232r);
                break;
        }
    }

    public /* synthetic */ c(int i3, int i10, Object obj, Object obj2) {
        this.f1229d = i10;
        this.f1231i = obj;
        this.f1232r = obj2;
        this.f1230e = i3;
    }
}
