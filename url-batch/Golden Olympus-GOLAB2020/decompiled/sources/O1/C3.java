package O1;

import O1.B3;
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
public final class C3 implements JSONSerializable, JsonTemplate {

    /* renamed from: d, reason: collision with root package name */
    public static final b f1571d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final S5 f1572e = new S5(null, Expression.Companion.constant(10L), 1, null);

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f1573f = a.f1577i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f1574a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f1575b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f1576c;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f1577i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C3(env, null, false, it, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C3(Field backgroundColor, Field radius, Field stroke) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(radius, "radius");
        Intrinsics.checkNotNullParameter(stroke, "stroke");
        this.f1574a = backgroundColor;
        this.f1575b = radius;
        this.f1576c = stroke;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((B3.c) BuiltInParserKt.getBuiltInParserComponent().V1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C3(ParsingEnvironment parsingEnvironment, C3 c32, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c32, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3(ParsingEnvironment env, C3 c32, boolean z4, JSONObject json) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
