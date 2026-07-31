package com.unity3d.player.a;

import android.window.OnBackInvokedCallback;

/* renamed from: com.unity3d.player.a.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0111d implements OnBackInvokedCallback {
    public final /* synthetic */ C0130x a;

    public C0111d(C0130x c0130x) {
        this.a = c0130x;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        Runnable runnable = this.a.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
