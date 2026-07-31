package O1;

import O1.W9;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class R9 implements JSONSerializable, Hashable {

    /* renamed from: f, reason: collision with root package name */
    public static final c f4651f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Expression f4652g = Expression.Companion.constant(d.PARTIAL);

    /* renamed from: h, reason: collision with root package name */
    private static final Function2 f4653h = b.f4666i;

    /* renamed from: a, reason: collision with root package name */
    public final List f4654a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f4655b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4656c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4657d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f4658e;

    public static final class a implements JSONSerializable, Hashable {

        /* renamed from: e, reason: collision with root package name */
        public static final b f4659e = new b(null);

        /* renamed from: f, reason: collision with root package name */
        private static final Function2 f4660f = C0034a.f4665i;

        /* renamed from: a, reason: collision with root package name */
        public final String f4661a;

        /* renamed from: b, reason: collision with root package name */
        public final List f4662b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f4663c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f4664d;

        /* renamed from: O1.R9$a$a, reason: collision with other inner class name */
        static final class C0034a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final C0034a f4665i = new C0034a();

            C0034a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return a.f4659e.a(env, it);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return ((S9) BuiltInParserKt.getBuiltInParserComponent().C5().getValue()).deserialize(env, json);
            }

            private b() {
            }
        }

        public a(String id, List list) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.f4661a = id;
            this.f4662b = list;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f4664d;
            if (num != null) {
                return num.intValue();
            }
            int propertiesHash = propertiesHash();
            List list = this.f4662b;
            int i4 = 0;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i4 += ((Z) it.next()).hash();
                }
            }
            int i5 = propertiesHash + i4;
            this.f4664d = Integer.valueOf(i5);
            return i5;
        }

        @Override // com.yandex.div.data.Hashable
        public int propertiesHash() {
            Integer num = this.f4663c;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = kotlin.jvm.internal.H.b(a.class).hashCode() + this.f4661a.hashCode();
            this.f4663c = Integer.valueOf(hashCode);
            return hashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((S9) BuiltInParserKt.getBuiltInParserComponent().C5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f4666i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R9 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return R9.f4651f.a(env, it);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final R9 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((W9.c) BuiltInParserKt.getBuiltInParserComponent().F5().getValue()).deserialize(env, json);
        }

        private c() {
        }
    }

    public enum d {
        TRANSACTIONAL("transactional"),
        PARTIAL("partial");


        /* renamed from: c, reason: collision with root package name */
        public static final c f4667c = new c(null);

        /* renamed from: d, reason: collision with root package name */
        public static final Function1 f4668d = b.f4675i;

        /* renamed from: e, reason: collision with root package name */
        public static final Function1 f4669e = a.f4674i;

        /* renamed from: b, reason: collision with root package name */
        private final String f4673b;

        static final class a extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f4674i = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d invoke(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return d.f4667c.a(value);
            }
        }

        static final class b extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final b f4675i = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(d value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return d.f4667c.b(value);
            }
        }

        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                d dVar = d.TRANSACTIONAL;
                if (Intrinsics.areEqual(value, dVar.f4673b)) {
                    return dVar;
                }
                d dVar2 = d.PARTIAL;
                if (Intrinsics.areEqual(value, dVar2.f4673b)) {
                    return dVar2;
                }
                return null;
            }

            public final String b(d obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.f4673b;
            }

            private c() {
            }
        }

        d(String str) {
            this.f4673b = str;
        }
    }

    public R9(List changes, Expression mode, List list, List list2) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f4654a = changes;
        this.f4655b = mode;
        this.f4656c = list;
        this.f4657d = list2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i4;
        Integer num = this.f4658e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(R9.class).hashCode();
        Iterator it = this.f4654a.iterator();
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            i6 += ((a) it.next()).hash();
        }
        int hashCode2 = hashCode + i6 + this.f4655b.hashCode();
        List list = this.f4656c;
        if (list != null) {
            Iterator it2 = list.iterator();
            i4 = 0;
            while (it2.hasNext()) {
                i4 += ((C0892k0) it2.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int i7 = hashCode2 + i4;
        List list2 = this.f4657d;
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                i5 += ((C0892k0) it3.next()).hash();
            }
        }
        int i8 = i7 + i5;
        this.f4658e = Integer.valueOf(i8);
        return i8;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((W9.c) BuiltInParserKt.getBuiltInParserComponent().F5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
