package O1;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.sa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1045sa implements JSONSerializable, JsonTemplate {

    /* renamed from: b, reason: collision with root package name */
    public static final b f7856b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f7857c = a.f7859i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f7858a;

    /* renamed from: O1.sa$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7859i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1045sa invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C1045sa(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.sa$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C1045sa(Field value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7858a = value;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C1010qa) BuiltInParserKt.getBuiltInParserComponent().U5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C1045sa(ParsingEnvironment parsingEnvironment, C1045sa c1045sa, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c1045sa, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1045sa(ParsingEnvironment env, C1045sa c1045sa, boolean z4, JSONObject json) {
        this(Field.Companion.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
