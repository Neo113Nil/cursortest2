package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.ironsource.b9;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class y20 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f34776a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mp1 f34777b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final cq0 f34778c;

    public /* synthetic */ y20(C2286v2 c2286v2, C2360y7 c2360y7) {
        this(c2286v2, c2360y7, c2286v2.p().c(), new cq0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r4 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@NotNull Uri uri, @Nullable JSONObject jSONObject) {
        Map hashMap;
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter(b9.h.f15485j0);
        if (queryParameter != null) {
            if (queryParameter.length() == 0) {
                queryParameter = null;
            }
            if (queryParameter != null) {
                if (jSONObject != null) {
                    this.f34778c.getClass();
                    hashMap = MapsKt.toMutableMap(cq0.a(jSONObject));
                }
                hashMap = new HashMap();
                this.f34777b.a(new ip1(queryParameter, (Map<String, Object>) hashMap, this.f34776a.a()));
            }
        }
    }

    public y20(@NotNull C2286v2 adConfiguration, @NotNull C2360y7<?> adResponse, @NotNull mp1 reporter, @NotNull cq0 jsonConvertor) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(jsonConvertor, "jsonConvertor");
        this.f34776a = adResponse;
        this.f34777b = reporter;
        this.f34778c = jsonConvertor;
    }
}
