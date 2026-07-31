package O1;

import O1.AbstractC0985p3;
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

/* renamed from: O1.m3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0931m3 implements JSONSerializable, Hashable {

    /* renamed from: e, reason: collision with root package name */
    public static final b f6971e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Expression f6972f;

    /* renamed from: g, reason: collision with root package name */
    private static final Expression f6973g;

    /* renamed from: h, reason: collision with root package name */
    private static final Expression f6974h;

    /* renamed from: i, reason: collision with root package name */
    private static final Function2 f6975i;

    /* renamed from: a, reason: collision with root package name */
    private final Expression f6976a;

    /* renamed from: b, reason: collision with root package name */
    private final Expression f6977b;

    /* renamed from: c, reason: collision with root package name */
    private final Expression f6978c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f6979d;

    /* renamed from: O1.m3$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6980i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0931m3 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0931m3.f6971e.a(env, it);
        }
    }

    /* renamed from: O1.m3$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0931m3 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0985p3.c) BuiltInParserKt.getBuiltInParserComponent().L1().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f6972f = companion.constant(200L);
        f6973g = companion.constant(EnumC1163z2.EASE_IN_OUT);
        f6974h = companion.constant(0L);
        f6975i = a.f6980i;
    }

    public C0931m3(Expression duration, Expression interpolator, Expression startDelay) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(startDelay, "startDelay");
        this.f6976a = duration;
        this.f6977b = interpolator;
        this.f6978c = startDelay;
    }

    public final boolean a(C0931m3 c0931m3, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c0931m3 != null && ((Number) b().evaluate(resolver)).longValue() == ((Number) c0931m3.b().evaluate(otherResolver)).longValue() && c().evaluate(resolver) == c0931m3.c().evaluate(otherResolver) && ((Number) d().evaluate(resolver)).longValue() == ((Number) c0931m3.d().evaluate(otherResolver)).longValue();
    }

    public Expression b() {
        return this.f6976a;
    }

    public Expression c() {
        return this.f6977b;
    }

    public Expression d() {
        return this.f6978c;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6979d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0931m3.class).hashCode() + b().hashCode() + c().hashCode() + d().hashCode();
        this.f6979d = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0985p3.c) BuiltInParserKt.getBuiltInParserComponent().L1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
