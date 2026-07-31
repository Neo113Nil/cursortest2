package O1;

import O1.AbstractC1054t1;
import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0892k0 implements JSONSerializable, Hashable {

    /* renamed from: m, reason: collision with root package name */
    public static final b f6749m = new b(null);

    /* renamed from: n, reason: collision with root package name */
    private static final Expression f6750n = Expression.Companion.constant(Boolean.TRUE);

    /* renamed from: o, reason: collision with root package name */
    private static final Function2 f6751o = a.f6764i;

    /* renamed from: a, reason: collision with root package name */
    public final S4 f6752a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f6753b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f6754c;

    /* renamed from: d, reason: collision with root package name */
    public final Expression f6755d;

    /* renamed from: e, reason: collision with root package name */
    public final List f6756e;

    /* renamed from: f, reason: collision with root package name */
    public final JSONObject f6757f;

    /* renamed from: g, reason: collision with root package name */
    public final Expression f6758g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6759h;

    /* renamed from: i, reason: collision with root package name */
    public final Expression f6760i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0948n2 f6761j;

    /* renamed from: k, reason: collision with root package name */
    public final Expression f6762k;

    /* renamed from: l, reason: collision with root package name */
    private Integer f6763l;

    /* renamed from: O1.k0$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6764i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0892k0 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0892k0.f6749m.a(env, it);
        }
    }

    /* renamed from: O1.k0$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0892k0 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC1054t1.c) BuiltInParserKt.getBuiltInParserComponent().u0().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.k0$c */
    public static final class c implements JSONSerializable, Hashable {

        /* renamed from: e, reason: collision with root package name */
        public static final b f6765e = new b(null);

        /* renamed from: f, reason: collision with root package name */
        private static final Function2 f6766f = a.f6771i;

        /* renamed from: a, reason: collision with root package name */
        public final C0892k0 f6767a;

        /* renamed from: b, reason: collision with root package name */
        public final List f6768b;

        /* renamed from: c, reason: collision with root package name */
        public final Expression f6769c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f6770d;

        /* renamed from: O1.k0$c$a */
        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f6771i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return c.f6765e.a(env, it);
            }
        }

        /* renamed from: O1.k0$c$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return ((C1072u1) BuiltInParserKt.getBuiltInParserComponent().x0().getValue()).deserialize(env, json);
            }

            private b() {
            }
        }

        public c(C0892k0 c0892k0, List list, Expression text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f6767a = c0892k0;
            this.f6768b = list;
            this.f6769c = text;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        
            if (r8.f6768b == null) goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(c cVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
            boolean z4;
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
            if (cVar == null) {
                return false;
            }
            C0892k0 c0892k0 = this.f6767a;
            if (c0892k0 != null ? c0892k0.a(cVar.f6767a, resolver, otherResolver) : cVar.f6767a == null) {
                List list = this.f6768b;
                if (list != null) {
                    List list2 = cVar.f6768b;
                    if (list2 != null) {
                        if (list.size() == list2.size()) {
                            int i4 = 0;
                            for (Object obj : list) {
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                if (((C0892k0) obj).a((C0892k0) list2.get(i4), resolver, otherResolver)) {
                                    i4 = i5;
                                }
                            }
                            z4 = true;
                        }
                        z4 = false;
                        break;
                    }
                    return false;
                }
                if (z4 && Intrinsics.areEqual(this.f6769c.evaluate(resolver), cVar.f6769c.evaluate(otherResolver))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f6770d;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = kotlin.jvm.internal.H.b(c.class).hashCode();
            C0892k0 c0892k0 = this.f6767a;
            int i4 = 0;
            int hash = hashCode + (c0892k0 != null ? c0892k0.hash() : 0);
            List list = this.f6768b;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i4 += ((C0892k0) it.next()).hash();
                }
            }
            int hashCode2 = hash + i4 + this.f6769c.hashCode();
            this.f6770d = Integer.valueOf(hashCode2);
            return hashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((C1072u1) BuiltInParserKt.getBuiltInParserComponent().x0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* renamed from: O1.k0$d */
    public enum d {
        SELF("_self"),
        BLANK("_blank");


        /* renamed from: c, reason: collision with root package name */
        public static final c f6772c = new c(null);

        /* renamed from: d, reason: collision with root package name */
        public static final Function1 f6773d = b.f6780i;

        /* renamed from: e, reason: collision with root package name */
        public static final Function1 f6774e = a.f6779i;

        /* renamed from: b, reason: collision with root package name */
        private final String f6778b;

        /* renamed from: O1.k0$d$a */
        static final class a extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f6779i = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d invoke(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return d.f6772c.a(value);
            }
        }

        /* renamed from: O1.k0$d$b */
        static final class b extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final b f6780i = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(d value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return d.f6772c.b(value);
            }
        }

        /* renamed from: O1.k0$d$c */
        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                d dVar = d.SELF;
                if (Intrinsics.areEqual(value, dVar.f6778b)) {
                    return dVar;
                }
                d dVar2 = d.BLANK;
                if (Intrinsics.areEqual(value, dVar2.f6778b)) {
                    return dVar2;
                }
                return null;
            }

            public final String b(d obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.f6778b;
            }

            private c() {
            }
        }

        d(String str) {
            this.f6778b = str;
        }
    }

    public C0892k0(S4 s4, Expression isEnabled, Expression logId, Expression expression, List list, JSONObject jSONObject, Expression expression2, String str, Expression expression3, AbstractC0948n2 abstractC0948n2, Expression expression4) {
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(logId, "logId");
        this.f6752a = s4;
        this.f6753b = isEnabled;
        this.f6754c = logId;
        this.f6755d = expression;
        this.f6756e = list;
        this.f6757f = jSONObject;
        this.f6758g = expression2;
        this.f6759h = str;
        this.f6760i = expression3;
        this.f6761j = abstractC0948n2;
        this.f6762k = expression4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ad, code lost:
    
        if (r9.f6756e == null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(C0892k0 c0892k0, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        boolean z4;
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0892k0 == null) {
            return false;
        }
        S4 s4 = this.f6752a;
        if ((s4 != null ? s4.a(c0892k0.f6752a, resolver, otherResolver) : c0892k0.f6752a == null) && ((Boolean) this.f6753b.evaluate(resolver)).booleanValue() == ((Boolean) c0892k0.f6753b.evaluate(otherResolver)).booleanValue() && Intrinsics.areEqual(this.f6754c.evaluate(resolver), c0892k0.f6754c.evaluate(otherResolver))) {
            Expression expression = this.f6755d;
            Uri uri = expression != null ? (Uri) expression.evaluate(resolver) : null;
            Expression expression2 = c0892k0.f6755d;
            if (Intrinsics.areEqual(uri, expression2 != null ? (Uri) expression2.evaluate(otherResolver) : null)) {
                List list = this.f6756e;
                if (list != null) {
                    List list2 = c0892k0.f6756e;
                    if (list2 != null) {
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
                            z4 = true;
                        }
                        z4 = false;
                        break;
                    }
                    return false;
                }
                if (z4 && Intrinsics.areEqual(this.f6757f, c0892k0.f6757f)) {
                    Expression expression3 = this.f6758g;
                    Uri uri2 = expression3 != null ? (Uri) expression3.evaluate(resolver) : null;
                    Expression expression4 = c0892k0.f6758g;
                    if (Intrinsics.areEqual(uri2, expression4 != null ? (Uri) expression4.evaluate(otherResolver) : null) && Intrinsics.areEqual(this.f6759h, c0892k0.f6759h)) {
                        Expression expression5 = this.f6760i;
                        d dVar = expression5 != null ? (d) expression5.evaluate(resolver) : null;
                        Expression expression6 = c0892k0.f6760i;
                        if (dVar == (expression6 != null ? (d) expression6.evaluate(otherResolver) : null)) {
                            AbstractC0948n2 abstractC0948n2 = this.f6761j;
                            if (abstractC0948n2 != null ? abstractC0948n2.a(c0892k0.f6761j, resolver, otherResolver) : c0892k0.f6761j == null) {
                                Expression expression7 = this.f6762k;
                                Uri uri3 = expression7 != null ? (Uri) expression7.evaluate(resolver) : null;
                                Expression expression8 = c0892k0.f6762k;
                                if (Intrinsics.areEqual(uri3, expression8 != null ? (Uri) expression8.evaluate(otherResolver) : null)) {
                                    return true;
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
        int i4;
        Integer num = this.f6763l;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0892k0.class).hashCode();
        S4 s4 = this.f6752a;
        int hash = hashCode + (s4 != null ? s4.hash() : 0) + this.f6753b.hashCode() + this.f6754c.hashCode();
        Expression expression = this.f6755d;
        int hashCode2 = hash + (expression != null ? expression.hashCode() : 0);
        List list = this.f6756e;
        if (list != null) {
            Iterator it = list.iterator();
            i4 = 0;
            while (it.hasNext()) {
                i4 += ((c) it.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int i5 = hashCode2 + i4;
        JSONObject jSONObject = this.f6757f;
        int hashCode3 = i5 + (jSONObject != null ? jSONObject.hashCode() : 0);
        Expression expression2 = this.f6758g;
        int hashCode4 = hashCode3 + (expression2 != null ? expression2.hashCode() : 0);
        String str = this.f6759h;
        int hashCode5 = hashCode4 + (str != null ? str.hashCode() : 0);
        Expression expression3 = this.f6760i;
        int hashCode6 = hashCode5 + (expression3 != null ? expression3.hashCode() : 0);
        AbstractC0948n2 abstractC0948n2 = this.f6761j;
        int hash2 = hashCode6 + (abstractC0948n2 != null ? abstractC0948n2.hash() : 0);
        Expression expression4 = this.f6762k;
        int hashCode7 = hash2 + (expression4 != null ? expression4.hashCode() : 0);
        this.f6763l = Integer.valueOf(hashCode7);
        return hashCode7;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC1054t1.c) BuiltInParserKt.getBuiltInParserComponent().u0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
