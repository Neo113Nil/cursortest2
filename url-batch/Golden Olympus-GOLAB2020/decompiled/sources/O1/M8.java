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

/* loaded from: classes2.dex */
public final class M8 implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f3871c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f3872d = a.f3875i;

    /* renamed from: a, reason: collision with root package name */
    public final S5 f3873a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f3874b;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3875i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M8 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return M8.f3871c.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final M8 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((N8) BuiltInParserKt.getBuiltInParserComponent().Y4().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public M8(S5 neighbourPageWidth) {
        Intrinsics.checkNotNullParameter(neighbourPageWidth, "neighbourPageWidth");
        this.f3873a = neighbourPageWidth;
    }

    public final boolean a(M8 m8, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (m8 == null) {
            return false;
        }
        return this.f3873a.a(m8.f3873a, resolver, otherResolver);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f3874b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(M8.class).hashCode() + this.f3873a.hash();
        this.f3874b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((N8) BuiltInParserKt.getBuiltInParserComponent().Y4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
