package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.c92;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.yj0;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class w52 extends sf0 implements yj0.a, InterfaceC2006j0 {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC1921fa f33929e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final xj0 f33930f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final r21 f33931g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final yj0 f33932h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C1959h0 f33933i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final no1 f33934j;

    public final class a implements y52 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.y52
        @NotNull
        public final c92 a(int i4) {
            return new c92(w52.a(w52.this) ? c92.a.f24139o : !w52.this.l() ? c92.a.f24141q : !w52.this.k() ? c92.a.f24135k : c92.a.f24127c, null);
        }

        @Override // com.yandex.mobile.ads.impl.y52
        @NotNull
        public final c92 b(int i4) {
            return new c92(w52.this.f() ? c92.a.f24128d : w52.a(w52.this) ? c92.a.f24139o : !w52.this.l() ? c92.a.f24141q : (w52.this.a(i4) && w52.this.k()) ? c92.a.f24127c : c92.a.f24135k, null);
        }
    }

    public /* synthetic */ w52(Context context, InterfaceC1921fa interfaceC1921fa, C2360y7 c2360y7, C2286v2 c2286v2) {
        this(context, interfaceC1921fa, c2360y7, c2286v2, new xj0(), new C2379z3(new tf0(c2360y7)), new bk0(context, c2360y7, c2286v2, c2360y7.B()), new oo1(), new hd1(), new zj0(), new fd1());
    }

    public static final boolean a(w52 w52Var) {
        return !w52Var.f33929e.b();
    }

    protected abstract boolean a(int i4);

    @NotNull
    public final xj0 j() {
        return this.f33930f;
    }

    protected abstract boolean k();

    protected abstract boolean l();

    public final synchronized void m() {
        toString();
        ap0.d(new Object[0]);
        this.f33931g.b();
        this.f33934j.b();
    }

    @Override // com.yandex.mobile.ads.impl.sf0, com.yandex.mobile.ads.impl.AbstractC1954gj
    public final void b() {
        toString();
        ap0.d(new Object[0]);
        super.b();
        this.f33931g.a();
        this.f33934j.c();
    }

    @Override // com.yandex.mobile.ads.impl.yg1.b
    public final void a(@NotNull vg1 phoneState) {
        Intrinsics.checkNotNullParameter(phoneState, "phoneState");
        this.f33929e.b();
        Objects.toString(phoneState);
        ap0.d(new Object[0]);
        this.f33931g.a(phoneState, this.f33929e.b());
    }

    public final void b(int i4) {
        ap0.d(new Object[0]);
        int i5 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(e());
        if (a4 == null || !a4.m0()) {
            if (this.f33929e.b()) {
                this.f33931g.b();
            } else {
                this.f33931g.a();
            }
        } else if (i4 == 0) {
            this.f33931g.b();
        } else {
            this.f33931g.a();
        }
        ap0.d(getClass().toString(), Integer.valueOf(i4));
    }

    public void a(int i4, @Nullable Bundle bundle) {
        ap0.d(new Object[0]);
        if (i4 == 14) {
            this.f33930f.e();
            return;
        }
        if (i4 != 15) {
            switch (i4) {
                case 6:
                    onLeftApplication();
                    this.f33933i.g();
                    break;
                case 7:
                    onLeftApplication();
                    this.f33933i.e();
                    break;
                case 8:
                    this.f33933i.f();
                    break;
                case 9:
                    ap0.d(new Object[0]);
                    this.f33933i.a();
                    this.f33930f.a();
                    break;
            }
            return;
        }
        this.f33930f.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected w52(@NotNull Context context, @NotNull InterfaceC1921fa adVisibilityValidator, @NotNull C2360y7<String> adResponse, @NotNull C2286v2 adConfiguration, @NotNull xj0 impressionEventsObservable, @NotNull C2379z3 adIdStorageManager, @NotNull bk0 impressionReporter, @NotNull oo1 renderTrackingManagerFactory, @NotNull hd1 noticeTrackingManagerProvider, @NotNull zj0 impressionManagerCreator, @NotNull fd1 noticeTrackerForceImpressionListenerFactory) {
        super(context, adResponse);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adVisibilityValidator, "adVisibilityValidator");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(impressionEventsObservable, "impressionEventsObservable");
        Intrinsics.checkNotNullParameter(adIdStorageManager, "adIdStorageManager");
        Intrinsics.checkNotNullParameter(impressionReporter, "impressionReporter");
        Intrinsics.checkNotNullParameter(renderTrackingManagerFactory, "renderTrackingManagerFactory");
        Intrinsics.checkNotNullParameter(noticeTrackingManagerProvider, "noticeTrackingManagerProvider");
        Intrinsics.checkNotNullParameter(impressionManagerCreator, "impressionManagerCreator");
        Intrinsics.checkNotNullParameter(noticeTrackerForceImpressionListenerFactory, "noticeTrackerForceImpressionListenerFactory");
        this.f33929e = adVisibilityValidator;
        this.f33930f = impressionEventsObservable;
        this.f33933i = new C1959h0(context, adConfiguration, adResponse, this, adResponse.z());
        a aVar = new a();
        impressionManagerCreator.getClass();
        this.f33932h = zj0.a(context, this, impressionReporter, adIdStorageManager, impressionEventsObservable);
        r21 a4 = noticeTrackingManagerProvider.a(context, adConfiguration, impressionReporter, aVar, C2362y9.a(this), EnumC1848c9.f24098b);
        this.f33931g = a4;
        a4.a(impressionEventsObservable);
        noticeTrackerForceImpressionListenerFactory.getClass();
        impressionEventsObservable.a(fd1.a(a4));
        renderTrackingManagerFactory.getClass();
        this.f33934j = oo1.a(context, adResponse, adConfiguration, adIdStorageManager, adVisibilityValidator, impressionEventsObservable);
    }

    public final void a(@Nullable Map<String, String> map) {
        toString();
        ap0.d(new Object[0]);
        ArrayList a4 = C2362y9.a(d(), map);
        this.f33932h.a(a4, d().B());
        this.f33931g.a(d(), a4);
        m();
    }
}
