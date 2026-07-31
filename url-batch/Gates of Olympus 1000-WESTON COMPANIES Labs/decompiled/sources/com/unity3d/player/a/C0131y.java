package com.unity3d.player.a;

/* renamed from: com.unity3d.player.a.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0131y {
    public final Runnable b;
    public C0130x a = null;
    public boolean c = true;

    public C0131y(Runnable runnable) {
        this.b = runnable;
    }

    public void unregisterOnBackPressedCallback() {
        this.a = null;
    }

    public void registerOnBackPressedCallback() {
        if (this.a != null) {
            return;
        }
        this.a = new C0130x(this.b);
    }
}
