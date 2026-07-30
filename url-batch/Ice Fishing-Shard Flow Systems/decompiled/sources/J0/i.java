package J0;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1346d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1347e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1348i;

    /* renamed from: l, reason: collision with root package name */
    public final Object f1349l;

    public /* synthetic */ i(int i2, int i5, Object obj, Object obj2) {
        this.f1346d = i5;
        this.f1348i = obj;
        this.f1349l = obj2;
        this.f1347e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1346d) {
            case 0:
                ((j) this.f1348i).a(this.f1347e, (Intent) this.f1349l);
                break;
            case 1:
                ((SystemForegroundService) this.f1349l).f4121m.notify(this.f1347e, (Notification) this.f1348i);
                break;
            case 2:
                ((TextView) this.f1348i).setTypeface((Typeface) this.f1349l, this.f1347e);
                break;
            default:
                ((q.f) this.f1349l).f7285f.onNavigationEvent(this.f1347e, (Bundle) this.f1348i);
                break;
        }
    }

    public /* synthetic */ i(Object obj, int i2, Parcelable parcelable, int i5) {
        this.f1346d = i5;
        this.f1349l = obj;
        this.f1347e = i2;
        this.f1348i = parcelable;
    }
}
