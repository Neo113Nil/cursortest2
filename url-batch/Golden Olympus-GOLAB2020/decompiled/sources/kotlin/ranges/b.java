package kotlin.ranges;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b extends kotlin.ranges.a {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f41178f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final b f41179g = new b(1, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(char c4, char c5) {
        super(c4, c5, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj).isEmpty()) {
            return true;
        }
        b bVar = (b) obj;
        return b() == bVar.b() && d() == bVar.d();
    }

    public boolean f(char c4) {
        return Intrinsics.compare((int) b(), (int) c4) <= 0 && Intrinsics.compare((int) c4, (int) d()) <= 0;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (b() * 31) + d();
    }

    public boolean isEmpty() {
        return Intrinsics.compare((int) b(), (int) d()) > 0;
    }

    public String toString() {
        return b() + ".." + d();
    }
}
