package O1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public enum Y6 {
    FILL("fill"),
    NO_SCALE("no_scale"),
    FIT("fit"),
    STRETCH("stretch");


    /* renamed from: c, reason: collision with root package name */
    public static final c f5380c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Function1 f5381d = b.f5390i;

    /* renamed from: e, reason: collision with root package name */
    public static final Function1 f5382e = a.f5389i;

    /* renamed from: b, reason: collision with root package name */
    private final String f5388b;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5389i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Y6 invoke(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Y6.f5380c.a(value);
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f5390i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(Y6 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Y6.f5380c.b(value);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Y6 a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Y6 y6 = Y6.FILL;
            if (Intrinsics.areEqual(value, y6.f5388b)) {
                return y6;
            }
            Y6 y62 = Y6.NO_SCALE;
            if (Intrinsics.areEqual(value, y62.f5388b)) {
                return y62;
            }
            Y6 y63 = Y6.FIT;
            if (Intrinsics.areEqual(value, y63.f5388b)) {
                return y63;
            }
            Y6 y64 = Y6.STRETCH;
            if (Intrinsics.areEqual(value, y64.f5388b)) {
                return y64;
            }
            return null;
        }

        public final String b(Y6 obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f5388b;
        }

        private c() {
        }
    }

    Y6(String str) {
        this.f5388b = str;
    }
}
