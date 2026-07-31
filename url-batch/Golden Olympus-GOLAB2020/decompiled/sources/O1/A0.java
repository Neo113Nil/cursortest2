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
public final class A0 implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f1285d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f1286e = a.f1290i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f1287a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f1288b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f1289c;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f1290i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A0 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return A0.f1285d.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final A0 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((B0) BuiltInParserKt.getBuiltInParserComponent().T().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public A0(Expression index, Expression variableName) {
        Intrinsics.checkNotNullParameter(index, "index");
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        this.f1287a = index;
        this.f1288b = variableName;
    }

    public final boolean a(A0 a02, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return a02 != null && ((Number) this.f1287a.evaluate(resolver)).longValue() == ((Number) a02.f1287a.evaluate(otherResolver)).longValue() && Intrinsics.areEqual(this.f1288b.evaluate(resolver), a02.f1288b.evaluate(otherResolver));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f1289c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(A0.class).hashCode() + this.f1287a.hashCode() + this.f1288b.hashCode();
        this.f1289c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((B0) BuiltInParserKt.getBuiltInParserComponent().T().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
