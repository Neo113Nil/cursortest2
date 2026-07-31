package O1;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.m5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0933m5 implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f6986d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f6987e = a.f6991i;

    /* renamed from: a, reason: collision with root package name */
    public final String f6988a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f6989b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f6990c;

    /* renamed from: O1.m5$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6991i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0933m5 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0933m5.f6986d.a(env, it);
        }
    }

    /* renamed from: O1.m5$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0933m5 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0951n5) BuiltInParserKt.getBuiltInParserComponent().Y2().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0933m5(String id, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f6988a = id;
        this.f6989b = jSONObject;
    }

    public final boolean a(C0933m5 c0933m5, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c0933m5 != null && Intrinsics.areEqual(this.f6988a, c0933m5.f6988a) && Intrinsics.areEqual(this.f6989b, c0933m5.f6989b);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6990c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0933m5.class).hashCode() + this.f6988a.hashCode();
        JSONObject jSONObject = this.f6989b;
        int hashCode2 = hashCode + (jSONObject != null ? jSONObject.hashCode() : 0);
        this.f6990c = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0951n5) BuiltInParserKt.getBuiltInParserComponent().Y2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
