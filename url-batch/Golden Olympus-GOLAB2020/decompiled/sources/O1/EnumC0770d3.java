package O1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: O1.d3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC0770d3 {
    SOURCE_IN("source_in"),
    SOURCE_ATOP("source_atop"),
    DARKEN("darken"),
    LIGHTEN("lighten"),
    MULTIPLY("multiply"),
    SCREEN("screen");


    /* renamed from: c, reason: collision with root package name */
    public static final c f5996c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Function1 f5997d = b.f6008i;

    /* renamed from: e, reason: collision with root package name */
    public static final Function1 f5998e = a.f6007i;

    /* renamed from: b, reason: collision with root package name */
    private final String f6006b;

    /* renamed from: O1.d3$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6007i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EnumC0770d3 invoke(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC0770d3.f5996c.a(value);
        }
    }

    /* renamed from: O1.d3$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f6008i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(EnumC0770d3 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC0770d3.f5996c.b(value);
        }
    }

    /* renamed from: O1.d3$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC0770d3 a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            EnumC0770d3 enumC0770d3 = EnumC0770d3.SOURCE_IN;
            if (Intrinsics.areEqual(value, enumC0770d3.f6006b)) {
                return enumC0770d3;
            }
            EnumC0770d3 enumC0770d32 = EnumC0770d3.SOURCE_ATOP;
            if (Intrinsics.areEqual(value, enumC0770d32.f6006b)) {
                return enumC0770d32;
            }
            EnumC0770d3 enumC0770d33 = EnumC0770d3.DARKEN;
            if (Intrinsics.areEqual(value, enumC0770d33.f6006b)) {
                return enumC0770d33;
            }
            EnumC0770d3 enumC0770d34 = EnumC0770d3.LIGHTEN;
            if (Intrinsics.areEqual(value, enumC0770d34.f6006b)) {
                return enumC0770d34;
            }
            EnumC0770d3 enumC0770d35 = EnumC0770d3.MULTIPLY;
            if (Intrinsics.areEqual(value, enumC0770d35.f6006b)) {
                return enumC0770d35;
            }
            EnumC0770d3 enumC0770d36 = EnumC0770d3.SCREEN;
            if (Intrinsics.areEqual(value, enumC0770d36.f6006b)) {
                return enumC0770d36;
            }
            return null;
        }

        public final String b(EnumC0770d3 obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f6006b;
        }

        private c() {
        }
    }

    EnumC0770d3(String str) {
        this.f6006b = str;
    }
}
