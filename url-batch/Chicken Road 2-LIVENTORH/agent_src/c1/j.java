package c1;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class j extends d {

    /* renamed from: c, reason: collision with root package name */
    public final OnBackInvokedDispatcher f779c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final OnBackInvokedCallback f780e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f781f;

    public j(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.f779c = onBackInvokedDispatcher;
        this.d = i;
        this.f780e = Build.VERSION.SDK_INT == 33 ? new k(0, this) : new l(this);
    }

    @Override // c1.d
    public final void b(boolean z3) {
        if (z3 && !this.f781f) {
            this.f779c.registerOnBackInvokedCallback(this.d, this.f780e);
            this.f781f = true;
        } else {
            if (z3 || !this.f781f) {
                return;
            }
            this.f779c.unregisterOnBackInvokedCallback(this.f780e);
            this.f781f = false;
        }
    }
}
