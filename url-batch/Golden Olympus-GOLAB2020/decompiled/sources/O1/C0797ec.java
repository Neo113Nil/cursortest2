package O1;

import O1.AbstractC0851hc;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.ec, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0797ec implements JSONSerializable, Hashable {

    /* renamed from: g, reason: collision with root package name */
    public static final b f6115g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    private static final Expression f6116h;

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f6117i;

    /* renamed from: j, reason: collision with root package name */
    private static final Expression f6118j;

    /* renamed from: k, reason: collision with root package name */
    private static final Expression f6119k;

    /* renamed from: l, reason: collision with root package name */
    private static final Function2 f6120l;

    /* renamed from: a, reason: collision with root package name */
    public final J4 f6121a;

    /* renamed from: b, reason: collision with root package name */
    private final Expression f6122b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f6123c;

    /* renamed from: d, reason: collision with root package name */
    private final Expression f6124d;

    /* renamed from: e, reason: collision with root package name */
    private final Expression f6125e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f6126f;

    /* renamed from: O1.ec$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6127i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0797ec invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0797ec.f6115g.a(env, it);
        }
    }

    /* renamed from: O1.ec$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0797ec a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0851hc.d) BuiltInParserKt.getBuiltInParserComponent().Y6().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.ec$c */
    public enum c {
        LEFT("left"),
        TOP("top"),
        RIGHT("right"),
        BOTTOM("bottom");


        /* renamed from: c, reason: collision with root package name */
        public static final C0043c f6128c = new C0043c(null);

        /* renamed from: d, reason: collision with root package name */
        public static final Function1 f6129d = b.f6138i;

        /* renamed from: e, reason: collision with root package name */
        public static final Function1 f6130e = a.f6137i;

        /* renamed from: b, reason: collision with root package name */
        private final String f6136b;

        /* renamed from: O1.ec$c$a */
        static final class a extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f6137i = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return c.f6128c.a(value);
            }
        }

        /* renamed from: O1.ec$c$b */
        static final class b extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final b f6138i = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(c value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return c.f6128c.b(value);
            }
        }

        /* renamed from: O1.ec$c$c, reason: collision with other inner class name */
        public static final class C0043c {
            public /* synthetic */ C0043c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                c cVar = c.LEFT;
                if (Intrinsics.areEqual(value, cVar.f6136b)) {
                    return cVar;
                }
                c cVar2 = c.TOP;
                if (Intrinsics.areEqual(value, cVar2.f6136b)) {
                    return cVar2;
                }
                c cVar3 = c.RIGHT;
                if (Intrinsics.areEqual(value, cVar3.f6136b)) {
                    return cVar3;
                }
                c cVar4 = c.BOTTOM;
                if (Intrinsics.areEqual(value, cVar4.f6136b)) {
                    return cVar4;
                }
                return null;
            }

            public final String b(c obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.f6136b;
            }

            private C0043c() {
            }
        }

        c(String str) {
            this.f6136b = str;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f6116h = companion.constant(200L);
        f6117i = companion.constant(c.BOTTOM);
        f6118j = companion.constant(EnumC1163z2.EASE_IN_OUT);
        f6119k = companion.constant(0L);
        f6120l = a.f6127i;
    }

    public C0797ec(J4 j4, Expression duration, Expression edge, Expression interpolator, Expression startDelay) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(edge, "edge");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(startDelay, "startDelay");
        this.f6121a = j4;
        this.f6122b = duration;
        this.f6123c = edge;
        this.f6124d = interpolator;
        this.f6125e = startDelay;
    }

    public final boolean a(C0797ec c0797ec, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0797ec == null) {
            return false;
        }
        J4 j4 = this.f6121a;
        return (j4 != null ? j4.a(c0797ec.f6121a, resolver, otherResolver) : c0797ec.f6121a == null) && ((Number) b().evaluate(resolver)).longValue() == ((Number) c0797ec.b().evaluate(otherResolver)).longValue() && this.f6123c.evaluate(resolver) == c0797ec.f6123c.evaluate(otherResolver) && c().evaluate(resolver) == c0797ec.c().evaluate(otherResolver) && ((Number) d().evaluate(resolver)).longValue() == ((Number) c0797ec.d().evaluate(otherResolver)).longValue();
    }

    public Expression b() {
        return this.f6122b;
    }

    public Expression c() {
        return this.f6124d;
    }

    public Expression d() {
        return this.f6125e;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6126f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0797ec.class).hashCode();
        J4 j4 = this.f6121a;
        int hash = hashCode + (j4 != null ? j4.hash() : 0) + b().hashCode() + this.f6123c.hashCode() + c().hashCode() + d().hashCode();
        this.f6126f = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0851hc.d) BuiltInParserKt.getBuiltInParserComponent().Y6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
