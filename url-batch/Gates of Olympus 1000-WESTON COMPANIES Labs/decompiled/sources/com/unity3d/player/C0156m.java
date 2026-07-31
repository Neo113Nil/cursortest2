package com.unity3d.player;

import android.app.Activity;
import android.app.Dialog;
import android.window.OnBackInvokedDispatcher;
import com.unity3d.player.a.AbstractC0112e;
import com.unity3d.player.a.C0111d;
import com.unity3d.player.a.C0131y;

/* renamed from: com.unity3d.player.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0156m extends C0131y {
    public C0111d d;
    public final OnBackInvokedDispatcher e;
    public final int f;

    public C0156m(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, Runnable runnable) {
        super(runnable);
        this.d = null;
        this.f = i;
        this.e = onBackInvokedDispatcher;
    }

    public static C0131y a(Object obj, int i, Runnable runnable) {
        C0131y c0131y;
        if (PlatformSupport.TIRAMISU_SUPPORT && ((obj instanceof Activity) || (obj instanceof Dialog))) {
            c0131y = new C0156m(AbstractC0112e.a(obj), i, runnable);
        } else {
            c0131y = new C0131y(runnable);
        }
        c0131y.registerOnBackPressedCallback();
        return c0131y;
    }

    @Override // com.unity3d.player.a.C0131y
    public void registerOnBackPressedCallback() {
        if (this.a != null) {
            return;
        }
        super.registerOnBackPressedCallback();
        if (PlatformSupport.TIRAMISU_SUPPORT) {
            C0111d c0111d = new C0111d(this.a);
            this.d = c0111d;
            AbstractC0112e.a(this.e, this.f, c0111d);
        }
    }

    @Override // com.unity3d.player.a.C0131y
    public void unregisterOnBackPressedCallback() {
        if (this.a != null) {
            if (PlatformSupport.TIRAMISU_SUPPORT) {
                AbstractC0112e.a(this.e, this.d);
                this.d = null;
            }
            super.unregisterOnBackPressedCallback();
        }
    }
}
