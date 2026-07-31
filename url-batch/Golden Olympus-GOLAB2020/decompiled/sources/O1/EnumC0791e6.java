package O1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: O1.e6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC0791e6 {
    LIGHT("light"),
    MEDIUM("medium"),
    REGULAR("regular"),
    BOLD("bold");


    /* renamed from: c, reason: collision with root package name */
    public static final c f6077c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Function1 f6078d = b.f6087i;

    /* renamed from: e, reason: collision with root package name */
    public static final Function1 f6079e = a.f6086i;

    /* renamed from: b, reason: collision with root package name */
    private final String f6085b;

    /* renamed from: O1.e6$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6086i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EnumC0791e6 invoke(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC0791e6.f6077c.a(value);
        }
    }

    /* renamed from: O1.e6$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f6087i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(EnumC0791e6 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC0791e6.f6077c.b(value);
        }
    }

    /* renamed from: O1.e6$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC0791e6 a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            EnumC0791e6 enumC0791e6 = EnumC0791e6.LIGHT;
            if (Intrinsics.areEqual(value, enumC0791e6.f6085b)) {
                return enumC0791e6;
            }
            EnumC0791e6 enumC0791e62 = EnumC0791e6.MEDIUM;
            if (Intrinsics.areEqual(value, enumC0791e62.f6085b)) {
                return enumC0791e62;
            }
            EnumC0791e6 enumC0791e63 = EnumC0791e6.REGULAR;
            if (Intrinsics.areEqual(value, enumC0791e63.f6085b)) {
                return enumC0791e63;
            }
            EnumC0791e6 enumC0791e64 = EnumC0791e6.BOLD;
            if (Intrinsics.areEqual(value, enumC0791e64.f6085b)) {
                return enumC0791e64;
            }
            return null;
        }

        public final String b(EnumC0791e6 obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f6085b;
        }

        private c() {
        }
    }

    EnumC0791e6(String str) {
        this.f6085b = str;
    }
}
