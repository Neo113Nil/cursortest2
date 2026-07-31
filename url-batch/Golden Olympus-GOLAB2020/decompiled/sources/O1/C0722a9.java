package O1;

import O1.AbstractC0861i4;
import O1.Z8;
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

/* renamed from: O1.a9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0722a9 implements JSONSerializable, JsonTemplate {

    /* renamed from: l, reason: collision with root package name */
    public static final b f5710l = new b(null);

    /* renamed from: m, reason: collision with root package name */
    private static final Expression f5711m;

    /* renamed from: n, reason: collision with root package name */
    private static final Expression f5712n;

    /* renamed from: o, reason: collision with root package name */
    private static final AbstractC0861i4.c f5713o;

    /* renamed from: p, reason: collision with root package name */
    private static final Expression f5714p;

    /* renamed from: q, reason: collision with root package name */
    private static final Function2 f5715q;

    /* renamed from: a, reason: collision with root package name */
    public final Field f5716a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f5717b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f5718c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f5719d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f5720e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f5721f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f5722g;

    /* renamed from: h, reason: collision with root package name */
    public final Field f5723h;

    /* renamed from: i, reason: collision with root package name */
    public final Field f5724i;

    /* renamed from: j, reason: collision with root package name */
    public final Field f5725j;

    /* renamed from: k, reason: collision with root package name */
    public final Field f5726k;

    /* renamed from: O1.a9$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5727i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0722a9 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0722a9(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.a9$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f5711m = companion.constant(EnumC1145y2.NORMAL);
        f5712n = companion.constant(EnumC1163z2.LINEAR);
        f5713o = new AbstractC0861i4.c(new H5(companion.constant(1L)));
        f5714p = companion.constant(0L);
        f5715q = a.f5727i;
    }

    public C0722a9(Field cancelActions, Field direction, Field duration, Field endActions, Field endValue, Field id, Field interpolator, Field repeatCount, Field startDelay, Field startValue, Field variableName) {
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
        this.f5716a = cancelActions;
        this.f5717b = direction;
        this.f5718c = duration;
        this.f5719d = endActions;
        this.f5720e = endValue;
        this.f5721f = id;
        this.f5722g = interpolator;
        this.f5723h = repeatCount;
        this.f5724i = startDelay;
        this.f5725j = startValue;
        this.f5726k = variableName;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Z8.e) BuiltInParserKt.getBuiltInParserComponent().f5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0722a9(ParsingEnvironment parsingEnvironment, C0722a9 c0722a9, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0722a9, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0722a9(ParsingEnvironment env, C0722a9 c0722a9, boolean z4, JSONObject json) {
        this(r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
