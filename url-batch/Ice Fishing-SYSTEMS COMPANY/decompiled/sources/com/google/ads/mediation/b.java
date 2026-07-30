package com.google.ads.mediation;

import O2.w;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C4017ue;
import com.google.android.gms.internal.ads.InterfaceC3693od;
import k2.AbstractC4632c;
import k2.C4643n;
import l2.InterfaceC4689d;
import q2.InterfaceC4877a;
import u2.i;
import w2.InterfaceC5160h;

/* loaded from: classes.dex */
public final class b extends AbstractC4632c implements InterfaceC4689d, InterfaceC4877a {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5160h f23699n;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, InterfaceC5160h interfaceC5160h) {
        this.f23699n = interfaceC5160h;
    }

    @Override // l2.InterfaceC4689d
    public final void l(String str, String str2) {
        C4017ue c4017ue = (C4017ue) this.f23699n;
        c4017ue.getClass();
        w.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAppEvent.");
        try {
            ((InterfaceC3693od) c4017ue.f34630u).e3(str, str2);
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // k2.AbstractC4632c
    public final void onAdClicked() {
        C4017ue c4017ue = (C4017ue) this.f23699n;
        c4017ue.getClass();
        w.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdClicked.");
        try {
            ((InterfaceC3693od) c4017ue.f34630u).c();
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // k2.AbstractC4632c
    public final void onAdClosed() {
        C4017ue c4017ue = (C4017ue) this.f23699n;
        c4017ue.getClass();
        w.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdClosed.");
        try {
            ((InterfaceC3693od) c4017ue.f34630u).f();
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // k2.AbstractC4632c
    public final void onAdFailedToLoad(C4643n c4643n) {
        ((C4017ue) this.f23699n).f(c4643n);
    }

    @Override // k2.AbstractC4632c
    public final void onAdLoaded() {
        C4017ue c4017ue = (C4017ue) this.f23699n;
        c4017ue.getClass();
        w.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdLoaded.");
        try {
            ((InterfaceC3693od) c4017ue.f34630u).h();
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // k2.AbstractC4632c
    public final void onAdOpened() {
        C4017ue c4017ue = (C4017ue) this.f23699n;
        c4017ue.getClass();
        w.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdOpened.");
        try {
            ((InterfaceC3693od) c4017ue.f34630u).l();
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
        }
    }
}
