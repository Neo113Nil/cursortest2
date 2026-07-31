package O1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public enum Z3 {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right"),
    START("start"),
    END("end"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");


    /* renamed from: c, reason: collision with root package name */
    public static final c f5455c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Function1 f5456d = b.f5469i;

    /* renamed from: e, reason: collision with root package name */
    public static final Function1 f5457e = a.f5468i;

    /* renamed from: b, reason: collision with root package name */
    private final String f5467b;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5468i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Z3 invoke(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Z3.f5455c.a(value);
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f5469i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(Z3 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Z3.f5455c.b(value);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Z3 a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Z3 z32 = Z3.LEFT;
            if (Intrinsics.areEqual(value, z32.f5467b)) {
                return z32;
            }
            Z3 z33 = Z3.CENTER;
            if (Intrinsics.areEqual(value, z33.f5467b)) {
                return z33;
            }
            Z3 z34 = Z3.RIGHT;
            if (Intrinsics.areEqual(value, z34.f5467b)) {
                return z34;
            }
            Z3 z35 = Z3.START;
            if (Intrinsics.areEqual(value, z35.f5467b)) {
                return z35;
            }
            Z3 z36 = Z3.END;
            if (Intrinsics.areEqual(value, z36.f5467b)) {
                return z36;
            }
            Z3 z37 = Z3.SPACE_BETWEEN;
            if (Intrinsics.areEqual(value, z37.f5467b)) {
                return z37;
            }
            Z3 z38 = Z3.SPACE_AROUND;
            if (Intrinsics.areEqual(value, z38.f5467b)) {
                return z38;
            }
            Z3 z39 = Z3.SPACE_EVENLY;
            if (Intrinsics.areEqual(value, z39.f5467b)) {
                return z39;
            }
            return null;
        }

        public final String b(Z3 obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f5467b;
        }

        private c() {
        }
    }

    Z3(String str) {
        this.f5467b = str;
    }
}
