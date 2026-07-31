package com.ironsource;

import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.d4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1449d4 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15815a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final HashSet<String> f15816b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f15817c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f15818d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15819e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15820f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f15821g;

    public C1449d4(@NotNull JSONObject applicationCrashReporterSettings) {
        Intrinsics.checkNotNullParameter(applicationCrashReporterSettings, "applicationCrashReporterSettings");
        this.f15815a = applicationCrashReporterSettings.optBoolean("enabled", false);
        List<String> b4 = nk.b(applicationCrashReporterSettings.optJSONArray(C1463f4.f16207b));
        this.f15816b = b4 != null ? CollectionsKt.toHashSet(b4) : null;
        String optString = applicationCrashReporterSettings.optString(C1463f4.f16208c);
        Intrinsics.checkNotNullExpressionValue(optString, "applicationCrashReporter…(CRASHREPORTER_URL_FIELD)");
        this.f15817c = optString;
        String optString2 = applicationCrashReporterSettings.optString(C1463f4.f16209d);
        Intrinsics.checkNotNullExpressionValue(optString2, "applicationCrashReporter…SHREPORTER_KEYWORD_FIELD)");
        this.f15818d = optString2;
        this.f15819e = applicationCrashReporterSettings.optBoolean(C1463f4.f16210e, false);
        this.f15820f = applicationCrashReporterSettings.optInt(C1463f4.f16211f, 5000);
        this.f15821g = applicationCrashReporterSettings.optBoolean(C1463f4.f16212g, false);
    }

    public final int a() {
        return this.f15820f;
    }

    @Nullable
    public final HashSet<String> b() {
        return this.f15816b;
    }

    @NotNull
    public final String c() {
        return this.f15818d;
    }

    @NotNull
    public final String d() {
        return this.f15817c;
    }

    public final boolean e() {
        return this.f15819e;
    }

    public final boolean f() {
        return this.f15815a;
    }

    public final boolean g() {
        return this.f15821g;
    }
}
