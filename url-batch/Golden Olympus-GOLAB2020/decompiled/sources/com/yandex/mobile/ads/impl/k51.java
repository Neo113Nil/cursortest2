package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.AbstractC2372yj;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class k51 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f28056a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final yp1 f28057b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC2372yj.a<C2360y7<n61>> f28058c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final qn1 f28059d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ue1 f28060e;

    public /* synthetic */ k51(Context context, yp1 yp1Var, AbstractC2372yj.a aVar) {
        this(context, yp1Var, aVar, qn1.f30853b.a(), new ue1());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j51 a(@NotNull bq1<n61> requestPolicy, @NotNull C2286v2 adConfiguration, @NotNull C1918f7 adRequestData, @NotNull String url, @NotNull String query) {
        String str;
        JSONObject jsonObject;
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(query, "query");
        j51 j51Var = new j51(this.f28056a, requestPolicy, adConfiguration, url, query, this.f28057b, this.f28058c, new d61(requestPolicy), new m61());
        String g4 = adRequestData.g();
        this.f28060e.getClass();
        if (g4 != null && (jsonObject = dq0.a(g4)) != null) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            Intrinsics.checkNotNullParameter(com.ironsource.ms.f18193n, "name");
            if (jsonObject.has(com.ironsource.ms.f18193n)) {
                str = jsonObject.optString(com.ironsource.ms.f18193n);
                String k4 = adRequestData.k();
                if (str == null) {
                    str = k4;
                }
                if (str != null) {
                    this.f28059d.a(j51Var, str);
                }
                return j51Var;
            }
        }
        str = null;
        String k42 = adRequestData.k();
        if (str == null) {
        }
        if (str != null) {
        }
        return j51Var;
    }

    public k51(@NotNull Context context, @NotNull yp1 requestListener, @NotNull AbstractC2372yj.a<C2360y7<n61>> responseListener, @NotNull qn1 responseStorage, @NotNull ue1 openBiddingReadyResponseProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        Intrinsics.checkNotNullParameter(responseListener, "responseListener");
        Intrinsics.checkNotNullParameter(responseStorage, "responseStorage");
        Intrinsics.checkNotNullParameter(openBiddingReadyResponseProvider, "openBiddingReadyResponseProvider");
        this.f28056a = context;
        this.f28057b = requestListener;
        this.f28058c = responseListener;
        this.f28059d = responseStorage;
        this.f28060e = openBiddingReadyResponseProvider;
    }
}
