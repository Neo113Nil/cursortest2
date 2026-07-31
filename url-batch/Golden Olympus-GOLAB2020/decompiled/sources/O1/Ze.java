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
public final class Ze implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f5564b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f5565c = a.f5567i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f5566a;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5567i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ze invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Ze.f5564b.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ze a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0728af) BuiltInParserKt.getBuiltInParserComponent().P8().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public final boolean a(Ze ze, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return ze != null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f5566a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Ze.class).hashCode();
        this.f5566a = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0728af) BuiltInParserKt.getBuiltInParserComponent().P8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
