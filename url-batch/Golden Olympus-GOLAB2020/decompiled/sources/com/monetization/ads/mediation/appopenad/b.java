package com.monetization.ads.mediation.appopenad;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;
import com.yandex.mobile.ads.impl.C2360y7;
import com.yandex.mobile.ads.impl.ap0;
import com.yandex.mobile.ads.impl.od0;
import com.yandex.mobile.ads.impl.qx0;
import com.yandex.mobile.ads.impl.rc0;
import com.yandex.mobile.ads.impl.yw0;
import com.yandex.mobile.ads.impl.zw0;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class b<T extends od0<T>> implements rc0<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zw0<MediatedAppOpenAdAdapter, MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener> f20706a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f20707b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a<T> f20708c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final qx0 f20709d;

    public b(@NotNull zw0<MediatedAppOpenAdAdapter, MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener> mediatedAdController, @NotNull c mediatedAppOpenAdLoader, @NotNull a<T> mediatedAppOpenAdAdapterListener, @NotNull qx0 mediatedAdapterReporter) {
        Intrinsics.checkNotNullParameter(mediatedAdController, "mediatedAdController");
        Intrinsics.checkNotNullParameter(mediatedAppOpenAdLoader, "mediatedAppOpenAdLoader");
        Intrinsics.checkNotNullParameter(mediatedAppOpenAdAdapterListener, "mediatedAppOpenAdAdapterListener");
        Intrinsics.checkNotNullParameter(mediatedAdapterReporter, "mediatedAdapterReporter");
        this.f20706a = mediatedAdController;
        this.f20707b = mediatedAppOpenAdLoader;
        this.f20708c = mediatedAppOpenAdAdapterListener;
        this.f20709d = mediatedAdapterReporter;
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    public final void a(@NotNull Context context, @NotNull C2360y7<String> adResponse) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f20706a.a(context, (Context) this.f20708c);
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
        yw0<MediatedAppOpenAdAdapter> a4;
        Intrinsics.checkNotNullParameter(contentController, "contentController");
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            Result.Companion companion = Result.Companion;
            MediatedAppOpenAdAdapter a5 = this.f20707b.a();
            if (a5 != null) {
                this.f20708c.a(contentController);
                a5.showAppOpenAd(activity);
            }
            m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        Throwable d4 = Result.d(m243constructorimpl);
        if (d4 != null && (a4 = this.f20706a.a()) != null) {
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            ap0.c(new Object[0]);
            this.f20709d.a(applicationContext, a4.c(), MapsKt.mapOf(TuplesKt.to("reason", MapsKt.mapOf(TuplesKt.to("exception_in_adapter", d4.toString())))), a4.a().b().getNetworkName());
        }
        return m243constructorimpl;
    }

    @Override // com.yandex.mobile.ads.impl.rc0
    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20706a.a(context);
    }
}
