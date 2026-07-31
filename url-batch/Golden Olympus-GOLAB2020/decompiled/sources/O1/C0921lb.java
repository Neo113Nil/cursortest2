package O1;

import O1.AbstractC0903kb;
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

/* renamed from: O1.lb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0921lb implements JSONSerializable, JsonTemplate {

    /* renamed from: g, reason: collision with root package name */
    public static final b f6930g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    private static final Expression f6931h;

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f6932i;

    /* renamed from: j, reason: collision with root package name */
    private static final Expression f6933j;

    /* renamed from: k, reason: collision with root package name */
    private static final Expression f6934k;

    /* renamed from: l, reason: collision with root package name */
    private static final Expression f6935l;

    /* renamed from: m, reason: collision with root package name */
    private static final Expression f6936m;

    /* renamed from: n, reason: collision with root package name */
    private static final Function2 f6937n;

    /* renamed from: a, reason: collision with root package name */
    public final Field f6938a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f6939b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f6940c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f6941d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f6942e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f6943f;

    /* renamed from: O1.lb$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6944i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0921lb invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0921lb(env, (C0921lb) null, false, it, 6, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: O1.lb$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f6931h = companion.constant(200L);
        f6932i = companion.constant(EnumC1163z2.EASE_IN_OUT);
        Double valueOf = Double.valueOf(0.5d);
        f6933j = companion.constant(valueOf);
        f6934k = companion.constant(valueOf);
        f6935l = companion.constant(Double.valueOf(0.0d));
        f6936m = companion.constant(0L);
        f6937n = a.f6944i;
    }

    public C0921lb(Field duration, Field interpolator, Field pivotX, Field pivotY, Field scale, Field startDelay) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(pivotX, "pivotX");
        Intrinsics.checkNotNullParameter(pivotY, "pivotY");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(startDelay, "startDelay");
        this.f6938a = duration;
        this.f6939b = interpolator;
        this.f6940c = pivotX;
        this.f6941d = pivotY;
        this.f6942e = scale;
        this.f6943f = startDelay;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0903kb.d) BuiltInParserKt.getBuiltInParserComponent().y6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0921lb(ParsingEnvironment parsingEnvironment, C0921lb c0921lb, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0921lb, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0921lb(ParsingEnvironment env, C0921lb c0921lb, boolean z4, JSONObject json) {
        this(r8.nullField(false), r8.nullField(false), r8.nullField(false), r8.nullField(false), r8.nullField(false), r8.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
