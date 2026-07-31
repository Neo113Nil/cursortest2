package O1;

import O1.Je;
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
public final class Ie implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f3274d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Expression f3275e = Expression.Companion.constant(Boolean.TRUE);

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f3276f = a.f3280i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f3277a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f3278b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f3279c;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3280i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ie invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Ie.f3274d.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ie a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Je.b) BuiltInParserKt.getBuiltInParserComponent().D8().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public Ie(Expression color, Expression isEnabled) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        this.f3277a = color;
        this.f3278b = isEnabled;
    }

    public final boolean a(Ie ie, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return ie != null && ((Number) this.f3277a.evaluate(resolver)).intValue() == ((Number) ie.f3277a.evaluate(otherResolver)).intValue() && ((Boolean) this.f3278b.evaluate(resolver)).booleanValue() == ((Boolean) ie.f3278b.evaluate(otherResolver)).booleanValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f3279c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Ie.class).hashCode() + this.f3277a.hashCode() + this.f3278b.hashCode();
        this.f3279c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Je.b) BuiltInParserKt.getBuiltInParserComponent().D8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
