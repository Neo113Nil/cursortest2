package O1;

import O1.Sc;
import O1.Tc;
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
public final class Qc implements JSONSerializable, Hashable {

    /* renamed from: f, reason: collision with root package name */
    public static final b f4471f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Tc.d f4472g = new Tc.d(new C0762cd());

    /* renamed from: h, reason: collision with root package name */
    private static final Expression f4473h;

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f4474i;

    /* renamed from: j, reason: collision with root package name */
    private static final Function2 f4475j;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f4476a;

    /* renamed from: b, reason: collision with root package name */
    public final Tc f4477b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f4478c;

    /* renamed from: d, reason: collision with root package name */
    public final Expression f4479d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f4480e;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4481i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Qc invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Qc.f4471f.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Qc a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Sc.c) BuiltInParserKt.getBuiltInParserComponent().w7().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f4473h = companion.constant(EnumC0779dc.DP);
        f4474i = companion.constant(Double.valueOf(1.0d));
        f4475j = a.f4481i;
    }

    public Qc(Expression color, Tc style, Expression unit, Expression width) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(width, "width");
        this.f4476a = color;
        this.f4477b = style;
        this.f4478c = unit;
        this.f4479d = width;
    }

    public final boolean a(Qc qc, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return qc != null && ((Number) this.f4476a.evaluate(resolver)).intValue() == ((Number) qc.f4476a.evaluate(otherResolver)).intValue() && this.f4477b.a(qc.f4477b, resolver, otherResolver) && this.f4478c.evaluate(resolver) == qc.f4478c.evaluate(otherResolver) && ((Number) this.f4479d.evaluate(resolver)).doubleValue() == ((Number) qc.f4479d.evaluate(otherResolver)).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f4480e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Qc.class).hashCode() + this.f4476a.hashCode() + this.f4477b.hash() + this.f4478c.hashCode() + this.f4479d.hashCode();
        this.f4480e = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Sc.c) BuiltInParserKt.getBuiltInParserComponent().w7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
