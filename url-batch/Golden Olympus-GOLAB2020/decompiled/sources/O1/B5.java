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
public final class B5 implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f1454b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f1455c = a.f1457i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f1456a;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f1457i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final B5 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return B5.f1454b.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final B5 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C5) BuiltInParserKt.getBuiltInParserComponent().h3().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public final boolean a(B5 b5, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return b5 != null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f1456a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(B5.class).hashCode();
        this.f1456a = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C5) BuiltInParserKt.getBuiltInParserComponent().h3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
