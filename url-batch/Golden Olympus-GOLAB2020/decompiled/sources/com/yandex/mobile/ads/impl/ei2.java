package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.ironsource.b9;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ei2 {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f25314g = "https://yandex.ru/ads";

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2061l7 f25315a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final gi2 f25316b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final vp1 f25317c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final up f25318d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final z40 f25319e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final zw1 f25320f;

    public ei2(@NotNull C2061l7 adRequestProvider, @NotNull gi2 requestReporter, @NotNull vp1 requestHelper, @NotNull up cmpRequestConfigurator, @NotNull z40 encryptedQueryConfigurator, @NotNull zw1 sensitiveModeChecker) {
        Intrinsics.checkNotNullParameter(adRequestProvider, "adRequestProvider");
        Intrinsics.checkNotNullParameter(requestReporter, "requestReporter");
        Intrinsics.checkNotNullParameter(requestHelper, "requestHelper");
        Intrinsics.checkNotNullParameter(cmpRequestConfigurator, "cmpRequestConfigurator");
        Intrinsics.checkNotNullParameter(encryptedQueryConfigurator, "encryptedQueryConfigurator");
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        this.f25315a = adRequestProvider;
        this.f25316b = requestReporter;
        this.f25317c = requestHelper;
        this.f25318d = cmpRequestConfigurator;
        this.f25319e = encryptedQueryConfigurator;
        this.f25320f = sensitiveModeChecker;
    }

    @NotNull
    public final ci2 a(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull di2 requestConfiguration, @NotNull Object requestTag, @NotNull fi2 requestListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(requestTag, "requestTag");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        String a4 = requestConfiguration.a();
        String b4 = requestConfiguration.b();
        C2061l7 c2061l7 = this.f25315a;
        Map<String, String> parameters = requestConfiguration.getParameters();
        c2061l7.getClass();
        HashMap a5 = C2061l7.a(parameters);
        d50 j4 = adConfiguration.j();
        String g4 = j4.g();
        String e4 = j4.e();
        String a6 = j4.a();
        if (a6 == null || a6.length() == 0) {
            a6 = f25314g;
        }
        Uri.Builder builder = Uri.parse(a6).buildUpon().appendPath("v2").appendPath("vmap").appendPath(a4).appendQueryParameter("video-category-id", b4);
        this.f25320f.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (!zw1.a(context)) {
            vp1 vp1Var = this.f25317c;
            Intrinsics.checkNotNull(builder);
            vp1Var.getClass();
            Intrinsics.checkNotNullParameter(builder, "builder");
            Intrinsics.checkNotNullParameter(CommonUrlParts.UUID, b9.h.f15463W);
            Intrinsics.checkNotNullParameter(builder, "<this>");
            Intrinsics.checkNotNullParameter(CommonUrlParts.UUID, b9.h.f15463W);
            if (g4 != null && g4.length() != 0) {
                Intrinsics.checkNotNull(builder.appendQueryParameter(CommonUrlParts.UUID, g4));
            }
            this.f25317c.getClass();
            Intrinsics.checkNotNullParameter(builder, "builder");
            Intrinsics.checkNotNullParameter("mauid", b9.h.f15463W);
            Intrinsics.checkNotNullParameter(builder, "<this>");
            Intrinsics.checkNotNullParameter("mauid", b9.h.f15463W);
            if (e4 != null && e4.length() != 0) {
                Intrinsics.checkNotNull(builder.appendQueryParameter("mauid", e4));
            }
        }
        up upVar = this.f25318d;
        Intrinsics.checkNotNull(builder);
        upVar.a(context, builder);
        if (a5 != null) {
            for (Map.Entry entry : a5.entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        new f50(context, adConfiguration).a(context, builder);
        for (bn1 bn1Var : j4.f()) {
            builder.appendQueryParameter(bn1Var.getKey(), bn1Var.getValue());
        }
        z40 z40Var = this.f25319e;
        String uri = builder.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        ci2 ci2Var = new ci2(context, adConfiguration, z40Var.a(context, uri), new oi2(requestListener), requestConfiguration, this.f25316b, new bi2(), kc1.a());
        ci2Var.b(requestTag);
        return ci2Var;
    }
}
