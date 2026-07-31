package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.vz0;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class s60 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final g10 f31602a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final cy1 f31603b;

    public /* synthetic */ s60() {
        this(new g10(), new cy1());
    }

    @NotNull
    public final by1 a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31602a.getClass();
        File cacheDir = g10.a(context, "mobileads-video-cache");
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(context);
        wq0 cacheEvictor = new wq0(vz0.a.a(context, 41943040L, (a4 == null || a4.C() == 0) ? 52428800L : a4.C()));
        a60 databaseProvider = new a60(context);
        this.f31603b.getClass();
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        Intrinsics.checkNotNullParameter(cacheEvictor, "cacheEvictor");
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        return new by1(cacheDir, cacheEvictor, databaseProvider);
    }

    public s60(@NotNull g10 diskCacheProvider, @NotNull cy1 simpleCacheFactory) {
        Intrinsics.checkNotNullParameter(diskCacheProvider, "diskCacheProvider");
        Intrinsics.checkNotNullParameter(simpleCacheFactory, "simpleCacheFactory");
        this.f31602a = diskCacheProvider;
        this.f31603b = simpleCacheFactory;
    }
}
