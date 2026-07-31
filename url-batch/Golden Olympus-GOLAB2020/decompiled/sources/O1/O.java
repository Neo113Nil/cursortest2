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
public final class O implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f4179c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f4180d = a.f4183i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f4181a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f4182b;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4183i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return O.f4179c.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final O a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((P) BuiltInParserKt.getBuiltInParserComponent().y().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public O(Expression value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f4181a = value;
    }

    public final boolean a(O o4, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (o4 == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f4181a.evaluate(resolver), o4.f4181a.evaluate(otherResolver));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f4182b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(O.class).hashCode() + this.f4181a.hashCode();
        this.f4182b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((P) BuiltInParserKt.getBuiltInParserComponent().y().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
