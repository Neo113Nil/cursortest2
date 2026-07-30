package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Oc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2702Oc implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26704n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2634Kc f26705u;

    public /* synthetic */ RunnableC2702Oc(C2634Kc c2634Kc, int i) {
        this.f26704n = i;
        this.f26705u = c2634Kc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26704n) {
            case 0:
                C2634Kc c2634Kc = this.f26705u;
                InterfaceC3858rh interfaceC3858rh = c2634Kc.f25993n;
                if (interfaceC3858rh != null) {
                    interfaceC3858rh.destroy();
                    c2634Kc.f25993n = null;
                    break;
                }
                break;
            case 1:
                C2634Kc c2634Kc2 = this.f26705u;
                InterfaceC3858rh interfaceC3858rh2 = c2634Kc2.f25993n;
                if (interfaceC3858rh2 != null) {
                    interfaceC3858rh2.destroy();
                    c2634Kc2.f25993n = null;
                    break;
                }
                break;
            default:
                t2.C.k("maybeDestroy > Destroying engine.");
                C2871Yb c2871Yb = AbstractC2935ac.f29218j;
                C2634Kc c2634Kc3 = this.f26705u;
                c2634Kc3.e("/result", c2871Yb);
                InterfaceC3858rh interfaceC3858rh3 = c2634Kc3.f25993n;
                if (interfaceC3858rh3 != null) {
                    interfaceC3858rh3.destroy();
                    c2634Kc3.f25993n = null;
                    break;
                }
                break;
        }
    }
}
