package O1;

import O1.AbstractC0964o0;
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

/* renamed from: O1.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0910l0 implements JSONSerializable, Hashable {

    /* renamed from: j, reason: collision with root package name */
    public static final b f6877j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    private static final Function2 f6878k = a.f6888i;

    /* renamed from: a, reason: collision with root package name */
    public final String f6879a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f6880b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f6881c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1086uf f6882d;

    /* renamed from: e, reason: collision with root package name */
    public final Expression f6883e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0861i4 f6884f;

    /* renamed from: g, reason: collision with root package name */
    public final Expression f6885g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC1086uf f6886h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f6887i;

    /* renamed from: O1.l0$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6888i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0910l0 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0910l0.f6877j.a(env, it);
        }
    }

    /* renamed from: O1.l0$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0910l0 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0964o0.d) BuiltInParserKt.getBuiltInParserComponent().K().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0910l0(String animatorId, Expression expression, Expression expression2, AbstractC1086uf abstractC1086uf, Expression expression3, AbstractC0861i4 abstractC0861i4, Expression expression4, AbstractC1086uf abstractC1086uf2) {
        Intrinsics.checkNotNullParameter(animatorId, "animatorId");
        this.f6879a = animatorId;
        this.f6880b = expression;
        this.f6881c = expression2;
        this.f6882d = abstractC1086uf;
        this.f6883e = expression3;
        this.f6884f = abstractC0861i4;
        this.f6885g = expression4;
        this.f6886h = abstractC1086uf2;
    }

    public final boolean a(C0910l0 c0910l0, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0910l0 != null && Intrinsics.areEqual(this.f6879a, c0910l0.f6879a)) {
            Expression expression = this.f6880b;
            EnumC1145y2 enumC1145y2 = expression != null ? (EnumC1145y2) expression.evaluate(resolver) : null;
            Expression expression2 = c0910l0.f6880b;
            if (enumC1145y2 == (expression2 != null ? (EnumC1145y2) expression2.evaluate(otherResolver) : null)) {
                Expression expression3 = this.f6881c;
                Long l4 = expression3 != null ? (Long) expression3.evaluate(resolver) : null;
                Expression expression4 = c0910l0.f6881c;
                if (Intrinsics.areEqual(l4, expression4 != null ? (Long) expression4.evaluate(otherResolver) : null)) {
                    AbstractC1086uf abstractC1086uf = this.f6882d;
                    if (abstractC1086uf != null ? abstractC1086uf.a(c0910l0.f6882d, resolver, otherResolver) : c0910l0.f6882d == null) {
                        Expression expression5 = this.f6883e;
                        EnumC1163z2 enumC1163z2 = expression5 != null ? (EnumC1163z2) expression5.evaluate(resolver) : null;
                        Expression expression6 = c0910l0.f6883e;
                        if (enumC1163z2 == (expression6 != null ? (EnumC1163z2) expression6.evaluate(otherResolver) : null)) {
                            AbstractC0861i4 abstractC0861i4 = this.f6884f;
                            if (abstractC0861i4 != null ? abstractC0861i4.a(c0910l0.f6884f, resolver, otherResolver) : c0910l0.f6884f == null) {
                                Expression expression7 = this.f6885g;
                                Long l5 = expression7 != null ? (Long) expression7.evaluate(resolver) : null;
                                Expression expression8 = c0910l0.f6885g;
                                if (Intrinsics.areEqual(l5, expression8 != null ? (Long) expression8.evaluate(otherResolver) : null)) {
                                    AbstractC1086uf abstractC1086uf2 = this.f6886h;
                                    AbstractC1086uf abstractC1086uf3 = c0910l0.f6886h;
                                    if (abstractC1086uf2 != null ? abstractC1086uf2.a(abstractC1086uf3, resolver, otherResolver) : abstractC1086uf3 == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6887i;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0910l0.class).hashCode() + this.f6879a.hashCode();
        Expression expression = this.f6880b;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.f6881c;
        int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        AbstractC1086uf abstractC1086uf = this.f6882d;
        int hash = hashCode3 + (abstractC1086uf != null ? abstractC1086uf.hash() : 0);
        Expression expression3 = this.f6883e;
        int hashCode4 = hash + (expression3 != null ? expression3.hashCode() : 0);
        AbstractC0861i4 abstractC0861i4 = this.f6884f;
        int hash2 = hashCode4 + (abstractC0861i4 != null ? abstractC0861i4.hash() : 0);
        Expression expression4 = this.f6885g;
        int hashCode5 = hash2 + (expression4 != null ? expression4.hashCode() : 0);
        AbstractC1086uf abstractC1086uf2 = this.f6886h;
        int hash3 = hashCode5 + (abstractC1086uf2 != null ? abstractC1086uf2.hash() : 0);
        this.f6887i = Integer.valueOf(hash3);
        return hash3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0964o0.d) BuiltInParserKt.getBuiltInParserComponent().K().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
