package O1;

import O1.Ge;
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
public final class Ee implements JSONSerializable, Hashable {

    /* renamed from: g, reason: collision with root package name */
    public static final b f2626g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    private static final Expression f2627h;

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f2628i;

    /* renamed from: j, reason: collision with root package name */
    private static final Expression f2629j;

    /* renamed from: k, reason: collision with root package name */
    private static final S5 f2630k;

    /* renamed from: l, reason: collision with root package name */
    private static final Function2 f2631l;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f2632a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f2633b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f2634c;

    /* renamed from: d, reason: collision with root package name */
    public final Expression f2635d;

    /* renamed from: e, reason: collision with root package name */
    public final S5 f2636e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f2637f;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2638i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ee invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Ee.f2626g.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ee a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Ge.b) BuiltInParserKt.getBuiltInParserComponent().A8().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f2627h = companion.constant(Double.valueOf(0.8d));
        f2628i = companion.constant(Boolean.FALSE);
        f2629j = companion.constant(Boolean.TRUE);
        f2630k = new S5(null, companion.constant(1L), 1, null);
        f2631l = a.f2638i;
    }

    public Ee(Expression color, Expression density, Expression isAnimated, Expression isEnabled, S5 particleSize) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(isAnimated, "isAnimated");
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(particleSize, "particleSize");
        this.f2632a = color;
        this.f2633b = density;
        this.f2634c = isAnimated;
        this.f2635d = isEnabled;
        this.f2636e = particleSize;
    }

    public final boolean a(Ee ee, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return ee != null && ((Number) this.f2632a.evaluate(resolver)).intValue() == ((Number) ee.f2632a.evaluate(otherResolver)).intValue() && ((Number) this.f2633b.evaluate(resolver)).doubleValue() == ((Number) ee.f2633b.evaluate(otherResolver)).doubleValue() && ((Boolean) this.f2634c.evaluate(resolver)).booleanValue() == ((Boolean) ee.f2634c.evaluate(otherResolver)).booleanValue() && ((Boolean) this.f2635d.evaluate(resolver)).booleanValue() == ((Boolean) ee.f2635d.evaluate(otherResolver)).booleanValue() && this.f2636e.a(ee.f2636e, resolver, otherResolver);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f2637f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Ee.class).hashCode() + this.f2632a.hashCode() + this.f2633b.hashCode() + this.f2634c.hashCode() + this.f2635d.hashCode() + this.f2636e.hash();
        this.f2637f = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Ge.b) BuiltInParserKt.getBuiltInParserComponent().A8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
