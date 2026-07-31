package O1;

import O1.Ue;
import O1.Ve;
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

/* renamed from: O1.kf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0907kf implements JSONSerializable, JsonTemplate {

    /* renamed from: l, reason: collision with root package name */
    public static final b f6857l = new b(null);

    /* renamed from: m, reason: collision with root package name */
    private static final Expression f6858m;

    /* renamed from: n, reason: collision with root package name */
    private static final Expression f6859n;

    /* renamed from: o, reason: collision with root package name */
    private static final Ve.c f6860o;

    /* renamed from: p, reason: collision with root package name */
    private static final Function2 f6861p;

    /* renamed from: a, reason: collision with root package name */
    public final Field f6862a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f6863b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f6864c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f6865d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f6866e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f6867f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f6868g;

    /* renamed from: h, reason: collision with root package name */
    public final Field f6869h;

    /* renamed from: i, reason: collision with root package name */
    public final Field f6870i;

    /* renamed from: j, reason: collision with root package name */
    public final Field f6871j;

    /* renamed from: k, reason: collision with root package name */
    public final Field f6872k;

    /* renamed from: O1.kf$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6873i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0907kf invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0907kf(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.kf$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f6858m = companion.constant(Boolean.TRUE);
        f6859n = companion.constant(5000L);
        f6860o = new Ve.c(new Ze());
        f6861p = a.f6873i;
    }

    public C0907kf(Field animationIn, Field animationOut, Field backgroundAccessibilityDescription, Field closeByTapOutside, Field div, Field duration, Field id, Field mode, Field offset, Field position, Field tapOutsideActions) {
        Intrinsics.checkNotNullParameter(animationIn, "animationIn");
        Intrinsics.checkNotNullParameter(animationOut, "animationOut");
        Intrinsics.checkNotNullParameter(backgroundAccessibilityDescription, "backgroundAccessibilityDescription");
        Intrinsics.checkNotNullParameter(closeByTapOutside, "closeByTapOutside");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(offset, "offset");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(tapOutsideActions, "tapOutsideActions");
        this.f6862a = animationIn;
        this.f6863b = animationOut;
        this.f6864c = backgroundAccessibilityDescription;
        this.f6865d = closeByTapOutside;
        this.f6866e = div;
        this.f6867f = duration;
        this.f6868g = id;
        this.f6869h = mode;
        this.f6870i = offset;
        this.f6871j = position;
        this.f6872k = tapOutsideActions;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Ue.d) BuiltInParserKt.getBuiltInParserComponent().K8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0907kf(ParsingEnvironment parsingEnvironment, C0907kf c0907kf, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0907kf, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0907kf(ParsingEnvironment env, C0907kf c0907kf, boolean z4, JSONObject json) {
        this(r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
