package d1;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j extends d {

    /* renamed from: c, reason: collision with root package name */
    public final OnBackInvokedDispatcher f1300c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final OnBackInvokedCallback f1301e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1302f;

    public j(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.f1300c = onBackInvokedDispatcher;
        this.d = i;
        this.f1301e = Build.VERSION.SDK_INT == 33 ? new k(0, this) : new l(this);
    }

    @Override // d1.d
    public final void b(boolean z4) {
        if (z4 && !this.f1302f) {
            this.f1300c.registerOnBackInvokedCallback(this.d, this.f1301e);
            this.f1302f = true;
        } else {
            if (z4 || !this.f1302f) {
                return;
            }
            this.f1300c.unregisterOnBackInvokedCallback(this.f1301e);
            this.f1302f = false;
        }
    }
}
