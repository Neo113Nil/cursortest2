package com.ironsource;

import com.ironsource.av;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface yu {

    @Metadata
    public interface a {
        void a();
    }

    @Metadata
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private long f20480a;

        /* renamed from: b, reason: collision with root package name */
        private long f20481b;

        public final long a() {
            return this.f20481b;
        }

        public final long b() {
            return this.f20480a;
        }

        public final void a(long j4) {
            this.f20481b = j4;
        }

        public final void b(long j4) {
            this.f20480a = j4;
        }
    }

    @Metadata
    public interface c {
        @NotNull
        yu a(@NotNull b bVar);
    }

    @Metadata
    public static final class d implements c {
        @Override // com.ironsource.yu.c
        @NotNull
        public yu a(@NotNull b timerConfig) {
            Intrinsics.checkNotNullParameter(timerConfig, "timerConfig");
            return new e(new av(timerConfig.b()));
        }
    }

    @Metadata
    private static final class e implements yu {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final av f20482a;

        @Metadata
        public static final class a implements av.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f20483a;

            a(a aVar) {
                this.f20483a = aVar;
            }

            @Override // com.ironsource.av.a
            public void a() {
                this.f20483a.a();
            }
        }

        public e(@NotNull av timer) {
            Intrinsics.checkNotNullParameter(timer, "timer");
            this.f20482a = timer;
        }

        @Override // com.ironsource.yu
        public void a(@NotNull a callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f20482a.a((av.a) new a(callback));
        }

        @Override // com.ironsource.yu
        public void cancel() {
            this.f20482a.e();
        }
    }

    void a(@NotNull a aVar);

    void cancel();
}
