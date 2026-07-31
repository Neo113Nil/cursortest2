package O1;

import O1.G1;
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
public final class F1 implements JSONSerializable, Hashable {

    /* renamed from: e, reason: collision with root package name */
    public static final b f2708e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Expression f2709f = Expression.Companion.constant(Boolean.TRUE);

    /* renamed from: g, reason: collision with root package name */
    private static final Function2 f2710g = a.f2715i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f2711a;

    /* renamed from: b, reason: collision with root package name */
    public final A1 f2712b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f2713c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f2714d;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2715i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F1 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return F1.f2708e.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final F1 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((G1.b) BuiltInParserKt.getBuiltInParserComponent().G0().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public F1(Expression animated, A1 destination, Expression id) {
        Intrinsics.checkNotNullParameter(animated, "animated");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(id, "id");
        this.f2711a = animated;
        this.f2712b = destination;
        this.f2713c = id;
    }

    public final boolean a(F1 f12, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return f12 != null && ((Boolean) this.f2711a.evaluate(resolver)).booleanValue() == ((Boolean) f12.f2711a.evaluate(otherResolver)).booleanValue() && this.f2712b.a(f12.f2712b, resolver, otherResolver) && Intrinsics.areEqual(this.f2713c.evaluate(resolver), f12.f2713c.evaluate(otherResolver));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f2714d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(F1.class).hashCode() + this.f2711a.hashCode() + this.f2712b.hash() + this.f2713c.hashCode();
        this.f2714d = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((G1.b) BuiltInParserKt.getBuiltInParserComponent().G0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
