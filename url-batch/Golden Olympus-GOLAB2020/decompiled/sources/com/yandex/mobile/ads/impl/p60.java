package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.eg1;
import com.yandex.mobile.ads.impl.zh1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class p60 {

    /* renamed from: c, reason: collision with root package name */
    private static final long f30349c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zh1.b f30350a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final eg1 f30351b;

    private final class a implements gg1 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.gg1
        public final void a() {
            p60.this.f30350a.b(c60.a());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p60(zh1.b bVar) {
        this(bVar, eg1.a.a(false));
        int i4 = eg1.f25287a;
    }

    public final void b() {
        this.f30351b.stop();
    }

    public final void a() {
        this.f30351b.a(f30349c, new a());
    }

    public p60(@NotNull zh1.b eventListener, @NotNull eg1 pausableTimer) {
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(pausableTimer, "pausableTimer");
        this.f30350a = eventListener;
        this.f30351b = pausableTimer;
    }
}
