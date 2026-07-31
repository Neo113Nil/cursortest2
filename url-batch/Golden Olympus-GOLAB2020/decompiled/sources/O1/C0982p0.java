package O1;

import O1.AbstractC0964o0;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0982p0 implements JSONSerializable, JsonTemplate {

    /* renamed from: i, reason: collision with root package name */
    public static final b f7438i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    private static final Function2 f7439j = a.f7448i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f7440a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f7441b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f7442c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f7443d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f7444e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f7445f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f7446g;

    /* renamed from: h, reason: collision with root package name */
    public final Field f7447h;

    /* renamed from: O1.p0$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7448i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0982p0 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0982p0(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.p0$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C0982p0(Field animatorId, Field direction, Field duration, Field endValue, Field interpolator, Field repeatCount, Field startDelay, Field startValue) {
        Intrinsics.checkNotNullParameter(animatorId, "animatorId");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(endValue, "endValue");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(repeatCount, "repeatCount");
        Intrinsics.checkNotNullParameter(startDelay, "startDelay");
        Intrinsics.checkNotNullParameter(startValue, "startValue");
        this.f7440a = animatorId;
        this.f7441b = direction;
        this.f7442c = duration;
        this.f7443d = endValue;
        this.f7444e = interpolator;
        this.f7445f = repeatCount;
        this.f7446g = startDelay;
        this.f7447h = startValue;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0964o0.e) BuiltInParserKt.getBuiltInParserComponent().L().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0982p0(ParsingEnvironment parsingEnvironment, C0982p0 c0982p0, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0982p0, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0982p0(ParsingEnvironment env, C0982p0 c0982p0, boolean z4, JSONObject json) {
        this(r10.nullField(false), r10.nullField(false), r10.nullField(false), r10.nullField(false), r10.nullField(false), r10.nullField(false), r10.nullField(false), r10.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
