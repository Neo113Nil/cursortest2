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

/* renamed from: O1.ua, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1081ua implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f8165d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f8166e = a.f8170i;

    /* renamed from: a, reason: collision with root package name */
    public final J4 f8167a;

    /* renamed from: b, reason: collision with root package name */
    public final J4 f8168b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f8169c;

    /* renamed from: O1.ua$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8170i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1081ua invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1081ua.f8165d.a(env, it);
        }
    }

    /* renamed from: O1.ua$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1081ua a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C1099va) BuiltInParserKt.getBuiltInParserComponent().W5().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C1081ua(J4 x4, J4 y4) {
        Intrinsics.checkNotNullParameter(x4, "x");
        Intrinsics.checkNotNullParameter(y4, "y");
        this.f8167a = x4;
        this.f8168b = y4;
    }

    public final boolean a(C1081ua c1081ua, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c1081ua != null && this.f8167a.a(c1081ua.f8167a, resolver, otherResolver) && this.f8168b.a(c1081ua.f8168b, resolver, otherResolver);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f8169c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1081ua.class).hashCode() + this.f8167a.hash() + this.f8168b.hash();
        this.f8169c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C1099va) BuiltInParserKt.getBuiltInParserComponent().W5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
