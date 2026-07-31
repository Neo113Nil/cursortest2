package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.vt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class me implements vt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f17231a;

    @Metadata
    public interface a {
        void a(@NotNull Runnable runnable, long j4);
    }

    @Metadata
    public static final class b extends ir {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ vt.a f17232a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f17233b;

        b(vt.a aVar, Runnable runnable) {
            this.f17232a = aVar;
            this.f17233b = runnable;
        }

        @Override // com.ironsource.ir
        public void a() {
            if (this.f17232a.b()) {
                return;
            }
            this.f17233b.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public me() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final ir a(vt.a aVar, Runnable runnable) {
        return new b(aVar, runnable);
    }

    public me(@NotNull a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f17231a = handler;
    }

    @Override // com.ironsource.vt
    @NotNull
    public vt.a a(@NotNull Runnable task, long j4) {
        Intrinsics.checkNotNullParameter(task, "task");
        vt.a aVar = new vt.a();
        this.f17231a.a(a(aVar, task), kotlin.time.a.n(j4));
        return aVar;
    }

    public /* synthetic */ me(a aVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? ne.a(new Handler(Looper.getMainLooper())) : aVar);
    }
}
