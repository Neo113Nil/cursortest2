package A2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class j {

    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        public static final a f97a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends j {

        /* renamed from: a, reason: collision with root package name */
        public static final b f98a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        String e4 = H.b(getClass()).e();
        Intrinsics.checkNotNull(e4);
        return e4;
    }

    private j() {
    }
}
