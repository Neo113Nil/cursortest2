package O1;

import O1.Lb;
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
public final class Ib implements JSONSerializable, Hashable {

    /* renamed from: f, reason: collision with root package name */
    public static final b f3156f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Expression f3157g;

    /* renamed from: h, reason: collision with root package name */
    private static final Expression f3158h;

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f3159i;

    /* renamed from: j, reason: collision with root package name */
    private static final Function2 f3160j;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f3161a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f3162b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f3163c;

    /* renamed from: d, reason: collision with root package name */
    public final C1081ua f3164d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f3165e;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3166i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ib invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Ib.f3156f.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ib a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Lb.b) BuiltInParserKt.getBuiltInParserComponent().M6().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f3157g = companion.constant(Double.valueOf(0.19d));
        f3158h = companion.constant(2L);
        f3159i = companion.constant(0);
        f3160j = a.f3166i;
    }

    public Ib(Expression alpha, Expression blur, Expression color, C1081ua offset) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(blur, "blur");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.f3161a = alpha;
        this.f3162b = blur;
        this.f3163c = color;
        this.f3164d = offset;
    }

    public final boolean a(Ib ib, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return ib != null && ((Number) this.f3161a.evaluate(resolver)).doubleValue() == ((Number) ib.f3161a.evaluate(otherResolver)).doubleValue() && ((Number) this.f3162b.evaluate(resolver)).longValue() == ((Number) ib.f3162b.evaluate(otherResolver)).longValue() && ((Number) this.f3163c.evaluate(resolver)).intValue() == ((Number) ib.f3163c.evaluate(otherResolver)).intValue() && this.f3164d.a(ib.f3164d, resolver, otherResolver);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f3165e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Ib.class).hashCode() + this.f3161a.hashCode() + this.f3162b.hashCode() + this.f3163c.hashCode() + this.f3164d.hash();
        this.f3165e = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Lb.b) BuiltInParserKt.getBuiltInParserComponent().M6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
