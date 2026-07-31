package O1;

import O1.AbstractC1055t2;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.u2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1073u2 implements JSONSerializable, JsonTemplate {

    /* renamed from: c, reason: collision with root package name */
    public static final b f8128c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f8129d = a.f8132i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f8130a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f8131b;

    /* renamed from: O1.u2$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8132i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1073u2 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C1073u2(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.u2$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C1073u2(Field action, Field id) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(id, "id");
        this.f8130a = action;
        this.f8131b = id;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC1055t2.d) BuiltInParserKt.getBuiltInParserComponent().l1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C1073u2(ParsingEnvironment parsingEnvironment, C1073u2 c1073u2, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c1073u2, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1073u2(ParsingEnvironment env, C1073u2 c1073u2, boolean z4, JSONObject json) {
        this(r1.nullField(false), r1.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
