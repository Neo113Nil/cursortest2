package O1;

import O1.AbstractC0934m6;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.n6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0952n6 implements JSONSerializable, JsonTemplate {

    /* renamed from: e, reason: collision with root package name */
    public static final b f7149e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f7150f = a.f7155i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f7151a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f7152b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f7153c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f7154d;

    /* renamed from: O1.n6$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7155i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0952n6 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0952n6(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.n6$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C0952n6(Field arguments, Field body, Field name, Field returnType) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        this.f7151a = arguments;
        this.f7152b = body;
        this.f7153c = name;
        this.f7154d = returnType;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0934m6.c) BuiltInParserKt.getBuiltInParserComponent().G3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0952n6(ParsingEnvironment parsingEnvironment, C0952n6 c0952n6, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0952n6, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0952n6(ParsingEnvironment env, C0952n6 c0952n6, boolean z4, JSONObject json) {
        this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
