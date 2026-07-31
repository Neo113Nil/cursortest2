package W1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class y implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f9638c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final short f9639b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ y(short s4) {
        this.f9639b = s4;
    }

    public static final /* synthetic */ y a(short s4) {
        return new y(s4);
    }

    public static boolean c(short s4, Object obj) {
        return (obj instanceof y) && s4 == ((y) obj).f();
    }

    public static int d(short s4) {
        return Short.hashCode(s4);
    }

    public static String e(short s4) {
        return String.valueOf(s4 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare(f() & 65535, ((y) obj).f() & 65535);
    }

    public boolean equals(Object obj) {
        return c(this.f9639b, obj);
    }

    public final /* synthetic */ short f() {
        return this.f9639b;
    }

    public int hashCode() {
        return d(this.f9639b);
    }

    public String toString() {
        return e(this.f9639b);
    }

    public static short b(short s4) {
        return s4;
    }
}
