package O1;

import O1.AbstractC0760cb;
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

/* renamed from: O1.db, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0778db implements JSONSerializable, JsonTemplate {

    /* renamed from: f, reason: collision with root package name */
    public static final b f6034f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private static final S5 f6035g;

    /* renamed from: h, reason: collision with root package name */
    private static final S5 f6036h;

    /* renamed from: i, reason: collision with root package name */
    private static final S5 f6037i;

    /* renamed from: j, reason: collision with root package name */
    private static final Function2 f6038j;

    /* renamed from: a, reason: collision with root package name */
    public final Field f6039a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f6040b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f6041c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f6042d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f6043e;

    /* renamed from: O1.db$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6044i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0778db invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0778db(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.db$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f6035g = new S5(null, companion.constant(5L), 1, null);
        f6036h = new S5(null, companion.constant(10L), 1, null);
        f6037i = new S5(null, companion.constant(10L), 1, null);
        f6038j = a.f6044i;
    }

    public C0778db(Field backgroundColor, Field cornerRadius, Field itemHeight, Field itemWidth, Field stroke) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(itemHeight, "itemHeight");
        Intrinsics.checkNotNullParameter(itemWidth, "itemWidth");
        Intrinsics.checkNotNullParameter(stroke, "stroke");
        this.f6039a = backgroundColor;
        this.f6040b = cornerRadius;
        this.f6041c = itemHeight;
        this.f6042d = itemWidth;
        this.f6043e = stroke;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0760cb.c) BuiltInParserKt.getBuiltInParserComponent().v6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0778db(ParsingEnvironment parsingEnvironment, C0778db c0778db, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0778db, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0778db(ParsingEnvironment env, C0778db c0778db, boolean z4, JSONObject json) {
        this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
