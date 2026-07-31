package O1;

import O1.AbstractC0861i4;
import O1.C2;
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
public final class D2 implements JSONSerializable, JsonTemplate {

    /* renamed from: i, reason: collision with root package name */
    public static final b f2434i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    private static final Expression f2435j;

    /* renamed from: k, reason: collision with root package name */
    private static final Expression f2436k;

    /* renamed from: l, reason: collision with root package name */
    private static final AbstractC0861i4.d f2437l;

    /* renamed from: m, reason: collision with root package name */
    private static final Expression f2438m;

    /* renamed from: n, reason: collision with root package name */
    private static final Function2 f2439n;

    /* renamed from: a, reason: collision with root package name */
    public final Field f2440a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f2441b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f2442c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f2443d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f2444e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f2445f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f2446g;

    /* renamed from: h, reason: collision with root package name */
    public final Field f2447h;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2448i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D2 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new D2(env, null, false, it, 6, null);
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
        f2435j = companion.constant(300L);
        f2436k = companion.constant(EnumC1163z2.SPRING);
        f2437l = new AbstractC0861i4.d(new C0971o7());
        f2438m = companion.constant(0L);
        f2439n = a.f2448i;
    }

    public D2(Field duration, Field endValue, Field interpolator, Field items, Field name, Field repeat, Field startDelay, Field startValue) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(endValue, "endValue");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(repeat, "repeat");
        Intrinsics.checkNotNullParameter(startDelay, "startDelay");
        Intrinsics.checkNotNullParameter(startValue, "startValue");
        this.f2440a = duration;
        this.f2441b = endValue;
        this.f2442c = interpolator;
        this.f2443d = items;
        this.f2444e = name;
        this.f2445f = repeat;
        this.f2446g = startDelay;
        this.f2447h = startValue;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C2.e) BuiltInParserKt.getBuiltInParserComponent().o1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ D2(ParsingEnvironment parsingEnvironment, D2 d22, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : d22, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D2(ParsingEnvironment env, D2 d22, boolean z4, JSONObject json) {
        this(r10.nullField(false), r10.nullField(false), r10.nullField(false), r10.nullField(false), r10.nullField(false), r10.nullField(false), r10.nullField(false), r10.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
