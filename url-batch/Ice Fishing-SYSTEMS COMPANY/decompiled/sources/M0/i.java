package M0;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p.BinderC4845e;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1861n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1862u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f1863v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f1864w;

    public /* synthetic */ i(int i, int i4, Object obj, Object obj2) {
        this.f1861n = i4;
        this.f1863v = obj;
        this.f1864w = obj2;
        this.f1862u = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1861n) {
            case 0:
                Intent intent = (Intent) this.f1864w;
                ((j) this.f1863v).a(this.f1862u, intent);
                break;
            case 1:
                ((SystemForegroundService) this.f1864w).f5508x.notify(this.f1862u, (Notification) this.f1863v);
                break;
            case 2:
                ((TextView) this.f1863v).setTypeface((Typeface) this.f1864w, this.f1862u);
                break;
            case 3:
                ((BottomSheetBehavior) this.f1864w).E((View) this.f1863v, this.f1862u, false);
                break;
            default:
                ((BinderC4845e) this.f1864w).f39753u.e(this.f1862u, (Bundle) this.f1863v);
                break;
        }
    }

    public /* synthetic */ i(Object obj, int i, Parcelable parcelable, int i4) {
        this.f1861n = i4;
        this.f1864w = obj;
        this.f1862u = i;
        this.f1863v = parcelable;
    }

    public i(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f1861n = 3;
        this.f1864w = bottomSheetBehavior;
        this.f1863v = view;
        this.f1862u = i;
    }
}
