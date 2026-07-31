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
public final class hh implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f6416c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f6417d = a.f6420i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f6418a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f6419b;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6420i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final hh invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return hh.f6416c.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final hh a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((ih) BuiltInParserKt.getBuiltInParserComponent().da().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public hh(Expression value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f6418a = value;
    }

    public final boolean a(hh hhVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (hhVar == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f6418a.evaluate(resolver), hhVar.f6418a.evaluate(otherResolver));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6419b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(hh.class).hashCode() + this.f6418a.hashCode();
        this.f6419b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ih) BuiltInParserKt.getBuiltInParserComponent().da().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
