package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xz {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2105n4 f34721a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final na1 f34722b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final hb1 f34723c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f34724d;

    private static final class a implements td2 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C2105n4 f34725a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final le2 f34726b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final sv f34727c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final AtomicInteger f34728d;

        public a(@NotNull C2105n4 adLoadingPhasesManager, int i4, @NotNull ta1 videoLoadListener, @NotNull sv debugEventsReporter) {
            Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
            Intrinsics.checkNotNullParameter(videoLoadListener, "videoLoadListener");
            Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
            this.f34725a = adLoadingPhasesManager;
            this.f34726b = videoLoadListener;
            this.f34727c = debugEventsReporter;
            this.f34728d = new AtomicInteger(i4);
        }

        @Override // com.yandex.mobile.ads.impl.td2
        public final void a() {
            if (this.f34728d.decrementAndGet() == 0) {
                this.f34725a.a(EnumC2082m4.f28859p);
                this.f34726b.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.td2
        public final void b() {
            if (this.f34728d.getAndSet(0) > 0) {
                this.f34725a.a(EnumC2082m4.f28859p);
                this.f34727c.a(rv.f31374f);
                this.f34726b.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.td2
        public final void c() {
        }
    }

    public /* synthetic */ xz(Context context, C2105n4 c2105n4) {
        this(context, c2105n4, new na1(context), new hb1());
    }

    public final void a() {
        synchronized (this.f34724d) {
            this.f34722b.a();
            Unit unit = Unit.f41027a;
        }
    }

    public xz(@NotNull Context context, @NotNull C2105n4 adLoadingPhasesManager, @NotNull na1 nativeVideoCacheManager, @NotNull hb1 nativeVideoUrlsProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(nativeVideoCacheManager, "nativeVideoCacheManager");
        Intrinsics.checkNotNullParameter(nativeVideoUrlsProvider, "nativeVideoUrlsProvider");
        this.f34721a = adLoadingPhasesManager;
        this.f34722b = nativeVideoCacheManager;
        this.f34723c = nativeVideoUrlsProvider;
        this.f34724d = new Object();
    }

    public final void a(@NotNull h41 nativeAdBlock, @NotNull ta1 videoLoadListener, @NotNull sv debugEventsReporter) {
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        Intrinsics.checkNotNullParameter(videoLoadListener, "videoLoadListener");
        Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
        synchronized (this.f34724d) {
            try {
                SortedSet<String> b4 = this.f34723c.b(nativeAdBlock.c());
                if (b4.isEmpty()) {
                    videoLoadListener.a();
                } else {
                    a videoCacheListener = new a(this.f34721a, b4.size(), videoLoadListener, debugEventsReporter);
                    C2105n4 c2105n4 = this.f34721a;
                    EnumC2082m4 adLoadingPhaseType = EnumC2082m4.f28859p;
                    c2105n4.getClass();
                    Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
                    c2105n4.a(adLoadingPhaseType, null);
                    for (String url : b4) {
                        na1 na1Var = this.f34722b;
                        na1Var.getClass();
                        Intrinsics.checkNotNullParameter(url, "url");
                        Intrinsics.checkNotNullParameter(videoCacheListener, "videoCacheListener");
                        na1Var.a(url, videoCacheListener, String.valueOf(ci0.a()));
                    }
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
