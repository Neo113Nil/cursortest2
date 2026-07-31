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

/* renamed from: O1.j1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0875j1 implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f6543c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f6544d = a.f6547i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f6545a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f6546b;

    /* renamed from: O1.j1$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6547i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0875j1 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0875j1.f6543c.a(env, it);
        }
    }

    /* renamed from: O1.j1$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0875j1 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0893k1) BuiltInParserKt.getBuiltInParserComponent().o0().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0875j1(Expression elementId) {
        Intrinsics.checkNotNullParameter(elementId, "elementId");
        this.f6545a = elementId;
    }

    public final boolean a(C0875j1 c0875j1, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0875j1 == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f6545a.evaluate(resolver), c0875j1.f6545a.evaluate(otherResolver));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6546b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0875j1.class).hashCode() + this.f6545a.hashCode();
        this.f6546b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0893k1) BuiltInParserKt.getBuiltInParserComponent().o0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
