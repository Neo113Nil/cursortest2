package O1;

import O1.AbstractC0865i8;
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

/* renamed from: O1.j8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0882j8 implements JSONSerializable, JsonTemplate {

    /* renamed from: e, reason: collision with root package name */
    public static final b f6588e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Expression f6589f = Expression.Companion.constant(Boolean.FALSE);

    /* renamed from: g, reason: collision with root package name */
    private static final Function2 f6590g = a.f6595i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f6591a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f6592b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f6593c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f6594d;

    /* renamed from: O1.j8$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6595i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0882j8 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0882j8(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.j8$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C0882j8(Field allowEmpty, Field condition, Field labelId, Field variable) {
        Intrinsics.checkNotNullParameter(allowEmpty, "allowEmpty");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(labelId, "labelId");
        Intrinsics.checkNotNullParameter(variable, "variable");
        this.f6591a = allowEmpty;
        this.f6592b = condition;
        this.f6593c = labelId;
        this.f6594d = variable;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0865i8.c) BuiltInParserKt.getBuiltInParserComponent().B4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0882j8(ParsingEnvironment parsingEnvironment, C0882j8 c0882j8, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0882j8, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0882j8(ParsingEnvironment env, C0882j8 c0882j8, boolean z4, JSONObject json) {
        this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
