package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.s5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2953s5 implements InterfaceC2752kb, Za, InterfaceC3069wh {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39765a;

    /* renamed from: b, reason: collision with root package name */
    public final C2772l5 f39766b;

    /* renamed from: c, reason: collision with root package name */
    public final C2756kf f39767c;

    /* renamed from: d, reason: collision with root package name */
    public final C2834nf f39768d;

    /* renamed from: e, reason: collision with root package name */
    public final C2645g7 f39769e;

    /* renamed from: f, reason: collision with root package name */
    public final Gi f39770f;

    /* renamed from: g, reason: collision with root package name */
    public final C2957s9 f39771g;

    /* renamed from: h, reason: collision with root package name */
    public final C2664h0 f39772h;

    /* renamed from: i, reason: collision with root package name */
    public final C2690i0 f39773i;

    /* renamed from: j, reason: collision with root package name */
    public final Sk f39774j;

    /* renamed from: k, reason: collision with root package name */
    public final C2575dh f39775k;

    /* renamed from: l, reason: collision with root package name */
    public final C2620f9 f39776l;

    /* renamed from: m, reason: collision with root package name */
    public final PublicLogger f39777m;

    /* renamed from: n, reason: collision with root package name */
    public final F9 f39778n;

    /* renamed from: o, reason: collision with root package name */
    public final C2824n5 f39779o;

    /* renamed from: p, reason: collision with root package name */
    public final L9 f39780p;

    /* renamed from: q, reason: collision with root package name */
    public final I3 f39781q;

    /* renamed from: r, reason: collision with root package name */
    public final TimePassedChecker f39782r;

    /* renamed from: s, reason: collision with root package name */
    public final Hf f39783s;

    /* renamed from: t, reason: collision with root package name */
    public final C3024uo f39784t;

    /* renamed from: u, reason: collision with root package name */
    public final Kk f39785u;

    public C2953s5(@NonNull Context context, @NonNull C2633fm c2633fm, @NonNull C2772l5 c2772l5, @NonNull J4 j4, @NonNull InterfaceC3017uh interfaceC3017uh, @NonNull AbstractC2902q5 abstractC2902q5) {
        this(context, c2772l5, new C2690i0(), new TimePassedChecker(), new C3083x5(context, c2772l5, j4, abstractC2902q5, c2633fm, interfaceC3017uh, Ia.j().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), Ia.j().k(), new C2746k5()), j4);
    }

    public final boolean A() {
        C2633fm c2633fm;
        Hf hf = this.f39783s;
        hf.f39188h.a(hf.f39181a);
        boolean z4 = ((Ef) hf.c()).f37448d;
        C2575dh c2575dh = this.f39775k;
        synchronized (c2575dh) {
            c2633fm = c2575dh.f37805c.f39126a;
        }
        return !(z4 && c2633fm.f38995q);
    }

    public void B() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2752kb, io.appmetrica.analytics.impl.Ql
    public final void a(@NonNull Jl jl, C2633fm c2633fm) {
    }

    @Override // io.appmetrica.analytics.impl.Za
    @NonNull
    public final C2772l5 b() {
        return this.f39766b;
    }

    @NonNull
    public CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    public final void d() {
        C2664h0 c2664h0 = this.f39772h;
        synchronized (c2664h0) {
            c2664h0.f39114a = new C2490ad();
        }
        this.f39773i.a(this.f39772h.a(), this.f39767c);
    }

    public final synchronized void e() {
        ((F5) this.f39780p).d();
    }

    @NonNull
    public final I3 f() {
        return this.f39781q;
    }

    @NonNull
    public final C2756kf g() {
        return this.f39767c;
    }

    @Override // io.appmetrica.analytics.impl.Za
    @NonNull
    public final Context getContext() {
        return this.f39765a;
    }

    @NonNull
    public final C2645g7 h() {
        return this.f39769e;
    }

    @NonNull
    public final C2620f9 i() {
        return this.f39776l;
    }

    @NonNull
    public final C2957s9 j() {
        return this.f39771g;
    }

    @NonNull
    public final F9 k() {
        return this.f39778n;
    }

    @NonNull
    public final L9 l() {
        return this.f39780p;
    }

    @NonNull
    public final C3095xh m() {
        return (C3095xh) this.f39775k.a();
    }

    public final String n() {
        return this.f39767c.i();
    }

    @NonNull
    public final PublicLogger o() {
        return this.f39777m;
    }

    @NonNull
    public final C2834nf p() {
        return this.f39768d;
    }

    @NonNull
    public final Kk q() {
        return this.f39785u;
    }

    @NonNull
    public final Sk r() {
        return this.f39774j;
    }

    @NonNull
    public final C2633fm s() {
        C2633fm c2633fm;
        C2575dh c2575dh = this.f39775k;
        synchronized (c2575dh) {
            c2633fm = c2575dh.f37805c.f39126a;
        }
        return c2633fm;
    }

    @NonNull
    public final C3024uo t() {
        return this.f39784t;
    }

    public final void u() {
        F9 f9 = this.f39778n;
        int i4 = f9.f37527k;
        f9.f37529m = i4;
        f9.f37517a.a(i4).b();
    }

    public final void v() {
        int optInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        C3024uo c3024uo = this.f39784t;
        synchronized (c3024uo) {
            optInt = c3024uo.f39951a.a().optInt("last_migration_api_level", 0);
        }
        if (optInt < libraryApiLevel) {
            this.f39779o.getClass();
            Iterator it = CollectionsKt.listOf(new C2876p5(this)).iterator();
            while (it.hasNext()) {
                ((AbstractC2850o5) it.next()).a(optInt);
            }
            this.f39784t.b(libraryApiLevel);
        }
    }

    public final boolean w() {
        C3095xh c3095xh = (C3095xh) this.f39775k.a();
        return c3095xh.f40187n && c3095xh.isIdentifiersValid() && this.f39782r.didTimePassSeconds(this.f39778n.f37528l, c3095xh.f40192s, "need to check permissions");
    }

    public final boolean x() {
        F9 f9 = this.f39778n;
        return f9.f37529m < f9.f37527k && ((C3095xh) this.f39775k.a()).f40188o && ((C3095xh) this.f39775k.a()).isIdentifiersValid();
    }

    public final void y() {
        C2575dh c2575dh = this.f39775k;
        synchronized (c2575dh) {
            c2575dh.f37803a = null;
        }
    }

    public final boolean z() {
        C3095xh c3095xh = (C3095xh) this.f39775k.a();
        return c3095xh.f40187n && this.f39782r.didTimePassSeconds(this.f39778n.f37528l, c3095xh.f40193t, "should force send permissions");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2752kb
    public final void a(@NonNull C2773l6 c2773l6) {
        String a4 = AbstractC2574dg.a("Event received on service", EnumC3063wb.a(c2773l6.f39379d), c2773l6.getName(), c2773l6.getValue());
        if (a4 != null) {
            this.f39777m.info(a4, new Object[0]);
        }
        String str = this.f39766b.f39375b;
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return;
        }
        this.f39770f.a(c2773l6, new Fi());
    }

    public final void b(C2773l6 c2773l6) {
        this.f39772h.a(c2773l6.f39381f);
        C2638g0 a4 = this.f39772h.a();
        C2690i0 c2690i0 = this.f39773i;
        C2756kf c2756kf = this.f39767c;
        synchronized (c2690i0) {
            if (a4.f39023b > c2756kf.d().f39023b) {
                c2756kf.a(a4).b();
                this.f39777m.info("Save new app environment for %s. Value: %s", this.f39766b, a4.f39022a);
            }
        }
    }

    public C2953s5(Context context, C2772l5 c2772l5, C2690i0 c2690i0, TimePassedChecker timePassedChecker, C3083x5 c3083x5, J4 j4) {
        this.f39765a = context.getApplicationContext();
        this.f39766b = c2772l5;
        this.f39773i = c2690i0;
        this.f39782r = timePassedChecker;
        C3024uo f4 = c3083x5.f();
        this.f39784t = f4;
        this.f39783s = Ia.j().s();
        C2575dh a4 = c3083x5.a(this);
        this.f39775k = a4;
        PublicLogger a5 = c3083x5.d().a();
        this.f39777m = a5;
        C2756kf a6 = c3083x5.e().a();
        this.f39767c = a6;
        this.f39768d = Ia.j().x();
        C2664h0 a7 = c2690i0.a(c2772l5, a5, a6);
        this.f39772h = a7;
        this.f39776l = c3083x5.a();
        C2645g7 b4 = c3083x5.b(this);
        this.f39769e = b4;
        Ii d4 = c3083x5.d(this);
        this.f39779o = C3083x5.b();
        v();
        Sk a8 = C3083x5.a(this, f4, new C2927r5(this));
        this.f39774j = a8;
        a5.info("Read app environment for component %s. Value: %s", c2772l5.toString(), a7.a().f39022a);
        Kk c4 = c3083x5.c();
        this.f39785u = c4;
        this.f39778n = c3083x5.a(a6, f4, a8, b4, a7, c4, d4);
        C2957s9 c5 = C3083x5.c(this);
        this.f39771g = c5;
        this.f39770f = C3083x5.a(this, c5);
        this.f39781q = c3083x5.a(a6);
        this.f39780p = c3083x5.a(d4, b4, a4, j4, c2772l5, a6);
        b4.e();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2752kb, io.appmetrica.analytics.impl.Za
    public synchronized void a(@NonNull J4 j4) {
        try {
            this.f39775k.a(j4);
            if (Boolean.TRUE.equals(j4.f37796h)) {
                this.f39777m.setEnabled(true);
            } else {
                if (Boolean.FALSE.equals(j4.f37796h)) {
                    this.f39777m.setEnabled(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2752kb, io.appmetrica.analytics.impl.Ql
    public synchronized void a(@NonNull C2633fm c2633fm) {
        this.f39775k.a(c2633fm);
        ((F5) this.f39780p).e();
    }

    public final void a(String str) {
        this.f39767c.j(str).b();
    }
}
