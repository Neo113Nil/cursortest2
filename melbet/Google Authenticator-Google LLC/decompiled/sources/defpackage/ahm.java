package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahm extends ahh {
    private final OnBackInvokedDispatcher a;
    private final int b;
    private final OnBackInvokedCallback e;
    private boolean f;

    public ahm(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.a = onBackInvokedDispatcher;
        this.b = i;
        this.e = Build.VERSION.SDK_INT == 33 ? new me(this, 3) : new ahl(this);
    }

    @Override // defpackage.ahh
    protected final void a(boolean z) {
        boolean z2 = this.f;
        if (z) {
            if (z2) {
                return;
            }
            this.a.registerOnBackInvokedCallback(this.b, this.e);
            this.f = true;
            return;
        }
        if (z2) {
            this.a.unregisterOnBackInvokedCallback(this.e);
            this.f = false;
        }
    }
}
