package O1;

import O1.AbstractC0723aa;
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
public final class Y9 implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f5397c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f5398d = a.f5401i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f5399a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f5400b;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5401i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Y9 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Y9.f5397c.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Y9 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0723aa.b) BuiltInParserKt.getBuiltInParserComponent().H5().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public Y9(Expression value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f5399a = value;
    }

    public final boolean a(Y9 y9, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return y9 != null && ((Number) this.f5399a.evaluate(resolver)).doubleValue() == ((Number) y9.f5399a.evaluate(otherResolver)).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f5400b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Y9.class).hashCode() + this.f5399a.hashCode();
        this.f5400b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0723aa.b) BuiltInParserKt.getBuiltInParserComponent().H5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
