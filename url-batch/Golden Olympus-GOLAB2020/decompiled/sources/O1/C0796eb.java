package O1;

import O1.AbstractC0903kb;
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

/* renamed from: O1.eb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0796eb implements JSONSerializable, Hashable {

    /* renamed from: h, reason: collision with root package name */
    public static final b f6099h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f6100i;

    /* renamed from: j, reason: collision with root package name */
    private static final Expression f6101j;

    /* renamed from: k, reason: collision with root package name */
    private static final Expression f6102k;

    /* renamed from: l, reason: collision with root package name */
    private static final Expression f6103l;

    /* renamed from: m, reason: collision with root package name */
    private static final Expression f6104m;

    /* renamed from: n, reason: collision with root package name */
    private static final Expression f6105n;

    /* renamed from: o, reason: collision with root package name */
    private static final Function2 f6106o;

    /* renamed from: a, reason: collision with root package name */
    private final Expression f6107a;

    /* renamed from: b, reason: collision with root package name */
    private final Expression f6108b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f6109c;

    /* renamed from: d, reason: collision with root package name */
    public final Expression f6110d;

    /* renamed from: e, reason: collision with root package name */
    public final Expression f6111e;

    /* renamed from: f, reason: collision with root package name */
    private final Expression f6112f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f6113g;

    /* renamed from: O1.eb$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6114i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0796eb invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0796eb.f6099h.a(env, it);
        }
    }

    /* renamed from: O1.eb$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0796eb a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0903kb.c) BuiltInParserKt.getBuiltInParserComponent().x6().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f6100i = companion.constant(200L);
        f6101j = companion.constant(EnumC1163z2.EASE_IN_OUT);
        Double valueOf = Double.valueOf(0.5d);
        f6102k = companion.constant(valueOf);
        f6103l = companion.constant(valueOf);
        f6104m = companion.constant(Double.valueOf(0.0d));
        f6105n = companion.constant(0L);
        f6106o = a.f6114i;
    }

    public C0796eb(Expression duration, Expression interpolator, Expression pivotX, Expression pivotY, Expression scale, Expression startDelay) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(pivotX, "pivotX");
        Intrinsics.checkNotNullParameter(pivotY, "pivotY");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(startDelay, "startDelay");
        this.f6107a = duration;
        this.f6108b = interpolator;
        this.f6109c = pivotX;
        this.f6110d = pivotY;
        this.f6111e = scale;
        this.f6112f = startDelay;
    }

    public final boolean a(C0796eb c0796eb, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c0796eb != null && ((Number) b().evaluate(resolver)).longValue() == ((Number) c0796eb.b().evaluate(otherResolver)).longValue() && c().evaluate(resolver) == c0796eb.c().evaluate(otherResolver) && ((Number) this.f6109c.evaluate(resolver)).doubleValue() == ((Number) c0796eb.f6109c.evaluate(otherResolver)).doubleValue() && ((Number) this.f6110d.evaluate(resolver)).doubleValue() == ((Number) c0796eb.f6110d.evaluate(otherResolver)).doubleValue() && ((Number) this.f6111e.evaluate(resolver)).doubleValue() == ((Number) c0796eb.f6111e.evaluate(otherResolver)).doubleValue() && ((Number) d().evaluate(resolver)).longValue() == ((Number) c0796eb.d().evaluate(otherResolver)).longValue();
    }

    public Expression b() {
        return this.f6107a;
    }

    public Expression c() {
        return this.f6108b;
    }

    public Expression d() {
        return this.f6112f;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6113g;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0796eb.class).hashCode() + b().hashCode() + c().hashCode() + this.f6109c.hashCode() + this.f6110d.hashCode() + this.f6111e.hashCode() + d().hashCode();
        this.f6113g = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0903kb.c) BuiltInParserKt.getBuiltInParserComponent().x6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
