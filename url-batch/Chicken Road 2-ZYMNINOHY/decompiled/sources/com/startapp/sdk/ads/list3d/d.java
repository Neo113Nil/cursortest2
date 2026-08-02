package com.startapp.sdk.ads.list3d;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DView f6202a;

    public d(List3DView list3DView) {
        this.f6202a = list3DView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int a3;
        List3DView list3DView = this.f6202a;
        if (list3DView.f6179b != 1 || (a3 = list3DView.a(list3DView.f6180c, list3DView.f6181d)) == -1) {
            return;
        }
        this.f6202a.a(a3);
    }
}
