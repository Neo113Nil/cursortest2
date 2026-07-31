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

/* renamed from: O1.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0965o1 implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f7251c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f7252d = a.f7255i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f7253a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f7254b;

    /* renamed from: O1.o1$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7255i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0965o1 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0965o1.f7251c.a(env, it);
        }
    }

    /* renamed from: O1.o1$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0965o1 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0983p1) BuiltInParserKt.getBuiltInParserComponent().r0().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0965o1(Expression id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f7253a = id;
    }

    public final boolean a(C0965o1 c0965o1, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0965o1 == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f7253a.evaluate(resolver), c0965o1.f7253a.evaluate(otherResolver));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f7254b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0965o1.class).hashCode() + this.f7253a.hashCode();
        this.f7254b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0983p1) BuiltInParserKt.getBuiltInParserComponent().r0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
