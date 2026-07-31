package O1;

import O1.AbstractC0825g4;
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

/* renamed from: O1.b4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0735b4 implements JSONSerializable, Hashable {

    /* renamed from: f, reason: collision with root package name */
    public static final b f5775f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Function2 f5776g = a.f5782i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f5777a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f5778b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f5779c;

    /* renamed from: d, reason: collision with root package name */
    public final Expression f5780d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f5781e;

    /* renamed from: O1.b4$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5782i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0735b4 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0735b4.f5775f.a(env, it);
        }
    }

    /* renamed from: O1.b4$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0735b4 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0825g4.b) BuiltInParserKt.getBuiltInParserComponent().p2().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0735b4(Expression expression, Expression expression2, Expression expression3, Expression expression4) {
        this.f5777a = expression;
        this.f5778b = expression2;
        this.f5779c = expression3;
        this.f5780d = expression4;
    }

    public final boolean a(C0735b4 c0735b4, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0735b4 == null) {
            return false;
        }
        Expression expression = this.f5777a;
        Long l4 = expression != null ? (Long) expression.evaluate(resolver) : null;
        Expression expression2 = c0735b4.f5777a;
        if (Intrinsics.areEqual(l4, expression2 != null ? (Long) expression2.evaluate(otherResolver) : null)) {
            Expression expression3 = this.f5778b;
            Long l5 = expression3 != null ? (Long) expression3.evaluate(resolver) : null;
            Expression expression4 = c0735b4.f5778b;
            if (Intrinsics.areEqual(l5, expression4 != null ? (Long) expression4.evaluate(otherResolver) : null)) {
                Expression expression5 = this.f5779c;
                Long l6 = expression5 != null ? (Long) expression5.evaluate(resolver) : null;
                Expression expression6 = c0735b4.f5779c;
                if (Intrinsics.areEqual(l6, expression6 != null ? (Long) expression6.evaluate(otherResolver) : null)) {
                    Expression expression7 = this.f5780d;
                    Long l7 = expression7 != null ? (Long) expression7.evaluate(resolver) : null;
                    Expression expression8 = c0735b4.f5780d;
                    if (Intrinsics.areEqual(l7, expression8 != null ? (Long) expression8.evaluate(otherResolver) : null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f5781e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0735b4.class).hashCode();
        Expression expression = this.f5777a;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.f5778b;
        int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        Expression expression3 = this.f5779c;
        int hashCode4 = hashCode3 + (expression3 != null ? expression3.hashCode() : 0);
        Expression expression4 = this.f5780d;
        int hashCode5 = hashCode4 + (expression4 != null ? expression4.hashCode() : 0);
        this.f5781e = Integer.valueOf(hashCode5);
        return hashCode5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0825g4.b) BuiltInParserKt.getBuiltInParserComponent().p2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
