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

/* renamed from: O1.oa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0974oa implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f7365c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f7366d = a.f7369i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f7367a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f7368b;

    /* renamed from: O1.oa$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7369i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0974oa invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0974oa.f7365c.a(env, it);
        }
    }

    /* renamed from: O1.oa$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0974oa a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0992pa) BuiltInParserKt.getBuiltInParserComponent().T5().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0974oa(Expression value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7367a = value;
    }

    public final boolean a(C0974oa c0974oa, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c0974oa != null && ((Number) this.f7367a.evaluate(resolver)).doubleValue() == ((Number) c0974oa.f7367a.evaluate(otherResolver)).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f7368b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0974oa.class).hashCode() + this.f7367a.hashCode();
        this.f7368b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0992pa) BuiltInParserKt.getBuiltInParserComponent().T5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
