package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class Js implements BD, InterfaceC3687oO {

    /* renamed from: n, reason: collision with root package name */
    public boolean f25831n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f25832u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f25833v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f25834w;

    /* renamed from: x, reason: collision with root package name */
    public Object f25835x;

    /* renamed from: y, reason: collision with root package name */
    public Object f25836y;

    public /* synthetic */ Js(Ls ls, String str, List list, Bundle bundle, boolean z8, boolean z9) {
        this.f25833v = ls;
        this.f25834w = str;
        this.f25835x = list;
        this.f25836y = bundle;
        this.f25831n = z8;
        this.f25832u = z9;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(8:5|6|7|8|(1:10)(1:67)|11|12|(2:14|(4:16|85|26|27)(1:35))(4:36|(1:38)|39|(2:41|(2:43|44)(2:45|46))(2:47|13d))))|71|72|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0065, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0066, code lost:
    
        t2.C.l("Couldn't create RTB adapter : ", r0);
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    @Override // com.google.android.gms.internal.ads.BD, com.google.android.gms.internal.ads.InterfaceC3404jB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public J3.a a() {
        InterfaceC2669Md interfaceC2669Md;
        InterfaceC2669Md b9;
        final Ls ls = (Ls) this.f25833v;
        String str = (String) this.f25834w;
        final List list = (List) this.f25835x;
        final Bundle bundle = (Bundle) this.f25836y;
        boolean z8 = this.f25831n;
        boolean z9 = this.f25832u;
        ls.getClass();
        final C3320hg c3320hg = new C3320hg();
        if (z9) {
            if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31718l2)).booleanValue()) {
                C3922sr c3922sr = ls.f26242f;
                c3922sr.getClass();
                try {
                    c3922sr.f34319a.put(str, c3922sr.f34320b.b(str));
                } catch (RemoteException e6) {
                    t2.C.l("Couldn't create RTB adapter : ", e6);
                }
                ConcurrentHashMap concurrentHashMap = c3922sr.f34319a;
                b9 = concurrentHashMap.containsKey(str) ? (InterfaceC2669Md) concurrentHashMap.get(str) : null;
                interfaceC2669Md = b9;
                if (interfaceC2669Md != null) {
                    C3151ea c3151ea = AbstractC3368ia.f31626b2;
                    q2.r rVar = q2.r.f40116e;
                    if (!((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                        throw null;
                    }
                    int i = BinderC4192xr.f35258x;
                    synchronized (BinderC4192xr.class) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("name", str);
                                jSONObject.put("signal_error", "Adapter failed to instantiate");
                                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31681h2)).booleanValue()) {
                                    jSONObject.put("signal_error_code", 1);
                                }
                                c3320hg.a(jSONObject);
                            } catch (JSONException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return c3320hg;
                }
                p2.j.f39798C.f39810k.getClass();
                final BinderC4192xr binderC4192xr = new BinderC4192xr(str, interfaceC2669Md, c3320hg, SystemClock.elapsedRealtime());
                C3151ea c3151ea2 = AbstractC3368ia.f31671g2;
                q2.r rVar2 = q2.r.f40116e;
                if (((Boolean) rVar2.f40119c.a(c3151ea2)).booleanValue()) {
                    ls.f26238b.schedule(new RunnableC3376ij(19, binderC4192xr), ((Long) rVar2.f40119c.a(AbstractC3368ia.f31606Z1)).longValue(), TimeUnit.MILLISECONDS);
                }
                if (z8) {
                    if (!((Boolean) rVar2.f40119c.a(AbstractC3368ia.f31735n2)).booleanValue()) {
                        interfaceC2669Md.y3(new V2.b(ls.f26240d), ls.i, bundle, (Bundle) list.get(0), ls.f26241e.f30903f, binderC4192xr);
                        return c3320hg;
                    }
                    final InterfaceC2669Md interfaceC2669Md2 = interfaceC2669Md;
                    ls.f26237a.a(new Runnable() { // from class: com.google.android.gms.internal.ads.Ks
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC2669Md interfaceC2669Md3 = interfaceC2669Md2;
                            Bundle bundle2 = bundle;
                            List list2 = list;
                            BinderC4192xr binderC4192xr2 = binderC4192xr;
                            Ls ls2 = Ls.this;
                            ls2.getClass();
                            try {
                                interfaceC2669Md3.y3(new V2.b(ls2.f26240d), ls2.i, bundle2, (Bundle) list2.get(0), ls2.f26241e.f30903f, binderC4192xr2);
                            } catch (RemoteException e9) {
                                c3320hg.b(e9);
                            }
                        }
                    });
                    return c3320hg;
                }
                synchronized (binderC4192xr) {
                    if (binderC4192xr.f35262w) {
                        return c3320hg;
                    }
                    try {
                        if (((Boolean) rVar2.f40119c.a(AbstractC3368ia.f31681h2)).booleanValue()) {
                            binderC4192xr.f35260u.put("signal_error_code", 0);
                        }
                    } catch (JSONException unused2) {
                    }
                    binderC4192xr.f35259n.a(binderC4192xr.f35260u);
                    binderC4192xr.f35262w = true;
                    return c3320hg;
                }
            }
        }
        b9 = ls.f26243g.b(str);
        interfaceC2669Md = b9;
        if (interfaceC2669Md != null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687oO
    public void b(C4045v5 c4045v5) {
        InterfaceC3687oO interfaceC3687oO = (InterfaceC3687oO) this.f25836y;
        if (interfaceC3687oO != null) {
            interfaceC3687oO.b(c4045v5);
            c4045v5 = ((InterfaceC3687oO) this.f25836y).h();
        }
        ((JO) this.f25833v).b(c4045v5);
    }

    public void c(AbstractC3149eQ abstractC3149eQ) {
        InterfaceC3687oO interfaceC3687oO;
        InterfaceC3687oO r02 = abstractC3149eQ.r0();
        if (r02 == null || r02 == (interfaceC3687oO = (InterfaceC3687oO) this.f25836y)) {
            return;
        }
        if (interfaceC3687oO != null) {
            throw new RN(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f25836y = r02;
        this.f25835x = abstractC3149eQ;
        ((GP) r02).b(((JO) this.f25833v).f25767w);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687oO
    public long e() {
        if (this.f25831n) {
            return ((JO) this.f25833v).e();
        }
        InterfaceC3687oO interfaceC3687oO = (InterfaceC3687oO) this.f25836y;
        interfaceC3687oO.getClass();
        return interfaceC3687oO.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687oO
    public boolean g() {
        if (this.f25831n) {
            return false;
        }
        InterfaceC3687oO interfaceC3687oO = (InterfaceC3687oO) this.f25836y;
        interfaceC3687oO.getClass();
        return interfaceC3687oO.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687oO
    public C4045v5 h() {
        InterfaceC3687oO interfaceC3687oO = (InterfaceC3687oO) this.f25836y;
        return interfaceC3687oO != null ? interfaceC3687oO.h() : ((JO) this.f25833v).f25767w;
    }

    public Js(C3365iO c3365iO) {
        this.f25834w = c3365iO;
        JO jo = new JO();
        jo.f25767w = C4045v5.f34711d;
        this.f25833v = jo;
        this.f25831n = true;
    }
}
