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

/* renamed from: O1.xg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1141xg implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f8500d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f8501e = a.f8505i;

    /* renamed from: a, reason: collision with root package name */
    public final String f8502a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f8503b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f8504c;

    /* renamed from: O1.xg$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8505i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1141xg invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1141xg.f8500d.a(env, it);
        }
    }

    /* renamed from: O1.xg$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1141xg a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C1159yg) BuiltInParserKt.getBuiltInParserComponent().I9().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C1141xg(String name, Expression value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f8502a = name;
        this.f8503b = value;
    }

    public final boolean a(C1141xg c1141xg, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c1141xg != null && Intrinsics.areEqual(this.f8502a, c1141xg.f8502a) && ((Number) this.f8503b.evaluate(resolver)).longValue() == ((Number) c1141xg.f8503b.evaluate(otherResolver)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f8504c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1141xg.class).hashCode() + this.f8502a.hashCode() + this.f8503b.hashCode();
        this.f8504c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C1159yg) BuiltInParserKt.getBuiltInParserComponent().I9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
