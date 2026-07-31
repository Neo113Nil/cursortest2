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
public final class Q1 implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f4365d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f4366e = a.f4370i;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1086uf f4367a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f4368b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f4369c;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4370i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Q1 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Q1.f4365d.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Q1 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((R1) BuiltInParserKt.getBuiltInParserComponent().P0().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public Q1(AbstractC1086uf value, Expression variableName) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        this.f4367a = value;
        this.f4368b = variableName;
    }

    public final boolean a(Q1 q12, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return q12 != null && this.f4367a.a(q12.f4367a, resolver, otherResolver) && Intrinsics.areEqual(this.f4368b.evaluate(resolver), q12.f4368b.evaluate(otherResolver));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f4369c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Q1.class).hashCode() + this.f4367a.hash() + this.f4368b.hashCode();
        this.f4369c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((R1) BuiltInParserKt.getBuiltInParserComponent().P0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
