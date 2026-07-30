package com.unity3d.player;

import android.app.Activity;
import android.app.Dialog;
import android.window.OnBackInvokedDispatcher;
import com.unity3d.player.a.AbstractC0142f;
import com.unity3d.player.a.C0141e;

/* renamed from: com.unity3d.player.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188r extends com.unity3d.player.a.x {
    public C0141e d;
    public final OnBackInvokedDispatcher e;
    public final int f;

    public C0188r(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, Runnable runnable) {
        super(runnable);
        this.d = null;
        this.f = i;
        this.e = onBackInvokedDispatcher;
    }

    public static com.unity3d.player.a.x a(Object obj, int i, Runnable runnable) {
        com.unity3d.player.a.x xVar;
        if (PlatformSupport.TIRAMISU_SUPPORT && ((obj instanceof Activity) || (obj instanceof Dialog))) {
            xVar = new C0188r(AbstractC0142f.a(obj), i, runnable);
        } else {
            xVar = new com.unity3d.player.a.x(runnable);
        }
        xVar.registerOnBackPressedCallback();
        return xVar;
    }

    @Override // com.unity3d.player.a.x
    public void registerOnBackPressedCallback() {
        if (this.a != null) {
            return;
        }
        super.registerOnBackPressedCallback();
        if (PlatformSupport.TIRAMISU_SUPPORT) {
            C0141e c0141e = new C0141e(this.a);
            this.d = c0141e;
            AbstractC0142f.a(this.e, this.f, c0141e);
        }
    }

    @Override // com.unity3d.player.a.x
    public void unregisterOnBackPressedCallback() {
        if (this.a != null) {
            if (PlatformSupport.TIRAMISU_SUPPORT) {
                AbstractC0142f.a(this.e, this.d);
                this.d = null;
            }
            super.unregisterOnBackPressedCallback();
        }
    }
}
