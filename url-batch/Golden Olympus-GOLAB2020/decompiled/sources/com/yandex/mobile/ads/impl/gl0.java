package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gl0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final dl0 f26206a;

    public interface a {
        void a(@NotNull ArrayList arrayList);
    }

    public gl0(@NotNull vu1 sdkEnvironmentModule, @NotNull ub2 videoAdLoader) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(videoAdLoader, "videoAdLoader");
        this.f26206a = new dl0(sdkEnvironmentModule, videoAdLoader);
    }

    public final void a(@NotNull Context context, @NotNull ArrayList adBreaks, @NotNull a instreamAdBreaksLoadListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
        Intrinsics.checkNotNullParameter(instreamAdBreaksLoadListener, "instreamAdBreaksLoadListener");
        b bVar = new b(instreamAdBreaksLoadListener, new AtomicInteger(adBreaks.size()));
        int size = adBreaks.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = adBreaks.get(i4);
            i4++;
            this.f26206a.a(context, (C2308w1) obj, bVar);
        }
    }

    private static final class b implements xp1<ss> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final a f26207a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final AtomicInteger f26208b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ArrayList f26209c;

        public b(@NotNull a instreamAdBreaksLoadListener, @NotNull AtomicInteger instreamAdCounter) {
            Intrinsics.checkNotNullParameter(instreamAdBreaksLoadListener, "instreamAdBreaksLoadListener");
            Intrinsics.checkNotNullParameter(instreamAdCounter, "instreamAdCounter");
            this.f26207a = instreamAdBreaksLoadListener;
            this.f26208b = instreamAdCounter;
            this.f26209c = new ArrayList();
        }

        @Override // com.yandex.mobile.ads.impl.xp1
        public final void a(@NotNull hb2 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            if (this.f26208b.decrementAndGet() == 0) {
                this.f26207a.a(this.f26209c);
            }
        }

        @Override // com.yandex.mobile.ads.impl.xp1
        public final void a(ss ssVar) {
            ss coreInstreamAdBreak = ssVar;
            Intrinsics.checkNotNullParameter(coreInstreamAdBreak, "coreInstreamAdBreak");
            this.f26209c.add(coreInstreamAdBreak);
            if (this.f26208b.decrementAndGet() == 0) {
                this.f26207a.a(this.f26209c);
            }
        }
    }
}
