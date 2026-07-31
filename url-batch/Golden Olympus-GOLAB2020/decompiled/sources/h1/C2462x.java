package h1;

import android.window.OnBackInvokedCallback;

/* renamed from: h1.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2462x implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f36767a;

    public C2462x(W w4) {
        this.f36767a = w4;
    }

    public final void onBackInvoked() {
        Runnable runnable = this.f36767a.f36723a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
