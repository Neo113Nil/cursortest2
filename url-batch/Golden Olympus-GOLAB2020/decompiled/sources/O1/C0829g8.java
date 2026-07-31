package O1;

import O1.AbstractC0811f8;
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

/* renamed from: O1.g8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0829g8 implements JSONSerializable, JsonTemplate {

    /* renamed from: d, reason: collision with root package name */
    public static final b f6232d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Expression f6233e = Expression.Companion.constant(Boolean.FALSE);

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f6234f = a.f6238i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f6235a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f6236b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f6237c;

    /* renamed from: O1.g8$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6238i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0829g8 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0829g8(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.g8$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C0829g8(Field allowEmpty, Field labelId, Field variable) {
        Intrinsics.checkNotNullParameter(allowEmpty, "allowEmpty");
        Intrinsics.checkNotNullParameter(labelId, "labelId");
        Intrinsics.checkNotNullParameter(variable, "variable");
        this.f6235a = allowEmpty;
        this.f6236b = labelId;
        this.f6237c = variable;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0811f8.c) BuiltInParserKt.getBuiltInParserComponent().z4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0829g8(ParsingEnvironment parsingEnvironment, C0829g8 c0829g8, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0829g8, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0829g8(ParsingEnvironment env, C0829g8 c0829g8, boolean z4, JSONObject json) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
