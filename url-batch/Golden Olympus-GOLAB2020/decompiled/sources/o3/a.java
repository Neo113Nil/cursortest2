package o3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0243a f42109e = new C0243a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f42110a;

    /* renamed from: b, reason: collision with root package name */
    private final long f42111b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicInteger f42112c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f42113d;

    /* renamed from: o3.a$a, reason: collision with other inner class name */
    public static final class C0243a {
        public /* synthetic */ C0243a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(int i4) {
            return new a(i4, Long.MAX_VALUE, (DefaultConstructorMarker) null);
        }

        private C0243a() {
        }
    }

    public /* synthetic */ a(int i4, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, j4);
    }

    private final void a(int i4) {
        int i5;
        do {
            i5 = this.f42112c.get();
        } while (!this.f42112c.compareAndSet(i5, Math.min(this.f42110a, i5 + i4)));
    }

    public static /* synthetic */ boolean c(a aVar, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 1;
        }
        return aVar.b(i4);
    }

    private final void d() {
        long j4;
        long j5;
        long j6;
        if (this.f42111b >= Long.MAX_VALUE) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            j4 = this.f42113d.get();
            long j7 = nanoTime - j4;
            j5 = this.f42111b;
            if (j7 < j5) {
                return;
            }
            j6 = j7 / j5;
        } while (!this.f42113d.compareAndSet(j4, (j5 * j6) + j4));
        a((int) g.h(j6, 2147483647L));
    }

    public final boolean b(int i4) {
        int i5;
        if (i4 <= 0) {
            throw new IllegalArgumentException("requested tokens must be positive");
        }
        d();
        do {
            i5 = this.f42112c.get();
            if (i5 < i4) {
                return false;
            }
        } while (!this.f42112c.compareAndSet(i5, i5 - i4));
        return true;
    }

    private a(int i4, long j4) {
        this.f42110a = i4;
        this.f42111b = j4;
        this.f42112c = new AtomicInteger(i4);
        this.f42113d = new AtomicLong(System.nanoTime());
        if (i4 <= 0) {
            throw new IllegalArgumentException("capacity must be positive");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i4, long j4, TimeUnit unit) {
        this(i4, unit.toNanos(j4) / i4);
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (this.f42111b <= 0) {
            throw new IllegalStateException("period must be >= capacity to avoid zero refill interval");
        }
    }
}
