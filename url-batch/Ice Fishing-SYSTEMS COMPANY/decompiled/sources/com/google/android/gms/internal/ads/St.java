package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class St extends AbstractBinderC3186f8 {

    /* renamed from: n, reason: collision with root package name */
    public final Pt f27632n;

    /* renamed from: u, reason: collision with root package name */
    public final Jt f27633u;

    /* renamed from: v, reason: collision with root package name */
    public final C3008bu f27634v;

    /* renamed from: w, reason: collision with root package name */
    public C2492Bn f27635w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f27636x;

    public St(Pt pt, Jt jt, C3008bu c3008bu) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        this.f27636x = false;
        this.f27632n = pt;
        this.f27633u = jt;
        this.f27634v = c3008bu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x021b, code lost:
    
        if (java.util.regex.Pattern.matches(r0, r7) != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0240, code lost:
    
        if (((java.lang.Boolean) q2.r.f40116e.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.v6)).booleanValue() == false) goto L158;
     */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        String str;
        q2.M m8;
        Bundle bundle;
        InterfaceC3858rh interfaceC3858rh;
        C2492Bn c2492Bn;
        C2823Ve c2823Ve = null;
        r2 = null;
        BinderC3754pk binderC3754pk = null;
        C2806Ue c2806Ue = null;
        if (i == 1) {
            C2840We c2840We = (C2840We) AbstractC3241g8.b(parcel, C2840We.CREATOR);
            AbstractC3241g8.f(parcel);
            synchronized (this) {
                O2.w.d("loadAd must be called on the main UI thread.");
                String str2 = c2840We.f28418u;
                String str3 = (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31794t6);
                if (str3 != null && str2 != null) {
                    try {
                    } catch (RuntimeException e6) {
                        p2.j.f39798C.f39808h.d("NonagonUtil.isPatternMatched", e6);
                    }
                }
                if (H3()) {
                }
                Lt lt = new Lt(22);
                this.f27635w = null;
                Pt pt = this.f27632n;
                pt.f27077h.f30543o.f1421u = 1;
                pt.a(c2840We.f28417n, c2840We.f28418u, lt, new C2478Aq(5, this));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            synchronized (this) {
                e1(null);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 3) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                c2823Ve = queryLocalInterface instanceof C2823Ve ? (C2823Ve) queryLocalInterface : new C2823Ve(readStrongBinder);
            }
            AbstractC3241g8.f(parcel);
            O2.w.d("setRewardedVideoAdListener can only be called from the UI thread.");
            this.f27633u.f25844x.set(c2823Ve);
            parcel2.writeNoException();
            return true;
        }
        if (i == 34) {
            boolean a9 = AbstractC3241g8.a(parcel);
            AbstractC3241g8.f(parcel);
            synchronized (this) {
                O2.w.d("setImmersiveMode must be called on the main UI thread.");
                this.f27636x = a9;
            }
            parcel2.writeNoException();
            return true;
        }
        int i4 = 0;
        switch (i) {
            case 5:
                O2.w.d("isLoaded must be called on the main UI thread.");
                boolean H32 = H3();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3241g8.f30958a;
                parcel2.writeInt(H32 ? 1 : 0);
                return true;
            case 6:
                z0(null);
                parcel2.writeNoException();
                return true;
            case 7:
                s3(null);
                parcel2.writeNoException();
                return true;
            case 8:
                G3(null);
                parcel2.writeNoException();
                return true;
            case 9:
                V2.a u02 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                z0(u02);
                parcel2.writeNoException();
                return true;
            case 10:
                V2.a u03 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                s3(u03);
                parcel2.writeNoException();
                return true;
            case 11:
                V2.a u04 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                G3(u04);
                parcel2.writeNoException();
                return true;
            case 12:
                synchronized (this) {
                    C2492Bn c2492Bn2 = this.f27635w;
                    str = c2492Bn2 != null ? c2492Bn2.f24808f.f33484n : null;
                }
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                String readString = parcel.readString();
                AbstractC3241g8.f(parcel);
                synchronized (this) {
                    O2.w.d("setUserId must be called on the main UI thread.");
                    this.f27634v.f29601a = readString;
                }
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    m8 = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    m8 = queryLocalInterface2 instanceof q2.M ? (q2.M) queryLocalInterface2 : new q2.M(readStrongBinder2, "com.google.android.gms.ads.internal.client.IAdMetadataListener", 2);
                }
                AbstractC3241g8.f(parcel);
                O2.w.d("setAdMetadataListener can only be called from the UI thread.");
                Jt jt = this.f27633u;
                if (m8 == null) {
                    jt.f25841u.set(null);
                } else {
                    jt.f25841u.set(new Qt(this, m8));
                }
                parcel2.writeNoException();
                return true;
            case 15:
                O2.w.d("getAdMetadata can only be called from the UI thread.");
                C2492Bn c2492Bn3 = this.f27635w;
                if (c2492Bn3 != null) {
                    C2659Lk c2659Lk = c2492Bn3.f24082q;
                    synchronized (c2659Lk) {
                        bundle = new Bundle(c2659Lk.f26200v);
                    }
                } else {
                    bundle = new Bundle();
                }
                parcel2.writeNoException();
                AbstractC3241g8.d(parcel2, bundle);
                return true;
            case 16:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                    c2806Ue = queryLocalInterface3 instanceof C2806Ue ? (C2806Ue) queryLocalInterface3 : new C2806Ue(readStrongBinder3, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener", 2);
                }
                AbstractC3241g8.f(parcel);
                O2.w.d("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
                this.f27633u.f25846z.set(c2806Ue);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.readString();
                AbstractC3241g8.f(parcel);
                parcel2.writeNoException();
                return true;
            case 18:
                V2.a u05 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                e1(u05);
                parcel2.writeNoException();
                return true;
            case 19:
                String readString2 = parcel.readString();
                AbstractC3241g8.f(parcel);
                synchronized (this) {
                    O2.w.d("#008 Must be called on the main UI thread.: setCustomData");
                    this.f27634v.f29602b = readString2;
                }
                parcel2.writeNoException();
                return true;
            case 20:
                C2492Bn c2492Bn4 = this.f27635w;
                if (c2492Bn4 != null && (interfaceC3858rh = (InterfaceC3858rh) c2492Bn4.f24078m.get()) != null && !interfaceC3858rh.U0()) {
                    i4 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3241g8.f30958a;
                parcel2.writeInt(i4);
                return true;
            case 21:
                synchronized (this) {
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31441F7)).booleanValue() && (c2492Bn = this.f27635w) != null) {
                        binderC3754pk = c2492Bn.f24808f;
                    }
                }
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, binderC3754pk);
                return true;
            default:
                return false;
        }
    }

    public final synchronized void G3(V2.a aVar) {
        O2.w.d("destroy must be called on the main UI thread.");
        Context context = null;
        this.f27633u.f25841u.set(null);
        if (this.f27635w != null) {
            if (aVar != null) {
                context = (Context) V2.b.A0(aVar);
            }
            C2540Ek c2540Ek = this.f27635w.f24805c;
            c2540Ek.getClass();
            c2540Ek.u1(new C3042ca(context, false));
        }
    }

    public final synchronized boolean H3() {
        C2492Bn c2492Bn = this.f27635w;
        if (c2492Bn != null) {
            if (!c2492Bn.f24083r.f26595u.get()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void e1(V2.a aVar) {
        try {
            O2.w.d("showAd must be called on the main UI thread.");
            if (this.f27635w != null) {
                Activity activity = null;
                if (aVar != null) {
                    Object A02 = V2.b.A0(aVar);
                    if (A02 instanceof Activity) {
                        activity = (Activity) A02;
                    }
                }
                this.f27635w.c(activity, this.f27636x);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void s3(V2.a aVar) {
        O2.w.d("resume must be called on the main UI thread.");
        if (this.f27635w != null) {
            Context context = aVar == null ? null : (Context) V2.b.A0(aVar);
            C2540Ek c2540Ek = this.f27635w.f24805c;
            c2540Ek.getClass();
            c2540Ek.u1(new C2602Ie(context, 1));
        }
    }

    public final synchronized void z0(V2.a aVar) {
        O2.w.d("pause must be called on the main UI thread.");
        if (this.f27635w != null) {
            Context context = aVar == null ? null : (Context) V2.b.A0(aVar);
            C2540Ek c2540Ek = this.f27635w.f24805c;
            c2540Ek.getClass();
            c2540Ek.u1(new C3314ha(context, 1));
        }
    }
}
