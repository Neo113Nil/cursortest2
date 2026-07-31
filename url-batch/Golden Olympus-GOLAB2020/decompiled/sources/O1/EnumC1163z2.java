package O1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: O1.z2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1163z2 {
    LINEAR("linear"),
    EASE("ease"),
    EASE_IN("ease_in"),
    EASE_OUT("ease_out"),
    EASE_IN_OUT("ease_in_out"),
    SPRING("spring");


    /* renamed from: c, reason: collision with root package name */
    public static final c f8688c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Function1 f8689d = b.f8700i;

    /* renamed from: e, reason: collision with root package name */
    public static final Function1 f8690e = a.f8699i;

    /* renamed from: b, reason: collision with root package name */
    private final String f8698b;

    /* renamed from: O1.z2$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8699i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EnumC1163z2 invoke(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC1163z2.f8688c.a(value);
        }
    }

    /* renamed from: O1.z2$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f8700i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(EnumC1163z2 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC1163z2.f8688c.b(value);
        }
    }

    /* renamed from: O1.z2$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC1163z2 a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            EnumC1163z2 enumC1163z2 = EnumC1163z2.LINEAR;
            if (Intrinsics.areEqual(value, enumC1163z2.f8698b)) {
                return enumC1163z2;
            }
            EnumC1163z2 enumC1163z22 = EnumC1163z2.EASE;
            if (Intrinsics.areEqual(value, enumC1163z22.f8698b)) {
                return enumC1163z22;
            }
            EnumC1163z2 enumC1163z23 = EnumC1163z2.EASE_IN;
            if (Intrinsics.areEqual(value, enumC1163z23.f8698b)) {
                return enumC1163z23;
            }
            EnumC1163z2 enumC1163z24 = EnumC1163z2.EASE_OUT;
            if (Intrinsics.areEqual(value, enumC1163z24.f8698b)) {
                return enumC1163z24;
            }
            EnumC1163z2 enumC1163z25 = EnumC1163z2.EASE_IN_OUT;
            if (Intrinsics.areEqual(value, enumC1163z25.f8698b)) {
                return enumC1163z25;
            }
            EnumC1163z2 enumC1163z26 = EnumC1163z2.SPRING;
            if (Intrinsics.areEqual(value, enumC1163z26.f8698b)) {
                return enumC1163z26;
            }
            return null;
        }

        public final String b(EnumC1163z2 obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f8698b;
        }

        private c() {
        }
    }

    EnumC1163z2(String str) {
        this.f8698b = str;
    }
}
