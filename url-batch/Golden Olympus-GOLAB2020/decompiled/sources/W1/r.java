package W1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f9622c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final byte f9623b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ r(byte b4) {
        this.f9623b = b4;
    }

    public static final /* synthetic */ r a(byte b4) {
        return new r(b4);
    }

    public static boolean c(byte b4, Object obj) {
        return (obj instanceof r) && b4 == ((r) obj).f();
    }

    public static int d(byte b4) {
        return Byte.hashCode(b4);
    }

    public static String e(byte b4) {
        return String.valueOf(b4 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare(f() & 255, ((r) obj).f() & 255);
    }

    public boolean equals(Object obj) {
        return c(this.f9623b, obj);
    }

    public final /* synthetic */ byte f() {
        return this.f9623b;
    }

    public int hashCode() {
        return d(this.f9623b);
    }

    public String toString() {
        return e(this.f9623b);
    }

    public static byte b(byte b4) {
        return b4;
    }
}
