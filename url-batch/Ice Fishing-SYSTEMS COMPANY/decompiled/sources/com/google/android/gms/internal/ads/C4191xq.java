package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import k2.EnumC4631b;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4191xq implements InterfaceC3760pq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35255a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f35256b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f35257c;

    public /* synthetic */ C4191xq(int i, Context context, Object obj) {
        this.f35255a = i;
        this.f35256b = context;
        this.f35257c = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3760pq
    public final Object a(C2953au c2953au, Ut ut, C3598mq c3598mq) {
        switch (this.f35255a) {
            case 0:
                C2518Df c2518Df = new C2518Df(ut, (InterfaceC2669Md) c3598mq.f32761b, EnumC4631b.APP_OPEN_AD);
                C3602mu c3602mu = new C3602mu(c2953au, ut, c3598mq.f32760a);
                C2881Yl c2881Yl = new C2881Yl(27, c2518Df, (Object) null);
                J6.i iVar = new J6.i(ut.f28140a0, 3);
                C3375ii c3375ii = (C3375ii) this.f35257c;
                C3214fi c3214fi = c3375ii.f31933c;
                C3375ii c3375ii2 = c3375ii.f31936d;
                C3268gi c3268gi = new C3268gi(c3214fi, c3375ii2, c3602mu, c2881Yl, iVar);
                C4009uN c4009uN = c3268gi.C0;
                c2518Df.f24456x = (C2489Bk) c4009uN.d();
                ((BinderC2597Hq) c3598mq.f32762c).H3(new BinderC3491kr((C3808qk) c3268gi.f31061H0.d(), (C2507Cl) c3268gi.f31063J0.d(), (C2489Bk) c4009uN.d(), (C2557Fk) c3268gi.f31059F0.d(), (C2591Hk) c3268gi.f31064K0.d(), (C3325hl) c3375ii2.f31944f1.d(), (C2727Pk) c3268gi.f31066M0.d(), (C2626Jl) c3268gi.f31067N0.d(), (C3162el) c3268gi.f31068O0.d(), (C4293zk) c3268gi.f31070Q0.d()));
                return c3268gi.L();
            case 1:
                C2518Df c2518Df2 = new C2518Df(ut, (InterfaceC2669Md) c3598mq.f32761b, EnumC4631b.INTERSTITIAL);
                C3602mu c3602mu2 = new C3602mu(c2953au, ut, c3598mq.f32760a);
                C2881Yl c2881Yl2 = new C2881Yl(27, c2518Df2, (Object) null);
                C3644ni c3644ni = (C3644ni) this.f35257c;
                C3214fi c3214fi2 = c3644ni.f32930b;
                C3644ni c3644ni2 = c3644ni.f32933c;
                C3590mi c3590mi = new C3590mi(c3214fi2, c3644ni2, c3602mu2, c2881Yl2);
                C4009uN c4009uN2 = c3590mi.f32707B0;
                c2518Df2.f24456x = (C2489Bk) c4009uN2.d();
                ((BinderC2597Hq) c3598mq.f32762c).H3(new BinderC3491kr((C3808qk) c3590mi.f32711G0.d(), (C2507Cl) c3590mi.f32714J0.d(), (C2489Bk) c4009uN2.d(), (C2557Fk) c3590mi.f32709E0.d(), (C2591Hk) c3590mi.f32715K0.d(), (C3325hl) c3644ni2.f32950h1.d(), (C2727Pk) c3590mi.f32718N0.d(), (C2626Jl) c3590mi.f32719O0.d(), (C3162el) c3590mi.f32720P0.d(), (C4293zk) c3590mi.f32722R0.d()));
                return c3590mi.L();
            default:
                C2518Df c2518Df3 = new C2518Df(ut, (InterfaceC2669Md) c3598mq.f32761b, EnumC4631b.REWARDED);
                C3602mu c3602mu3 = new C3602mu(c2953au, ut, c3598mq.f32760a);
                C2509Cn c2509Cn = new C2509Cn(c2518Df3, null, 0);
                C3806qi c3806qi = (C3806qi) this.f35257c;
                C3214fi c3214fi3 = c3806qi.f33795c;
                C3806qi c3806qi2 = c3806qi.f33798d;
                C3752pi c3752pi = new C3752pi(c3214fi3, c3806qi2, c3602mu3, c2509Cn);
                C4009uN c4009uN3 = c3752pi.f33436B0;
                c2518Df3.f24456x = (C2489Bk) c4009uN3.d();
                ((BinderC2597Hq) c3598mq.f32762c).H3(new BinderC3437jr((C3808qk) c3752pi.f33440G0.d(), (C2507Cl) c3752pi.f33442I0.d(), (C2489Bk) c4009uN3.d(), (C2557Fk) c3752pi.f33438E0.d(), (C2591Hk) c3752pi.f33443J0.d(), (C4293zk) c3752pi.f33450Q0.d(), (C3325hl) c3806qi2.f33817j1.d(), (C2626Jl) c3752pi.f33447N0.d(), (C2727Pk) c3752pi.f33446M0.d(), (C2575Gl) c3752pi.f33453S0.d(), (C3162el) c3752pi.f33448O0.d()));
                return c3752pi.L();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3760pq
    public final void b(C2953au c2953au, Ut ut, C3598mq c3598mq) {
        switch (this.f35255a) {
            case 0:
                try {
                    InterfaceC2669Md interfaceC2669Md = (InterfaceC2669Md) c3598mq.f32761b;
                    interfaceC2669Md.x2(ut.f28138Z);
                    interfaceC2669Md.j1(ut.f28134U, ut.f28179v.toString(), ((C3226fu) c2953au.f29348a.f26393u).f30901d, new V2.b(this.f35256b), new BinderC4137wq(c3598mq), (InterfaceC3693od) c3598mq.f32762c);
                    return;
                } catch (RemoteException e6) {
                    t2.C.l("Remote exception loading an app open RTB ad", e6);
                    throw new C3334hu(e6);
                }
            case 1:
                try {
                    InterfaceC2669Md interfaceC2669Md2 = (InterfaceC2669Md) c3598mq.f32761b;
                    interfaceC2669Md2.x2(ut.f28138Z);
                    interfaceC2669Md2.D3(ut.f28134U, ut.f28179v.toString(), ((C3226fu) c2953au.f29348a.f26393u).f30901d, new V2.b(this.f35256b), new BinderC2699Nq(this, c3598mq), (InterfaceC3693od) c3598mq.f32762c);
                    return;
                } catch (RemoteException e9) {
                    t2.C.l("Remote exception loading a interstitial RTB ad", e9);
                    throw new C3334hu(e9);
                }
            default:
                try {
                    InterfaceC2669Md interfaceC2669Md3 = (InterfaceC2669Md) c3598mq.f32761b;
                    interfaceC2669Md3.x2(ut.f28138Z);
                    C3226fu c3226fu = (C3226fu) c2953au.f29348a.f26393u;
                    int i = c3226fu.f30912p.f1421u;
                    IInterface iInterface = c3598mq.f32762c;
                    Context context = this.f35256b;
                    JSONObject jSONObject = ut.f28179v;
                    if (i == 3) {
                        interfaceC2669Md3.e2(ut.f28134U, jSONObject.toString(), c3226fu.f30901d, new V2.b(context), new BinderC3223fr(this, c3598mq), (InterfaceC3693od) iInterface);
                    } else {
                        interfaceC2669Md3.i1(ut.f28134U, jSONObject.toString(), c3226fu.f30901d, new V2.b(context), new BinderC3223fr(this, c3598mq), (InterfaceC3693od) iInterface);
                    }
                    return;
                } catch (RemoteException e10) {
                    t2.C.l("Remote exception loading a rewarded RTB ad", e10);
                    return;
                }
        }
    }
}
