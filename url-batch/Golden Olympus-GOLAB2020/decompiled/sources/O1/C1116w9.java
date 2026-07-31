package O1;

import O1.B9;
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

/* renamed from: O1.w9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1116w9 implements JSONSerializable, Hashable {

    /* renamed from: g, reason: collision with root package name */
    public static final b f8323g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    private static final Expression f8324h;

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f8325i;

    /* renamed from: j, reason: collision with root package name */
    private static final Expression f8326j;

    /* renamed from: k, reason: collision with root package name */
    private static final Expression f8327k;

    /* renamed from: l, reason: collision with root package name */
    private static final Expression f8328l;

    /* renamed from: m, reason: collision with root package name */
    private static final Function2 f8329m;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f8330a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f8331b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f8332c;

    /* renamed from: d, reason: collision with root package name */
    public final Expression f8333d;

    /* renamed from: e, reason: collision with root package name */
    public final Expression f8334e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f8335f;

    /* renamed from: O1.w9$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8336i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1116w9 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1116w9.f8323g.a(env, it);
        }
    }

    /* renamed from: O1.w9$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1116w9 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((B9.c) BuiltInParserKt.getBuiltInParserComponent().t5().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f8324h = companion.constant(EnumC1163z2.EASE_IN_OUT);
        Double valueOf = Double.valueOf(1.0d);
        f8325i = companion.constant(valueOf);
        f8326j = companion.constant(valueOf);
        f8327k = companion.constant(valueOf);
        f8328l = companion.constant(valueOf);
        f8329m = a.f8336i;
    }

    public C1116w9(Expression interpolator, Expression nextPageAlpha, Expression nextPageScale, Expression previousPageAlpha, Expression previousPageScale) {
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(nextPageAlpha, "nextPageAlpha");
        Intrinsics.checkNotNullParameter(nextPageScale, "nextPageScale");
        Intrinsics.checkNotNullParameter(previousPageAlpha, "previousPageAlpha");
        Intrinsics.checkNotNullParameter(previousPageScale, "previousPageScale");
        this.f8330a = interpolator;
        this.f8331b = nextPageAlpha;
        this.f8332c = nextPageScale;
        this.f8333d = previousPageAlpha;
        this.f8334e = previousPageScale;
    }

    public final boolean a(C1116w9 c1116w9, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c1116w9 != null && this.f8330a.evaluate(resolver) == c1116w9.f8330a.evaluate(otherResolver) && ((Number) this.f8331b.evaluate(resolver)).doubleValue() == ((Number) c1116w9.f8331b.evaluate(otherResolver)).doubleValue() && ((Number) this.f8332c.evaluate(resolver)).doubleValue() == ((Number) c1116w9.f8332c.evaluate(otherResolver)).doubleValue() && ((Number) this.f8333d.evaluate(resolver)).doubleValue() == ((Number) c1116w9.f8333d.evaluate(otherResolver)).doubleValue() && ((Number) this.f8334e.evaluate(resolver)).doubleValue() == ((Number) c1116w9.f8334e.evaluate(otherResolver)).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f8335f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1116w9.class).hashCode() + this.f8330a.hashCode() + this.f8331b.hashCode() + this.f8332c.hashCode() + this.f8333d.hashCode() + this.f8334e.hashCode();
        this.f8335f = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((B9.c) BuiltInParserKt.getBuiltInParserComponent().t5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
