package O1;

import O1.AbstractC1094v5;
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

/* renamed from: O1.w5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1112w5 implements JSONSerializable, JsonTemplate {

    /* renamed from: e, reason: collision with root package name */
    public static final b f8310e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Expression f8311f;

    /* renamed from: g, reason: collision with root package name */
    private static final Expression f8312g;

    /* renamed from: h, reason: collision with root package name */
    private static final Expression f8313h;

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f8314i;

    /* renamed from: j, reason: collision with root package name */
    private static final Function2 f8315j;

    /* renamed from: a, reason: collision with root package name */
    public final Field f8316a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f8317b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f8318c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f8319d;

    /* renamed from: O1.w5$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8320i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1112w5 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C1112w5(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.w5$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f8311f = companion.constant(Double.valueOf(0.0d));
        f8312g = companion.constant(200L);
        f8313h = companion.constant(EnumC1163z2.EASE_IN_OUT);
        f8314i = companion.constant(0L);
        f8315j = a.f8320i;
    }

    public C1112w5(Field alpha, Field duration, Field interpolator, Field startDelay) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(startDelay, "startDelay");
        this.f8316a = alpha;
        this.f8317b = duration;
        this.f8318c = interpolator;
        this.f8319d = startDelay;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC1094v5.d) BuiltInParserKt.getBuiltInParserComponent().c3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C1112w5(ParsingEnvironment parsingEnvironment, C1112w5 c1112w5, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c1112w5, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1112w5(ParsingEnvironment env, C1112w5 c1112w5, boolean z4, JSONObject json) {
        this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
