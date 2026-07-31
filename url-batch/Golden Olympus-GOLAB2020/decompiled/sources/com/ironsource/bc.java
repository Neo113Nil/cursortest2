package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class bc extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private Handler f15593a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(@NotNull String name) {
        super(name);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public final void a() {
        this.f15593a = new Handler(getLooper());
    }

    public final void a(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Handler handler = this.f15593a;
        if (handler != null) {
            handler.post(task);
        }
    }
}
