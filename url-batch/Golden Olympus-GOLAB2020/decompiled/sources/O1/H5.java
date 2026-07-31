package O1;

import O1.J5;
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
public final class H5 implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f2965c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f2966d = a.f2969i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f2967a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f2968b;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2969i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H5 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return H5.f2965c.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final H5 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((J5.b) BuiltInParserKt.getBuiltInParserComponent().k3().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public H5(Expression value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f2967a = value;
    }

    public final boolean a(H5 h5, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return h5 != null && ((Number) this.f2967a.evaluate(resolver)).longValue() == ((Number) h5.f2967a.evaluate(otherResolver)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f2968b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(H5.class).hashCode() + this.f2967a.hashCode();
        this.f2968b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((J5.b) BuiltInParserKt.getBuiltInParserComponent().k3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
