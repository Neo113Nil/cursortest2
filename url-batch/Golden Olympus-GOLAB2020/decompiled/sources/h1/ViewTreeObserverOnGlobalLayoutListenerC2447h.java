package h1;

import android.view.ViewTreeObserver;

/* renamed from: h1.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2447h implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.unity3d.player.D f36742a;

    public ViewTreeObserverOnGlobalLayoutListenerC2447h(com.unity3d.player.D d4) {
        this.f36742a = d4;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f36742a.reportSoftInputArea();
    }
}
