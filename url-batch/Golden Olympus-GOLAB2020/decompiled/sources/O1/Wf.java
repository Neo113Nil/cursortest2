package O1;

import O1.AbstractC0729ag;
import android.net.Uri;
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
public final class Wf implements JSONSerializable, Hashable, Xb {

    /* renamed from: m, reason: collision with root package name */
    public static final b f5171m = new b(null);

    /* renamed from: n, reason: collision with root package name */
    private static final Expression f5172n;

    /* renamed from: o, reason: collision with root package name */
    private static final Expression f5173o;

    /* renamed from: p, reason: collision with root package name */
    private static final Expression f5174p;

    /* renamed from: q, reason: collision with root package name */
    private static final Expression f5175q;

    /* renamed from: r, reason: collision with root package name */
    private static final Function2 f5176r;

    /* renamed from: a, reason: collision with root package name */
    private final S4 f5177a;

    /* renamed from: b, reason: collision with root package name */
    private final Expression f5178b;

    /* renamed from: c, reason: collision with root package name */
    private final Expression f5179c;

    /* renamed from: d, reason: collision with root package name */
    private final Expression f5180d;

    /* renamed from: e, reason: collision with root package name */
    private final JSONObject f5181e;

    /* renamed from: f, reason: collision with root package name */
    private final Expression f5182f;

    /* renamed from: g, reason: collision with root package name */
    private final String f5183g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC0948n2 f5184h;

    /* renamed from: i, reason: collision with root package name */
    private final Expression f5185i;

    /* renamed from: j, reason: collision with root package name */
    public final Expression f5186j;

    /* renamed from: k, reason: collision with root package name */
    public final Expression f5187k;

    /* renamed from: l, reason: collision with root package name */
    private Integer f5188l;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5189i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Wf invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Wf.f5171m.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Wf a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0729ag.b) BuiltInParserKt.getBuiltInParserComponent().q9().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f5172n = companion.constant(Boolean.TRUE);
        f5173o = companion.constant(1L);
        f5174p = companion.constant(800L);
        f5175q = companion.constant(50L);
        f5176r = a.f5189i;
    }

    public Wf(S4 s4, Expression isEnabled, Expression logId, Expression logLimit, JSONObject jSONObject, Expression expression, String str, AbstractC0948n2 abstractC0948n2, Expression expression2, Expression visibilityDuration, Expression visibilityPercentage) {
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(logId, "logId");
        Intrinsics.checkNotNullParameter(logLimit, "logLimit");
        Intrinsics.checkNotNullParameter(visibilityDuration, "visibilityDuration");
        Intrinsics.checkNotNullParameter(visibilityPercentage, "visibilityPercentage");
        this.f5177a = s4;
        this.f5178b = isEnabled;
        this.f5179c = logId;
        this.f5180d = logLimit;
        this.f5181e = jSONObject;
        this.f5182f = expression;
        this.f5183g = str;
        this.f5184h = abstractC0948n2;
        this.f5185i = expression2;
        this.f5186j = visibilityDuration;
        this.f5187k = visibilityPercentage;
    }

    @Override // O1.Xb
    public AbstractC0948n2 a() {
        return this.f5184h;
    }

    @Override // O1.Xb
    public S4 b() {
        return this.f5177a;
    }

    @Override // O1.Xb
    public JSONObject c() {
        return this.f5181e;
    }

    @Override // O1.Xb
    public String d() {
        return this.f5183g;
    }

    @Override // O1.Xb
    public Expression e() {
        return this.f5182f;
    }

    @Override // O1.Xb
    public Expression f() {
        return this.f5180d;
    }

    @Override // O1.Xb
    public Expression g() {
        return this.f5179c;
    }

    @Override // O1.Xb
    public Expression getUrl() {
        return this.f5185i;
    }

    public final boolean h(Wf wf, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (wf == null) {
            return false;
        }
        S4 b4 = b();
        if ((b4 != null ? b4.a(wf.b(), resolver, otherResolver) : wf.b() == null) && ((Boolean) isEnabled().evaluate(resolver)).booleanValue() == ((Boolean) wf.isEnabled().evaluate(otherResolver)).booleanValue() && Intrinsics.areEqual(g().evaluate(resolver), wf.g().evaluate(otherResolver)) && ((Number) f().evaluate(resolver)).longValue() == ((Number) wf.f().evaluate(otherResolver)).longValue() && Intrinsics.areEqual(c(), wf.c())) {
            Expression e4 = e();
            Uri uri = e4 != null ? (Uri) e4.evaluate(resolver) : null;
            Expression e5 = wf.e();
            if (Intrinsics.areEqual(uri, e5 != null ? (Uri) e5.evaluate(otherResolver) : null) && Intrinsics.areEqual(d(), wf.d())) {
                AbstractC0948n2 a4 = a();
                if (a4 != null ? a4.a(wf.a(), resolver, otherResolver) : wf.a() == null) {
                    Expression url = getUrl();
                    Uri uri2 = url != null ? (Uri) url.evaluate(resolver) : null;
                    Expression url2 = wf.getUrl();
                    if (Intrinsics.areEqual(uri2, url2 != null ? (Uri) url2.evaluate(otherResolver) : null) && ((Number) this.f5186j.evaluate(resolver)).longValue() == ((Number) wf.f5186j.evaluate(otherResolver)).longValue() && ((Number) this.f5187k.evaluate(resolver)).longValue() == ((Number) wf.f5187k.evaluate(otherResolver)).longValue()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f5188l;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Wf.class).hashCode();
        S4 b4 = b();
        int hash = hashCode + (b4 != null ? b4.hash() : 0) + isEnabled().hashCode() + g().hashCode() + f().hashCode();
        JSONObject c4 = c();
        int hashCode2 = hash + (c4 != null ? c4.hashCode() : 0);
        Expression e4 = e();
        int hashCode3 = hashCode2 + (e4 != null ? e4.hashCode() : 0);
        String d4 = d();
        int hashCode4 = hashCode3 + (d4 != null ? d4.hashCode() : 0);
        AbstractC0948n2 a4 = a();
        int hash2 = hashCode4 + (a4 != null ? a4.hash() : 0);
        Expression url = getUrl();
        int hashCode5 = hash2 + (url != null ? url.hashCode() : 0) + this.f5186j.hashCode() + this.f5187k.hashCode();
        this.f5188l = Integer.valueOf(hashCode5);
        return hashCode5;
    }

    @Override // O1.Xb
    public Expression isEnabled() {
        return this.f5178b;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0729ag.b) BuiltInParserKt.getBuiltInParserComponent().q9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
