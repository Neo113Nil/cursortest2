package k;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* renamed from: k.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0460t implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5101f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5102g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f5103h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f5104i;

    public /* synthetic */ RunnableC0460t(Object obj, Object obj2, int i7, int i8) {
        this.f5101f = i8;
        this.f5103h = obj;
        this.f5104i = obj2;
        this.f5102g = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5101f) {
            case 0:
                ((TextView) this.f5103h).setTypeface((Typeface) this.f5104i, this.f5102g);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((o0.i) this.f5103h).a(this.f5102g, (Intent) this.f5104i);
                break;
            default:
                ((SystemForegroundService) this.f5104i).f3592j.notify(this.f5102g, (Notification) this.f5103h);
                break;
        }
    }

    public RunnableC0460t(SystemForegroundService systemForegroundService, int i7, Notification notification) {
        this.f5101f = 2;
        this.f5104i = systemForegroundService;
        this.f5102g = i7;
        this.f5103h = notification;
    }
}
