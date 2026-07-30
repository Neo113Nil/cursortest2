package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4907p;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.ij, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3376ij implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31989n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f31990u;

    public /* synthetic */ RunnableC3376ij(int i, Object obj) {
        this.f31989n = i;
        this.f31990u = obj;
    }

    private final /* synthetic */ void a() {
        C3221fp c3221fp = (C3221fp) this.f31990u;
        AtomicReference atomicReference = c3221fp.f30892d;
        synchronized (atomicReference) {
            try {
                if (((String) atomicReference.get()).isEmpty()) {
                    atomicReference.set(c3221fp.b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        C3920sp c3920sp = (C3920sp) this.f31990u;
        synchronized (c3920sp.f34865u) {
            try {
                if (c3920sp.f34866v) {
                    return;
                }
                c3920sp.f34866v = true;
                T8 t82 = new T8(c3920sp.f34309z, p2.j.f39798C.f39819t.b(), c3920sp, c3920sp, 2);
                c3920sp.f34869y = t82;
                t82.o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        String s3;
        TelephonyManager telephonyManager;
        C2665Lq c2665Lq = (C2665Lq) this.f31990u;
        C4255z c4255z = (C4255z) c2665Lq.f26226a.get();
        if (c4255z != null) {
            int b9 = c2665Lq.f26228c.b();
            A a9 = c4255z.f35427a;
            synchronized (a9) {
                try {
                    if (a9.f23782E != b9 || a9.f23783F == null) {
                        a9.f23782E = b9;
                        if (b9 != 1 && b9 != 0 && b9 != 8) {
                            if (a9.f23783F == null) {
                                Context context = a9.f23784n;
                                String str = AbstractC3548lu.f32613a;
                                if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                    if (!TextUtils.isEmpty(networkCountryIso)) {
                                        s3 = AbstractC3035cL.s(networkCountryIso);
                                        a9.f23783F = s3;
                                    }
                                }
                                s3 = AbstractC3035cL.s(Locale.getDefault().getCountry());
                                a9.f23783F = s3;
                            }
                            a9.f23780C = a9.b(b9);
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            a9.a(a9.f23788x > 0 ? (int) (elapsedRealtime - a9.f23789y) : 0, a9.f23790z, a9.f23780C);
                            a9.f23789y = elapsedRealtime;
                            a9.f23790z = 0L;
                            a9.f23779B = 0L;
                            a9.f23778A = 0L;
                            H h9 = a9.f23787w;
                            h9.f25264a.clear();
                            h9.f25265b = -1;
                            h9.f25266c = 0;
                            h9.f25267d = 0;
                        }
                    }
                } finally {
                }
            }
        }
    }

    private final void d() {
        C2950ar c2950ar = (C2950ar) this.f31990u;
        synchronized (c2950ar) {
            c2950ar.f29337a.getClass();
            c2950ar.f29344h = SystemClock.elapsedRealtime() - c2950ar.i;
        }
    }

    private final void e() {
        BinderC4192xr binderC4192xr = (BinderC4192xr) this.f31990u;
        synchronized (binderC4192xr) {
            binderC4192xr.G3(3, "Signal collection timeout.");
        }
    }

    private final /* synthetic */ void f() {
        Hu hu;
        Hu hu2 = (Hu) this.f31990u;
        Iu iu = hu2.f25445d;
        synchronized (iu) {
            try {
                ScheduledFuture scheduledFuture = hu2.f25444c;
                hu = scheduledFuture != null ? (Hu) iu.f25653v.remove(scheduledFuture) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hu != null) {
            hu2.f25445d.f25652u.execute(hu2.f25442a);
        }
    }

    private final void g() {
        Iu iu = (Iu) this.f31990u;
        synchronized (iu) {
            HashMap hashMap = iu.f25653v;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ScheduledFuture scheduledFuture = (ScheduledFuture) arrayList.get(i);
                Hu hu = (Hu) hashMap.get(scheduledFuture);
                if (hu != null && scheduledFuture != null && !scheduledFuture.isDone()) {
                    scheduledFuture.cancel(false);
                    hashMap.remove(scheduledFuture);
                    p2.j.f39798C.f39810k.getClass();
                    long currentTimeMillis = hu.f25443b - System.currentTimeMillis();
                    Runnable runnable = hu.f25442a;
                    long max = Math.max(0L, currentTimeMillis);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    iu.a(runnable, max);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        switch (this.f31989n) {
            case 0:
                C3429jj c3429jj = (C3429jj) this.f31990u;
                C2582Hb c2582Hb = c3429jj.f32162q.f35064d;
                if (c2582Hb == null) {
                    return;
                }
                try {
                    q2.K k6 = (q2.K) c3429jj.f32164s.d();
                    V2.b bVar = new V2.b(c3429jj.f32157l);
                    Parcel A02 = c2582Hb.A0();
                    AbstractC3241g8.e(A02, k6);
                    AbstractC3241g8.e(A02, bVar);
                    c2582Hb.G0(A02, 1);
                    return;
                } catch (RemoteException e6) {
                    int i = t2.C.f40822b;
                    u2.i.d("RemoteException when notifyAdLoad is called", e6);
                    return;
                }
            case 1:
                ((C2658Lj) this.f31990u).f26199c = false;
                return;
            case 2:
                C2879Yj c2879Yj = (C2879Yj) this.f31990u;
                AbstractC3194fG.y(c2879Yj.f28855v);
                c2879Yj.f28852A = true;
                return;
            case 3:
                C3216fk c3216fk = (C3216fk) this.f31990u;
                synchronized (c3216fk) {
                    try {
                        ZD zd = c3216fk.f30861y;
                        if (zd.isDone()) {
                            return;
                        }
                        zd.d(Boolean.TRUE);
                        return;
                    } finally {
                    }
                }
            case 4:
                C3484kk c3484kk = (C3484kk) this.f31990u;
                synchronized (c3484kk.f32450n) {
                    try {
                        if (c3484kk.f32449B) {
                            return;
                        }
                        c3484kk.f32449B = true;
                        c3484kk.a();
                        return;
                    } finally {
                    }
                }
            case 5:
                C4293zk c4293zk = (C4293zk) this.f31990u;
                synchronized (c4293zk) {
                    int i4 = t2.C.f40822b;
                    u2.i.c("Timeout waiting for show call succeed to be called.");
                    c4293zk.V(new C2762Rl("Timeout for show call succeed."));
                    c4293zk.f35601x = true;
                }
                return;
            case 6:
                ((InterfaceC4079vm) this.f31990u).m();
                return;
            case 7:
                ViewTreeObserverOnGlobalLayoutListenerC4241ym viewTreeObserverOnGlobalLayoutListenerC4241ym = (ViewTreeObserverOnGlobalLayoutListenerC4241ym) this.f31990u;
                if (viewTreeObserverOnGlobalLayoutListenerC4241ym.f35407z == null) {
                    View view = new View(viewTreeObserverOnGlobalLayoutListenerC4241ym.f35404w.getContext());
                    viewTreeObserverOnGlobalLayoutListenerC4241ym.f35407z = view;
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
                if (viewTreeObserverOnGlobalLayoutListenerC4241ym.f35404w != viewTreeObserverOnGlobalLayoutListenerC4241ym.f35407z.getParent()) {
                    viewTreeObserverOnGlobalLayoutListenerC4241ym.f35404w.addView(viewTreeObserverOnGlobalLayoutListenerC4241ym.f35407z);
                    return;
                }
                return;
            case 8:
                ViewTreeObserverOnGlobalLayoutListenerC3433jn viewTreeObserverOnGlobalLayoutListenerC3433jn = (ViewTreeObserverOnGlobalLayoutListenerC3433jn) this.f31990u;
                try {
                    viewTreeObserverOnGlobalLayoutListenerC3433jn.getClass();
                    O2.w.d("#008 Must be called on the main UI thread.");
                    viewTreeObserverOnGlobalLayoutListenerC3433jn.H3();
                    C3648nm c3648nm = viewTreeObserverOnGlobalLayoutListenerC3433jn.f32195v;
                    if (c3648nm != null) {
                        c3648nm.o();
                    }
                    viewTreeObserverOnGlobalLayoutListenerC3433jn.f32195v = null;
                    viewTreeObserverOnGlobalLayoutListenerC3433jn.f32193n = null;
                    viewTreeObserverOnGlobalLayoutListenerC3433jn.f32194u = null;
                    viewTreeObserverOnGlobalLayoutListenerC3433jn.f32196w = true;
                    return;
                } catch (RemoteException e9) {
                    int i9 = t2.C.f40822b;
                    u2.i.i("#007 Could not call remote method.", e9);
                    return;
                }
            case 9:
                String str = p2.j.f39798C.f39808h.g().n().f28423e;
                boolean isEmpty = TextUtils.isEmpty(str);
                C3320hg c3320hg = (C3320hg) this.f31990u;
                if (isEmpty) {
                    c3320hg.b(new Exception());
                    return;
                } else {
                    c3320hg.a(str);
                    return;
                }
            case 10:
                C2799To c2799To = (C2799To) this.f31990u;
                InterfaceC3858rh interfaceC3858rh = c2799To.f27834w;
                C2748Qo c2748Qo = c2799To.f27833v;
                synchronized (c2748Qo) {
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put("platform", "ANDROID");
                        String str2 = c2748Qo.f27226k;
                        if (!TextUtils.isEmpty(str2)) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12);
                            sb.append("afma-sdk-a-v");
                            sb.append(str2);
                            jSONObject.put("sdkVersion", sb.toString());
                        }
                        jSONObject.put("internalSdkVersion", c2748Qo.i);
                        jSONObject.put("osVersion", Build.VERSION.RELEASE);
                        jSONObject.put("adapters", c2748Qo.f27220d.a());
                        C3151ea c3151ea = AbstractC3368ia.La;
                        q2.r rVar = q2.r.f40116e;
                        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                            String str3 = p2.j.f39798C.f39808h.f29018g;
                            if (!TextUtils.isEmpty(str3)) {
                                jSONObject.put("plugin", str3);
                            }
                        }
                        long j9 = c2748Qo.f27232q;
                        p2.j jVar = p2.j.f39798C;
                        jVar.f39810k.getClass();
                        if (j9 < System.currentTimeMillis() / 1000) {
                            c2748Qo.f27230o = "{}";
                        }
                        jSONObject.put("networkExtras", c2748Qo.f27230o);
                        jSONObject.put("adSlots", c2748Qo.i());
                        jSONObject.put("appInfo", c2748Qo.f27221e.j());
                        String str4 = jVar.f39808h.g().n().f28423e;
                        if (!TextUtils.isEmpty(str4)) {
                            jSONObject.put("cld", new JSONObject(str4));
                        }
                        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.Aa)).booleanValue() && (jSONObject2 = c2748Qo.f27231p) != null) {
                            String obj = jSONObject2.toString();
                            StringBuilder sb2 = new StringBuilder(obj.length() + 13);
                            sb2.append("Server data: ");
                            sb2.append(obj);
                            String sb3 = sb2.toString();
                            int i10 = t2.C.f40822b;
                            u2.i.a(sb3);
                            jSONObject.put("serverData", c2748Qo.f27231p);
                        }
                        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.za)).booleanValue()) {
                            jSONObject.put("openAction", c2748Qo.f27237v);
                            jSONObject.put("gesture", c2748Qo.f27233r);
                        }
                        jSONObject.put("isGamRegisteredTestDevice", jVar.f39814o.g());
                        u2.d dVar = C4907p.f40108g.f40109a;
                        jSONObject.put("isSimulator", u2.d.r());
                        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.Na)).booleanValue()) {
                            jSONObject.put("uiStorage", new JSONObject(c2748Qo.f27239x));
                        }
                        if (!TextUtils.isEmpty((CharSequence) rVar.f40119c.a(AbstractC3368ia.Pa))) {
                            jSONObject.put("gmaDisk", (JSONObject) c2748Qo.f27224h.f25377b);
                        }
                        if (!TextUtils.isEmpty((CharSequence) rVar.f40119c.a(AbstractC3368ia.Oa))) {
                            jSONObject.put("userDisk", (JSONObject) c2748Qo.f27223g.f25377b);
                        }
                    } catch (JSONException e10) {
                        p2.j.f39798C.f39808h.e("Inspector.toJson", e10);
                        int i11 = t2.C.f40822b;
                        u2.i.g("Ad inspector encountered an error", e10);
                    } finally {
                    }
                }
                interfaceC3858rh.i("window.inspectorInfo", jSONObject.toString());
                return;
            case 11:
                a();
                return;
            case 12:
                ((C3866rp) this.f31990u).a();
                return;
            case 13:
                ((C3866rp) this.f31990u).a();
                return;
            case 14:
                C2593Hm c2593Hm = (C2593Hm) this.f31990u;
                C3214fi c3214fi = (C3214fi) c2593Hm.f25417v;
                AbstractC3137eE.j(Context.class, (Context) c2593Hm.f25416u);
                C3214fi c3214fi2 = c3214fi.f30795b;
                C3761pr c3761pr = new C3761pr(c3214fi2);
                C4184xj c4184xj = (C4184xj) c3761pr.f33523u;
                C2809Uh c2809Uh = c3214fi2.f30793a;
                Context context = c2809Uh.f28060b;
                AbstractC3137eE.h(context);
                C3157eg c3157eg = AbstractC3212fg.f30739b;
                AbstractC3137eE.h(c3157eg);
                C3157eg c3157eg2 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg2);
                InterfaceC3901sN b9 = C4009uN.b(c4184xj);
                C5107a c5107a = c2809Uh.f28059a;
                AbstractC3137eE.h(c5107a);
                C3602mu c3602mu = new C3602mu(context, c3157eg, c3157eg2, b9, c5107a, c3761pr, (C3165eo) c3214fi2.f30819o.d());
                t2.G g9 = p2.j.f39798C.f39803c;
                if (t2.G.e(context.getPackageName())) {
                    c3157eg2.execute(new RunnableC3376ij(15, c3602mu));
                    return;
                }
                C3761pr c3761pr2 = new C3761pr(24, c3602mu);
                AbstractC3137eE.h(context);
                AbstractC3137eE.h(c5107a);
                c3157eg.execute(new RunnableC3376ij(16, new C3920sp(context, c5107a, c3761pr2)));
                return;
            case 15:
                ((C3602mu) this.f31990u).B();
                return;
            case 16:
                b();
                return;
            case 17:
                c();
                return;
            case 18:
                d();
                return;
            case 19:
                e();
                return;
            case 20:
                boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Pb)).booleanValue();
                Throwable th = (Throwable) this.f31990u;
                if (booleanValue) {
                    p2.j.f39798C.f39808h.f("TopicsSignalUnsampled.fetchTopicsSignal", th);
                    return;
                } else {
                    p2.j.f39798C.f39808h.e("TopicsSignal.fetchTopicsSignal", th);
                    return;
                }
            case 21:
                C3493kt c3493kt = (C3493kt) this.f31990u;
                c3493kt.getClass();
                c3493kt.f32479d.v(AbstractC3217fl.M(6, null, null));
                return;
            case 22:
                C3763pt c3763pt = (C3763pt) this.f31990u;
                c3763pt.getClass();
                c3763pt.f33530d.v(AbstractC3217fl.M(6, null, null));
                return;
            case 23:
                ((Fr) this.f31990u).e();
                return;
            case 24:
                Gt gt = (Gt) this.f31990u;
                gt.getClass();
                gt.f25237d.v(AbstractC3217fl.M(6, null, null));
                return;
            case 25:
                ((Jt) this.f31990u).e();
                return;
            case 26:
                Pt pt = (Pt) this.f31990u;
                pt.getClass();
                pt.f27073d.v(AbstractC3217fl.M(6, null, null));
                return;
            case 27:
                f();
                return;
            case 28:
                g();
                return;
            default:
                C3118dw c3118dw = (C3118dw) this.f31990u;
                AtomicBoolean atomicBoolean = c3118dw.f30259e;
                AudioManager audioManager = c3118dw.f30257c;
                int streamVolume = audioManager.getStreamVolume(3);
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                float f6 = 0.0f;
                if (streamMaxVolume > 0 && streamVolume > 0) {
                    f6 = streamVolume / streamMaxVolume;
                    if (f6 > 1.0f) {
                        f6 = 1.0f;
                    }
                }
                atomicBoolean.set(false);
                if (((Float) c3118dw.f30258d.getAndSet(Float.valueOf(f6))).floatValue() != f6) {
                    c3118dw.f30255a.post(new RunnableC3064cw(this, f6));
                    return;
                }
                return;
        }
    }

    public RunnableC3376ij(C3118dw c3118dw) {
        this.f31989n = 29;
        Objects.requireNonNull(c3118dw);
        this.f31990u = c3118dw;
    }
}
