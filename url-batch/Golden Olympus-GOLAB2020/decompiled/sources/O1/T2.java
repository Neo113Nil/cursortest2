package O1;

import O1.V2;
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
public final class T2 implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f4857c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f4858d = a.f4861i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f4859a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f4860b;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4861i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T2 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return T2.f4857c.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final T2 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((V2.b) BuiltInParserKt.getBuiltInParserComponent().z1().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public T2(Expression ratio) {
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        this.f4859a = ratio;
    }

    public final boolean a(T2 t22, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return t22 != null && ((Number) this.f4859a.evaluate(resolver)).doubleValue() == ((Number) t22.f4859a.evaluate(otherResolver)).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f4860b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(T2.class).hashCode() + this.f4859a.hashCode();
        this.f4860b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((V2.b) BuiltInParserKt.getBuiltInParserComponent().z1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
