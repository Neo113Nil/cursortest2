package O1;

import O1.Oc;
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
public final class Mc implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f3896d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final S5 f3897e;

    /* renamed from: f, reason: collision with root package name */
    private static final Expression f3898f;

    /* renamed from: g, reason: collision with root package name */
    private static final Function2 f3899g;

    /* renamed from: a, reason: collision with root package name */
    public final S5 f3900a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f3901b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f3902c;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3903i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Mc invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Mc.f3896d.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Mc a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Oc.b) BuiltInParserKt.getBuiltInParserComponent().t7().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f3897e = new S5(null == true ? 1 : 0, companion.constant(5L), 1, null == true ? 1 : 0);
        f3898f = companion.constant(10L);
        f3899g = a.f3903i;
    }

    public Mc(S5 itemSpacing, Expression maxVisibleItems) {
        Intrinsics.checkNotNullParameter(itemSpacing, "itemSpacing");
        Intrinsics.checkNotNullParameter(maxVisibleItems, "maxVisibleItems");
        this.f3900a = itemSpacing;
        this.f3901b = maxVisibleItems;
    }

    public final boolean a(Mc mc, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return mc != null && this.f3900a.a(mc.f3900a, resolver, otherResolver) && ((Number) this.f3901b.evaluate(resolver)).longValue() == ((Number) mc.f3901b.evaluate(otherResolver)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f3902c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Mc.class).hashCode() + this.f3900a.hash() + this.f3901b.hashCode();
        this.f3902c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Oc.b) BuiltInParserKt.getBuiltInParserComponent().t7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
