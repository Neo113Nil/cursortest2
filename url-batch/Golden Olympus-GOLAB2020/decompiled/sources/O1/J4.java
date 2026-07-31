package O1;

import O1.K4;
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
public final class J4 implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f3314d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Expression f3315e = Expression.Companion.constant(EnumC0779dc.DP);

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f3316f = a.f3320i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f3317a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f3318b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f3319c;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3320i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J4 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return J4.f3314d.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final J4 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((K4.c) BuiltInParserKt.getBuiltInParserComponent().J2().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public J4(Expression unit, Expression value) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f3317a = unit;
        this.f3318b = value;
    }

    public final boolean a(J4 j4, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return j4 != null && this.f3317a.evaluate(resolver) == j4.f3317a.evaluate(otherResolver) && ((Number) this.f3318b.evaluate(resolver)).doubleValue() == ((Number) j4.f3318b.evaluate(otherResolver)).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f3319c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(J4.class).hashCode() + this.f3317a.hashCode() + this.f3318b.hashCode();
        this.f3319c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((K4.c) BuiltInParserKt.getBuiltInParserComponent().J2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
