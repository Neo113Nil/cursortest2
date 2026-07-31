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

/* renamed from: O1.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1160z implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f8664d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f8665e = a.f8669i;

    /* renamed from: a, reason: collision with root package name */
    public final String f8666a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f8667b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f8668c;

    /* renamed from: O1.z$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8669i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1160z invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1160z.f8664d.a(env, it);
        }
    }

    /* renamed from: O1.z$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1160z a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((A) BuiltInParserKt.getBuiltInParserComponent().p().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C1160z(String name, Expression value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f8666a = name;
        this.f8667b = value;
    }

    public final boolean a(C1160z c1160z, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c1160z != null && Intrinsics.areEqual(this.f8666a, c1160z.f8666a) && ((Number) this.f8667b.evaluate(resolver)).intValue() == ((Number) c1160z.f8667b.evaluate(otherResolver)).intValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f8668c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1160z.class).hashCode() + this.f8666a.hashCode() + this.f8667b.hashCode();
        this.f8668c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((A) BuiltInParserKt.getBuiltInParserComponent().p().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
