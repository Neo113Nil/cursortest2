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
public final class Xg implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f5285c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f5286d = a.f5289i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f5287a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f5288b;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5289i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Xg invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Xg.f5285c.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Xg a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Yg) BuiltInParserKt.getBuiltInParserComponent().X9().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public Xg(Expression value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f5287a = value;
    }

    public final boolean a(Xg xg, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (xg == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f5287a.evaluate(resolver), xg.f5287a.evaluate(otherResolver));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f5288b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Xg.class).hashCode() + this.f5287a.hashCode();
        this.f5288b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Yg) BuiltInParserKt.getBuiltInParserComponent().X9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
