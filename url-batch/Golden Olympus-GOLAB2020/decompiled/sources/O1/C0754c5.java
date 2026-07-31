package O1;

import O1.AbstractC0879j5;
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

/* renamed from: O1.c5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0754c5 implements JSONSerializable, Hashable {

    /* renamed from: i, reason: collision with root package name */
    public static final b f5843i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    private static final Expression f5844j;

    /* renamed from: k, reason: collision with root package name */
    private static final Expression f5845k;

    /* renamed from: l, reason: collision with root package name */
    private static final Expression f5846l;

    /* renamed from: m, reason: collision with root package name */
    private static final Expression f5847m;

    /* renamed from: n, reason: collision with root package name */
    private static final Expression f5848n;

    /* renamed from: o, reason: collision with root package name */
    private static final Function2 f5849o;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f5850a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f5851b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f5852c;

    /* renamed from: d, reason: collision with root package name */
    public final Expression f5853d;

    /* renamed from: e, reason: collision with root package name */
    public final Expression f5854e;

    /* renamed from: f, reason: collision with root package name */
    public final Expression f5855f;

    /* renamed from: g, reason: collision with root package name */
    public final Expression f5856g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f5857h;

    /* renamed from: O1.c5$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5858i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0754c5 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0754c5.f5843i.a(env, it);
        }
    }

    /* renamed from: O1.c5$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0754c5 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0879j5.c) BuiltInParserKt.getBuiltInParserComponent().V2().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f5844j = companion.constant(0L);
        f5845k = companion.constant(0L);
        f5846l = companion.constant(0L);
        f5847m = companion.constant(0L);
        f5848n = companion.constant(EnumC0779dc.DP);
        f5849o = a.f5858i;
    }

    public C0754c5(Expression bottom, Expression expression, Expression left, Expression right, Expression expression2, Expression top, Expression unit) {
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f5850a = bottom;
        this.f5851b = expression;
        this.f5852c = left;
        this.f5853d = right;
        this.f5854e = expression2;
        this.f5855f = top;
        this.f5856g = unit;
    }

    public final boolean a(C0754c5 c0754c5, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0754c5 != null && ((Number) this.f5850a.evaluate(resolver)).longValue() == ((Number) c0754c5.f5850a.evaluate(otherResolver)).longValue()) {
            Expression expression = this.f5851b;
            Long l4 = expression != null ? (Long) expression.evaluate(resolver) : null;
            Expression expression2 = c0754c5.f5851b;
            if (Intrinsics.areEqual(l4, expression2 != null ? (Long) expression2.evaluate(otherResolver) : null) && ((Number) this.f5852c.evaluate(resolver)).longValue() == ((Number) c0754c5.f5852c.evaluate(otherResolver)).longValue() && ((Number) this.f5853d.evaluate(resolver)).longValue() == ((Number) c0754c5.f5853d.evaluate(otherResolver)).longValue()) {
                Expression expression3 = this.f5854e;
                Long l5 = expression3 != null ? (Long) expression3.evaluate(resolver) : null;
                Expression expression4 = c0754c5.f5854e;
                if (Intrinsics.areEqual(l5, expression4 != null ? (Long) expression4.evaluate(otherResolver) : null) && ((Number) this.f5855f.evaluate(resolver)).longValue() == ((Number) c0754c5.f5855f.evaluate(otherResolver)).longValue() && this.f5856g.evaluate(resolver) == c0754c5.f5856g.evaluate(otherResolver)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f5857h;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0754c5.class).hashCode() + this.f5850a.hashCode();
        Expression expression = this.f5851b;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + this.f5852c.hashCode() + this.f5853d.hashCode();
        Expression expression2 = this.f5854e;
        int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0) + this.f5855f.hashCode() + this.f5856g.hashCode();
        this.f5857h = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0879j5.c) BuiltInParserKt.getBuiltInParserComponent().V2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0754c5(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? f5844j : expression, (i4 & 2) != 0 ? null : expression2, (i4 & 4) != 0 ? f5845k : expression3, (i4 & 8) != 0 ? f5846l : expression4, (i4 & 16) != 0 ? null : expression5, (i4 & 32) != 0 ? f5847m : expression6, (i4 & 64) != 0 ? f5848n : expression7);
    }
}
