package O1;

import O1.AbstractC0841h2;
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

/* renamed from: O1.a2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0715a2 implements JSONSerializable, Hashable {

    /* renamed from: f, reason: collision with root package name */
    public static final b f5587f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Function2 f5588g = a.f5594i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f5589a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5590b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5591c;

    /* renamed from: d, reason: collision with root package name */
    public final c f5592d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f5593e;

    /* renamed from: O1.a2$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5594i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0715a2 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0715a2.f5587f.a(env, it);
        }
    }

    /* renamed from: O1.a2$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0715a2 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0733b2) BuiltInParserKt.getBuiltInParserComponent().V0().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.a2$c */
    public static final class c implements JSONSerializable, Hashable {

        /* renamed from: e, reason: collision with root package name */
        public static final b f5595e = new b(null);

        /* renamed from: f, reason: collision with root package name */
        private static final Expression f5596f = Expression.Companion.constant(d.POST);

        /* renamed from: g, reason: collision with root package name */
        private static final Function2 f5597g = a.f5602i;

        /* renamed from: a, reason: collision with root package name */
        public final List f5598a;

        /* renamed from: b, reason: collision with root package name */
        public final Expression f5599b;

        /* renamed from: c, reason: collision with root package name */
        public final Expression f5600c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f5601d;

        /* renamed from: O1.a2$c$a */
        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f5602i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return c.f5595e.a(env, it);
            }
        }

        /* renamed from: O1.a2$c$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return ((AbstractC0841h2.c) BuiltInParserKt.getBuiltInParserComponent().b1().getValue()).deserialize(env, json);
            }

            private b() {
            }
        }

        /* renamed from: O1.a2$c$c, reason: collision with other inner class name */
        public static final class C0039c implements JSONSerializable, Hashable {

            /* renamed from: d, reason: collision with root package name */
            public static final b f5603d = new b(null);

            /* renamed from: e, reason: collision with root package name */
            private static final Function2 f5604e = a.f5608i;

            /* renamed from: a, reason: collision with root package name */
            public final Expression f5605a;

            /* renamed from: b, reason: collision with root package name */
            public final Expression f5606b;

            /* renamed from: c, reason: collision with root package name */
            private Integer f5607c;

            /* renamed from: O1.a2$c$c$a */
            static final class a extends kotlin.jvm.internal.s implements Function2 {

                /* renamed from: i, reason: collision with root package name */
                public static final a f5608i = new a();

                a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0039c invoke(ParsingEnvironment env, JSONObject it) {
                    Intrinsics.checkNotNullParameter(env, "env");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return C0039c.f5603d.a(env, it);
                }
            }

            /* renamed from: O1.a2$c$c$b */
            public static final class b {
                public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C0039c a(ParsingEnvironment env, JSONObject json) {
                    Intrinsics.checkNotNullParameter(env, "env");
                    Intrinsics.checkNotNullParameter(json, "json");
                    return ((C0787e2) BuiltInParserKt.getBuiltInParserComponent().Y0().getValue()).deserialize(env, json);
                }

                private b() {
                }
            }

            public C0039c(Expression name, Expression value) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                this.f5605a = name;
                this.f5606b = value;
            }

            public final boolean a(C0039c c0039c, ExpressionResolver resolver, ExpressionResolver otherResolver) {
                Intrinsics.checkNotNullParameter(resolver, "resolver");
                Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
                return c0039c != null && Intrinsics.areEqual(this.f5605a.evaluate(resolver), c0039c.f5605a.evaluate(otherResolver)) && Intrinsics.areEqual(this.f5606b.evaluate(resolver), c0039c.f5606b.evaluate(otherResolver));
            }

            @Override // com.yandex.div.data.Hashable
            public int hash() {
                Integer num = this.f5607c;
                if (num != null) {
                    return num.intValue();
                }
                int hashCode = kotlin.jvm.internal.H.b(C0039c.class).hashCode() + this.f5605a.hashCode() + this.f5606b.hashCode();
                this.f5607c = Integer.valueOf(hashCode);
                return hashCode;
            }

            @Override // com.yandex.div.json.JSONSerializable
            public JSONObject writeToJSON() {
                return ((C0787e2) BuiltInParserKt.getBuiltInParserComponent().Y0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
            }
        }

        /* renamed from: O1.a2$c$d */
        public enum d {
            GET("get"),
            POST("post"),
            PUT("put"),
            PATCH("patch"),
            DELETE("delete"),
            HEAD("head"),
            OPTIONS("options");


            /* renamed from: c, reason: collision with root package name */
            public static final C0040c f5609c = new C0040c(null);

            /* renamed from: d, reason: collision with root package name */
            public static final Function1 f5610d = b.f5622i;

            /* renamed from: e, reason: collision with root package name */
            public static final Function1 f5611e = a.f5621i;

            /* renamed from: b, reason: collision with root package name */
            private final String f5620b;

            /* renamed from: O1.a2$c$d$a */
            static final class a extends kotlin.jvm.internal.s implements Function1 {

                /* renamed from: i, reason: collision with root package name */
                public static final a f5621i = new a();

                a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d invoke(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return d.f5609c.a(value);
                }
            }

            /* renamed from: O1.a2$c$d$b */
            static final class b extends kotlin.jvm.internal.s implements Function1 {

                /* renamed from: i, reason: collision with root package name */
                public static final b f5622i = new b();

                b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(d value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return d.f5609c.b(value);
                }
            }

            /* renamed from: O1.a2$c$d$c, reason: collision with other inner class name */
            public static final class C0040c {
                public /* synthetic */ C0040c(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final d a(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    d dVar = d.GET;
                    if (Intrinsics.areEqual(value, dVar.f5620b)) {
                        return dVar;
                    }
                    d dVar2 = d.POST;
                    if (Intrinsics.areEqual(value, dVar2.f5620b)) {
                        return dVar2;
                    }
                    d dVar3 = d.PUT;
                    if (Intrinsics.areEqual(value, dVar3.f5620b)) {
                        return dVar3;
                    }
                    d dVar4 = d.PATCH;
                    if (Intrinsics.areEqual(value, dVar4.f5620b)) {
                        return dVar4;
                    }
                    d dVar5 = d.DELETE;
                    if (Intrinsics.areEqual(value, dVar5.f5620b)) {
                        return dVar5;
                    }
                    d dVar6 = d.HEAD;
                    if (Intrinsics.areEqual(value, dVar6.f5620b)) {
                        return dVar6;
                    }
                    d dVar7 = d.OPTIONS;
                    if (Intrinsics.areEqual(value, dVar7.f5620b)) {
                        return dVar7;
                    }
                    return null;
                }

                public final String b(d obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return obj.f5620b;
                }

                private C0040c() {
                }
            }

            d(String str) {
                this.f5620b = str;
            }
        }

        public c(List list, Expression method, Expression url) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(url, "url");
            this.f5598a = list;
            this.f5599b = method;
            this.f5600c = url;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
        
            if (r7.f5598a == null) goto L25;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(c cVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
            if (cVar == null) {
                return false;
            }
            List list = this.f5598a;
            if (list != null) {
                List list2 = cVar.f5598a;
                if (list2 != null && list.size() == list2.size()) {
                    int i4 = 0;
                    for (Object obj : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (!((C0039c) obj).a((C0039c) list2.get(i4), resolver, otherResolver)) {
                            break;
                        }
                        i4 = i5;
                    }
                    if (this.f5599b.evaluate(resolver) != cVar.f5599b.evaluate(otherResolver) || !Intrinsics.areEqual(this.f5600c.evaluate(resolver), cVar.f5600c.evaluate(otherResolver))) {
                        break;
                    }
                    return true;
                }
                return false;
            }
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f5601d;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = kotlin.jvm.internal.H.b(c.class).hashCode();
            List list = this.f5598a;
            int i4 = 0;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i4 += ((C0039c) it.next()).hash();
                }
            }
            int hashCode2 = hashCode + i4 + this.f5599b.hashCode() + this.f5600c.hashCode();
            this.f5601d = Integer.valueOf(hashCode2);
            return hashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((AbstractC0841h2.c) BuiltInParserKt.getBuiltInParserComponent().b1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public C0715a2(Expression containerId, List list, List list2, c request) {
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f5589a = containerId;
        this.f5590b = list;
        this.f5591c = list2;
        this.f5592d = request;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a1, code lost:
    
        if (r7.f5591c == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0060, code lost:
    
        if (r7.f5590b == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(C0715a2 c0715a2, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0715a2 != null && Intrinsics.areEqual(this.f5589a.evaluate(resolver), c0715a2.f5589a.evaluate(otherResolver))) {
            List list = this.f5590b;
            if (list != null) {
                List list2 = c0715a2.f5590b;
                if (list2 != null && list.size() == list2.size()) {
                    int i4 = 0;
                    for (Object obj : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (!((C0892k0) obj).a((C0892k0) list2.get(i4), resolver, otherResolver)) {
                            break;
                        }
                        i4 = i5;
                    }
                    List list3 = this.f5591c;
                    if (list3 != null) {
                        List list4 = c0715a2.f5591c;
                        if (list4 != null && list3.size() == list4.size()) {
                            int i6 = 0;
                            for (Object obj2 : list3) {
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                if (!((C0892k0) obj2).a((C0892k0) list4.get(i6), resolver, otherResolver)) {
                                    break;
                                }
                                i6 = i7;
                            }
                            if (this.f5592d.a(c0715a2.f5592d, resolver, otherResolver)) {
                                return true;
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
        Integer num = this.f5593e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0715a2.class).hashCode() + this.f5589a.hashCode();
        List list = this.f5590b;
        int i5 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            i4 = 0;
            while (it.hasNext()) {
                i4 += ((C0892k0) it.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int i6 = hashCode + i4;
        List list2 = this.f5591c;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                i5 += ((C0892k0) it2.next()).hash();
            }
        }
        int hash = i6 + i5 + this.f5592d.hash();
        this.f5593e = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0733b2) BuiltInParserKt.getBuiltInParserComponent().V0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
