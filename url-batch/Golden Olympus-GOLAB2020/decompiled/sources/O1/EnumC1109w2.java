package O1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: O1.w2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1109w2 {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline");


    /* renamed from: c, reason: collision with root package name */
    public static final c f8298c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Function1 f8299d = b.f8308i;

    /* renamed from: e, reason: collision with root package name */
    public static final Function1 f8300e = a.f8307i;

    /* renamed from: b, reason: collision with root package name */
    private final String f8306b;

    /* renamed from: O1.w2$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8307i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EnumC1109w2 invoke(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC1109w2.f8298c.a(value);
        }
    }

    /* renamed from: O1.w2$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f8308i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(EnumC1109w2 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC1109w2.f8298c.b(value);
        }
    }

    /* renamed from: O1.w2$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC1109w2 a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            EnumC1109w2 enumC1109w2 = EnumC1109w2.TOP;
            if (Intrinsics.areEqual(value, enumC1109w2.f8306b)) {
                return enumC1109w2;
            }
            EnumC1109w2 enumC1109w22 = EnumC1109w2.CENTER;
            if (Intrinsics.areEqual(value, enumC1109w22.f8306b)) {
                return enumC1109w22;
            }
            EnumC1109w2 enumC1109w23 = EnumC1109w2.BOTTOM;
            if (Intrinsics.areEqual(value, enumC1109w23.f8306b)) {
                return enumC1109w23;
            }
            EnumC1109w2 enumC1109w24 = EnumC1109w2.BASELINE;
            if (Intrinsics.areEqual(value, enumC1109w24.f8306b)) {
                return enumC1109w24;
            }
            return null;
        }

        public final String b(EnumC1109w2 obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f8306b;
        }

        private c() {
        }
    }

    EnumC1109w2(String str) {
        this.f8306b = str;
    }
}
