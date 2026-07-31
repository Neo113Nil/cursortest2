package O1;

import O1.N5;
import O1.Q5;
import com.huawei.hms.framework.common.BundleUtil;
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
public final class L5 implements JSONSerializable, Hashable, U7 {

    /* renamed from: f, reason: collision with root package name */
    public static final b f3679f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Expression f3680g = Expression.Companion.constant(Boolean.FALSE);

    /* renamed from: h, reason: collision with root package name */
    private static final Function2 f3681h = a.f3687i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f3682a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f3683b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3684c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3685d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f3686e;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3687i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L5 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return L5.f3679f.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final L5 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((N5.b) BuiltInParserKt.getBuiltInParserComponent().n3().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c implements JSONSerializable, Hashable {

        /* renamed from: e, reason: collision with root package name */
        public static final b f3688e = new b(null);

        /* renamed from: f, reason: collision with root package name */
        private static final Expression f3689f = Expression.Companion.constant(BundleUtil.UNDERLINE_TAG);

        /* renamed from: g, reason: collision with root package name */
        private static final Function2 f3690g = a.f3695i;

        /* renamed from: a, reason: collision with root package name */
        public final Expression f3691a;

        /* renamed from: b, reason: collision with root package name */
        public final Expression f3692b;

        /* renamed from: c, reason: collision with root package name */
        public final Expression f3693c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f3694d;

        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f3695i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return c.f3688e.a(env, it);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return ((Q5.b) BuiltInParserKt.getBuiltInParserComponent().q3().getValue()).deserialize(env, json);
            }

            private b() {
            }
        }

        public c(Expression key, Expression placeholder, Expression expression) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            this.f3691a = key;
            this.f3692b = placeholder;
            this.f3693c = expression;
        }

        public final boolean a(c cVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
            if (cVar != null && Intrinsics.areEqual(this.f3691a.evaluate(resolver), cVar.f3691a.evaluate(otherResolver)) && Intrinsics.areEqual(this.f3692b.evaluate(resolver), cVar.f3692b.evaluate(otherResolver))) {
                Expression expression = this.f3693c;
                String str = expression != null ? (String) expression.evaluate(resolver) : null;
                Expression expression2 = cVar.f3693c;
                if (Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(otherResolver) : null)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f3694d;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = kotlin.jvm.internal.H.b(c.class).hashCode() + this.f3691a.hashCode() + this.f3692b.hashCode();
            Expression expression = this.f3693c;
            int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
            this.f3694d = Integer.valueOf(hashCode2);
            return hashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((Q5.b) BuiltInParserKt.getBuiltInParserComponent().q3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public L5(Expression alwaysVisible, Expression pattern, List patternElements, String rawTextVariable) {
        Intrinsics.checkNotNullParameter(alwaysVisible, "alwaysVisible");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(patternElements, "patternElements");
        Intrinsics.checkNotNullParameter(rawTextVariable, "rawTextVariable");
        this.f3682a = alwaysVisible;
        this.f3683b = pattern;
        this.f3684c = patternElements;
        this.f3685d = rawTextVariable;
    }

    @Override // O1.U7
    public String a() {
        return this.f3685d;
    }

    public final boolean b(L5 l5, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (l5 != null && ((Boolean) this.f3682a.evaluate(resolver)).booleanValue() == ((Boolean) l5.f3682a.evaluate(otherResolver)).booleanValue() && Intrinsics.areEqual(this.f3683b.evaluate(resolver), l5.f3683b.evaluate(otherResolver))) {
            List list = this.f3684c;
            List list2 = l5.f3684c;
            if (list.size() == list2.size()) {
                Iterator it = list.iterator();
                int i4 = 0;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (!((c) next).a((c) list2.get(i4), resolver, otherResolver)) {
                            break;
                        }
                        i4 = i5;
                    } else if (Intrinsics.areEqual(a(), l5.a())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f3686e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(L5.class).hashCode() + this.f3682a.hashCode() + this.f3683b.hashCode();
        Iterator it = this.f3684c.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((c) it.next()).hash();
        }
        int hashCode2 = hashCode + i4 + a().hashCode();
        this.f3686e = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((N5.b) BuiltInParserKt.getBuiltInParserComponent().n3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
