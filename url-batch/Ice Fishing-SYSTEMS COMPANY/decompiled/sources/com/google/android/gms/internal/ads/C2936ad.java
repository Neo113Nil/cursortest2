package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;
import q2.C4907p;

/* renamed from: com.google.android.gms.internal.ads.ad, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2936ad implements CD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29235c;

    public /* synthetic */ C2936ad(int i, Object obj, Object obj2) {
        this.f29233a = i;
        this.f29234b = obj;
        this.f29235c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
    
        ((com.google.android.gms.internal.ads.J4) r5.f34632w).f25731d++;
     */
    @Override // com.google.android.gms.internal.ads.CD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final J3.a b(Object obj) {
        C3059cr c3059cr;
        int i = 10;
        C4141wu c4141wu = null;
        int i4 = 0;
        switch (this.f29233a) {
            case 0:
                InterfaceC2787Tc interfaceC2787Tc = (InterfaceC2787Tc) obj;
                interfaceC2787Tc.f((String) this.f29234b, (InterfaceC2990bc) this.f29235c);
                return C3686oN.c(interfaceC2787Tc);
            case 1:
                C3154ed c3154ed = (C3154ed) this.f29234b;
                c3154ed.getClass();
                C3320hg c3320hg = new C3320hg();
                t2.G g9 = p2.j.f39798C.f39803c;
                String uuid = UUID.randomUUID().toString();
                AbstractC2935ac.f29218j.a(uuid, new C3422jc(c3154ed, c3320hg));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", uuid);
                jSONObject.put("args", (JSONObject) this.f29235c);
                InterfaceC2583Hc interfaceC2583Hc = (InterfaceC2583Hc) ((InterfaceC2787Tc) obj);
                interfaceC2583Hc.getClass();
                interfaceC2583Hc.i("google.afma.activeView.handleUpdate", jSONObject.toString());
                return c3320hg;
            case 2:
                C2657Li c2657Li = (C2657Li) this.f29234b;
                c2657Li.getClass();
                c2657Li.f26194e.a(new RunnableC2640Ki(c2657Li, (Throwable) obj, 0));
                String str = (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.Eb);
                Uri.Builder builder = (Uri.Builder) this.f29235c;
                builder.appendQueryParameter(str, com.anythink.expressad.videocommon.e.b.f22554j);
                return C3686oN.c(builder.toString());
            case 3:
                C2687Ne c2687Ne = (C2687Ne) obj;
                C2709Oj c2709Oj = (C2709Oj) this.f29234b;
                c2687Ne.f26574B = (C4087vu) this.f29235c;
                C4017ue c4017ue = c2709Oj.f26744h;
                return c4017ue.E(c2687Ne, new C3761pr(23, (C4190xp) c4017ue.f34631v), new Rx(27, c4017ue), new C3489kp(c2687Ne, 2));
            case 4:
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) obj;
                C3327hn c3327hn = (C3327hn) this.f29234b;
                C3226fu c3226fu = c3327hn.f31256a;
                W8 w82 = new W8(interfaceC3858rh);
                if (c3226fu.f30899b != null) {
                    interfaceC3858rh.J0(new W2.b(5, 0, 0));
                } else {
                    interfaceC3858rh.J0(new W2.b(4, 0, 0));
                }
                interfaceC3858rh.j0().f25412z = new C3602mu(c3327hn, interfaceC3858rh, w82, i);
                interfaceC3858rh.b("google.afma.nativeAds.renderVideo", (JSONObject) this.f29235c);
                return w82;
            case 5:
                JSONObject jSONObject2 = (JSONObject) obj;
                C3813qp c3813qp = (C3813qp) this.f29234b;
                c3813qp.getClass();
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31485L2)).booleanValue()) {
                    p2.j.f39798C.f39810k.getClass();
                    c3813qp.i.c("scar-preloader-processing-done", System.currentTimeMillis());
                }
                return ((C2889Zc) this.f29235c).a(jSONObject2);
            case 6:
                Exception exc = (Exception) obj;
                C3813qp c3813qp2 = (C3813qp) this.f29234b;
                c3813qp2.getClass();
                p2.j.f39798C.f39808h.e("PreloadedLoader.getTypeTwoAdResponseString", exc);
                if (exc instanceof TimeoutException) {
                    c3059cr = new C3059cr(1, "Timed out waiting for ad response.");
                } else if (exc instanceof C3059cr) {
                    c3059cr = (C3059cr) exc;
                } else {
                    c3059cr = new C3059cr(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                }
                String message = c3059cr.getMessage() == null ? "" : c3059cr.getMessage();
                List list = (List) this.f29235c;
                if (list != null && !list.isEmpty()) {
                    String str2 = "0.6.0.0";
                    if (!TextUtils.isEmpty(message)) {
                        if (message.contains("Timed out waiting for ad response.")) {
                            message = "timeout";
                            str2 = "0.2.0.0";
                        } else if (message.contains("Received HTTP error code from ad server:")) {
                            List r9 = com.bumptech.glide.manager.o.d(new TA(':')).r(message);
                            if (r9.size() == 2) {
                                message = (String) r9.get(1);
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C4304zv.c(C4304zv.c((String) it.next(), "@gw_adnetstatus@", str2), "@error_code@", message));
                    }
                    c3813qp2.f33889j.a(arrayList, null);
                }
                return C3686oN.l(c3059cr);
            case 7:
                return ((InterfaceC2477Ap) ((InterfaceC4279zN) this.f29234b).d()).c((C2687Ne) this.f29235c);
            case 8:
                Bundle bundle = (Bundle) obj;
                C3159ei c3159ei = (C3159ei) this.f29234b;
                C3913si c3913si = c3159ei.f30456c;
                C3214fi c3214fi = c3159ei.f30455b;
                Context context = c3214fi.f30793a.f28060b;
                AbstractC3137eE.h(context);
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                AbstractC3137eE.h(c3157eg);
                AbstractC3137eE.h(((C2687Ne) ((C3115dt) c3913si.f34260b).f30253b.f1195v).f26582w);
                C3061ct c3061ct = new C3061ct();
                C4009uN c4009uN = c3214fi.f30799d;
                Sr sr = new Sr(c3061ct, 0L, (ScheduledExecutorService) c4009uN.d());
                C2941ai c2941ai = c3159ei.f30457d;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) c2941ai.f29264c.d();
                c2941ai.f29263b.a();
                Sr sr2 = new Sr(new Or(7, scheduledExecutorService), ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31646d5)).longValue(), (ScheduledExecutorService) c4009uN.d());
                Sr sr3 = new Sr(c3159ei.f30458e.c(), 0L, (ScheduledExecutorService) c4009uN.d());
                AbstractC3137eE.h(c3157eg);
                Sr sr4 = new Sr(new C3923ss(c3157eg, 5), 0L, (ScheduledExecutorService) c4009uN.d());
                C2877Yh c2877Yh = c3159ei.f30459f;
                AbstractC3137eE.h(c3157eg);
                c2877Yh.f28846b.a();
                C3923ss c3923ss = new C3923ss(c3157eg, 4);
                AbstractC3137eE.h(c3157eg);
                ArrayList arrayList2 = ((C2687Ne) c3159ei.f30454a.f1195v).f26583x;
                AbstractC3137eE.h(arrayList2);
                C3278gs c3278gs = new C3278gs(6, c3157eg, arrayList2);
                c3159ei.getClass();
                C3157eg c3157eg2 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg2);
                C2687Ne c2687Ne2 = (C2687Ne) c3159ei.f30454a.f1195v;
                String string = c2687Ne2.f26579n.getString("ms");
                if (string == null) {
                    string = "";
                }
                PackageInfo packageInfo = c2687Ne2.f26584y;
                return new C2518Df(context, c3157eg, AbstractC2917aC.i(sr, sr2, sr3, sr4, c3923ss, c3278gs, new C3278gs(5, c3157eg2, string), (Rs) c3214fi.f30786S0.d(), c3159ei.f30460g.c(), c3159ei.f30461h.e()), (Yu) c3159ei.i.d()).i(C4907p.f40108g.f40109a.m(bundle), ((C2687Ne) this.f29235c).f26578F);
            case 9:
                return ((C2518Df) this.f29234b).i(C4907p.f40108g.f40109a.m((Bundle) obj), ((C2687Ne) this.f29235c).f26578F);
            case 10:
                JSONObject jSONObject3 = (JSONObject) obj;
                C2750Qq c2750Qq = (C2750Qq) this.f29234b;
                c2750Qq.getClass();
                OD c4 = C3686oN.c((C4026un) this.f29235c);
                C3710ou c3710ou = c2750Qq.f27252d;
                synchronized (c3710ou) {
                    c3710ou.f33231a.addFirst(c4);
                }
                if (!jSONObject3.optBoolean("success")) {
                    throw new K2.m("process json failed");
                }
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31485L2)).booleanValue()) {
                    p2.j.f39798C.f39810k.getClass();
                    c2750Qq.f27254f.c("rendering-native-ads-preprocess-end", System.currentTimeMillis());
                }
                return C3686oN.c(jSONObject3.getJSONObject("json").getJSONArray(com.anythink.expressad.foundation.d.e.f18820h));
            case 11:
                C4026un c4026un = (C4026un) obj;
                C2750Qq c2750Qq2 = (C2750Qq) this.f29234b;
                c2750Qq2.getClass();
                C3151ea c3151ea = AbstractC3368ia.f31485L2;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    p2.j.f39798C.f39810k.getClass();
                    c2750Qq2.f27254f.c("rendering-native-ads-preprocess-start", System.currentTimeMillis());
                }
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("isNonagon", true);
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.Q9)).booleanValue() && S2.b.g()) {
                    jSONObject4.put("skipDeepLinkValidation", true);
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("response", ((Ut) this.f29235c).f28173s.f28908c);
                jSONObject5.put("sdk_params", jSONObject4);
                return C3686oN.y(c4026un.a("google.afma.nativeAds.preProcessJson", jSONObject5), new C2936ad(i, c2750Qq2, c4026un), c2750Qq2.f27250b);
            case 12:
                C2953au c2953au = (C2953au) obj;
                ((C4141wu) this.f29234b).f35086b = c2953au;
                Iterator it2 = ((List) c2953au.f29349b.f24453u).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Iterator it3 = ((Ut) it2.next()).f28139a.iterator();
                        while (it3.hasNext()) {
                            if (((String) it3.next()).contains("FirstPartyRenderer")) {
                                i4 = 1;
                            }
                        }
                    } else if (i4 != 0) {
                        return ((C2709Oj) this.f29235c).c(C3686oN.c(c2953au));
                    }
                }
                return OD.f26665u;
            case 13:
                C4017ue c4017ue2 = (C4017ue) this.f29234b;
                InterfaceC3592mk interfaceC3592mk = (InterfaceC3592mk) this.f29235c;
                C4194xt c4194xt = (C4194xt) obj;
                C4017ue c4017ue3 = (C4017ue) c4017ue2.f34630u;
                InterfaceC4195xu interfaceC4195xu = c4194xt.f35268b;
                C2687Ne c2687Ne3 = c4194xt.f35267a;
                synchronized (c4017ue3) {
                    try {
                        C3871ru c3871ru = (C3871ru) ((ConcurrentHashMap) c4017ue3.f34630u).get(interfaceC4195xu);
                        if (c3871ru != null) {
                            Eu eu = c3871ru.f34140d;
                            eu.getClass();
                            p2.j.f39798C.f39810k.getClass();
                            eu.f24844c = System.currentTimeMillis();
                            eu.f24845d++;
                            c3871ru.a();
                            LinkedList linkedList = c3871ru.f34137a;
                            if (!linkedList.isEmpty() && (c4141wu = (C4141wu) linkedList.remove()) != null) {
                                eu.f24846e++;
                                eu.f24843b.f24601n = true;
                                break;
                            }
                            Du du = c3871ru.f34140d.f24843b;
                            Du clone = du.clone();
                            du.f24601n = false;
                            du.f24602u = 0;
                            if (c4141wu != null) {
                                C4265z9 A8 = E9.A();
                                C4157x9 B8 = C4211y9.B();
                                B8.h();
                                ((C4211y9) B8.f30000u).C();
                                A9 A9 = B9.A();
                                boolean z8 = clone.f24601n;
                                A9.h();
                                ((B9) A9.f30000u).C(z8);
                                int i9 = clone.f24602u;
                                A9.h();
                                ((B9) A9.f30000u).D(i9);
                                B8.h();
                                ((C4211y9) B8.f30000u).D((B9) A9.j());
                                A8.h();
                                ((E9) A8.f30000u).B((C4211y9) B8.j());
                                c4141wu.f35085a.a().f26742f.t((E9) A8.j());
                            }
                            c4017ue3.D();
                        } else {
                            ((J4) c4017ue3.f34632w).f25730c++;
                            c4017ue3.D();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (c4141wu != null && c2687Ne3 != null) {
                    C2709Oj a9 = interfaceC3592mk.a();
                    Lu lu = Lu.NOTIFY_CACHE_HIT;
                    C4017ue c4017ue4 = a9.f26744h;
                    Ku r10 = a9.f26739c.a(c4017ue4.E(c2687Ne3, new Vx(25, c4017ue4), new C3562m7(24, c4017ue4), C2538Ei.f24794f), lu).r();
                    r10.c(new MD(i4, r10, new C3761pr(15, a9)), a9.f26745j);
                    r10.c(new MD(i4, r10, (Dr) c4017ue2.f34632w), (SD) c4017ue2.f34631v);
                }
                return C3686oN.c(new C3978tt(interfaceC4195xu, c2687Ne3, c4141wu));
            default:
                return ((Ny) ((Zx) this.f29234b).f29116b.f27454f.get()).b((Context) this.f29235c);
        }
    }
}
