package O1;

import O1.AbstractC0841h2;
import O1.C0715a2;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0859i2 implements JSONSerializable, JsonTemplate {

    /* renamed from: e, reason: collision with root package name */
    public static final b f6437e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f6438f = a.f6443i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f6439a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f6440b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f6441c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f6442d;

    /* renamed from: O1.i2$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6443i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0859i2 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0859i2(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.i2$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C0859i2(Field containerId, Field onFailActions, Field onSuccessActions, Field request) {
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        Intrinsics.checkNotNullParameter(onFailActions, "onFailActions");
        Intrinsics.checkNotNullParameter(onSuccessActions, "onSuccessActions");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f6439a = containerId;
        this.f6440b = onFailActions;
        this.f6441c = onSuccessActions;
        this.f6442d = request;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0751c2) BuiltInParserKt.getBuiltInParserComponent().W0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* renamed from: O1.i2$c */
    public static final class c implements JSONSerializable, JsonTemplate {

        /* renamed from: d, reason: collision with root package name */
        public static final b f6444d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        private static final Expression f6445e = Expression.Companion.constant(C0715a2.c.d.POST);

        /* renamed from: f, reason: collision with root package name */
        private static final Function2 f6446f = a.f6450i;

        /* renamed from: a, reason: collision with root package name */
        public final Field f6447a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f6448b;

        /* renamed from: c, reason: collision with root package name */
        public final Field f6449c;

        /* renamed from: O1.i2$c$a */
        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f6450i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return new c(env, null, false, it, 6, null);
            }
        }

        /* renamed from: O1.i2$c$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public c(Field headers, Field method, Field url) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(url, "url");
            this.f6447a = headers;
            this.f6448b = method;
            this.f6449c = url;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((AbstractC0841h2.d) BuiltInParserKt.getBuiltInParserComponent().c1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* renamed from: O1.i2$c$c, reason: collision with other inner class name */
        public static final class C0045c implements JSONSerializable, JsonTemplate {

            /* renamed from: c, reason: collision with root package name */
            public static final b f6451c = new b(null);

            /* renamed from: d, reason: collision with root package name */
            private static final Function2 f6452d = a.f6455i;

            /* renamed from: a, reason: collision with root package name */
            public final Field f6453a;

            /* renamed from: b, reason: collision with root package name */
            public final Field f6454b;

            /* renamed from: O1.i2$c$c$a */
            static final class a extends kotlin.jvm.internal.s implements Function2 {

                /* renamed from: i, reason: collision with root package name */
                public static final a f6455i = new a();

                a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0045c invoke(ParsingEnvironment env, JSONObject it) {
                    Intrinsics.checkNotNullParameter(env, "env");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new C0045c(env, null, false, it, 6, null);
                }
            }

            /* renamed from: O1.i2$c$c$b */
            public static final class b {
                public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private b() {
                }
            }

            public C0045c(Field name, Field value) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                this.f6453a = name;
                this.f6454b = value;
            }

            @Override // com.yandex.div.json.JSONSerializable
            public JSONObject writeToJSON() {
                return ((C0805f2) BuiltInParserKt.getBuiltInParserComponent().Z0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
            }

            public /* synthetic */ C0045c(ParsingEnvironment parsingEnvironment, C0045c c0045c, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
                this(parsingEnvironment, (i4 & 2) != 0 ? null : c0045c, (i4 & 4) != 0 ? false : z4, jSONObject);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public C0045c(ParsingEnvironment env, C0045c c0045c, boolean z4, JSONObject json) {
                this(r1.nullField(false), r1.nullField(false));
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                Field.Companion companion = Field.Companion;
                throw new UnsupportedOperationException("Do not use this constructor directly.");
            }
        }

        public /* synthetic */ c(ParsingEnvironment parsingEnvironment, c cVar, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i4 & 2) != 0 ? null : cVar, (i4 & 4) != 0 ? false : z4, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(ParsingEnvironment env, c cVar, boolean z4, JSONObject json) {
            this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            Field.Companion companion = Field.Companion;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public /* synthetic */ C0859i2(ParsingEnvironment parsingEnvironment, C0859i2 c0859i2, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0859i2, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0859i2(ParsingEnvironment env, C0859i2 c0859i2, boolean z4, JSONObject json) {
        this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
