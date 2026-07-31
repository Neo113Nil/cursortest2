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
public final class L1 implements JSONSerializable, Hashable {

    /* renamed from: e, reason: collision with root package name */
    public static final b f3652e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f3653f = a.f3658i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f3654a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f3655b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1086uf f3656c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f3657d;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3658i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L1 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return L1.f3652e.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final L1 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((M1) BuiltInParserKt.getBuiltInParserComponent().M0().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public L1(Expression lifetime, Expression name, AbstractC1086uf value) {
        Intrinsics.checkNotNullParameter(lifetime, "lifetime");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f3654a = lifetime;
        this.f3655b = name;
        this.f3656c = value;
    }

    public final boolean a(L1 l12, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return l12 != null && ((Number) this.f3654a.evaluate(resolver)).longValue() == ((Number) l12.f3654a.evaluate(otherResolver)).longValue() && Intrinsics.areEqual(this.f3655b.evaluate(resolver), l12.f3655b.evaluate(otherResolver)) && this.f3656c.a(l12.f3656c, resolver, otherResolver);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f3657d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(L1.class).hashCode() + this.f3654a.hashCode() + this.f3655b.hashCode() + this.f3656c.hash();
        this.f3657d = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((M1) BuiltInParserKt.getBuiltInParserComponent().M0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
