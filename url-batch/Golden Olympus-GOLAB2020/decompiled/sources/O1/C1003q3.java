package O1;

import O1.AbstractC0985p3;
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

/* renamed from: O1.q3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1003q3 implements JSONSerializable, JsonTemplate {

    /* renamed from: d, reason: collision with root package name */
    public static final b f7558d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Expression f7559e;

    /* renamed from: f, reason: collision with root package name */
    private static final Expression f7560f;

    /* renamed from: g, reason: collision with root package name */
    private static final Expression f7561g;

    /* renamed from: h, reason: collision with root package name */
    private static final Function2 f7562h;

    /* renamed from: a, reason: collision with root package name */
    public final Field f7563a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f7564b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f7565c;

    /* renamed from: O1.q3$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7566i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1003q3 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C1003q3(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.q3$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f7559e = companion.constant(200L);
        f7560f = companion.constant(EnumC1163z2.EASE_IN_OUT);
        f7561g = companion.constant(0L);
        f7562h = a.f7566i;
    }

    public C1003q3(Field duration, Field interpolator, Field startDelay) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(startDelay, "startDelay");
        this.f7563a = duration;
        this.f7564b = interpolator;
        this.f7565c = startDelay;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0985p3.d) BuiltInParserKt.getBuiltInParserComponent().M1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C1003q3(ParsingEnvironment parsingEnvironment, C1003q3 c1003q3, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c1003q3, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1003q3(ParsingEnvironment env, C1003q3 c1003q3, boolean z4, JSONObject json) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
