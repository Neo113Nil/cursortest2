package O1;

import O1.Ge;
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
public final class He implements JSONSerializable, JsonTemplate {

    /* renamed from: f, reason: collision with root package name */
    public static final b f3105f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Expression f3106g;

    /* renamed from: h, reason: collision with root package name */
    private static final Expression f3107h;

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f3108i;

    /* renamed from: j, reason: collision with root package name */
    private static final S5 f3109j;

    /* renamed from: k, reason: collision with root package name */
    private static final Function2 f3110k;

    /* renamed from: a, reason: collision with root package name */
    public final Field f3111a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f3112b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f3113c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f3114d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f3115e;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3116i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final He invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new He(env, null, false, it, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f3106g = companion.constant(Double.valueOf(0.8d));
        f3107h = companion.constant(Boolean.FALSE);
        f3108i = companion.constant(Boolean.TRUE);
        f3109j = new S5(null, companion.constant(1L), 1, null);
        f3110k = a.f3116i;
    }

    public He(Field color, Field density, Field isAnimated, Field isEnabled, Field particleSize) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(isAnimated, "isAnimated");
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(particleSize, "particleSize");
        this.f3111a = color;
        this.f3112b = density;
        this.f3113c = isAnimated;
        this.f3114d = isEnabled;
        this.f3115e = particleSize;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Ge.c) BuiltInParserKt.getBuiltInParserComponent().B8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ He(ParsingEnvironment parsingEnvironment, He he, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : he, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public He(ParsingEnvironment env, He he, boolean z4, JSONObject json) {
        this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
