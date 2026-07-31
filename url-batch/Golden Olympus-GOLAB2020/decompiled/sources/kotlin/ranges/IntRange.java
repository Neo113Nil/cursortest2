package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class IntRange extends d {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f41172f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final IntRange f41173g = new IntRange(1, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntRange a() {
            return IntRange.f41173g;
        }

        private a() {
        }
    }

    public IntRange(int i4, int i5) {
        super(i4, i5, 1);
    }

    @Override // kotlin.ranges.d
    public boolean equals(Object obj) {
        if (!(obj instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) obj).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) obj;
        return b() == intRange.b() && d() == intRange.d();
    }

    public boolean h(int i4) {
        return b() <= i4 && i4 <= d();
    }

    @Override // kotlin.ranges.d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (b() * 31) + d();
    }

    @Override // kotlin.ranges.d
    public boolean isEmpty() {
        return b() > d();
    }

    public Integer k() {
        return Integer.valueOf(d());
    }

    public Integer l() {
        return Integer.valueOf(b());
    }

    @Override // kotlin.ranges.d
    public String toString() {
        return b() + ".." + d();
    }
}
