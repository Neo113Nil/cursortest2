package O1;

import O1.C8;
import O1.G8;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
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
public final class A8 implements JSONSerializable, Hashable {

    /* renamed from: e, reason: collision with root package name */
    public static final c f1309e = new c(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Expression f1310f = Expression.Companion.constant(0L);

    /* renamed from: g, reason: collision with root package name */
    private static final Function2 f1311g = b.f1322i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f1312a;

    /* renamed from: b, reason: collision with root package name */
    public final List f1313b;

    /* renamed from: c, reason: collision with root package name */
    public final ExpressionList f1314c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f1315d;

    public static final class a implements JSONSerializable, Hashable {

        /* renamed from: d, reason: collision with root package name */
        public static final b f1316d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        private static final Function2 f1317e = C0023a.f1321i;

        /* renamed from: a, reason: collision with root package name */
        public final Expression f1318a;

        /* renamed from: b, reason: collision with root package name */
        public final Expression f1319b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f1320c;

        /* renamed from: O1.A8$a$a, reason: collision with other inner class name */
        static final class C0023a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final C0023a f1321i = new C0023a();

            C0023a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return a.f1316d.a(env, it);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return ((C8.b) BuiltInParserKt.getBuiltInParserComponent().P4().getValue()).deserialize(env, json);
            }

            private b() {
            }
        }

        public a(Expression color, Expression position) {
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(position, "position");
            this.f1318a = color;
            this.f1319b = position;
        }

        public final boolean a(a aVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
            return aVar != null && ((Number) this.f1318a.evaluate(resolver)).intValue() == ((Number) aVar.f1318a.evaluate(otherResolver)).intValue() && ((Number) this.f1319b.evaluate(resolver)).doubleValue() == ((Number) aVar.f1319b.evaluate(otherResolver)).doubleValue();
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f1320c;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = kotlin.jvm.internal.H.b(a.class).hashCode() + this.f1318a.hashCode() + this.f1319b.hashCode();
            this.f1320c = Integer.valueOf(hashCode);
            return hashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((C8.b) BuiltInParserKt.getBuiltInParserComponent().P4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f1322i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A8 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return A8.f1309e.a(env, it);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final A8 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((G8.b) BuiltInParserKt.getBuiltInParserComponent().S4().getValue()).deserialize(env, json);
        }

        private c() {
        }
    }

    public A8(Expression angle, List list, ExpressionList expressionList) {
        Intrinsics.checkNotNullParameter(angle, "angle");
        this.f1312a = angle;
        this.f1313b = list;
        this.f1314c = expressionList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x006a, code lost:
    
        if (r7.f1313b == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(A8 a8, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        List evaluate;
        List evaluate2;
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (a8 != null && ((Number) this.f1312a.evaluate(resolver)).longValue() == ((Number) a8.f1312a.evaluate(otherResolver)).longValue()) {
            List list = this.f1313b;
            if (list != null) {
                List list2 = a8.f1313b;
                if (list2 != null && list.size() == list2.size()) {
                    int i4 = 0;
                    for (Object obj : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (!((a) obj).a((a) list2.get(i4), resolver, otherResolver)) {
                            break;
                        }
                        i4 = i5;
                    }
                    ExpressionList expressionList = this.f1314c;
                    if (expressionList != null && (evaluate = expressionList.evaluate(resolver)) != null) {
                        ExpressionList expressionList2 = a8.f1314c;
                        if (expressionList2 != null && (evaluate2 = expressionList2.evaluate(otherResolver)) != null && evaluate.size() == evaluate2.size()) {
                            int i6 = 0;
                            for (Object obj2 : evaluate) {
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                if (((Number) obj2).intValue() == ((Number) evaluate2.get(i6)).intValue()) {
                                    i6 = i7;
                                }
                            }
                            return true;
                        }
                    } else if (a8.f1314c == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i4;
        Integer num = this.f1315d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(A8.class).hashCode() + this.f1312a.hashCode();
        List list = this.f1313b;
        if (list != null) {
            Iterator it = list.iterator();
            i4 = 0;
            while (it.hasNext()) {
                i4 += ((a) it.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int i5 = hashCode + i4;
        ExpressionList expressionList = this.f1314c;
        int hashCode2 = i5 + (expressionList != null ? expressionList.hashCode() : 0);
        this.f1315d = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((G8.b) BuiltInParserKt.getBuiltInParserComponent().S4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
