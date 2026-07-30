package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import z2.InterfaceC5272b;

/* renamed from: com.google.android.gms.internal.ads.Qb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2735Qb extends AbstractBinderC3186f8 implements InterfaceC2616Jb {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27171n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f27172u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC2735Qb(int i, Object obj) {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        this.f27171n = i;
        this.f27172u = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2667Mb c2650Lb;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c2650Lb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            c2650Lb = queryLocalInterface instanceof InterfaceC2667Mb ? (InterfaceC2667Mb) queryLocalInterface : new C2650Lb(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd", 2);
        }
        AbstractC3241g8.f(parcel);
        V0(c2650Lb);
        parcel2.writeNoException();
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:6|(2:7|8)|9|(2:10|11)|12|(2:13|14)|15|(2:16|17)|18|19|20|(19:61|23|24|25|26|27|28|29|30|31|(1:33)|35|36|37|(1:39)|41|(1:43)|44|45)|22|23|24|25|26|27|28|29|30|31|(0)|35|36|37|(0)|41|(0)|44|45) */
    /* JADX WARN: Can't wrap try/catch for region: R(32:6|(2:7|8)|9|10|11|12|(2:13|14)|15|(2:16|17)|18|19|20|(19:61|23|24|25|26|27|28|29|30|31|(1:33)|35|36|37|(1:39)|41|(1:43)|44|45)|22|23|24|25|26|27|28|29|30|31|(0)|35|36|37|(0)|41|(0)|44|45) */
    /* JADX WARN: Can't wrap try/catch for region: R(33:6|(2:7|8)|9|10|11|12|13|14|15|(2:16|17)|18|19|20|(19:61|23|24|25|26|27|28|29|30|31|(1:33)|35|36|37|(1:39)|41|(1:43)|44|45)|22|23|24|25|26|27|28|29|30|31|(0)|35|36|37|(0)|41|(0)|44|45) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c5, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c6, code lost:
    
        u2.i.d("Exception occurred while getting video controller", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a8, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
    
        u2.i.d("", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0096, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0097, code lost:
    
        u2.i.d("", r5);
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008b, code lost:
    
        u2.i.d("", r5);
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3 A[Catch: RemoteException -> 0x00a8, TRY_LEAVE, TryCatch #2 {RemoteException -> 0x00a8, blocks: (B:31:0x009d, B:33:0x00a3), top: B:30:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd A[Catch: RemoteException -> 0x00c5, TRY_LEAVE, TryCatch #6 {RemoteException -> 0x00c5, blocks: (B:37:0x00b7, B:39:0x00bd), top: B:36:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2616Jb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0(InterfaceC2667Mb interfaceC2667Mb) {
        String str;
        String str2;
        String str3;
        String str4;
        Double d2;
        V2.a v6;
        double j9;
        switch (this.f27171n) {
            case 0:
                r rVar = new r(interfaceC2667Mb);
                com.google.ads.mediation.e eVar = (com.google.ads.mediation.e) this.f27172u;
                eVar.getClass();
                com.google.ads.mediation.a aVar = new com.google.ads.mediation.a();
                aVar.f23696l = new Bundle();
                InterfaceC2667Mb interfaceC2667Mb2 = (InterfaceC2667Mb) rVar.f33919u;
                Object obj = null;
                try {
                    str = interfaceC2667Mb2.c();
                } catch (RemoteException e6) {
                    u2.i.d("", e6);
                    str = null;
                }
                aVar.f23686a = str;
                aVar.f23687b = (ArrayList) rVar.f33920v;
                try {
                    str2 = interfaceC2667Mb2.e();
                } catch (RemoteException e9) {
                    u2.i.d("", e9);
                    str2 = null;
                }
                aVar.f23688c = str2;
                aVar.f23689d = (C3691ob) rVar.f33921w;
                try {
                    str3 = interfaceC2667Mb2.l();
                } catch (RemoteException e10) {
                    u2.i.d("", e10);
                    str3 = null;
                }
                aVar.f23690e = str3;
                try {
                    str4 = interfaceC2667Mb2.h();
                } catch (RemoteException e11) {
                    u2.i.d("", e11);
                    str4 = null;
                }
                aVar.f23691f = str4;
                try {
                    j9 = interfaceC2667Mb2.j();
                } catch (RemoteException e12) {
                    u2.i.d("", e12);
                }
                try {
                    if (j9 != -1.0d) {
                        d2 = Double.valueOf(j9);
                        aVar.f23692g = d2;
                        String str5 = interfaceC2667Mb2.k();
                        aVar.f23693h = str5;
                        String str6 = interfaceC2667Mb2.m();
                        aVar.i = str6;
                        v6 = interfaceC2667Mb2.v();
                        if (v6 != null) {
                            obj = V2.b.A0(v6);
                        }
                        aVar.f23695k = obj;
                        aVar.f23697m = true;
                        aVar.f23698n = true;
                        k2.v vVar = (k2.v) rVar.f33922x;
                        if (interfaceC2667Mb2.p() != null) {
                            vVar.b(interfaceC2667Mb2.p());
                        }
                        aVar.f23694j = vVar;
                        C4017ue c4017ue = (C4017ue) ((w2.m) eVar.f23706v);
                        c4017ue.getClass();
                        O2.w.d("#008 Must be called on the main UI thread.");
                        u2.i.a("Adapter called onAdLoaded.");
                        c4017ue.f34631v = aVar;
                        if (!(((AbstractAdViewAdapter) eVar.f23705u) instanceof AdMobAdapter)) {
                            new k2.v().b(new BinderC4016ud());
                        }
                        ((InterfaceC3693od) c4017ue.f34630u).h();
                        break;
                    }
                    ((InterfaceC3693od) c4017ue.f34630u).h();
                } catch (RemoteException e13) {
                    u2.i.i("#007 Could not call remote method.", e13);
                    return;
                }
                d2 = null;
                aVar.f23692g = d2;
                String str52 = interfaceC2667Mb2.k();
                aVar.f23693h = str52;
                String str62 = interfaceC2667Mb2.m();
                aVar.i = str62;
                v6 = interfaceC2667Mb2.v();
                if (v6 != null) {
                }
                aVar.f23695k = obj;
                aVar.f23697m = true;
                aVar.f23698n = true;
                k2.v vVar2 = (k2.v) rVar.f33922x;
                if (interfaceC2667Mb2.p() != null) {
                }
                aVar.f23694j = vVar2;
                C4017ue c4017ue2 = (C4017ue) ((w2.m) eVar.f23706v);
                c4017ue2.getClass();
                O2.w.d("#008 Must be called on the main UI thread.");
                u2.i.a("Adapter called onAdLoaded.");
                c4017ue2.f34631v = aVar;
                if (!(((AbstractAdViewAdapter) eVar.f23705u) instanceof AdMobAdapter)) {
                }
            default:
                ((InterfaceC5272b) this.f27172u).onNativeAdLoaded(new C2992be(interfaceC2667Mb));
                break;
        }
    }
}
