package com.google.android.gms.internal.ads;

import O2.InterfaceC0366c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k2.C4630a;
import org.json.JSONObject;
import w2.InterfaceC5155c;

/* renamed from: com.google.android.gms.internal.ads.pr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3761pr implements InterfaceC3774q3, InterfaceC0366c, InterfaceC2656Lh, InterfaceC3373ig, InterfaceC3426jg, InterfaceC5155c, LD, InterfaceC3701ol, p2.g, InterfaceC2528Dp, p2.d, Kr, Bt {

    /* renamed from: v, reason: collision with root package name */
    public static final Object f33520v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public static C3761pr f33521w;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33522n;

    /* renamed from: u, reason: collision with root package name */
    public Object f33523u;

    public /* synthetic */ C3761pr(int i, Object obj) {
        this.f33522n = i;
        this.f33523u = obj;
    }

    public void A(I0 i02) {
        long[] jArr = i02.f25502e;
        if (jArr.length > 0) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f33523u;
            if (linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            linkedHashMap.put(Long.valueOf(jArr[0]), i02);
        }
    }

    public J3.a C(C2593Hm c2593Hm, At at, InterfaceC3592mk interfaceC3592mk) {
        C3322hi j9 = at.j((InterfaceC4302zt) c2593Hm.f25416u);
        Ct ct = new Ct();
        switch (j9.f31243a) {
            case 0:
                j9.f31245c = ct;
                break;
            default:
                j9.f31245c = ct;
                break;
        }
        InterfaceC3592mk interfaceC3592mk2 = (InterfaceC3592mk) j9.c();
        this.f33523u = interfaceC3592mk2;
        C2709Oj a9 = interfaceC3592mk2.a();
        C4141wu c4141wu = new C4141wu();
        JD s3 = JD.s(a9.b());
        C2936ad c2936ad = new C2936ad(12, c4141wu, a9);
        HD hd = HD.f25326n;
        return C3686oN.A(C3686oN.y(s3, c2936ad, hd), new C2670Me(7, c4141wu), hd);
    }

    public I0 D() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (I0 i02 : ((LinkedHashMap) this.f33523u).values()) {
            arrayList.add(i02.f25499b);
            arrayList2.add(i02.f25500c);
            arrayList3.add(i02.f25501d);
            arrayList4.add(i02.f25502e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j9 = 0;
        for (int[] iArr2 : iArr) {
            j9 += iArr2.length;
        }
        int i = (int) j9;
        PA.J(j9 == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j9);
        int[] iArr3 = new int[i];
        int i4 = 0;
        for (int[] iArr4 : iArr) {
            int length = iArr4.length;
            System.arraycopy(iArr4, 0, iArr3, i4, length);
            i4 += length;
        }
        return new I0(iArr3, AbstractC3035cL.p((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), AbstractC3035cL.p((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), AbstractC3035cL.p((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public Q5 E() {
        return (Q5) Optional.ofNullable((Q5) ((ArrayDeque) this.f33523u).peek()).orElseThrow(P5.f26839u);
    }

    public void F(RemoteException remoteException) {
        ((C3602mu) this.f33523u).B();
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Cf)).booleanValue()) {
            p2.j.f39798C.f39808h.d("Preconnect Remote", remoteException);
        }
    }

    public int H() {
        int optInt = ((JSONObject) this.f33523u).optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }

    public String I(Context context) {
        String num;
        C3999uD c3999uD;
        Zx zx = (Zx) this.f33523u;
        InterfaceC3929sy interfaceC3929sy = zx.f29119e;
        boolean z8 = zx.f29123j;
        long j9 = zx.i;
        boolean z9 = false;
        if (z8 && System.currentTimeMillis() - j9 <= zx.f29124k) {
            z9 = true;
        }
        C4158xA c4158xA = zx.f29118d;
        C4104wA a9 = c4158xA.a(3);
        try {
            try {
                try {
                    try {
                        a9.a();
                        Cy cy = zx.f29115a;
                        synchronized (cy) {
                            c3999uD = cy.f24284e;
                            if (c3999uD == null) {
                                throw null;
                            }
                        }
                        num = (String) C3686oN.y(c3999uD, new C2936ad(14, zx, context), HD.f25326n).get(z9 ? zx.f29122h : zx.f29120f, TimeUnit.MILLISECONDS);
                    } catch (ExecutionException e6) {
                        e = e6;
                        Throwable cause = e.getCause();
                        if (cause != null) {
                            e = cause;
                        }
                        a9.b(e);
                        num = Integer.toString(3);
                    }
                } catch (Throwable th) {
                    a9.b(th);
                    throw th;
                }
            } catch (InterruptedException e9) {
                Thread.currentThread().interrupt();
                a9.b(e9);
                num = "";
            } catch (TimeoutException unused) {
                if (z9) {
                    num = ((C4038uz) zx.f29121g.d()).a(j9);
                } else {
                    c4158xA.b(56);
                    num = Integer.toString(17);
                }
            }
            a9.c();
            interfaceC3929sy.d();
            return num;
        } catch (Throwable th2) {
            a9.c();
            interfaceC3929sy.d();
            throw th2;
        }
    }

    public String K(Context context, String str, View view) {
        String num;
        C3999uD c3999uD;
        Zx zx = (Zx) this.f33523u;
        InterfaceC3929sy interfaceC3929sy = zx.f29119e;
        C4158xA c4158xA = zx.f29118d;
        C4104wA a9 = c4158xA.a(5);
        try {
            try {
                try {
                    a9.a();
                    Cy cy = zx.f29115a;
                    synchronized (cy) {
                        c3999uD = cy.f24284e;
                        if (c3999uD == null) {
                            throw null;
                        }
                    }
                    num = (String) C3686oN.y(c3999uD, new C2889Zc((Object) zx, (Object) context, str, (Object) view, 7), HD.f25326n).get(zx.f29120f, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e6) {
                    Thread.currentThread().interrupt();
                    a9.b(e6);
                    num = "";
                } catch (Throwable th) {
                    a9.b(th);
                    throw th;
                }
            } catch (ExecutionException e9) {
                Throwable th2 = e9;
                Throwable cause = th2.getCause();
                if (cause != null) {
                    th2 = cause;
                }
                a9.b(th2);
                num = Integer.toString(3);
            } catch (TimeoutException unused) {
                c4158xA.b(58);
                num = Integer.toString(17);
            }
            a9.c();
            interfaceC3929sy.d();
            return num;
        } catch (Throwable th3) {
            a9.c();
            interfaceC3929sy.d();
            throw th3;
        }
    }

    public void L(MotionEvent motionEvent) {
        Ry ry = ((Zx) this.f33523u).f29116b;
        Ny ny = (Ny) ry.f27454f.get();
        if (ny == null) {
            ry.f27453e.b(54);
        } else {
            ny.c(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2656Lh
    /* renamed from: a */
    public void mo4a() {
        switch (this.f33522n) {
            case 10:
                C2736Qc c2736Qc = (C2736Qc) this.f33523u;
                p2.j.f39798C.f39810k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                long j9 = c2736Qc.f27173n;
                Long valueOf = Long.valueOf(currentTimeMillis - j9);
                ArrayList arrayList = (ArrayList) c2736Qc.f27175v;
                arrayList.add(valueOf);
                String valueOf2 = String.valueOf(arrayList.get(0));
                StringBuilder sb = new StringBuilder(valueOf2.length() + 52);
                sb.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                sb.append(valueOf2);
                sb.append(" ms.");
                t2.C.k(sb.toString());
                t2.G.f40858l.postDelayed(new RunnableC2719Pc((c7.m) c2736Qc.f27174u, (C2770Sc) c2736Qc.f27176w, (C2634Kc) c2736Qc.f27177x, arrayList, j9, 1), ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31642d)).intValue());
                return;
            case 11:
                ((C2753Rc) this.f33523u).f27384x.t();
                return;
            case 24:
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Bf)).booleanValue()) {
                    C2593Hm a9 = ((C3165eo) ((C3602mu) this.f33523u).f32776w).a();
                    a9.r(NativeAdvancedJsUtils.f18064p, "ptard");
                    a9.r("ptard", com.anythink.expressad.foundation.d.d.bv);
                    a9.s();
                    return;
                }
                return;
            case 26:
                synchronized (((C4017ue) this.f33523u)) {
                }
                return;
            default:
                Rt rt = (Rt) this.f33523u;
                synchronized (rt) {
                    rt.f27435C = null;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3426jg
    /* renamed from: b */
    public /* synthetic */ void mo5b(Object obj) {
        switch (this.f33522n) {
            case 12:
                ((C3320hg) this.f33523u).a((InterfaceC2787Tc) obj);
                break;
            case 16:
                InterfaceC2472Ak interfaceC2472Ak = (InterfaceC2472Ak) obj;
                String message = ((C2762Rl) this.f33523u).getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                interfaceC2472Ak.b(AbstractC3217fl.M(12, message, null));
                break;
            default:
                ((InterfaceC2761Rk) obj).a((q2.h1) this.f33523u);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2528Dp
    public J3.a c(C2687Ne c2687Ne) {
        C4190xp c4190xp = (C4190xp) this.f33523u;
        synchronized (c4190xp.f34865u) {
            try {
                int i = c4190xp.f35253A;
                if (i != 1 && i != 2) {
                    return C3686oN.l(new C2494Bp(2));
                }
                if (c4190xp.f34866v) {
                    return c4190xp.f34864n;
                }
                c4190xp.f35253A = 2;
                c4190xp.f34866v = true;
                c4190xp.f34868x = c2687Ne;
                c4190xp.f34869y.o();
                C3320hg c3320hg = c4190xp.f34864n;
                c3320hg.f31242n.c(new RunnableC4136wp(c4190xp, 1), AbstractC3212fg.f30745h);
                return c3320hg;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p2.d
    public void d() {
        ((C3808qk) ((C3590mi) this.f33523u).f32711G0.d()).onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3774q3
    public void e(byte[] bArr, int i, int i4, X1.b bVar) {
        C2522Dj a9;
        Lr lr = (Lr) this.f33523u;
        lr.z(i + i4, bArr);
        lr.E(i);
        ArrayList arrayList = new ArrayList();
        while (lr.B() > 0) {
            PA.u("Incomplete Mp4Webvtt Top Level box header found.", lr.B() >= 8);
            int b9 = lr.b() - 8;
            if (lr.b() == 1987343459) {
                CharSequence charSequence = null;
                C3914sj c3914sj = null;
                while (b9 > 0) {
                    PA.u("Incomplete vtt cue box header found.", b9 >= 8);
                    int b10 = lr.b();
                    int b11 = lr.b();
                    int i9 = b9 - 8;
                    int i10 = b10 - 8;
                    byte[] bArr2 = lr.f26233a;
                    int i11 = lr.f26234b;
                    String str = AbstractC3548lu.f32613a;
                    String str2 = new String(bArr2, i11, i10, StandardCharsets.UTF_8);
                    lr.G(i10);
                    if (b11 == 1937011815) {
                        Y3 y32 = new Y3();
                        Z3.c(str2, y32);
                        c3914sj = y32.a();
                    } else if (b11 == 1885436268) {
                        charSequence = Z3.a(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                    b9 = i9 - i10;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (c3914sj != null) {
                    c3914sj.f34261a = charSequence;
                    c3914sj.f34262b = null;
                    a9 = c3914sj.a();
                } else {
                    Pattern pattern = Z3.f28959a;
                    Y3 y33 = new Y3();
                    y33.f28779c = charSequence;
                    a9 = y33.a().a();
                }
                arrayList.add(a9);
            } else {
                lr.G(b9);
            }
        }
        bVar.mo2b(new C3558m3(arrayList, com.anythink.basead.exoplayer.b.f6539b, com.anythink.basead.exoplayer.b.f6539b));
    }

    @Override // w2.InterfaceC5155c
    public void f(C4630a c4630a) {
        try {
            ((InterfaceC2601Id) this.f33523u).a(c4630a.a());
        } catch (RemoteException e6) {
            u2.i.d("", e6);
        }
    }

    @Override // p2.d
    public void i() {
        C3590mi c3590mi = (C3590mi) this.f33523u;
        ((C2489Bk) c3590mi.f32707B0.d()).a();
        C2541El c2541El = (C2541El) c3590mi.f32713I0.d();
        synchronized (c2541El) {
            c2541El.u1(C3431jl.f32172F);
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public void mo7l(Object obj) {
        switch (this.f33522n) {
            case 15:
                ((C2709Oj) this.f33523u).f26742f.z(true);
                return;
            case 19:
                try {
                    InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) ((List) obj).get(0);
                    if (interfaceC3858rh != null) {
                        C2712Om c2712Om = (C2712Om) this.f33523u;
                        c2712Om.getClass();
                        c2712Om.f26759v.execute(new RunnableC3968tj(interfaceC3858rh, 3));
                        return;
                    }
                    return;
                } catch (ClassCastException | IndexOutOfBoundsException e6) {
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.p6)).booleanValue()) {
                        p2.j.f39798C.f39808h.d("omid native display exp", e6);
                        return;
                    }
                    return;
                }
            case 21:
                String str = (String) obj;
                synchronized (this) {
                    C2527Do c2527Do = (C2527Do) this.f33523u;
                    c2527Do.f24557c = true;
                    p2.j.f39798C.f39810k.getClass();
                    c2527Do.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - c2527Do.f24558d), "", true);
                    c2527Do.i.execute(new MD(27, this, str));
                }
                return;
            default:
                C2953au c2953au = (C2953au) obj;
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31657e7)).booleanValue()) {
                    C3705op c3705op = (C3705op) this.f33523u;
                    Wt wt = (Wt) c2953au.f29349b.f24454v;
                    C2749Qp c2749Qp = c3705op.f33218e;
                    int i = wt.f28495f;
                    synchronized (c2749Qp.f27246g) {
                        c2749Qp.f27241b = i;
                    }
                    C2749Qp c2749Qp2 = c3705op.f33218e;
                    long j9 = wt.f28496g;
                    synchronized (c2749Qp2.f27247h) {
                        c2749Qp2.f27242c = j9;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Bt
    public /* synthetic */ Object o() {
        return (InterfaceC3592mk) this.f33523u;
    }

    @Override // O2.InterfaceC0366c
    public void onConnectionFailed(L2.b bVar) {
        Q8 q82 = (Q8) this.f33523u;
        synchronized (q82.f27121v) {
            q82.f27124y = null;
            if (((T8) q82.f27122w) != null) {
                q82.f27122w = null;
            }
            q82.f27121v.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
        switch (this.f33522n) {
            case 15:
                ((C2709Oj) this.f33523u).f26742f.z(false);
                return;
            case 19:
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.p6)).booleanValue()) {
                    p2.j.f39798C.f39808h.d("omid native display exp", th);
                    return;
                }
                return;
            case 21:
                synchronized (this) {
                    C2527Do c2527Do = (C2527Do) this.f33523u;
                    c2527Do.f24557c = true;
                    p2.j.f39798C.f39810k.getClass();
                    c2527Do.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - c2527Do.f24558d), "Internal Error.", false);
                    c2527Do.f24559e.b(new Exception());
                }
                return;
            default:
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31657e7)).booleanValue()) {
                    Matcher matcher = C3705op.f33213h.matcher(th.getMessage());
                    if (matcher.matches()) {
                        int parseInt = Integer.parseInt(matcher.group(1));
                        C2749Qp c2749Qp = ((C3705op) this.f33523u).f33218e;
                        synchronized (c2749Qp.f27246g) {
                            c2749Qp.f27241b = parseInt;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // p2.g
    public void t() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        C2863Xk c2863Xk = ((C2628Jn) this.f33523u).f25805g;
        synchronized (c2863Xk) {
            try {
                if (c2863Xk.f28679C) {
                    if (c2863Xk.f28677A > 0 && (scheduledFuture2 = c2863Xk.f28680D) != null && scheduledFuture2.isCancelled()) {
                        c2863Xk.x1(c2863Xk.f28677A);
                    }
                    if (c2863Xk.f28678B > 0 && (scheduledFuture = c2863Xk.f28681E) != null && scheduledFuture.isCancelled()) {
                        c2863Xk.z1(c2863Xk.f28678B);
                    }
                    c2863Xk.f28679C = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Kr
    public void u(AbstractC2539Ej abstractC2539Ej) {
        switch (this.f33522n) {
            case 26:
                C4017ue c4017ue = (C4017ue) this.f33523u;
                synchronized (c4017ue) {
                    c4017ue.f34632w = abstractC2539Ej.f24808f;
                    abstractC2539Ej.a();
                }
                return;
            default:
                Rt rt = (Rt) this.f33523u;
                C2492Bn c2492Bn = (C2492Bn) abstractC2539Ej;
                synchronized (rt) {
                    try {
                        rt.f27435C = c2492Bn;
                        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31792t4)).booleanValue()) {
                            c2492Bn.f24086u.f30254a = rt.f27440x;
                        }
                        rt.f27435C.a();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Bt
    public /* bridge */ /* synthetic */ J3.a x(C2593Hm c2593Hm, At at) {
        return C(c2593Hm, at, null);
    }

    @Override // p2.g
    public void y() {
        C2863Xk c2863Xk = ((C2628Jn) this.f33523u).f25805g;
        synchronized (c2863Xk) {
            try {
                if (c2863Xk.f28679C) {
                    return;
                }
                ScheduledFuture scheduledFuture = c2863Xk.f28680D;
                if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                    c2863Xk.f28677A = -1L;
                } else {
                    c2863Xk.f28680D.cancel(false);
                    long j9 = c2863Xk.f28685y;
                    c2863Xk.f28683w.getClass();
                    c2863Xk.f28677A = j9 - SystemClock.elapsedRealtime();
                }
                ScheduledFuture scheduledFuture2 = c2863Xk.f28681E;
                if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                    c2863Xk.f28678B = -1L;
                } else {
                    c2863Xk.f28681E.cancel(false);
                    long j10 = c2863Xk.f28686z;
                    c2863Xk.f28683w.getClass();
                    c2863Xk.f28678B = j10 - SystemClock.elapsedRealtime();
                }
                c2863Xk.f28679C = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z(long j9, long j10, long j11) {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i = iArr[0];
        int i4 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        Q5 q52 = new Q5(j9, j10, j11);
        ArrayDeque arrayDeque = (ArrayDeque) this.f33523u;
        if (arrayDeque.size() >= (com.anythink.basead.b.c.i.g((i4 & (~i)) | i9, (i & i10) | i11, i12, i13) ^ (i14 % 452867621))) {
            throw new R5();
        }
        arrayDeque.push(q52);
    }

    public C3761pr(C3214fi c3214fi) {
        this.f33522n = 14;
        this.f33523u = new C4184xj(c3214fi.f30805g, c3214fi.f30794a0, new C3913si(22, c3214fi.f30796b0), c3214fi.f30798c0, c3214fi.f30751A, 7);
    }

    public C3761pr(int i) {
        this.f33522n = i;
        switch (i) {
            case 4:
                this.f33523u = new Lr();
                break;
            case 6:
                this.f33523u = new ArrayDeque();
                break;
            case 27:
                break;
            default:
                this.f33523u = new LinkedHashMap();
                break;
        }
    }

    public C3761pr(Context context, Executor executor) {
        this.f33522n = 7;
        this.f33523u = C3686oN.p(new CallableC3454k7(0, context), executor);
    }

    public C3761pr(Q8 q82) {
        this.f33522n = 8;
        Objects.requireNonNull(q82);
        this.f33523u = q82;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        ((java.util.ArrayList) r4.f33523u).add(new com.google.android.gms.internal.ads.C3691ob(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3761pr(InterfaceC3421jb interfaceC3421jb) {
        IBinder iBinder;
        this.f33522n = 9;
        this.f33523u = new ArrayList();
        try {
            interfaceC3421jb.d();
        } catch (RemoteException e6) {
            u2.i.d("", e6);
        }
        try {
            for (Object obj : interfaceC3421jb.i()) {
                InterfaceC3637nb interfaceC3637nb = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    interfaceC3637nb = queryLocalInterface instanceof InterfaceC3637nb ? (InterfaceC3637nb) queryLocalInterface : new C3583mb(iBinder);
                }
            }
        } catch (RemoteException e9) {
            u2.i.d("", e9);
        }
    }

    public C3761pr(C2753Rc c2753Rc) {
        this.f33522n = 11;
        Objects.requireNonNull(c2753Rc);
        this.f33523u = c2753Rc;
    }

    public C3761pr(BinderC2737Qd binderC2737Qd, InterfaceC2601Id interfaceC2601Id) {
        this.f33522n = 13;
        this.f33523u = interfaceC2601Id;
        Objects.requireNonNull(binderC2737Qd);
    }

    public C3761pr(C4017ue c4017ue) {
        this.f33522n = 26;
        Objects.requireNonNull(c4017ue);
        this.f33523u = c4017ue;
    }

    public C3761pr(C2712Om c2712Om) {
        this.f33522n = 19;
        Objects.requireNonNull(c2712Om);
        this.f33523u = c2712Om;
    }

    public C3761pr(C2628Jn c2628Jn) {
        this.f33522n = 20;
        Objects.requireNonNull(c2628Jn);
        this.f33523u = c2628Jn;
    }

    public C3761pr(C2527Do c2527Do) {
        this.f33522n = 21;
        Objects.requireNonNull(c2527Do);
        this.f33523u = c2527Do;
    }

    public C3761pr(C3705op c3705op) {
        this.f33522n = 22;
        Objects.requireNonNull(c3705op);
        this.f33523u = c3705op;
    }

    public C3761pr(C2478Aq c2478Aq, C3590mi c3590mi) {
        this.f33522n = 25;
        this.f33523u = c3590mi;
    }

    public C3761pr(Rt rt) {
        this.f33522n = 28;
        Objects.requireNonNull(rt);
        this.f33523u = rt;
    }

    public C3761pr(Context context, C3066cy c3066cy, SD sd) {
        this.f33522n = 1;
        context.getClass();
        sd.getClass();
        this.f33523u = (Zx) ((C4009uN) new C3755pl(context, c3066cy, sd).f33502m).d();
    }

    @Override // p2.d
    public void v(View view) {
    }
}
