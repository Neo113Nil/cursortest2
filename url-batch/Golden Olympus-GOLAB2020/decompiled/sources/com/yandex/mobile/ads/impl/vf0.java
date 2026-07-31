package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.hx1;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class vf0 extends AbstractC2025jj<String> {

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final ue1 f33594v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final qn1 f33595w;

    public /* synthetic */ vf0(Context context, C2286v2 c2286v2, C2105n4 c2105n4) {
        this(context, c2286v2, c2105n4, fu.a((j50) c2286v2.p().c()), new ue1(), qn1.f30853b.a());
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj
    @NotNull
    protected final AbstractC1978hj<String> a(@NotNull String url, @NotNull String query) {
        JSONObject jsonObject;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(query, "query");
        Context k4 = k();
        C2286v2 e4 = e();
        hx1.f26979a.getClass();
        C1818b3 c1818b3 = new C1818b3(k4, e4, url, query, this, this, hx1.a.a(k4), new wf0(), new C2108n7());
        C1918f7 a4 = e().a();
        String str = null;
        String g4 = a4 != null ? a4.g() : null;
        this.f33594v.getClass();
        if (g4 != null && (jsonObject = dq0.a(g4)) != null) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            Intrinsics.checkNotNullParameter(com.ironsource.ms.f18193n, "name");
            if (jsonObject.has(com.ironsource.ms.f18193n)) {
                str = jsonObject.optString(com.ironsource.ms.f18193n);
            }
        }
        if (str != null) {
            this.f33595w.a(c1818b3, str);
        }
        return c1818b3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected vf0(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2105n4 adLoadingPhasesManager, @NotNull InterfaceC3316J coroutineScope, @NotNull ue1 openBiddingReadyResponseProvider, @NotNull qn1 responseStorage) {
        super(context, adLoadingPhasesManager, adConfiguration, coroutineScope);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(openBiddingReadyResponseProvider, "openBiddingReadyResponseProvider");
        Intrinsics.checkNotNullParameter(responseStorage, "responseStorage");
        this.f33594v = openBiddingReadyResponseProvider;
        this.f33595w = responseStorage;
    }
}
