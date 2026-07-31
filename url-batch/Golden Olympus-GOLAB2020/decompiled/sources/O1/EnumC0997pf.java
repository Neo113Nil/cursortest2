package O1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: O1.pf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC0997pf {
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    VISIBILITY_CHANGE("visibility_change");


    /* renamed from: c, reason: collision with root package name */
    public static final c f7539c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Function1 f7540d = b.f7548i;

    /* renamed from: e, reason: collision with root package name */
    public static final Function1 f7541e = a.f7547i;

    /* renamed from: b, reason: collision with root package name */
    private final String f7546b;

    /* renamed from: O1.pf$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7547i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EnumC0997pf invoke(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC0997pf.f7539c.a(value);
        }
    }

    /* renamed from: O1.pf$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f7548i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(EnumC0997pf value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return EnumC0997pf.f7539c.b(value);
        }
    }

    /* renamed from: O1.pf$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC0997pf a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            EnumC0997pf enumC0997pf = EnumC0997pf.DATA_CHANGE;
            if (Intrinsics.areEqual(value, enumC0997pf.f7546b)) {
                return enumC0997pf;
            }
            EnumC0997pf enumC0997pf2 = EnumC0997pf.STATE_CHANGE;
            if (Intrinsics.areEqual(value, enumC0997pf2.f7546b)) {
                return enumC0997pf2;
            }
            EnumC0997pf enumC0997pf3 = EnumC0997pf.VISIBILITY_CHANGE;
            if (Intrinsics.areEqual(value, enumC0997pf3.f7546b)) {
                return enumC0997pf3;
            }
            return null;
        }

        public final String b(EnumC0997pf obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f7546b;
        }

        private c() {
        }
    }

    EnumC0997pf(String str) {
        this.f7546b = str;
    }
}
