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

/* renamed from: O1.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1000q0 implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f7551c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f7552d = a.f7555i;

    /* renamed from: a, reason: collision with root package name */
    public final String f7553a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f7554b;

    /* renamed from: O1.q0$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7555i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1000q0 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1000q0.f7551c.a(env, it);
        }
    }

    /* renamed from: O1.q0$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1000q0 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C1017r0) BuiltInParserKt.getBuiltInParserComponent().N().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C1000q0(String animatorId) {
        Intrinsics.checkNotNullParameter(animatorId, "animatorId");
        this.f7553a = animatorId;
    }

    public final boolean a(C1000q0 c1000q0, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c1000q0 == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f7553a, c1000q0.f7553a);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f7554b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1000q0.class).hashCode() + this.f7553a.hashCode();
        this.f7554b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C1017r0) BuiltInParserKt.getBuiltInParserComponent().N().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
