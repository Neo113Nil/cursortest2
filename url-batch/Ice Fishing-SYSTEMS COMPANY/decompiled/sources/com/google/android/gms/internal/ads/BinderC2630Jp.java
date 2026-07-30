package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Jp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2630Jp extends AbstractBinderC3186f8 implements InterfaceC2568Ge {

    /* renamed from: n, reason: collision with root package name */
    public final Context f25813n;

    /* renamed from: u, reason: collision with root package name */
    public final C3157eg f25814u;

    /* renamed from: v, reason: collision with root package name */
    public final Rx f25815v;

    /* renamed from: w, reason: collision with root package name */
    public final C3214fi f25816w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayDeque f25817x;

    /* renamed from: y, reason: collision with root package name */
    public final Zu f25818y;

    public BinderC2630Jp(Context context, C3157eg c3157eg, C2837Wb c2837Wb, C3214fi c3214fi, Rx rx, ArrayDeque arrayDeque, Zu zu) {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
        AbstractC3368ia.a(context);
        this.f25813n = context;
        this.f25814u = c3157eg;
        this.f25815v = rx;
        this.f25816w = c3214fi;
        this.f25817x = arrayDeque;
        this.f25818y = zu;
    }

    public static Ku K3(Ku ku, Ou ou, C2855Xc c2855Xc, Yu yu, Vu vu) {
        C2889Zc a9 = c2855Xc.a("AFMA_getAdDictionary", AbstractC2655Lg.f26168C, C3431jl.f32182Q);
        PA.t(ku, vu);
        Ku r9 = ou.a(ku, Lu.BUILD_URL).h(a9).r();
        if (!((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue()) {
            return r9;
        }
        JD s3 = JD.s(r9);
        C2593Hm c2593Hm = new C2593Hm(19, yu, vu);
        s3.c(new MD(0, s3, c2593Hm), AbstractC3212fg.f30745h);
        return r9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2568Ge
    public final void E1(C2687Ne c2687Ne, InterfaceC2636Ke interfaceC2636Ke) {
        L3(H3(c2687Ne, Binder.getCallingUid()), interfaceC2636Ke, c2687Ne);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2636Ke interfaceC2636Ke = null;
        C2653Le c2653Le = null;
        InterfaceC2636Ke interfaceC2636Ke2 = null;
        InterfaceC2636Ke interfaceC2636Ke3 = null;
        InterfaceC2636Ke interfaceC2636Ke4 = null;
        switch (i) {
            case 1:
                AbstractC3241g8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                }
                AbstractC3241g8.f(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                C2687Ne c2687Ne = (C2687Ne) AbstractC3241g8.b(parcel, C2687Ne.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    interfaceC2636Ke = queryLocalInterface instanceof InterfaceC2636Ke ? (InterfaceC2636Ke) queryLocalInterface : new C2585He(readStrongBinder2);
                }
                AbstractC3241g8.f(parcel);
                L0(c2687Ne, interfaceC2636Ke);
                parcel2.writeNoException();
                return true;
            case 5:
                C2687Ne c2687Ne2 = (C2687Ne) AbstractC3241g8.b(parcel, C2687Ne.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    interfaceC2636Ke4 = queryLocalInterface2 instanceof InterfaceC2636Ke ? (InterfaceC2636Ke) queryLocalInterface2 : new C2585He(readStrongBinder3);
                }
                AbstractC3241g8.f(parcel);
                a2(c2687Ne2, interfaceC2636Ke4);
                parcel2.writeNoException();
                return true;
            case 6:
                C2687Ne c2687Ne3 = (C2687Ne) AbstractC3241g8.b(parcel, C2687Ne.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    interfaceC2636Ke3 = queryLocalInterface3 instanceof InterfaceC2636Ke ? (InterfaceC2636Ke) queryLocalInterface3 : new C2585He(readStrongBinder4);
                }
                AbstractC3241g8.f(parcel);
                E1(c2687Ne3, interfaceC2636Ke3);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    interfaceC2636Ke2 = queryLocalInterface4 instanceof InterfaceC2636Ke ? (InterfaceC2636Ke) queryLocalInterface4 : new C2585He(readStrongBinder5);
                }
                AbstractC3241g8.f(parcel);
                Q2(readString, interfaceC2636Ke2);
                parcel2.writeNoException();
                return true;
            case 8:
                C2534Ee c2534Ee = (C2534Ee) AbstractC3241g8.b(parcel, C2534Ee.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    c2653Le = queryLocalInterface5 instanceof C2653Le ? (C2653Le) queryLocalInterface5 : new C2653Le(readStrongBinder6, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener", 2);
                }
                AbstractC3241g8.f(parcel);
                if (((Boolean) AbstractC2870Ya.f28831a.r()).booleanValue()) {
                    this.f25816w.getClass();
                    String str = c2534Ee.f24776n;
                    OD od = OD.f26665u;
                    od.c(new MD(0, od, new C2593Hm(this, c2653Le, c2534Ee)), AbstractC3212fg.f30745h);
                } else {
                    try {
                        Parcel A02 = c2653Le.A0();
                        A02.writeString("");
                        AbstractC3241g8.c(A02, c2534Ee);
                        c2653Le.G0(A02, 1);
                    } catch (RemoteException e6) {
                        t2.C.l("Service can't call client", e6);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                String readString2 = parcel.readString();
                AbstractC3241g8.f(parcel);
                p0(readString2);
                parcel2.writeNoException();
                return true;
        }
    }

    public final Ku G3(C2687Ne c2687Ne, int i) {
        C2579Gp M32;
        Ku r9;
        C2518Df c2518Df = p2.j.f39798C.f39817r;
        C5107a a9 = C5107a.a();
        Context context = this.f25813n;
        C2855Xc c4 = c2518Df.c(context, a9, this.f25818y);
        C3214fi c3214fi = this.f25816w;
        c3214fi.getClass();
        C3159ei c3159ei = new C3159ei(c3214fi.f30795b, new G1.a(c2687Ne, i, 11));
        C2889Zc a10 = c4.a("google.afma.response.normalize", C2596Hp.f25423d, C2837Wb.f28396v);
        if (((Boolean) AbstractC2768Sa.f27572a.r()).booleanValue()) {
            M32 = M3(c2687Ne.f26573A);
            if (M32 == null) {
                t2.C.k("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = c2687Ne.f26575C;
            if (str != null && !str.isEmpty()) {
                t2.C.k("Request contained a PoolKey but split request is disabled.");
            }
            M32 = null;
        }
        Vu f6 = M32 == null ? Vu.f(context, 9) : M32.f25220d;
        Yu yu = (Yu) c3159ei.i.d();
        yu.b(c2687Ne.f26579n.getStringArrayList("ad_types"));
        C2698Np c2698Np = new C2698Np(c2687Ne.f26585z, yu, f6);
        C4017ue c4017ue = new C4017ue(context, c2687Ne.f26580u.f41217n, (Object) null, 12);
        Ou ou = (Ou) c3159ei.f30462j.d();
        Vu f9 = Vu.f(context, 11);
        Lu lu = Lu.PRE_PROCESS;
        Lu lu2 = Lu.HTTP;
        CallableC2988ba callableC2988ba = CallableC2988ba.f29507f;
        if (M32 == null) {
            Ku r10 = ou.a(C3686oN.c(c2687Ne.f26579n), Lu.GMS_SIGNALS).h(new C2936ad(8, c3159ei, c2687Ne)).f(C3431jl.f32181P).r();
            Ku K32 = K3(r10, ou, c4, yu, f6);
            Vu f10 = Vu.f(context, 10);
            List asList = Arrays.asList(K32, r10);
            CallableC3538lk callableC3538lk = new CallableC3538lk(K32, c2687Ne, r10);
            SB sb = UB.f27942u;
            asList.getClass();
            UB n9 = UB.n(asList);
            C3157eg c3157eg = AbstractC3212fg.f30745h;
            GD gd = new GD(n9, true, false);
            gd.f25114I = new FD(gd, callableC2988ba, c3157eg);
            gd.w();
            GD gd2 = new GD(n9, true, false);
            C3157eg c3157eg2 = ou.f26777a;
            gd2.f25114I = new FD(gd2, callableC3538lk, c3157eg2);
            gd2.w();
            Ku r11 = new Q8(ou, lu2, null, gd, asList, gd2).f(c2698Np).f(new C4086vt(2, f10)).f(c4017ue).r();
            PA.Q(r11, yu, f10, false);
            PA.t(r11, f9);
            List asList2 = Arrays.asList(r10, K32, r11);
            CallableC2831Vm callableC2831Vm = new CallableC2831Vm(c2687Ne, r11, r10, K32, 1);
            SB sb2 = UB.f27942u;
            asList2.getClass();
            UB n10 = UB.n(asList2);
            C3157eg c3157eg3 = AbstractC3212fg.f30745h;
            GD gd3 = new GD(n10, true, false);
            gd3.f25114I = new FD(gd3, callableC2988ba, c3157eg3);
            gd3.w();
            GD gd4 = new GD(n10, true, false);
            gd4.f25114I = new FD(gd4, callableC2831Vm, c3157eg2);
            gd4.w();
            r9 = new Q8(ou, lu, null, gd3, asList2, gd4).h(a10).r();
        } else {
            C2681Mp c2681Mp = new C2681Mp(M32.f25218b, M32.f25217a);
            Vu f11 = Vu.f(context, 10);
            Ku r12 = ou.a(C3686oN.c(c2681Mp), lu2).f(c2698Np).f(new C4086vt(2, f11)).f(c4017ue).r();
            PA.Q(r12, yu, f11, false);
            OD c9 = C3686oN.c(M32);
            PA.t(r12, f9);
            List asList3 = Arrays.asList(r12, c9);
            T6 t62 = new T6(8, r12, c9);
            SB sb3 = UB.f27942u;
            asList3.getClass();
            UB n11 = UB.n(asList3);
            C3157eg c3157eg4 = AbstractC3212fg.f30745h;
            GD gd5 = new GD(n11, true, false);
            gd5.f25114I = new FD(gd5, callableC2988ba, c3157eg4);
            gd5.w();
            GD gd6 = new GD(n11, true, false);
            gd6.f25114I = new FD(gd6, t62, ou.f26777a);
            gd6.w();
            r9 = new Q8(ou, lu, null, gd5, asList3, gd6).h(a10).r();
        }
        PA.Q(r9, yu, f9, false);
        return r9;
    }

    public final J3.a H3(final C2687Ne c2687Ne, int i) {
        if (!((Boolean) AbstractC2768Sa.f27572a.r()).booleanValue()) {
            return C3686oN.l(new Exception("Split request is disabled."));
        }
        C4087vu c4087vu = c2687Ne.f26574B;
        if (c4087vu == null) {
            return C3686oN.l(new Exception("Pool configuration missing from request."));
        }
        if (c4087vu.f34893w == 0 || c4087vu.f34894x == 0) {
            return C3686oN.l(new Exception("Caching is disabled."));
        }
        C2518Df c2518Df = p2.j.f39798C.f39817r;
        C5107a a9 = C5107a.a();
        Zu zu = this.f25818y;
        Context context = this.f25813n;
        C2855Xc c4 = c2518Df.c(context, a9, zu);
        C3214fi c3214fi = this.f25816w;
        c3214fi.getClass();
        C3159ei c3159ei = new C3159ei(c3214fi.f30795b, new G1.a(c2687Ne, i, 11));
        Ou ou = (Ou) c3159ei.f30462j.d();
        final Ku r9 = ou.a(C3686oN.c(c2687Ne.f26579n), Lu.GMS_SIGNALS).h(new C2936ad(8, c3159ei, c2687Ne)).f(C3431jl.f32181P).r();
        Yu yu = (Yu) c3159ei.i.d();
        final Vu f6 = Vu.f(context, 9);
        final Ku K32 = K3(r9, ou, c4, yu, f6);
        Lu lu = Lu.GET_URL_AND_CACHE_KEY;
        List asList = Arrays.asList(r9, K32);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.Fp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BinderC2630Jp binderC2630Jp = BinderC2630Jp.this;
                Ku ku = K32;
                Ku ku2 = r9;
                C2687Ne c2687Ne2 = c2687Ne;
                Vu vu = f6;
                binderC2630Jp.getClass();
                String str = ((C2704Oe) ku.f26063v.get()).i;
                C2579Gp c2579Gp = new C2579Gp((C2704Oe) ku.f26063v.get(), (JSONObject) ku2.f26063v.get(), c2687Ne2.f26573A, vu);
                synchronized (binderC2630Jp) {
                    synchronized (binderC2630Jp) {
                        int intValue = ((Long) AbstractC2768Sa.f27573b.r()).intValue();
                        while (true) {
                            ArrayDeque arrayDeque = binderC2630Jp.f25817x;
                            if (arrayDeque.size() >= intValue) {
                                arrayDeque.removeFirst();
                            }
                        }
                    }
                    return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
                }
                binderC2630Jp.f25817x.addLast(c2579Gp);
                return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            }
        };
        SB sb = UB.f27942u;
        asList.getClass();
        UB n9 = UB.n(asList);
        CallableC2988ba callableC2988ba = CallableC2988ba.f29507f;
        C3157eg c3157eg = AbstractC3212fg.f30745h;
        GD gd = new GD(n9, true, false);
        gd.f25114I = new FD(gd, callableC2988ba, c3157eg);
        gd.w();
        GD gd2 = new GD(n9, true, false);
        gd2.f25114I = new FD(gd2, callable, ou.f26777a);
        gd2.w();
        return new Q8(ou, lu, null, gd, asList, gd2).r();
    }

    public final J3.a I3(String str) {
        if (((Boolean) AbstractC2768Sa.f27572a.r()).booleanValue()) {
            return M3(str) == null ? C3686oN.l(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : C3686oN.c(new C2545Ep());
        }
        return C3686oN.l(new Exception("Split request is disabled."));
    }

    public final J3.a J3(C2687Ne c2687Ne, int i) {
        int i4 = 3;
        int i9 = 2;
        int i10 = 1;
        int i11 = 25;
        int i12 = 0;
        C2518Df c2518Df = p2.j.f39798C.f39817r;
        C5107a a9 = C5107a.a();
        Context context = this.f25813n;
        C2855Xc c4 = c2518Df.c(context, a9, this.f25818y);
        if (!((Boolean) AbstractC2836Wa.f28394a.r()).booleanValue()) {
            return C3686oN.l(new Exception("Signal collection disabled."));
        }
        C3214fi c3214fi = this.f25816w;
        c3214fi.getClass();
        G1.a aVar = new G1.a(c2687Ne, i, 11);
        C3115dt c3115dt = new C3115dt(aVar, i12);
        C3913si c3913si = new C3913si(i11, c3115dt);
        C3214fi c3214fi2 = c3214fi.f30795b;
        C4009uN c4009uN = c3214fi2.f30799d;
        C2860Xh c2860Xh = c3214fi2.f30805g;
        C2941ai c2941ai = new C2941ai(c4009uN, c2860Xh, 8);
        C3115dt c3115dt2 = new C3115dt(aVar, i10);
        C3115dt c3115dt3 = new C3115dt(aVar, i9);
        C3115dt c3115dt4 = new C3115dt(aVar, i4);
        C4184xj c4184xj = new C4184xj(c2860Xh, c4009uN, c3115dt2, c3115dt3, c3115dt4, 14);
        C3225ft c3225ft = new C3225ft(i12);
        C2877Yh c2877Yh = new C2877Yh(c2860Xh, 28);
        C4009uN c4009uN2 = c3214fi2.f30766I;
        Is is = new Is(c3115dt, c4009uN2, c4009uN, i4);
        C4184xj c4184xj2 = new C4184xj(c4009uN2, c3115dt4, c3115dt, c4009uN, new C3115dt(aVar, 5), 15);
        C4009uN a10 = C4009uN.a(new Kt(c3214fi2.f30751A, 6));
        C3115dt c3115dt5 = new C3115dt(aVar, 4);
        C4009uN a11 = C4009uN.a(AbstractC2720Pd.f26977B);
        C4009uN a12 = C4009uN.a(AbstractC3035cL.f29678A);
        C4009uN a13 = C4009uN.a(AbstractC2655Lg.f26172G);
        C4009uN a14 = C4009uN.a(AbstractC3217fl.f30863A);
        int i13 = C4171xN.f35143b;
        LinkedHashMap g9 = YD.g(4);
        Lu lu = Lu.GMS_SIGNALS;
        AbstractC3137eE.d(a11, "provider");
        g9.put(lu, a11);
        Lu lu2 = Lu.BUILD_URL;
        AbstractC3137eE.d(a12, "provider");
        g9.put(lu2, a12);
        Lu lu3 = Lu.HTTP;
        AbstractC3137eE.d(a13, "provider");
        g9.put(lu3, a13);
        Lu lu4 = Lu.PRE_PROCESS;
        AbstractC3137eE.d(a14, "provider");
        g9.put(lu4, a14);
        C4009uN a15 = C4009uN.a(new C2484Bf(c3115dt5, c3214fi2.f30805g, new C4171xN(g9), 12));
        int i14 = AN.f23864c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(a15);
        C4009uN a16 = C4009uN.a(new C4247ys(c3214fi2.f30799d, new C3861rk(new AN(list, arrayList), 25), 16));
        Context context2 = c3214fi2.f30793a.f28060b;
        AbstractC3137eE.h(context2);
        Object d2 = c3214fi2.f30786S0.d();
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        String string = ((C2687Ne) aVar.f1195v).f26579n.getString("ms");
        if (string == null) {
            string = "";
        }
        C3278gs c3278gs = new C3278gs(5, c3157eg, string);
        C3157eg c3157eg2 = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg2);
        ArrayList arrayList2 = c2687Ne.f26583x;
        AbstractC3137eE.h(arrayList2);
        C3278gs c3278gs2 = new C3278gs(6, c3157eg2, arrayList2);
        InterfaceC3901sN b9 = C4009uN.b(c4184xj);
        InterfaceC3901sN b10 = C4009uN.b(c2877Yh);
        C4009uN.b(c3913si);
        InterfaceC3901sN b11 = C4009uN.b(c2941ai);
        InterfaceC3901sN b12 = C4009uN.b(c3225ft);
        C4009uN.b(c4184xj2);
        InterfaceC3901sN b13 = C4009uN.b(is);
        AbstractC3137eE.h(c3157eg2);
        Yu yu = (Yu) a10.d();
        HashSet hashSet = new HashSet();
        hashSet.add((C3007bt) d2);
        hashSet.add(c3278gs);
        hashSet.add(c3278gs2);
        C3151ea c3151ea = AbstractC3368ia.f31471J6;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            hashSet.add((Rs) b9.d());
        }
        C3151ea c3151ea2 = AbstractC3368ia.f31480K6;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue()) {
            hashSet.add((Rs) b10.d());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31498M6)).booleanValue()) {
            hashSet.add((Rs) b11.d());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31507N6)).booleanValue()) {
            hashSet.add((Rs) b12.d());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31556T3)).booleanValue()) {
            hashSet.add((Rs) b13.d());
        }
        C2518Df c2518Df2 = new C2518Df(context2, c3157eg2, hashSet, yu);
        C2889Zc a17 = c4.a("google.afma.request.getSignals", AbstractC2655Lg.f26168C, C2837Wb.f28396v);
        Vu f6 = Vu.f(context, 22);
        Ou ou = (Ou) a16.d();
        Lu lu5 = Lu.GET_SIGNALS;
        Bundle bundle = c2687Ne.f26579n;
        Q8 h9 = ou.a(C3686oN.c(bundle), lu5).f(new C4086vt(2, f6)).h(new C2936ad(9, c2518Df2, c2687Ne));
        Lu lu6 = Lu.JS_SIGNALS;
        Ku r9 = ((Ou) h9.f27124y).a(h9.r(), lu6).h(a17).r();
        Yu yu2 = (Yu) a10.d();
        yu2.b(bundle.getStringArrayList("ad_types"));
        yu2.d(bundle.getBundle("extras"));
        PA.Q(r9, yu2, f6, true);
        if (((Boolean) AbstractC2632Ka.f25986j.r()).booleanValue()) {
            Rx rx = this.f25815v;
            Objects.requireNonNull(rx);
            r9.c(new RunnableC2613Ip(rx, 0), this.f25814u);
        }
        return r9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2568Ge
    public final void L0(C2687Ne c2687Ne, InterfaceC2636Ke interfaceC2636Ke) {
        Bundle bundle;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31467J2)).booleanValue() && (bundle = c2687Ne.f26578F) != null) {
            p2.j.f39798C.f39810k.getClass();
            bundle.putLong("service-connected", System.currentTimeMillis());
        }
        Ku G32 = G3(c2687Ne, Binder.getCallingUid());
        L3(G32, interfaceC2636Ke, c2687Ne);
        if (((Boolean) AbstractC2632Ka.i.r()).booleanValue()) {
            Rx rx = this.f25815v;
            Objects.requireNonNull(rx);
            G32.c(new RunnableC2613Ip(rx, 1), this.f25814u);
        }
    }

    public final void L3(J3.a aVar, InterfaceC2636Ke interfaceC2636Ke, C2687Ne c2687Ne) {
        C3945tD y6 = C3686oN.y(aVar, new C2538Ei(7), AbstractC3212fg.f30738a);
        C2593Hm c2593Hm = new C2593Hm(this, c2687Ne, interfaceC2636Ke);
        y6.c(new MD(0, y6, c2593Hm), AbstractC3212fg.f30745h);
    }

    public final synchronized C2579Gp M3(String str) {
        Iterator it = this.f25817x.iterator();
        while (it.hasNext()) {
            C2579Gp c2579Gp = (C2579Gp) it.next();
            if (c2579Gp.f25219c.equals(str)) {
                it.remove();
                return c2579Gp;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2568Ge
    public final void Q2(String str, InterfaceC2636Ke interfaceC2636Ke) {
        L3(I3(str), interfaceC2636Ke, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2568Ge
    public final void a2(C2687Ne c2687Ne, InterfaceC2636Ke interfaceC2636Ke) {
        Bundle bundle;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31467J2)).booleanValue() && (bundle = c2687Ne.f26578F) != null) {
            p2.j.f39798C.f39810k.getClass();
            bundle.putLong("service-connected", System.currentTimeMillis());
        }
        L3(J3(c2687Ne, Binder.getCallingUid()), interfaceC2636Ke, c2687Ne);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2568Ge
    public final void p0(String str) {
        C2664Lp n9;
        Binder.getCallingUid();
        C3151ea c3151ea = AbstractC3368ia.zf;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            String str2 = (String) rVar.f40119c.a(AbstractC3368ia.Af);
            if (str2.isEmpty()) {
                return;
            }
            com.bumptech.glide.manager.o d2 = com.bumptech.glide.manager.o.d(new TA(','));
            t2.C.k("AdRequestServiceImpl: Preconnecting");
            Iterator g9 = ((InterfaceC3352iB) d2.f23625w).g(d2, str2);
            do {
                AbstractC3298hB abstractC3298hB = (AbstractC3298hB) g9;
                if (!abstractC3298hB.hasNext()) {
                    return;
                }
                String str3 = (String) abstractC3298hB.next();
                Context context = this.f25813n;
                C4017ue c4017ue = new C4017ue(context, str, "HEAD", 12);
                HashMap hashMap = new HashMap();
                hashMap.put("User-Agent", p2.j.f39798C.f39803c.E(context, str));
                try {
                    n9 = c4017ue.n(new C2647Kp(str3, 30000, hashMap, new byte[0], ""));
                } catch (Exception e6) {
                    throw new RemoteException(e6.getMessage());
                }
            } while (n9.f26222a == 200);
            int i = n9.f26222a;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
            sb.append("Unexpected preconnect response: ");
            sb.append(i);
            throw new RemoteException(sb.toString());
        }
    }
}
