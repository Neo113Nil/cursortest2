package O1;

import O1.AbstractC1080u9;
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

/* renamed from: O1.p9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0991p9 implements JSONSerializable, Hashable {

    /* renamed from: h, reason: collision with root package name */
    public static final b f7473h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f7474i;

    /* renamed from: j, reason: collision with root package name */
    private static final Expression f7475j;

    /* renamed from: k, reason: collision with root package name */
    private static final Expression f7476k;

    /* renamed from: l, reason: collision with root package name */
    private static final Expression f7477l;

    /* renamed from: m, reason: collision with root package name */
    private static final Expression f7478m;

    /* renamed from: n, reason: collision with root package name */
    private static final Expression f7479n;

    /* renamed from: o, reason: collision with root package name */
    private static final Function2 f7480o;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f7481a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f7482b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f7483c;

    /* renamed from: d, reason: collision with root package name */
    public final Expression f7484d;

    /* renamed from: e, reason: collision with root package name */
    public final Expression f7485e;

    /* renamed from: f, reason: collision with root package name */
    public final Expression f7486f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f7487g;

    /* renamed from: O1.p9$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7488i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0991p9 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0991p9.f7473h.a(env, it);
        }
    }

    /* renamed from: O1.p9$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0991p9 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC1080u9.c) BuiltInParserKt.getBuiltInParserComponent().q5().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f7474i = companion.constant(EnumC1163z2.EASE_IN_OUT);
        Double valueOf = Double.valueOf(1.0d);
        f7475j = companion.constant(valueOf);
        f7476k = companion.constant(valueOf);
        f7477l = companion.constant(valueOf);
        f7478m = companion.constant(valueOf);
        f7479n = companion.constant(Boolean.FALSE);
        f7480o = a.f7488i;
    }

    public C0991p9(Expression interpolator, Expression nextPageAlpha, Expression nextPageScale, Expression previousPageAlpha, Expression previousPageScale, Expression reversedStackingOrder) {
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(nextPageAlpha, "nextPageAlpha");
        Intrinsics.checkNotNullParameter(nextPageScale, "nextPageScale");
        Intrinsics.checkNotNullParameter(previousPageAlpha, "previousPageAlpha");
        Intrinsics.checkNotNullParameter(previousPageScale, "previousPageScale");
        Intrinsics.checkNotNullParameter(reversedStackingOrder, "reversedStackingOrder");
        this.f7481a = interpolator;
        this.f7482b = nextPageAlpha;
        this.f7483c = nextPageScale;
        this.f7484d = previousPageAlpha;
        this.f7485e = previousPageScale;
        this.f7486f = reversedStackingOrder;
    }

    public final boolean a(C0991p9 c0991p9, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c0991p9 != null && this.f7481a.evaluate(resolver) == c0991p9.f7481a.evaluate(otherResolver) && ((Number) this.f7482b.evaluate(resolver)).doubleValue() == ((Number) c0991p9.f7482b.evaluate(otherResolver)).doubleValue() && ((Number) this.f7483c.evaluate(resolver)).doubleValue() == ((Number) c0991p9.f7483c.evaluate(otherResolver)).doubleValue() && ((Number) this.f7484d.evaluate(resolver)).doubleValue() == ((Number) c0991p9.f7484d.evaluate(otherResolver)).doubleValue() && ((Number) this.f7485e.evaluate(resolver)).doubleValue() == ((Number) c0991p9.f7485e.evaluate(otherResolver)).doubleValue() && ((Boolean) this.f7486f.evaluate(resolver)).booleanValue() == ((Boolean) c0991p9.f7486f.evaluate(otherResolver)).booleanValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f7487g;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0991p9.class).hashCode() + this.f7481a.hashCode() + this.f7482b.hashCode() + this.f7483c.hashCode() + this.f7484d.hashCode() + this.f7485e.hashCode() + this.f7486f.hashCode();
        this.f7487g = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC1080u9.c) BuiltInParserKt.getBuiltInParserComponent().q5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
