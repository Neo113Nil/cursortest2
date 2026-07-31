package O1;

import O1.Lb;
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
public final class Mb implements JSONSerializable, JsonTemplate {

    /* renamed from: e, reason: collision with root package name */
    public static final b f3886e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Expression f3887f;

    /* renamed from: g, reason: collision with root package name */
    private static final Expression f3888g;

    /* renamed from: h, reason: collision with root package name */
    private static final Expression f3889h;

    /* renamed from: i, reason: collision with root package name */
    private static final Function2 f3890i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f3891a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f3892b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f3893c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f3894d;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3895i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Mb invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new Mb(env, null, false, it, 6, null);
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
        f3887f = companion.constant(Double.valueOf(0.19d));
        f3888g = companion.constant(2L);
        f3889h = companion.constant(0);
        f3890i = a.f3895i;
    }

    public Mb(Field alpha, Field blur, Field color, Field offset) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(blur, "blur");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.f3891a = alpha;
        this.f3892b = blur;
        this.f3893c = color;
        this.f3894d = offset;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Lb.c) BuiltInParserKt.getBuiltInParserComponent().N6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ Mb(ParsingEnvironment parsingEnvironment, Mb mb, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : mb, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Mb(ParsingEnvironment env, Mb mb, boolean z4, JSONObject json) {
        this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
