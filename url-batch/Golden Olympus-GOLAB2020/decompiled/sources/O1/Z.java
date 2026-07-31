package O1;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Z implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f5420c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f5421d = a.f5424i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f5422a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f5423b;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5424i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Z.f5420c.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Z a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C1025r8) BuiltInParserKt.getBuiltInParserComponent().J4().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends Z {

        /* renamed from: e, reason: collision with root package name */
        private final R3 f5425e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(R3 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5425e = value;
        }

        public final R3 c() {
            return this.f5425e;
        }
    }

    public static final class d extends Z {

        /* renamed from: e, reason: collision with root package name */
        private final C1039s4 f5426e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1039s4 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5426e = value;
        }

        public final C1039s4 c() {
            return this.f5426e;
        }
    }

    public static final class e extends Z {

        /* renamed from: e, reason: collision with root package name */
        private final C0970o6 f5427e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C0970o6 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5427e = value;
        }

        public final C0970o6 c() {
            return this.f5427e;
        }
    }

    public static final class f extends Z {

        /* renamed from: e, reason: collision with root package name */
        private final C1167z6 f5428e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C1167z6 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5428e = value;
        }

        public final C1167z6 c() {
            return this.f5428e;
        }
    }

    public static final class g extends Z {

        /* renamed from: e, reason: collision with root package name */
        private final G6 f5429e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(G6 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5429e = value;
        }

        public final G6 c() {
            return this.f5429e;
        }
    }

    public static final class h extends Z {

        /* renamed from: e, reason: collision with root package name */
        private final O6 f5430e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(O6 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5430e = value;
        }

        public final O6 c() {
            return this.f5430e;
        }
    }

    public static final class i extends Z {

        /* renamed from: e, reason: collision with root package name */
        private final C0720a7 f5431e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C0720a7 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5431e = value;
        }

        public final C0720a7 c() {
            return this.f5431e;
        }
    }

    public static final class j extends Z {

        /* renamed from: e, reason: collision with root package name */
        private final C1060t7 f5432e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C1060t7 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5432e = value;
        }

        public final C1060t7 c() {
            return this.f5432e;
        }
    }

    public static final class k extends Z {

        /* renamed from: e, reason: collision with root package name */
        private final E9 f5433e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(E9 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5433e = value;
        }

        public final E9 c() {
            return this.f5433e;
        }
    }

    public static final class l extends Z {

        /* renamed from: e, reason: collision with root package name */
        private final C0939mb f5434e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(C0939mb value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5434e = value;
        }

        public final C0939mb c() {
            return this.f5434e;
        }
    }

    public static final class m extends Z {

        /* renamed from: e, reason: collision with root package name */
        private final Ab f5435e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Ab value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5435e = value;
        }

        public final Ab c() {
            return this.f5435e;
        }
    }

    public static final class n extends Z {

        /* renamed from: e, reason: collision with root package name */
        private final C0886jc f5436e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(C0886jc value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5436e = value;
        }

        public final C0886jc c() {
            return this.f5436e;
        }
    }

    public static final class o extends Z {

        /* renamed from: e, reason: collision with root package name */
        private final Bc f5437e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Bc value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5437e = value;
        }

        public final Bc c() {
            return this.f5437e;
        }
    }

    public static final class p extends Z {

        /* renamed from: e, reason: collision with root package name */
        private final C0887jd f5438e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(C0887jd value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5438e = value;
        }

        public final C0887jd c() {
            return this.f5438e;
        }
    }

    public static final class q extends Z {

        /* renamed from: e, reason: collision with root package name */
        private final C1013qd f5439e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(C1013qd value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5439e = value;
        }

        public final C1013qd c() {
            return this.f5439e;
        }
    }

    public static final class r extends Z {

        /* renamed from: e, reason: collision with root package name */
        private final Kd f5440e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Kd value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5440e = value;
        }

        public final Kd c() {
            return this.f5440e;
        }
    }

    public static final class s extends Z {

        /* renamed from: e, reason: collision with root package name */
        private final Ef f5441e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Ef value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5441e = value;
        }

        public final Ef c() {
            return this.f5441e;
        }
    }

    public /* synthetic */ Z(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(Z z4, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (z4 == null) {
            return false;
        }
        if (this instanceof h) {
            O6 c4 = ((h) this).c();
            InterfaceC0752c3 b4 = z4.b();
            return c4.C(b4 instanceof O6 ? (O6) b4 : null, resolver, otherResolver);
        }
        if (this instanceof f) {
            C1167z6 c5 = ((f) this).c();
            InterfaceC0752c3 b5 = z4.b();
            return c5.C(b5 instanceof C1167z6 ? (C1167z6) b5 : null, resolver, otherResolver);
        }
        if (this instanceof r) {
            Kd c6 = ((r) this).c();
            InterfaceC0752c3 b6 = z4.b();
            return c6.C(b6 instanceof Kd ? (Kd) b6 : null, resolver, otherResolver);
        }
        if (this instanceof m) {
            Ab c7 = ((m) this).c();
            InterfaceC0752c3 b7 = z4.b();
            return c7.C(b7 instanceof Ab ? (Ab) b7 : null, resolver, otherResolver);
        }
        if (this instanceof c) {
            R3 c8 = ((c) this).c();
            InterfaceC0752c3 b8 = z4.b();
            return c8.C(b8 instanceof R3 ? (R3) b8 : null, resolver, otherResolver);
        }
        if (this instanceof g) {
            G6 c9 = ((g) this).c();
            InterfaceC0752c3 b9 = z4.b();
            return c9.C(b9 instanceof G6 ? (G6) b9 : null, resolver, otherResolver);
        }
        if (this instanceof e) {
            C0970o6 c10 = ((e) this).c();
            InterfaceC0752c3 b10 = z4.b();
            return c10.C(b10 instanceof C0970o6 ? (C0970o6) b10 : null, resolver, otherResolver);
        }
        if (this instanceof k) {
            E9 c11 = ((k) this).c();
            InterfaceC0752c3 b11 = z4.b();
            return c11.C(b11 instanceof E9 ? (E9) b11 : null, resolver, otherResolver);
        }
        if (this instanceof q) {
            C1013qd c12 = ((q) this).c();
            InterfaceC0752c3 b12 = z4.b();
            return c12.C(b12 instanceof C1013qd ? (C1013qd) b12 : null, resolver, otherResolver);
        }
        if (this instanceof o) {
            Bc c13 = ((o) this).c();
            InterfaceC0752c3 b13 = z4.b();
            return c13.C(b13 instanceof Bc ? (Bc) b13 : null, resolver, otherResolver);
        }
        if (this instanceof d) {
            C1039s4 c14 = ((d) this).c();
            InterfaceC0752c3 b14 = z4.b();
            return c14.C(b14 instanceof C1039s4 ? (C1039s4) b14 : null, resolver, otherResolver);
        }
        if (this instanceof i) {
            C0720a7 c15 = ((i) this).c();
            InterfaceC0752c3 b15 = z4.b();
            return c15.C(b15 instanceof C0720a7 ? (C0720a7) b15 : null, resolver, otherResolver);
        }
        if (this instanceof n) {
            C0886jc c16 = ((n) this).c();
            InterfaceC0752c3 b16 = z4.b();
            return c16.C(b16 instanceof C0886jc ? (C0886jc) b16 : null, resolver, otherResolver);
        }
        if (this instanceof p) {
            C0887jd c17 = ((p) this).c();
            InterfaceC0752c3 b17 = z4.b();
            return c17.C(b17 instanceof C0887jd ? (C0887jd) b17 : null, resolver, otherResolver);
        }
        if (this instanceof j) {
            C1060t7 c18 = ((j) this).c();
            InterfaceC0752c3 b18 = z4.b();
            return c18.C(b18 instanceof C1060t7 ? (C1060t7) b18 : null, resolver, otherResolver);
        }
        if (this instanceof l) {
            C0939mb c19 = ((l) this).c();
            InterfaceC0752c3 b19 = z4.b();
            return c19.C(b19 instanceof C0939mb ? (C0939mb) b19 : null, resolver, otherResolver);
        }
        if (!(this instanceof s)) {
            throw new W1.m();
        }
        Ef c20 = ((s) this).c();
        InterfaceC0752c3 b20 = z4.b();
        return c20.C(b20 instanceof Ef ? (Ef) b20 : null, resolver, otherResolver);
    }

    public final InterfaceC0752c3 b() {
        if (this instanceof h) {
            return ((h) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof r) {
            return ((r) this).c();
        }
        if (this instanceof m) {
            return ((m) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof g) {
            return ((g) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof k) {
            return ((k) this).c();
        }
        if (this instanceof q) {
            return ((q) this).c();
        }
        if (this instanceof o) {
            return ((o) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof i) {
            return ((i) this).c();
        }
        if (this instanceof n) {
            return ((n) this).c();
        }
        if (this instanceof p) {
            return ((p) this).c();
        }
        if (this instanceof j) {
            return ((j) this).c();
        }
        if (this instanceof l) {
            return ((l) this).c();
        }
        if (this instanceof s) {
            return ((s) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this.f5423b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(getClass()).hashCode();
        if (this instanceof h) {
            hash = ((h) this).c().hash();
        } else if (this instanceof f) {
            hash = ((f) this).c().hash();
        } else if (this instanceof r) {
            hash = ((r) this).c().hash();
        } else if (this instanceof m) {
            hash = ((m) this).c().hash();
        } else if (this instanceof c) {
            hash = ((c) this).c().hash();
        } else if (this instanceof g) {
            hash = ((g) this).c().hash();
        } else if (this instanceof e) {
            hash = ((e) this).c().hash();
        } else if (this instanceof k) {
            hash = ((k) this).c().hash();
        } else if (this instanceof q) {
            hash = ((q) this).c().hash();
        } else if (this instanceof o) {
            hash = ((o) this).c().hash();
        } else if (this instanceof d) {
            hash = ((d) this).c().hash();
        } else if (this instanceof i) {
            hash = ((i) this).c().hash();
        } else if (this instanceof n) {
            hash = ((n) this).c().hash();
        } else if (this instanceof p) {
            hash = ((p) this).c().hash();
        } else if (this instanceof j) {
            hash = ((j) this).c().hash();
        } else if (this instanceof l) {
            hash = ((l) this).c().hash();
        } else {
            if (!(this instanceof s)) {
                throw new W1.m();
            }
            hash = ((s) this).c().hash();
        }
        int i4 = hashCode + hash;
        this.f5423b = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        int propertiesHash;
        Integer num = this.f5422a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(getClass()).hashCode();
        if (this instanceof h) {
            propertiesHash = ((h) this).c().propertiesHash();
        } else if (this instanceof f) {
            propertiesHash = ((f) this).c().propertiesHash();
        } else if (this instanceof r) {
            propertiesHash = ((r) this).c().propertiesHash();
        } else if (this instanceof m) {
            propertiesHash = ((m) this).c().propertiesHash();
        } else if (this instanceof c) {
            propertiesHash = ((c) this).c().propertiesHash();
        } else if (this instanceof g) {
            propertiesHash = ((g) this).c().propertiesHash();
        } else if (this instanceof e) {
            propertiesHash = ((e) this).c().propertiesHash();
        } else if (this instanceof k) {
            propertiesHash = ((k) this).c().propertiesHash();
        } else if (this instanceof q) {
            propertiesHash = ((q) this).c().propertiesHash();
        } else if (this instanceof o) {
            propertiesHash = ((o) this).c().propertiesHash();
        } else if (this instanceof d) {
            propertiesHash = ((d) this).c().propertiesHash();
        } else if (this instanceof i) {
            propertiesHash = ((i) this).c().propertiesHash();
        } else if (this instanceof n) {
            propertiesHash = ((n) this).c().propertiesHash();
        } else if (this instanceof p) {
            propertiesHash = ((p) this).c().propertiesHash();
        } else if (this instanceof j) {
            propertiesHash = ((j) this).c().propertiesHash();
        } else if (this instanceof l) {
            propertiesHash = ((l) this).c().propertiesHash();
        } else {
            if (!(this instanceof s)) {
                throw new W1.m();
            }
            propertiesHash = ((s) this).c().propertiesHash();
        }
        int i4 = hashCode + propertiesHash;
        this.f5422a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C1025r8) BuiltInParserKt.getBuiltInParserComponent().J4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private Z() {
    }
}
