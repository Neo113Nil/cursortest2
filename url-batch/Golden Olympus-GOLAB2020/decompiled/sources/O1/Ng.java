package O1;

import O1.Pg;
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
public final class Ng implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f4174c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f4175d = a.f4178i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f4176a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f4177b;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4178i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ng invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Ng.f4174c.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ng a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Pg.b) BuiltInParserKt.getBuiltInParserComponent().R9().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public Ng(Expression value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f4176a = value;
    }

    public final boolean a(Ng ng, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return ng != null && ((Number) this.f4176a.evaluate(resolver)).longValue() == ((Number) ng.f4176a.evaluate(otherResolver)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f4177b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Ng.class).hashCode() + this.f4176a.hashCode();
        this.f4177b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Pg.b) BuiltInParserKt.getBuiltInParserComponent().R9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
