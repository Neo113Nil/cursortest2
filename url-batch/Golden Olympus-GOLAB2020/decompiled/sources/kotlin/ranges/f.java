package kotlin.ranges;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f extends e {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f41190f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final f f41191g = new f(1, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public f(long j4, long j5) {
        super(j4, j5, 1L);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (isEmpty() && ((f) obj).isEmpty()) {
            return true;
        }
        f fVar = (f) obj;
        return b() == fVar.b() && d() == fVar.d();
    }

    public boolean f(long j4) {
        return b() <= j4 && j4 <= d();
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (b() ^ (b() >>> 32))) + (d() ^ (d() >>> 32)));
    }

    public boolean isEmpty() {
        return b() > d();
    }

    public String toString() {
        return b() + ".." + d();
    }
}
