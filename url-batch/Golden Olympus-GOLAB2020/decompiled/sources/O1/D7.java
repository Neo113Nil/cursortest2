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
public final class D7 implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f2458c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f2459d = a.f2462i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f2460a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f2461b;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2462i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D7 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return D7.f2458c.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final D7 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((E7) BuiltInParserKt.getBuiltInParserComponent().m4().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public D7(Expression pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        this.f2460a = pattern;
    }

    public final boolean a(D7 d7, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (d7 == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f2460a.evaluate(resolver), d7.f2460a.evaluate(otherResolver));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f2461b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(D7.class).hashCode() + this.f2460a.hashCode();
        this.f2461b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((E7) BuiltInParserKt.getBuiltInParserComponent().m4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
