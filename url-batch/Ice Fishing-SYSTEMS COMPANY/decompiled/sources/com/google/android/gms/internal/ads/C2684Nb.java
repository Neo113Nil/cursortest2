package com.google.android.gms.internal.ads;

import a.AbstractC0415a;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import q2.C4892h0;

/* renamed from: com.google.android.gms.internal.ads.Nb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2684Nb extends D2.a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f26568w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2684Nb(String str, int i) {
        super(1, str);
        this.f26568w = i;
    }

    @Override // D2.a
    public final /* synthetic */ Object h(IBinder iBinder) {
        switch (this.f26568w) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                return queryLocalInterface instanceof InterfaceC4014ub ? (InterfaceC4014ub) queryLocalInterface : new C3906sb(iBinder);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                return queryLocalInterface2 instanceof InterfaceC3586me ? (InterfaceC3586me) queryLocalInterface2 : new C3478ke(iBinder);
            case 2:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                return queryLocalInterface3 instanceof C4892h0 ? (C4892h0) queryLocalInterface3 : new C4892h0(iBinder);
            case 3:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface4 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                return queryLocalInterface4 instanceof q2.H ? (q2.H) queryLocalInterface4 : new q2.H(iBinder);
            case 4:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface5 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return queryLocalInterface5 instanceof q2.L ? (q2.L) queryLocalInterface5 : new q2.L(iBinder);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface6 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                return queryLocalInterface6 instanceof q2.T ? (q2.T) queryLocalInterface6 : new q2.T(iBinder);
        }
    }

    public q2.K s(Context context, q2.g1 g1Var, String str, InterfaceC3423jd interfaceC3423jd, int i) {
        q2.L l9;
        q2.g1 g1Var2;
        String str2;
        InterfaceC3423jd interfaceC3423jd2;
        int i4;
        AbstractC3368ia.a(context);
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.cc)).booleanValue()) {
            try {
                V2.b bVar = new V2.b(context);
                try {
                    IBinder b9 = AbstractC0415a.I(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl");
                    if (b9 == null) {
                        g1Var2 = g1Var;
                        str2 = str;
                        interfaceC3423jd2 = interfaceC3423jd;
                        i4 = i;
                        l9 = null;
                    } else {
                        IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        l9 = queryLocalInterface instanceof q2.L ? (q2.L) queryLocalInterface : new q2.L(b9);
                        g1Var2 = g1Var;
                        str2 = str;
                        interfaceC3423jd2 = interfaceC3423jd;
                        i4 = i;
                    }
                    IBinder R02 = l9.R0(bVar, g1Var2, str2, interfaceC3423jd2, i4);
                    if (R02 != null) {
                        IInterface queryLocalInterface2 = R02.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                        return queryLocalInterface2 instanceof q2.K ? (q2.K) queryLocalInterface2 : new q2.I(R02);
                    }
                } catch (Exception e6) {
                    throw new u2.j(e6);
                }
            } catch (RemoteException e9) {
                e = e9;
                Exception exc = e;
                C4287ze.a(context).e("AdManagerCreator.newAdManagerByDynamiteLoader", exc);
                u2.i.i("#007 Could not call remote method.", exc);
                return null;
            } catch (NullPointerException e10) {
                e = e10;
                Exception exc2 = e;
                C4287ze.a(context).e("AdManagerCreator.newAdManagerByDynamiteLoader", exc2);
                u2.i.i("#007 Could not call remote method.", exc2);
                return null;
            } catch (u2.j e11) {
                e = e11;
                Exception exc22 = e;
                C4287ze.a(context).e("AdManagerCreator.newAdManagerByDynamiteLoader", exc22);
                u2.i.i("#007 Could not call remote method.", exc22);
                return null;
            }
        } else {
            try {
                IBinder R03 = ((q2.L) j(context)).R0(new V2.b(context), g1Var, str, interfaceC3423jd, i);
                if (R03 != null) {
                    IInterface queryLocalInterface3 = R03.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return queryLocalInterface3 instanceof q2.K ? (q2.K) queryLocalInterface3 : new q2.I(R03);
                }
            } catch (V2.c e12) {
                e = e12;
                u2.i.b("Could not create remote AdManager.", e);
                return null;
            } catch (RemoteException e13) {
                e = e13;
                u2.i.b("Could not create remote AdManager.", e);
                return null;
            }
        }
        return null;
    }
}
