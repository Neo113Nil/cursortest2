package O1;

import O1.AbstractC0861i4;
import O1.P3;
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
public final class Q3 implements JSONSerializable, JsonTemplate {

    /* renamed from: l, reason: collision with root package name */
    public static final b f4372l = new b(null);

    /* renamed from: m, reason: collision with root package name */
    private static final Expression f4373m;

    /* renamed from: n, reason: collision with root package name */
    private static final Expression f4374n;

    /* renamed from: o, reason: collision with root package name */
    private static final AbstractC0861i4.c f4375o;

    /* renamed from: p, reason: collision with root package name */
    private static final Expression f4376p;

    /* renamed from: q, reason: collision with root package name */
    private static final Function2 f4377q;

    /* renamed from: a, reason: collision with root package name */
    public final Field f4378a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f4379b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f4380c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f4381d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f4382e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f4383f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f4384g;

    /* renamed from: h, reason: collision with root package name */
    public final Field f4385h;

    /* renamed from: i, reason: collision with root package name */
    public final Field f4386i;

    /* renamed from: j, reason: collision with root package name */
    public final Field f4387j;

    /* renamed from: k, reason: collision with root package name */
    public final Field f4388k;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4389i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Q3 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new Q3(env, null, false, it, 6, null);
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
        f4373m = companion.constant(EnumC1145y2.NORMAL);
        f4374n = companion.constant(EnumC1163z2.LINEAR);
        f4375o = new AbstractC0861i4.c(new H5(companion.constant(1L)));
        f4376p = companion.constant(0L);
        f4377q = a.f4389i;
    }

    public Q3(Field cancelActions, Field direction, Field duration, Field endActions, Field endValue, Field id, Field interpolator, Field repeatCount, Field startDelay, Field startValue, Field variableName) {
        Intrinsics.checkNotNullParameter(cancelActions, "cancelActions");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(endActions, "endActions");
        Intrinsics.checkNotNullParameter(endValue, "endValue");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(repeatCount, "repeatCount");
        Intrinsics.checkNotNullParameter(startDelay, "startDelay");
        Intrinsics.checkNotNullParameter(startValue, "startValue");
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        this.f4378a = cancelActions;
        this.f4379b = direction;
        this.f4380c = duration;
        this.f4381d = endActions;
        this.f4382e = endValue;
        this.f4383f = id;
        this.f4384g = interpolator;
        this.f4385h = repeatCount;
        this.f4386i = startDelay;
        this.f4387j = startValue;
        this.f4388k = variableName;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((P3.e) BuiltInParserKt.getBuiltInParserComponent().h2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ Q3(ParsingEnvironment parsingEnvironment, Q3 q32, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : q32, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Q3(ParsingEnvironment env, Q3 q32, boolean z4, JSONObject json) {
        this(r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
