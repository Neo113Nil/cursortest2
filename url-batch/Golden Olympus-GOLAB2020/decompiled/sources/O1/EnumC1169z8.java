package O1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: O1.z8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1169z8 {
    NONE("none"),
    SINGLE("single");


    /* renamed from: c, reason: collision with root package name */
    public static final c f8795c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Function1 f8796d = b.f8803i;

    /* renamed from: e, reason: collision with root package name */
    public static final Function1 f8797e = a.f8802i;

    /* renamed from: b, reason: collision with root package name */
    private final String f8801b;

    /* renamed from: O1.z8$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8802i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EnumC1169z8 invoke(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC1169z8.f8795c.a(value);
        }
    }

    /* renamed from: O1.z8$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f8803i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(EnumC1169z8 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC1169z8.f8795c.b(value);
        }
    }

    /* renamed from: O1.z8$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC1169z8 a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            EnumC1169z8 enumC1169z8 = EnumC1169z8.NONE;
            if (Intrinsics.areEqual(value, enumC1169z8.f8801b)) {
                return enumC1169z8;
            }
            EnumC1169z8 enumC1169z82 = EnumC1169z8.SINGLE;
            if (Intrinsics.areEqual(value, enumC1169z82.f8801b)) {
                return enumC1169z82;
            }
            return null;
        }

        public final String b(EnumC1169z8 obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f8801b;
        }

        private c() {
        }
    }

    EnumC1169z8(String str) {
        this.f8801b = str;
    }
}
