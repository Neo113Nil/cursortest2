package com.monetization.ads.mediation.appopenad;

import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import com.yandex.mobile.ads.impl.C1866d3;
import com.yandex.mobile.ads.impl.od0;
import com.yandex.mobile.ads.impl.wj0;
import com.yandex.mobile.ads.impl.yc0;
import com.yandex.mobile.ads.impl.zw0;
import java.lang.ref.WeakReference;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class a<T extends od0<T>> implements MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zw0<MediatedAppOpenAdAdapter, MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener> f20702a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final WeakReference<yc0<T>> f20703b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private WeakReference<od0<T>> f20704c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final wj0 f20705d;

    public a(@NotNull yc0<T> loadController, @NotNull zw0<MediatedAppOpenAdAdapter, MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener> mediatedAdController) {
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        Intrinsics.checkNotNullParameter(mediatedAdController, "mediatedAdController");
        this.f20702a = mediatedAdController;
        this.f20703b = new WeakReference<>(loadController);
        this.f20704c = new WeakReference<>(null);
        this.f20705d = new wj0(mediatedAdController);
    }

    public final void a(@NotNull od0<T> controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f20704c = new WeakReference<>(controller);
    }

    @Override // com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener
    public final void onAdImpression() {
        od0<T> od0Var;
        if (this.f20702a.b() || (od0Var = this.f20704c.get()) == null) {
            return;
        }
        this.f20702a.b(od0Var.e(), MapsKt.emptyMap());
        od0Var.a(this.f20705d.a());
    }

    @Override // com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener
    public final void onAppOpenAdClicked() {
        od0<T> od0Var = this.f20704c.get();
        if (od0Var != null) {
            this.f20702a.a(od0Var.e(), MapsKt.emptyMap());
        }
    }

    @Override // com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener
    public final void onAppOpenAdDismissed() {
        od0<T> od0Var = this.f20704c.get();
        if (od0Var != null) {
            od0Var.p();
        }
    }

    @Override // com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener
    public final void onAppOpenAdFailedToLoad(@NotNull MediatedAdRequestError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        yc0<T> yc0Var = this.f20703b.get();
        if (yc0Var != null) {
            this.f20702a.b(yc0Var.k(), new C1866d3(error.getCode(), error.getDescription(), error.getDescription(), null), this);
        }
    }

    @Override // com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener
    public final void onAppOpenAdLeftApplication() {
        od0<T> od0Var = this.f20704c.get();
        if (od0Var != null) {
            od0Var.onLeftApplication();
        }
    }

    @Override // com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener
    public final void onAppOpenAdLoaded() {
        yc0<T> yc0Var = this.f20703b.get();
        if (yc0Var != null) {
            this.f20702a.c(yc0Var.k(), MapsKt.emptyMap());
            yc0Var.t();
        }
    }

    @Override // com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener
    public final void onAppOpenAdShown() {
        od0<T> od0Var;
        od0<T> od0Var2 = this.f20704c.get();
        if (od0Var2 != null) {
            od0Var2.q();
            this.f20702a.c(od0Var2.e());
        }
        if (!this.f20702a.b() || (od0Var = this.f20704c.get()) == null) {
            return;
        }
        this.f20702a.b(od0Var.e(), MapsKt.emptyMap());
        od0Var.a(this.f20705d.a());
    }
}
