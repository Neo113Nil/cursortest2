package O1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public enum Lf {
    FILL("fill"),
    NO_SCALE("no_scale"),
    FIT("fit");


    /* renamed from: c, reason: collision with root package name */
    public static final c f3787c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Function1 f3788d = b.f3796i;

    /* renamed from: e, reason: collision with root package name */
    public static final Function1 f3789e = a.f3795i;

    /* renamed from: b, reason: collision with root package name */
    private final String f3794b;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3795i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Lf invoke(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Lf.f3787c.a(value);
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f3796i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(Lf value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Lf.f3787c.b(value);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Lf a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Lf lf = Lf.FILL;
            if (Intrinsics.areEqual(value, lf.f3794b)) {
                return lf;
            }
            Lf lf2 = Lf.NO_SCALE;
            if (Intrinsics.areEqual(value, lf2.f3794b)) {
                return lf2;
            }
            Lf lf3 = Lf.FIT;
            if (Intrinsics.areEqual(value, lf3.f3794b)) {
                return lf3;
            }
            return null;
        }

        public final String b(Lf obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f3794b;
        }

        private c() {
        }
    }

    Lf(String str) {
        this.f3794b = str;
    }
}
