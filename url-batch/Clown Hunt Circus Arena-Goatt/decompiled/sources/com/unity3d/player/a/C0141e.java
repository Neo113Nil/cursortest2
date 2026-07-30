package com.unity3d.player.a;

import android.window.OnBackInvokedCallback;

/* renamed from: com.unity3d.player.a.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0141e implements OnBackInvokedCallback {
    public final /* synthetic */ w a;

    public C0141e(w wVar) {
        this.a = wVar;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        Runnable runnable = this.a.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
