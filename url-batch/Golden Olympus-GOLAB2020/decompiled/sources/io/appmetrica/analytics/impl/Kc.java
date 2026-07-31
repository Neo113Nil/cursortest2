package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes3.dex */
public final class Kc extends C2953s5 implements InterfaceC2675hb, InterfaceC2649gb {

    /* renamed from: v, reason: collision with root package name */
    public final C3120yg f37881v;

    /* renamed from: w, reason: collision with root package name */
    public final Cg f37882w;

    /* renamed from: x, reason: collision with root package name */
    public final Z6 f37883x;

    /* renamed from: y, reason: collision with root package name */
    public final C2822n3 f37884y;

    public Kc(@NonNull Context context, @NonNull C2633fm c2633fm, @NonNull C2772l5 c2772l5, @NonNull J4 j4, @NonNull C3120yg c3120yg, @NonNull Z6 z6, @NonNull AbstractC2902q5 abstractC2902q5) {
        this(context, c2772l5, c2633fm, j4, new C2690i0(), new TimePassedChecker(), new Mc(context, c2772l5, j4, abstractC2902q5, c2633fm, new Fc(z6), Ia.j().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), Ia.j().w(), Ia.j().k(), new C3142zc()), c3120yg, z6);
    }

    @Override // io.appmetrica.analytics.impl.C2953s5
    public final void B() {
        this.f37881v.a(this.f37882w);
    }

    public final boolean C() {
        boolean optBoolean;
        C3024uo c3024uo = this.f39784t;
        synchronized (c3024uo) {
            optBoolean = c3024uo.f39951a.a().optBoolean("referrer_handled", false);
        }
        return optBoolean;
    }

    @Override // io.appmetrica.analytics.impl.C2953s5, io.appmetrica.analytics.impl.InterfaceC2752kb, io.appmetrica.analytics.impl.Za
    public final synchronized void a(@NonNull J4 j4) {
        super.a(j4);
        this.f37883x.a(j4.f37797i);
    }

    @Override // io.appmetrica.analytics.impl.C2953s5, io.appmetrica.analytics.impl.Za
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MAIN;
    }

    @Override // io.appmetrica.analytics.impl.C2953s5, io.appmetrica.analytics.impl.InterfaceC2752kb, io.appmetrica.analytics.impl.Ql
    public final void a(@NonNull C2633fm c2633fm) {
        super.a(c2633fm);
        this.f37884y.a(c2633fm);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2649gb
    public final void a() {
        C3024uo c3024uo = this.f39784t;
        synchronized (c3024uo) {
            C3050vo c3050vo = c3024uo.f39951a;
            c3050vo.a(c3050vo.a().put("referrer_handled", true));
        }
    }

    public Kc(Context context, C2772l5 c2772l5, C2633fm c2633fm, J4 j4, C2690i0 c2690i0, TimePassedChecker timePassedChecker, Mc mc, C3120yg c3120yg, Z6 z6) {
        super(context, c2772l5, c2690i0, timePassedChecker, mc, j4);
        this.f37881v = c3120yg;
        C2957s9 j5 = j();
        j5.a(EnumC3063wb.EVENT_TYPE_REGULAR, new Ug(j5.b()));
        this.f37882w = mc.b(this);
        this.f37883x = z6;
        C2822n3 a4 = mc.a(this);
        this.f37884y = a4;
        a4.a(c2633fm, j4.f37801m);
    }
}
