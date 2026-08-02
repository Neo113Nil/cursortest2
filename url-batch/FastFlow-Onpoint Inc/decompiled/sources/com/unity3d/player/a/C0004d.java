package com.unity3d.player.a;

import android.window.OnBackInvokedCallback;

/* renamed from: com.unity3d.player.a.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004d implements OnBackInvokedCallback {
    public final /* synthetic */ C0023x a;

    public C0004d(C0023x c0023x) {
        this.a = c0023x;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        Runnable runnable = this.a.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
