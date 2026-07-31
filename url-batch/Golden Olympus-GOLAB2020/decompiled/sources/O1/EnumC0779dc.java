package O1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: O1.dc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC0779dc {
    DP("dp"),
    SP("sp"),
    PX("px");


    /* renamed from: c, reason: collision with root package name */
    public static final c f6045c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Function1 f6046d = b.f6054i;

    /* renamed from: e, reason: collision with root package name */
    public static final Function1 f6047e = a.f6053i;

    /* renamed from: b, reason: collision with root package name */
    private final String f6052b;

    /* renamed from: O1.dc$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6053i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EnumC0779dc invoke(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC0779dc.f6045c.a(value);
        }
    }

    /* renamed from: O1.dc$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f6054i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(EnumC0779dc value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC0779dc.f6045c.b(value);
        }
    }

    /* renamed from: O1.dc$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC0779dc a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            EnumC0779dc enumC0779dc = EnumC0779dc.DP;
            if (Intrinsics.areEqual(value, enumC0779dc.f6052b)) {
                return enumC0779dc;
            }
            EnumC0779dc enumC0779dc2 = EnumC0779dc.SP;
            if (Intrinsics.areEqual(value, enumC0779dc2.f6052b)) {
                return enumC0779dc2;
            }
            EnumC0779dc enumC0779dc3 = EnumC0779dc.PX;
            if (Intrinsics.areEqual(value, enumC0779dc3.f6052b)) {
                return enumC0779dc3;
            }
            return null;
        }

        public final String b(EnumC0779dc obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f6052b;
        }

        private c() {
        }
    }

    EnumC0779dc(String str) {
        this.f6052b = str;
    }
}
