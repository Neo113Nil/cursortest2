package com.yandex.mobile.ads.impl;

import O1.C1165z4;
import com.yandex.div.DivDataTag;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class q20 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f30639a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final JSONObject f30640b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final JSONObject f30641c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final List<ej0> f30642d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C1165z4 f30643e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final DivDataTag f30644f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Set<h20> f30645g;

    public q20(@NotNull String target, @NotNull JSONObject card, @Nullable JSONObject jSONObject, @Nullable List<ej0> list, @NotNull C1165z4 divData, @NotNull DivDataTag divDataTag, @NotNull Set<h20> divAssets) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(divData, "divData");
        Intrinsics.checkNotNullParameter(divDataTag, "divDataTag");
        Intrinsics.checkNotNullParameter(divAssets, "divAssets");
        this.f30639a = target;
        this.f30640b = card;
        this.f30641c = jSONObject;
        this.f30642d = list;
        this.f30643e = divData;
        this.f30644f = divDataTag;
        this.f30645g = divAssets;
    }

    @NotNull
    public final Set<h20> a() {
        return this.f30645g;
    }

    @NotNull
    public final C1165z4 b() {
        return this.f30643e;
    }

    @NotNull
    public final DivDataTag c() {
        return this.f30644f;
    }

    @Nullable
    public final List<ej0> d() {
        return this.f30642d;
    }

    @NotNull
    public final String e() {
        return this.f30639a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q20)) {
            return false;
        }
        q20 q20Var = (q20) obj;
        return Intrinsics.areEqual(this.f30639a, q20Var.f30639a) && Intrinsics.areEqual(this.f30640b, q20Var.f30640b) && Intrinsics.areEqual(this.f30641c, q20Var.f30641c) && Intrinsics.areEqual(this.f30642d, q20Var.f30642d) && Intrinsics.areEqual(this.f30643e, q20Var.f30643e) && Intrinsics.areEqual(this.f30644f, q20Var.f30644f) && Intrinsics.areEqual(this.f30645g, q20Var.f30645g);
    }

    public final int hashCode() {
        int hashCode = (this.f30640b.hashCode() + (this.f30639a.hashCode() * 31)) * 31;
        JSONObject jSONObject = this.f30641c;
        int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        List<ej0> list = this.f30642d;
        return this.f30645g.hashCode() + ((this.f30644f.hashCode() + ((this.f30643e.hashCode() + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "DivKitDesign(target=" + this.f30639a + ", card=" + this.f30640b + ", templates=" + this.f30641c + ", images=" + this.f30642d + ", divData=" + this.f30643e + ", divDataTag=" + this.f30644f + ", divAssets=" + this.f30645g + ")";
    }
}
