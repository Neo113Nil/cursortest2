package O1;

import O1.AbstractC0851hc;
import O1.C0797ec;
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

/* renamed from: O1.ic, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0869ic implements JSONSerializable, JsonTemplate {

    /* renamed from: f, reason: collision with root package name */
    public static final b f6486f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Expression f6487g;

    /* renamed from: h, reason: collision with root package name */
    private static final Expression f6488h;

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f6489i;

    /* renamed from: j, reason: collision with root package name */
    private static final Expression f6490j;

    /* renamed from: k, reason: collision with root package name */
    private static final Function2 f6491k;

    /* renamed from: a, reason: collision with root package name */
    public final Field f6492a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f6493b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f6494c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f6495d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f6496e;

    /* renamed from: O1.ic$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6497i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0869ic invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0869ic(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.ic$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f6487g = companion.constant(200L);
        f6488h = companion.constant(C0797ec.c.BOTTOM);
        f6489i = companion.constant(EnumC1163z2.EASE_IN_OUT);
        f6490j = companion.constant(0L);
        f6491k = a.f6497i;
    }

    public C0869ic(Field distance, Field duration, Field edge, Field interpolator, Field startDelay) {
        Intrinsics.checkNotNullParameter(distance, "distance");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(edge, "edge");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(startDelay, "startDelay");
        this.f6492a = distance;
        this.f6493b = duration;
        this.f6494c = edge;
        this.f6495d = interpolator;
        this.f6496e = startDelay;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0851hc.e) BuiltInParserKt.getBuiltInParserComponent().Z6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0869ic(ParsingEnvironment parsingEnvironment, C0869ic c0869ic, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0869ic, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0869ic(ParsingEnvironment env, C0869ic c0869ic, boolean z4, JSONObject json) {
        this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
