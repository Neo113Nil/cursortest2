package O1;

import O1.U5;
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
public final class S5 implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f4711d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Expression f4712e = Expression.Companion.constant(EnumC0779dc.DP);

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f4713f = a.f4717i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f4714a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f4715b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f4716c;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4717i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S5 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return S5.f4711d.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final S5 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((U5.c) BuiltInParserKt.getBuiltInParserComponent().t3().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public S5(Expression unit, Expression value) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f4714a = unit;
        this.f4715b = value;
    }

    public final boolean a(S5 s5, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return s5 != null && this.f4714a.evaluate(resolver) == s5.f4714a.evaluate(otherResolver) && ((Number) this.f4715b.evaluate(resolver)).longValue() == ((Number) s5.f4715b.evaluate(otherResolver)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f4716c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(S5.class).hashCode() + this.f4714a.hashCode() + this.f4715b.hashCode();
        this.f4716c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((U5.c) BuiltInParserKt.getBuiltInParserComponent().t3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ S5(Expression expression, Expression expression2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? f4712e : expression, expression2);
    }
}
