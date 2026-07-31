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

/* renamed from: O1.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0768d1 implements JSONSerializable, JsonTemplate {

    /* renamed from: d, reason: collision with root package name */
    public static final b f5989d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f5990e = a.f5994i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f5991a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f5992b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f5993c;

    /* renamed from: O1.d1$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5994i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0768d1 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0768d1(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.d1$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C0768d1(Field key, Field value, Field variableName) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        this.f5991a = key;
        this.f5992b = value;
        this.f5993c = variableName;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0732b1) BuiltInParserKt.getBuiltInParserComponent().j0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0768d1(ParsingEnvironment parsingEnvironment, C0768d1 c0768d1, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0768d1, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0768d1(ParsingEnvironment env, C0768d1 c0768d1, boolean z4, JSONObject json) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
