package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yq0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<C2276uf<?>> f35292a;

    private yq0(List list) {
        this.f35292a = list;
    }

    @NotNull
    public final List<C2276uf<?>> a() {
        return this.f35292a;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private List<? extends C2276uf<?>> f35293a = CollectionsKt.emptyList();

        public final void a(@NotNull List<? extends C2276uf<?>> assets) {
            Intrinsics.checkNotNullParameter(assets, "assets");
            this.f35293a = assets;
        }

        public final void a(@NotNull dr0 link) {
            Intrinsics.checkNotNullParameter(link, "link");
        }

        @NotNull
        public final yq0 a() {
            return new yq0(this.f35293a, 0);
        }
    }

    public /* synthetic */ yq0(List list, int i4) {
        this(list);
    }
}
