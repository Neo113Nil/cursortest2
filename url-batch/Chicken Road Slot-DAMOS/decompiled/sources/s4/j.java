package s4;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import m.v1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: c, reason: collision with root package name */
    public final OnBackInvokedDispatcher f8441c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8442d;

    /* renamed from: e, reason: collision with root package name */
    public final OnBackInvokedCallback f8443e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8444f;

    public j(OnBackInvokedDispatcher onBackInvokedDispatcher, int i3) {
        this.f8441c = onBackInvokedDispatcher;
        this.f8442d = i3;
        this.f8443e = Build.VERSION.SDK_INT == 33 ? new v1(1, this) : new k(this);
    }

    @Override // s4.f
    public final void b(boolean z10) {
        if (z10 && !this.f8444f) {
            this.f8441c.registerOnBackInvokedCallback(this.f8442d, this.f8443e);
            this.f8444f = true;
        } else {
            if (z10 || !this.f8444f) {
                return;
            }
            this.f8441c.unregisterOnBackInvokedCallback(this.f8443e);
            this.f8444f = false;
        }
    }
}
