package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class vn0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final iu f33697a;

    public /* synthetic */ vn0() {
        this(new iu());
    }

    @NotNull
    public final wd2 a(@NotNull hu creative, @Nullable String str) {
        Object obj;
        List emptyList;
        Intrinsics.checkNotNullParameter(creative, "creative");
        this.f33697a.getClass();
        Iterator it = iu.a(creative).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((C2276uf) obj).b(), str)) {
                break;
            }
        }
        C2276uf c2276uf = (C2276uf) obj;
        dr0 a4 = c2276uf != null ? c2276uf.a() : null;
        if (a4 != null) {
            return new wd2(a4.e(), a4.d());
        }
        String c4 = creative.c();
        List list = (List) ((LinkedHashMap) creative.a()).get("clickTracking");
        if (list == null || (emptyList = CollectionsKt.filterNotNull(list)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        return new wd2(c4, emptyList);
    }

    public vn0(@NotNull iu creativeAssetsProvider) {
        Intrinsics.checkNotNullParameter(creativeAssetsProvider, "creativeAssetsProvider");
        this.f33697a = creativeAssetsProvider;
    }
}
