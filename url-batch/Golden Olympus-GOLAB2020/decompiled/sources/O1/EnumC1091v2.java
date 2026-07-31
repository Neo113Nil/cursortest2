package O1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: O1.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1091v2 {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right"),
    START("start"),
    END("end");


    /* renamed from: c, reason: collision with root package name */
    public static final c f8193c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Function1 f8194d = b.f8204i;

    /* renamed from: e, reason: collision with root package name */
    public static final Function1 f8195e = a.f8203i;

    /* renamed from: b, reason: collision with root package name */
    private final String f8202b;

    /* renamed from: O1.v2$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8203i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EnumC1091v2 invoke(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC1091v2.f8193c.a(value);
        }
    }

    /* renamed from: O1.v2$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f8204i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(EnumC1091v2 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC1091v2.f8193c.b(value);
        }
    }

    /* renamed from: O1.v2$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC1091v2 a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            EnumC1091v2 enumC1091v2 = EnumC1091v2.LEFT;
            if (Intrinsics.areEqual(value, enumC1091v2.f8202b)) {
                return enumC1091v2;
            }
            EnumC1091v2 enumC1091v22 = EnumC1091v2.CENTER;
            if (Intrinsics.areEqual(value, enumC1091v22.f8202b)) {
                return enumC1091v22;
            }
            EnumC1091v2 enumC1091v23 = EnumC1091v2.RIGHT;
            if (Intrinsics.areEqual(value, enumC1091v23.f8202b)) {
                return enumC1091v23;
            }
            EnumC1091v2 enumC1091v24 = EnumC1091v2.START;
            if (Intrinsics.areEqual(value, enumC1091v24.f8202b)) {
                return enumC1091v24;
            }
            EnumC1091v2 enumC1091v25 = EnumC1091v2.END;
            if (Intrinsics.areEqual(value, enumC1091v25.f8202b)) {
                return enumC1091v25;
            }
            return null;
        }

        public final String b(EnumC1091v2 obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f8202b;
        }

        private c() {
        }
    }

    EnumC1091v2(String str) {
        this.f8202b = str;
    }
}
