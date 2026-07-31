package O1;

import O1.B3;
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

/* loaded from: classes2.dex */
public final class A3 implements JSONSerializable, Hashable {

    /* renamed from: e, reason: collision with root package name */
    public static final b f1299e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final S5 f1300f = new S5(null == true ? 1 : 0, Expression.Companion.constant(10L), 1, null == true ? 1 : 0);

    /* renamed from: g, reason: collision with root package name */
    private static final Function2 f1301g = a.f1306i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f1302a;

    /* renamed from: b, reason: collision with root package name */
    public final S5 f1303b;

    /* renamed from: c, reason: collision with root package name */
    public final Qc f1304c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f1305d;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f1306i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A3 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return A3.f1299e.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final A3 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((B3.b) BuiltInParserKt.getBuiltInParserComponent().U1().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public A3(Expression expression, S5 radius, Qc qc) {
        Intrinsics.checkNotNullParameter(radius, "radius");
        this.f1302a = expression;
        this.f1303b = radius;
        this.f1304c = qc;
    }

    public final boolean a(A3 a32, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (a32 == null) {
            return false;
        }
        Expression expression = this.f1302a;
        Integer num = expression != null ? (Integer) expression.evaluate(resolver) : null;
        Expression expression2 = a32.f1302a;
        if (Intrinsics.areEqual(num, expression2 != null ? (Integer) expression2.evaluate(otherResolver) : null) && this.f1303b.a(a32.f1303b, resolver, otherResolver)) {
            Qc qc = this.f1304c;
            Qc qc2 = a32.f1304c;
            if (qc != null ? qc.a(qc2, resolver, otherResolver) : qc2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f1305d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(A3.class).hashCode();
        Expression expression = this.f1302a;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + this.f1303b.hash();
        Qc qc = this.f1304c;
        int hash = hashCode2 + (qc != null ? qc.hash() : 0);
        this.f1305d = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((B3.b) BuiltInParserKt.getBuiltInParserComponent().U1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
