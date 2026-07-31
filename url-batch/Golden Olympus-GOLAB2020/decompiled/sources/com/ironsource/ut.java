package com.ironsource;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ut implements gp {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f19960a;

    /* renamed from: b, reason: collision with root package name */
    private final long f19961b;

    /* renamed from: c, reason: collision with root package name */
    private long f19962c;

    /* renamed from: d, reason: collision with root package name */
    private long f19963d;

    /* renamed from: e, reason: collision with root package name */
    private long f19964e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final b f19965f;

    @Metadata
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f19966a;

        /* renamed from: b, reason: collision with root package name */
        private final long f19967b;

        public a(long j4, long j5) {
            this.f19966a = j4;
            this.f19967b = j5;
        }

        public final long a() {
            return this.f19966a;
        }

        public final long b() {
            return this.f19967b;
        }

        public final long c() {
            return this.f19966a;
        }

        public final long d() {
            return this.f19967b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19966a == aVar.f19966a && this.f19967b == aVar.f19967b;
        }

        public int hashCode() {
            return (Long.hashCode(this.f19966a) * 31) + Long.hashCode(this.f19967b);
        }

        @NotNull
        public String toString() {
            return "Status(remainingTime=" + this.f19966a + ", timePassed=" + this.f19967b + ')';
        }

        @NotNull
        public final a a(long j4, long j5) {
            return new a(j4, j5);
        }

        public static /* synthetic */ a a(a aVar, long j4, long j5, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                j4 = aVar.f19966a;
            }
            if ((i4 & 2) != 0) {
                j5 = aVar.f19967b;
            }
            return aVar.a(j4, j5);
        }
    }

    @Metadata
    public static final class b extends ir {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f19968a;

        b(Runnable runnable) {
            this.f19968a = runnable;
        }

        @Override // com.ironsource.ir
        public void a() {
            this.f19968a.run();
        }
    }

    public ut(@NotNull Handler handler, @NotNull Runnable task, long j4) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(task, "task");
        this.f19960a = handler;
        this.f19961b = j4;
        this.f19965f = new b(task);
        this.f19964e = c();
        a();
    }

    private final long c() {
        return System.currentTimeMillis();
    }

    private final long d() {
        return this.f19961b - this.f19962c;
    }

    @Override // com.ironsource.gp
    @NotNull
    public a a() {
        if (e()) {
            this.f19963d = c();
            this.f19964e = 0L;
            this.f19960a.postDelayed(this.f19965f, d());
        }
        return new a(d(), this.f19962c);
    }

    @Override // com.ironsource.gp
    @NotNull
    public a b() {
        if (!e()) {
            long c4 = c();
            this.f19964e = c4;
            this.f19962c += c4 - this.f19963d;
            this.f19960a.removeCallbacks(this.f19965f);
        }
        return new a(d(), this.f19962c);
    }

    public final boolean e() {
        return this.f19964e > 0;
    }
}
