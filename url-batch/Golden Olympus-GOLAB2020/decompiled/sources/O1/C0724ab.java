package O1;

import O1.Aa;
import O1.Ga;
import O1.Ma;
import O1.Na;
import O1.Xa;
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

/* renamed from: O1.ab, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0724ab implements JSONSerializable, JsonTemplate {

    /* renamed from: f, reason: collision with root package name */
    public static final c f5733f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Aa.d f5734g;

    /* renamed from: h, reason: collision with root package name */
    private static final Aa.d f5735h;

    /* renamed from: i, reason: collision with root package name */
    private static final Na.d f5736i;

    /* renamed from: j, reason: collision with root package name */
    private static final Function2 f5737j;

    /* renamed from: a, reason: collision with root package name */
    public final Field f5738a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f5739b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f5740c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f5741d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f5742e;

    /* renamed from: O1.ab$b */
    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f5748i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0724ab invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0724ab(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.ab$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double valueOf = Double.valueOf(0.5d);
        f5734g = new Aa.d(new Sa(companion.constant(valueOf)));
        f5735h = new Aa.d(new Sa(companion.constant(valueOf)));
        f5736i = new Na.d(new Xa(companion.constant(Xa.c.FARTHEST_CORNER)));
        f5737j = b.f5748i;
    }

    public C0724ab(Field centerX, Field centerY, Field colorMap, Field colors, Field radius) {
        Intrinsics.checkNotNullParameter(centerX, "centerX");
        Intrinsics.checkNotNullParameter(centerY, "centerY");
        Intrinsics.checkNotNullParameter(colorMap, "colorMap");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(radius, "radius");
        this.f5738a = centerX;
        this.f5739b = centerY;
        this.f5740c = colorMap;
        this.f5741d = colors;
        this.f5742e = radius;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Ma.c) BuiltInParserKt.getBuiltInParserComponent().j6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* renamed from: O1.ab$a */
    public static final class a implements JSONSerializable, JsonTemplate {

        /* renamed from: c, reason: collision with root package name */
        public static final b f5743c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        private static final Function2 f5744d = C0042a.f5747i;

        /* renamed from: a, reason: collision with root package name */
        public final Field f5745a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f5746b;

        /* renamed from: O1.ab$a$a, reason: collision with other inner class name */
        static final class C0042a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final C0042a f5747i = new C0042a();

            C0042a() {
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

        /* renamed from: O1.ab$a$b */
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
            this.f5745a = color;
            this.f5746b = position;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((Ga.c) BuiltInParserKt.getBuiltInParserComponent().d6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
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

    public /* synthetic */ C0724ab(ParsingEnvironment parsingEnvironment, C0724ab c0724ab, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0724ab, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0724ab(ParsingEnvironment env, C0724ab c0724ab, boolean z4, JSONObject json) {
        this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
