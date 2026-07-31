package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.z3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1604z3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hm f20500a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20501b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1449d4 f20502c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1498k4 f20503d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C1592x3 f20504e;

    public C1604z3(@NotNull JSONObject applicationConfigurations) {
        Intrinsics.checkNotNullParameter(applicationConfigurations, "applicationConfigurations");
        JSONObject optJSONObject = applicationConfigurations.optJSONObject(C1435b4.f15250a);
        this.f20500a = new hm(optJSONObject == null ? new JSONObject() : optJSONObject);
        this.f20501b = applicationConfigurations.optBoolean(C1435b4.f15256g, false);
        JSONObject optJSONObject2 = applicationConfigurations.optJSONObject(C1435b4.f15257h);
        this.f20502c = new C1449d4(optJSONObject2 == null ? new JSONObject() : optJSONObject2);
        JSONObject optJSONObject3 = applicationConfigurations.optJSONObject("settings");
        this.f20503d = new C1498k4(optJSONObject3 == null ? new JSONObject() : optJSONObject3);
        JSONObject optJSONObject4 = applicationConfigurations.optJSONObject(C1435b4.f15255f);
        this.f20504e = new C1592x3(optJSONObject4 == null ? new JSONObject() : optJSONObject4);
    }

    @NotNull
    public final C1592x3 a() {
        return this.f20504e;
    }

    @NotNull
    public final C1449d4 b() {
        return this.f20502c;
    }

    @NotNull
    public final C1498k4 c() {
        return this.f20503d;
    }

    public final boolean d() {
        return this.f20501b;
    }

    @NotNull
    public final hm e() {
        return this.f20500a;
    }
}
