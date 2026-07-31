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

/* renamed from: O1.n2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0948n2 implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final h f7118b = new h(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f7119c = g.f7127i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f7120a;

    /* renamed from: O1.n2$a */
    public static final class a extends AbstractC0948n2 {

        /* renamed from: d, reason: collision with root package name */
        private final C0910l0 f7121d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0910l0 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7121d = value;
        }

        public final C0910l0 c() {
            return this.f7121d;
        }
    }

    /* renamed from: O1.n2$b */
    public static final class b extends AbstractC0948n2 {

        /* renamed from: d, reason: collision with root package name */
        private final C1000q0 f7122d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1000q0 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7122d = value;
        }

        public final C1000q0 c() {
            return this.f7122d;
        }
    }

    /* renamed from: O1.n2$c */
    public static final class c extends AbstractC0948n2 {

        /* renamed from: d, reason: collision with root package name */
        private final C1089v0 f7123d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1089v0 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7123d = value;
        }

        public final C1089v0 c() {
            return this.f7123d;
        }
    }

    /* renamed from: O1.n2$d */
    public static final class d extends AbstractC0948n2 {

        /* renamed from: d, reason: collision with root package name */
        private final A0 f7124d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(A0 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7124d = value;
        }

        public final A0 c() {
            return this.f7124d;
        }
    }

    /* renamed from: O1.n2$e */
    public static final class e extends AbstractC0948n2 {

        /* renamed from: d, reason: collision with root package name */
        private final F0 f7125d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(F0 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7125d = value;
        }

        public final F0 c() {
            return this.f7125d;
        }
    }

    /* renamed from: O1.n2$f */
    public static final class f extends AbstractC0948n2 {

        /* renamed from: d, reason: collision with root package name */
        private final K0 f7126d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(K0 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7126d = value;
        }

        public final K0 c() {
            return this.f7126d;
        }
    }

    /* renamed from: O1.n2$g */
    static final class g extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final g f7127i = new g();

        g() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC0948n2 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC0948n2.f7118b.a(env, it);
        }
    }

    /* renamed from: O1.n2$h */
    public static final class h {
        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC0948n2 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0966o2) BuiltInParserKt.getBuiltInParserComponent().h1().getValue()).deserialize(env, json);
        }

        private h() {
        }
    }

    /* renamed from: O1.n2$i */
    public static final class i extends AbstractC0948n2 {

        /* renamed from: d, reason: collision with root package name */
        private final P0 f7128d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(P0 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7128d = value;
        }

        public final P0 c() {
            return this.f7128d;
        }
    }

    /* renamed from: O1.n2$j */
    public static final class j extends AbstractC0948n2 {

        /* renamed from: d, reason: collision with root package name */
        private final Z0 f7129d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Z0 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7129d = value;
        }

        public final Z0 c() {
            return this.f7129d;
        }
    }

    /* renamed from: O1.n2$k */
    public static final class k extends AbstractC0948n2 {

        /* renamed from: d, reason: collision with root package name */
        private final C0786e1 f7130d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C0786e1 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7130d = value;
        }

        public final C0786e1 c() {
            return this.f7130d;
        }
    }

    /* renamed from: O1.n2$l */
    public static final class l extends AbstractC0948n2 {

        /* renamed from: d, reason: collision with root package name */
        private final C0875j1 f7131d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(C0875j1 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7131d = value;
        }

        public final C0875j1 c() {
            return this.f7131d;
        }
    }

    /* renamed from: O1.n2$m */
    public static final class m extends AbstractC0948n2 {

        /* renamed from: d, reason: collision with root package name */
        private final C0965o1 f7132d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C0965o1 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7132d = value;
        }

        public final C0965o1 c() {
            return this.f7132d;
        }
    }

    /* renamed from: O1.n2$n */
    public static final class n extends AbstractC0948n2 {

        /* renamed from: d, reason: collision with root package name */
        private final C1126x1 f7133d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(C1126x1 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7133d = value;
        }

        public final C1126x1 c() {
            return this.f7133d;
        }
    }

    /* renamed from: O1.n2$o */
    public static final class o extends AbstractC0948n2 {

        /* renamed from: d, reason: collision with root package name */
        private final F1 f7134d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(F1 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7134d = value;
        }

        public final F1 c() {
            return this.f7134d;
        }
    }

    /* renamed from: O1.n2$p */
    public static final class p extends AbstractC0948n2 {

        /* renamed from: d, reason: collision with root package name */
        private final I1 f7135d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(I1 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7135d = value;
        }

        public final I1 c() {
            return this.f7135d;
        }
    }

    /* renamed from: O1.n2$q */
    public static final class q extends AbstractC0948n2 {

        /* renamed from: d, reason: collision with root package name */
        private final L1 f7136d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(L1 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7136d = value;
        }

        public final L1 c() {
            return this.f7136d;
        }
    }

    /* renamed from: O1.n2$r */
    public static final class r extends AbstractC0948n2 {

        /* renamed from: d, reason: collision with root package name */
        private final Q1 f7137d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Q1 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7137d = value;
        }

        public final Q1 c() {
            return this.f7137d;
        }
    }

    /* renamed from: O1.n2$s */
    public static final class s extends AbstractC0948n2 {

        /* renamed from: d, reason: collision with root package name */
        private final V1 f7138d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(V1 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7138d = value;
        }

        public final V1 c() {
            return this.f7138d;
        }
    }

    /* renamed from: O1.n2$t */
    public static final class t extends AbstractC0948n2 {

        /* renamed from: d, reason: collision with root package name */
        private final C0715a2 f7139d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(C0715a2 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7139d = value;
        }

        public final C0715a2 c() {
            return this.f7139d;
        }
    }

    /* renamed from: O1.n2$u */
    public static final class u extends AbstractC0948n2 {

        /* renamed from: d, reason: collision with root package name */
        private final C0894k2 f7140d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(C0894k2 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7140d = value;
        }

        public final C0894k2 c() {
            return this.f7140d;
        }
    }

    /* renamed from: O1.n2$v */
    public static final class v extends AbstractC0948n2 {

        /* renamed from: d, reason: collision with root package name */
        private final C1037s2 f7141d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(C1037s2 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7141d = value;
        }

        public final C1037s2 c() {
            return this.f7141d;
        }
    }

    public /* synthetic */ AbstractC0948n2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(AbstractC0948n2 abstractC0948n2, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (abstractC0948n2 == null) {
            return false;
        }
        if (this instanceof a) {
            C0910l0 c4 = ((a) this).c();
            Object b4 = abstractC0948n2.b();
            return c4.a(b4 instanceof C0910l0 ? (C0910l0) b4 : null, resolver, otherResolver);
        }
        if (this instanceof b) {
            C1000q0 c5 = ((b) this).c();
            Object b5 = abstractC0948n2.b();
            return c5.a(b5 instanceof C1000q0 ? (C1000q0) b5 : null, resolver, otherResolver);
        }
        if (this instanceof c) {
            C1089v0 c6 = ((c) this).c();
            Object b6 = abstractC0948n2.b();
            return c6.a(b6 instanceof C1089v0 ? (C1089v0) b6 : null, resolver, otherResolver);
        }
        if (this instanceof d) {
            A0 c7 = ((d) this).c();
            Object b7 = abstractC0948n2.b();
            return c7.a(b7 instanceof A0 ? (A0) b7 : null, resolver, otherResolver);
        }
        if (this instanceof e) {
            F0 c8 = ((e) this).c();
            Object b8 = abstractC0948n2.b();
            return c8.a(b8 instanceof F0 ? (F0) b8 : null, resolver, otherResolver);
        }
        if (this instanceof f) {
            K0 c9 = ((f) this).c();
            Object b9 = abstractC0948n2.b();
            return c9.a(b9 instanceof K0 ? (K0) b9 : null, resolver, otherResolver);
        }
        if (this instanceof i) {
            P0 c10 = ((i) this).c();
            Object b10 = abstractC0948n2.b();
            return c10.a(b10 instanceof P0 ? (P0) b10 : null, resolver, otherResolver);
        }
        if (this instanceof j) {
            Z0 c11 = ((j) this).c();
            Object b11 = abstractC0948n2.b();
            return c11.a(b11 instanceof Z0 ? (Z0) b11 : null, resolver, otherResolver);
        }
        if (this instanceof k) {
            C0786e1 c12 = ((k) this).c();
            Object b12 = abstractC0948n2.b();
            return c12.a(b12 instanceof C0786e1 ? (C0786e1) b12 : null, resolver, otherResolver);
        }
        if (this instanceof l) {
            C0875j1 c13 = ((l) this).c();
            Object b13 = abstractC0948n2.b();
            return c13.a(b13 instanceof C0875j1 ? (C0875j1) b13 : null, resolver, otherResolver);
        }
        if (this instanceof m) {
            C0965o1 c14 = ((m) this).c();
            Object b14 = abstractC0948n2.b();
            return c14.a(b14 instanceof C0965o1 ? (C0965o1) b14 : null, resolver, otherResolver);
        }
        if (this instanceof n) {
            C1126x1 c15 = ((n) this).c();
            Object b15 = abstractC0948n2.b();
            return c15.a(b15 instanceof C1126x1 ? (C1126x1) b15 : null, resolver, otherResolver);
        }
        if (this instanceof o) {
            F1 c16 = ((o) this).c();
            Object b16 = abstractC0948n2.b();
            return c16.a(b16 instanceof F1 ? (F1) b16 : null, resolver, otherResolver);
        }
        if (this instanceof p) {
            I1 c17 = ((p) this).c();
            Object b17 = abstractC0948n2.b();
            return c17.a(b17 instanceof I1 ? (I1) b17 : null, resolver, otherResolver);
        }
        if (this instanceof q) {
            L1 c18 = ((q) this).c();
            Object b18 = abstractC0948n2.b();
            return c18.a(b18 instanceof L1 ? (L1) b18 : null, resolver, otherResolver);
        }
        if (this instanceof r) {
            Q1 c19 = ((r) this).c();
            Object b19 = abstractC0948n2.b();
            return c19.a(b19 instanceof Q1 ? (Q1) b19 : null, resolver, otherResolver);
        }
        if (this instanceof s) {
            V1 c20 = ((s) this).c();
            Object b20 = abstractC0948n2.b();
            return c20.a(b20 instanceof V1 ? (V1) b20 : null, resolver, otherResolver);
        }
        if (this instanceof t) {
            C0715a2 c21 = ((t) this).c();
            Object b21 = abstractC0948n2.b();
            return c21.a(b21 instanceof C0715a2 ? (C0715a2) b21 : null, resolver, otherResolver);
        }
        if (this instanceof u) {
            C0894k2 c22 = ((u) this).c();
            Object b22 = abstractC0948n2.b();
            return c22.a(b22 instanceof C0894k2 ? (C0894k2) b22 : null, resolver, otherResolver);
        }
        if (!(this instanceof v)) {
            throw new W1.m();
        }
        C1037s2 c23 = ((v) this).c();
        Object b23 = abstractC0948n2.b();
        return c23.a(b23 instanceof C1037s2 ? (C1037s2) b23 : null, resolver, otherResolver);
    }

    public final Object b() {
        if (this instanceof a) {
            return ((a) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof i) {
            return ((i) this).c();
        }
        if (this instanceof j) {
            return ((j) this).c();
        }
        if (this instanceof k) {
            return ((k) this).c();
        }
        if (this instanceof l) {
            return ((l) this).c();
        }
        if (this instanceof m) {
            return ((m) this).c();
        }
        if (this instanceof n) {
            return ((n) this).c();
        }
        if (this instanceof o) {
            return ((o) this).c();
        }
        if (this instanceof p) {
            return ((p) this).c();
        }
        if (this instanceof q) {
            return ((q) this).c();
        }
        if (this instanceof r) {
            return ((r) this).c();
        }
        if (this instanceof s) {
            return ((s) this).c();
        }
        if (this instanceof t) {
            return ((t) this).c();
        }
        if (this instanceof u) {
            return ((u) this).c();
        }
        if (this instanceof v) {
            return ((v) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this.f7120a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(getClass()).hashCode();
        if (this instanceof a) {
            hash = ((a) this).c().hash();
        } else if (this instanceof b) {
            hash = ((b) this).c().hash();
        } else if (this instanceof c) {
            hash = ((c) this).c().hash();
        } else if (this instanceof d) {
            hash = ((d) this).c().hash();
        } else if (this instanceof e) {
            hash = ((e) this).c().hash();
        } else if (this instanceof f) {
            hash = ((f) this).c().hash();
        } else if (this instanceof i) {
            hash = ((i) this).c().hash();
        } else if (this instanceof j) {
            hash = ((j) this).c().hash();
        } else if (this instanceof k) {
            hash = ((k) this).c().hash();
        } else if (this instanceof l) {
            hash = ((l) this).c().hash();
        } else if (this instanceof m) {
            hash = ((m) this).c().hash();
        } else if (this instanceof n) {
            hash = ((n) this).c().hash();
        } else if (this instanceof o) {
            hash = ((o) this).c().hash();
        } else if (this instanceof p) {
            hash = ((p) this).c().hash();
        } else if (this instanceof q) {
            hash = ((q) this).c().hash();
        } else if (this instanceof r) {
            hash = ((r) this).c().hash();
        } else if (this instanceof s) {
            hash = ((s) this).c().hash();
        } else if (this instanceof t) {
            hash = ((t) this).c().hash();
        } else if (this instanceof u) {
            hash = ((u) this).c().hash();
        } else {
            if (!(this instanceof v)) {
                throw new W1.m();
            }
            hash = ((v) this).c().hash();
        }
        int i4 = hashCode + hash;
        this.f7120a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0966o2) BuiltInParserKt.getBuiltInParserComponent().h1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC0948n2() {
    }
}
