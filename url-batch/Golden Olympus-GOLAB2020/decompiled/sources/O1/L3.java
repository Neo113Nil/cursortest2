package O1;

import O1.J3;
import O1.K3;
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

/* loaded from: classes2.dex */
public final class L3 implements JSONSerializable, JsonTemplate {

    /* renamed from: d, reason: collision with root package name */
    public static final b f3659d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final String f3660e = "it";

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f3661f = a.f3665i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f3662a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f3663b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f3664c;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3665i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L3 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new L3(env, null, false, it, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public L3(Field data, Field dataElementName, Field prototypes) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(dataElementName, "dataElementName");
        Intrinsics.checkNotNullParameter(prototypes, "prototypes");
        this.f3662a = data;
        this.f3663b = dataElementName;
        this.f3664c = prototypes;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((J3.c) BuiltInParserKt.getBuiltInParserComponent().b2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class c implements JSONSerializable, JsonTemplate {

        /* renamed from: d, reason: collision with root package name */
        public static final b f3666d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        private static final Expression f3667e = Expression.Companion.constant(Boolean.TRUE);

        /* renamed from: f, reason: collision with root package name */
        private static final Function2 f3668f = a.f3672i;

        /* renamed from: a, reason: collision with root package name */
        public final Field f3669a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f3670b;

        /* renamed from: c, reason: collision with root package name */
        public final Field f3671c;

        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f3672i = new a();

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

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public c(Field div, Field id, Field selector) {
            Intrinsics.checkNotNullParameter(div, "div");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(selector, "selector");
            this.f3669a = div;
            this.f3670b = id;
            this.f3671c = selector;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((K3.c) BuiltInParserKt.getBuiltInParserComponent().e2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
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

    public /* synthetic */ L3(ParsingEnvironment parsingEnvironment, L3 l32, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : l32, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public L3(ParsingEnvironment env, L3 l32, boolean z4, JSONObject json) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
