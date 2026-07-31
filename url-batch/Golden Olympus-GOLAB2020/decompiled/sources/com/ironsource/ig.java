package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ig implements vu {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f16712c;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final zj f16714e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final zj f16715f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final zj f16716g;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ig f16710a = new ig();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Handler f16711b = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final W1.h f16713d = W1.i.b(a.f16717a);

    @Metadata
    static final class a extends kotlin.jvm.internal.s implements Function0<jr> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16717a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final jr invoke() {
            return new jr(0, null, null, 7, null);
        }
    }

    static {
        zj zjVar = new zj("isadplayer-background");
        zjVar.start();
        zjVar.a();
        f16714e = zjVar;
        zj zjVar2 = new zj("isadplayer-publisher-callbacks");
        zjVar2.start();
        zjVar2.a();
        f16715f = zjVar2;
        zj zjVar3 = new zj("isadplayer-release");
        zjVar3.start();
        zjVar3.a();
        f16716g = zjVar3;
    }

    private ig() {
    }

    private final jr b() {
        return (jr) f16713d.getValue();
    }

    private final boolean f(Runnable runnable) {
        return f16712c && b().getQueue().contains(runnable);
    }

    @Nullable
    public final Looper a() {
        return f16714e.getLooper();
    }

    @NotNull
    public final ThreadPoolExecutor c() {
        return b();
    }

    public final void d(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final void e(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f(action)) {
            b().remove(action);
        } else {
            f16716g.b(action);
        }
    }

    public static /* synthetic */ void a(ig igVar, Runnable runnable, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        igVar.b(runnable, j4);
    }

    public static /* synthetic */ void b(ig igVar, Runnable runnable, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        igVar.c(runnable, j4);
    }

    public static /* synthetic */ void c(ig igVar, Runnable runnable, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        igVar.d(runnable, j4);
    }

    public final void d(@NotNull Runnable action, long j4) {
        Intrinsics.checkNotNullParameter(action, "action");
        f16711b.postDelayed(action, j4);
    }

    @Override // com.ironsource.vu
    public void a(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final void b(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        a(this, action, 0L, 2, (Object) null);
    }

    public final void c(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        b(this, action, 0L, 2, null);
    }

    public final boolean d() {
        return f16712c;
    }

    @Override // com.ironsource.vu
    public void a(@NotNull Runnable action, long j4) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f16712c) {
            b().schedule(action, j4, TimeUnit.MILLISECONDS);
        } else {
            f16716g.a(action, j4);
        }
    }

    public final void b(@NotNull Runnable action, long j4) {
        Intrinsics.checkNotNullParameter(action, "action");
        f16714e.a(action, j4);
    }

    public final void c(@NotNull Runnable action, long j4) {
        Intrinsics.checkNotNullParameter(action, "action");
        f16715f.a(action, j4);
    }

    public final void a(boolean z4) {
        f16712c = z4;
    }
}
