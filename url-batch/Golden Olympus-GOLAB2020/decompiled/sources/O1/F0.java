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
public final class F0 implements JSONSerializable, Hashable {

    /* renamed from: e, reason: collision with root package name */
    public static final b f2701e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f2702f = a.f2707i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f2703a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1086uf f2704b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f2705c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f2706d;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2707i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F0 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return F0.f2701e.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final F0 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((G0) BuiltInParserKt.getBuiltInParserComponent().W().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public F0(Expression index, AbstractC1086uf value, Expression variableName) {
        Intrinsics.checkNotNullParameter(index, "index");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        this.f2703a = index;
        this.f2704b = value;
        this.f2705c = variableName;
    }

    public final boolean a(F0 f02, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return f02 != null && ((Number) this.f2703a.evaluate(resolver)).longValue() == ((Number) f02.f2703a.evaluate(otherResolver)).longValue() && this.f2704b.a(f02.f2704b, resolver, otherResolver) && Intrinsics.areEqual(this.f2705c.evaluate(resolver), f02.f2705c.evaluate(otherResolver));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f2706d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(F0.class).hashCode() + this.f2703a.hashCode() + this.f2704b.hash() + this.f2705c.hashCode();
        this.f2706d = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((G0) BuiltInParserKt.getBuiltInParserComponent().W().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
