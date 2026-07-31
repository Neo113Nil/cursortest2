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

/* renamed from: O1.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1089v0 implements JSONSerializable, Hashable {

    /* renamed from: e, reason: collision with root package name */
    public static final b f8185e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f8186f = a.f8191i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f8187a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1086uf f8188b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f8189c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f8190d;

    /* renamed from: O1.v0$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8191i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1089v0 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1089v0.f8185e.a(env, it);
        }
    }

    /* renamed from: O1.v0$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1089v0 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C1107w0) BuiltInParserKt.getBuiltInParserComponent().Q().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C1089v0(Expression expression, AbstractC1086uf value, Expression variableName) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        this.f8187a = expression;
        this.f8188b = value;
        this.f8189c = variableName;
    }

    public final boolean a(C1089v0 c1089v0, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c1089v0 == null) {
            return false;
        }
        Expression expression = this.f8187a;
        Long l4 = expression != null ? (Long) expression.evaluate(resolver) : null;
        Expression expression2 = c1089v0.f8187a;
        return Intrinsics.areEqual(l4, expression2 != null ? (Long) expression2.evaluate(otherResolver) : null) && this.f8188b.a(c1089v0.f8188b, resolver, otherResolver) && Intrinsics.areEqual(this.f8189c.evaluate(resolver), c1089v0.f8189c.evaluate(otherResolver));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f8190d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1089v0.class).hashCode();
        Expression expression = this.f8187a;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + this.f8188b.hash() + this.f8189c.hashCode();
        this.f8190d = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C1107w0) BuiltInParserKt.getBuiltInParserComponent().Q().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
