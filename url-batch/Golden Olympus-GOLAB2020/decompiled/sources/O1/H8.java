package O1;

import O1.C8;
import O1.G8;
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
public final class H8 implements JSONSerializable, JsonTemplate {

    /* renamed from: d, reason: collision with root package name */
    public static final c f2974d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Expression f2975e = Expression.Companion.constant(0L);

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f2976f = b.f2985i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f2977a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f2978b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f2979c;

    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f2985i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H8 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new H8(env, null, false, it, 6, null);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public H8(Field angle, Field colorMap, Field colors) {
        Intrinsics.checkNotNullParameter(angle, "angle");
        Intrinsics.checkNotNullParameter(colorMap, "colorMap");
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.f2977a = angle;
        this.f2978b = colorMap;
        this.f2979c = colors;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((G8.c) BuiltInParserKt.getBuiltInParserComponent().T4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class a implements JSONSerializable, JsonTemplate {

        /* renamed from: c, reason: collision with root package name */
        public static final b f2980c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        private static final Function2 f2981d = C0027a.f2984i;

        /* renamed from: a, reason: collision with root package name */
        public final Field f2982a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f2983b;

        /* renamed from: O1.H8$a$a, reason: collision with other inner class name */
        static final class C0027a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final C0027a f2984i = new C0027a();

            C0027a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return new a(env, null, false, it, 6, null);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public a(Field color, Field position) {
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(position, "position");
            this.f2982a = color;
            this.f2983b = position;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((C8.c) BuiltInParserKt.getBuiltInParserComponent().Q4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ a(ParsingEnvironment parsingEnvironment, a aVar, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i4 & 2) != 0 ? null : aVar, (i4 & 4) != 0 ? false : z4, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ParsingEnvironment env, a aVar, boolean z4, JSONObject json) {
            this(r1.nullField(false), r1.nullField(false));
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            Field.Companion companion = Field.Companion;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public /* synthetic */ H8(ParsingEnvironment parsingEnvironment, H8 h8, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : h8, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public H8(ParsingEnvironment env, H8 h8, boolean z4, JSONObject json) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
