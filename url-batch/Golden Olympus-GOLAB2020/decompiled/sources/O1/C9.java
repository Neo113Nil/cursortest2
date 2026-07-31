package O1;

import O1.B9;
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
public final class C9 implements JSONSerializable, JsonTemplate {

    /* renamed from: f, reason: collision with root package name */
    public static final b f1586f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Expression f1587g;

    /* renamed from: h, reason: collision with root package name */
    private static final Expression f1588h;

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f1589i;

    /* renamed from: j, reason: collision with root package name */
    private static final Expression f1590j;

    /* renamed from: k, reason: collision with root package name */
    private static final Expression f1591k;

    /* renamed from: l, reason: collision with root package name */
    private static final Function2 f1592l;

    /* renamed from: a, reason: collision with root package name */
    public final Field f1593a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f1594b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f1595c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f1596d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f1597e;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f1598i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C9 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C9(env, null, false, it, 6, null);
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
        f1587g = companion.constant(EnumC1163z2.EASE_IN_OUT);
        Double valueOf = Double.valueOf(1.0d);
        f1588h = companion.constant(valueOf);
        f1589i = companion.constant(valueOf);
        f1590j = companion.constant(valueOf);
        f1591k = companion.constant(valueOf);
        f1592l = a.f1598i;
    }

    public C9(Field interpolator, Field nextPageAlpha, Field nextPageScale, Field previousPageAlpha, Field previousPageScale) {
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(nextPageAlpha, "nextPageAlpha");
        Intrinsics.checkNotNullParameter(nextPageScale, "nextPageScale");
        Intrinsics.checkNotNullParameter(previousPageAlpha, "previousPageAlpha");
        Intrinsics.checkNotNullParameter(previousPageScale, "previousPageScale");
        this.f1593a = interpolator;
        this.f1594b = nextPageAlpha;
        this.f1595c = nextPageScale;
        this.f1596d = previousPageAlpha;
        this.f1597e = previousPageScale;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((B9.d) BuiltInParserKt.getBuiltInParserComponent().u5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C9(ParsingEnvironment parsingEnvironment, C9 c9, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c9, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C9(ParsingEnvironment env, C9 c9, boolean z4, JSONObject json) {
        this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
