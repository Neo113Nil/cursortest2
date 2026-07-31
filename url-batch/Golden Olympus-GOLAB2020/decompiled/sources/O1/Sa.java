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
public final class Sa implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f4785c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f4786d = a.f4789i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f4787a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f4788b;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4789i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Sa invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Sa.f4785c.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Sa a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Ta) BuiltInParserKt.getBuiltInParserComponent().o6().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public Sa(Expression value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f4787a = value;
    }

    public final boolean a(Sa sa, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return sa != null && ((Number) this.f4787a.evaluate(resolver)).doubleValue() == ((Number) sa.f4787a.evaluate(otherResolver)).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f4788b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Sa.class).hashCode() + this.f4787a.hashCode();
        this.f4788b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Ta) BuiltInParserKt.getBuiltInParserComponent().o6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
