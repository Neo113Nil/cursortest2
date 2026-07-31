package O1;

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
public final class Ob implements JSONSerializable, Hashable {

    /* renamed from: e, reason: collision with root package name */
    public static final b f4271e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f4272f = a.f4277i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f4273a;

    /* renamed from: b, reason: collision with root package name */
    public final Nb f4274b;

    /* renamed from: c, reason: collision with root package name */
    public final Qc f4275c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f4276d;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4277i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ob invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Ob.f4271e.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ob a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Pb) BuiltInParserKt.getBuiltInParserComponent().P6().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public Ob(Expression color, Nb shape, Qc qc) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f4273a = color;
        this.f4274b = shape;
        this.f4275c = qc;
    }

    public final boolean a(Ob ob, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (ob != null && ((Number) this.f4273a.evaluate(resolver)).intValue() == ((Number) ob.f4273a.evaluate(otherResolver)).intValue() && this.f4274b.a(ob.f4274b, resolver, otherResolver)) {
            Qc qc = this.f4275c;
            Qc qc2 = ob.f4275c;
            if (qc != null ? qc.a(qc2, resolver, otherResolver) : qc2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f4276d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Ob.class).hashCode() + this.f4273a.hashCode() + this.f4274b.hash();
        Qc qc = this.f4275c;
        int hash = hashCode + (qc != null ? qc.hash() : 0);
        this.f4276d = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Pb) BuiltInParserKt.getBuiltInParserComponent().P6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
