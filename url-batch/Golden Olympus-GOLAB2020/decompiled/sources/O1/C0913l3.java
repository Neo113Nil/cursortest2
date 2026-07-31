package O1;

import O1.AbstractC0895k3;
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

/* renamed from: O1.l3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0913l3 implements JSONSerializable, JsonTemplate {

    /* renamed from: f, reason: collision with root package name */
    public static final b f6896f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Expression f6897g = Expression.Companion.constant(Boolean.FALSE);

    /* renamed from: h, reason: collision with root package name */
    private static final Function2 f6898h = a.f6904i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f6899a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f6900b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f6901c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f6902d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f6903e;

    /* renamed from: O1.l3$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6904i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0913l3 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0913l3(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.l3$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C0913l3(Field cornerRadius, Field cornersRadius, Field hasShadow, Field shadow, Field stroke) {
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(cornersRadius, "cornersRadius");
        Intrinsics.checkNotNullParameter(hasShadow, "hasShadow");
        Intrinsics.checkNotNullParameter(shadow, "shadow");
        Intrinsics.checkNotNullParameter(stroke, "stroke");
        this.f6899a = cornerRadius;
        this.f6900b = cornersRadius;
        this.f6901c = hasShadow;
        this.f6902d = shadow;
        this.f6903e = stroke;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0895k3.c) BuiltInParserKt.getBuiltInParserComponent().J1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0913l3(ParsingEnvironment parsingEnvironment, C0913l3 c0913l3, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0913l3, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0913l3(ParsingEnvironment env, C0913l3 c0913l3, boolean z4, JSONObject json) {
        this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
