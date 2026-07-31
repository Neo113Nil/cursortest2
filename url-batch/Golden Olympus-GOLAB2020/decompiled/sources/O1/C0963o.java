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

/* renamed from: O1.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0963o implements JSONSerializable, JsonTemplate {

    /* renamed from: b, reason: collision with root package name */
    public static final b f7237b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f7238c = a.f7240i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f7239a;

    /* renamed from: O1.o$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7240i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0963o invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0963o(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.o$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C0963o(Field value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7239a = value;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0927m) BuiltInParserKt.getBuiltInParserComponent().h().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0963o(ParsingEnvironment parsingEnvironment, C0963o c0963o, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0963o, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0963o(ParsingEnvironment env, C0963o c0963o, boolean z4, JSONObject json) {
        this(Field.Companion.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
