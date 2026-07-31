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
public final class Dg implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f2481c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f2482d = a.f2485i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f2483a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f2484b;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2485i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dg invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Dg.f2481c.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Dg a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Eg) BuiltInParserKt.getBuiltInParserComponent().L9().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public Dg(Expression value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f2483a = value;
    }

    public final boolean a(Dg dg, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return dg != null && ((Number) this.f2483a.evaluate(resolver)).doubleValue() == ((Number) dg.f2483a.evaluate(otherResolver)).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f2484b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Dg.class).hashCode() + this.f2483a.hashCode();
        this.f2484b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Eg) BuiltInParserKt.getBuiltInParserComponent().L9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
