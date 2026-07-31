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

/* renamed from: O1.v7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1096v7 implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f8224c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f8225d = a.f8228i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f8226a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f8227b;

    /* renamed from: O1.v7$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8228i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1096v7 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1096v7.f8224c.a(env, it);
        }
    }

    /* renamed from: O1.v7$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1096v7 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C1114w7) BuiltInParserKt.getBuiltInParserComponent().g4().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C1096v7(Expression condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        this.f8226a = condition;
    }

    public final boolean a(C1096v7 c1096v7, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c1096v7 != null && ((Boolean) this.f8226a.evaluate(resolver)).booleanValue() == ((Boolean) c1096v7.f8226a.evaluate(otherResolver)).booleanValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f8227b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1096v7.class).hashCode() + this.f8226a.hashCode();
        this.f8227b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C1114w7) BuiltInParserKt.getBuiltInParserComponent().g4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
