package B2;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.A3;
import com.google.android.gms.internal.ads.C2549Fc;
import com.google.android.gms.internal.ads.C3002bo;
import com.google.android.gms.internal.ads.C3695of;
import com.google.android.gms.internal.ads.C4017ue;
import com.google.android.gms.internal.ads.C4018uf;
import com.google.android.gms.internal.ads.C4287ze;
import g1.C4524d;
import java.util.ArrayDeque;
import java.util.UUID;
import k2.C4636g;
import k2.EnumC4631b;
import l.C4677e;
import l.ViewOnKeyListenerC4678f;
import l2.C4687b;
import m2.AbstractC4777a;
import v2.AbstractC5124b;

/* loaded from: classes.dex */
public final /* synthetic */ class J implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f176n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f177u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f178v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f179w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f180x;

    public /* synthetic */ J(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f176n = i;
        this.f177u = obj;
        this.f178v = obj2;
        this.f179w = obj3;
        this.f180x = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S0.p h9;
        switch (this.f176n) {
            case 0:
                K k6 = (K) this.f177u;
                C3002bo c3002bo = (C3002bo) this.f178v;
                k6.d(c3002bo, (ArrayDeque) this.f179w, "to");
                k6.d(c3002bo, (ArrayDeque) this.f180x, "of");
                return;
            case 1:
                new C4017ue((Context) this.f177u, (EnumC4631b) this.f178v, ((C4636g) this.f179w).f38704a, 0).p((E2.b) this.f180x);
                return;
            case 2:
                F2.d dVar = (F2.d) this.f180x;
                C4687b c4687b = (C4687b) this.f179w;
                Context context = (Context) this.f177u;
                try {
                    new C3695of(context, (String) this.f178v).e(c4687b.f38704a, dVar);
                    return;
                } catch (IllegalStateException e6) {
                    C4287ze.a(context).e("RewardedAd.loadAdManager", e6);
                    return;
                }
            case 3:
                F2.d dVar2 = (F2.d) this.f180x;
                C4636g c4636g = (C4636g) this.f179w;
                Context context2 = (Context) this.f177u;
                try {
                    new C3695of(context2, (String) this.f178v).e(c4636g.f38704a, dVar2);
                    return;
                } catch (IllegalStateException e9) {
                    C4287ze.a(context2).e("RewardedAd.load", e9);
                    return;
                }
            case 4:
                G2.b bVar = (G2.b) this.f180x;
                C4636g c4636g2 = (C4636g) this.f179w;
                Context context3 = (Context) this.f177u;
                try {
                    new C4018uf(context3, (String) this.f178v).c(c4636g2.f38704a, bVar);
                    return;
                } catch (IllegalStateException e10) {
                    C4287ze.a(context3).e("RewardedInterstitialAd.load", e10);
                    return;
                }
            case 5:
                U0.k kVar = (U0.k) this.f179w;
                UUID uuid = (UUID) this.f177u;
                String uuid2 = uuid.toString();
                J0.s d2 = J0.s.d();
                String str = T0.s.f3081c;
                StringBuilder sb = new StringBuilder("Updating progress for ");
                sb.append(uuid);
                sb.append(" (");
                J0.h hVar = (J0.h) this.f178v;
                sb.append(hVar);
                sb.append(")");
                d2.a(str, sb.toString());
                T0.s sVar = (T0.s) this.f180x;
                WorkDatabase workDatabase = sVar.f3082a;
                WorkDatabase workDatabase2 = sVar.f3082a;
                workDatabase.c();
                try {
                    h9 = workDatabase2.t().h(uuid2);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (h9 == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (h9.f2921b == 2) {
                    S0.m mVar = new S0.m(uuid2, hVar);
                    S0.n s3 = workDatabase2.s();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s3.f2914n;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((S0.b) s3.f2915u).q(mVar);
                        workDatabase_Impl.o();
                        workDatabase_Impl.k();
                    } catch (Throwable th) {
                        workDatabase_Impl.k();
                        throw th;
                    }
                } else {
                    J0.s.d().g(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
                }
                kVar.j(null);
                workDatabase2.o();
                return;
            case 6:
                C4677e c4677e = (C4677e) this.f177u;
                if (c4677e != null) {
                    C4524d c4524d = (C4524d) this.f180x;
                    ((ViewOnKeyListenerC4678f) c4524d.f37858u).f38924S = true;
                    c4677e.f38905b.c(false);
                    ((ViewOnKeyListenerC4678f) c4524d.f37858u).f38924S = false;
                }
                l.n nVar = (l.n) this.f178v;
                if (nVar.isEnabled() && nVar.hasSubMenu()) {
                    ((l.l) this.f179w).q(nVar, null, 4);
                    return;
                }
                return;
            case 7:
                AbstractC4777a abstractC4777a = (AbstractC4777a) this.f180x;
                C4636g c4636g3 = (C4636g) this.f179w;
                Context context4 = (Context) this.f177u;
                try {
                    new A3(context4, (String) this.f178v, c4636g3.f38704a, abstractC4777a).b();
                    return;
                } catch (IllegalStateException e11) {
                    C4287ze.a(context4).e("AppOpenAd.load", e11);
                    return;
                }
            default:
                AbstractC5124b abstractC5124b = (AbstractC5124b) this.f180x;
                C4636g c4636g4 = (C4636g) this.f179w;
                Context context5 = (Context) this.f177u;
                try {
                    new C2549Fc(context5, (String) this.f178v).e(c4636g4.f38704a, abstractC5124b);
                    return;
                } catch (IllegalStateException e12) {
                    C4287ze.a(context5).e("InterstitialAd.load", e12);
                    return;
                }
        }
    }

    public /* synthetic */ J(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z8) {
        this.f176n = i;
        this.f180x = obj;
        this.f177u = obj2;
        this.f178v = obj3;
        this.f179w = obj4;
    }
}
