package O1;

import O1.AbstractC0801eg;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.cg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0765cg implements JSONSerializable, Hashable {

    /* renamed from: e, reason: collision with root package name */
    public static final b f5968e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f5969f = a.f5974i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f5970a;

    /* renamed from: b, reason: collision with root package name */
    public final c f5971b;

    /* renamed from: c, reason: collision with root package name */
    public final c f5972c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f5973d;

    /* renamed from: O1.cg$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5974i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0765cg invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0765cg.f5968e.a(env, it);
        }
    }

    /* renamed from: O1.cg$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0765cg a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0819fg) BuiltInParserKt.getBuiltInParserComponent().w9().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.cg$c */
    public static final class c implements JSONSerializable, Hashable {

        /* renamed from: d, reason: collision with root package name */
        public static final b f5975d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        private static final Expression f5976e = Expression.Companion.constant(EnumC0779dc.DP);

        /* renamed from: f, reason: collision with root package name */
        private static final Function2 f5977f = a.f5981i;

        /* renamed from: a, reason: collision with root package name */
        public final Expression f5978a;

        /* renamed from: b, reason: collision with root package name */
        public final Expression f5979b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f5980c;

        /* renamed from: O1.cg$c$a */
        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f5981i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return c.f5975d.a(env, it);
            }
        }

        /* renamed from: O1.cg$c$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return ((AbstractC0801eg.c) BuiltInParserKt.getBuiltInParserComponent().t9().getValue()).deserialize(env, json);
            }

            private b() {
            }
        }

        public c(Expression unit, Expression value) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5978a = unit;
            this.f5979b = value;
        }

        public final boolean a(c cVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
            return cVar != null && this.f5978a.evaluate(resolver) == cVar.f5978a.evaluate(otherResolver) && ((Number) this.f5979b.evaluate(resolver)).longValue() == ((Number) cVar.f5979b.evaluate(otherResolver)).longValue();
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f5980c;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = kotlin.jvm.internal.H.b(c.class).hashCode() + this.f5978a.hashCode() + this.f5979b.hashCode();
            this.f5980c = Integer.valueOf(hashCode);
            return hashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((AbstractC0801eg.c) BuiltInParserKt.getBuiltInParserComponent().t9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public C0765cg(Expression expression, c cVar, c cVar2) {
        this.f5970a = expression;
        this.f5971b = cVar;
        this.f5972c = cVar2;
    }

    public final boolean a(C0765cg c0765cg, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0765cg == null) {
            return false;
        }
        Expression expression = this.f5970a;
        Boolean bool = expression != null ? (Boolean) expression.evaluate(resolver) : null;
        Expression expression2 = c0765cg.f5970a;
        if (Intrinsics.areEqual(bool, expression2 != null ? (Boolean) expression2.evaluate(otherResolver) : null)) {
            c cVar = this.f5971b;
            if (cVar != null ? cVar.a(c0765cg.f5971b, resolver, otherResolver) : c0765cg.f5971b == null) {
                c cVar2 = this.f5972c;
                c cVar3 = c0765cg.f5972c;
                if (cVar2 != null ? cVar2.a(cVar3, resolver, otherResolver) : cVar3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f5973d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0765cg.class).hashCode();
        Expression expression = this.f5970a;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        c cVar = this.f5971b;
        int hash = hashCode2 + (cVar != null ? cVar.hash() : 0);
        c cVar2 = this.f5972c;
        int hash2 = hash + (cVar2 != null ? cVar2.hash() : 0);
        this.f5973d = Integer.valueOf(hash2);
        return hash2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0819fg) BuiltInParserKt.getBuiltInParserComponent().w9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0765cg(Expression expression, c cVar, c cVar2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : expression, (i4 & 2) != 0 ? null : cVar, (i4 & 4) != 0 ? null : cVar2);
    }
}
