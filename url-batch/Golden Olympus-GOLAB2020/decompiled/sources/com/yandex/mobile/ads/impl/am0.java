package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.gl0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class am0 implements xp1<zh2>, gl0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f23363a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final gl0 f23364b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final h40 f23365c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f23366d;

    public interface a {
        void a(@NotNull qs qsVar);

        void a(@NotNull String str);
    }

    public /* synthetic */ am0(Context context, vu1 vu1Var, ub2 ub2Var, cm0 cm0Var) {
        this(context, vu1Var, ub2Var, cm0Var, new gl0(vu1Var, ub2Var), new h40());
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(@NotNull hb2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f23363a.a(error.a());
    }

    @Override // com.yandex.mobile.ads.impl.gl0.a
    public final void a(@NotNull ArrayList adBreaks) {
        Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
        this.f23365c.getClass();
        ArrayList a4 = h40.a(adBreaks);
        if (!a4.isEmpty()) {
            this.f23363a.a(new qs(a4));
        } else {
            this.f23363a.a("Received response with no ad breaks");
        }
    }

    public am0(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull ub2 videoAdLoader, @NotNull cm0 instreamAdLoadListener, @NotNull gl0 adBreaksLoadingManager, @NotNull h40 duplicatedInstreamAdBreaksFilter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(videoAdLoader, "videoAdLoader");
        Intrinsics.checkNotNullParameter(instreamAdLoadListener, "instreamAdLoadListener");
        Intrinsics.checkNotNullParameter(adBreaksLoadingManager, "adBreaksLoadingManager");
        Intrinsics.checkNotNullParameter(duplicatedInstreamAdBreaksFilter, "duplicatedInstreamAdBreaksFilter");
        this.f23363a = instreamAdLoadListener;
        this.f23364b = adBreaksLoadingManager;
        this.f23365c = duplicatedInstreamAdBreaksFilter;
        this.f23366d = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(zh2 zh2Var) {
        zh2 vmap = zh2Var;
        Intrinsics.checkNotNullParameter(vmap, "vmap");
        List<C2308w1> a4 = vmap.a();
        ArrayList arrayList = new ArrayList();
        for (C2308w1 c2308w1 : a4) {
            if (c2308w1.d().contains("linear")) {
                arrayList.add(c2308w1);
            }
        }
        if (!arrayList.isEmpty()) {
            gl0 gl0Var = this.f23364b;
            Context context = this.f23366d;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            gl0Var.a(context, arrayList, this);
            return;
        }
        this.f23363a.a("Received response with no ad breaks");
    }
}
