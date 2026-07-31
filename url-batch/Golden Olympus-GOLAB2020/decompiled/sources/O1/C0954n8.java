package O1;

import O1.AbstractC0972o8;
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

/* renamed from: O1.n8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0954n8 implements JSONSerializable, Hashable {

    /* renamed from: f, reason: collision with root package name */
    public static final b f7214f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Expression f7215g = Expression.Companion.constant(Boolean.FALSE);

    /* renamed from: h, reason: collision with root package name */
    private static final Function2 f7216h = a.f7222i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f7217a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f7218b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f7219c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7220d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f7221e;

    /* renamed from: O1.n8$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7222i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0954n8 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0954n8.f7214f.a(env, it);
        }
    }

    /* renamed from: O1.n8$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0954n8 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0972o8.b) BuiltInParserKt.getBuiltInParserComponent().G4().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0954n8(Expression allowEmpty, Expression labelId, Expression pattern, String variable) {
        Intrinsics.checkNotNullParameter(allowEmpty, "allowEmpty");
        Intrinsics.checkNotNullParameter(labelId, "labelId");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(variable, "variable");
        this.f7217a = allowEmpty;
        this.f7218b = labelId;
        this.f7219c = pattern;
        this.f7220d = variable;
    }

    public final boolean a(C0954n8 c0954n8, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c0954n8 != null && ((Boolean) this.f7217a.evaluate(resolver)).booleanValue() == ((Boolean) c0954n8.f7217a.evaluate(otherResolver)).booleanValue() && Intrinsics.areEqual(this.f7218b.evaluate(resolver), c0954n8.f7218b.evaluate(otherResolver)) && Intrinsics.areEqual(this.f7219c.evaluate(resolver), c0954n8.f7219c.evaluate(otherResolver)) && Intrinsics.areEqual(this.f7220d, c0954n8.f7220d);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f7221e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0954n8.class).hashCode() + this.f7217a.hashCode() + this.f7218b.hashCode() + this.f7219c.hashCode() + this.f7220d.hashCode();
        this.f7221e = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0972o8.b) BuiltInParserKt.getBuiltInParserComponent().G4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
