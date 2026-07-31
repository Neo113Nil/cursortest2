package s4;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import l.c2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j extends e {

    /* renamed from: c, reason: collision with root package name */
    public final OnBackInvokedDispatcher f6724c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6725d;

    /* renamed from: e, reason: collision with root package name */
    public final OnBackInvokedCallback f6726e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6727f;

    public j(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.f6724c = onBackInvokedDispatcher;
        this.f6725d = i;
        this.f6726e = Build.VERSION.SDK_INT == 33 ? new c2(1, this) : new k(this);
    }

    @Override // s4.e
    public final void b(boolean z3) {
        if (z3 && !this.f6727f) {
            this.f6724c.registerOnBackInvokedCallback(this.f6725d, this.f6726e);
            this.f6727f = true;
        } else {
            if (z3 || !this.f6727f) {
                return;
            }
            this.f6724c.unregisterOnBackInvokedCallback(this.f6726e);
            this.f6727f = false;
        }
    }
}
