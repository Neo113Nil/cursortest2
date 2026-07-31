package W1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class t implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f9627c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final int f9628b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ t(int i4) {
        this.f9628b = i4;
    }

    public static final /* synthetic */ t a(int i4) {
        return new t(i4);
    }

    public static boolean c(int i4, Object obj) {
        return (obj instanceof t) && i4 == ((t) obj).f();
    }

    public static int d(int i4) {
        return Integer.hashCode(i4);
    }

    public static String e(int i4) {
        return String.valueOf(i4 & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C.a(f(), ((t) obj).f());
    }

    public boolean equals(Object obj) {
        return c(this.f9628b, obj);
    }

    public final /* synthetic */ int f() {
        return this.f9628b;
    }

    public int hashCode() {
        return d(this.f9628b);
    }

    public String toString() {
        return e(this.f9628b);
    }

    public static int b(int i4) {
        return i4;
    }
}
