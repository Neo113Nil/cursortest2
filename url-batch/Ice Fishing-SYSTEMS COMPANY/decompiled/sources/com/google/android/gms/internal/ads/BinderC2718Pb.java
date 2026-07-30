package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Pb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2718Pb extends AbstractBinderC3186f8 implements InterfaceC2548Fb {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3602mu f26969n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC2718Pb(C3602mu c3602mu) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        this.f26969n = c3602mu;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC4284zb c4230yb;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c4230yb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            c4230yb = queryLocalInterface instanceof InterfaceC4284zb ? (InterfaceC4284zb) queryLocalInterface : new C4230yb(readStrongBinder);
        }
        AbstractC3241g8.f(parcel);
        j3(c4230yb);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2548Fb
    public final void j3(InterfaceC4284zb interfaceC4284zb) {
        Rx rx;
        String str;
        C3602mu c3602mu = this.f26969n;
        com.google.ads.mediation.e eVar = (com.google.ads.mediation.e) c3602mu.f32774u;
        synchronized (c3602mu) {
            rx = (Rx) c3602mu.f32776w;
            if (rx == null) {
                rx = new Rx(interfaceC4284zb);
                c3602mu.f32776w = rx;
            }
        }
        C4017ue c4017ue = (C4017ue) ((w2.m) eVar.f23706v);
        c4017ue.getClass();
        O2.w.d("#008 Must be called on the main UI thread.");
        try {
            str = ((InterfaceC4284zb) rx.f27448u).g();
        } catch (RemoteException e6) {
            u2.i.d("", e6);
            str = null;
        }
        u2.i.a("Adapter called onAdLoaded with template id ".concat(String.valueOf(str)));
        c4017ue.f34632w = rx;
        try {
            ((InterfaceC3693od) c4017ue.f34630u).h();
        } catch (RemoteException e9) {
            u2.i.i("#007 Could not call remote method.", e9);
        }
    }
}
