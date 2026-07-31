package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class zj extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private Handler f20549a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(@NotNull String name) {
        super(name);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public final void a() {
        this.f20549a = new Handler(getLooper());
    }

    public final void b(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Handler handler = this.f20549a;
        if (handler != null) {
            handler.removeCallbacks(task);
        }
    }

    public static /* synthetic */ void a(zj zjVar, Runnable runnable, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        zjVar.a(runnable, j4);
    }

    public final void a(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        a(this, task, 0L, 2, null);
    }

    public final void a(@NotNull Runnable task, long j4) {
        Intrinsics.checkNotNullParameter(task, "task");
        Handler handler = this.f20549a;
        if (handler != null) {
            handler.postDelayed(task, j4);
        }
    }
}
