package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ky0 implements rc0<ur1> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final yc0<ur1> f28352a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zw0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> f28353b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final my0 f28354c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final cs1 f28355d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final qx0 f28356e;

    public ky0(@NotNull yc0<ur1> loadController, @NotNull C2360y7<String> adResponse, @NotNull sy0 mediationData) {
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(mediationData, "mediationData");
        this.f28352a = loadController;
        C2286v2 e4 = loadController.e();
        vx0 vx0Var = new vx0(e4);
        qx0 qx0Var = new qx0(e4, adResponse);
        this.f28356e = qx0Var;
        ly0 ly0Var = new ly0(new hx0(mediationData.c(), vx0Var, qx0Var));
        C2105n4 h4 = loadController.h();
        ag1 ag1Var = new ag1(loadController, mediationData, h4);
        my0 my0Var = new my0();
        this.f28354c = my0Var;
        zw0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> zw0Var = new zw0<>(e4, h4, my0Var, qx0Var, ly0Var, ag1Var);
        this.f28353b = zw0Var;
        this.f28355d = new cs1(loadController, zw0Var);
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28352a.i().d();
        this.f28353b.a(context);
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    @Nullable
    public final String getAdInfo() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    public final void a(@NotNull Context context, @NotNull C2360y7<String> adResponse) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f28353b.a(context, (Context) this.f28355d);
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    public final Object a(ur1 ur1Var, Activity activity) {
        Object m243constructorimpl;
        yw0<MediatedRewardedAdapter> a4;
        ur1 contentController = ur1Var;
        Intrinsics.checkNotNullParameter(contentController, "contentController");
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            Result.Companion companion = Result.Companion;
            MediatedRewardedAdapter a5 = this.f28354c.a();
            if (a5 != null) {
                this.f28355d.a(contentController);
                this.f28352a.i().c();
                a5.showRewardedAd(activity);
            }
            m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        Throwable d4 = Result.d(m243constructorimpl);
        if (d4 != null && (a4 = this.f28353b.a()) != null) {
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            ap0.c(new Object[0]);
            this.f28356e.a(applicationContext, a4.c(), MapsKt.mapOf(TuplesKt.to("reason", MapsKt.mapOf(TuplesKt.to("exception_in_adapter", d4.toString())))), a4.a().b().getNetworkName());
        }
        return m243constructorimpl;
    }
}
