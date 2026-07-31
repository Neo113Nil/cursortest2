package O1;

import O1.R6;
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
public final class S6 implements JSONSerializable, JsonTemplate {

    /* renamed from: h, reason: collision with root package name */
    public static final b f4718h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f4719i;

    /* renamed from: j, reason: collision with root package name */
    private static final Expression f4720j;

    /* renamed from: k, reason: collision with root package name */
    private static final Expression f4721k;

    /* renamed from: l, reason: collision with root package name */
    private static final Expression f4722l;

    /* renamed from: m, reason: collision with root package name */
    private static final Expression f4723m;

    /* renamed from: n, reason: collision with root package name */
    private static final Function2 f4724n;

    /* renamed from: a, reason: collision with root package name */
    public final Field f4725a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f4726b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f4727c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f4728d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f4729e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f4730f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f4731g;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4732i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S6 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new S6(env, null, false, it, 6, null);
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
        f4719i = companion.constant(Double.valueOf(1.0d));
        f4720j = companion.constant(EnumC1091v2.CENTER);
        f4721k = companion.constant(EnumC1109w2.CENTER);
        f4722l = companion.constant(Boolean.FALSE);
        f4723m = companion.constant(Y6.FILL);
        f4724n = a.f4732i;
    }

    public S6(Field alpha, Field contentAlignmentHorizontal, Field contentAlignmentVertical, Field filters, Field imageUrl, Field preloadRequired, Field scale) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(contentAlignmentHorizontal, "contentAlignmentHorizontal");
        Intrinsics.checkNotNullParameter(contentAlignmentVertical, "contentAlignmentVertical");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(preloadRequired, "preloadRequired");
        Intrinsics.checkNotNullParameter(scale, "scale");
        this.f4725a = alpha;
        this.f4726b = contentAlignmentHorizontal;
        this.f4727c = contentAlignmentVertical;
        this.f4728d = filters;
        this.f4729e = imageUrl;
        this.f4730f = preloadRequired;
        this.f4731g = scale;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((R6.f) BuiltInParserKt.getBuiltInParserComponent().S3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ S6(ParsingEnvironment parsingEnvironment, S6 s6, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : s6, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public S6(ParsingEnvironment env, S6 s6, boolean z4, JSONObject json) {
        this(r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
