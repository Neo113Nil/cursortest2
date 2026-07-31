package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.j5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1492j5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16820a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final JSONObject f16821b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final C1513m5 f16822c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16823d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f16824e;

    public C1492j5(@NotNull String auctionId, @Nullable JSONObject jSONObject, @Nullable C1513m5 c1513m5, int i4, @NotNull String auctionFallback) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        this.f16820a = auctionId;
        this.f16821b = jSONObject;
        this.f16822c = c1513m5;
        this.f16823d = i4;
        this.f16824e = auctionFallback;
    }

    public static /* synthetic */ C1492j5 a(C1492j5 c1492j5, String str, JSONObject jSONObject, C1513m5 c1513m5, int i4, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c1492j5.f16820a;
        }
        if ((i5 & 2) != 0) {
            jSONObject = c1492j5.f16821b;
        }
        if ((i5 & 4) != 0) {
            c1513m5 = c1492j5.f16822c;
        }
        if ((i5 & 8) != 0) {
            i4 = c1492j5.f16823d;
        }
        if ((i5 & 16) != 0) {
            str2 = c1492j5.f16824e;
        }
        String str3 = str2;
        C1513m5 c1513m52 = c1513m5;
        return c1492j5.a(str, jSONObject, c1513m52, i4, str3);
    }

    @Nullable
    public final JSONObject b() {
        return this.f16821b;
    }

    @Nullable
    public final C1513m5 c() {
        return this.f16822c;
    }

    public final int d() {
        return this.f16823d;
    }

    @NotNull
    public final String e() {
        return this.f16824e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1492j5)) {
            return false;
        }
        C1492j5 c1492j5 = (C1492j5) obj;
        return Intrinsics.areEqual(this.f16820a, c1492j5.f16820a) && Intrinsics.areEqual(this.f16821b, c1492j5.f16821b) && Intrinsics.areEqual(this.f16822c, c1492j5.f16822c) && this.f16823d == c1492j5.f16823d && Intrinsics.areEqual(this.f16824e, c1492j5.f16824e);
    }

    @NotNull
    public final String f() {
        return this.f16824e;
    }

    @NotNull
    public final String g() {
        return this.f16820a;
    }

    @Nullable
    public final JSONObject h() {
        return this.f16821b;
    }

    public int hashCode() {
        int hashCode = this.f16820a.hashCode() * 31;
        JSONObject jSONObject = this.f16821b;
        int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C1513m5 c1513m5 = this.f16822c;
        return ((((hashCode2 + (c1513m5 != null ? c1513m5.hashCode() : 0)) * 31) + Integer.hashCode(this.f16823d)) * 31) + this.f16824e.hashCode();
    }

    public final int i() {
        return this.f16823d;
    }

    @Nullable
    public final C1513m5 j() {
        return this.f16822c;
    }

    @NotNull
    public String toString() {
        return "AuctionResponseData(auctionId=" + this.f16820a + ", auctionResponseGenericParam=" + this.f16821b + ", genericNotifications=" + this.f16822c + ", auctionTrial=" + this.f16823d + ", auctionFallback=" + this.f16824e + ')';
    }

    @NotNull
    public final C1492j5 a(@NotNull String auctionId, @Nullable JSONObject jSONObject, @Nullable C1513m5 c1513m5, int i4, @NotNull String auctionFallback) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        return new C1492j5(auctionId, jSONObject, c1513m5, i4, auctionFallback);
    }

    @NotNull
    public final String a() {
        return this.f16820a;
    }
}
