package com.startapp.sdk.ads.list3d;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DView f93a;

    public d(List3DView list3DView) {
        this.f93a = list3DView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int a2;
        List3DView list3DView = this.f93a;
        if (list3DView.b != 1 || (a2 = list3DView.a(list3DView.c, list3DView.d)) == -1) {
            return;
        }
        this.f93a.a(a2);
    }
}
