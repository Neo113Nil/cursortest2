package O1;

import O1.J3;
import O1.K3;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class H3 implements JSONSerializable, Hashable {

    /* renamed from: e, reason: collision with root package name */
    public static final b f2944e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final String f2945f = "it";

    /* renamed from: g, reason: collision with root package name */
    private static final Function2 f2946g = a.f2951i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f2947a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2948b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2949c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f2950d;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2951i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H3 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return H3.f2944e.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final H3 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((J3.b) BuiltInParserKt.getBuiltInParserComponent().a2().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c implements JSONSerializable, Hashable {

        /* renamed from: e, reason: collision with root package name */
        public static final b f2952e = new b(null);

        /* renamed from: f, reason: collision with root package name */
        private static final Expression f2953f = Expression.Companion.constant(Boolean.TRUE);

        /* renamed from: g, reason: collision with root package name */
        private static final Function2 f2954g = a.f2959i;

        /* renamed from: a, reason: collision with root package name */
        public final Z f2955a;

        /* renamed from: b, reason: collision with root package name */
        public final Expression f2956b;

        /* renamed from: c, reason: collision with root package name */
        public final Expression f2957c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f2958d;

        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f2959i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return c.f2952e.a(env, it);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return ((K3.b) BuiltInParserKt.getBuiltInParserComponent().d2().getValue()).deserialize(env, json);
            }

            private b() {
            }
        }

        public c(Z div, Expression expression, Expression selector) {
            Intrinsics.checkNotNullParameter(div, "div");
            Intrinsics.checkNotNullParameter(selector, "selector");
            this.f2955a = div;
            this.f2956b = expression;
            this.f2957c = selector;
        }

        public final boolean a(c cVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
            if (cVar != null && this.f2955a.a(cVar.f2955a, resolver, otherResolver)) {
                Expression expression = this.f2956b;
                String str = expression != null ? (String) expression.evaluate(resolver) : null;
                Expression expression2 = cVar.f2956b;
                if (Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(otherResolver) : null) && ((Boolean) this.f2957c.evaluate(resolver)).booleanValue() == ((Boolean) cVar.f2957c.evaluate(otherResolver)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f2958d;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = kotlin.jvm.internal.H.b(c.class).hashCode() + this.f2955a.hash();
            Expression expression = this.f2956b;
            int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + this.f2957c.hashCode();
            this.f2958d = Integer.valueOf(hashCode2);
            return hashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((K3.b) BuiltInParserKt.getBuiltInParserComponent().d2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public H3(Expression data, String dataElementName, List prototypes) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(dataElementName, "dataElementName");
        Intrinsics.checkNotNullParameter(prototypes, "prototypes");
        this.f2947a = data;
        this.f2948b = dataElementName;
        this.f2949c = prototypes;
    }

    public final boolean a(H3 h32, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (h32 != null && Intrinsics.areEqual(this.f2947a.evaluate(resolver), h32.f2947a.evaluate(otherResolver)) && Intrinsics.areEqual(this.f2948b, h32.f2948b)) {
            List list = this.f2949c;
            List list2 = h32.f2949c;
            if (list.size() == list2.size()) {
                int i4 = 0;
                for (Object obj : list) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (((c) obj).a((c) list2.get(i4), resolver, otherResolver)) {
                        i4 = i5;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f2950d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(H3.class).hashCode() + this.f2947a.hashCode() + this.f2948b.hashCode();
        Iterator it = this.f2949c.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((c) it.next()).hash();
        }
        int i5 = hashCode + i4;
        this.f2950d = Integer.valueOf(i5);
        return i5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((J3.b) BuiltInParserKt.getBuiltInParserComponent().a2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
