package A0;

import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender;
import androidx.work.impl.foreground.SystemForegroundService;
import v0.C1494i;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23d;

    public /* synthetic */ d(int i2, int i3, Object obj, Object obj2) {
        this.f20a = i3;
        this.f23d = obj;
        this.f21b = i2;
        this.f22c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20a) {
            case 0:
                ((SystemForegroundService) this.f23d).f4750e.notify(this.f21b, (Notification) this.f22c);
                break;
            case 1:
                ((androidx.activity.e) this.f23d).a(this.f21b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f22c));
                break;
            default:
                Intent intent = (Intent) this.f23d;
                ((C1494i) this.f22c).a(this.f21b, intent);
                break;
        }
    }

    public d(int i2, Intent intent, C1494i c1494i) {
        this.f20a = 2;
        this.f22c = c1494i;
        this.f23d = intent;
        this.f21b = i2;
    }
}
