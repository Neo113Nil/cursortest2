package com.unity3d.player;

/* loaded from: classes2.dex */
public final class G implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UnityAccessibilityDelegate f22016c;

    public G(UnityAccessibilityDelegate unityAccessibilityDelegate, int i4, int i5) {
        this.f22016c = unityAccessibilityDelegate;
        this.f22014a = i4;
        this.f22015b = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22016c.sendEventForVirtualViewId(this.f22014a, this.f22015b);
    }
}
