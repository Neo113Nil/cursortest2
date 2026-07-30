package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.RemoteException;
import android.telephony.TelephonyManager;
import android.view.View;
import android.webkit.WebView;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p.AbstractC4846f;
import q2.C4927z0;
import q2.InterfaceC4921w0;

/* renamed from: com.google.android.gms.internal.ads.hp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3329hp implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31269n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f31270u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f31271v;

    public /* synthetic */ RunnableC3329hp(int i, Object obj, Object obj2) {
        this.f31269n = i;
        this.f31270u = obj;
        this.f31271v = obj2;
    }

    private final void a() {
        Object c4266zA;
        IInterface iInterface;
        IBinder iBinder = (IBinder) this.f31271v;
        int i = AA.f23838n;
        if (iBinder == null) {
            c4266zA = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
            c4266zA = queryLocalInterface instanceof BA ? (BA) queryLocalInterface : new C4266zA(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService", 2);
        }
        JA ja = (JA) this.f31270u;
        C2631Jq c2631Jq = ja.f25737n;
        c2631Jq.f25821C = c4266zA;
        ((HE) c2631Jq.f25825w).a("linkToDeath", new Object[0]);
        try {
            iInterface = (BA) c2631Jq.f25821C;
        } catch (RemoteException e6) {
            ((HE) ja.f25737n.f25825w).d(e6, "linkToDeath failed", new Object[0]);
        }
        if (iInterface == null) {
            throw null;
        }
        ((Z2.a) iInterface).f4243u.linkToDeath((KA) c2631Jq.f25819A, 0);
        C2631Jq c2631Jq2 = ja.f25737n;
        c2631Jq2.f25822n = false;
        synchronized (((ArrayList) c2631Jq2.f25827y)) {
            try {
                Iterator it = ((ArrayList) c2631Jq2.f25827y).iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                ((ArrayList) c2631Jq2.f25827y).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final /* synthetic */ void b() {
        ((UO) this.f31270u).f27994w.reportPlaybackMetrics((PlaybackMetrics) this.f31271v);
    }

    private final /* synthetic */ void c() {
        ((UO) this.f31270u).f27994w.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f31271v);
    }

    private final void d() {
        C3932t0 c3932t0 = (C3932t0) this.f31270u;
        c3932t0.getClass();
        String str = AbstractC3548lu.f32613a;
        c3932t0.f34333b.f28243n.f30033X.N((KN) this.f31271v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0433 A[Catch: all -> 0x02ff, TryCatch #14 {all -> 0x02ff, blocks: (B:118:0x02e0, B:120:0x02fc, B:123:0x0302, B:125:0x03c5, B:128:0x03ca, B:129:0x03d1, B:131:0x0433, B:132:0x043f, B:134:0x044f, B:136:0x0457, B:138:0x0463, B:139:0x046d, B:140:0x0491), top: B:117:0x02e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x044f A[Catch: all -> 0x02ff, TryCatch #14 {all -> 0x02ff, blocks: (B:118:0x02e0, B:120:0x02fc, B:123:0x0302, B:125:0x03c5, B:128:0x03ca, B:129:0x03d1, B:131:0x0433, B:132:0x043f, B:134:0x044f, B:136:0x0457, B:138:0x0463, B:139:0x046d, B:140:0x0491), top: B:117:0x02e0 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String b9;
        PowerManager.WakeLock wakeLock;
        String str;
        C2754Rd c2754Rd;
        int i;
        long j9;
        boolean z8;
        int i4 = 3;
        int i9 = 1;
        switch (this.f31269n) {
            case 0:
                C3382ip c3382ip = (C3382ip) this.f31270u;
                c3382ip.getClass();
                C3851ra c3851ra = p2.j.f39798C.f39813n;
                Context context = (Context) this.f31271v;
                if (c3851ra.f34041n.getAndSet(true)) {
                    return;
                }
                c3851ra.f34042u = context;
                c3851ra.f34043v = c3382ip.f32007u;
                if (c3851ra.f34045x != null || (b9 = AbstractC4846f.b(context)) == null || b9.equals(context.getPackageName())) {
                    return;
                }
                AbstractC4846f.a(context, b9, c3851ra);
                return;
            case 1:
                C2955aw c2955aw = (C2955aw) this.f31270u;
                Iterator it = c2955aw.f29353d.values().iterator();
                while (it.hasNext()) {
                    ((Wv) it.next()).c();
                }
                Timer timer = new Timer();
                timer.schedule(new C2851Wp(c2955aw, (Rx) this.f31271v, timer), 1000L);
                return;
            case 2:
                Yv yv = Yv.f28919n;
                C2955aw c2955aw2 = (C2955aw) this.f31270u;
                Iterator it2 = c2955aw2.f29353d.values().iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    View view = (View) this.f31271v;
                    if (!hasNext) {
                        c2955aw2.f29354e.a(view, yv);
                        return;
                    } else {
                        Wv wv = (Wv) it2.next();
                        if (!wv.f28531f) {
                            wv.f28527b.a(view, yv);
                        }
                    }
                }
            case 3:
                C4299zq c4299zq = (C4299zq) this.f31270u;
                c4299zq.getClass();
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f31271v;
                interfaceC3858rh.c1();
                BinderC2554Fh g9 = interfaceC3858rh.g();
                q2.a1 a1Var = c4299zq.f35618d.f30898a;
                if (a1Var != null && g9 != null) {
                    g9.H3(a1Var);
                }
                if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31528Q1)).booleanValue() || interfaceC3858rh.isAttachedToWindow()) {
                    return;
                }
                interfaceC3858rh.onPause();
                interfaceC3858rh.b1();
                return;
            case 4:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.f31271v).registerReceiver(new Q0.d((C3976tr) this.f31270u), intentFilter);
                return;
            case 5:
                C3976tr c3976tr = (C3976tr) ((Q0.d) this.f31270u).f2699b;
                c3976tr.getClass();
                Context context2 = (Context) this.f31271v;
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i4 = type != 9 ? 8 : 7;
                                        }
                                        i4 = 5;
                                    }
                                }
                                i4 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i4 = 4;
                                    break;
                                case 13:
                                    i4 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i4 = 6;
                                    break;
                                case 18:
                                    i4 = 2;
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i4 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i4 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                    if (Build.VERSION.SDK_INT >= 31 || i4 != 5) {
                        c3976tr.c(i4);
                        return;
                    }
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService("phone");
                        if (telephonyManager == null) {
                            throw null;
                        }
                        C3004bq c3004bq = new C3004bq(c3976tr);
                        telephonyManager.registerTelephonyCallback(c3976tr.f34483a, c3004bq);
                        telephonyManager.unregisterTelephonyCallback(c3004bq);
                        return;
                    } catch (RuntimeException unused2) {
                        c3976tr.c(5);
                        return;
                    }
                }
                i4 = 0;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                c3976tr.c(i4);
                return;
            case 6:
                ((Jr) ((C3602mu) ((Q8) ((r) this.f31270u).f33923y).f27121v).f32776w).v((C4927z0) this.f31271v);
                return;
            case 7:
                ((C3493kt) ((r) this.f31270u).f33923y).f32479d.v((C4927z0) this.f31271v);
                return;
            case 8:
                ((C3763pt) this.f31270u).f33530d.v((C4927z0) this.f31271v);
                return;
            case 9:
                ((Pt) ((r) this.f31270u).f33923y).f27073d.v((C4927z0) this.f31271v);
                return;
            case 10:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f31271v;
                InputStream inputStream = (InputStream) this.f31270u;
                try {
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                        try {
                            S2.b.d(inputStream, autoCloseOutputStream, false);
                            autoCloseOutputStream.close();
                            inputStream.close();
                            return;
                        } finally {
                        }
                    } finally {
                    }
                } catch (IOException unused3) {
                    return;
                }
            case 11:
                C4088vv c4088vv = (C4088vv) this.f31270u;
                c4088vv.getClass();
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f31271v;
                if (atomicBoolean.get()) {
                    new Thread(new RunnableC3329hp(13, (C2593Hm) c4088vv.f34899v, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 12:
                ((Ou) ((Q8) this.f31270u).f27124y).f26779c.u1(new C4086vt(i9, (Ku) this.f31271v));
                return;
            case 13:
                C2593Hm c2593Hm = (C2593Hm) this.f31270u;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f31271v;
                synchronized (c2593Hm) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) c2593Hm.f25416u) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 14:
                Zu zu = (Zu) this.f31270u;
                Xu xu = (Xu) this.f31271v;
                zu.getClass();
                synchronized (Zu.f29092E) {
                    try {
                        if (!zu.f29095B) {
                            zu.f29095B = true;
                            if (Zu.a()) {
                                try {
                                    t2.G g10 = p2.j.f39798C.f39803c;
                                    zu.f29099w = t2.G.M(zu.f29096n);
                                } catch (RemoteException | RuntimeException e6) {
                                    p2.j.f39798C.f39808h.d("CuiMonitor.gettingAppIdFromManifest", e6);
                                }
                                L2.f fVar = L2.f.f1726b;
                                Context context3 = zu.f29096n;
                                fVar.getClass();
                                zu.f29100x = L2.f.a(context3);
                                C3151ea c3151ea = AbstractC3368ia.U9;
                                q2.r rVar = q2.r.f40116e;
                                int intValue = ((Integer) rVar.f40119c.a(c3151ea)).intValue();
                                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.pd)).booleanValue()) {
                                    long j10 = intValue;
                                    AbstractC3212fg.f30741d.scheduleWithFixedDelay(zu, j10, j10, TimeUnit.MILLISECONDS);
                                } else {
                                    long j11 = intValue;
                                    AbstractC3212fg.f30741d.scheduleAtFixedRate(zu, j11, j11, TimeUnit.MILLISECONDS);
                                }
                                C3151ea c3151ea2 = AbstractC3368ia.aa;
                                if (((Boolean) rVar.f40119c.a(c3151ea2)).booleanValue()) {
                                    C2775Sh c2775Sh = zu.f29094A;
                                    c2775Sh.getClass();
                                    if (((Boolean) rVar.f40119c.a(c3151ea2)).booleanValue() && !c2775Sh.f27590e.getAndSet(true)) {
                                        c2775Sh.a();
                                    }
                                }
                            }
                        }
                    } finally {
                    }
                }
                if (Zu.a() && xu != null) {
                    synchronized (Zu.f29091D) {
                        try {
                            C3063cv c3063cv = zu.f29098v;
                            int A8 = ((C3227fv) c3063cv.f30000u).A();
                            C3151ea c3151ea3 = AbstractC3368ia.V9;
                            q2.r rVar2 = q2.r.f40116e;
                            if (A8 >= ((Integer) rVar2.f40119c.a(c3151ea3)).intValue()) {
                                return;
                            }
                            C2954av C7 = C3009bv.C();
                            int i10 = xu.f28726m;
                            C7.h();
                            ((C3009bv) C7.f30000u).Y(i10);
                            boolean z9 = xu.f28716b;
                            C7.h();
                            ((C3009bv) C7.f30000u).D(z9);
                            long j12 = xu.f28715a;
                            C7.h();
                            ((C3009bv) C7.f30000u).E(j12);
                            C7.h();
                            ((C3009bv) C7.f30000u).Z();
                            String str2 = zu.f29097u.f41217n;
                            C7.h();
                            ((C3009bv) C7.f30000u).G(str2);
                            String str3 = zu.f29099w;
                            C7.h();
                            ((C3009bv) C7.f30000u).H(str3);
                            String str4 = Build.VERSION.RELEASE;
                            C7.h();
                            ((C3009bv) C7.f30000u).I(str4);
                            int i11 = Build.VERSION.SDK_INT;
                            C7.h();
                            ((C3009bv) C7.f30000u).J(i11);
                            int i12 = xu.f28728o;
                            C7.h();
                            ((C3009bv) C7.f30000u).A(i12);
                            int i13 = xu.f28717c;
                            C7.h();
                            ((C3009bv) C7.f30000u).L(i13);
                            long j13 = zu.f29100x;
                            C7.h();
                            ((C3009bv) C7.f30000u).M(j13);
                            int i14 = xu.f28727n;
                            C7.h();
                            ((C3009bv) C7.f30000u).B(i14);
                            String str5 = xu.f28718d;
                            C7.h();
                            ((C3009bv) C7.f30000u).N(str5);
                            String str6 = xu.f28719e;
                            C7.h();
                            ((C3009bv) C7.f30000u).O(str6);
                            String str7 = xu.f28720f;
                            C7.h();
                            ((C3009bv) C7.f30000u).P(str7);
                            C2747Qn b10 = zu.f29101y.b(xu.f28720f);
                            if (b10 != null && (c2754Rd = b10.f27214b) != null) {
                                str = c2754Rd.toString();
                                C7.h();
                                ((C3009bv) C7.f30000u).Q(str);
                                String str8 = xu.f28721g;
                                C7.h();
                                ((C3009bv) C7.f30000u).R(str8);
                                int i15 = xu.f28722h;
                                C7.h();
                                ((C3009bv) C7.f30000u).V(i15);
                                String str9 = xu.f28724k;
                                C7.h();
                                ((C3009bv) C7.f30000u).U(str9);
                                String str10 = xu.i;
                                C7.h();
                                ((C3009bv) C7.f30000u).S(str10);
                                String str11 = xu.f28723j;
                                C7.h();
                                ((C3009bv) C7.f30000u).T(str11);
                                long j14 = xu.f28725l;
                                C7.h();
                                ((C3009bv) C7.f30000u).F(j14);
                                if (((Boolean) rVar2.f40119c.a(AbstractC3368ia.Z9)).booleanValue()) {
                                    AbstractCollection abstractCollection = zu.f29102z;
                                    C7.h();
                                    ((C3009bv) C7.f30000u).K(abstractCollection);
                                }
                                if (((Boolean) rVar2.f40119c.a(AbstractC3368ia.aa)).booleanValue()) {
                                    C2775Sh c2775Sh2 = zu.f29094A;
                                    C3469kM c3469kM = c2775Sh2.f27587b;
                                    String str12 = c2775Sh2.f27586a;
                                    if (c3469kM != null) {
                                        C7.h();
                                        ((C3009bv) C7.f30000u).W(c3469kM);
                                    }
                                    if (str12 != null) {
                                        C7.h();
                                        ((C3009bv) C7.f30000u).X(str12);
                                    }
                                }
                                C3117dv A9 = C3172ev.A();
                                A9.h();
                                ((C3172ev) A9.f30000u).B((C3009bv) C7.j());
                                c3063cv.h();
                                ((C3227fv) c3063cv.f30000u).C((C3172ev) A9.j());
                                return;
                            }
                            str = "";
                            C7.h();
                            ((C3009bv) C7.f30000u).Q(str);
                            String str82 = xu.f28721g;
                            C7.h();
                            ((C3009bv) C7.f30000u).R(str82);
                            int i152 = xu.f28722h;
                            C7.h();
                            ((C3009bv) C7.f30000u).V(i152);
                            String str92 = xu.f28724k;
                            C7.h();
                            ((C3009bv) C7.f30000u).U(str92);
                            String str102 = xu.i;
                            C7.h();
                            ((C3009bv) C7.f30000u).S(str102);
                            String str112 = xu.f28723j;
                            C7.h();
                            ((C3009bv) C7.f30000u).T(str112);
                            long j142 = xu.f28725l;
                            C7.h();
                            ((C3009bv) C7.f30000u).F(j142);
                            if (((Boolean) rVar2.f40119c.a(AbstractC3368ia.Z9)).booleanValue()) {
                            }
                            if (((Boolean) rVar2.f40119c.a(AbstractC3368ia.aa)).booleanValue()) {
                            }
                            C3117dv A92 = C3172ev.A();
                            A92.h();
                            ((C3172ev) A92.f30000u).B((C3009bv) C7.j());
                            c3063cv.h();
                            ((C3227fv) c3063cv.f30000u).C((C3172ev) A92.j());
                            return;
                        } finally {
                        }
                    }
                }
                return;
            case 15:
                InterfaceC4921w0 interfaceC4921w0 = (InterfaceC4921w0) this.f31270u;
                Hv hv = (Hv) this.f31271v;
                q2.N n9 = hv.f25453h;
                if (n9 != null) {
                    try {
                        q2.W0 w02 = (q2.W0) hv.f25450e.get();
                        Parcel A02 = n9.A0();
                        AbstractC3241g8.c(A02, w02);
                        n9.G0(A02, 1);
                    } catch (RemoteException unused4) {
                        int i16 = t2.C.f40822b;
                        u2.i.f("Failed to call onAdsAvailable");
                    }
                }
                q2.P p6 = hv.i;
                if (p6 != null) {
                    try {
                        String str13 = hv.f25456l;
                        Parcel A03 = p6.A0();
                        A03.writeString(str13);
                        AbstractC3241g8.e(A03, interfaceC4921w0);
                        p6.G0(A03, 1);
                        return;
                    } catch (RemoteException unused5) {
                        int i17 = t2.C.f40822b;
                        u2.i.f("Failed to call onAdPreloaded");
                        return;
                    }
                }
                return;
            case 16:
                C4927z0 c4927z0 = (C4927z0) this.f31270u;
                Hv hv2 = (Hv) this.f31271v;
                q2.P p9 = hv2.i;
                if (p9 != null) {
                    try {
                        String str14 = hv2.f25456l;
                        Parcel A04 = p9.A0();
                        A04.writeString(str14);
                        AbstractC3241g8.c(A04, c4927z0);
                        p9.G0(A04, 3);
                        return;
                    } catch (RemoteException unused6) {
                        int i18 = t2.C.f40822b;
                        u2.i.f("Failed to call onAdFailedToPreload");
                        return;
                    }
                }
                return;
            case 17:
                T2.D((WebView) this.f31270u, (String) this.f31271v);
                return;
            case 18:
                ((h3.h) this.f31270u).b(C3119dx.a((Context) this.f31271v, "GLAS"));
                return;
            case 19:
                Nz nz = (Nz) this.f31270u;
                C3011bx c3011bx = nz.f26628a;
                Vw vw = (Vw) this.f31271v;
                if (!c3011bx.a(vw)) {
                    throw new B0.c(2);
                }
                nz.f26633f.set("2.893135394.".concat(String.valueOf(vw.f28322a.A())));
                return;
            case 20:
                a();
                return;
            case 21:
                ((AbstractC4107wD) this.f31270u).v((QB) this.f31271v);
                return;
            case 22:
                C3093dO c3093dO = (C3093dO) this.f31270u;
                C3990u4 c3990u4 = (C3990u4) this.f31271v;
                int i19 = c3093dO.f30034Z - c3990u4.f34530c;
                c3093dO.f30034Z = i19;
                if (c3990u4.f34531d) {
                    c3093dO.f30035n0 = c3990u4.f34532e;
                    c3093dO.f30036o0 = true;
                }
                if (i19 == 0) {
                    AbstractC3832r8 abstractC3832r8 = ((C4280zO) c3990u4.f34533f).f35530a;
                    int i20 = -1;
                    if (!c3093dO.f30014G0.f35530a.g() && abstractC3832r8.g()) {
                        c3093dO.f30016H0 = -1;
                        c3093dO.f30018I0 = 0L;
                    }
                    if (!abstractC3832r8.g()) {
                        List asList = Arrays.asList(((EO) abstractC3832r8).f24717h);
                        int size = asList.size();
                        ArrayList arrayList = c3093dO.J;
                        PA.T(size == arrayList.size());
                        for (int i21 = 0; i21 < asList.size(); i21++) {
                            ((C2984bO) arrayList.get(i21)).f29485b = (AbstractC3832r8) asList.get(i21);
                        }
                    }
                    boolean z10 = c3093dO.f30036o0;
                    long j15 = com.anythink.basead.exoplayer.b.f6539b;
                    if (z10) {
                        boolean z11 = ((C4280zO) c3990u4.f34533f).f35530a.g() && c3093dO.f30014G0.f35530a.g();
                        boolean equals = ((C4280zO) c3990u4.f34533f).f35531b.equals(c3093dO.f30014G0.f35531b);
                        long j16 = ((C4280zO) c3990u4.f34533f).f35533d;
                        long j17 = c3093dO.f30014G0.f35546r;
                        if (z11 || (equals && j16 == j17)) {
                            i9 = 0;
                        }
                        if (i9 != 0) {
                            i20 = c3093dO.t1();
                            if (abstractC3832r8.g() || ((C4280zO) c3990u4.f34533f).f35531b.b()) {
                                j15 = ((C4280zO) c3990u4.f34533f).f35533d;
                            } else {
                                C4280zO c4280zO = (C4280zO) c3990u4.f34533f;
                                BQ bq = c4280zO.f35531b;
                                long j18 = c4280zO.f35533d;
                                abstractC3832r8.o(bq.f24043a, c3093dO.f30017I);
                                j15 = j18;
                            }
                        }
                        i = i20;
                        j9 = j15;
                        z8 = i9;
                    } else {
                        i = -1;
                        j9 = -9223372036854775807L;
                        z8 = 0;
                    }
                    c3093dO.f30036o0 = false;
                    c3093dO.E1((C4280zO) c3990u4.f34533f, 1, z8, c3093dO.f30035n0, j9, i);
                    return;
                }
                return;
            case 23:
                ((UO) this.f31270u).f27994w.reportNetworkEvent((NetworkEvent) this.f31271v);
                return;
            case 24:
                ((UO) this.f31270u).f27994w.reportPlaybackStateEvent((PlaybackStateEvent) this.f31271v);
                return;
            case 25:
                ((UO) this.f31270u).f27994w.reportTrackChangeEvent((TrackChangeEvent) this.f31271v);
                return;
            case 26:
                b();
                return;
            case 27:
                c();
                return;
            case 28:
                d();
                return;
            default:
                C3932t0 c3932t0 = (C3932t0) this.f31270u;
                LN ln = (LN) this.f31271v;
                c3932t0.getClass();
                synchronized (ln) {
                }
                String str15 = AbstractC3548lu.f32613a;
                OO oo = c3932t0.f34333b.f28243n.f30021L;
                oo.s(oo.y((BQ) oo.f26694d.f27123x), 1013, new MO(27));
                return;
        }
    }

    public /* synthetic */ RunnableC3329hp(Context context, h3.h hVar) {
        this.f31269n = 18;
        this.f31271v = context;
        this.f31270u = hVar;
    }

    public RunnableC3329hp(T2 t22, WebView webView, String str) {
        this.f31269n = 17;
        this.f31270u = webView;
        this.f31271v = str;
        Objects.requireNonNull(t22);
    }

    public RunnableC3329hp(Hv hv, InterfaceC4921w0 interfaceC4921w0) {
        this.f31269n = 15;
        this.f31270u = interfaceC4921w0;
        Objects.requireNonNull(hv);
        this.f31271v = hv;
    }

    public RunnableC3329hp(Hv hv, C4927z0 c4927z0) {
        this.f31269n = 16;
        this.f31270u = c4927z0;
        Objects.requireNonNull(hv);
        this.f31271v = hv;
    }
}
