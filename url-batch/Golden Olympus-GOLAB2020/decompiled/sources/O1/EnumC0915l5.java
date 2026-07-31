package O1;

import com.ironsource.b9;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: O1.l5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC0915l5 {
    STRING("string"),
    INTEGER("integer"),
    NUMBER("number"),
    BOOLEAN("boolean"),
    DATETIME("datetime"),
    COLOR(b9.h.f15459S),
    URL("url"),
    DICT("dict"),
    ARRAY("array");


    /* renamed from: c, reason: collision with root package name */
    public static final c f6906c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Function1 f6907d = b.f6921i;

    /* renamed from: e, reason: collision with root package name */
    public static final Function1 f6908e = a.f6920i;

    /* renamed from: b, reason: collision with root package name */
    private final String f6919b;

    /* renamed from: O1.l5$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6920i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EnumC0915l5 invoke(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC0915l5.f6906c.a(value);
        }
    }

    /* renamed from: O1.l5$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f6921i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(EnumC0915l5 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC0915l5.f6906c.b(value);
        }
    }

    /* renamed from: O1.l5$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC0915l5 a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            EnumC0915l5 enumC0915l5 = EnumC0915l5.STRING;
            if (Intrinsics.areEqual(value, enumC0915l5.f6919b)) {
                return enumC0915l5;
            }
            EnumC0915l5 enumC0915l52 = EnumC0915l5.INTEGER;
            if (Intrinsics.areEqual(value, enumC0915l52.f6919b)) {
                return enumC0915l52;
            }
            EnumC0915l5 enumC0915l53 = EnumC0915l5.NUMBER;
            if (Intrinsics.areEqual(value, enumC0915l53.f6919b)) {
                return enumC0915l53;
            }
            EnumC0915l5 enumC0915l54 = EnumC0915l5.BOOLEAN;
            if (Intrinsics.areEqual(value, enumC0915l54.f6919b)) {
                return enumC0915l54;
            }
            EnumC0915l5 enumC0915l55 = EnumC0915l5.DATETIME;
            if (Intrinsics.areEqual(value, enumC0915l55.f6919b)) {
                return enumC0915l55;
            }
            EnumC0915l5 enumC0915l56 = EnumC0915l5.COLOR;
            if (Intrinsics.areEqual(value, enumC0915l56.f6919b)) {
                return enumC0915l56;
            }
            EnumC0915l5 enumC0915l57 = EnumC0915l5.URL;
            if (Intrinsics.areEqual(value, enumC0915l57.f6919b)) {
                return enumC0915l57;
            }
            EnumC0915l5 enumC0915l58 = EnumC0915l5.DICT;
            if (Intrinsics.areEqual(value, enumC0915l58.f6919b)) {
                return enumC0915l58;
            }
            EnumC0915l5 enumC0915l59 = EnumC0915l5.ARRAY;
            if (Intrinsics.areEqual(value, enumC0915l59.f6919b)) {
                return enumC0915l59;
            }
            return null;
        }

        public final String b(EnumC0915l5 obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f6919b;
        }

        private c() {
        }
    }

    EnumC0915l5(String str) {
        this.f6919b = str;
    }
}
