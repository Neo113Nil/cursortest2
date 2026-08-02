package com.unity3d.player.a;

/* renamed from: com.unity3d.player.a.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0024y {
    public final Runnable b;
    public C0023x a = null;
    public boolean c = true;

    public C0024y(Runnable runnable) {
        this.b = runnable;
    }

    public void unregisterOnBackPressedCallback() {
        this.a = null;
    }

    public void registerOnBackPressedCallback() {
        if (this.a != null) {
            return;
        }
        this.a = new C0023x(this.b);
    }
}
