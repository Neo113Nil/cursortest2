package O1;

import O1.AbstractC1050sf;
import O1.C1015qf;
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

/* renamed from: O1.tf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1068tf implements JSONSerializable, JsonTemplate {

    /* renamed from: d, reason: collision with root package name */
    public static final b f8110d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Expression f8111e = Expression.Companion.constant(C1015qf.c.ON_CONDITION);

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f8112f = a.f8116i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f8113a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f8114b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f8115c;

    /* renamed from: O1.tf$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8116i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1068tf invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C1068tf(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.tf$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C1068tf(Field actions, Field condition, Field mode) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f8113a = actions;
        this.f8114b = condition;
        this.f8115c = mode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC1050sf.d) BuiltInParserKt.getBuiltInParserComponent().Z8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C1068tf(ParsingEnvironment parsingEnvironment, C1068tf c1068tf, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c1068tf, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1068tf(ParsingEnvironment env, C1068tf c1068tf, boolean z4, JSONObject json) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
