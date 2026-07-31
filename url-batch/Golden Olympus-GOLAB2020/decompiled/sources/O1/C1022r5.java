package O1;

import O1.AbstractC1094v5;
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

/* renamed from: O1.r5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1022r5 implements JSONSerializable, Hashable {

    /* renamed from: f, reason: collision with root package name */
    public static final b f7766f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Expression f7767g;

    /* renamed from: h, reason: collision with root package name */
    private static final Expression f7768h;

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f7769i;

    /* renamed from: j, reason: collision with root package name */
    private static final Expression f7770j;

    /* renamed from: k, reason: collision with root package name */
    private static final Function2 f7771k;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f7772a;

    /* renamed from: b, reason: collision with root package name */
    private final Expression f7773b;

    /* renamed from: c, reason: collision with root package name */
    private final Expression f7774c;

    /* renamed from: d, reason: collision with root package name */
    private final Expression f7775d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f7776e;

    /* renamed from: O1.r5$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7777i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1022r5 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1022r5.f7766f.a(env, it);
        }
    }

    /* renamed from: O1.r5$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1022r5 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC1094v5.c) BuiltInParserKt.getBuiltInParserComponent().b3().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f7767g = companion.constant(Double.valueOf(0.0d));
        f7768h = companion.constant(200L);
        f7769i = companion.constant(EnumC1163z2.EASE_IN_OUT);
        f7770j = companion.constant(0L);
        f7771k = a.f7777i;
    }

    public C1022r5(Expression alpha, Expression duration, Expression interpolator, Expression startDelay) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(startDelay, "startDelay");
        this.f7772a = alpha;
        this.f7773b = duration;
        this.f7774c = interpolator;
        this.f7775d = startDelay;
    }

    public final boolean a(C1022r5 c1022r5, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c1022r5 != null && ((Number) this.f7772a.evaluate(resolver)).doubleValue() == ((Number) c1022r5.f7772a.evaluate(otherResolver)).doubleValue() && ((Number) b().evaluate(resolver)).longValue() == ((Number) c1022r5.b().evaluate(otherResolver)).longValue() && c().evaluate(resolver) == c1022r5.c().evaluate(otherResolver) && ((Number) d().evaluate(resolver)).longValue() == ((Number) c1022r5.d().evaluate(otherResolver)).longValue();
    }

    public Expression b() {
        return this.f7773b;
    }

    public Expression c() {
        return this.f7774c;
    }

    public Expression d() {
        return this.f7775d;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f7776e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1022r5.class).hashCode() + this.f7772a.hashCode() + b().hashCode() + c().hashCode() + d().hashCode();
        this.f7776e = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC1094v5.c) BuiltInParserKt.getBuiltInParserComponent().b3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
