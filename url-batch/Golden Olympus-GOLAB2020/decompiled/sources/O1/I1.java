package O1;

import O1.J1;
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
public final class I1 implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f3126d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Expression f3127e = Expression.Companion.constant(Boolean.TRUE);

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f3128f = a.f3132i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f3129a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f3130b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f3131c;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3132i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I1 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return I1.f3126d.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final I1 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((J1.b) BuiltInParserKt.getBuiltInParserComponent().J0().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public I1(Expression stateId, Expression temporary) {
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        Intrinsics.checkNotNullParameter(temporary, "temporary");
        this.f3129a = stateId;
        this.f3130b = temporary;
    }

    public final boolean a(I1 i12, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return i12 != null && Intrinsics.areEqual(this.f3129a.evaluate(resolver), i12.f3129a.evaluate(otherResolver)) && ((Boolean) this.f3130b.evaluate(resolver)).booleanValue() == ((Boolean) i12.f3130b.evaluate(otherResolver)).booleanValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f3131c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(I1.class).hashCode() + this.f3129a.hashCode() + this.f3130b.hashCode();
        this.f3131c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((J1.b) BuiltInParserKt.getBuiltInParserComponent().J0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
