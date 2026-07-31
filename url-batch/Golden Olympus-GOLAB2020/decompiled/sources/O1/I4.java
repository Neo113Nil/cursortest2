package O1;

import O1.H4;
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
public final class I4 implements JSONSerializable, JsonTemplate {

    /* renamed from: b, reason: collision with root package name */
    public static final b f3134b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final S5 f3135c = new S5(null, Expression.Companion.constant(15L), 1, null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f3136d = a.f3138i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f3137a;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3138i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I4 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new I4(env, null, false, it, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public I4(Field spaceBetweenCenters) {
        Intrinsics.checkNotNullParameter(spaceBetweenCenters, "spaceBetweenCenters");
        this.f3137a = spaceBetweenCenters;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((H4.c) BuiltInParserKt.getBuiltInParserComponent().H2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ I4(ParsingEnvironment parsingEnvironment, I4 i4, boolean z4, JSONObject jSONObject, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i5 & 2) != 0 ? null : i4, (i5 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public I4(ParsingEnvironment env, I4 i4, boolean z4, JSONObject json) {
        this(Field.Companion.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
