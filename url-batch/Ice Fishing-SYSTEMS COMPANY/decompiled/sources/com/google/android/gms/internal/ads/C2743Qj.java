package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.LinkedList;
import q2.InterfaceC4877a;

/* renamed from: com.google.android.gms.internal.ads.Qj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2743Qj implements InterfaceC2608Ik, InterfaceC4877a, InterfaceC2944al, InterfaceC2506Ck, InterfaceC3915sk, InterfaceC3539ll {

    /* renamed from: n, reason: collision with root package name */
    public final S2.a f27204n;

    /* renamed from: u, reason: collision with root package name */
    public final C2824Vf f27205u;

    public C2743Qj(S2.a aVar, C2824Vf c2824Vf) {
        this.f27204n = aVar;
        this.f27205u = c2824Vf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2944al
    public final void D(C2953au c2953au) {
        S2.a aVar = this.f27204n;
        C2824Vf c2824Vf = this.f27205u;
        aVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (c2824Vf.f28274d) {
            try {
                c2824Vf.f28280k = elapsedRealtime;
                if (elapsedRealtime != -1) {
                    c2824Vf.f28272b.a(c2824Vf);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void E() {
        C2824Vf c2824Vf = this.f27205u;
        synchronized (c2824Vf.f28274d) {
            try {
                if (c2824Vf.f28280k != -1) {
                    LinkedList linkedList = c2824Vf.f28273c;
                    if (!linkedList.isEmpty()) {
                        C2807Uf c2807Uf = (C2807Uf) linkedList.getLast();
                        if (c2807Uf.f28053b == -1) {
                            c2807Uf.f28054c.f28271a.getClass();
                            c2807Uf.f28053b = SystemClock.elapsedRealtime();
                            c2824Vf.f28272b.a(c2824Vf);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void F() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2944al
    public final void H(C2687Ne c2687Ne) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3539ll
    public final void I(E9 e9) {
        C2824Vf c2824Vf = this.f27205u;
        synchronized (c2824Vf.f28274d) {
            C2994bg c2994bg = c2824Vf.f28272b;
            synchronized (c2994bg.f29527n) {
                c2994bg.f29530w.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3539ll
    public final void M(E9 e9) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2608Ik
    public final void e() {
        C2824Vf c2824Vf = this.f27205u;
        synchronized (c2824Vf.f28274d) {
            try {
                if (c2824Vf.f28280k != -1) {
                    c2824Vf.f28271a.getClass();
                    c2824Vf.f28278h = SystemClock.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void f() {
    }

    @Override // q2.InterfaceC4877a
    public final void onAdClicked() {
        C2824Vf c2824Vf = this.f27205u;
        synchronized (c2824Vf.f28274d) {
            if (c2824Vf.f28280k != -1) {
                C2807Uf c2807Uf = new C2807Uf(c2824Vf);
                c2807Uf.f28054c.f28271a.getClass();
                c2807Uf.f28052a = SystemClock.elapsedRealtime();
                c2824Vf.f28273c.add(c2807Uf);
                c2824Vf.i++;
                C2994bg c2994bg = c2824Vf.f28272b;
                synchronized (c2994bg.f29527n) {
                    C2939ag c2939ag = c2994bg.f29530w;
                    synchronized (c2939ag.f29246f) {
                        c2939ag.f29249j++;
                    }
                }
                c2994bg.a(c2824Vf);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3539ll
    public final void q() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3539ll
    public final void t(E9 e9) {
        C2824Vf c2824Vf = this.f27205u;
        synchronized (c2824Vf.f28274d) {
            C2994bg c2994bg = c2824Vf.f28272b;
            synchronized (c2994bg.f29527n) {
                c2994bg.f29530w.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3539ll
    public final void u(boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void x() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2506Ck
    public final void y() {
        C2824Vf c2824Vf = this.f27205u;
        synchronized (c2824Vf.f28274d) {
            try {
                if (c2824Vf.f28280k != -1 && c2824Vf.f28277g == -1) {
                    c2824Vf.f28271a.getClass();
                    c2824Vf.f28277g = SystemClock.elapsedRealtime();
                    c2824Vf.f28272b.a(c2824Vf);
                }
                C2994bg c2994bg = c2824Vf.f28272b;
                synchronized (c2994bg.f29527n) {
                    C2939ag c2939ag = c2994bg.f29530w;
                    synchronized (c2939ag.f29246f) {
                        c2939ag.f29250k++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3539ll
    public final void z(boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void i(BinderC2772Se binderC2772Se, String str, String str2) {
    }
}
