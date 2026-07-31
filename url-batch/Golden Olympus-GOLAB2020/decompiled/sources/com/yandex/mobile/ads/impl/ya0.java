package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ya0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2105n4 f34953a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final na1 f34954b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final hb1 f34955c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f34956d;

    private static final class a implements td2 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C2105n4 f34957a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final le2 f34958b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final b f34959c;

        public a(@NotNull C2105n4 adLoadingPhasesManager, @NotNull ta1 videoLoadListener, @NotNull na1 nativeVideoCacheManager, @NotNull Iterator urlToRequests, @NotNull sv debugEventsReporter) {
            Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
            Intrinsics.checkNotNullParameter(videoLoadListener, "videoLoadListener");
            Intrinsics.checkNotNullParameter(nativeVideoCacheManager, "nativeVideoCacheManager");
            Intrinsics.checkNotNullParameter(urlToRequests, "urlToRequests");
            Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
            this.f34957a = adLoadingPhasesManager;
            this.f34958b = videoLoadListener;
            this.f34959c = new b(adLoadingPhasesManager, videoLoadListener, nativeVideoCacheManager, urlToRequests, debugEventsReporter);
        }

        @Override // com.yandex.mobile.ads.impl.td2
        public final void a() {
            this.f34957a.a(EnumC2082m4.f28859p);
            this.f34958b.a();
            this.f34959c.a();
        }

        @Override // com.yandex.mobile.ads.impl.td2
        public final void b() {
            this.f34957a.a(EnumC2082m4.f28859p);
            this.f34958b.a();
            this.f34959c.b();
        }

        @Override // com.yandex.mobile.ads.impl.td2
        public final void c() {
        }
    }

    private static final class b implements td2 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C2105n4 f34960a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final le2 f34961b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final na1 f34962c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final Iterator<Pair<String, String>> f34963d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final sv f34964e;

        public b(@NotNull C2105n4 adLoadingPhasesManager, @NotNull le2 videoLoadListener, @NotNull na1 nativeVideoCacheManager, @NotNull Iterator<Pair<String, String>> urlToRequests, @NotNull sv debugEventsReporter) {
            Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
            Intrinsics.checkNotNullParameter(videoLoadListener, "videoLoadListener");
            Intrinsics.checkNotNullParameter(nativeVideoCacheManager, "nativeVideoCacheManager");
            Intrinsics.checkNotNullParameter(urlToRequests, "urlToRequests");
            Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
            this.f34960a = adLoadingPhasesManager;
            this.f34961b = videoLoadListener;
            this.f34962c = nativeVideoCacheManager;
            this.f34963d = urlToRequests;
            this.f34964e = debugEventsReporter;
        }

        @Override // com.yandex.mobile.ads.impl.td2
        public final void a() {
            if (this.f34963d.hasNext()) {
                Pair<String, String> next = this.f34963d.next();
                String component1 = next.component1();
                String component2 = next.component2();
                this.f34962c.a(component1, new b(this.f34960a, this.f34961b, this.f34962c, this.f34963d, this.f34964e), component2);
            }
        }

        @Override // com.yandex.mobile.ads.impl.td2
        public final void b() {
            this.f34964e.a(rv.f31374f);
        }

        @Override // com.yandex.mobile.ads.impl.td2
        public final void c() {
            a();
        }
    }

    public /* synthetic */ ya0(Context context, C2105n4 c2105n4) {
        this(context, c2105n4, new na1(context), new hb1());
    }

    public final void a() {
        synchronized (this.f34956d) {
            this.f34954b.a();
            Unit unit = Unit.f41027a;
        }
    }

    public ya0(@NotNull Context context, @NotNull C2105n4 adLoadingPhasesManager, @NotNull na1 nativeVideoCacheManager, @NotNull hb1 nativeVideoUrlsProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(nativeVideoCacheManager, "nativeVideoCacheManager");
        Intrinsics.checkNotNullParameter(nativeVideoUrlsProvider, "nativeVideoUrlsProvider");
        this.f34953a = adLoadingPhasesManager;
        this.f34954b = nativeVideoCacheManager;
        this.f34955c = nativeVideoUrlsProvider;
        this.f34956d = new Object();
    }

    public final void a(@NotNull h41 nativeAdBlock, @NotNull ta1 videoLoadListener, @NotNull sv debugEventsReporter) {
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        Intrinsics.checkNotNullParameter(videoLoadListener, "videoLoadListener");
        Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
        synchronized (this.f34956d) {
            try {
                List<Pair<String, String>> a4 = this.f34955c.a(nativeAdBlock.c());
                if (a4.isEmpty()) {
                    videoLoadListener.a();
                } else {
                    a aVar = new a(this.f34953a, videoLoadListener, this.f34954b, CollectionsKt.drop(a4, 1).iterator(), debugEventsReporter);
                    C2105n4 c2105n4 = this.f34953a;
                    EnumC2082m4 adLoadingPhaseType = EnumC2082m4.f28859p;
                    c2105n4.getClass();
                    Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
                    c2105n4.a(adLoadingPhaseType, null);
                    Pair pair = (Pair) CollectionsKt.first((List) a4);
                    this.f34954b.a((String) pair.component1(), aVar, (String) pair.component2());
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(@NotNull String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        synchronized (this.f34956d) {
            this.f34954b.a(requestId);
            Unit unit = Unit.f41027a;
        }
    }
}
