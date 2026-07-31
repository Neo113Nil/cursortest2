package com.ironsource;

import android.os.Handler;
import com.ironsource.environment.thread.IronSourceThreadManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class yi {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f20434a;

    @Metadata
    public static final class a extends ir {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f20435a;

        a(Runnable runnable) {
            this.f20435a = runnable;
        }

        @Override // com.ironsource.ir
        public void a() {
            this.f20435a.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yi() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.ironsource.ir] */
    private final void c(Runnable runnable) {
        a aVar = runnable instanceof ir ? (ir) runnable : new a(runnable);
        if (Thread.currentThread().getId() == this.f20434a.getLooper().getThread().getId()) {
            aVar.run();
        } else {
            a(this, aVar, 0L, 2, null);
        }
    }

    @NotNull
    public final Handler a() {
        return this.f20434a;
    }

    public final void b(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        c(runnable);
    }

    public yi(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f20434a = handler;
    }

    public final void a(@NotNull ir task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f20434a.removeCallbacks(task);
    }

    public /* synthetic */ yi(Handler handler, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new Handler(IronSourceThreadManager.INSTANCE.getSharedManagersThread().getLooper()) : handler);
    }

    public final void a(@NotNull ir task, long j4) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f20434a.postDelayed(task, j4);
    }

    public static /* synthetic */ void a(yi yiVar, ir irVar, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        yiVar.a(irVar, j4);
    }

    public final void a(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        c(callback);
    }
}
