package O1;

import O1.Sc;
import O1.Tc;
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

/* renamed from: O1.id, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0870id implements JSONSerializable, JsonTemplate {

    /* renamed from: e, reason: collision with root package name */
    public static final b f6498e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Tc.d f6499f = new Tc.d(new C0762cd());

    /* renamed from: g, reason: collision with root package name */
    private static final Expression f6500g;

    /* renamed from: h, reason: collision with root package name */
    private static final Expression f6501h;

    /* renamed from: i, reason: collision with root package name */
    private static final Function2 f6502i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f6503a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f6504b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f6505c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f6506d;

    /* renamed from: O1.id$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6507i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0870id invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0870id(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.id$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f6500g = companion.constant(EnumC0779dc.DP);
        f6501h = companion.constant(Double.valueOf(1.0d));
        f6502i = a.f6507i;
    }

    public C0870id(Field color, Field style, Field unit, Field width) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(width, "width");
        this.f6503a = color;
        this.f6504b = style;
        this.f6505c = unit;
        this.f6506d = width;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Sc.d) BuiltInParserKt.getBuiltInParserComponent().x7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0870id(ParsingEnvironment parsingEnvironment, C0870id c0870id, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0870id, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0870id(ParsingEnvironment env, C0870id c0870id, boolean z4, JSONObject json) {
        this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
