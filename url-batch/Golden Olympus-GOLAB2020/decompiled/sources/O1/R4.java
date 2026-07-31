package O1;

import O1.Q4;
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
public final class R4 implements JSONSerializable, JsonTemplate {

    /* renamed from: l, reason: collision with root package name */
    public static final b f4596l = new b(null);

    /* renamed from: m, reason: collision with root package name */
    private static final Expression f4597m;

    /* renamed from: n, reason: collision with root package name */
    private static final Expression f4598n;

    /* renamed from: o, reason: collision with root package name */
    private static final Expression f4599o;

    /* renamed from: p, reason: collision with root package name */
    private static final Expression f4600p;

    /* renamed from: q, reason: collision with root package name */
    private static final Function2 f4601q;

    /* renamed from: a, reason: collision with root package name */
    public final Field f4602a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f4603b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f4604c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f4605d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f4606e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f4607f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f4608g;

    /* renamed from: h, reason: collision with root package name */
    public final Field f4609h;

    /* renamed from: i, reason: collision with root package name */
    public final Field f4610i;

    /* renamed from: j, reason: collision with root package name */
    public final Field f4611j;

    /* renamed from: k, reason: collision with root package name */
    public final Field f4612k;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4613i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R4 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new R4(env, null, false, it, 6, null);
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
        f4597m = companion.constant(800L);
        f4598n = companion.constant(Boolean.TRUE);
        f4599o = companion.constant(1L);
        f4600p = companion.constant(0L);
        f4601q = a.f4613i;
    }

    public R4(Field disappearDuration, Field downloadCallbacks, Field isEnabled, Field logId, Field logLimit, Field payload, Field referer, Field scopeId, Field typed, Field url, Field visibilityPercentage) {
        Intrinsics.checkNotNullParameter(disappearDuration, "disappearDuration");
        Intrinsics.checkNotNullParameter(downloadCallbacks, "downloadCallbacks");
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(logId, "logId");
        Intrinsics.checkNotNullParameter(logLimit, "logLimit");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(referer, "referer");
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.checkNotNullParameter(typed, "typed");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(visibilityPercentage, "visibilityPercentage");
        this.f4602a = disappearDuration;
        this.f4603b = downloadCallbacks;
        this.f4604c = isEnabled;
        this.f4605d = logId;
        this.f4606e = logLimit;
        this.f4607f = payload;
        this.f4608g = referer;
        this.f4609h = scopeId;
        this.f4610i = typed;
        this.f4611j = url;
        this.f4612k = visibilityPercentage;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Q4.c) BuiltInParserKt.getBuiltInParserComponent().N2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ R4(ParsingEnvironment parsingEnvironment, R4 r4, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : r4, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public R4(ParsingEnvironment env, R4 r4, boolean z4, JSONObject json) {
        this(r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
