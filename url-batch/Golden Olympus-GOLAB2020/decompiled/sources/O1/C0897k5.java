package O1;

import O1.AbstractC0879j5;
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

/* renamed from: O1.k5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0897k5 implements JSONSerializable, JsonTemplate {

    /* renamed from: h, reason: collision with root package name */
    public static final b f6808h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f6809i;

    /* renamed from: j, reason: collision with root package name */
    private static final Expression f6810j;

    /* renamed from: k, reason: collision with root package name */
    private static final Expression f6811k;

    /* renamed from: l, reason: collision with root package name */
    private static final Expression f6812l;

    /* renamed from: m, reason: collision with root package name */
    private static final Expression f6813m;

    /* renamed from: n, reason: collision with root package name */
    private static final Function2 f6814n;

    /* renamed from: a, reason: collision with root package name */
    public final Field f6815a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f6816b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f6817c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f6818d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f6819e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f6820f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f6821g;

    /* renamed from: O1.k5$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6822i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0897k5 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0897k5(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.k5$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f6809i = companion.constant(0L);
        f6810j = companion.constant(0L);
        f6811k = companion.constant(0L);
        f6812l = companion.constant(0L);
        f6813m = companion.constant(EnumC0779dc.DP);
        f6814n = a.f6822i;
    }

    public C0897k5(Field bottom, Field end, Field left, Field right, Field start, Field top, Field unit) {
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f6815a = bottom;
        this.f6816b = end;
        this.f6817c = left;
        this.f6818d = right;
        this.f6819e = start;
        this.f6820f = top;
        this.f6821g = unit;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0879j5.d) BuiltInParserKt.getBuiltInParserComponent().W2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0897k5(ParsingEnvironment parsingEnvironment, C0897k5 c0897k5, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0897k5, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0897k5(ParsingEnvironment env, C0897k5 c0897k5, boolean z4, JSONObject json) {
        this(r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
