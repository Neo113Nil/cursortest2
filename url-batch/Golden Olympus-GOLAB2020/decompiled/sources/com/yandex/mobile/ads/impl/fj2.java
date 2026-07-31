package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n30;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fj2 implements n30.c {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f25816c = {C1873da.a(fj2.class, "cacheListener", "getCacheListener()Lcom/monetization/ads/nativeads/video/cache/VideoCacheListener;", 0)};

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final List<Integer> f25817d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final List<Integer> f25818e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final List<Integer> f25819f;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f25820a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ao1 f25821b;

    static {
        List<Integer> listOf = CollectionsKt.listOf((Object[]) new Integer[]{3, 4});
        f25817d = listOf;
        List<Integer> listOf2 = CollectionsKt.listOf((Object[]) new Integer[]{1, 5});
        f25818e = listOf2;
        f25819f = CollectionsKt.plus((Collection) listOf, (Iterable) listOf2);
    }

    public fj2(@NotNull String requestId, @NotNull td2 videoCacheListener) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(videoCacheListener, "videoCacheListener");
        this.f25820a = requestId;
        this.f25821b = bo1.a(videoCacheListener);
    }

    @Override // com.yandex.mobile.ads.impl.n30.c
    public final void a(@NotNull n30 downloadManager, @NotNull l30 download) {
        td2 td2Var;
        td2 td2Var2;
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(download, "download");
        if (Intrinsics.areEqual(download.f28400a.f30307b, this.f25820a)) {
            if (f25817d.contains(Integer.valueOf(download.f28401b)) && (td2Var2 = (td2) this.f25821b.getValue(this, f25816c[0])) != null) {
                td2Var2.a();
            }
            if (f25818e.contains(Integer.valueOf(download.f28401b)) && (td2Var = (td2) this.f25821b.getValue(this, f25816c[0])) != null) {
                td2Var.c();
            }
            if (f25819f.contains(Integer.valueOf(download.f28401b))) {
                downloadManager.a((n30.c) this);
            }
        }
    }
}
