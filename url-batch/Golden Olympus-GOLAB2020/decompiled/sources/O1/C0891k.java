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

/* renamed from: O1.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0891k implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f6744c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f6745d = a.f6748i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f6746a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f6747b;

    /* renamed from: O1.k$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6748i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0891k invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0891k.f6744c.a(env, it);
        }
    }

    /* renamed from: O1.k$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0891k a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0909l) BuiltInParserKt.getBuiltInParserComponent().g().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0891k(Expression value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f6746a = value;
    }

    public final boolean a(C0891k c0891k, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c0891k != null && ((Boolean) this.f6746a.evaluate(resolver)).booleanValue() == ((Boolean) c0891k.f6746a.evaluate(otherResolver)).booleanValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6747b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0891k.class).hashCode() + this.f6746a.hashCode();
        this.f6747b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0909l) BuiltInParserKt.getBuiltInParserComponent().g().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
