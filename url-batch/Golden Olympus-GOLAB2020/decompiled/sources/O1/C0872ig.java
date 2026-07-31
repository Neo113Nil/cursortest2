package O1;

import O1.AbstractC0801eg;
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

/* renamed from: O1.ig, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0872ig implements JSONSerializable, JsonTemplate {

    /* renamed from: d, reason: collision with root package name */
    public static final b f6512d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f6513e = a.f6517i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f6514a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f6515b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f6516c;

    /* renamed from: O1.ig$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6517i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0872ig invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0872ig(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.ig$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C0872ig(Field constrained, Field maxSize, Field minSize) {
        Intrinsics.checkNotNullParameter(constrained, "constrained");
        Intrinsics.checkNotNullParameter(maxSize, "maxSize");
        Intrinsics.checkNotNullParameter(minSize, "minSize");
        this.f6514a = constrained;
        this.f6515b = maxSize;
        this.f6516c = minSize;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0837gg) BuiltInParserKt.getBuiltInParserComponent().x9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* renamed from: O1.ig$c */
    public static final class c implements JSONSerializable, JsonTemplate {

        /* renamed from: c, reason: collision with root package name */
        public static final b f6518c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        private static final Expression f6519d = Expression.Companion.constant(EnumC0779dc.DP);

        /* renamed from: e, reason: collision with root package name */
        private static final Function2 f6520e = a.f6523i;

        /* renamed from: a, reason: collision with root package name */
        public final Field f6521a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f6522b;

        /* renamed from: O1.ig$c$a */
        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f6523i = new a();

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

        /* renamed from: O1.ig$c$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public c(Field unit, Field value) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6521a = unit;
            this.f6522b = value;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((AbstractC0801eg.d) BuiltInParserKt.getBuiltInParserComponent().u9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ c(ParsingEnvironment parsingEnvironment, c cVar, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i4 & 2) != 0 ? null : cVar, (i4 & 4) != 0 ? false : z4, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(ParsingEnvironment env, c cVar, boolean z4, JSONObject json) {
            this(r1.nullField(false), r1.nullField(false));
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            Field.Companion companion = Field.Companion;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public /* synthetic */ C0872ig(ParsingEnvironment parsingEnvironment, C0872ig c0872ig, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0872ig, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0872ig(ParsingEnvironment env, C0872ig c0872ig, boolean z4, JSONObject json) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
