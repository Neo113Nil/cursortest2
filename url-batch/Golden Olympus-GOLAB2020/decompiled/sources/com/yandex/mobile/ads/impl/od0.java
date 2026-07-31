package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.od0;
import com.yandex.mobile.ads.impl.y22;
import java.io.Serializable;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class od0<T extends od0<T>> extends w52 {

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C2286v2 f29986k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final kc0 f29987l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final rc0<T> f29988m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final C1867d4 f29989n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final dd0 f29990o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final C2105n4 f29991p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final y22 f29992q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final C1870d7 f29993r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    private cd0 f29994s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ od0(Context context, C2360y7 c2360y7, C2286v2 c2286v2, kc0 kc0Var, rc0 rc0Var, C1867d4 c1867d4) {
        this(context, c2360y7, c2286v2, kc0Var, rc0Var, c1867d4, r7, r4, r9, new C1870d7(context, c2360y7, c2286v2, r4, r5));
        dd0 dd0Var = new dd0();
        C2105n4 c2105n4 = new C2105n4();
        int i4 = y22.f34782d;
        y22 a4 = y22.a.a();
        yf0 yf0Var = new yf0();
        yf0Var.a((C2360y7<String>) c2360y7);
        yf0Var.a(c2286v2);
    }

    @Override // com.yandex.mobile.ads.impl.w52
    protected final boolean a(int i4) {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.w52
    protected final boolean k() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.w52
    public final boolean l() {
        return true;
    }

    @NotNull
    public final fs n() {
        C1867d4 c1867d4 = this.f29989n;
        Context context = e();
        C2360y7<String> adResponse = d();
        C2286v2 adConfiguration = this.f29986k;
        String adInfo = this.f29988m.getAdInfo();
        c1867d4.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        String p4 = adResponse.p();
        if (p4 == null && (p4 = adConfiguration.c()) == null) {
            p4 = "";
        }
        vy1 M3 = adResponse.M();
        if (M3.getWidth() == 0 || M3.getHeight() == 0) {
            M3 = null;
        }
        return new fs(p4, M3 != null ? new C2200r8(M3.c(context), M3.a(context)) : null, adInfo);
    }

    @NotNull
    protected abstract T o();

    @Override // com.yandex.mobile.ads.impl.InterfaceC2006j0
    public final void onLeftApplication() {
        cd0 cd0Var = this.f29994s;
        if (cd0Var != null) {
            cd0Var.onAdClicked();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2006j0
    public final void onReturnedToApplication() {
    }

    public final void p() {
        h();
        this.f29992q.a(fq0.f25897c, this);
        cd0 cd0Var = this.f29994s;
        if (cd0Var != null) {
            cd0Var.onAdDismissed();
        }
    }

    public final void q() {
        cd0 cd0Var = this.f29994s;
        if (cd0Var != null) {
            cd0Var.onAdShown();
        }
    }

    @Override // com.yandex.mobile.ads.impl.yj0.a
    public final void a(@Nullable C1795a4 c1795a4) {
        cd0 cd0Var = this.f29994s;
        if (cd0Var != null) {
            cd0Var.a(c1795a4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.w52, com.yandex.mobile.ads.impl.InterfaceC2332x2
    public void a(int i4, @Nullable Bundle bundle) {
        getClass().toString();
        ap0.d(new Object[0]);
        Map<String, String> map = null;
        map = null;
        if (i4 == 0) {
            if (bundle != null) {
                Serializable serializable = bundle.getSerializable("extra_tracking_parameters");
                if (serializable instanceof Map) {
                    map = (Map) serializable;
                }
            }
            this.f29991p.a(EnumC2082m4.f28849f);
            this.f29993r.a();
            q();
            dd0 dd0Var = this.f29990o;
            C2360y7<String> d4 = d();
            dd0Var.getClass();
            if (d4 == null || d4.v() != vr.f33728c) {
                a(map);
                return;
            }
            return;
        }
        if (i4 == 16) {
            if (bundle != null) {
                Parcelable parcelable = bundle.getParcelable("impression_data_key");
                a(parcelable instanceof C1795a4 ? (C1795a4) parcelable : null);
                return;
            } else {
                a((C1795a4) null);
                return;
            }
        }
        if (i4 == 17) {
            cd0 cd0Var = this.f29994s;
            if (cd0Var != null) {
                cd0Var.onAdClicked();
                return;
            }
            return;
        }
        if (i4 == 2) {
            this.f29987l.a(0);
            b(0);
        } else if (i4 == 3) {
            this.f29987l.a(8);
            b(8);
        } else if (i4 == 4) {
            p();
        } else if (i4 != 5) {
            super.a(i4, bundle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od0(@NotNull Context context, @NotNull C2360y7<String> adResponse, @NotNull C2286v2 adConfiguration, @NotNull kc0 fullScreenAdVisibilityValidator, @NotNull rc0<T> fullScreenController, @NotNull C1867d4 adInfoMapper, @NotNull dd0 fullScreenTrackingController, @NotNull C2105n4 adLoadingPhasesManager, @NotNull y22 strongReferenceKeepingManager, @NotNull C1870d7 adRenderingResultReporter) {
        super(context, fullScreenAdVisibilityValidator, adResponse, adConfiguration);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(fullScreenAdVisibilityValidator, "fullScreenAdVisibilityValidator");
        Intrinsics.checkNotNullParameter(fullScreenController, "fullScreenController");
        Intrinsics.checkNotNullParameter(adInfoMapper, "adInfoMapper");
        Intrinsics.checkNotNullParameter(fullScreenTrackingController, "fullScreenTrackingController");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(strongReferenceKeepingManager, "strongReferenceKeepingManager");
        Intrinsics.checkNotNullParameter(adRenderingResultReporter, "adRenderingResultReporter");
        this.f29986k = adConfiguration;
        this.f29987l = fullScreenAdVisibilityValidator;
        this.f29988m = fullScreenController;
        this.f29989n = adInfoMapper;
        this.f29990o = fullScreenTrackingController;
        this.f29991p = adLoadingPhasesManager;
        this.f29992q = strongReferenceKeepingManager;
        this.f29993r = adRenderingResultReporter;
        C2031k1.f27968b.a().a("window_type_fullscreen", new C1864d1());
    }

    public final void a(@NotNull cd0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f29994s = listener;
    }

    @NotNull
    public final Object a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        g();
        Result.Companion companion = Result.Companion;
        Result.m243constructorimpl(ResultKt.createFailure(C2358y5.a()));
        synchronized (this) {
        }
        C2105n4 c2105n4 = this.f29991p;
        EnumC2082m4 enumC2082m4 = EnumC2082m4.f28849f;
        C2001ij.a(c2105n4, enumC2082m4, "adLoadingPhaseType", enumC2082m4, null);
        y22 y22Var = this.f29992q;
        fq0 fq0Var = fq0.f25897c;
        y22Var.b(fq0Var, this);
        Object a4 = this.f29988m.a((rc0<T>) o(), activity);
        if (Result.d(a4) != null) {
            this.f29991p.a(enumC2082m4);
            if (!C2362y9.a((ao) this)) {
                this.f29992q.a(fq0Var, this);
                this.f29988m.a(e());
                super.c();
            }
        }
        return a4;
    }
}
