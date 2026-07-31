package O1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public enum Vf {
    VISIBLE("visible"),
    INVISIBLE("invisible"),
    GONE("gone");


    /* renamed from: c, reason: collision with root package name */
    public static final c f5041c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Function1 f5042d = b.f5050i;

    /* renamed from: e, reason: collision with root package name */
    public static final Function1 f5043e = a.f5049i;

    /* renamed from: b, reason: collision with root package name */
    private final String f5048b;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5049i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Vf invoke(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Vf.f5041c.a(value);
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f5050i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(Vf value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Vf.f5041c.b(value);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Vf a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Vf vf = Vf.VISIBLE;
            if (Intrinsics.areEqual(value, vf.f5048b)) {
                return vf;
            }
            Vf vf2 = Vf.INVISIBLE;
            if (Intrinsics.areEqual(value, vf2.f5048b)) {
                return vf2;
            }
            Vf vf3 = Vf.GONE;
            if (Intrinsics.areEqual(value, vf3.f5048b)) {
                return vf3;
            }
            return null;
        }

        public final String b(Vf obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f5048b;
        }

        private c() {
        }
    }

    Vf(String str) {
        this.f5048b = str;
    }
}
