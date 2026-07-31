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
public final class Ig implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f3281d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f3282e = a.f3286i;

    /* renamed from: a, reason: collision with root package name */
    public final String f3283a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f3284b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f3285c;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3286i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ig invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Ig.f3281d.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ig a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Jg) BuiltInParserKt.getBuiltInParserComponent().O9().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public Ig(String name, Expression value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f3283a = name;
        this.f3284b = value;
    }

    public final boolean a(Ig ig, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return ig != null && Intrinsics.areEqual(this.f3283a, ig.f3283a) && ((Number) this.f3284b.evaluate(resolver)).doubleValue() == ((Number) ig.f3284b.evaluate(otherResolver)).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f3285c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Ig.class).hashCode() + this.f3283a.hashCode() + this.f3284b.hashCode();
        this.f3285c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Jg) BuiltInParserKt.getBuiltInParserComponent().O9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
