package O1;

import O1.Ia;
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
public final class Ha implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f2986d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Expression f2987e = Expression.Companion.constant(EnumC0779dc.DP);

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f2988f = a.f2992i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f2989a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f2990b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f2991c;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2992i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ha invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Ha.f2986d.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ha a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Ia.c) BuiltInParserKt.getBuiltInParserComponent().f6().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public Ha(Expression unit, Expression value) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f2989a = unit;
        this.f2990b = value;
    }

    public final boolean a(Ha ha, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return ha != null && this.f2989a.evaluate(resolver) == ha.f2989a.evaluate(otherResolver) && ((Number) this.f2990b.evaluate(resolver)).longValue() == ((Number) ha.f2990b.evaluate(otherResolver)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f2991c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Ha.class).hashCode() + this.f2989a.hashCode() + this.f2990b.hashCode();
        this.f2991c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Ia.c) BuiltInParserKt.getBuiltInParserComponent().f6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
