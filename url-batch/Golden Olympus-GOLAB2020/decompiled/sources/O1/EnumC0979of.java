package O1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: O1.of, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC0979of {
    NONE("none"),
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    ANY_CHANGE("any_change");


    /* renamed from: c, reason: collision with root package name */
    public static final c f7415c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Function1 f7416d = b.f7425i;

    /* renamed from: e, reason: collision with root package name */
    public static final Function1 f7417e = a.f7424i;

    /* renamed from: b, reason: collision with root package name */
    private final String f7423b;

    /* renamed from: O1.of$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7424i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EnumC0979of invoke(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC0979of.f7415c.a(value);
        }
    }

    /* renamed from: O1.of$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f7425i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(EnumC0979of value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC0979of.f7415c.b(value);
        }
    }

    /* renamed from: O1.of$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC0979of a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            EnumC0979of enumC0979of = EnumC0979of.NONE;
            if (Intrinsics.areEqual(value, enumC0979of.f7423b)) {
                return enumC0979of;
            }
            EnumC0979of enumC0979of2 = EnumC0979of.DATA_CHANGE;
            if (Intrinsics.areEqual(value, enumC0979of2.f7423b)) {
                return enumC0979of2;
            }
            EnumC0979of enumC0979of3 = EnumC0979of.STATE_CHANGE;
            if (Intrinsics.areEqual(value, enumC0979of3.f7423b)) {
                return enumC0979of3;
            }
            EnumC0979of enumC0979of4 = EnumC0979of.ANY_CHANGE;
            if (Intrinsics.areEqual(value, enumC0979of4.f7423b)) {
                return enumC0979of4;
            }
            return null;
        }

        public final String b(EnumC0979of obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f7423b;
        }

        private c() {
        }
    }

    EnumC0979of(String str) {
        this.f7423b = str;
    }
}
