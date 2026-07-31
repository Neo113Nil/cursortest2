package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bg2;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class an1 implements rc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bg2 f23385a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<a> f23386b;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final bg2.a f23387a;

        /* renamed from: b, reason: collision with root package name */
        private final float f23388b;

        public a(@NotNull bg2.a trackerQuartile, float f4) {
            Intrinsics.checkNotNullParameter(trackerQuartile, "trackerQuartile");
            this.f23387a = trackerQuartile;
            this.f23388b = f4;
        }

        public final float a() {
            return this.f23388b;
        }

        @NotNull
        public final bg2.a b() {
            return this.f23387a;
        }
    }

    public an1(@NotNull cg2 videoTracker) {
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        this.f23385a = videoTracker;
        this.f23386b = CollectionsKt.mutableListOf(new a(bg2.a.f23744b, 0.25f), new a(bg2.a.f23745c, 0.5f), new a(bg2.a.f23746d, 0.75f));
    }

    @Override // com.yandex.mobile.ads.impl.rc2
    public final void a(long j4, long j5) {
        if (j4 != 0) {
            Iterator<a> it = this.f23386b.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.a() * j4 <= j5) {
                    this.f23385a.a(next.b());
                    it.remove();
                }
            }
        }
    }
}
