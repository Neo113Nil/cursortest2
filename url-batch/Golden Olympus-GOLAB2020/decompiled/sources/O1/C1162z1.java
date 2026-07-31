package O1;

import O1.AbstractC1144y1;
import O1.C1126x1;
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

/* renamed from: O1.z1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1162z1 implements JSONSerializable, JsonTemplate {

    /* renamed from: f, reason: collision with root package name */
    public static final b f8676f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Expression f8677g;

    /* renamed from: h, reason: collision with root package name */
    private static final Expression f8678h;

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f8679i;

    /* renamed from: j, reason: collision with root package name */
    private static final Expression f8680j;

    /* renamed from: k, reason: collision with root package name */
    private static final Function2 f8681k;

    /* renamed from: a, reason: collision with root package name */
    public final Field f8682a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f8683b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f8684c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f8685d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f8686e;

    /* renamed from: O1.z1$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8687i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1162z1 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C1162z1(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.z1$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f8677g = companion.constant(Boolean.TRUE);
        f8678h = companion.constant(0L);
        f8679i = companion.constant(0L);
        f8680j = companion.constant(C1126x1.c.CLAMP);
        f8681k = a.f8687i;
    }

    public C1162z1(Field animated, Field id, Field itemCount, Field offset, Field overflow) {
        Intrinsics.checkNotNullParameter(animated, "animated");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(itemCount, "itemCount");
        Intrinsics.checkNotNullParameter(offset, "offset");
        Intrinsics.checkNotNullParameter(overflow, "overflow");
        this.f8682a = animated;
        this.f8683b = id;
        this.f8684c = itemCount;
        this.f8685d = offset;
        this.f8686e = overflow;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC1144y1.d) BuiltInParserKt.getBuiltInParserComponent().B0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C1162z1(ParsingEnvironment parsingEnvironment, C1162z1 c1162z1, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c1162z1, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1162z1(ParsingEnvironment env, C1162z1 c1162z1, boolean z4, JSONObject json) {
        this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
