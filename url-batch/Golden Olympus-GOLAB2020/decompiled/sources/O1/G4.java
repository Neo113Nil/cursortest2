package O1;

import O1.H4;
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

/* loaded from: classes2.dex */
public final class G4 implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f2820c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final S5 f2821d = new S5(null == true ? 1 : 0, Expression.Companion.constant(15L), 1, null == true ? 1 : 0);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f2822e = a.f2825i;

    /* renamed from: a, reason: collision with root package name */
    public final S5 f2823a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f2824b;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2825i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G4 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return G4.f2820c.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final G4 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((H4.b) BuiltInParserKt.getBuiltInParserComponent().G2().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public G4(S5 spaceBetweenCenters) {
        Intrinsics.checkNotNullParameter(spaceBetweenCenters, "spaceBetweenCenters");
        this.f2823a = spaceBetweenCenters;
    }

    public final boolean a(G4 g4, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (g4 == null) {
            return false;
        }
        return this.f2823a.a(g4.f2823a, resolver, otherResolver);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f2824b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(G4.class).hashCode() + this.f2823a.hash();
        this.f2824b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((H4.b) BuiltInParserKt.getBuiltInParserComponent().G2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
