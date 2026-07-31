package O1;

import O1.AbstractC0803f0;
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

/* renamed from: O1.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0713a0 implements JSONSerializable, Hashable {

    /* renamed from: f, reason: collision with root package name */
    public static final b f5574f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Expression f5575g;

    /* renamed from: h, reason: collision with root package name */
    private static final Expression f5576h;

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f5577i;

    /* renamed from: j, reason: collision with root package name */
    private static final Expression f5578j;

    /* renamed from: k, reason: collision with root package name */
    private static final Function2 f5579k;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f5580a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f5581b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f5582c;

    /* renamed from: d, reason: collision with root package name */
    public final Expression f5583d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f5584e;

    /* renamed from: O1.a0$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5585i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0713a0 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0713a0.f5574f.a(env, it);
        }
    }

    /* renamed from: O1.a0$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0713a0 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0803f0.b) BuiltInParserKt.getBuiltInParserComponent().E().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f5575g = companion.constant(0L);
        f5576h = companion.constant(0L);
        f5577i = companion.constant(0L);
        f5578j = companion.constant(0L);
        f5579k = a.f5585i;
    }

    public C0713a0(Expression bottom, Expression left, Expression right, Expression top) {
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        Intrinsics.checkNotNullParameter(top, "top");
        this.f5580a = bottom;
        this.f5581b = left;
        this.f5582c = right;
        this.f5583d = top;
    }

    public final boolean a(C0713a0 c0713a0, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c0713a0 != null && ((Number) this.f5580a.evaluate(resolver)).longValue() == ((Number) c0713a0.f5580a.evaluate(otherResolver)).longValue() && ((Number) this.f5581b.evaluate(resolver)).longValue() == ((Number) c0713a0.f5581b.evaluate(otherResolver)).longValue() && ((Number) this.f5582c.evaluate(resolver)).longValue() == ((Number) c0713a0.f5582c.evaluate(otherResolver)).longValue() && ((Number) this.f5583d.evaluate(resolver)).longValue() == ((Number) c0713a0.f5583d.evaluate(otherResolver)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f5584e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0713a0.class).hashCode() + this.f5580a.hashCode() + this.f5581b.hashCode() + this.f5582c.hashCode() + this.f5583d.hashCode();
        this.f5584e = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0803f0.b) BuiltInParserKt.getBuiltInParserComponent().E().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
