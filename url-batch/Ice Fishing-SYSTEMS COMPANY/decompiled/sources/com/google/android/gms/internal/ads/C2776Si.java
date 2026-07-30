package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.C4927z0;
import q2.InterfaceC4877a;

/* renamed from: com.google.android.gms.internal.ads.Si, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2776Si implements InterfaceC3915sk, InterfaceC2608Ik, InterfaceC2506Ck, InterfaceC4877a, InterfaceC2472Ak, InterfaceC4294zl, InterfaceC2795Tk {

    /* renamed from: A, reason: collision with root package name */
    public final C3386iu f27591A;

    /* renamed from: B, reason: collision with root package name */
    public final C3348i7 f27592B;

    /* renamed from: C, reason: collision with root package name */
    public final C4175xa f27593C;

    /* renamed from: D, reason: collision with root package name */
    public final WeakReference f27594D;

    /* renamed from: E, reason: collision with root package name */
    public final WeakReference f27595E;

    /* renamed from: F, reason: collision with root package name */
    public final C4017ue f27596F;

    /* renamed from: G, reason: collision with root package name */
    public final C2744Qk f27597G;

    /* renamed from: H, reason: collision with root package name */
    public final C3270gk f27598H;

    /* renamed from: I, reason: collision with root package name */
    public final Set f27599I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final AtomicBoolean f27600K = new AtomicBoolean();

    /* renamed from: L, reason: collision with root package name */
    public W2.b f27601L = null;

    /* renamed from: n, reason: collision with root package name */
    public final Context f27602n;

    /* renamed from: u, reason: collision with root package name */
    public final SD f27603u;

    /* renamed from: v, reason: collision with root package name */
    public final Executor f27604v;

    /* renamed from: w, reason: collision with root package name */
    public final ScheduledExecutorService f27605w;

    /* renamed from: x, reason: collision with root package name */
    public final C2953au f27606x;

    /* renamed from: y, reason: collision with root package name */
    public final Ut f27607y;

    /* renamed from: z, reason: collision with root package name */
    public final C4304zv f27608z;

    public C2776Si(Context context, SD sd, Executor executor, ScheduledExecutorService scheduledExecutorService, C2953au c2953au, Ut ut, C4304zv c4304zv, C3386iu c3386iu, View view, InterfaceC3858rh interfaceC3858rh, C3348i7 c3348i7, C4175xa c4175xa, C4017ue c4017ue, C2744Qk c2744Qk, C3270gk c3270gk, Set set) {
        this.f27602n = context;
        this.f27603u = sd;
        this.f27604v = executor;
        this.f27605w = scheduledExecutorService;
        this.f27606x = c2953au;
        this.f27607y = ut;
        this.f27608z = c4304zv;
        this.f27591A = c3386iu;
        this.f27592B = c3348i7;
        this.f27594D = new WeakReference(view);
        this.f27595E = new WeakReference(interfaceC3858rh);
        this.f27593C = c4175xa;
        this.f27596F = c4017ue;
        this.f27597G = c2744Qk;
        this.f27598H = c3270gk;
        this.f27599I = set;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void E() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void F() {
    }

    public final List a() {
        boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Nc)).booleanValue();
        Ut ut = this.f27607y;
        if (booleanValue) {
            t2.G g9 = p2.j.f39798C.f39803c;
            Context context = this.f27602n;
            if (t2.G.d(context)) {
                Object systemService = context.getSystemService("display");
                Integer valueOf = systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null;
                if (valueOf != null) {
                    int min = Math.min(valueOf.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ut.f28145d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(min)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return ut.f28145d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2472Ak
    public final void b(C4927z0 c4927z0) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31636c2)).booleanValue()) {
            int i = c4927z0.f40122n;
            ArrayList arrayList = new ArrayList();
            Ut ut = this.f27607y;
            for (String str : ut.f28165o) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2);
                sb.append("2.");
                sb.append(i);
                arrayList.add(C4304zv.c(str, "@gw_mpe@", sb.toString()));
            }
            this.f27591A.a(this.f27608z.a(this.f27606x, ut, arrayList), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void c() {
        Ut ut = this.f27607y;
        this.f27591A.a(this.f27608z.a(this.f27606x, ut, ut.f28151g), null);
    }

    public final void d(int i, int i4) {
        View view;
        if (i <= 0 || !((view = (View) this.f27594D.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            o();
        } else {
            this.f27605w.schedule(new RunnableC2742Qi(this, i, i4, 0), i4, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2608Ik
    public final synchronized void e() {
        C4017ue c4017ue;
        long j9;
        try {
            if (this.J) {
                ArrayList arrayList = new ArrayList(a());
                Ut ut = this.f27607y;
                arrayList.addAll(ut.f28149f);
                this.f27591A.a(this.f27608z.b(this.f27606x, ut, true, null, null, arrayList, null, null), null);
            } else {
                C3386iu c3386iu = this.f27591A;
                C4304zv c4304zv = this.f27608z;
                C2953au c2953au = this.f27606x;
                Ut ut2 = this.f27607y;
                c3386iu.a(c4304zv.a(c2953au, ut2, ut2.f28162m), null);
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31829x4)).booleanValue() && (c4017ue = this.f27596F) != null) {
                    List list = ((Ut) c4017ue.f34631v).f28162m;
                    String d2 = ((C2950ar) c4017ue.f34632w).d();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(C4304zv.c((String) it.next(), "@gw_adnetstatus@", d2));
                    }
                    C2950ar c2950ar = (C2950ar) c4017ue.f34632w;
                    synchronized (c2950ar) {
                        j9 = c2950ar.f29344h;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(C4304zv.c((String) it2.next(), "@gw_ttr@", Long.toString(j9, 10)));
                    }
                    c3386iu.a(c4304zv.a((C2953au) c4017ue.f34630u, (Ut) c4017ue.f34631v, arrayList3), null);
                }
                c3386iu.a(c4304zv.a(c2953au, ut2, ut2.f28149f), null);
            }
            this.J = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void f() {
        Ut ut = this.f27607y;
        this.f27591A.a(this.f27608z.a(this.f27606x, ut, ut.i), null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void i(BinderC2772Se binderC2772Se, String str, String str2) {
        C3008bu c3008bu;
        Ut ut = this.f27607y;
        List list = ut.f28153h;
        C4304zv c4304zv = this.f27608z;
        c4304zv.getClass();
        ArrayList arrayList = new ArrayList();
        c4304zv.f35640h.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String str3 = binderC2772Se.f27578n;
            String num = Integer.toString(binderC2772Se.f27579u);
            boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31792t4)).booleanValue();
            ZA za = QA.f27125n;
            if (booleanValue) {
                C3116du c3116du = c4304zv.f35639g;
                if (c3116du != null && (c3008bu = c3116du.f30254a) != null) {
                    za = new C3080dB(c3008bu);
                }
            } else {
                C3008bu c3008bu2 = c4304zv.f35638f;
                if (c3008bu2 != null) {
                    za = new C3080dB(c3008bu2);
                }
            }
            String str4 = (String) za.b(J2.f25707s).a();
            String str5 = (String) za.b(J2.f25706r).a();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC3035cL.g(C4304zv.c(C4304zv.c(C4304zv.c(C4304zv.c(C4304zv.c(C4304zv.c((String) it.next(), "@gw_rwd_userid@", Uri.encode(str4)), "@gw_rwd_custom_data@", Uri.encode(str5)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(str3)), "@gw_rwd_amt@", num), "@gw_sdkver@", c4304zv.f35634b), c4304zv.f35637e, ut.f28136W, ut.f28182w0));
            }
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.d("Unable to determine award type and amount.", e6);
        }
        this.f27591A.a(arrayList, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.AbstractCollection, java.util.List] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2795Tk
    public final void j() {
        Ut ut = this.f27607y;
        if (ut.f28147e == 4) {
            this.f27591A.a(this.f27608z.a(this.f27606x, ut, ut.f28108A0), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // com.google.android.gms.internal.ads.InterfaceC4294zl
    public final void l() {
        Ut ut = this.f27607y;
        this.f27591A.a(this.f27608z.a(this.f27606x, ut, ut.f28178u0), null);
    }

    public final void o() {
        int i;
        W2.b bVar;
        Ut ut = this.f27607y;
        List list = ut.f28145d;
        if (list == null || list.isEmpty()) {
            return;
        }
        C3151ea c3151ea = AbstractC3368ia.jf;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && this.f27601L == null) {
            C2994bg c2994bg = p2.j.f39798C.f39808h.f29014c;
            Set set = this.f27599I;
            String str = ((C3226fu) this.f27606x.f29348a.f26393u).f30904g;
            C2939ag c2939ag = c2994bg.f29530w;
            synchronized (c2939ag.f29247g) {
                try {
                    int i4 = c2939ag.f29252m;
                    c2939ag.f29252m = i4 + 1;
                    if (set.isEmpty()) {
                        bVar = new W2.b(i4, -1, -1, false);
                    } else {
                        TreeSet treeSet = new TreeSet(set);
                        StringBuilder sb = new StringBuilder();
                        Iterator it = treeSet.iterator();
                        if (it.hasNext()) {
                            CharSequence charSequence = (CharSequence) it.next();
                            while (true) {
                                sb.append(charSequence);
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb.append((CharSequence) ",");
                                charSequence = (CharSequence) it.next();
                            }
                        }
                        String sb2 = sb.toString();
                        HashMap hashMap = c2939ag.f29253n;
                        Integer num = (Integer) hashMap.get(sb2);
                        int i9 = 0;
                        int intValue = num == null ? 0 : num.intValue();
                        hashMap.put(sb2, Integer.valueOf(intValue + 1));
                        if (str == null) {
                            bVar = new W2.b(i4, intValue, -1, false);
                        } else {
                            StringBuilder sb3 = new StringBuilder(str.length() + 1 + String.valueOf(sb2).length());
                            sb3.append(str);
                            sb3.append(com.anythink.expressad.foundation.g.a.bU);
                            sb3.append(sb2);
                            String sb4 = sb3.toString();
                            HashMap hashMap2 = c2939ag.f29254o;
                            Integer num2 = (Integer) hashMap2.get(sb4);
                            if (num2 != null) {
                                i9 = num2.intValue();
                            }
                            hashMap2.put(sb4, Integer.valueOf(i9 + 1));
                            bVar = new W2.b(i4, intValue, i9, false);
                        }
                    }
                } finally {
                }
            }
            this.f27601L = bVar;
        }
        String i10 = ((Boolean) rVar.f40119c.a(AbstractC3368ia.f31783s4)).booleanValue() ? this.f27592B.f31319b.i(this.f27602n, (View) this.f27594D.get(), null) : null;
        if ((((Boolean) rVar.f40119c.a(AbstractC3368ia.f31605Z0)).booleanValue() && ((Wt) this.f27606x.f29349b.f24454v).f28497h) || !((Boolean) AbstractC2615Ja.f25777h.r()).booleanValue()) {
            this.f27591A.a(this.f27608z.b(this.f27606x, ut, false, i10, null, a(), this.f27598H, this.f27601L), this.f27597G);
            return;
        }
        if (((Boolean) AbstractC2615Ja.f25776g.r()).booleanValue() && ((i = ut.f28141b) == 1 || i == 2 || i == 5)) {
        }
        JD jd = (JD) C3686oN.w(JD.s(OD.f26665u), ((Long) rVar.f40119c.a(AbstractC3368ia.f31418D1)).longValue(), TimeUnit.MILLISECONDS, this.f27605w);
        jd.c(new MD(0, jd, new C2881Yl(this, i10)), this.f27603u);
    }

    @Override // q2.InterfaceC4877a
    public final void onAdClicked() {
        boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31605Z0)).booleanValue();
        C2953au c2953au = this.f27606x;
        if ((booleanValue && ((Wt) c2953au.f29349b.f24454v).f28497h) || !((Boolean) AbstractC2615Ja.f25773d.r()).booleanValue()) {
            Ut ut = this.f27607y;
            this.f27591A.b(true == p2.j.f39798C.f39808h.i(this.f27602n) ? 2 : 1, this.f27608z.a(c2953au, ut, ut.f28143c));
        } else {
            C4175xa c4175xa = this.f27593C;
            c4175xa.getClass();
            ZC u7 = C3686oN.u(JD.s((JD) C3686oN.w(JD.s(OD.f26665u), ((Long) AbstractC2615Ja.f25772c.r()).longValue(), TimeUnit.MILLISECONDS, c4175xa.f35185c)), Throwable.class, J2.f25694e, AbstractC3212fg.f30745h);
            u7.c(new MD(0, u7, new Rx(this)), this.f27603u);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void x() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2506Ck
    public final void y() {
        if (this.f27600K.compareAndSet(false, true)) {
            C3151ea c3151ea = AbstractC3368ia.f31405B4;
            q2.r rVar = q2.r.f40116e;
            int intValue = ((Integer) rVar.f40119c.a(c3151ea)).intValue();
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
            if (intValue > 0) {
                d(intValue, ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31413C4)).intValue());
            } else if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31396A4)).booleanValue()) {
                o();
            } else {
                this.f27604v.execute(new RunnableC2725Pi(this, 0));
            }
        }
    }
}
