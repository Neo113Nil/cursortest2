package O1;

import O1.K8;
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
public final class I8 implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f3144c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f3145d = a.f3148i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f3146a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f3147b;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3148i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I8 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return I8.f3144c.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final I8 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((K8.b) BuiltInParserKt.getBuiltInParserComponent().V4().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public I8(Expression expression) {
        this.f3146a = expression;
    }

    public final boolean a(I8 i8, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (i8 == null) {
            return false;
        }
        Expression expression = this.f3146a;
        Double d4 = expression != null ? (Double) expression.evaluate(resolver) : null;
        Expression expression2 = i8.f3146a;
        return Intrinsics.areEqual(d4, expression2 != null ? (Double) expression2.evaluate(otherResolver) : null);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f3147b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(I8.class).hashCode();
        Expression expression = this.f3146a;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        this.f3147b = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((K8.b) BuiltInParserKt.getBuiltInParserComponent().V4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ I8(Expression expression, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : expression);
    }
}
