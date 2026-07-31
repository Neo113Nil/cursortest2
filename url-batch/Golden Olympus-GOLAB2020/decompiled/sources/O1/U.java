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
public final class U implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f4898d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f4899e = a.f4903i;

    /* renamed from: a, reason: collision with root package name */
    public final String f4900a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f4901b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f4902c;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4903i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return U.f4898d.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final U a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((V) BuiltInParserKt.getBuiltInParserComponent().B().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public U(String name, Expression value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f4900a = name;
        this.f4901b = value;
    }

    public final boolean a(U u4, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return u4 != null && Intrinsics.areEqual(this.f4900a, u4.f4900a) && Intrinsics.areEqual(this.f4901b.evaluate(resolver), u4.f4901b.evaluate(otherResolver));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f4902c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(U.class).hashCode() + this.f4900a.hashCode() + this.f4901b.hashCode();
        this.f4902c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((V) BuiltInParserKt.getBuiltInParserComponent().B().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
