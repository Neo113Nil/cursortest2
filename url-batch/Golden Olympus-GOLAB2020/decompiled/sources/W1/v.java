package W1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class v implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f9632c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final long f9633b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ v(long j4) {
        this.f9633b = j4;
    }

    public static final /* synthetic */ v a(long j4) {
        return new v(j4);
    }

    public static boolean c(long j4, Object obj) {
        return (obj instanceof v) && j4 == ((v) obj).f();
    }

    public static int d(long j4) {
        return Long.hashCode(j4);
    }

    public static String e(long j4) {
        return C.c(j4);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C.b(f(), ((v) obj).f());
    }

    public boolean equals(Object obj) {
        return c(this.f9633b, obj);
    }

    public final /* synthetic */ long f() {
        return this.f9633b;
    }

    public int hashCode() {
        return d(this.f9633b);
    }

    public String toString() {
        return e(this.f9633b);
    }

    public static long b(long j4) {
        return j4;
    }
}
