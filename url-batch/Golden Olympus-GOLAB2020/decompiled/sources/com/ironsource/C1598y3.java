package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.y3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1598y3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f20369a;

    /* JADX WARN: Multi-variable type inference failed */
    public C1598y3() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C1598y3 a(C1598y3 c1598y3, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = c1598y3.f20369a;
        }
        return c1598y3.a(str);
    }

    @NotNull
    public final String b() {
        return this.f20369a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1598y3) && Intrinsics.areEqual(this.f20369a, ((C1598y3) obj).f20369a);
    }

    public int hashCode() {
        return this.f20369a.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplicationAuctionSettings(auctionData=" + this.f20369a + ')';
    }

    public C1598y3(@NotNull String auctionData) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        this.f20369a = auctionData;
    }

    @NotNull
    public final C1598y3 a(@NotNull String auctionData) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        return new C1598y3(auctionData);
    }

    public /* synthetic */ C1598y3(String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str);
    }

    @NotNull
    public final String a() {
        return this.f20369a;
    }
}
