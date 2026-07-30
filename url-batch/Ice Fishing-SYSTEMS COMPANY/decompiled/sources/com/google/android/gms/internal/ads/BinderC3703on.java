package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.anythink.core.c.b.e;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4896j0;
import q2.InterfaceC4900l0;
import q2.InterfaceC4911r0;
import q2.InterfaceC4921w0;

/* renamed from: com.google.android.gms.internal.ads.on, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3703on extends AbstractBinderC3186f8 implements InterfaceC2667Mb {

    /* renamed from: n, reason: collision with root package name */
    public final String f33207n;

    /* renamed from: u, reason: collision with root package name */
    public final C3648nm f33208u;

    /* renamed from: v, reason: collision with root package name */
    public final C3917sm f33209v;

    /* renamed from: w, reason: collision with root package name */
    public final C3165eo f33210w;

    public BinderC3703on(String str, C3648nm c3648nm, C3917sm c3917sm, C3165eo c3165eo) {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        this.f33207n = str;
        this.f33208u = c3648nm;
        this.f33209v = c3917sm;
        this.f33210w = c3165eo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final InterfaceC3529lb B() {
        InterfaceC3529lb interfaceC3529lb;
        C3756pm c3756pm = this.f33208u.f33001F;
        synchronized (c3756pm) {
            interfaceC3529lb = c3756pm.f33505a;
        }
        return interfaceC3529lb;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        List list;
        InterfaceC3637nb interfaceC3637nb;
        double d2;
        String p6;
        String p9;
        V2.a aVar;
        List list2;
        q2.L0 l02;
        boolean g9;
        C3270gk c3270gk;
        C3270gk c3270gk2;
        int i4 = 0;
        C2633Kb c2633Kb = null;
        C4896j0 c4896j0 = null;
        switch (i) {
            case 2:
                String a9 = this.f33209v.a();
                parcel2.writeNoException();
                parcel2.writeString(a9);
                return true;
            case 3:
                C3917sm c3917sm = this.f33209v;
                synchronized (c3917sm) {
                    list = c3917sm.f34279e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 4:
                String c4 = this.f33209v.c();
                parcel2.writeNoException();
                parcel2.writeString(c4);
                return true;
            case 5:
                C3917sm c3917sm2 = this.f33209v;
                synchronized (c3917sm2) {
                    interfaceC3637nb = c3917sm2.f34292s;
                }
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, interfaceC3637nb);
                return true;
            case 6:
                String e6 = this.f33209v.e();
                parcel2.writeNoException();
                parcel2.writeString(e6);
                return true;
            case 7:
                String f6 = this.f33209v.f();
                parcel2.writeNoException();
                parcel2.writeString(f6);
                return true;
            case 8:
                C3917sm c3917sm3 = this.f33209v;
                synchronized (c3917sm3) {
                    d2 = c3917sm3.f34291r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d2);
                return true;
            case 9:
                C3917sm c3917sm4 = this.f33209v;
                synchronized (c3917sm4) {
                    p6 = c3917sm4.p("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(p6);
                return true;
            case 10:
                C3917sm c3917sm5 = this.f33209v;
                synchronized (c3917sm5) {
                    p9 = c3917sm5.p(e.a.f12225h);
                }
                parcel2.writeNoException();
                parcel2.writeString(p9);
                return true;
            case 11:
                q2.A0 r9 = this.f33209v.r();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, r9);
                return true;
            case 12:
                String str = this.f33207n;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                I();
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC3421jb s3 = this.f33209v.s();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, s3);
                return true;
            case 15:
                Bundle bundle = (Bundle) AbstractC3241g8.b(parcel, Bundle.CREATOR);
                AbstractC3241g8.f(parcel);
                C3648nm c3648nm = this.f33208u;
                synchronized (c3648nm) {
                    c3648nm.f33007n.f(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) AbstractC3241g8.b(parcel, Bundle.CREATOR);
                AbstractC3241g8.f(parcel);
                boolean p10 = this.f33208u.p(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(p10 ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) AbstractC3241g8.b(parcel, Bundle.CREATOR);
                AbstractC3241g8.f(parcel);
                C3648nm c3648nm2 = this.f33208u;
                synchronized (c3648nm2) {
                    c3648nm2.f33007n.n(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 18:
                V2.a u7 = u();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, u7);
                return true;
            case 19:
                C3917sm c3917sm6 = this.f33209v;
                synchronized (c3917sm6) {
                    aVar = c3917sm6.f34290q;
                }
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, aVar);
                return true;
            case 20:
                Bundle d3 = this.f33209v.d();
                parcel2.writeNoException();
                AbstractC3241g8.d(parcel2, d3);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    c2633Kb = queryLocalInterface instanceof C2633Kb ? (C2633Kb) queryLocalInterface : new C2633Kb(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener", 2);
                }
                AbstractC3241g8.f(parcel);
                H3(c2633Kb);
                parcel2.writeNoException();
                return true;
            case 22:
                C3648nm c3648nm3 = this.f33208u;
                synchronized (c3648nm3) {
                    c3648nm3.f33007n.y();
                }
                parcel2.writeNoException();
                return true;
            case 23:
                List R8 = R();
                parcel2.writeNoException();
                parcel2.writeList(R8);
                return true;
            case 24:
                C3917sm c3917sm7 = this.f33209v;
                synchronized (c3917sm7) {
                    list2 = c3917sm7.f34280f;
                }
                if (!list2.isEmpty()) {
                    synchronized (c3917sm7) {
                        l02 = c3917sm7.f34281g;
                    }
                    if (l02 != null) {
                        i4 = 1;
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3241g8.f30958a;
                parcel2.writeInt(i4);
                return true;
            case 25:
                InterfaceC4900l0 G32 = q2.L0.G3(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                G3(G32);
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    c4896j0 = queryLocalInterface2 instanceof C4896j0 ? (C4896j0) queryLocalInterface2 : new C4896j0(readStrongBinder2, "com.google.android.gms.ads.internal.client.IMuteThisAdListener", 2);
                }
                AbstractC3241g8.f(parcel);
                C3648nm c3648nm4 = this.f33208u;
                synchronized (c3648nm4) {
                    c3648nm4.f33007n.p(c4896j0);
                }
                parcel2.writeNoException();
                return true;
            case 27:
                C3648nm c3648nm5 = this.f33208u;
                synchronized (c3648nm5) {
                    c3648nm5.f33007n.e();
                }
                parcel2.writeNoException();
                return true;
            case 28:
                C3648nm c3648nm6 = this.f33208u;
                synchronized (c3648nm6) {
                    AbstractBinderC3186f8 abstractBinderC3186f8 = c3648nm6.f33016w;
                    if (abstractBinderC3186f8 == null) {
                        int i9 = t2.C.f40822b;
                        u2.i.a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                    } else {
                        c3648nm6.f33005l.execute(new B2.D(3, c3648nm6, abstractBinderC3186f8 instanceof ViewTreeObserverOnGlobalLayoutListenerC4187xm));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 29:
                InterfaceC3529lb B8 = B();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, B8);
                return true;
            case 30:
                C3648nm c3648nm7 = this.f33208u;
                synchronized (c3648nm7) {
                    g9 = c3648nm7.f33007n.g();
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3241g8.f30958a;
                parcel2.writeInt(g9 ? 1 : 0);
                return true;
            case 31:
                InterfaceC4921w0 K8 = K();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, K8);
                return true;
            case 32:
                InterfaceC4911r0 G33 = q2.V0.G3(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                Y2(G33);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) AbstractC3241g8.b(parcel, Bundle.CREATOR);
                AbstractC3241g8.f(parcel);
                n2(bundle4);
                parcel2.writeNoException();
                return true;
            case 34:
                C3648nm c3648nm8 = this.f33208u;
                long j9 = (c3648nm8 == null || (c3270gk = c3648nm8.f24811j) == null) ? 0L : c3270gk.f31098a.get();
                parcel2.writeNoException();
                parcel2.writeLong(j9);
                return true;
            case 35:
                long readLong = parcel.readLong();
                AbstractC3241g8.f(parcel);
                C3648nm c3648nm9 = this.f33208u;
                if (c3648nm9 != null && (c3270gk2 = c3648nm9.f24811j) != null) {
                    c3270gk2.a(readLong);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public final void G3(InterfaceC4900l0 interfaceC4900l0) {
        C3648nm c3648nm = this.f33208u;
        synchronized (c3648nm) {
            c3648nm.f33007n.c(interfaceC4900l0);
        }
    }

    public final void H3(C2633Kb c2633Kb) {
        C3648nm c3648nm = this.f33208u;
        synchronized (c3648nm) {
            c3648nm.f33007n.b(c2633Kb);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final void I() {
        this.f33208u.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final InterfaceC4921w0 K() {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31441F7)).booleanValue()) {
            return this.f33208u.f24808f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final List R() {
        List list;
        q2.L0 l02;
        List list2;
        C3917sm c3917sm = this.f33209v;
        synchronized (c3917sm) {
            list = c3917sm.f34280f;
        }
        if (!list.isEmpty()) {
            synchronized (c3917sm) {
                l02 = c3917sm.f34281g;
            }
            if (l02 != null) {
                C3917sm c3917sm2 = this.f33209v;
                synchronized (c3917sm2) {
                    list2 = c3917sm2.f34280f;
                }
                return list2;
            }
        }
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final void Y2(InterfaceC4911r0 interfaceC4911r0) {
        try {
            if (!interfaceC4911r0.f()) {
                this.f33210w.b();
            }
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.b("Error in making CSI ping for reporting paid event callback", e6);
        }
        C3648nm c3648nm = this.f33208u;
        synchronized (c3648nm) {
            c3648nm.f33002G.f25227n.set(interfaceC4911r0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final String c() {
        return this.f33209v.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final String e() {
        return this.f33209v.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final List f() {
        List list;
        C3917sm c3917sm = this.f33209v;
        synchronized (c3917sm) {
            list = c3917sm.f34279e;
        }
        return list;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final InterfaceC3637nb g() {
        InterfaceC3637nb interfaceC3637nb;
        C3917sm c3917sm = this.f33209v;
        synchronized (c3917sm) {
            interfaceC3637nb = c3917sm.f34292s;
        }
        return interfaceC3637nb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final String h() {
        return this.f33209v.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final double j() {
        double d2;
        C3917sm c3917sm = this.f33209v;
        synchronized (c3917sm) {
            d2 = c3917sm.f34291r;
        }
        return d2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final String k() {
        String p6;
        C3917sm c3917sm = this.f33209v;
        synchronized (c3917sm) {
            p6 = c3917sm.p("store");
        }
        return p6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final String l() {
        return this.f33209v.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final String m() {
        String p6;
        C3917sm c3917sm = this.f33209v;
        synchronized (c3917sm) {
            p6 = c3917sm.p(e.a.f12225h);
        }
        return p6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final InterfaceC3421jb n() {
        return this.f33209v.s();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final void n2(Bundle bundle) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.we)).booleanValue()) {
            C3648nm c3648nm = this.f33208u;
            InterfaceC3858rh h9 = c3648nm.f33006m.h();
            if (h9 == null) {
                int i = t2.C.f40822b;
                u2.i.c("Video webview is null");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, bundle.get(str));
                }
                c3648nm.f33005l.execute(new RunnableC2861Xi(h9, jSONObject));
            } catch (JSONException e6) {
                int i4 = t2.C.f40822b;
                u2.i.d("Error reading event signals", e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final q2.A0 p() {
        return this.f33209v.r();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final V2.a u() {
        return new V2.b(this.f33208u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final V2.a v() {
        V2.a aVar;
        C3917sm c3917sm = this.f33209v;
        synchronized (c3917sm) {
            aVar = c3917sm.f34290q;
        }
        return aVar;
    }
}
