package com.unity3d.player;

import android.app.Activity;
import android.app.Dialog;
import android.window.OnBackInvokedDispatcher;
import h1.AbstractC2464z;
import h1.C2462x;

/* renamed from: com.unity3d.player.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1770q extends h1.X {

    /* renamed from: d, reason: collision with root package name */
    public C2462x f22233d;

    /* renamed from: e, reason: collision with root package name */
    public final OnBackInvokedDispatcher f22234e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22235f;

    public C1770q(OnBackInvokedDispatcher onBackInvokedDispatcher, int i4, Runnable runnable) {
        super(runnable);
        this.f22233d = null;
        this.f22235f = i4;
        this.f22234e = onBackInvokedDispatcher;
    }

    public static h1.X a(Object obj, int i4, Runnable runnable) {
        h1.X c1770q = (PlatformSupport.TIRAMISU_SUPPORT && ((obj instanceof Activity) || (obj instanceof Dialog))) ? new C1770q(AbstractC2464z.a(obj), i4, runnable) : new h1.X(runnable);
        c1770q.registerOnBackPressedCallback();
        return c1770q;
    }

    @Override // h1.X
    public void registerOnBackPressedCallback() {
        if (this.f36724a != null) {
            return;
        }
        super.registerOnBackPressedCallback();
        if (PlatformSupport.TIRAMISU_SUPPORT) {
            C2462x c2462x = new C2462x(this.f36724a);
            this.f22233d = c2462x;
            AbstractC2464z.b(this.f22234e, this.f22235f, c2462x);
        }
    }

    @Override // h1.X
    public void unregisterOnBackPressedCallback() {
        if (this.f36724a != null) {
            if (PlatformSupport.TIRAMISU_SUPPORT) {
                AbstractC2464z.c(this.f22234e, this.f22233d);
                this.f22233d = null;
            }
            super.unregisterOnBackPressedCallback();
        }
    }
}
