package O1;

import O1.AbstractC0849ha;
import O1.AbstractC0943mf;
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

/* renamed from: O1.lf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0925lf implements JSONSerializable, Hashable {

    /* renamed from: e, reason: collision with root package name */
    public static final b f6950e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC0849ha.d f6951f;

    /* renamed from: g, reason: collision with root package name */
    private static final AbstractC0849ha.d f6952g;

    /* renamed from: h, reason: collision with root package name */
    private static final Function2 f6953h;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0849ha f6954a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0849ha f6955b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f6956c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f6957d;

    /* renamed from: O1.lf$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6958i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0925lf invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0925lf.f6950e.a(env, it);
        }
    }

    /* renamed from: O1.lf$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0925lf a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0943mf.b) BuiltInParserKt.getBuiltInParserComponent().V8().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double valueOf = Double.valueOf(50.0d);
        f6951f = new AbstractC0849ha.d(new C0974oa(companion.constant(valueOf)));
        f6952g = new AbstractC0849ha.d(new C0974oa(companion.constant(valueOf)));
        f6953h = a.f6958i;
    }

    public C0925lf(AbstractC0849ha pivotX, AbstractC0849ha pivotY, Expression expression) {
        Intrinsics.checkNotNullParameter(pivotX, "pivotX");
        Intrinsics.checkNotNullParameter(pivotY, "pivotY");
        this.f6954a = pivotX;
        this.f6955b = pivotY;
        this.f6956c = expression;
    }

    public final boolean a(C0925lf c0925lf, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0925lf != null && this.f6954a.a(c0925lf.f6954a, resolver, otherResolver) && this.f6955b.a(c0925lf.f6955b, resolver, otherResolver)) {
            Expression expression = this.f6956c;
            Double d4 = expression != null ? (Double) expression.evaluate(resolver) : null;
            Expression expression2 = c0925lf.f6956c;
            if (Intrinsics.areEqual(d4, expression2 != null ? (Double) expression2.evaluate(otherResolver) : null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6957d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0925lf.class).hashCode() + this.f6954a.hash() + this.f6955b.hash();
        Expression expression = this.f6956c;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        this.f6957d = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0943mf.b) BuiltInParserKt.getBuiltInParserComponent().V8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
