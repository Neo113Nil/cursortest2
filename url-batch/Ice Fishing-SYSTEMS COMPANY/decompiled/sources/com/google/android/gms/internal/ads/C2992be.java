package com.google.android.gms.internal.ads;

import B2.C0280n;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import q2.InterfaceC4900l0;
import q2.InterfaceC4921w0;

/* renamed from: com.google.android.gms.internal.ads.be, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2992be extends NativeAd {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2667Mb f29523a;

    /* renamed from: c, reason: collision with root package name */
    public final C2937ae f29525c;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f29524b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f29526d = new ArrayList();

    public C2992be(InterfaceC2667Mb interfaceC2667Mb) {
        new AtomicLong();
        this.f29523a = interfaceC2667Mb;
        C2937ae c2937ae = null;
        try {
            List f6 = interfaceC2667Mb.f();
            if (f6 != null) {
                for (Object obj : f6) {
                    InterfaceC3637nb G32 = obj instanceof IBinder ? BinderC3098db.G3((IBinder) obj) : null;
                    if (G32 != null) {
                        this.f29524b.add(new C2937ae(G32));
                    }
                }
            }
        } catch (RemoteException e6) {
            u2.i.d("", e6);
        }
        try {
            List R8 = this.f29523a.R();
            if (R8 != null) {
                for (Object obj2 : R8) {
                    InterfaceC4900l0 G33 = obj2 instanceof IBinder ? q2.L0.G3((IBinder) obj2) : null;
                    if (G33 != null) {
                        this.f29526d.add(new C0280n(G33));
                    }
                }
            }
        } catch (RemoteException e9) {
            u2.i.d("", e9);
        }
        try {
            InterfaceC3637nb g9 = this.f29523a.g();
            if (g9 != null) {
                c2937ae = new C2937ae(g9);
            }
        } catch (RemoteException e10) {
            u2.i.d("", e10);
        }
        this.f29525c = c2937ae;
        try {
            if (this.f29523a.n() != null) {
                new C3562m7(this.f29523a.n());
            }
        } catch (RemoteException e11) {
            u2.i.d("", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void a() {
        try {
            this.f29523a.I();
        } catch (RemoteException e6) {
            u2.i.d("", e6);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String b() {
        try {
            return this.f29523a.h();
        } catch (RemoteException e6) {
            u2.i.d("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String c() {
        try {
            return this.f29523a.e();
        } catch (RemoteException e6) {
            u2.i.d("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String d() {
        try {
            return this.f29523a.l();
        } catch (RemoteException e6) {
            u2.i.d("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String e() {
        try {
            return this.f29523a.c();
        } catch (RemoteException e6) {
            u2.i.d("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final C2937ae f() {
        return this.f29525c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final ArrayList g() {
        return this.f29524b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final q2.N0 h() {
        try {
            InterfaceC2667Mb interfaceC2667Mb = this.f29523a;
            if (interfaceC2667Mb.B() != null) {
                return new q2.N0(interfaceC2667Mb.B());
            }
            return null;
        } catch (RemoteException e6) {
            u2.i.d("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String i() {
        try {
            return this.f29523a.m();
        } catch (RemoteException e6) {
            u2.i.d("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final k2.s j() {
        InterfaceC4921w0 interfaceC4921w0;
        try {
            interfaceC4921w0 = this.f29523a.K();
        } catch (RemoteException e6) {
            u2.i.d("", e6);
            interfaceC4921w0 = null;
        }
        if (interfaceC4921w0 != null) {
            return new k2.s(interfaceC4921w0);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Double k() {
        try {
            double j9 = this.f29523a.j();
            if (j9 == -1.0d) {
                return null;
            }
            return Double.valueOf(j9);
        } catch (RemoteException e6) {
            u2.i.d("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String l() {
        try {
            return this.f29523a.k();
        } catch (RemoteException e6) {
            u2.i.d("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void m(k2.p pVar) {
        try {
            this.f29523a.Y2(new q2.V0(pVar));
        } catch (RemoteException e6) {
            u2.i.d("Failed to setOnPaidEventListener", e6);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ V2.a n() {
        try {
            return this.f29523a.u();
        } catch (RemoteException e6) {
            u2.i.d("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordEvent(Bundle bundle) {
        try {
            this.f29523a.n2(bundle);
        } catch (RemoteException e6) {
            u2.i.d("Failed to record native event", e6);
        }
    }
}
