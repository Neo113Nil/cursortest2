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

/* renamed from: O1.n4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0950n4 implements JSONSerializable, Hashable, U7 {

    /* renamed from: d, reason: collision with root package name */
    public static final b f7142d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f7143e = a.f7147i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f7144a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7145b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f7146c;

    /* renamed from: O1.n4$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7147i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0950n4 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0950n4.f7142d.a(env, it);
        }
    }

    /* renamed from: O1.n4$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0950n4 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0968o4) BuiltInParserKt.getBuiltInParserComponent().v2().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0950n4(Expression expression, String rawTextVariable) {
        Intrinsics.checkNotNullParameter(rawTextVariable, "rawTextVariable");
        this.f7144a = expression;
        this.f7145b = rawTextVariable;
    }

    @Override // O1.U7
    public String a() {
        return this.f7145b;
    }

    public final boolean b(C0950n4 c0950n4, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0950n4 == null) {
            return false;
        }
        Expression expression = this.f7144a;
        String str = expression != null ? (String) expression.evaluate(resolver) : null;
        Expression expression2 = c0950n4.f7144a;
        return Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(otherResolver) : null) && Intrinsics.areEqual(a(), c0950n4.a());
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f7146c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0950n4.class).hashCode();
        Expression expression = this.f7144a;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + a().hashCode();
        this.f7146c = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0968o4) BuiltInParserKt.getBuiltInParserComponent().v2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
