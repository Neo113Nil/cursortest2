package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p2.C4856a;
import t2.C5074h;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Jj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2624Jj implements CD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25791b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25792c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25793d;

    public /* synthetic */ C2624Jj(InterfaceC3436jq interfaceC3436jq, Ut ut, C2953au c2953au, C3431jl c3431jl, int i) {
        this.f25790a = i;
        this.f25791b = interfaceC3436jq;
        this.f25792c = ut;
        this.f25793d = c2953au;
    }

    @Override // com.google.android.gms.internal.ads.CD
    public final J3.a b(Object obj) {
        switch (this.f25790a) {
            case 0:
                AbstractC2539Ej abstractC2539Ej = (AbstractC2539Ej) obj;
                C2658Lj c2658Lj = (C2658Lj) this.f25791b;
                c2658Lj.getClass();
                if (abstractC2539Ej != null) {
                    ((r) this.f25792c).mo7l(abstractC2539Ej);
                }
                return C3686oN.w((J3.a) this.f25793d, ((Long) AbstractC2853Xa.f28652a.r()).longValue(), TimeUnit.MILLISECONDS, c2658Lj.f26198b);
            case 1:
                q2.g1 a9 = q2.g1.a();
                C3327hn c3327hn = (C3327hn) this.f25791b;
                InterfaceC3858rh a10 = c3327hn.f31258c.a(a9, null, null);
                W8 w82 = new W8(a10);
                c3327hn.a(a10, (C4856a) this.f25792c, (C4072vf) this.f25793d);
                a10.j0().f25381A = new Rx(23, w82);
                a10.loadUrl((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31438F4));
                return w82;
            case 2:
                String str = (String) this.f25792c;
                JSONObject jSONObject = (JSONObject) this.f25793d;
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) obj;
                C2871Yb c2871Yb = ((C4026un) this.f25791b).f34657h;
                c2871Yb.getClass();
                C3320hg c3320hg = new C3320hg();
                t2.G g9 = p2.j.f39798C.f39803c;
                String uuid = UUID.randomUUID().toString();
                c2871Yb.a(uuid, new C3422jc(c2871Yb, c3320hg));
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", uuid);
                    jSONObject2.put("args", jSONObject);
                    interfaceC3858rh.b(str, jSONObject2);
                } catch (Exception e6) {
                    c3320hg.b(e6);
                }
                return c3320hg;
            case 3:
                C3867rq c3867rq = (C3867rq) this.f25791b;
                c3867rq.getClass();
                C3151ea c3151ea = AbstractC3368ia.f31494M2;
                q2.r rVar = q2.r.f40116e;
                boolean booleanValue = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
                C3002bo c3002bo = c3867rq.i;
                if (booleanValue) {
                    com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c3002bo, "rendering-webview-creation-start");
                }
                C2953au c2953au = (C2953au) this.f25793d;
                C2518Df c2518Df = c2953au.f29349b;
                C3226fu c3226fu = c3867rq.f34115c;
                Ut ut = (Ut) this.f25792c;
                final InterfaceC3858rh a11 = c3867rq.f34114b.a(c3226fu.f30903f, ut, (Wt) c2518Df.f24454v);
                a11.Y0(ut.f28136W);
                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea)).booleanValue()) {
                    com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c3002bo, "rendering-webview-creation-end");
                }
                C3320hg c3320hg2 = new C3320hg();
                C3602mu c3602mu = new C3602mu(c2953au, ut, (String) null);
                C5107a c5107a = c3867rq.f34117e;
                C3153ec c3153ec = c3867rq.f34118f;
                boolean z8 = c3867rq.f34119g;
                C3153ec c3153ec2 = c3153ec;
                C2881Yl c2881Yl = new C2881Yl(27, new C3975tq(c5107a, c3320hg2, ut, a11, c3226fu, z8, c3153ec, c3867rq.f34120h, c3867rq.f34121j), a11);
                J6.i iVar = new J6.i(ut.f28140a0, 3);
                C3375ii c3375ii = c3867rq.f34113a;
                C3268gi c3268gi = new C3268gi(c3375ii.f31933c, c3375ii.f31936d, c3602mu, c2881Yl, iVar);
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea)).booleanValue()) {
                    com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c3002bo, "rendering-ad-component-creation-end");
                }
                C4009uN c4009uN = c3268gi.f31071R0;
                C2611In c2611In = (C2611In) c4009uN.d();
                if (true != z8) {
                    c3153ec2 = null;
                }
                c2611In.a(a11, false, c3153ec2, c3002bo);
                c3320hg2.a(c3268gi);
                final int i = 0;
                ((C2489Bk) c3268gi.C0.d()).s1(new InterfaceC2506Ck() { // from class: com.google.android.gms.internal.ads.qq
                    @Override // com.google.android.gms.internal.ads.InterfaceC2506Ck
                    public final /* synthetic */ void y() {
                        switch (i) {
                            case 0:
                                InterfaceC3858rh interfaceC3858rh2 = a11;
                                if (interfaceC3858rh2.j0() != null) {
                                    interfaceC3858rh2.j0().D();
                                    break;
                                }
                                break;
                            case 1:
                                InterfaceC3858rh interfaceC3858rh3 = a11;
                                if (interfaceC3858rh3.j0() != null) {
                                    interfaceC3858rh3.j0().D();
                                    break;
                                }
                                break;
                            case 2:
                                InterfaceC3858rh interfaceC3858rh4 = a11;
                                if (interfaceC3858rh4.j0() != null) {
                                    interfaceC3858rh4.j0().D();
                                    break;
                                }
                                break;
                            default:
                                InterfaceC3858rh interfaceC3858rh5 = a11;
                                if (interfaceC3858rh5.j0() != null) {
                                    interfaceC3858rh5.j0().D();
                                    break;
                                }
                                break;
                        }
                    }
                }, AbstractC3212fg.f30745h);
                Yt yt = ut.f28173s;
                String str2 = yt.f28906a;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.k6)).booleanValue() && ((C3276gq) c3268gi.f31055A0.d()).a()) {
                    str2 = AbstractC2622Jh.a(str2, AbstractC2622Jh.b(ut));
                }
                return C3686oN.A(C2611In.b(a11, yt.f28907b, str2, c3002bo, (Yu) c3375ii.f31942f.d()), new C3161ek(a11, ut, c3268gi, 1), c3867rq.f34116d);
            case 4:
                C4299zq c4299zq = (C4299zq) this.f25791b;
                c4299zq.getClass();
                C3151ea c3151ea2 = AbstractC3368ia.f31494M2;
                q2.r rVar2 = q2.r.f40116e;
                boolean booleanValue2 = ((Boolean) rVar2.f40119c.a(c3151ea2)).booleanValue();
                C3002bo c3002bo2 = c4299zq.f35621g;
                if (booleanValue2) {
                    com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c3002bo2, "rendering-webview-creation-start");
                }
                Ut ut2 = (Ut) this.f25793d;
                Context context = c4299zq.f35616b;
                q2.g1 i4 = AbstractC3035cL.i(context, ut2.f28177u);
                C2953au c2953au2 = (C2953au) this.f25792c;
                final InterfaceC3858rh a12 = c4299zq.f35617c.a(i4, ut2, (Wt) c2953au2.f29349b.f24454v);
                a12.Y0(ut2.f28136W);
                C3151ea c3151ea3 = AbstractC3368ia.W8;
                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2 = rVar2.f40119c;
                View a13 = (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(c3151ea3)).booleanValue() && ut2.f28152g0) ? ViewTreeObserverOnScrollChangedListenerC4076vj.a(context, a12.b0(), ut2) : new C2662Ln(context, a12.b0(), (C5074h) c4299zq.f35620f.apply(ut2));
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(c3151ea2)).booleanValue()) {
                    com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c3002bo2, "rendering-webview-creation-end");
                }
                C3602mu c3602mu2 = new C3602mu(c2953au2, ut2, (String) null);
                C2518Df c2518Df2 = new C2518Df(a13, a12, new C4245yq(a12), i4.f40048B ? new Vt(-3, 0, true) : new Vt(i4.f40060x, i4.f40057u, false));
                C3482ki c3482ki = c4299zq.f35615a;
                C3428ji c3428ji = new C3428ji(c3482ki.f32375d, c3482ki.f32378e, c3602mu2, c2518Df2);
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(c3151ea2)).booleanValue()) {
                    com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c3002bo2, "rendering-ad-component-creation-end");
                }
                C4009uN c4009uN2 = c3428ji.f32136Q0;
                ((C2611In) c4009uN2.d()).a(a12, false, null, c3002bo2);
                C2489Bk c2489Bk = (C2489Bk) c3428ji.f32124E0.d();
                final int i9 = 1;
                InterfaceC2506Ck interfaceC2506Ck = new InterfaceC2506Ck() { // from class: com.google.android.gms.internal.ads.qq
                    @Override // com.google.android.gms.internal.ads.InterfaceC2506Ck
                    public final /* synthetic */ void y() {
                        switch (i9) {
                            case 0:
                                InterfaceC3858rh interfaceC3858rh2 = a12;
                                if (interfaceC3858rh2.j0() != null) {
                                    interfaceC3858rh2.j0().D();
                                    break;
                                }
                                break;
                            case 1:
                                InterfaceC3858rh interfaceC3858rh3 = a12;
                                if (interfaceC3858rh3.j0() != null) {
                                    interfaceC3858rh3.j0().D();
                                    break;
                                }
                                break;
                            case 2:
                                InterfaceC3858rh interfaceC3858rh4 = a12;
                                if (interfaceC3858rh4.j0() != null) {
                                    interfaceC3858rh4.j0().D();
                                    break;
                                }
                                break;
                            default:
                                InterfaceC3858rh interfaceC3858rh5 = a12;
                                if (interfaceC3858rh5.j0() != null) {
                                    interfaceC3858rh5.j0().D();
                                    break;
                                }
                                break;
                        }
                    }
                };
                C3157eg c3157eg = AbstractC3212fg.f30745h;
                c2489Bk.s1(interfaceC2506Ck, c3157eg);
                Yt yt2 = ut2.f28173s;
                String str3 = yt2.f28906a;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(AbstractC3368ia.k6)).booleanValue() && ((C3276gq) c3428ji.C0.d()).a()) {
                    str3 = AbstractC2622Jh.a(str3, AbstractC2622Jh.b(ut2));
                }
                C3320hg b9 = C2611In.b(a12, yt2.f28907b, str3, c3002bo2, (Yu) c3482ki.f32423u0.d());
                ZD zd = b9.f31242n;
                boolean z9 = ut2.f28126M;
                Executor executor = c4299zq.f35619e;
                if (z9) {
                    zd.c(new RunnableC3968tj(a12, 5), executor);
                }
                zd.c(new RunnableC3329hp(3, c4299zq, a12), executor);
                return C3686oN.A(b9, new C2670Me(2, c3428ji), c3157eg);
            case 5:
                return C3686oN.c(ViewTreeObserverOnScrollChangedListenerC4076vj.a(((C4083vq) this.f25791b).f34871b, (View) this.f25792c, (Ut) this.f25793d));
            case 6:
                return C3686oN.c(ViewTreeObserverOnScrollChangedListenerC4076vj.a(((C2529Dq) this.f25791b).f24572b, (View) this.f25792c, (Ut) this.f25793d));
            case 7:
                C2648Kq c2648Kq = (C2648Kq) this.f25791b;
                c2648Kq.getClass();
                C3151ea c3151ea4 = AbstractC3368ia.f31494M2;
                q2.r rVar3 = q2.r.f40116e;
                boolean booleanValue3 = ((Boolean) rVar3.f40119c.a(c3151ea4)).booleanValue();
                C3002bo c3002bo3 = c2648Kq.f26050j;
                if (booleanValue3) {
                    com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c3002bo3, "rendering-webview-creation-start");
                }
                C2953au c2953au3 = (C2953au) this.f25793d;
                C2518Df c2518Df3 = c2953au3.f29349b;
                C3226fu c3226fu2 = c2648Kq.f26045d;
                Ut ut3 = (Ut) this.f25792c;
                final InterfaceC3858rh a14 = c2648Kq.f26044c.a(c3226fu2.f30903f, ut3, (Wt) c2518Df3.f24454v);
                a14.Y0(ut3.f28136W);
                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga3 = rVar3.f40119c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga3.a(c3151ea4)).booleanValue()) {
                    com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c3002bo3, "rendering-webview-creation-end");
                }
                C3320hg c3320hg3 = new C3320hg();
                C3602mu c3602mu3 = new C3602mu(c2953au3, ut3, (String) null);
                C5107a c5107a2 = c2648Kq.f26047f;
                C3153ec c3153ec3 = c2648Kq.f26048g;
                Context context2 = c2648Kq.f26043b;
                boolean z10 = c2648Kq.f26049h;
                C2881Yl c2881Yl2 = new C2881Yl(27, new C2631Jq(context2, c5107a2, c3320hg3, ut3, a14, c3226fu2, z10, c3153ec3, c2648Kq.i, c2648Kq.f26051k), a14);
                C3644ni c3644ni = (C3644ni) c2648Kq.f26052l;
                C3590mi c3590mi = new C3590mi(c3644ni.f32930b, c3644ni.f32933c, c3602mu3, c2881Yl2);
                c3320hg3.a(c3590mi);
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga3.a(c3151ea4)).booleanValue()) {
                    com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c3002bo3, "rendering-ad-component-creation-end");
                }
                final int i10 = 2;
                ((C2489Bk) c3590mi.f32707B0.d()).s1(new InterfaceC2506Ck() { // from class: com.google.android.gms.internal.ads.qq
                    @Override // com.google.android.gms.internal.ads.InterfaceC2506Ck
                    public final /* synthetic */ void y() {
                        switch (i10) {
                            case 0:
                                InterfaceC3858rh interfaceC3858rh2 = a14;
                                if (interfaceC3858rh2.j0() != null) {
                                    interfaceC3858rh2.j0().D();
                                    break;
                                }
                                break;
                            case 1:
                                InterfaceC3858rh interfaceC3858rh3 = a14;
                                if (interfaceC3858rh3.j0() != null) {
                                    interfaceC3858rh3.j0().D();
                                    break;
                                }
                                break;
                            case 2:
                                InterfaceC3858rh interfaceC3858rh4 = a14;
                                if (interfaceC3858rh4.j0() != null) {
                                    interfaceC3858rh4.j0().D();
                                    break;
                                }
                                break;
                            default:
                                InterfaceC3858rh interfaceC3858rh5 = a14;
                                if (interfaceC3858rh5.j0() != null) {
                                    interfaceC3858rh5.j0().D();
                                    break;
                                }
                                break;
                        }
                    }
                }, AbstractC3212fg.f30745h);
                Yt yt3 = ut3.f28173s;
                String str4 = yt3.f28906a;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga3.a(AbstractC3368ia.k6)).booleanValue() && ((C3276gq) c3590mi.f32744z0.d()).a()) {
                    str4 = AbstractC2622Jh.a(str4, AbstractC2622Jh.b(ut3));
                }
                C4009uN c4009uN3 = c3590mi.f32726T0;
                C2611In c2611In2 = (C2611In) c4009uN3.d();
                if (true != z10) {
                    c3153ec3 = null;
                }
                c2611In2.a(a14, true, c3153ec3, c3002bo3);
                return C3686oN.A(C2611In.b(a14, yt3.f28907b, str4, c3002bo3, (Yu) c3644ni.f32967o0.d()), new C3161ek(a14, ut3, c3590mi, 2), c2648Kq.f26046e);
            case 8:
                JSONArray jSONArray = (JSONArray) obj;
                C2750Qq c2750Qq = (C2750Qq) this.f25791b;
                c2750Qq.getClass();
                if (jSONArray.length() == 0) {
                    return C3686oN.l(new C3275gp(3));
                }
                C2953au c2953au4 = (C2953au) this.f25792c;
                C3226fu c3226fu3 = (C3226fu) c2953au4.f29348a.f26393u;
                Ut ut4 = (Ut) this.f25793d;
                int i11 = c3226fu3.f30908l;
                if (i11 <= 1) {
                    return C3686oN.A(c2750Qq.c(c2953au4, ut4, jSONArray.getJSONObject(0)), J2.f25699k, c2750Qq.f27250b);
                }
                int length = jSONArray.length();
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31503N2)).booleanValue()) {
                    c2750Qq.f27254f.b("nsl", String.valueOf(length));
                }
                c2750Qq.f27252d.a(Math.min(length, i11));
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 < i11; i12++) {
                    if (i12 < length) {
                        arrayList.add(c2750Qq.c(c2953au4, ut4, jSONArray.getJSONObject(i12)));
                    } else {
                        arrayList.add(C3686oN.l(new C3275gp(3)));
                    }
                }
                return C3686oN.c(arrayList);
            default:
                C2648Kq c2648Kq2 = (C2648Kq) this.f25791b;
                c2648Kq2.getClass();
                C3151ea c3151ea5 = AbstractC3368ia.f31494M2;
                q2.r rVar4 = q2.r.f40116e;
                boolean booleanValue4 = ((Boolean) rVar4.f40119c.a(c3151ea5)).booleanValue();
                C3002bo c3002bo4 = c2648Kq2.f26050j;
                if (booleanValue4) {
                    com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c3002bo4, "rendering-webview-creation-start");
                }
                C2953au c2953au5 = (C2953au) this.f25793d;
                C2518Df c2518Df4 = c2953au5.f29349b;
                C3226fu c3226fu4 = c2648Kq2.f26045d;
                Ut ut5 = (Ut) this.f25792c;
                C2628Jn c2628Jn = c2648Kq2.f26044c;
                final InterfaceC3858rh a15 = c2628Jn.a(c3226fu4.f30903f, ut5, (Wt) c2518Df4.f24454v);
                a15.Y0(ut5.f28136W);
                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga4 = rVar4.f40119c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga4.a(c3151ea5)).booleanValue()) {
                    com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c3002bo4, "rendering-webview-creation-end");
                }
                C3320hg c3320hg4 = new C3320hg();
                C3602mu c3602mu4 = new C3602mu(c2953au5, ut5, (String) null);
                C5107a c5107a3 = c2648Kq2.f26047f;
                C3153ec c3153ec4 = c2648Kq2.f26048g;
                Context context3 = c2648Kq2.f26043b;
                boolean z11 = c2648Kq2.f26049h;
                BinderC2949aq binderC2949aq = c2648Kq2.i;
                C3002bo c3002bo5 = c2648Kq2.f26050j;
                C2509Cn c2509Cn = new C2509Cn(new C3.m(context3, c2628Jn, c3226fu4, c5107a3, ut5, c3320hg4, a15, c3153ec4, z11, binderC2949aq, c3002bo5, c2648Kq2.f26051k), a15, 0);
                C3806qi c3806qi = (C3806qi) c2648Kq2.f26052l;
                C3752pi c3752pi = new C3752pi(c3806qi.f33795c, c3806qi.f33798d, c3602mu4, c2509Cn);
                c3320hg4.a(c3752pi);
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga4.a(c3151ea5)).booleanValue()) {
                    com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c3002bo5, "rendering-ad-component-creation-end");
                }
                a15.N0("/reward", new C2752Rb(5, (C2575Gl) c3752pi.f33453S0.d()));
                final int i13 = 3;
                ((C2489Bk) c3752pi.f33436B0.d()).s1(new InterfaceC2506Ck() { // from class: com.google.android.gms.internal.ads.qq
                    @Override // com.google.android.gms.internal.ads.InterfaceC2506Ck
                    public final /* synthetic */ void y() {
                        switch (i13) {
                            case 0:
                                InterfaceC3858rh interfaceC3858rh2 = a15;
                                if (interfaceC3858rh2.j0() != null) {
                                    interfaceC3858rh2.j0().D();
                                    break;
                                }
                                break;
                            case 1:
                                InterfaceC3858rh interfaceC3858rh3 = a15;
                                if (interfaceC3858rh3.j0() != null) {
                                    interfaceC3858rh3.j0().D();
                                    break;
                                }
                                break;
                            case 2:
                                InterfaceC3858rh interfaceC3858rh4 = a15;
                                if (interfaceC3858rh4.j0() != null) {
                                    interfaceC3858rh4.j0().D();
                                    break;
                                }
                                break;
                            default:
                                InterfaceC3858rh interfaceC3858rh5 = a15;
                                if (interfaceC3858rh5.j0() != null) {
                                    interfaceC3858rh5.j0().D();
                                    break;
                                }
                                break;
                        }
                    }
                }, AbstractC3212fg.f30745h);
                C4009uN c4009uN4 = c3752pi.f33455T0;
                ((C2611In) c4009uN4.d()).a(a15, true, true != z11 ? null : c3153ec4, c3002bo5);
                Yt yt4 = ut5.f28173s;
                String str5 = yt4.f28906a;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga4.a(AbstractC3368ia.k6)).booleanValue() && ((C3276gq) c3752pi.f33474z0.d()).a()) {
                    str5 = AbstractC2622Jh.a(str5, AbstractC2622Jh.b(ut5));
                }
                return C3686oN.A(C2611In.b(a15, yt4.f28907b, str5, c3002bo5, (Yu) c3806qi.f33807g.d()), new C3161ek(a15, ut5, c3752pi, 3), c2648Kq2.f26046e);
        }
    }

    public /* synthetic */ C2624Jj(Object obj, Object obj2, Object obj3, int i) {
        this.f25790a = i;
        this.f25791b = obj;
        this.f25792c = obj2;
        this.f25793d = obj3;
    }
}
