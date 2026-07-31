package O1;

import O1.AbstractC0895k3;
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

/* renamed from: O1.i3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0860i3 implements JSONSerializable, Hashable {

    /* renamed from: g, reason: collision with root package name */
    public static final b f6456g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    private static final Expression f6457h = Expression.Companion.constant(Boolean.FALSE);

    /* renamed from: i, reason: collision with root package name */
    private static final Function2 f6458i = a.f6465i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f6459a;

    /* renamed from: b, reason: collision with root package name */
    public final C0735b4 f6460b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f6461c;

    /* renamed from: d, reason: collision with root package name */
    public final Ib f6462d;

    /* renamed from: e, reason: collision with root package name */
    public final Qc f6463e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f6464f;

    /* renamed from: O1.i3$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6465i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0860i3 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0860i3.f6456g.a(env, it);
        }
    }

    /* renamed from: O1.i3$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0860i3 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0895k3.b) BuiltInParserKt.getBuiltInParserComponent().I1().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0860i3(Expression expression, C0735b4 c0735b4, Expression hasShadow, Ib ib, Qc qc) {
        Intrinsics.checkNotNullParameter(hasShadow, "hasShadow");
        this.f6459a = expression;
        this.f6460b = c0735b4;
        this.f6461c = hasShadow;
        this.f6462d = ib;
        this.f6463e = qc;
    }

    public final boolean a(C0860i3 c0860i3, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0860i3 == null) {
            return false;
        }
        Expression expression = this.f6459a;
        Long l4 = expression != null ? (Long) expression.evaluate(resolver) : null;
        Expression expression2 = c0860i3.f6459a;
        if (Intrinsics.areEqual(l4, expression2 != null ? (Long) expression2.evaluate(otherResolver) : null)) {
            C0735b4 c0735b4 = this.f6460b;
            if ((c0735b4 != null ? c0735b4.a(c0860i3.f6460b, resolver, otherResolver) : c0860i3.f6460b == null) && ((Boolean) this.f6461c.evaluate(resolver)).booleanValue() == ((Boolean) c0860i3.f6461c.evaluate(otherResolver)).booleanValue()) {
                Ib ib = this.f6462d;
                if (ib != null ? ib.a(c0860i3.f6462d, resolver, otherResolver) : c0860i3.f6462d == null) {
                    Qc qc = this.f6463e;
                    Qc qc2 = c0860i3.f6463e;
                    if (qc != null ? qc.a(qc2, resolver, otherResolver) : qc2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6464f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0860i3.class).hashCode();
        Expression expression = this.f6459a;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        C0735b4 c0735b4 = this.f6460b;
        int hash = hashCode2 + (c0735b4 != null ? c0735b4.hash() : 0) + this.f6461c.hashCode();
        Ib ib = this.f6462d;
        int hash2 = hash + (ib != null ? ib.hash() : 0);
        Qc qc = this.f6463e;
        int hash3 = hash2 + (qc != null ? qc.hash() : 0);
        this.f6464f = Integer.valueOf(hash3);
        return hash3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0895k3.b) BuiltInParserKt.getBuiltInParserComponent().I1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
