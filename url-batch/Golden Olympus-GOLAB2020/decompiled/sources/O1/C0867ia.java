package O1;

import O1.AbstractC0884ja;
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

/* renamed from: O1.ia, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0867ia implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f6479d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Expression f6480e = Expression.Companion.constant(EnumC0779dc.DP);

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f6481f = a.f6485i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f6482a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f6483b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f6484c;

    /* renamed from: O1.ia$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6485i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0867ia invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0867ia.f6479d.a(env, it);
        }
    }

    /* renamed from: O1.ia$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0867ia a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0884ja.c) BuiltInParserKt.getBuiltInParserComponent().N5().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0867ia(Expression unit, Expression expression) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f6482a = unit;
        this.f6483b = expression;
    }

    public final boolean a(C0867ia c0867ia, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0867ia != null && this.f6482a.evaluate(resolver) == c0867ia.f6482a.evaluate(otherResolver)) {
            Expression expression = this.f6483b;
            Long l4 = expression != null ? (Long) expression.evaluate(resolver) : null;
            Expression expression2 = c0867ia.f6483b;
            if (Intrinsics.areEqual(l4, expression2 != null ? (Long) expression2.evaluate(otherResolver) : null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6484c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0867ia.class).hashCode() + this.f6482a.hashCode();
        Expression expression = this.f6483b;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        this.f6484c = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0884ja.c) BuiltInParserKt.getBuiltInParserComponent().N5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
