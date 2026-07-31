package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class e50 {

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private static e50 f25094c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Object f25095d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f25096e = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d50 f25097a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private hi0 f25098b;

    public static final class a {
        @NotNull
        public static e50 a(@NotNull Context context) {
            e50 e50Var;
            Intrinsics.checkNotNullParameter(context, "context");
            e50 e50Var2 = e50.f25094c;
            if (e50Var2 != null) {
                return e50Var2;
            }
            synchronized (e50.f25095d) {
                e50Var = e50.f25094c;
                if (e50Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    e50Var = new e50(applicationContext, new d50(), C2206re.a(applicationContext));
                    e50.f25094c = e50Var;
                }
            }
            return e50Var;
        }
    }

    public e50(@NotNull Context appContext, @NotNull d50 environmentConfiguration, @NotNull hi0 appMetricaProvider) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(environmentConfiguration, "environmentConfiguration");
        Intrinsics.checkNotNullParameter(appMetricaProvider, "appMetricaProvider");
        this.f25097a = environmentConfiguration;
        CollectionsKt.emptyList();
        MapsKt.emptyMap();
        this.f25098b = appMetricaProvider;
    }

    @NotNull
    public final d50 c() {
        return this.f25097a;
    }

    @NotNull
    public final hi0 d() {
        return this.f25098b;
    }
}
