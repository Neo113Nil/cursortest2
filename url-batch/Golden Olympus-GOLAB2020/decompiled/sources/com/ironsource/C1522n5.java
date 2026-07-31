package com.ironsource;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.n5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1522n5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f18272a;

    /* renamed from: b, reason: collision with root package name */
    private final com.ironsource.mediationsdk.d f18273b;

    public C1522n5(@NotNull String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        this.f18272a = serverData;
        this.f18273b = com.ironsource.mediationsdk.d.b();
    }

    public static /* synthetic */ C1522n5 a(C1522n5 c1522n5, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = c1522n5.f18272a;
        }
        return c1522n5.a(str);
    }

    private final String c() {
        return this.f18272a;
    }

    @NotNull
    public final Map<String, String> b() {
        Map<String, String> b4 = this.f18273b.b(this.f18272a);
        Intrinsics.checkNotNullExpressionValue(b4, "auctionDataUtils.getAuct…verDataParams(serverData)");
        return b4;
    }

    @NotNull
    public final String d() {
        String c4 = this.f18273b.c(this.f18272a);
        Intrinsics.checkNotNullExpressionValue(c4, "auctionDataUtils.getDyna…romServerData(serverData)");
        return c4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1522n5) && Intrinsics.areEqual(this.f18272a, ((C1522n5) obj).f18272a);
    }

    public int hashCode() {
        return this.f18272a.hashCode();
    }

    @NotNull
    public String toString() {
        return "AuctionServerData(serverData=" + this.f18272a + ')';
    }

    @NotNull
    public final C1522n5 a(@NotNull String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        return new C1522n5(serverData);
    }

    @NotNull
    public final String a() {
        String a4 = this.f18273b.a(this.f18272a);
        Intrinsics.checkNotNullExpressionValue(a4, "auctionDataUtils.getAdmFromServerData(serverData)");
        return a4;
    }
}
