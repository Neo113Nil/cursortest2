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
public final class P0 implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f4288c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f4289d = a.f4292i;

    /* renamed from: a, reason: collision with root package name */
    public final Q0 f4290a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f4291b;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4292i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P0 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return P0.f4288c.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final P0 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((V0) BuiltInParserKt.getBuiltInParserComponent().f0().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public P0(Q0 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f4290a = content;
    }

    public final boolean a(P0 p02, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (p02 == null) {
            return false;
        }
        return this.f4290a.a(p02.f4290a, resolver, otherResolver);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f4291b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(P0.class).hashCode() + this.f4290a.hash();
        this.f4291b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((V0) BuiltInParserKt.getBuiltInParserComponent().f0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
