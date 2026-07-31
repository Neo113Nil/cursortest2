package O1;

import O1.AbstractC0760cb;
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

/* renamed from: O1.bb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0742bb implements JSONSerializable, Hashable {

    /* renamed from: g, reason: collision with root package name */
    public static final b f5803g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    private static final S5 f5804h;

    /* renamed from: i, reason: collision with root package name */
    private static final S5 f5805i;

    /* renamed from: j, reason: collision with root package name */
    private static final S5 f5806j;

    /* renamed from: k, reason: collision with root package name */
    private static final Function2 f5807k;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f5808a;

    /* renamed from: b, reason: collision with root package name */
    public final S5 f5809b;

    /* renamed from: c, reason: collision with root package name */
    public final S5 f5810c;

    /* renamed from: d, reason: collision with root package name */
    public final S5 f5811d;

    /* renamed from: e, reason: collision with root package name */
    public final Qc f5812e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f5813f;

    /* renamed from: O1.bb$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5814i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0742bb invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0742bb.f5803g.a(env, it);
        }
    }

    /* renamed from: O1.bb$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0742bb a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0760cb.b) BuiltInParserKt.getBuiltInParserComponent().u6().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        int i4 = 1;
        f5804h = new S5(null == true ? 1 : 0, companion.constant(5L), i4, null == true ? 1 : 0);
        f5805i = new S5(null == true ? 1 : 0, companion.constant(10L), i4, null == true ? 1 : 0);
        f5806j = new S5(null == true ? 1 : 0, companion.constant(10L), i4, null == true ? 1 : 0);
        f5807k = a.f5814i;
    }

    public C0742bb(Expression expression, S5 cornerRadius, S5 itemHeight, S5 itemWidth, Qc qc) {
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(itemHeight, "itemHeight");
        Intrinsics.checkNotNullParameter(itemWidth, "itemWidth");
        this.f5808a = expression;
        this.f5809b = cornerRadius;
        this.f5810c = itemHeight;
        this.f5811d = itemWidth;
        this.f5812e = qc;
    }

    public final boolean a(C0742bb c0742bb, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0742bb == null) {
            return false;
        }
        Expression expression = this.f5808a;
        Integer num = expression != null ? (Integer) expression.evaluate(resolver) : null;
        Expression expression2 = c0742bb.f5808a;
        if (Intrinsics.areEqual(num, expression2 != null ? (Integer) expression2.evaluate(otherResolver) : null) && this.f5809b.a(c0742bb.f5809b, resolver, otherResolver) && this.f5810c.a(c0742bb.f5810c, resolver, otherResolver) && this.f5811d.a(c0742bb.f5811d, resolver, otherResolver)) {
            Qc qc = this.f5812e;
            Qc qc2 = c0742bb.f5812e;
            if (qc != null ? qc.a(qc2, resolver, otherResolver) : qc2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f5813f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0742bb.class).hashCode();
        Expression expression = this.f5808a;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + this.f5809b.hash() + this.f5810c.hash() + this.f5811d.hash();
        Qc qc = this.f5812e;
        int hash = hashCode2 + (qc != null ? qc.hash() : 0);
        this.f5813f = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0760cb.b) BuiltInParserKt.getBuiltInParserComponent().u6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0742bb(Expression expression, S5 s5, S5 s52, S5 s53, Qc qc, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : expression, (i4 & 2) != 0 ? f5804h : s5, (i4 & 4) != 0 ? f5805i : s52, (i4 & 8) != 0 ? f5806j : s53, (i4 & 16) != 0 ? null : qc);
    }
}
