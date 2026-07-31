package O1;

import O1.AbstractC0729ag;
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

/* renamed from: O1.bg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0747bg implements JSONSerializable, JsonTemplate {

    /* renamed from: l, reason: collision with root package name */
    public static final b f5818l = new b(null);

    /* renamed from: m, reason: collision with root package name */
    private static final Expression f5819m;

    /* renamed from: n, reason: collision with root package name */
    private static final Expression f5820n;

    /* renamed from: o, reason: collision with root package name */
    private static final Expression f5821o;

    /* renamed from: p, reason: collision with root package name */
    private static final Expression f5822p;

    /* renamed from: q, reason: collision with root package name */
    private static final Function2 f5823q;

    /* renamed from: a, reason: collision with root package name */
    public final Field f5824a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f5825b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f5826c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f5827d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f5828e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f5829f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f5830g;

    /* renamed from: h, reason: collision with root package name */
    public final Field f5831h;

    /* renamed from: i, reason: collision with root package name */
    public final Field f5832i;

    /* renamed from: j, reason: collision with root package name */
    public final Field f5833j;

    /* renamed from: k, reason: collision with root package name */
    public final Field f5834k;

    /* renamed from: O1.bg$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5835i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0747bg invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0747bg(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.bg$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f5819m = companion.constant(Boolean.TRUE);
        f5820n = companion.constant(1L);
        f5821o = companion.constant(800L);
        f5822p = companion.constant(50L);
        f5823q = a.f5835i;
    }

    public C0747bg(Field downloadCallbacks, Field isEnabled, Field logId, Field logLimit, Field payload, Field referer, Field scopeId, Field typed, Field url, Field visibilityDuration, Field visibilityPercentage) {
        Intrinsics.checkNotNullParameter(downloadCallbacks, "downloadCallbacks");
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(logId, "logId");
        Intrinsics.checkNotNullParameter(logLimit, "logLimit");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(referer, "referer");
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.checkNotNullParameter(typed, "typed");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(visibilityDuration, "visibilityDuration");
        Intrinsics.checkNotNullParameter(visibilityPercentage, "visibilityPercentage");
        this.f5824a = downloadCallbacks;
        this.f5825b = isEnabled;
        this.f5826c = logId;
        this.f5827d = logLimit;
        this.f5828e = payload;
        this.f5829f = referer;
        this.f5830g = scopeId;
        this.f5831h = typed;
        this.f5832i = url;
        this.f5833j = visibilityDuration;
        this.f5834k = visibilityPercentage;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0729ag.c) BuiltInParserKt.getBuiltInParserComponent().r9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0747bg(ParsingEnvironment parsingEnvironment, C0747bg c0747bg, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0747bg, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0747bg(ParsingEnvironment env, C0747bg c0747bg, boolean z4, JSONObject json) {
        this(r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
