package O1;

import O1.AbstractC1080u9;
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

/* renamed from: O1.v9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1098v9 implements JSONSerializable, JsonTemplate {

    /* renamed from: g, reason: collision with root package name */
    public static final b f8230g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    private static final Expression f8231h;

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f8232i;

    /* renamed from: j, reason: collision with root package name */
    private static final Expression f8233j;

    /* renamed from: k, reason: collision with root package name */
    private static final Expression f8234k;

    /* renamed from: l, reason: collision with root package name */
    private static final Expression f8235l;

    /* renamed from: m, reason: collision with root package name */
    private static final Expression f8236m;

    /* renamed from: n, reason: collision with root package name */
    private static final Function2 f8237n;

    /* renamed from: a, reason: collision with root package name */
    public final Field f8238a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f8239b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f8240c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f8241d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f8242e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f8243f;

    /* renamed from: O1.v9$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8244i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1098v9 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C1098v9(env, (C1098v9) null, false, it, 6, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: O1.v9$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f8231h = companion.constant(EnumC1163z2.EASE_IN_OUT);
        Double valueOf = Double.valueOf(1.0d);
        f8232i = companion.constant(valueOf);
        f8233j = companion.constant(valueOf);
        f8234k = companion.constant(valueOf);
        f8235l = companion.constant(valueOf);
        f8236m = companion.constant(Boolean.FALSE);
        f8237n = a.f8244i;
    }

    public C1098v9(Field interpolator, Field nextPageAlpha, Field nextPageScale, Field previousPageAlpha, Field previousPageScale, Field reversedStackingOrder) {
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(nextPageAlpha, "nextPageAlpha");
        Intrinsics.checkNotNullParameter(nextPageScale, "nextPageScale");
        Intrinsics.checkNotNullParameter(previousPageAlpha, "previousPageAlpha");
        Intrinsics.checkNotNullParameter(previousPageScale, "previousPageScale");
        Intrinsics.checkNotNullParameter(reversedStackingOrder, "reversedStackingOrder");
        this.f8238a = interpolator;
        this.f8239b = nextPageAlpha;
        this.f8240c = nextPageScale;
        this.f8241d = previousPageAlpha;
        this.f8242e = previousPageScale;
        this.f8243f = reversedStackingOrder;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC1080u9.d) BuiltInParserKt.getBuiltInParserComponent().r5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C1098v9(ParsingEnvironment parsingEnvironment, C1098v9 c1098v9, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c1098v9, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1098v9(ParsingEnvironment env, C1098v9 c1098v9, boolean z4, JSONObject json) {
        this(r8.nullField(false), r8.nullField(false), r8.nullField(false), r8.nullField(false), r8.nullField(false), r8.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
