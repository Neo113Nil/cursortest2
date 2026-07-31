package O1;

import O1.Q4;
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
public final class M4 implements JSONSerializable, Hashable, Xb {

    /* renamed from: m, reason: collision with root package name */
    public static final b f3825m = new b(null);

    /* renamed from: n, reason: collision with root package name */
    private static final Expression f3826n;

    /* renamed from: o, reason: collision with root package name */
    private static final Expression f3827o;

    /* renamed from: p, reason: collision with root package name */
    private static final Expression f3828p;

    /* renamed from: q, reason: collision with root package name */
    private static final Expression f3829q;

    /* renamed from: r, reason: collision with root package name */
    private static final Function2 f3830r;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f3831a;

    /* renamed from: b, reason: collision with root package name */
    private final S4 f3832b;

    /* renamed from: c, reason: collision with root package name */
    private final Expression f3833c;

    /* renamed from: d, reason: collision with root package name */
    private final Expression f3834d;

    /* renamed from: e, reason: collision with root package name */
    private final Expression f3835e;

    /* renamed from: f, reason: collision with root package name */
    private final JSONObject f3836f;

    /* renamed from: g, reason: collision with root package name */
    private final Expression f3837g;

    /* renamed from: h, reason: collision with root package name */
    private final String f3838h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC0948n2 f3839i;

    /* renamed from: j, reason: collision with root package name */
    private final Expression f3840j;

    /* renamed from: k, reason: collision with root package name */
    public final Expression f3841k;

    /* renamed from: l, reason: collision with root package name */
    private Integer f3842l;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3843i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M4 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return M4.f3825m.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final M4 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Q4.b) BuiltInParserKt.getBuiltInParserComponent().M2().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f3826n = companion.constant(800L);
        f3827o = companion.constant(Boolean.TRUE);
        f3828p = companion.constant(1L);
        f3829q = companion.constant(0L);
        f3830r = a.f3843i;
    }

    public M4(Expression disappearDuration, S4 s4, Expression isEnabled, Expression logId, Expression logLimit, JSONObject jSONObject, Expression expression, String str, AbstractC0948n2 abstractC0948n2, Expression expression2, Expression visibilityPercentage) {
        Intrinsics.checkNotNullParameter(disappearDuration, "disappearDuration");
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(logId, "logId");
        Intrinsics.checkNotNullParameter(logLimit, "logLimit");
        Intrinsics.checkNotNullParameter(visibilityPercentage, "visibilityPercentage");
        this.f3831a = disappearDuration;
        this.f3832b = s4;
        this.f3833c = isEnabled;
        this.f3834d = logId;
        this.f3835e = logLimit;
        this.f3836f = jSONObject;
        this.f3837g = expression;
        this.f3838h = str;
        this.f3839i = abstractC0948n2;
        this.f3840j = expression2;
        this.f3841k = visibilityPercentage;
    }

    @Override // O1.Xb
    public AbstractC0948n2 a() {
        return this.f3839i;
    }

    @Override // O1.Xb
    public S4 b() {
        return this.f3832b;
    }

    @Override // O1.Xb
    public JSONObject c() {
        return this.f3836f;
    }

    @Override // O1.Xb
    public String d() {
        return this.f3838h;
    }

    @Override // O1.Xb
    public Expression e() {
        return this.f3837g;
    }

    @Override // O1.Xb
    public Expression f() {
        return this.f3835e;
    }

    @Override // O1.Xb
    public Expression g() {
        return this.f3834d;
    }

    @Override // O1.Xb
    public Expression getUrl() {
        return this.f3840j;
    }

    public final boolean h(M4 m4, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (m4 != null && ((Number) this.f3831a.evaluate(resolver)).longValue() == ((Number) m4.f3831a.evaluate(otherResolver)).longValue()) {
            S4 b4 = b();
            if ((b4 != null ? b4.a(m4.b(), resolver, otherResolver) : m4.b() == null) && ((Boolean) isEnabled().evaluate(resolver)).booleanValue() == ((Boolean) m4.isEnabled().evaluate(otherResolver)).booleanValue() && Intrinsics.areEqual(g().evaluate(resolver), m4.g().evaluate(otherResolver)) && ((Number) f().evaluate(resolver)).longValue() == ((Number) m4.f().evaluate(otherResolver)).longValue() && Intrinsics.areEqual(c(), m4.c())) {
                Expression e4 = e();
                Uri uri = e4 != null ? (Uri) e4.evaluate(resolver) : null;
                Expression e5 = m4.e();
                if (Intrinsics.areEqual(uri, e5 != null ? (Uri) e5.evaluate(otherResolver) : null) && Intrinsics.areEqual(d(), m4.d())) {
                    AbstractC0948n2 a4 = a();
                    if (a4 != null ? a4.a(m4.a(), resolver, otherResolver) : m4.a() == null) {
                        Expression url = getUrl();
                        Uri uri2 = url != null ? (Uri) url.evaluate(resolver) : null;
                        Expression url2 = m4.getUrl();
                        if (Intrinsics.areEqual(uri2, url2 != null ? (Uri) url2.evaluate(otherResolver) : null) && ((Number) this.f3841k.evaluate(resolver)).longValue() == ((Number) m4.f3841k.evaluate(otherResolver)).longValue()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f3842l;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(M4.class).hashCode() + this.f3831a.hashCode();
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
        int hashCode5 = hash2 + (url != null ? url.hashCode() : 0) + this.f3841k.hashCode();
        this.f3842l = Integer.valueOf(hashCode5);
        return hashCode5;
    }

    @Override // O1.Xb
    public Expression isEnabled() {
        return this.f3833c;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Q4.b) BuiltInParserKt.getBuiltInParserComponent().M2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
