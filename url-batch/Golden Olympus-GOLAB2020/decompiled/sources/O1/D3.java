package O1;

import O1.F3;
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
public final class D3 implements JSONSerializable, Hashable {

    /* renamed from: e, reason: collision with root package name */
    public static final b f2449e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f2450f = a.f2455i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f2451a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f2452b;

    /* renamed from: c, reason: collision with root package name */
    public final C0754c5 f2453c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f2454d;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2455i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D3 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return D3.f2449e.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final D3 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((F3.b) BuiltInParserKt.getBuiltInParserComponent().X1().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public D3(Expression color, Expression cornerRadius, C0754c5 c0754c5) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        this.f2451a = color;
        this.f2452b = cornerRadius;
        this.f2453c = c0754c5;
    }

    public final boolean a(D3 d32, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (d32 != null && ((Number) this.f2451a.evaluate(resolver)).intValue() == ((Number) d32.f2451a.evaluate(otherResolver)).intValue() && ((Number) this.f2452b.evaluate(resolver)).longValue() == ((Number) d32.f2452b.evaluate(otherResolver)).longValue()) {
            C0754c5 c0754c5 = this.f2453c;
            C0754c5 c0754c52 = d32.f2453c;
            if (c0754c5 != null ? c0754c5.a(c0754c52, resolver, otherResolver) : c0754c52 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f2454d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(D3.class).hashCode() + this.f2451a.hashCode() + this.f2452b.hashCode();
        C0754c5 c0754c5 = this.f2453c;
        int hash = hashCode + (c0754c5 != null ? c0754c5.hash() : 0);
        this.f2454d = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((F3.b) BuiltInParserKt.getBuiltInParserComponent().X1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
