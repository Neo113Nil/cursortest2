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
public final class Uc implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f4927b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f4928c = a.f4930i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f4929a;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4930i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uc invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Uc.f4927b.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uc a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Vc) BuiltInParserKt.getBuiltInParserComponent().z7().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public final boolean a(Uc uc, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return uc != null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f4929a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Uc.class).hashCode();
        this.f4929a = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Vc) BuiltInParserKt.getBuiltInParserComponent().z7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
