package O1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public enum Ld {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline");


    /* renamed from: c, reason: collision with root package name */
    public static final c f3771c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Function1 f3772d = b.f3781i;

    /* renamed from: e, reason: collision with root package name */
    public static final Function1 f3773e = a.f3780i;

    /* renamed from: b, reason: collision with root package name */
    private final String f3779b;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3780i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ld invoke(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Ld.f3771c.a(value);
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f3781i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(Ld value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Ld.f3771c.b(value);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ld a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Ld ld = Ld.TOP;
            if (Intrinsics.areEqual(value, ld.f3779b)) {
                return ld;
            }
            Ld ld2 = Ld.CENTER;
            if (Intrinsics.areEqual(value, ld2.f3779b)) {
                return ld2;
            }
            Ld ld3 = Ld.BOTTOM;
            if (Intrinsics.areEqual(value, ld3.f3779b)) {
                return ld3;
            }
            Ld ld4 = Ld.BASELINE;
            if (Intrinsics.areEqual(value, ld4.f3779b)) {
                return ld4;
            }
            return null;
        }

        public final String b(Ld obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f3779b;
        }

        private c() {
        }
    }

    Ld(String str) {
        this.f3779b = str;
    }
}
