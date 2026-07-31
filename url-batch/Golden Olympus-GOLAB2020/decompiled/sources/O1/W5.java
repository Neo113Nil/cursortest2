package O1;

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
public final class W5 implements JSONSerializable, Hashable {

    /* renamed from: g, reason: collision with root package name */
    public static final b f5097g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    private static final Function2 f5098h = a.f5105i;

    /* renamed from: a, reason: collision with root package name */
    public final List f5099a;

    /* renamed from: b, reason: collision with root package name */
    public final C0860i3 f5100b;

    /* renamed from: c, reason: collision with root package name */
    public final c f5101c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5102d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5103e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f5104f;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5105i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W5 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return W5.f5097g.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final W5 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((X5) BuiltInParserKt.getBuiltInParserComponent().w3().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c implements JSONSerializable, Hashable {

        /* renamed from: g, reason: collision with root package name */
        public static final b f5106g = new b(null);

        /* renamed from: h, reason: collision with root package name */
        private static final Function2 f5107h = a.f5114i;

        /* renamed from: a, reason: collision with root package name */
        public final Expression f5108a;

        /* renamed from: b, reason: collision with root package name */
        public final Expression f5109b;

        /* renamed from: c, reason: collision with root package name */
        public final Expression f5110c;

        /* renamed from: d, reason: collision with root package name */
        public final Expression f5111d;

        /* renamed from: e, reason: collision with root package name */
        public final Expression f5112e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f5113f;

        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f5114i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return c.f5106g.a(env, it);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return ((C0719a6) BuiltInParserKt.getBuiltInParserComponent().z3().getValue()).deserialize(env, json);
            }

            private b() {
            }
        }

        public c(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5) {
            this.f5108a = expression;
            this.f5109b = expression2;
            this.f5110c = expression3;
            this.f5111d = expression4;
            this.f5112e = expression5;
        }

        public final boolean a(c cVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
            if (cVar == null) {
                return false;
            }
            Expression expression = this.f5108a;
            String str = expression != null ? (String) expression.evaluate(resolver) : null;
            Expression expression2 = cVar.f5108a;
            if (Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(otherResolver) : null)) {
                Expression expression3 = this.f5109b;
                String str2 = expression3 != null ? (String) expression3.evaluate(resolver) : null;
                Expression expression4 = cVar.f5109b;
                if (Intrinsics.areEqual(str2, expression4 != null ? (String) expression4.evaluate(otherResolver) : null)) {
                    Expression expression5 = this.f5110c;
                    String str3 = expression5 != null ? (String) expression5.evaluate(resolver) : null;
                    Expression expression6 = cVar.f5110c;
                    if (Intrinsics.areEqual(str3, expression6 != null ? (String) expression6.evaluate(otherResolver) : null)) {
                        Expression expression7 = this.f5111d;
                        String str4 = expression7 != null ? (String) expression7.evaluate(resolver) : null;
                        Expression expression8 = cVar.f5111d;
                        if (Intrinsics.areEqual(str4, expression8 != null ? (String) expression8.evaluate(otherResolver) : null)) {
                            Expression expression9 = this.f5112e;
                            String str5 = expression9 != null ? (String) expression9.evaluate(resolver) : null;
                            Expression expression10 = cVar.f5112e;
                            if (Intrinsics.areEqual(str5, expression10 != null ? (String) expression10.evaluate(otherResolver) : null)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f5113f;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = kotlin.jvm.internal.H.b(c.class).hashCode();
            Expression expression = this.f5108a;
            int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
            Expression expression2 = this.f5109b;
            int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
            Expression expression3 = this.f5110c;
            int hashCode4 = hashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            Expression expression4 = this.f5111d;
            int hashCode5 = hashCode4 + (expression4 != null ? expression4.hashCode() : 0);
            Expression expression5 = this.f5112e;
            int hashCode6 = hashCode5 + (expression5 != null ? expression5.hashCode() : 0);
            this.f5113f = Integer.valueOf(hashCode6);
            return hashCode6;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((C0719a6) BuiltInParserKt.getBuiltInParserComponent().z3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public W5(List list, C0860i3 c0860i3, c cVar, List list2, List list3) {
        this.f5099a = list;
        this.f5100b = c0860i3;
        this.f5101c = cVar;
        this.f5102d = list2;
        this.f5103e = list3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fd, code lost:
    
        if (r8 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00b9, code lost:
    
        if (r8.f5102d == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x004f, code lost:
    
        if (r8.f5099a == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(W5 w5, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (w5 == null) {
            return false;
        }
        List list = this.f5099a;
        if (list != null) {
            List list2 = w5.f5099a;
            if (list2 != null && list.size() == list2.size()) {
                int i4 = 0;
                for (Object obj : list) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (!((X2) obj).a((X2) list2.get(i4), resolver, otherResolver)) {
                        break;
                    }
                    i4 = i5;
                }
                C0860i3 c0860i3 = this.f5100b;
                if (c0860i3 != null ? c0860i3.a(w5.f5100b, resolver, otherResolver) : w5.f5100b == null) {
                    c cVar = this.f5101c;
                    if (cVar != null ? cVar.a(w5.f5101c, resolver, otherResolver) : w5.f5101c == null) {
                        List list3 = this.f5102d;
                        if (list3 != null) {
                            List list4 = w5.f5102d;
                            if (list4 != null) {
                                if (list3.size() == list4.size()) {
                                    int i6 = 0;
                                    for (Object obj2 : list3) {
                                        int i7 = i6 + 1;
                                        if (i6 < 0) {
                                            CollectionsKt.throwIndexOverflow();
                                        }
                                        if (((C0892k0) obj2).a((C0892k0) list4.get(i6), resolver, otherResolver)) {
                                            i6 = i7;
                                        }
                                    }
                                    z4 = true;
                                }
                                z4 = false;
                                break;
                            }
                            return false;
                        }
                        if (z4) {
                            List list5 = this.f5103e;
                            List list6 = w5.f5103e;
                            if (list5 != null) {
                                if (list6 != null) {
                                    if (list5.size() == list6.size()) {
                                        int i8 = 0;
                                        for (Object obj3 : list5) {
                                            int i9 = i8 + 1;
                                            if (i8 < 0) {
                                                CollectionsKt.throwIndexOverflow();
                                            }
                                            if (((C0892k0) obj3).a((C0892k0) list6.get(i8), resolver, otherResolver)) {
                                                i8 = i9;
                                            }
                                        }
                                        z5 = true;
                                    }
                                    z5 = false;
                                    break;
                                }
                                return false;
                            }
                            if (z5) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i4;
        int i5;
        Integer num = this.f5104f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(W5.class).hashCode();
        List list = this.f5099a;
        int i6 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            i4 = 0;
            while (it.hasNext()) {
                i4 += ((X2) it.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int i7 = hashCode + i4;
        C0860i3 c0860i3 = this.f5100b;
        int hash = i7 + (c0860i3 != null ? c0860i3.hash() : 0);
        c cVar = this.f5101c;
        int hash2 = hash + (cVar != null ? cVar.hash() : 0);
        List list2 = this.f5102d;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            i5 = 0;
            while (it2.hasNext()) {
                i5 += ((C0892k0) it2.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int i8 = hash2 + i5;
        List list3 = this.f5103e;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                i6 += ((C0892k0) it3.next()).hash();
            }
        }
        int i9 = i8 + i6;
        this.f5104f = Integer.valueOf(i9);
        return i9;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((X5) BuiltInParserKt.getBuiltInParserComponent().w3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
