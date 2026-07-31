package O1;

import O1.AbstractC0824g3;
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

/* renamed from: O1.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0788e3 implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f6072c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f6073d = a.f6076i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f6074a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f6075b;

    /* renamed from: O1.e3$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6076i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0788e3 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0788e3.f6072c.a(env, it);
        }
    }

    /* renamed from: O1.e3$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0788e3 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0824g3.b) BuiltInParserKt.getBuiltInParserComponent().F1().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0788e3(Expression radius) {
        Intrinsics.checkNotNullParameter(radius, "radius");
        this.f6074a = radius;
    }

    public final boolean a(C0788e3 c0788e3, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c0788e3 != null && ((Number) this.f6074a.evaluate(resolver)).longValue() == ((Number) c0788e3.f6074a.evaluate(otherResolver)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6075b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0788e3.class).hashCode() + this.f6074a.hashCode();
        this.f6075b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0824g3.b) BuiltInParserKt.getBuiltInParserComponent().F1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
