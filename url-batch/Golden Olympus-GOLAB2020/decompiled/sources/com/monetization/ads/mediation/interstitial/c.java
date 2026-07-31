package com.monetization.ads.mediation.interstitial;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import com.yandex.mobile.ads.impl.C2105n4;
import com.yandex.mobile.ads.impl.C2286v2;
import com.yandex.mobile.ads.impl.C2360y7;
import com.yandex.mobile.ads.impl.ag1;
import com.yandex.mobile.ads.impl.ap0;
import com.yandex.mobile.ads.impl.hx0;
import com.yandex.mobile.ads.impl.od0;
import com.yandex.mobile.ads.impl.qx0;
import com.yandex.mobile.ads.impl.rc0;
import com.yandex.mobile.ads.impl.sy0;
import com.yandex.mobile.ads.impl.vx0;
import com.yandex.mobile.ads.impl.yc0;
import com.yandex.mobile.ads.impl.yw0;
import com.yandex.mobile.ads.impl.zw0;
import com.yandex.mobile.ads.impl.zx0;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class c<T extends od0<T>> implements rc0<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final yc0<T> f20778a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zw0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> f20779b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f20780c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final a<T> f20781d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final qx0 f20782e;

    public c(@NotNull yc0<T> loadController, @NotNull C2360y7<String> adResponse, @NotNull sy0 mediationData) {
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(mediationData, "mediationData");
        this.f20778a = loadController;
        C2286v2 e4 = loadController.e();
        vx0 vx0Var = new vx0(e4);
        qx0 qx0Var = new qx0(e4, adResponse);
        this.f20782e = qx0Var;
        zx0 zx0Var = new zx0(new hx0(mediationData.c(), vx0Var, qx0Var));
        C2105n4 h4 = loadController.h();
        ag1 ag1Var = new ag1(loadController, mediationData, h4);
        b bVar = new b();
        this.f20780c = bVar;
        zw0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> zw0Var = new zw0<>(e4, h4, bVar, qx0Var, zx0Var, ag1Var);
        this.f20779b = zw0Var;
        this.f20781d = new a<>(loadController, zw0Var);
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    public final void a(@NotNull Context context, @NotNull C2360y7<String> adResponse) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f20779b.a(context, (Context) this.f20781d);
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    @Nullable
    public final String getAdInfo() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    @NotNull
    public final Object a(@NotNull T contentController, @NotNull Activity activity) {
        Object m243constructorimpl;
        yw0<MediatedInterstitialAdapter> a4;
        Intrinsics.checkNotNullParameter(contentController, "contentController");
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            Result.Companion companion = Result.Companion;
            MediatedInterstitialAdapter a5 = this.f20780c.a();
            if (a5 != null) {
                this.f20781d.a(contentController);
                this.f20778a.i().c();
                a5.showInterstitial(activity);
            }
            m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        Throwable d4 = Result.d(m243constructorimpl);
        if (d4 != null && (a4 = this.f20779b.a()) != null) {
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            ap0.c(new Object[0]);
            this.f20782e.a(applicationContext, a4.c(), MapsKt.mapOf(TuplesKt.to("reason", MapsKt.mapOf(TuplesKt.to("exception_in_adapter", d4.toString())))), a4.a().b().getNetworkName());
        }
        return m243constructorimpl;
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20778a.i().d();
        this.f20779b.a(context);
    }
}
