package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3968tj implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34447n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3858rh f34448u;

    public /* synthetic */ RunnableC3968tj(InterfaceC3858rh interfaceC3858rh, int i) {
        this.f34447n = i;
        this.f34448u = interfaceC3858rh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34447n) {
            case 0:
                this.f34448u.onPause();
                break;
            case 1:
                this.f34448u.onResume();
                break;
            case 2:
                this.f34448u.destroy();
                break;
            case 3:
                this.f34448u.a("onSdkImpression", new s.b());
                break;
            case 4:
                this.f34448u.destroy();
                break;
            default:
                this.f34448u.y0();
                break;
        }
    }
}
