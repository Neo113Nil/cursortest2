package O1;

import O1.AbstractC0865i8;
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

/* renamed from: O1.h8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0847h8 implements JSONSerializable, Hashable {

    /* renamed from: f, reason: collision with root package name */
    public static final b f6373f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Expression f6374g = Expression.Companion.constant(Boolean.FALSE);

    /* renamed from: h, reason: collision with root package name */
    private static final Function2 f6375h = a.f6381i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f6376a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f6377b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f6378c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6379d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f6380e;

    /* renamed from: O1.h8$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6381i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0847h8 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0847h8.f6373f.a(env, it);
        }
    }

    /* renamed from: O1.h8$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0847h8 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0865i8.b) BuiltInParserKt.getBuiltInParserComponent().A4().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0847h8(Expression allowEmpty, Expression condition, Expression labelId, String variable) {
        Intrinsics.checkNotNullParameter(allowEmpty, "allowEmpty");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(labelId, "labelId");
        Intrinsics.checkNotNullParameter(variable, "variable");
        this.f6376a = allowEmpty;
        this.f6377b = condition;
        this.f6378c = labelId;
        this.f6379d = variable;
    }

    public final boolean a(C0847h8 c0847h8, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c0847h8 != null && ((Boolean) this.f6376a.evaluate(resolver)).booleanValue() == ((Boolean) c0847h8.f6376a.evaluate(otherResolver)).booleanValue() && ((Boolean) this.f6377b.evaluate(resolver)).booleanValue() == ((Boolean) c0847h8.f6377b.evaluate(otherResolver)).booleanValue() && Intrinsics.areEqual(this.f6378c.evaluate(resolver), c0847h8.f6378c.evaluate(otherResolver)) && Intrinsics.areEqual(this.f6379d, c0847h8.f6379d);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6380e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0847h8.class).hashCode() + this.f6376a.hashCode() + this.f6377b.hashCode() + this.f6378c.hashCode() + this.f6379d.hashCode();
        this.f6380e = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0865i8.b) BuiltInParserKt.getBuiltInParserComponent().A4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
