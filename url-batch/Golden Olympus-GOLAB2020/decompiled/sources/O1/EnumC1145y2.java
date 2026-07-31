package O1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: O1.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1145y2 {
    NORMAL("normal"),
    REVERSE("reverse"),
    ALTERNATE("alternate"),
    ALTERNATE_REVERSE("alternate_reverse");


    /* renamed from: c, reason: collision with root package name */
    public static final c f8521c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Function1 f8522d = b.f8531i;

    /* renamed from: e, reason: collision with root package name */
    public static final Function1 f8523e = a.f8530i;

    /* renamed from: b, reason: collision with root package name */
    private final String f8529b;

    /* renamed from: O1.y2$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8530i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EnumC1145y2 invoke(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC1145y2.f8521c.a(value);
        }
    }

    /* renamed from: O1.y2$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f8531i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(EnumC1145y2 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC1145y2.f8521c.b(value);
        }
    }

    /* renamed from: O1.y2$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC1145y2 a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            EnumC1145y2 enumC1145y2 = EnumC1145y2.NORMAL;
            if (Intrinsics.areEqual(value, enumC1145y2.f8529b)) {
                return enumC1145y2;
            }
            EnumC1145y2 enumC1145y22 = EnumC1145y2.REVERSE;
            if (Intrinsics.areEqual(value, enumC1145y22.f8529b)) {
                return enumC1145y22;
            }
            EnumC1145y2 enumC1145y23 = EnumC1145y2.ALTERNATE;
            if (Intrinsics.areEqual(value, enumC1145y23.f8529b)) {
                return enumC1145y23;
            }
            EnumC1145y2 enumC1145y24 = EnumC1145y2.ALTERNATE_REVERSE;
            if (Intrinsics.areEqual(value, enumC1145y24.f8529b)) {
                return enumC1145y24;
            }
            return null;
        }

        public final String b(EnumC1145y2 obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f8529b;
        }

        private c() {
        }
    }

    EnumC1145y2(String str) {
        this.f8529b = str;
    }
}
