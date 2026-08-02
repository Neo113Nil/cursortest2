package com.startapp.sdk.ads.list3d;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DView f3119a;

    public d(List3DView list3DView) {
        this.f3119a = list3DView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int a3;
        List3DView list3DView = this.f3119a;
        if (list3DView.f3096b != 1 || (a3 = list3DView.a(list3DView.f3097c, list3DView.f3098d)) == -1) {
            return;
        }
        this.f3119a.a(a3);
    }
}
