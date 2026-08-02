package com.unity3d.player;

import android.app.Activity;
import android.app.Dialog;
import android.window.OnBackInvokedDispatcher;
import com.unity3d.player.a.AbstractC0005e;
import com.unity3d.player.a.C0004d;
import com.unity3d.player.a.C0024y;

/* renamed from: com.unity3d.player.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049m extends C0024y {
    public C0004d d;
    public final OnBackInvokedDispatcher e;
    public final int f;

    public C0049m(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, Runnable runnable) {
        super(runnable);
        this.d = null;
        this.f = i;
        this.e = onBackInvokedDispatcher;
    }

    public static C0024y a(Object obj, int i, Runnable runnable) {
        C0024y c0024y;
        if (PlatformSupport.TIRAMISU_SUPPORT && ((obj instanceof Activity) || (obj instanceof Dialog))) {
            c0024y = new C0049m(AbstractC0005e.a(obj), i, runnable);
        } else {
            c0024y = new C0024y(runnable);
        }
        c0024y.registerOnBackPressedCallback();
        return c0024y;
    }

    @Override // com.unity3d.player.a.C0024y
    public void registerOnBackPressedCallback() {
        if (this.a != null) {
            return;
        }
        super.registerOnBackPressedCallback();
        if (PlatformSupport.TIRAMISU_SUPPORT) {
            C0004d c0004d = new C0004d(this.a);
            this.d = c0004d;
            AbstractC0005e.a(this.e, this.f, c0004d);
        }
    }

    @Override // com.unity3d.player.a.C0024y
    public void unregisterOnBackPressedCallback() {
        if (this.a != null) {
            if (PlatformSupport.TIRAMISU_SUPPORT) {
                AbstractC0005e.a(this.e, this.d);
                this.d = null;
            }
            super.unregisterOnBackPressedCallback();
        }
    }
}
