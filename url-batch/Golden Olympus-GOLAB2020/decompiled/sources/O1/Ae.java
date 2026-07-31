package O1;

import O1.AbstractC1175ze;
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
public final class Ae implements JSONSerializable, JsonTemplate {

    /* renamed from: b, reason: collision with root package name */
    public static final b f1431b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Expression f1432c = Expression.Companion.constant(Boolean.TRUE);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f1433d = a.f1435i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f1434a;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f1435i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ae invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new Ae(env, null, false, it, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public Ae(Field isEnabled) {
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        this.f1434a = isEnabled;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC1175ze.c) BuiltInParserKt.getBuiltInParserComponent().w8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ Ae(ParsingEnvironment parsingEnvironment, Ae ae, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : ae, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Ae(ParsingEnvironment env, Ae ae, boolean z4, JSONObject json) {
        this(Field.Companion.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
