package O1;

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
public final class V1 implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f5008d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f5009e = a.f5013i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f5010a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f5011b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f5012c;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5013i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V1 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return V1.f5008d.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final V1 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((W1) BuiltInParserKt.getBuiltInParserComponent().S0().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public V1(Expression id, Expression expression) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f5010a = id;
        this.f5011b = expression;
    }

    public final boolean a(V1 v12, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (v12 != null && Intrinsics.areEqual(this.f5010a.evaluate(resolver), v12.f5010a.evaluate(otherResolver))) {
            Expression expression = this.f5011b;
            Boolean bool = expression != null ? (Boolean) expression.evaluate(resolver) : null;
            Expression expression2 = v12.f5011b;
            if (Intrinsics.areEqual(bool, expression2 != null ? (Boolean) expression2.evaluate(otherResolver) : null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f5012c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(V1.class).hashCode() + this.f5010a.hashCode();
        Expression expression = this.f5011b;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        this.f5012c = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((W1) BuiltInParserKt.getBuiltInParserComponent().S0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
