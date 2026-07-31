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
public final class E implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f2486c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f2487d = a.f2490i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f2488a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f2489b;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2490i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return E.f2486c.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((F) BuiltInParserKt.getBuiltInParserComponent().s().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public E(Expression value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f2488a = value;
    }

    public final boolean a(E e4, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (e4 == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f2488a.evaluate(resolver), e4.f2488a.evaluate(otherResolver));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f2489b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(E.class).hashCode() + this.f2488a.hashCode();
        this.f2489b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((F) BuiltInParserKt.getBuiltInParserComponent().s().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
