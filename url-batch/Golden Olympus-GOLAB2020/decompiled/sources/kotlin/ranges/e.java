package kotlin.ranges;

import c2.AbstractC1380c;
import i2.InterfaceC2471a;
import kotlin.collections.F;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class e implements Iterable, InterfaceC2471a {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f41186e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final long f41187b;

    /* renamed from: c, reason: collision with root package name */
    private final long f41188c;

    /* renamed from: d, reason: collision with root package name */
    private final long f41189d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e(long j4, long j5, long j6) {
        if (j6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j6 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f41187b = j4;
        this.f41188c = AbstractC1380c.d(j4, j5, j6);
        this.f41189d = j6;
    }

    public final long b() {
        return this.f41187b;
    }

    public final long d() {
        return this.f41188c;
    }

    @Override // java.lang.Iterable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public F iterator() {
        return new l2.d(this.f41187b, this.f41188c, this.f41189d);
    }
}
