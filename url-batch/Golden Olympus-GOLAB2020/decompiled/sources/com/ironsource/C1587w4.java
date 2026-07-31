package com.ironsource;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.w4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1587w4 implements InterfaceC1593x4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final wi f20153a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.ironsource.mediationsdk.d f20154b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final C1443c5 f20155c;

    public C1587w4(@NotNull wi instanceInfo, @NotNull com.ironsource.mediationsdk.d auctionDataUtils, @Nullable C1443c5 c1443c5) {
        Intrinsics.checkNotNullParameter(instanceInfo, "instanceInfo");
        Intrinsics.checkNotNullParameter(auctionDataUtils, "auctionDataUtils");
        this.f20153a = instanceInfo;
        this.f20154b = auctionDataUtils;
        this.f20155c = c1443c5;
    }

    @Override // com.ironsource.InterfaceC1593x4
    public void a(@NotNull String methodName) {
        List<String> emptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C1443c5 c1443c5 = this.f20155c;
        if (c1443c5 == null || (emptyList = c1443c5.b()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        a(emptyList, methodName);
    }

    @Override // com.ironsource.InterfaceC1593x4
    public void b(@NotNull String methodName) {
        List<String> emptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C1443c5 c1443c5 = this.f20155c;
        if (c1443c5 == null || (emptyList = c1443c5.c()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        a(emptyList, methodName);
    }

    @Override // com.ironsource.InterfaceC1593x4
    public void c(@NotNull String methodName) {
        List<String> emptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C1443c5 c1443c5 = this.f20155c;
        if (c1443c5 == null || (emptyList = c1443c5.a()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        a(emptyList, methodName);
    }

    private final void a(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f20154b.a(str, this.f20153a.e(), com.ironsource.mediationsdk.d.b().a(it.next(), this.f20153a.e(), this.f20153a.f(), this.f20153a.d(), "", "", "", ""));
        }
    }
}
