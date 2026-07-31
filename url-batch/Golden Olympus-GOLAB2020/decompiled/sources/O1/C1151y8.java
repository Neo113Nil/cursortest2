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

/* renamed from: O1.y8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1151y8 implements JSONSerializable, JsonTemplate {

    /* renamed from: c, reason: collision with root package name */
    public static final b f8634c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f8635d = a.f8638i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f8636a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f8637b;

    /* renamed from: O1.y8$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8638i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1151y8 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C1151y8(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.y8$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C1151y8(Field heightVariableName, Field widthVariableName) {
        Intrinsics.checkNotNullParameter(heightVariableName, "heightVariableName");
        Intrinsics.checkNotNullParameter(widthVariableName, "widthVariableName");
        this.f8636a = heightVariableName;
        this.f8637b = widthVariableName;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C1115w8) BuiltInParserKt.getBuiltInParserComponent().N4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C1151y8(ParsingEnvironment parsingEnvironment, C1151y8 c1151y8, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c1151y8, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1151y8(ParsingEnvironment env, C1151y8 c1151y8, boolean z4, JSONObject json) {
        this(r1.nullField(false), r1.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
