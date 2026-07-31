package O1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: O1.a4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC0717a4 {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");


    /* renamed from: c, reason: collision with root package name */
    public static final c f5624c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Function1 f5625d = b.f5637i;

    /* renamed from: e, reason: collision with root package name */
    public static final Function1 f5626e = a.f5636i;

    /* renamed from: b, reason: collision with root package name */
    private final String f5635b;

    /* renamed from: O1.a4$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5636i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EnumC0717a4 invoke(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC0717a4.f5624c.a(value);
        }
    }

    /* renamed from: O1.a4$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f5637i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(EnumC0717a4 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC0717a4.f5624c.b(value);
        }
    }

    /* renamed from: O1.a4$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC0717a4 a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            EnumC0717a4 enumC0717a4 = EnumC0717a4.TOP;
            if (Intrinsics.areEqual(value, enumC0717a4.f5635b)) {
                return enumC0717a4;
            }
            EnumC0717a4 enumC0717a42 = EnumC0717a4.CENTER;
            if (Intrinsics.areEqual(value, enumC0717a42.f5635b)) {
                return enumC0717a42;
            }
            EnumC0717a4 enumC0717a43 = EnumC0717a4.BOTTOM;
            if (Intrinsics.areEqual(value, enumC0717a43.f5635b)) {
                return enumC0717a43;
            }
            EnumC0717a4 enumC0717a44 = EnumC0717a4.BASELINE;
            if (Intrinsics.areEqual(value, enumC0717a44.f5635b)) {
                return enumC0717a44;
            }
            EnumC0717a4 enumC0717a45 = EnumC0717a4.SPACE_BETWEEN;
            if (Intrinsics.areEqual(value, enumC0717a45.f5635b)) {
                return enumC0717a45;
            }
            EnumC0717a4 enumC0717a46 = EnumC0717a4.SPACE_AROUND;
            if (Intrinsics.areEqual(value, enumC0717a46.f5635b)) {
                return enumC0717a46;
            }
            EnumC0717a4 enumC0717a47 = EnumC0717a4.SPACE_EVENLY;
            if (Intrinsics.areEqual(value, enumC0717a47.f5635b)) {
                return enumC0717a47;
            }
            return null;
        }

        public final String b(EnumC0717a4 obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f5635b;
        }

        private c() {
        }
    }

    EnumC0717a4(String str) {
        this.f5635b = str;
    }
}
