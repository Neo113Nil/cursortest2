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

/* renamed from: O1.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1070u implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f8118c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f8119d = a.f8122i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f8120a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f8121b;

    /* renamed from: O1.u$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8122i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1070u invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1070u.f8118c.a(env, it);
        }
    }

    /* renamed from: O1.u$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1070u a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C1088v) BuiltInParserKt.getBuiltInParserComponent().m().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C1070u(Expression value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f8120a = value;
    }

    public final boolean a(C1070u c1070u, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c1070u != null && ((Number) this.f8120a.evaluate(resolver)).intValue() == ((Number) c1070u.f8120a.evaluate(otherResolver)).intValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f8121b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1070u.class).hashCode() + this.f8120a.hashCode();
        this.f8121b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C1088v) BuiltInParserKt.getBuiltInParserComponent().m().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
